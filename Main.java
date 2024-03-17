package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserReporter.report(user);
        UserRepository.save(user);
    }
}