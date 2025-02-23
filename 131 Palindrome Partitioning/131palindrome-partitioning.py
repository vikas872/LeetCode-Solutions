class Solution(object):
    def partition(self, s):
        result = []
        self.backtrack(s, [], result)
        return result

    def backtrack(self, s, path, result):
        if not s:
            result.append(path)
            return
        for i in range(1, len(s) + 1):
            if s[:i] == s[:i][::-1]:
                self.backtrack(s[i:], path + [s[:i]], result)
