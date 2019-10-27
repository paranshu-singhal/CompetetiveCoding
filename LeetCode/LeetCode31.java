class Solution {
    public void nextPermutation(int[] nums) {
        
        int size = nums.length;
            
        int pivot = size-2;
        while(pivot>=0){
            if(nums[pivot] < nums[pivot+1]) break;
            pivot--;
        }
        
        if(pivot==-1){
            Arrays.sort(nums);
            return;
        } 
        
        int successor = nums[size-1];
        
        for(int i = size-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                successor = i;
                break;
            }
        }
        
        swap(nums, pivot, successor);
        reverse(nums, pivot+1, size-1);
    }
        
    public static int[] swap(int nums[], int left, int right) { 
        int temp = nums[left]; 
        nums[left] = nums[right]; 
        nums[right] = temp; 

        return nums; 
    } 
        
    public static int[] reverse(int nums[], int left, int right){
        while(left<right){
            swap(nums, left, right);
            left++;
            right--;
        }
        return nums;
    }
        
}