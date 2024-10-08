package example.review.domain.dto;

import example.review.domain.entity.Book;

public record BookRequest(

        String title,
        String author,
        String isbn,
        int price
) {
    public Book toEntity() { //빌더타입
        return Book.builder()
                .title(title)
                .author(author)
                .isbn(isbn)
                .price(price)
                .build();
    }

}
