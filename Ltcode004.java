class ListNode {

    int val;

    ListNode next;

    ListNode(int x) { val = x; }

}



public class Ltcode004 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0), curr = head;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) { sum += l1.val; l1 = l1.next; }

            if (l2 != null) { sum += l2.val; l2 = l2.next; }

            curr.next = new ListNode(sum % 10);

            curr = curr.next;

            carry = sum / 10;

        }

        return head.next;

    }



    public static void main(String[] args) {

        Ltcode004 solution = new Ltcode004();

        ListNode l1 = new ListNode(2), l2 = new ListNode(5);

        l1.next = new ListNode(4); l1.next.next = new ListNode(3);

        l2.next = new ListNode(6); l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);

        while (result != null) { System.out.print(result.val + " "); result = result.next; }

    }

}