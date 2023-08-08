
public class Main {
    public static void main(String[] args) {
       ANIMAL an = new ANIMAL();
        cat CAT = new cat(2, true, "black");
        System.out.print("Cat: ");
        System.out.println("Which color? "+ "\n" + CAT.getColor());
        System.out.println("How many leg has cat? "+ "\n" + CAT.getNo_leg());
        System.out.println("Does cat has tail? "+ "\n" + CAT.isTail());
        System.out.println("How does cat make sounds?");
        CAT.makeSound();

        dog DOG = new dog(4, true, "red");
        System.out.println("DOG: ");
        System.out.println("Which color? "+ "\n" + DOG.getColor());
        System.out.println("How many leg has dog? "+ "\n" + DOG.getNo_leg());
        System.out.println("Does dog has tail? "+ "\n" + DOG.isTail());
        System.out.println("How does dog make sounds?");
        DOG.makeSound();

        cow COW = new cow(4, true, "white");
        System.out.print("COW: ");
        System.out.println("Which color? "+ "\n" + COW.getColor());
        System.out.println("How many leg has cow? "+ "\n" + COW.getNo_leg());
        System.out.println("Does cow has tail? "+ "\n" + COW.isTail());
        System.out.println("How does cow make sounds?");
        COW.makeSound();

        rooster RST = new rooster(2, false, "red");
        System.out.print("ROOSTER: ");
        System.out.println("Which color? "+ "\n" + RST.getColor());
        System.out.println("How many leg has rooster? "+ "\n" + RST.getNo_leg());
        System.out.println("Does rooster has tail? "+ "\n" + RST.isTail());
        System.out.println("How does rooster make sounds?");
        RST.makeSound();
       // an.makeSound();
        }
    }