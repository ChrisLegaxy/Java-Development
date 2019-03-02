public class SingletonObjectEager
{
    private static SingletonObjectEager singletonObjectEager = new SingletonObjectEager();
    private SingletonObjectEager(){};

    public static SingletonObjectEager getInstance()
    {
        return singletonObjectEager;
    }

}
