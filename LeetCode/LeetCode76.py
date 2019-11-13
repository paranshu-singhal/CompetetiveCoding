class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(s) == 0 or len(t) > len(s):
            return ""
        if t == s:
            return s

        def check_equal(i,j,hash_s,hash_t):
            for x in hash_t:
                if hash_s[x] < hash_t[x]:
                    return False
            return True

        i=0
        j=len(t)-1

        hash_t = {}
        for x in range(-2,26):
            hash_t[chr(x+97)] = 0
            hash_t[chr(x+65)] = 0
        for x in t:
            hash_t[x] = hash_t[x] + 1

        hash_s = {}
        for x in range(-2,26):
            hash_s[chr(x+97)] = 0
            hash_s[chr(x+65)] = 0
        for x in s[i:j+1]:
            hash_s[x] = hash_s[x] + 1


        min_len = 10000
        start = -1

        while j<len(s):
            if check_equal(i,j,hash_s,hash_t):
                if j-i+1 < min_len:
                    min_len = min(min_len, j-i+1)
                    start = i
                hash_s[s[i]] = hash_s[s[i]]-1
                i=i+1
                if j-i+1 < len(t):
                    j=j+1
                    if j<len(s):
                        hash_s[s[j]] = hash_s[s[j]] + 1
            else:
                j=j+1
                if j<len(s):
                    hash_s[s[j]] = hash_s[s[j]] + 1
        if start==-1:
            return ""
        else:
            return s[start:start+min_len]