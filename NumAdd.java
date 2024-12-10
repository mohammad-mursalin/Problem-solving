import java.util.LinkedList;

class Solution {
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {

        int n = Math.min(l1.size(), l2.size());

        int sum = 0;
        int carry = 0;

        LinkedList<Integer> list = new LinkedList<>();

        for(int m = 0; m < n ; m++) {
            sum = l1.removeFirst() + l2.removeFirst() + carry;

            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            else {
                carry = 0;
            }
            list.addLast(sum);
        }

        while (! l1.isEmpty()) {
            sum = l1.removeFirst()+ carry;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            else {
                carry = 0;
            }
            list.addLast(sum);
        }

        while (! l2.isEmpty()) {
            sum = l2.removeFirst()+ carry;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            else {
                carry = 0;
            }
            list.addLast(sum);
        }
        return list;
    }
}

public class NumAdd {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(5);

        Solution sol = new Solution();
        System.out.println(sol.addTwoNumbers(list, list1));


    }
}
