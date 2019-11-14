class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hashset_s = {}
    
        for x in s:
            if x not in hashset_s:
                hashset_s[x] = 0
            else:
                hashset_s[x] = hashset_s[x] + 1

        hashset_t = {}

        for x in t:
            if x not in hashset_t:
                hashset_t[x] = 0
            else:
                hashset_t[x] = hashset_t[x] + 1

        for x in hashset_t:
            if x not in hashset_s:
                return False
            elif hashset_t[x] != hashset_s[x]:
                return False
        for x in hashset_s:
            if x not in hashset_t:
                return False
            elif hashset_t[x] != hashset_s[x]:
                return False
        return True