package com.example.BookMyShow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Date;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    private User user;
    private BookingStatus bookingStatus;
    private Show show;
    private List<Showseat> showseats;
    private List<Payment> payments;
    private  int amount;
    private Date bookedAt;

}
