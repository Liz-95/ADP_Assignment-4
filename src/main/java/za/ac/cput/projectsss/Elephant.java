package za.ac.cput.projectsss;

public class Elephant extends Animal {

    private String elephant1;

    public Elephant(){

    }

    public Elephant(String elephant1){
        this.elephant1= elephant1;
    }

    public String getElephant1(){
        return elephant1;
    }

    public void setElephant1(String elephant1){
        this.elephant1=elephant1;
    }

    @Override
    public void movement(){
        super.movement();
    }

    @Override
    public void eat(){
        super.eat();
    }


}
