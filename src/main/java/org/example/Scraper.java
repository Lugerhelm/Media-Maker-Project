package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Scraper{
    private String firstParagraphText(String wikiLink) {
        try {
            String url = wikiLink;
            Document fail = Jsoup.connect(url).get();
            Element firstParagraph = fail.select("p").first();

            if (firstParagraph != null) {
                System.out.println("Esimene lõik: " + firstParagraph.text());
            }
            return firstParagraph.text();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String cleanText(String wikiLink) {
        String text = this.firstParagraphText(wikiLink);
        return text.replaceAll("\\(.*?\\)", "").replaceAll("\\[.*?\\]", "").trim();

    }
}

