package com.example.learnkotlin.Adapter
import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.Model.Education
import com.example.learnkotlin.R
import com.example.learnkotlin.databinding.CalendarItemBinding
import com.example.learnkotlin.databinding.EducationListItemBinding

class EducationListAdapter(private val mList: List<Education>) : RecyclerView.Adapter<EducationListAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.education_list_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        with(holder) {
            // TODO
            binding.educationImage.setImageResource(R.drawable.etkisel_iletisim)
            binding.educationName.text = "Etkisel İletişim"
        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val binding = EducationListItemBinding.bind(ItemView)
    }
}
