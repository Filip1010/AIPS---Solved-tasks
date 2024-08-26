package HASH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import HASH.MapEntry;
import HASH.SLLNode;
import HASH.CBHT;
import HASH.Lecture;

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

class Lecture implements Comparable<Lecture> {
  String date;
  String time;
  String place;
  Integer fee;

    public Lecture(String date , String time , String place , Integer fee){
        this.date = date;
        this.time = time;
        this.place = place;
        this.fee = fee;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time=time;
    }
    public String getDate(){
        return date;
    }
    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place = place;
    }
    public Integer getFee(){
        return fee;
    }
    public void setFee(Integer fee){
        this.fee=fee;
    }
    @Override
    public int compareTo(Lecture obj){
        if(this.fee>obj.fee)
        return 1;
        else if(this.fee < obj.fee)
        return -1;
        else
        return 0;
    }
}


public class asd {

    public static void main(String[] args) throws  IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());

        CBH<String , ArrayList<Lecture>> hashtable = new CBHT<String,ArrayList<Lecture>>(2*N);
    }
}
