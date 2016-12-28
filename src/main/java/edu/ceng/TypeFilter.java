package edu.ceng;
import java.util.function.Predicate;

public class TypeFilter implements Predicate<Article>{
    private final TYPE type;

    public TypeFilter(TYPE type){
        this.type = type;
    }

    @Override
    public boolean test(Article article) {
        return article.type == type;
    }
}
