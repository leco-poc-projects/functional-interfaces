package guru.leco;

import contracts.Mail;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Mail mail = new Mail(() -> System.out.println("Send message right now!!"));

        mail.send();
    }
}
