package edu.ceng;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.function.Function;

public class JSonMapper implements Function<String,Article> {
    @Override
    public Article apply(String s) {
        Gson gson = new GsonBuilder().create();
        Article a = gson.fromJson(s, Article.class);
        return a;
    }

}
