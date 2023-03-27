package com.example.newsapplication.ui.db

import androidx.room.TypeConverter
import com.example.newsapplication.ui.models.Source


class Converters {

    @TypeConverter
    fun fromSource(source: com.example.newsapplication.ui.models.Source):String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name,name)
    }
}