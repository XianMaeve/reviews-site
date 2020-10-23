package com.xianmaeve.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private Review reviewOne = new Review(1l, "review", "content");
    private Review reviewTwo = new Review(2l, "second", "more content");
    private ReviewRepository testRepo = new ReviewRepository(reviewOne, reviewTwo);

    @Test
    public void shouldfindOne() {
        Review foundReview = testRepo.getOne(1l);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindAll() {
        Collection<Review> foundReviews = testRepo.getAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}
