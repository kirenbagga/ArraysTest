public class PersonDataArray {

    private Person[] persons;
    private int noOfElements;//instead of usinf person array size we r set size limit

    public PersonDataArray(int max) {
        this.persons = new Person[max];
        this.noOfElements = 0;
    }
    public void insertionSort(){
        Person temp;
        for (int i = 1; i <noOfElements ; i++) {
            temp=persons[i];
            int j=i-1;
            while(j>=0 && persons[j].getFisrtName().compareTo(temp.getFisrtName())>0){
                persons[j+1]=persons[j];
                j--;}
            persons[j+1]=temp;
        }
    }

    public Person findPerson(String searchName){
        int i;
        for (i = 0; i < noOfElements; i++)
            if(persons[i].getFisrtName().equals(searchName))
                break;
            if(i== noOfElements)
                return null;
            else
                return persons[i];
    }
    //adding person in person array
    public void insertPerson(String fName, String lName, int age){
        persons[noOfElements]=new Person(fName,lName,age);
        noOfElements++; //incrementing array size
    }
    public boolean deletePerson(String deleteName){
        int j;
        for (j = 0; j < noOfElements; j++)
            if (persons[j].getFisrtName().equals(deleteName))
                break;
            if(j== noOfElements)
                return false;
            else
                for (int k = j; k < noOfElements; k++)
                    persons[k]=persons[k+1];
                    noOfElements--;
                    return  true;

    }
    public  void diplayAllPersons(){
        for (int i = 0; i <noOfElements; i++) {
            persons[i].displayPerson();

        }
    }


}
