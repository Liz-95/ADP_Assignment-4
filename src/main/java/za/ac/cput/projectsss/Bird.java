package za.ac.cput.projectsss;

public class Bird extends Animal {
    private int lifespan;

    public Bird() {
    }

    public Bird(int lifespan){
        this.lifespan=lifespan;
    }

    public int getLifespan(){

        return lifespan;
    }

    public void setLifespan(){

        this.lifespan=lifespan;
    }

    @Override
    public void movement(){
        System.out.println("The bird has 2 legs and has an egg fo");
    }

    @Override
    public void eat(){
        System.out.println("A bird eats worms! ");
    }
}
