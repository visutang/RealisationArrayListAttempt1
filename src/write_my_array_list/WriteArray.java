package write_my_array_list;

import java.util.Iterator;

public class WriteArray<E> implements Contract<E> {

    /* ArrayList основан на базе массива (Array),поэтому т.н. контейнер WriteArray  будет преобразовывать
     * на базе массива.*/

    //create array values
    private E[] values;

    // create constructor
     public WriteArray(){
     values = (E[]) new  Object[0];
     }
     //realisation for add, use temporary array and copy it into values
    @Override
    public boolean add(E e) {
            E[] temporary = values;
            values = (E[]) new Object[temporary.length + 1];
            System.arraycopy(temporary, 0,//from
                    values, 0, //target
                    temporary.length);//how many
            values[values.length - 1] = e;
            return true;
    }
     //realisation for delete ,use temporary array and copy it into values
    @Override
    public void delete(int index) {
        E[] temporary = values;
        values = (E[]) new Object[temporary.length - 1];
        System.arraycopy(temporary, 0,//from
                values, 0,//target
                index);//how many
        int numberOfElementsAfterIndex = temporary.length-index-1;//how many
        System.arraycopy(temporary,index+1,//from
                values,index,//target
                 numberOfElementsAfterIndex);//how many
    }

    //realisation for get
    @Override
    public E get(int index) {
        return values[index];
    }

    //realisation size WriteArray
    @Override
    public int size() {
        return values.length;
    }

    //realisation for update
    @Override
    public void update(int index, E e) {
        values[index] = e;

    }

    //realisation for ArrayIterator implements Iterator
    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}
