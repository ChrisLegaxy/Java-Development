public class Main
{
    public static void main(String[] args)
    {
        SingletonObjectEager singletonObjectEager = SingletonObjectEager.getInstance();
        SingletonObjectEager singletonObjectEager1 = singletonObjectEager.getInstance();

        SingletonObjectLazy singletonObjectLazy = SingletonObjectLazy.getInstance();
        SingletonObjectLazy singletonObjectLazy1 = SingletonObjectLazy.getInstance();

        System.out.println(singletonObjectEager);
        System.out.println(singletonObjectEager1);

        System.out.println(singletonObjectLazy);
        System.out.println(singletonObjectLazy1);

    }
}
