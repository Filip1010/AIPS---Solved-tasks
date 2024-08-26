public class JoinSortedLists<E extends Comparable<E>> {
    public static void main(String[] args){
        SLL<String> lista1 = new SLL<String>();
        lista1.insertLast("Ana");
        lista1.insertLast("Bojana");
        lista1.insertLast("Dejan");
        SLL<String> lista2 = new SLL<String>();
        lista2.insertLast("Andrijana");
        lista2.insertLast("Biljana");
        lista2.insertLast("Darko");

        JoinSortedLists<String> js = new JoinSortedLists<String>();
        System.out.println(js.join(lista1, lista2));

    }

    public SLL<E> join(SLL<E> list1, SLL<E> list2){
        SLL<E> finalList = new SLL<E>();

        SLLNode<E> firstList = list1.getFirst();
        SLLNode<E> secondList = list2.getFirst();

        while (firstList!=null && secondList!=null){
            if (firstList.element.compareTo(secondList.element) > 0){
                finalList.insertLast(secondList.element);
                secondList = secondList.succ;

            } else {
                finalList.insertLast(firstList.element);
                firstList=firstList.succ;
            }
        }
        while (firstList!=null){
            finalList.insertLast(firstList.element);
            firstList = firstList.succ;
        }
        while (secondList!=null){
            finalList.insertLast(secondList.element);
            secondList = secondList.succ;
        }
        return finalList;
    }
}
