import java.util.ArrayList;
import java.util.List;

public class UserDao implements DAO<User>
{
    List<User> userList = new ArrayList<User>();

    public UserDao()
    {
        userList.add(new User("Natsu","natsu@yahoo.com"));
        userList.add(new User("Erza","erza@yahoo.com"));
    }

    @Override
    public List<User> getAll()
    {
        return userList;
    }

    @Override
    public User getId(long id)
    {
        return userList.get((int) id);
    }

    @Override
    public void insert(User user)
    {
        userList.add(user);
    }

    @Override
    public void delete(User user)
    {
        userList.remove(user);
    }
}
