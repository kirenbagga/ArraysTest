public class ArraySimple {
    public static void main(String[] args) {

        long searchKey=0;
        int arrasize=10;

        HigherArray higherArray=new HigherArray(arrasize);
        HigherArray higherArray1=new HigherArray(arrasize);

        higherArray.display();
        higherArray.insert(21);
        higherArray.insert(33);
        higherArray.insert(202);
        higherArray.insert(25);
        higherArray1.insert(55);
        higherArray1.insert(87);
        higherArray1.insert(199);


        higherArray.display();
        System.out.println("======================================");

        higherArray1.display();
        System.out.println("======================================");



        System.out.println("no of elements after get max "+higherArray.getNoOfElements());
        higherArray.display();
        System.out.println(higherArray.getMax());

        System.out.println("no of elements after remove max "+higherArray.getNoOfElements());
        higherArray.removeMax();
        higherArray.display();






        System.out.println("no of elements after insert "+higherArray.getNoOfElements());
        higherArray.display();
        searchKey=87;

        System.out.println("search method");
        higherArray.search(searchKey);

        searchKey=55;
        higherArray.delete(searchKey);
        System.out.println("no of elements after delete "+higherArray.getNoOfElements());
        higherArray.display();

        higherArray.insertMiddle(25,666);
        System.out.println("no of elements after insertin middle "+higherArray.getNoOfElements());
        higherArray.display();




    }
}