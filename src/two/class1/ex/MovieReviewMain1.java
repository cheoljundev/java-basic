package two.class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        MovieReview review2 = new MovieReview();

        review1.title = "인셉션";
        review1.review = "인생은 무한 루프";

        review2.title = "어바웃 타임";
        review2.review = "인생 시간 영화!";

        System.out.println("영화 제목 : " + review1.title + " 리뷰 : " + review1.review);
        System.out.println("영화 제목 : " + review2.title + " 리뷰 : " + review2.review);
    }
}
