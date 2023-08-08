public class cow extends ANIMAL{
    private String color;

    public cow(int no_leg, boolean tail, String color) {
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
        System.out.println("Hamba");
    }
}
