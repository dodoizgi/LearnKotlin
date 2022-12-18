package com.example.learnkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.denzcoskun.imageslider.models.SlideModel
import com.example.learnkotlin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>() // Create image list

        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://kuraldisi.com/wp-content/uploads/2022/12/bilincli-ebeveynin-disiplin-anlayisi-slider.jpg"))
        imageList.add(SlideModel("https://kuraldisi.com/wp-content/uploads/2022/12/kuraldisi-slider-subat-kitabi-cocuk-3.jpg"))
        imageList.add(SlideModel("https://kuraldisi.com/wp-content/uploads/2022/11/Amac_Belirlemek_Workshop.png"))

        binding.imageSlider.setImageList(imageList)

        binding.workshopButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_EducationFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}