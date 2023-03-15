
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ste-PC
 */
public class MessagingService {

    ArrayList<Message> service;

    public MessagingService() {
        this.service = new ArrayList<Message>();
    }

    public void add(Message message) {
        String content = message.getContent();
        if (content.length() <= 280) {
            this.service.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.service;
    }
}
