package clertonleal.com.hotmart;


import java.util.ArrayList;
import java.util.List;

import clertonleal.com.hotmart.model.Menu;
import clertonleal.com.hotmart.model.Message;

public class DataProvider {

    public static List<Message> getMockMessages() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.green_background));
        messages.add(new Message("Maria Carol", R.drawable.red_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.blue_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.red_background));
        messages.add(new Message("Maria Carol", R.drawable.black_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.purple_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.purple_background));
        messages.add(new Message("Maria Carol", R.drawable.red_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.black_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.green_background));
        messages.add(new Message("Maria Carol", R.drawable.red_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.purple_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.red_background));
        messages.add(new Message("Maria Carol", R.drawable.black_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.purple_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.purple_background));
        messages.add(new Message("Maria Carol", R.drawable.red_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.black_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.green_background));
        messages.add(new Message("Maria Carol", R.drawable.red_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.purple_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.red_background));
        messages.add(new Message("Maria Carol", R.drawable.black_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.purple_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.purple_background));
        messages.add(new Message("Maria Carol", R.drawable.red_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.black_background));

        messages.add(new Message("Clerton Leal", "https://dl.dropboxusercontent.com/s/q3v4sintbmf7rdg/profile.jpeg?dl=0", R.drawable.purple_background));
        messages.add(new Message("Valeria Siqueira", R.drawable.green_background));
        messages.add(new Message("Maria Carol", R.drawable.red_background));
        messages.add(new Message("Flavia de Alcantara", R.drawable.purple_background));
        return messages;
    }

    public static List<Menu> getMockMenu() {
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu(R.drawable.ico_minhas_vendas, R.string.my_sells));
        menus.add(new Menu(R.drawable.ico_meus_produtos, R.string.my_products));
        menus.add(new Menu(R.drawable.ico_afiliados, R.string.affiliates, 121));
        menus.add(new Menu(R.drawable.ico_mensagens, R.string.messages));
        menus.add(new Menu(R.drawable.ico_notificacoes, R.string.notifications));
        menus.add(new Menu(R.drawable.ico_minha_conta, R.string.my_account));
        menus.add(new Menu(R.drawable.ico_sobre_o_app, R.string.about_app));
        return menus;
    }

}
