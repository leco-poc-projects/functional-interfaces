package contracts;


public class Mail implements Message {



    private Message message;

    public Mail(Message message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Exec Mail");
        this.message.send();
    }
}
