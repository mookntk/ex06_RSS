package com.example.ex06_rss.Model

data class RSSObject(val status: String,val feed: Feed, val items: List<Item>)