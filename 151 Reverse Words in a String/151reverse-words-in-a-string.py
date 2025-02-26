class Solution(object):
    def reverseWords(self, s):
        words = s.split()
        reversed_words = []
        for word in words:
            reversed_words.insert(0, word)
        return ' '.join(reversed_words)
