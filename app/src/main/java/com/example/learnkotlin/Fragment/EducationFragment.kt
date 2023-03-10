package com.example.learnkotlin.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.learnkotlin.R
import com.example.learnkotlin.databinding.FragmentEducationBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class EducationFragment : Fragment() {

    private var _binding: FragmentEducationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEducationBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.workshopCalendar.setOnClickListener {
            findNavController().navigate(R.id.action_EducationFragment_to_CalendarEducationFragment)
        }
        binding.faceToFaceEducation.setOnClickListener {
            findNavController().navigate(R.id.action_EducationFragment_to_ListEducationFragment)
        }
        binding.onlineEducationButton.setOnClickListener {
            findNavController().navigate(R.id.action_EducationFragment_to_ListEducationFragment)
        }
        binding.consultationsButton.setOnClickListener {
            findNavController().navigate(R.id.action_EducationFragment_to_ConsultingFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}