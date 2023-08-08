public class rooster extends ANIMAL{
    private String color;

    public rooster(int no_leg, boolean tail, String color) {
        super(no_leg, tail);
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public void makeSound(){
        System.out.println("Kukkurukkkuru");
    }
}
