import json

class Solution(object):
    
    def __init__(self):
        pass

    def generateParenthesis(self, N):
        ans = []
        def backtrack(S = '', left = 0, right = 0):
            if len(S) == 2 * N:
                ans.append(S)
                return
            if left < N:
                backtrack(S+'(', left+1, right)
            if right < left:
                backtrack(S+')', left, right+1)

        backtrack()
        return ans
            
def stringArrayToString(input):
    return json.dumps(input)

ret = Solution().generateParenthesis(4)
print(stringArrayToString(ret))
