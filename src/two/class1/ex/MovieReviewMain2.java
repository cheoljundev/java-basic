package two.class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        MovieReview review2 = new MovieReview();
        MovieReview[] reviews = new MovieReview[2];

        review1.title = "인셉션";
        review1.review = "인생은 무한 루프";

        review2.title = "어바웃 타임";
        review2.review = "인생 시간 영화!";

        reviews[0] = review1;
        reviews[1] = review2;

        for (int i = 0; i < reviews.length; i++) {
            System.out.println("영화 제목 : " + reviews[i].title + " 리뷰 : " + reviews[i].review);
        }

    }
}
