package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:ar){
            if (!map.containsKey(i)) {
                map.put(new Integer(i),  new Integer(1));
            }
            else {
                map.put(i, map.get(i) + 1);
            }
        }

        Iterator it = map.entrySet().iterator();
        Integer element = 0;
        Integer count = 0;

        while (it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();

            if ((Integer)pair.getValue() > count) {
                element = (Integer)pair.getKey();
                count = (Integer)pair.getValue();
            }

            else if ((Integer)pair.getValue() == count){
                if ((Integer)pair.getKey() < element)
                    element = (Integer)pair.getKey();
            }
        }

        return element;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = migratoryBirds(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        */
        int i[] = {1,1,1,1, 2,2,2,2,5,4};
        // 1,4,4,4,5,3
        //
        System.out.println(migratoryBirds(i));
    }
}
