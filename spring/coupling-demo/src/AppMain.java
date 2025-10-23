import loose.EmailNotificationService;
import loose.NotificationService;
import loose.SMSNotificationService;
import tight.UserService;

public class AppMain {
    public static void main(String[] args) {

        // Tight
        UserService userService = new UserService();
        userService.notifyUser("Order Placed!");

        // Loose
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();
        loose.UserService userServiceLoose = new loose.UserService(smsService);
        userServiceLoose.notifyUser("Order Processed!");

        /*
        Constructor Injection – dependency is provided via constructor
        Setter Injection – dependency is provided via setter method
        Field Injection – dependency is assigned directly to a field
         */
        loose.UserService userServiceLooseSetter
                = new loose.UserService();
        userServiceLooseSetter.setNotificationService(emailService);
        userServiceLooseSetter.notificationService = smsService;

    }
}
