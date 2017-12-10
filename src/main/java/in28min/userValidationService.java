package in28min;

public class userValidationService {


    public boolean validUser(String user , String pass) {
        if (user.trim().equalsIgnoreCase("allen")&&pass.equalsIgnoreCase("dummy"))
            return true;
        else return false;
    }
}
