package exercise.chapter_20;

import java.sql.Array;
import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {
        //int[]
        int[] intArr = new int[10];
        int[] intArr2 = new int[]{1, 2, 3, 4, 5};

        int[] intArr3 = {1, 2, 3, 4, 5};

        System.out.println("intArr2 = " + intArr2);
        System.out.println("intArr3 = " + intArr3);

        //float[]

        float[] floatArr = new float[10];
        float[] floatArr2 = {1.5f, 2.5f, 3.5f};
        System.out.println("floatArr = " + Arrays.toString(floatArr));
        System.out.println("floatArr2 = " + Arrays.toString( floatArr2));


        //boolean
        boolean[] booleans = new boolean[5];
        boolean[] booleans1 = {true,false,true};
        System.out.println("booleans = " + Arrays.toString( booleans));
        System.out.println("booleans1 = " + Arrays.toString( booleans1));

        //char String
        char[] charArr = new char[10];
        char ch =0;
        char[] charArr2 = {'A','B','C'};
        String[] stringArr = new String[10];
        String[] stringArr2 = {"ABC","Hello","World"};
        System.out.println("charArr = " + Arrays.toString(charArr));
        System.out.println("charArr2 = " + Arrays.toString( charArr2));
        System.out.println("Arrays.toString(stringArr) = " + Arrays.toString(stringArr));
        System.out.println("stringArr2 = " + Arrays.toString(stringArr2));
    }
}
