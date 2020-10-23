package com.xianmaeve.reviews;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {
    private Review testReview = new Review(1l, "title", "url", "type", "content", "date", List.of("a", "few", "tags"));

    @Test
    public void canGetId() {
        assertEquals(1l, testReview.getId());
    }

    @Test
    public void canGetTitle() {
        assertEquals("title", testReview.getTitle());
    }

    @Test
    public void canGetUrl() {
        assertEquals("url", testReview.getImageUrl());
    }

    @Test
    public void canGetType() {
        assertEquals("type", testReview.getReviewCategory());
    }

    @Test
    public void canGetContent() {
        assertEquals("content", testReview.getReviewContent());
    }

    @Test
    public void canGetDate() {
        assertEquals("date", testReview.getReviewDate());
    }

    @Test
    public void canGetTags() {
        assertEquals(List.of("a", "few", "tags"), testReview.getReviewTags());
    }

}
