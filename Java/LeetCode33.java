class LeetCode33 {

    public static void main(String[] args) {
        
        int[] nums = new int[2];
        //for (int i=0;i<=3;i++) nums[i] = i+4;
        //for (int i=4;i<7;i++) nums[i] = i-4;
        nums[0] = 1;
        nums[1] = 3;

        System.out.println(search(nums,0));
    }

    public static int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        
        if(right==-1) return -1;
        
        if(left==right){
            if(nums[0]==target) return 0;
            else return -1;
        }
        
        int pivot = FindPivot(nums, left, right);
        //return pivot;
        //return pivot;
        int m1 = BinarySearch(nums, target, left, pivot);
        if(m1!=-1) return m1;
        else return BinarySearch(nums, target, pivot+1, right);
        //return 1;
    }
    
    public static int FindPivot(int[] nums, int left, int right){
        
        if(left == right){
            if(left == 0){
                if(nums[left] > nums[left+1]) return left;
                else return -1;
            }
            if(right == nums.length -1){
                if(nums[right] > nums[right-1]) return right;
                else return -1;
            }
            
            if(nums[left] > nums[left-1] && nums[left] > nums[left+1]) return left;
            else return -1;
        }
        int middle = (left+right)/2;
        int m1 = FindPivot(nums, left, middle);
        if(m1 != -1) return m1;
        else return FindPivot(nums, middle+1, right);
    }
    
    public static int BinarySearch(int[] nums, int target, int left, int right){

        if(left>right) return -1;
        
        if(left==right){
            if(nums[left]==target) return left;
            else return -1;
        } 
        
        int middle = (left+right)/2;
        if(nums[middle] == target) return middle;
        if(target < nums[middle]) return BinarySearch(nums, target, left, middle);
        else return BinarySearch(nums, target, middle+1, right);
    }
}