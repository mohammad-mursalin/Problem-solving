import java.util.LinkedList;

class Solution {
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {

        LinkedList<Integer> list = new LinkedList<>();

        int num1 = 0;
        int num2 = 0;

        while(!l1.isEmpty()) {
            num1 += (int) (l1.removeLast() * Math.pow(10, l1.size()));
        }

        while(!l2.isEmpty()) {
            num2 += (int) (l2.removeLast() * Math.pow(10, l2.size()));
        }

        int result = num1 + num2;

        int divRes = 1;
        int rem;

        while( divRes > 0 ) {
            divRes = result/10;
            rem = result % 10;
            list.addFirst(rem);
            result = divRes;
        }
        return list;
    }
}

public class NumAdd {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);list.add(4);
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(7);list1.add(2);

        Solution sol = new Solution();

        System.out.println(sol.addTwoNumbers(list, list1));


    }
}
