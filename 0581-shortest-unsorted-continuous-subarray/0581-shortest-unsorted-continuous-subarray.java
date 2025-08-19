class Solution {
    public int findUnsortedSubarray(int[] nums) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int i =0;i<nums.length;i++){
            minheap.add(nums[i]);
        }
        int[] sorted = new int[nums.length];
        int j = 0;
        while(!minheap.isEmpty()){
             sorted[j++] = minheap.poll();
        }
        int start=0;
        int end=nums.length-1;

        while(start<=end&&nums[start]==sorted[start]){
            start++;
        }
        while(start<=end&&nums[end]==sorted[end]){
            end--;
        }if(start>=end){
            return 0;
        }else{

        return end-start+1;
        }
    }
}