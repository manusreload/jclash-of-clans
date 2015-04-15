package coc;

import coc.protocol.Message;
import coc.protocol.connection.SocketConnection;
import coc.protocol.messages.MessageFactory;

/**
 *
 * @author manus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Message login = MessageFactory.get(MessageFactory.MESSAGE_TYPE_LOGIN);
        long userId = 0l;

        login.setField(0, LoginSettings.USER_ID); // client id
        login.setField(1, LoginSettings.PASSWORD); // password
        login.setField(2, 7);
        login.setField(3, 0);
        login.setField(4, 1);
        login.setField(5, LoginSettings.MASTERHASH);
        login.setField(6, "");
        login.setField(7, LoginSettings.ANDROID_ID);
        login.setField(8, "");
        login.setField(9, LoginSettings.ANDROID_DEVICE);
        login.setField(10, 2000003);
        login.setField(11, LoginSettings.LANGUAGE);
        login.setField(12, LoginSettings.ADVERTISING_GUID);
        login.setField(13, LoginSettings.ANDROID_VERSION);
        login.setField(14, 1);
        login.setField(15, "");
        login.setField(16, LoginSettings.ANDROID_ID);
        login.setField(17, "");
        login.setField(18, 0);
        login.setField(19, "");
        login.setField(20, 1177687346);

        SocketConnection connection = new SocketConnection("game.clashofclans.com", 9339);
        connection.connect();

        connection.run(login);

        System.out.println("Disconnected!!");

        connection.close();
    }

}
