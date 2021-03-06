package com.ssafy.happyhouse.controller;

import com.ssafy.happyhouse.model.NewsDto;
import com.ssafy.happyhouse.model.service.NewsService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/news")
    public List<NewsDto> getNewsList(HttpServletRequest request) {
        return newsService.getNewsList();

    }
    
    @GetMapping("/news/search/{search}")
    public List<NewsDto> getNewsListS(@PathVariable String search) {
    	return newsService.getNewsListS(search);
    }
}
