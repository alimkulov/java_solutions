package kz.mylab.homework18;

public class Task2 {

    void showArray(String[][] array){
        System.out.print("{ ");
         for(int i=0; i< array.length; i++) {
             System.out.print("{ ");
             for(int j=0; j<array[i].length;j++) {
                 System.out.print(array[i][j]+",");
             }
             System.out.print(" },");
         }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        Task2 t2=new Task2();
        String[][] array1={{"some","any","one"},{ "Where","What"},{"in","on","at","under","next to"}};
        for(int i=0; i<array1.length; i++) {
            for (int j=0; j<array1[i].length; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }

        t2.showArray(array1);
    }
}
