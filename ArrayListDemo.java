import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
    ArrayList <Integer> arrList = new ArrayList<Integer>(); // create an ArrayList Object
    public void addEleToArray()
    {
        //ArrayList <Integer> arrList = new ArrayList<Integer>();
        arrList.add(2);// adding element into arrayList
        arrList.add(4);
        arrList.add(5);
        arrList.add(7);
        Iterator itr = arrList.iterator(); // Iterate ArrayList
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public void removeEle()
    {
        arrList.remove(1); // Removing Element From ArrayList
        System.out.println("after remove");
        Iterator itr1 = arrList.iterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
    public void upDate()
    {
        arrList.set(2,9); // Updating Element Into arraylist
        System.out.println("after Update");
        //Iterator itr2 = arrList.iterator();
        for(Integer num : arrList)
        {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        ArrayListDemo ald = new ArrayListDemo(); // create object of class
        ald.addEleToArray(); // by using object of class calling methods of class.
        ald.removeEle();
        ald.upDate();
    }
}