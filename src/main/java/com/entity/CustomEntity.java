package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomEntity {
    private String student_id;
    private String name;
    private String address;
    private String contact_no;
    private String date;
    private String gender;
    private String room_id;
    private String type;
    private double key_money;
    private int qty;
    private String res_id;
    private LocalDate reservationDate;
    private String status;

    public CustomEntity(String student_id, String name, LocalDate reservationDate) {
        this.student_id = student_id;
        this.name = name;
        this.reservationDate = reservationDate;
    }
}