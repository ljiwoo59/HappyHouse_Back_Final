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

import java.util.Calendar;
import java.text.SimpleDateFormat;

@Component
public class JsoupComponent {

    public List<NewsDto> getNewsList() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar c1 = Calendar.getInstance();
        String strToday = sdf.format(c1.getTime());
        List<NewsDto> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            final String newsList = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=260&sid1=101&mid=shm&date=" + strToday + "&page=" + i;
            Connection conn = Jsoup.connect(newsList);

            try {
                Document document = conn.get();
                list.addAll(getNewsList(document));
            } catch (IOException ignored) {
            }
        }
        return list;
    }

    public List<NewsDto> getNewsList(Document document) {
        Elements newsElement = document.select("div.list_body");
        List<NewsDto> list = new ArrayList<>();
        for (Element element : newsElement.select("dl")) {
//            System.out.println(element);
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
        String time;

        title = dt.select("dt").text();
        url = dt.select("a").attr("href");
        contents = dt.select(".lede").text();
        time = dt.select(".date").text();

        fields[0].setAccessible(true);
        fields[1].setAccessible(true);
        fields[2].setAccessible(true);
        fields[3].setAccessible(true);
        try {
            fields[0].set(newsDto, title);
            fields[1].set(newsDto, url);
            fields[2].set(newsDto, contents);
            fields[3].set(newsDto, time);
        } catch (Exception ignored) {
        }

        return newsDto;
    }
}