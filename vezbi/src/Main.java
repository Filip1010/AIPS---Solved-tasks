public class Main {
    public static void main(String[] args) {

        Array<Integer> newarr = new Array<>(5);

        newarr.insertLast(1);
        newarr.insertLast(2);
        newarr.insertLast(3);
        newarr.insertLast(4);
        newarr.insertLast(5);
        for (int i = 0; i < newarr.getSize(); i++) {
            System.out.println("Element at index " + i + ": " + newarr.get(i));
        }


        System.out.println(newarr.getSize());
        newarr.delete(1);
        System.out.println(newarr.getSize());
        newarr.delete(0);
        System.out.println(newarr.getSize());
        for (int i = 0; i < newarr.getSize(); i++) {
            System.out.println("Element at index " + i + ": " + newarr.get(i));
        }
    }
}