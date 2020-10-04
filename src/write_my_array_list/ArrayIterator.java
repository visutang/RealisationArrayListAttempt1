package write_my_array_list;
/*
*  author Bohdan Hnatusiv
* 02.10.2020
* */

import java.util.Iterator;
 // create class ArrayIterator
public class ArrayIterator<E> implements Iterator<E> {

   /*
    Интерфейс Iterator  и его основные методы hasNext(),next() является ключевыми методами
    интерфейса Коллекшн.Реализация интерфейса Iterator  предполагает , что с помощью метода
    next() получаем следующий элемент,а с помоцью  метода hasNext() узнать есть ли еще  Если
    hasNext() - true , то продолжаем, если hasNext() -  false , то прекращается получение эле-
     ментов..
    */

     // create  2 fields
     private int index=0;
     E[] values;

     // create constructor and  override 2 main methods
     public ArrayIterator( E[] values) {
         this.values = values;
     }

     @Override
   public boolean hasNext() {
       return index < values.length;
   }

    @Override
    public E next() {
        return values[index++];
    }
}
