package com.example.learnkotlin.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.Adapter.CalendarAdapter
import com.example.learnkotlin.Adapter.EducationListAdapter
import com.example.learnkotlin.Model.Education
import com.example.learnkotlin.R
import com.example.learnkotlin.databinding.FragmentHomeBinding
import com.example.learnkotlin.databinding.FragmentListEducationBinding


class ListEducationFragment : Fragment() {

    private var _binding: FragmentListEducationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentListEducationBinding.inflate(inflater, container, false)
        val data = ArrayList<Education>()
        val education = Education("2022 aralık","özsaygı","nil saim","17-18-24-25 aralık","4 gün","10.00-17.00")
        val education2 = Education("2022 aralık","özsaygı","nil saim","17-18-24-25 aralık","4 gün","10.00-17.00")

        data.add(education)
        data.add(education2)
        data.add(education)
        data.add(education2)
        data.add(education)
        data.add(education2)
        data.add(education)
        data.add(education2)
        data.add(education)
        data.add(education2)
        data.add(education)
        data.add(education2)

        binding.recyclerView.layoutManager =  GridLayoutManager(context,2)
        binding.recyclerView.adapter = EducationListAdapter(data)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}