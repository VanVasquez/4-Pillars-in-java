abstract class Player {
    private String name;
    Player(String name){
        this.name = name;
    }
    public void Info() {
        System.out.println("Name: " + this.name);
    }
    public abstract void skills();
}

class Human extends Player{
    public Human(String name){
        super(name);
    }
    @Override
    public void skills() {
        System.out.println("Skills: Cooking");
    }

}

class Elf extends Player {
    public Elf(String name) {
        super(name);
    }

    @Override
    public void skills() {
        System.out.println("Skills: Magic");
    }
}