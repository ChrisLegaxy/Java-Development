import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        DAO<User> userDAO = new UserDao();

        List<User> userList= userDAO.getAll();

        System.out.println(userList);

        User user= userDAO.getId(0);

        System.out.println(user);

        userDAO.insert(new User("Lucy","lucy@yahoo.com"));

        userList = userDAO.getAll();

        System.out.println(userList);

        userDAO.delete(user);

        userList = userDAO.getAll();

        System.out.println(userList);

    }
}
