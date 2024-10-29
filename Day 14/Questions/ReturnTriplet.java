/*
Given an integer array nums, return all the triplets [nums[i], nums[j],   
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
Notice that the solution set must not contain duplicate triplets.

*/

// Just Try to understand the logic of this question otherwise you clear understand this when you learn array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ReturnTriplet {
    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
        // Output Should be :- {[-1,-1,2],[-1,0,1]}
        threeSum(arr);
    }

    static List<List<Integer>> threeSum(int nums[]) { 
        List<List<Integer>> result = new ArrayList <List<Integer>> (); 
            for(int i=0; i<nums.length; i++) { 
               for(int j=i+1; j<nums.length; j++) { 
                  for(int k=j+1; k<nums.length; k++) { 
                      if(nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> triplet = new ArrayList < Integer > (); 
                            triplet.add(nums[i]); 
                            triplet.add(nums[j]); 
                            triplet.add(nums[k]); 
                            Collections.sort(triplet); 
                            result.add(triplet); 
                        } 
                    } 
                } 
            } 
            result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result)); 
            return result;
}
}
