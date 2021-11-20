package com.ssafy.happyhouse.component;

import com.ssafy.happyhouse.model.NewsDto;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class JsoupComponent {

    public List<NewsDto> getNewsList() {
        final String newsList = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid1=101&sid2=260";
        Connection conn = Jsoup.connect(newsList);

        try {
            Document document = conn.get();
            return getNewsList(document);
        } catch (IOException ignored) {
        }
        return null;
    }

    public List<NewsDto> getNewsList(Document document) {
        Elements newsElement = document.select("div.list_body");
        List<NewsDto> list = new ArrayList<>();
        for (Element element : newsElement.select("dl")) {
            System.out.println(element);
            list.add(createNewsDto(element));
        }

        return list;
    }

    public NewsDto createNewsDto(Element dt) {
        NewsDto newsDto = NewsDto.builder().build();
        Class<?> clazz = newsDto.getClass();
        Field[] fields = clazz.getDeclaredFields();

        String title;
        String url;
        String contents;

        title = dt.select("dt").text();
        url = dt.select("a").attr("href");
        contents = dt.select(".lede").text();

        fields[0].setAccessible(true);
        fields[1].setAccessible(true);
        fields[2].setAccessible(true);
        try {
            fields[0].set(newsDto, title);
            fields[1].set(newsDto, url);
            fields[2].set(newsDto, contents);
        } catch (Exception ignored) {
        }

        return newsDto;
    }
}