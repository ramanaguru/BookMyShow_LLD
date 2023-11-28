package com.example.BookMyShow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private Region region;
    private String name;
    private List<Screen> screens;
}
