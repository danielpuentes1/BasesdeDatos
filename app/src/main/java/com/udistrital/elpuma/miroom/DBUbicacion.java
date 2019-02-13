package com.udistrital.elpuma.miroom;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database (entities = Ubicacion.class ,version = 1)
public abstract class DBUbicacion extends RoomDatabase {
    public abstract UbicaciónDAO UbicacionDao();
}