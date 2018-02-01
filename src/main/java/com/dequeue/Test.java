package com.dequeue;
import java.util.*;

public class Test {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            Object element;

            if (element.instanceOf)
        }
    }*/

    public static void main(String[] args){
        Deque deque = new ArrayDeque<>();
        int n = 6;
        int m = 3;
        List sizes = new ArrayList<>();
        int[] array ={5,3,5,2,3,2};

        for (int i = 0; i < n + 1; i++) {
            int num = -1;
            if (i < n)
                num = array[i];

            if (deque.size() < m)
                deque.addLast(num);
            else {
                Iterator iterator = deque.iterator();
                List aux = new ArrayList();
                while (iterator.hasNext()){
                    if (aux.isEmpty())
                        aux.add(iterator.next());
                    else {
                        int next_num = (int) iterator.next();
                        if (!aux.contains(next_num)){
                            aux.add(next_num);
                        }
                    }
                }
                deque.removeFirst();
                if (num != -1)
                    deque.addLast(num);
                sizes.add(aux.size());
            }
        }

        Collections.sort(sizes);
        Collections.reverse(sizes);

        System.out.println(sizes.get(0));
    }
}
