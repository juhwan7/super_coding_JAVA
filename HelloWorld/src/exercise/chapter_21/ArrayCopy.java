package exercise.chapter_21;

public class ArrayCopy {
    public static void main(String[] args) {
        int a= 5;
        int b = a;
        b+=5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //Array
        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;

        arr1[0]=10;

        System.out.println("arr1 = " + arr1);
        System.out.println("arr2 = " + arr2);
        //배열의 주소를 가져오기 때문에 원래 값을 변경함
        // new가 붙은건 객체임으로 주소가 복사됨
    }
}
