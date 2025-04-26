class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) break;
            long num1 = Long.parseLong(num.substring(0, i));
            for (int j = i + 1; n - j >= j - i && n - j >= i; j++) {
                if (num.charAt(i) == '0' && j - i > 1) break;
                long num2 = Long.parseLong(num.substring(i, j));
                if (isValid(num1, num2, j, num)) return true;
            }
        }
        return false;
    }

    private boolean isValid(long num1, long num2, int start, String num) {
        int n = num.length();
        while (start < n) {
            num2 = num1 + num2;
            num1 = num2 - num1;
            String sum = String.valueOf(num2);
            if (!num.startsWith(sum, start)) return false;
            start += sum.length();
        }
        return true;
    }
}
