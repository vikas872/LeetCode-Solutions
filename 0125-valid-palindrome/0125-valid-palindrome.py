class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = ""
        for ch in s:
            if ch.isalnum():
                clean+=ch.lower()
        # t = s[::-1]
        return clean==clean[::-1]
        