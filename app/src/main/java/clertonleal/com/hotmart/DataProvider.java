package clertonleal.com.hotmart;


import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import clertonleal.com.hotmart.model.Menu;
import clertonleal.com.hotmart.model.Message;
import clertonleal.com.hotmart.model.Sell;
import clertonleal.com.hotmart.model.User;

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
        menus.add(new Menu(R.drawable.ico_mensagens, R.string.messages, 50));
        menus.add(new Menu(R.drawable.ico_notificacoes, R.string.notifications, 15, false));
        menus.add(new Menu(R.drawable.ico_minha_conta, R.string.my_account));
        menus.add(new Menu(R.drawable.ico_sobre_o_app, R.string.about_app));
        return menus;
    }

    public static User getMockUser() {
        return new User("Clerton Leal", "clertonleal@gmail.com", "https://s30.postimg.org/tvexwbmw1/profile.jpg", 2152.23F);
    }

    public static List<Sell> getMockSells() {
        Date date = getDate();

        List<Sell> sells = new ArrayList<>();
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F, true));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F, true));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        sells.add(new Sell("Como Decorar uma festa infantal maravilhosa e simples de fazer", 30294080L, date, 1035F));
        return sells;
    }

    private static Date getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse("12/12/2016");
        } catch (ParseException e) {
            Log.e("getMockSells", e.getMessage(), e);
        }
        
        return date;
    }
}
