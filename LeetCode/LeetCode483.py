class Solution:
    def findAnagrams(self, s2: str, s1: str) -> List[int]:
        def check_permutation(hash1, hash2):
            return hash1 == hash2
    
        hash1 = {}
        hash2 = {}
        
        result = []
        
        for x in range(97,97+26):
            hash1[chr(x)] = 0
            hash2[chr(x)] = 0
        
        for x in s1:
            hash1[x]+=1
        
        start = 0
        end = len(s1) - 1
        
        for x in s2[start:end + 1]:
            hash2[x]+=1
        
        if check_permutation(hash1, hash2):
            result.append(0)
        
        while end < len(s2):
            hash2[s2[start]] -= 1
            start+=1
            end+=1
            if end < len(s2):
                hash2[s2[end]] +=1
                if check_permutation(hash1, hash2):
                    result.append(start)
        
        return result