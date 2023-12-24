package com.lylechristine.rssdataingestion.mapper;

import com.lylechristine.rssdataingestion.entity.NewsArticle;
import com.sun.syndication.feed.synd.SyndEntry;

public class RSSFeedMapper {

    /**
     * Map to Article
     * @param syndEntry
     */
    public static NewsArticle mapToArticle(SyndEntry syndEntry) {
        NewsArticle newsArticle = new NewsArticle();
        newsArticle.setTitle(syndEntry.getTitle());
        newsArticle.setPublishedDate(syndEntry.getPublishedDate().toString());
        newsArticle.setImgUrl("");
        newsArticle.setLink(syndEntry.getLink());
        return newsArticle;
    }
}
