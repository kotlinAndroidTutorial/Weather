package kg.tutorialapp.weather.ui.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.tutorialapp.weather.R
import kg.tutorialapp.weather.models.HourlyForeCast

class HourlyForecastAdapter: RecyclerView.Adapter<HourlyForecastVH>(){

    private val items = arrayListOf<HourlyForeCast>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyForecastVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hourly_forecast,parent,false)
        return HourlyForecastVH(view)
    }

    override fun getItemCount()= items.count()


    override fun onBindViewHolder(holder: HourlyForecastVH, position: Int) {
        holder.bind(items[position])
    }

    fun setItems(newItems: List<HourlyForeCast>){
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }


}