package com.ssafy.happyhouse.controller;

import com.ssafy.happyhouse.model.NewsDto;
import com.ssafy.happyhouse.model.service.NewsService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/news/all")
    public List<NewsDto> getNewsList(HttpServletRequest request) {
        return newsService.getNewsList();

    }
}
