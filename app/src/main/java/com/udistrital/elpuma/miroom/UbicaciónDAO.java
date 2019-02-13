package com.udistrital.elpuma.miroom;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UbicaciónDAO {
    @Insert
    public void insertUbicación (Ubicacion miUbicación);
}
