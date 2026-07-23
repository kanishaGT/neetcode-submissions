class Solution {
    public int longestConsecutive(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int count=1;
        
        for(int i=0; i<nums.length-1; i++)
        {
            if (nums[i]==(nums[i+1]))
                continue;

            else if (nums[i]==(nums[i+1]-1))
                count++;

            else
            {
                list.add(count);
                count=1;
                continue;
            }

        }
        list.add(count);
        int max = list.get(0); 
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
        return max;
    }
}
