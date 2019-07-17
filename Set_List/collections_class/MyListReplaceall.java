//How to replace all occurances of a given object in the list?
package collections_class;
import java.util.*;
public class MyListReplaceall {

    public static void main(String a[]){
         
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("unix");
        list.add("perl");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add(".net");
        list.add("perl");
        list.add("c++");
        System.out.println(list);
        //replace perl with dum_dum
        Collections.replaceAll(list, "perl", "python");
        System.out.println(list);
    }
}
