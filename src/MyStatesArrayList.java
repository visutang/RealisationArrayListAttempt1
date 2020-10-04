
import java.util.*;
import java.util.function.Consumer;

/*
 * author Bogdan Hnatusiv
 * 02.10.2020
 * */

public class MyStatesArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable {

    //create field for realisation some methods MyStatesArrayList
    private E[] values;
    private int index;

    // creat constructor
    protected MyStatesArrayList(){
    }

    //realisation some methods for MyStatesArrayList
    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;

    }

    public int hashCode() {
        int hashCode = 1;
        for (E e : this)
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        return hashCode;
    }

    @Override
    public boolean add(E e) {
        add(size(), e);
        return true;
    }

    @Override
    public int indexOf(Object o) {
        ListIterator<E> iterator = listIterator();
        if (o == null) {
            while (iterator.hasNext())
                if (iterator.next() == null)
                    return iterator.previousIndex();
        } else {
            while (iterator.hasNext())
                if (o.equals(iterator.next()))
                    return iterator.previousIndex();
        }
        return -1;

    }

    @Override
    public int lastIndexOf(Object o) {
        ListIterator<E> iterator = listIterator(size());
        if (o == null) {
            while (iterator.hasPrevious())
                if (iterator.previous() == null)
                    return iterator.nextIndex();
        } else {
            while (iterator.hasPrevious())
                if (o.equals(iterator.previous()))
                    return iterator.nextIndex();
        }
        return -1;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            add(index++, e);
            modified = true;
        }
        return modified;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof List))
            return false;

        ListIterator<E> e1 = listIterator();
        ListIterator<?> e2 = ((List<?>) o).listIterator();
        while (e1.hasNext() && e2.hasNext()) {
            E o1 = e1.next();
            Object o2 = e2.next();
            if (!(o1==null ? o2==null : o1.equals(o2)))
                return false;
        }
        return !(e1.hasNext() || e2.hasNext());
    }

    @Override
    public E remove(int index) {
        return  super.remove(index);
    }


    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return super.iterator();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return super.removeAll(c);
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }
    @Override
    public void add(int index, E element) {
        super.add(index, element);
    }


    @Override
    public E set(int index, E element) {


        return super.set(index, element);
    }
}