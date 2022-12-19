package com.example.learnkotlin.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.Model.Education
import com.example.learnkotlin.R
import com.example.learnkotlin.databinding.CalendarItemBinding

class CalendarAdapter(private val mList: List<Education>) : RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.calendar_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        with(holder) {
            // TODO
            binding.startTime.text = "10.00"
            binding.dayText.text = "Saturday"
            binding.topCalendarText.text = "17 December"
            binding.countDay.text = "4 Day"
            binding.nameText.text = "Amaç Belirlemek ve İnisiyatif Alabilmek"
            binding.teacherText.text = "EĞİTMENLER: Nil Gün, Saim Koç"
            binding.dateText.text = "EĞİTİM TARİHİ: 17 – 18 – 24 – 25  Aralık 2022"
            binding.hourText.text = "10.00 - 17.00"
        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val binding = CalendarItemBinding.bind(ItemView)
    }
}
