1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        ArrayList<Integer> l1=new ArrayList<>();
4        for(int i=0;i<m;i++){
5            l1.add(nums1[i]);
6        }
7        for(int j=0;j<n;j++){
8            l1.add(nums2[j]);
9        }
10        Collections.sort(l1);
11        for(int i=0;i<l1.size();i++){
12            nums1[i]=l1.get(i);
13        }   
14    }
15}