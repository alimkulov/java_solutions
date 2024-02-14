package kz.mylab.homework18;

public class Task1 {

    static int[] sortirovka(int[] array1) {
           int[] arr=array1;
           boolean sorted = true;
           while(sorted) {
              sorted=false;
               for(int i=1; i< arr.length; i++) {
               if(arr[i]<arr[i-1]) {
                   int temp=arr[i];
                   arr[i]=arr[i-1];
                   arr[i-1]=temp;
                   sorted=true;
               }
           }
           }
           return arr;
     }

    public static void main(String[] args) {
      //  Task1 t1=new Task1();
        int[] array2={10,-4, 3, 1, 20, -7, 5,2};
        for(int i=0; i< array2.length;i++) {
            System.out.print(array2[i]+" ");
        }

        int[] res=sortirovka(array2);

        System.out.println();
          for (int i = 0; i < res.length; i++) {
              System.out.print(res[i] + " ");
          }
    }


}
