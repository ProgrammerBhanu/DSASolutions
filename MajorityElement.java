import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
        int len = nums.length;
        int mid = len/2;
        if(len == 1) return nums[0];
        
        if(nums[mid-1] == nums[mid]){
            return nums[mid-1];
        }else {
            return nums[len-1];
        }
    }
}


/*
 Given an array nums of size n, return the majority element.
 The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
/* 
 Appraoch 1:- 
    3 steps need to follow:
     1. sort the array using quick sort T.C(NlogN)
     2. find mid index
     3. Compare the mid value with mid - 1 index value.
*/   

/* 
 Appraoch 2:- Brute force
    3 steps need to follow:
     1. create a map and count each digit count
     2. fetch all map's value & sort in decending order
     3. Find the val of last index of count_array and return.
*/     