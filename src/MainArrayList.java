import java.util.*;
/*
 * author Bogdan Hnatusiv
 * 02.10.2020
 * */
public class MainArrayList<E> extends MyStatesArrayList<E>{
    public static void main(String[] args) {

        //create ArrayList
        List<States> statesArrayList = new ArrayList<States>();

        // create objects of class States
        States state1 = new States("Ukraine");
        States state2 = new States("USA");
        States state3 = new States("Poland");
        States state4 = new States("German");
        States state5 = new States("Ukraine");

        // test size statesArrayList
        System.out.println("Size statesArrayList  =  " + statesArrayList.size());

        //add elements in statesArrayList
        statesArrayList.add(state1);
        statesArrayList.add(state2);
        statesArrayList.add(state3);
        statesArrayList.add(state4);
        statesArrayList.add(state5);
        statesArrayList.add(state2);

        // test size statesArrayList
        System.out.println("Size statesArrayList  =  " + statesArrayList.size());

        // get element of index
        System.out.println(" Element of  index  " + 3 + " in  statesArrayList   is   " + statesArrayList.get(3));

        // test for Empty( if  collection is  empty = true)
        System.out.println(" StatesArrayList  is  Empty     =    " + statesArrayList.isEmpty());

        // method clean
        statesArrayList.clear();
        // test for Empty( if  collection is  empty = true)
        System.out.println(" StatesArrayList  is  Empty     =    " + statesArrayList.isEmpty());

        //add elements in statesArrayList,again
        statesArrayList.add(state1);
        statesArrayList.add(state2);
        statesArrayList.add(state3);
        statesArrayList.add(state4);
        statesArrayList.add(state5);
        statesArrayList.add(state2);

        // test size statesArrayList
        System.out.println("Size statesArrayList  =  " + statesArrayList.size());
        // test for Empty( if  collection is  empty = true)
        System.out.println(" StatesArrayList  is  Empty     =    " + statesArrayList.isEmpty());

        // output all elements of statesArrayList with  help operation for
        System.out.println(" All elements  of StatesArrayList with  help operation for  : ");
        for (int i = 0; i < statesArrayList.size(); i++) {
            System.out.print(statesArrayList.get(i));
        }
        System.out.println();

        // output all elements of statesArrayList with use operation foreach
        System.out.println(" All elements  of StatesArrayList with  help operation foreach  : ");
        for (States states : statesArrayList) {
            System.out.print(states + "  ;   ");
        }
        System.out.println();

        // output all elements of statesArrayList with  use class Iteration and it's methods
        System.out.println(" All elements  of StatesArrayList with  help  Iterator : ");
        Iterator iteratorArrayList = statesArrayList.iterator();
        while (iteratorArrayList.hasNext()) {
            System.out.print(iteratorArrayList.next() + " ||  ");
        }
        System.out.println();

        //add element in  position index
        statesArrayList.add(2, state4);
        System.out.println(" All elements  of StatesArrayList with  help  Iterator : ");
        Iterator iteratorArrayList1 = statesArrayList.iterator();
        while (iteratorArrayList1.hasNext()) {
            System.out.print(iteratorArrayList1.next() + " ||  ");
        }
        System.out.println();

        //create second  ArrayList
        List<States> statesArrayList2 = new ArrayList<States>();

        // create objects of class States
        States state6 = new States("Finland");
        States state7 = new States("Chine");
        States state8 = new States("Japan");
        States state9 = new States("George");

        statesArrayList2.add(state6);
        statesArrayList2.add(state7);
        statesArrayList2.add(state8);

        // output all elements of statesArrayList2 with  use class Iteration and it's methods
        System.out.println(" All elements  of  with  help  Iterator : ");
        Iterator iteratorArrayList2 = statesArrayList2.iterator();
        while (iteratorArrayList2.hasNext()) {
            System.out.print(iteratorArrayList2.next() + " |;  ");
        }
        System.out.println();

        //add all elements of statesArrayList2 input into statesArrayList
        statesArrayList.addAll(statesArrayList2);
        System.out.println(" All elements  of  with  help  Iterator : ");
        Iterator iteratorArrayList3 = statesArrayList.iterator();
        while (iteratorArrayList3.hasNext()) {
            System.out.print(iteratorArrayList3.next() + " |||;  ");
        }
        System.out.println();
        //add all elements of statesArrayList input into statesArrayList2
        statesArrayList2.addAll(statesArrayList);
        System.out.println(" All elements  of  with  help  Iterator : ");
        Iterator iteratorArrayList4 = statesArrayList2.iterator();
        while (iteratorArrayList4.hasNext()) {
            System.out.print(iteratorArrayList4.next() + " ||||;  ");
        }
        System.out.println();

        //add all elements of statesArrayList2  input into statesArrayList begin index 2
        statesArrayList.addAll(2, statesArrayList2);
        System.out.println(" All elements  of  with  help  Iterator : ");
        Iterator iteratorArrayList5 = statesArrayList.iterator();
        while (iteratorArrayList5.hasNext()) {
            System.out.print(iteratorArrayList5.next() + " ;  ");
        }
        System.out.println();

        // test size statesArrayList
        System.out.println("Size statesArrayList  =  " + statesArrayList.size());

         //test is element into  statesArrayList2  with   use method equals()
        System.out.println("Object " + state1 + "is  into statesArrayList2 (....equals())   =  "
                + statesArrayList2.equals(state1));
        System.out.println("Object " + state7 + "is  into statesArrayList2 (....equals())   =  "
                + statesArrayList.equals(state7));

        // test is element into  statesArrayList2
        System.out.println("Object " + state1 + "is  into statesArrayList2    =  " + statesArrayList2.contains(state1));
        System.out.println("Object " + state9 + "is  into statesArrayList2    =  " + statesArrayList2.contains(state9));

        //method returns  index of element
        System.out.println("Index of " + state3 + " into statesArrayList  is  " + statesArrayList.indexOf(state3));
        //if element is not = -1
        System.out.println("Index of " + state9 + " into statesArrayList  is  " + statesArrayList.indexOf(state9));

        //method returns  index of something last element
        System.out.println("Last index  element  " + state2 + "into  statesArrayList  is  "
                + statesArrayList.lastIndexOf(state2));

        // method removes element in position of index
        System.out.println("Size statesArrayList  =  " + statesArrayList.size());
        System.out.println(" Element of  index  " + 4 + " in  statesArrayList   is   " + statesArrayList.get(4));
        statesArrayList.remove(4);
        System.out.println("Size statesArrayList  =  " + statesArrayList.size());
        System.out.println(" Element of  index  " + 4 + " in  statesArrayList   is   " + statesArrayList.get(4));

        // method removes  element object and return true
        System.out.println("Element " + state3 + " remove   =  " + statesArrayList.remove(state3));
        System.out.println("Element " + state9 + " remove   =  " + statesArrayList.remove(state9));
        System.out.println("Size statesArrayList  =  " + statesArrayList.size());

        // method removes few elements
        System.out.println(" Remove statesArrayList2  out  statesArrayLis  = "
                + statesArrayList.removeAll(statesArrayList2));
        System.out.println("Size statesArrayList  =  " + statesArrayList.size());

        //add all elements of statesArrayList input into statesArrayList2
        statesArrayList2.addAll(statesArrayList);
        System.out.println(" All elements  of  with  help  Iterator : ");
        Iterator iteratorArrayList7 = statesArrayList2.iterator();
        while (iteratorArrayList7.hasNext()) {
            System.out.print(iteratorArrayList7.next() + " ||||;  ");
        }
        System.out.println();
        System.out.println("Size statesArrayList2  =  " + statesArrayList2.size());

        //method substitute  element in position on another element
        System.out.println(" Element of  index  " + 4 + " in  statesArrayList2  is   " + statesArrayList2.get(4));
        statesArrayList2.set(4, state3);
        System.out.println(" Element of  index  " + 4 + " in  statesArrayList2  is   " + statesArrayList2.get(4));
        System.out.println("Size statesArrayList2  =  " + statesArrayList2.size());
        System.out.println(" All elements  of  with  help  Iterator : ");
        Iterator iteratorArrayList8 = statesArrayList2.iterator();
        while (iteratorArrayList8.hasNext()) {
            System.out.print(iteratorArrayList8.next() + " ;  ");
        }
        System.out.println();

        // calculation  method Hash Code of element and statesArrayList2
        System.out.println("Hash Code  of  "  + state3 + "  =  " +  state3.hashCode());
        System.out.println("Hash Code  of  "  + state1 + "  =  " +  state1.hashCode());
        System.out.println("Hash Code  of  "  + state3 + "  =  " +  state3.hashCode());
        System.out.println("Hash Code  of  statesArrayList2  =  "  +  statesArrayList2.hashCode());
        System.out.println("Hash Code  of  statesArrayList  =  "  +  statesArrayList.hashCode());

    }
}