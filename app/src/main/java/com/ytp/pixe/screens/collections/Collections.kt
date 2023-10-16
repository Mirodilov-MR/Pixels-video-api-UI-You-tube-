package com.ytp.pixe.screens.collections


import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ytp.pixe.databinding.CollectionsBinding
import java.util.*


class Collections : Fragment() {
    private lateinit var binding: CollectionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CollectionsBinding.inflate(inflater, container, false)
        binding.apply {
//    imageView6.setOnClickListener {
//        findNavController().navigate(R.id.action_videos_to_searchFragment)
//    }
            btnUzbek.setOnClickListener {
                changeLanguage("uz")
                Toast.makeText(context, "Language changed to Uzbek", Toast.LENGTH_SHORT).show()
            }
            btnEnglish.setOnClickListener {
                changeLanguage("en")
                Toast.makeText(context, "Language changed to English", Toast.LENGTH_SHORT).show()
            }
            btnRussian.setOnClickListener {
                changeLanguage("ru")
                Toast.makeText(context, "Language changed to Russian", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }
    private fun changeLanguage(LanguageCode: String) {
        val locale = Locale(LanguageCode)
        Locale.setDefault(locale)

        val config = Configuration()
        config.locale = locale
        val context: Context = requireActivity().applicationContext
        context.resources.updateConfiguration(config, context.resources.displayMetrics)
        requireActivity().recreate()
    }

}