public class UserController
{
    private UserModel userModel;
    private UserView userView;

    public UserController(UserModel userModel, UserView userView)
    {
        this.userModel = userModel;
        this.userView = userView;
    }

    public void setUserName(String name)
    {
        userModel.setName(name);
    }

    public String getUserName()
    {
        return userModel.getName();
    }

    public void setUserEmail(String email)
    {
        userModel.setEmail(email);
    }

    public String getUserEmail()
    {
        return userModel.getEmail();
    }

    public void updateView()
    {
        userView.userDetail(userModel);
    }
}
