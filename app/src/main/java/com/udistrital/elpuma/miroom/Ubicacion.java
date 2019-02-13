package com.udistrital.elpuma.miroom;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity

public class Ubicacion {
    @PrimaryKey
 private int id;
 private int salon;
 private String ubicación;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }
}
