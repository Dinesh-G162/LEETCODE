1class Solution
2{
3    public int[] sortArrayByParity(int[] nums)
4    {
5        int num = 0;
6        for (int i=0;i<nums.length;i++)
7        {
8            if (nums[i]%2==0)
9            {
10                int temp=nums[num];
11                nums[num]=nums[i];
12                nums[i]=temp;
13                num++;
14            }
15        }
16        return nums;        
17    }
18}