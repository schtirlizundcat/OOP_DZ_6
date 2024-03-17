package homework;

public class DetaliedUserReporter extends UserReporter {
    public static void report(User user) {
        // Расширенный отчёт по пользователю
        System.out.println("Extended report on user " + user.getName() + " follows:");

    }
}
