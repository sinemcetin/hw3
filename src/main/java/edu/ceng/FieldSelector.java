package edu.ceng;

import java.util.function.Function;

public class FieldSelector implements Function<Article, String> {
    private final FIELD field;

    public FieldSelector(FIELD field){
        this.field = field;
    }

    @Override
    public String apply(Article article) {
        return (field == FIELD.title) ? article.title : article.content;
    }

}
