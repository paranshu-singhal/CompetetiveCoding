class Solution:
    def minSubArrayLen(self, s: int, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        
        result=1000000
        i=0
        j=0
        cur_sum=nums[i]
        while j<len(nums):
            if cur_sum<s:
                j=j+1
                if j<len(nums):
                    cur_sum = cur_sum+nums[j]
            else:
                result = min(result, j-i+1)
                cur_sum = cur_sum-nums[i]
                i=i+1
        if result==1000000:
            return 0
        else:
            return result