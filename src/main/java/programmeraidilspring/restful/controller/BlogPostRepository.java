package programmeraidilspring.restful.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import programmeraidilspring.restful.entity.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
