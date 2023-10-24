public class PersonDataApp {
    public static void main(String[] args) {
        PersonDataArray personDataArray=new PersonDataArray(10);
        personDataArray.insertPerson("kirna","bagga",25);
        personDataArray.insertPerson("ashok","bagga",25);
        personDataArray.insertPerson("umesh","bagga",25);
        personDataArray.insertPerson("uccu","bagga",25);


        personDataArray.diplayAllPersons();
//        personDataArray.diplayAllPersons();
        Person personFound=personDataArray.findPerson("kirna");
        personDataArray.insertionSort();
        System.out.println("insertion sort ");
        personDataArray.diplayAllPersons();
        if(personFound!=null){
            System.out.println("person found " +personFound);
        personFound.displayPerson();}
        else
            System.out.println("person not found "+personFound);




    }
}
