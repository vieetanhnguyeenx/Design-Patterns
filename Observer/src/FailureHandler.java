public class FailureHandler implements Observer{
    @Override
    public void update(User user) {
        if(user.getStatus() == LoginStatus.FAILURE) {
            System.out.println("Login Failure!!! " + user);
        }
    }
}
