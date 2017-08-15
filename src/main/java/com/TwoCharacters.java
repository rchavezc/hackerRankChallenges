package com;

import java.util.*;

public class TwoCharacters {

    private static int twoChars(String s) {

        if (s.length() <= 1)
            return 0;

        Set<Character> set = new HashSet<>();
        int count = 0, aux = 0;
        for (int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }

        Character[] array = set.toArray(new Character[0]);

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {

                String replaced = s;

                for (int k = 0; k < array.length; k++) {
                    if (array[k] != array[i] && array[k] != array[j])
                        replaced  = replaced.replaceAll(array[k].toString(), "");
                }

                for (int k = 0; k < replaced.length() - 1; k++) {
                    if (replaced.charAt(k) == replaced.charAt(k + 1)) {
                        aux = 0;
                        break;
                    }
                    aux++;
                }

                if (aux > count)
                    count = aux;

                aux=0;

                System.out.println(replaced);
            }
        }

        if (count > 0)
            count++;
        return count;
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();*/

        String s = "bleinlirvdllgpqysgejejaptjrnmuvsulpwwofocahzbdngybbqdfleycicnpbrdkzmzraayiqzwplgnnmirnddadidsyftrezectrelgwzegsrvzyjramgqvwwotacyurxrpfyrvkrqpcjrezpbizwkzwtucohtcwqktiyrlvxtwuilwvjdhoqaiiqjpkosjkolpgojlfabpperqqtmnjowynwmxavicjdknpgnmpktovtssynavflaxqbxygryjbfymjfcemqgnhrhyunopicpsskhzkvdnedrweuneshcuoegxzlmcuvojbnqcyapqvnwpfufqpekjvxxujogguhhtvwlrrvctqdllpdegtwwmfnceaiqfpfoqggkqpbmdzhdpsrklllsssazidvcpsipxhucgcqxpekijfijqblnvbrubgqohwpqrngilierbzjrjozslmibpocyzeqrtfenkcklvtajhrzumyjgdkzdaztytogvrncqgcutwdpvnuesbadhfgijjcjygonhvkhlypwnexumozowkfnykdovqjrwnwsudufhvcikaedsfiyzoqyvodmwixpmdpxtveinykvdrjdbmandgzcouzdlpiynwlhcwqafaqpqjdkbouelfbmztbqshzlgedbduhgcerrbqnqzfvgpfheqrnwlsduxklrfjjnkmvetkuzagkdmkaugptrdenqfiavgqzfubybmjcgoqlmvgcdmddwigtqmvjpkwlkuyxdycuriyrvlbghvyagxulvqmrkxlqfpxblnwdctznlrbbactsrbubcaayntkjmhzjzuyruejekcorvtbglaccnzxhutfqzjrfadgpgubqynmbxziudhmzcpmpx";

        System.out.println(twoChars(s));
    }
}
