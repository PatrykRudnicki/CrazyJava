package ObjectOrientedProgramming.Map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args){
        Map<Integer, String> employees = new TreeMap<>();
        employees.put(1, "Employee1");
        employees.put(2, "Employee2");
        employees.put(3, "Employee3");
        employees.put(4, "Employee4");
        employees.put(5, "Employee5");

        System.out.println("Number of employees: " + employees.size());

        Set<Integer> keySet = employees.keySet();
        System.out.println("Keys:\n" + keySet);
        Collection<String> values = employees.values();
        System.out.println("Values:\n" + values);

        Set<Map.Entry<Integer,String>> entrySet = employees.entrySet();
        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
