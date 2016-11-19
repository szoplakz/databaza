package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceBookReviewDao {

    List<BookReview> getAllReviews();

    void insertReview(BookReview review);

    void deleteReview(int id);

    void updateReview(int id);
}
