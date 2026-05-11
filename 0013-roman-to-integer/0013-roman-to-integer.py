class Solution:
    def romanToInt(self, s: str) -> int:
        r = "IVXLCDM"
        mp = {}
        mp["I"] = 1
        mp["V"] = 5
        mp["X"] = 10
        mp["L"] = 50
        mp["C"] = 100
        mp["D"] = 500
        mp["M"] = 1000
        val = mp[s[0]]
        for i in range(1,len(s)):
            # curr = 0
            if mp[s[i]]>mp[s[i-1]]:
                val+=mp[s[i]] - 2*mp[s[i-1]]
            else:
                val+=mp[s[i]]
       

            # val+=mp[s[i]]
        return val