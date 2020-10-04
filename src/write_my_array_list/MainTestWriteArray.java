package write_my_array_list;
/*
 *  author Bohdan Hnatusiv
 * 02.10.2020
 * */

public class MainTestWriteArray {
    public static void main(String[] args) {

        //create object of class WriteArray
      Contract<String>  stringWriteArray = new WriteArray<>();

        stringWriteArray.add("Tennis");
        stringWriteArray.add("CrossFit");
        stringWriteArray.add("Jim");
        stringWriteArray.add("Football");
        stringWriteArray.add("Hokey");

        //use operation foreach for output all element of stringWriteArray
        //note: operation foreach use ArrayIterator implements Iterator
         System.out.println("All elements of stringWriteArray  :");
         for(String element : stringWriteArray) {
           System.out.print(element  +  " ; ");
         }
          System.out.println();

      //test methods add & get
        System.out.println(   "Element of  index  " + 1 + " in  stringWriteArray   is   "  +
                stringWriteArray.get(1));
        System.out.println(   "Element of  index  " + 3 + " in  stringWriteArray   is   "  +
                stringWriteArray.get(3));

        //test method size
        System.out.println("Size stringWriteArray =  " + stringWriteArray.size());

        //test method update
        stringWriteArray.update(3,"Hokey");
        System.out.println(   "Element of  index  " + 3 + " in  stringWriteArray   is   "  +
                stringWriteArray.get(3));


        //test method delete
      System.out.println("Size stringWriteArray =  " + stringWriteArray.size());
      System.out.println(   "Element of  index  " + 2 + " in  stringWriteArray   is   "
              + stringWriteArray.get(2));
      stringWriteArray.delete(2);
      System.out.println("Size stringWriteArray =  " + stringWriteArray.size());
      System.out.println(   "Element of  index  " + 2 + " in  stringWriteArray   is   "
              + stringWriteArray.get(2));


    }
}
