package test;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MapToObject {

    public Game mapGame(String jsonContent) {
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(jsonContent, Game.class);
    }

    public Company mapCompany(String jsonContent) {
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(jsonContent, Company.class);
    }

    public Player mapPlayer(String jsonContent) {
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(jsonContent, Player.class);
    }
}
