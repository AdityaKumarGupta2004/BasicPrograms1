
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(13);
        System.out.println(l1.size());
        l1.add(85);
        l1.add(882);
        l1.add(123);
        l1.add(151);
        System.out.println(l1);
        ArrayList<Integer> l2 = new ArrayList<Integer>(l1.subList(0, 2));
        System.out.println(l2);
        Collections.sort(l1, Collections.reverseOrder()); 
        System.out.println(l1);
        ArrayList l3 =(ArrayList) l1.clone();
        System.out.println(l3);

        List<Integer> list = new ArrayList<>();


        list.add(2);
        list.add(1);
        list.add(0);
        list.add(4);
        Collections.sort(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(l1.size());



    }
}
