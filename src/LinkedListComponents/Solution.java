package LinkedListComponents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {

        List<Integer> list =  Arrays.stream(nums).boxed().toList();

        int count = 0;
        int countList = 0;
        int answer = 0;

        if (head.next == null) {return 1;};

        while (head.next != null) {

            if (list.contains(head.val)) {
                count++;
            }

            countList++;
            head = head.next;

            if (countList != count) {
                count = 0;
                countList = 0;

                if (head.next == null) {
                    if (list.contains(head.val)) {
                        answer++;
                    }
                }
            }else if(countList==count){
                if (count==1){
                    answer++;
                }
            }
        }
        return answer;
    }
}

 class ListNode {
     int val;
     ListNode next;

     ListNode() {
     }

     ListNode(int val) {
         this.val = val;
     }

     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
 }