package HASH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Почеток на класа SLL Node
class SLLNode<E> {
    protected E element;
    protected SLLNode<E> succ;

    public SLLNode(E elem, SLLNode<E> succ) {
        this.element = elem;
        this.succ = succ;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
// Крај на класа SLL Node

// Почеток на класа MapEntry
class MapEntry<K extends Comparable<K>, E> implements Comparable<K> {
    K key;
    E value;

    public MapEntry(K key, E val) {
        this.key = key;
        this.value = val;
    }

    public int compareTo(K that) {
        return this.key.compareTo(that);
    }

    public String toString() {
        return "<" + key + "," + value + ">";
    }
}
// Крај на класа MapEntry

// Почеток на класа CBHT
class CBHT<K extends Comparable<K>, E> {

    private SLLNode<MapEntry<K, E>>[] buckets;

    @SuppressWarnings("unchecked")
    public CBHT(int m) {
        buckets = (SLLNode<MapEntry<K, E>>[]) new SLLNode[m];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public SLLNode<MapEntry<K, E>> search(K targetKey) {
        int b = hash(targetKey);
        for (SLLNode<MapEntry<K, E>> curr = buckets[b]; curr != null; curr = curr.succ) {
            if (targetKey.equals(((MapEntry<K, E>) curr.element).key))
                return curr;
        }
        return null;
    }

    public void insert(K key, E val) {
        MapEntry<K, E> newEntry = new MapEntry<>(key, val);
        int b = hash(key);
        for (SLLNode<MapEntry<K, E>> curr = buckets[b]; curr != null; curr = curr.succ) {
            if (key.equals(((MapEntry<K, E>) curr.element).key)) {
                curr.element = newEntry;
                return;
            }
        }
        buckets[b] = new SLLNode<>(newEntry, buckets[b]);
    }

    public void delete(K key) {
        int b = hash(key);
        for (SLLNode<MapEntry<K, E>> pred = null, curr = buckets[b]; curr != null; pred = curr, curr = curr.succ) {
            if (key.equals(((MapEntry<K, E>) curr.element).key)) {
                if (pred == null)
                    buckets[b] = curr.succ;
                else
                    pred.succ = curr.succ;
                return;
            }
        }
    }
}

// Крај на класа CBHT

public class Birthdays {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        CBHT<String , Integer > birthdays = new CBHT<>(23);
        for(int i=0 ; i<N ; i++){
            String p[] = bf.readLine().split("\\.");

            if (birthdays.search(p[1]) == null) {
                birthdays.insert(p[1] , 1);
            }
            else
            {
                SLLNode<MapEntry<String,Integer>> br = birthdays.search(p[1]);
                birthdays.insert(p[1], br.element.value + 1);
            }
        }
           String month = bf.readLine();
            SLLNode<MapEntry<String,Integer>> results = birthdays.search(month);
            if (results ==null) {
                System.out.println("Empty");
            }else{
                System.out.println(results.element.value);
            }


    }
}
