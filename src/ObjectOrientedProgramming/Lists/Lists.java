package ObjectOrientedProgramming.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        List list1 = new ArrayList();
        List list2 = new LinkedList();
        List list3 = new ArrayList(30);

        List<String> list = new ArrayList<>();

        list.add("Patrick");
        list.add("George");
        list.add("Jesua");
        System.out.println(list.size());
        System.out.println(list.get(1));

        list.remove(1);
        list.remove("Jesua");

        System.out.println(list.size());

        String name = list.get(0);
        System.out.println(name);

        list1.add("Patrick");
        String name2 = (String)list1.get(0); // List of objects, so we need to add type explicitly
        System.out.println(name2);
    }
}
