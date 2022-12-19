package com.example.learnkotlin.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.Adapter.CalendarAdapter
import com.example.learnkotlin.Model.Education
import com.example.learnkotlin.databinding.FragmentCalendarEducationsBinding

class CalendarEducationsFragment : Fragment() {

    private var _binding: FragmentCalendarEducationsBinding? = null
    private val binding get() = _binding!!
    private var adapter: CalendarAdapter? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCalendarEducationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = ArrayList<Education>()
        val education = Education("2022 aralık","özsaygı","nil saim","17-18-24-25 aralık","4 gün","10.00-17.00")
        val education2 = Education("2022 aralık","özsaygı","nil saim","17-18-24-25 aralık","4 gün","10.00-17.00")

        data.add(education)
        data.add(education2)
        binding.recylerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
        binding.recylerView.adapter = CalendarAdapter(data)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}