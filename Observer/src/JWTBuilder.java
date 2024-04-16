public class JWTBuilder implements Observer{
    @Override
    public void update(User user) {
        if(user.getStatus() == LoginStatus.SUCCESS) {
            String jwt = "DoidenLam";
            System.out.println("Login success: " + jwt);
        }

    }
}
