public class Main
{
    public static void main(String[] args)
    {
        UserModel userModel = new UserModel();
        UserView userView = new UserView();
        UserController userController = new UserController(userModel,userView);

        userController.setUserName("Natsu");
        userController.setUserEmail("natsu@yahoo.com");

        userController.updateView();
    }
}
