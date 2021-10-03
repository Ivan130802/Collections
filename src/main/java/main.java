import java.util.ArrayList;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();



        Integer a = 1;
        Integer b = 2;


        linkedlist.add(a);
        linkedlist.add(b);

        LinkedList<String> mylinkedList = new LinkedList<>();
        String dh = "doing homework";
        String ndh = "not doing homework";

        ArrayList<Integer> arrayList = new ArrayList<>();


        arrayList.add(a);
        arrayList.add(b);

        ArrayList<String> myarrayList = new ArrayList<>();


        for (int i = 0; i < linkedlist.size(); i++ ){
            System.out.println(linkedlist.get(i));
        }

        for (int i = 0; i < arrayList.size(); i++ ){
            System.out.println(arrayList.get(i));
        }
        /*
        mylinkedList.add(dh);
        System.out.println("Students are " + mylinkedList);
        mylinkedList.remove(dh);
        mylinkedList.add(ndh);
        System.out.println("Students are " + mylinkedList);

         */

       /*
        myarrayList.add(dh);
        System.out.println("Students are " + myarrayList);
        myarrayList.remove(dh);
        myarrayList.add(ndh);
        System.out.println("Students are " + myarrayList);
       */

    }
}
