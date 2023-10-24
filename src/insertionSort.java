public class insertionSort {

    public static void main(String[] args) {
        int[] sort={5,3,4,8,1,0,6,7};
        insertSort(sort);

    }
    public static  void insertSort(int[] s ){

        for (int i = 1; i <s.length ; i++) {
            int min =s[i];
            int j=i-1;
            while(j>=0 &&  s[j]>min){
                s[j+1]=s[j];
                j=j-1;
            }
            s[j+1]=min;
        }
    }




}
