public class Main
{
    public static void main(String[] args)
    {
        Animal cat = AnimalFactory.getAnimal("cat");
        Animal dog = AnimalFactory.getAnimal("dog");

        System.out.println(cat.eat());
        System.out.println(dog.eat());

    }
}
