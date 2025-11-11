class NumArray {
    int[] tree;
    int n;

    private void buildTree(int[] nums, int treeIndex, int low, int high) {
        if (low == high) {
            tree[treeIndex] = nums[low];
            return;
        }
        int mid = low + (high - low) / 2;
        buildTree(nums, 2 * treeIndex + 1, low, mid);
        buildTree(nums, 2 * treeIndex + 2, mid + 1, high);
        tree[treeIndex] = tree[2 * treeIndex + 1] + tree[2 * treeIndex + 2];
    }

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            n = nums.length;
            tree = new int[4 * n];
            buildTree(nums, 0, 0, n - 1);
        }
    }

    public void update(int index, int val) {
        if (n == 0) return;
        update(0, 0, n - 1, index, val);
    }

    private void update(int treeIndex, int low, int high, int index, int val) {
        if (low == high) {
            tree[treeIndex] = val;
            return;
        }
        int mid = low + (high - low) / 2;
        if (index <= mid) {
            update(2 * treeIndex + 1, low, mid, index, val);
        } else {
            update(2 * treeIndex + 2, mid + 1, high, index, val);
        }
        tree[treeIndex] = tree[2 * treeIndex + 1] + tree[2 * treeIndex + 2];
    }

    public int sumRange(int left, int right) {
        return query(0, 0, n - 1, left, right);
    }

    private int query(int treeIndex, int low, int high, int qLeft, int qRight) {
        if (qLeft > high || qRight < low) return 0; // no overlap
        if (qLeft <= low && qRight >= high) return tree[treeIndex]; // total overlap
        int mid = low + (high - low) / 2;
        int lsum = query(2 * treeIndex + 1, low, mid, qLeft, qRight);
        int rsum = query(2 * treeIndex + 2, mid + 1, high, qLeft, qRight);
        return lsum + rsum;
    }
}
