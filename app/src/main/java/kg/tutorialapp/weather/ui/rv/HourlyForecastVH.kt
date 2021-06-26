package kg.tutorialapp.weather.ui.rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kg.tutorialapp.weather.extensions.format
import kg.tutorialapp.weather.models.Constants
import kg.tutorialapp.weather.models.HourlyForeCast
import kotlinx.android.synthetic.main.item_hourly_forecast.view.*
import kotlin.math.roundToInt

class HourlyForecastVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: HourlyForeCast){

        itemView.run {
            tv_time.text = item.date.format("HH:mm")
            item.probability?.let {
                tv_precipitation.text = "${(it *100).roundToInt()} %"
            }
            tv_temp.text = item.temp?.roundToInt().toString()
            Glide.with(itemView.context)
                .load("${Constants.iconUri}${item.weather?.get(0)?.icon}${Constants.iconFormat}")
                .into(iv_weather_icon)

        }
    }
}