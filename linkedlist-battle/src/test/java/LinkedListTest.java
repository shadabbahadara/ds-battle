import com.khan.LinkedList;
import com.khan.Node;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        System.out.println(list);

    }
}
