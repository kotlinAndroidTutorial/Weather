package kg.tutorialapp.weather.storage

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kg.tutorialapp.weather.models.CurrentForeCast
import kg.tutorialapp.weather.models.ForeCast

class ModelsConverter {

    @TypeConverter
    fun fromCurrentForeCastToJson(forecast: CurrentForeCast?): String? =
        Gson().toJson(forecast)

    @TypeConverter
    fun fromJsonToCurrentForeCast(json: String?): CurrentForeCast? =
        Gson().fromJson(json, object: TypeToken<CurrentForeCast>() {}.type)
}