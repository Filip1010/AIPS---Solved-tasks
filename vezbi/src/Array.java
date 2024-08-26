
public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }


    public E get(int index) {
        return data[index];
    }

    public void delete(int position){
        if (position>=0 && position<size){
            for (int i=position; i<size-1; i++){
                data[i] = data[i+1];
            }
            size--;
        }
    }


    public void insertLast(E element) {
        if (size+1> data.length)
            resize();
        data[size++] = element;
    }

    public void resize(){

    }
    public void insert(int postion, E element){
        if (postion>=0 && postion<size){
            if (size+1>=data.length){
                data[postion] = element;
            }
        }


    }
    @Override
    public String toString() {
        String ret;
        if (size > 0) {
            ret = "{";
            ret += data[0];
            for (int i = 1; i < size; i++) {
                ret += "," + data[i];
            }
            ret += "}";
        } else {
            ret = "Prazna niza!";
        }
        return ret;
    }


}

