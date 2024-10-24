package one.poly.ex.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String msssage) {
        System.out.println("메일을 발송합니다 : " + msssage);
    }
}
