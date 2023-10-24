public class HigherArray {
    private long[] arr;
    private int arrSize;

    public HigherArray(int max) {
        this.arr = new long[max];
        this.arrSize = 0;
    }


    public long[] getArr() {
        return arr;
    }
    public void display(){
        for (int i = 0; i <arrSize ; i++) {
            System.out.print(this.arr[i]+" ");
        }
    }
    public void search(long value){
        int i;
        for ( i= 0; i <arrSize ; i++) {
            if(this.arr[i]==value)
                break;
        }
        if(i==arrSize)
            System.out.println("search key not found "+value);
        else
            System.out.println("search key found "+ value);
    }
    public void insertMiddle(long value,long newValue){
        int i,j;
        for ( i= 0; i <arrSize ; i++) {
            if(this.arr[i]==value)
                //this.arr[i]=newValue;
                break;
        }
        arrSize++;

        for ( j = arrSize; j >i ; j--) {
            this.arr[j]=this.arr[j-1];
        }
        this.arr[i]=newValue;
   }
   public int searchBin(long value){
        int lowerbound=0;
        int upperbound=arrSize-1;

        while(true){
            int curIndex=(lowerbound+upperbound)/2;
            if(arr[curIndex]==value)
                return curIndex;
            else if(lowerbound>upperbound)
                return arrSize;
            else {
                if (arr[curIndex] <value)
                    lowerbound=curIndex+1;
                else
                    upperbound=curIndex-1;
            }
        }
        //0 9 2 4 1 9
       //0 2 9 4 1 9
       //
        


   }
   public  void removeMax(){
        delete(getMax());
   }
   public void test(HigherArray h2){
       System.out.println(h2.arr[0]);
   }
//   public  long getValue(HigherArray vlaues){
//       for (int i = 0; i <vlaues.arrSize ; i++) {
//
//
//       }
//
//   }

   public long getMax(){
       long temp;
       int indexcount=0;

       for (int i = 0; i <arrSize-1 ; i++) {
           for (int j = i+1; j < arrSize; j++) {
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
           indexcount++;

       }

        return arr[indexcount];
   }
    public void delete(long value){
        int i,j;
        for ( i= 0; i <arrSize ; i++) {
            if(this.arr[i]==value)
                break;
        }
        for ( j = i; j <arrSize ; j++) {
            this.arr[j]=this.arr[j+1];
        }
        arrSize--;


    }

    public long insert(long value) {
        this.arr[arrSize] = value;
        arrSize++;
        return value;
    }

    public int getNoOfElements() {
        return arrSize;
    }


}
