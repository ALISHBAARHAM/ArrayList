import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create the first list
        List<Pc> pcList = new ArrayList<>();
        Pc pc = new Pc(1, "icore", "64GB", "234", "DELL", true);
        Pc pc1 = new Pc(2, "core", "4GB", "34", "toshiba", false);
        Pc pc2 = new Pc(3, "pcore", "16GB", "4", "haier", false);
        Pc pc3 = new Pc(4, "core", "4GB", "34", "Lenovo", false);
        Pc pc4 = new Pc(5, "core", "4GB", "34", "MAC", false);
        Pc pc5 = new Pc(6, "core", "4GB", "34", "Samsung", false);
        pcList.add(pc);
        pcList.add(pc1);
        pcList.add(pc2);
        pcList.add(pc3);
        pcList.add(pc4);
        pcList.add(pc5);

        List<Pc> pcList1 = new ArrayList<>();
        pcList1.addAll(pcList);
        pcList1.addAll(6, pcList);

        System.out.println("Original List:");
        for (Pc temp : pcList1) {
            System.out.println(temp);
        }
        System.out.println("Size of the list: " + pcList1.size());

        pcList.remove(pc1);
        pcList.remove(pc2);

        pcList1.remove(pc1);
        pcList1.remove(pc2);

        System.out.println("\nList after removal:");
        for (Pc temp : pcList1) {
            System.out.println(temp);
        }
        System.out.println("Size of the list: " + pcList1.size());

        System.out.println("\nUpdated pcList:");
        int newId = 1;
        for (Pc temp : pcList) {
            temp.setId(newId);
            newId += 2;
            System.out.println(temp);
        }

        pcList.sort(null);
        System.out.println("Sorted List:");
        for (Pc temp : pcList) {
            System.out.println(temp);
        }
        Collections.reverse(pcList1);
        System.out.println("after reversing");
        for(Pc temp:pcList1){
            System.out.println(temp);
        }

    }}