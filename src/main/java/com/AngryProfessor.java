package com;

public class AngryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int result = 0;
        for (int b : a) {
            if (b <= 0) {
                result++;
            }
        }
        if (result >= k) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {

        int[] a = {-93, -86, 49, -62, -90, -63, 40, 72, 11, 67};
        System.out.println(angryProfessor(4, a));

        int[] b = {23, -35, -2, 58, -67, -56, -42, -73, -19, 37};
        System.out.println(angryProfessor(10, b));

        int[] c = {13, 91, 56, -62, 96, -5, -84, -36, -46, -13};
        System.out.println(angryProfessor(9, c));

        int[] d = {45, 67, 64, -50, -8, 78, 84, -51, 99, 60};
        System.out.println(angryProfessor(8, d));

        int[] e = {26, 94, -95, 34, 67, -97, 17, 52, 1, 86};
        System.out.println(angryProfessor(7, e));

        int[] f = {19, 29, -17, -71, -75, -27, -56, -53, 65, 83};
        System.out.println(angryProfessor(2, f));

        int[] g = {-32, -3, -70, 8, -40, -96, -18, -46, -21, -79};
        System.out.println(angryProfessor(10, g));

        int[] h = {-50, 0, 64, 14, -56, -91, -65, -36, 51, -28};
        System.out.println(angryProfessor(9, h));

        int[] i = {-58, -29, -35, -18, 43, -28, -76, 43, -13, 6};
        System.out.println(angryProfessor(6, i));

        int[] j = {88, -17, -96, 43, 83, 99, 25, 90, -39, 86};
        System.out.println(angryProfessor(1, j));
    }

    //private static final Scanner scanner = new Scanner(System.in);

    /*public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            String result = angryProfessor(k, a);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close(); */
}
