package me.bnnq.homework.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class News
{
    private int id;
    private String header;
    private String shortDescription;
    private String content;
    private String[] pathToPhotos;
}
