package demo.day04;

public class Array {
    public static void main(String[] args) {
        //Object[] objects=new Object[100];
        int[] numbers=new int[10];
        numbers[1]=1;
        numbers[3]=1;
        numbers[5]=1;
        numbers[7]=1;
        numbers[9]=1;
        String[] strings=new String[10];
        strings[1]="hi";
        strings[3]="hi";
        strings[5]="hi";
        strings[7]="hi";
        strings[9]="hi";
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        for (String string : strings) {
            System.out.println(string);
        }

    }


}
