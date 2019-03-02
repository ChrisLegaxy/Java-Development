public class SingletonObjectLazy
{
    private static SingletonObjectLazy singletonObjectLazy;
    private SingletonObjectLazy(){};

    public static SingletonObjectLazy getInstance()
    {
        if(singletonObjectLazy==null)
        {
            return singletonObjectLazy = new SingletonObjectLazy();
        }
        return singletonObjectLazy;
    }
}
