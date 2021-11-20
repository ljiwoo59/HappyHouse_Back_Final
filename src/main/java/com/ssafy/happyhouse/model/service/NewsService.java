package com.ssafy.happyhouse.model.service;

import com.ssafy.happyhouse.component.JsoupComponent;
import com.ssafy.happyhouse.model.NewsDto;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final JsoupComponent jsoupComponent;

    public List<NewsDto> getNewsList() {
        return jsoupComponent.getNewsList();
    }
}
