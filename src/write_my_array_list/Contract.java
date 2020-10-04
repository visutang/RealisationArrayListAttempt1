package write_my_array_list;
/*
 *  author Bohdan Hnatusiv
 * 02.10.2020
 * */


 //creat interface Contract for WriteArray
      //interface Iterable use for  better work with ArrayList
public interface Contract <E>extends Iterable<E>{

   //create 5 main methods
     boolean add(E  e);
     void delete (int index);
     E get (int index);
     int size();
     void update(int index ,E e);

}
