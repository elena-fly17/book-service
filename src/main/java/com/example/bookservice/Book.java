package com.example.bookservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
// Благодаря аннотации класс сопоставляется с БД, указали имя коллекции
@Document(collection = "books")
public class Book {

    @Id
    private String id;
    private String title;
    private String description;
    private String imageLink;
}
