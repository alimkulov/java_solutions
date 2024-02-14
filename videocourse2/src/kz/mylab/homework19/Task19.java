package kz.mylab.homework19;

public class Task19 {

    static String[] abc(String[] ... array){
        int count=0;
        for (int i=0; i< array.length; i++) {
            for(int j=0; j<array[i].length;j++) {
                count++;
            }
        }
        String[] resArray=new String[count];
       int k=0;
        for(int i=0; i< array.length; i++) {
            for(int j=0; j<array[i].length;j++) {
                resArray[k]=array[i][j];
                k++;
            }
        }
       return resArray;
    }

    public static void main(String[] args) {
        String[] resABC=Task19.abc(args);

        for(String s:resABC) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
