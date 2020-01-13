class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        result=[]
        if len(nums)==0:
            return result
        elif len(nums)==1:
            result.append(str(nums[0]))
            return result
        
        start = nums[0]
        
        for i in range(1,len(nums)):
            if nums[i] - nums[i-1] != 1:
                end = nums[i-1]
                if start==end:
                    result.append(str(start))
                else:
                    result.append(str(start)+"->"+str(end))
                start=nums[i]
            if i == len(nums) -1:
                if start==nums[i]:
                    result.append(str(start))
                else:
                    result.append(str(start)+"->"+str(nums[i]))

        return result