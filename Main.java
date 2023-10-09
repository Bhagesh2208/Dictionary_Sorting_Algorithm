import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String [] smr = new String[]{"1","2","3"};
        Dictionary_Sorting_Algorithm f = new Dictionary_Sorting_Algorithm();
        ArrayList<String> sorted_ArrayList = f.StartSorting("3 1 1 4 21 26 78 15 98 78 666 100000 522");

        for(String s: sorted_ArrayList)
            System.out.println(s);
    }



}
