package za.ac.cput.projectsss;

public class Animal implements ElephantInterface {

    //private String animalName;
   // private  int numberOfLegs;


    //GETTERS
   // public String getAnimalName(){
       // return animalName;
    //}

   // public int getNumberOfLegs(){
    //    return numberOfLegs;
   // }

    //SETTERS
   // public void setAnimalName(String animalName){
       // this.animalName=animalName;
    //}
  // public void setNumberOfLegs(int numberOfLegs){
     //   this.numberOfLegs= numberOfLegs;
   // }



    @Override
    public void movement(){
        System.out.println("Movement in motion...");
    }

    @Override
    public void eat(){
        System.out.println("Animals shall eat what needs to be eaten");
    }

}
