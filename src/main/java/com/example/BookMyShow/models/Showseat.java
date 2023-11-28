package com.example.BookMyShow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Showseat extends BaseModel {
    private Show show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}
