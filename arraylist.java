 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Comparator;

class arraylist{
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("Aditya");
        list.add("Suraj");
      
        list.addFirst("Samita");
        list.add(2,"Shreya");
        list.set(3, "Nani");
        for(int i= 0; i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        for(String i : list)
        System.out.println(i);
        System.out.println(list);
        list.sort(null);
        
        System.out.println(list);
    }
}