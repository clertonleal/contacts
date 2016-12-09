package clertonleal.com.hotmart;


import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Message> getMockMessages() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Clerton", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        return messages;
    }

}
