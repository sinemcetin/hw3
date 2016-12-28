package edu.ceng;
import java.time.Month;
import java.util.function.Predicate;

public class MonthFilter implements Predicate<Article> {
    private final Month month;

    public MonthFilter(Month month){
        this.month = month;
    }

    @Override
    public boolean test(Article article) {
        return article.getMonth().equals(month);
    }
}
