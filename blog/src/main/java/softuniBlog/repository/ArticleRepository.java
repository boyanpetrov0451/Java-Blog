package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Article;

/**
 * Created by Boyan on 27.11.2016 г..
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
