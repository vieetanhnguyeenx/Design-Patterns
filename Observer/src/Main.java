public class Main {
    public static void main(String[] args) {
        AccountService acc = createAccount("doiden@gmail.com", "192.168.1.1");
        acc.login();
        acc.changeStatus(LoginStatus.EXPIRED);
        System.out.println("-------------------- \n");

        acc = createAccount("doibuo1n@gmai.com", "1921.168.1.1");
        acc.login();


    }

    private static AccountService createAccount(
            String email, String ip) {
        AccountService accountService = new AccountService(email, ip);
        accountService.attach(new Logger());
        accountService.attach(new Mailer());
        accountService.attach(new Protector());
        accountService.attach(new JWTBuilder());
        accountService.attach(new FailureHandler());
        return accountService;
    }

}
