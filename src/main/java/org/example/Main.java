package org.example;

public class Main {
    public static void main(String[] args) {
        Scraper etWiki = new Scraper();
        System.out.println(etWiki.cleanText("https://et.wikipedia.org/wiki/WD-40"));
    }
}