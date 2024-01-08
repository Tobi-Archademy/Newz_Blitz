package com.oluwatobi.newz_blitz.database

import androidx.room.TypeConverter
import com.oluwatobi.newz_blitz.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}