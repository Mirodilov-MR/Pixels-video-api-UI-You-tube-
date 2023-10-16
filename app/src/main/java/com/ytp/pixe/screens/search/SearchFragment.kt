package com.ytp.pixe.screens.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.ytp.pixe.R
import com.ytp.pixe.databinding.FragmentSearchBinding
import com.ytp.pixe.pixels.data.video.Video
import com.ytp.pixe.utils.Constants
import com.ytp.pixe.utils.hideKeyboard
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private val viewModel by activityViewModels<SearchViewModel>()
    private val videoAdapter by lazy { SearchAdapter() }

    companion object {
        private const val ARG_CATEGORY_NAME = "category_name"

        fun newInstance(categoryName: String): SearchFragment {
            val fragment = SearchFragment()
            val args = Bundle()
            args.putString(ARG_CATEGORY_NAME, categoryName)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        setViews()
        setObserves()
        return binding.root

    }

    private fun setViews() {
        binding.apply {
            setAdapter()
            appBar.searchField.hint = getString(R.string.info_app_bar_videos)
            appBar.searchField.setOnEditorActionListener { textView, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    val query = textView.text.trim().toString()
                    if (query.isNotEmpty()) {
                        viewModel.search(query)
                    } else {
                        viewModel.getData()
                    }
                    hideKeyboard()
                    true
                } else {
                    false
                }
            }
            val categoryName = arguments?.getString(Constants.KEY_CATEGORY_NAME)
            if (!categoryName.isNullOrEmpty()) {
                viewModel.search(categoryName)
            } else {
                viewModel.getData()
            }
        }
    }

    private fun setObserves() {
        viewModel.apply {
            // videos
            videos.observe(viewLifecycleOwner) { videos ->
                lifecycleScope.launchWhenStarted {
                    videos.collectLatest { data ->
                        if (data != null) {
                            MainScope().launch {
                            }
                            videoAdapter.submitData(data)
                        }

                    }
                }
            }
        }
    }

    private fun setAdapter() {
        videoAdapter.listener = object : SearchAdapter.VideoListener {
            override fun onClick(video: Video) {
                val data = bundleOf(Constants.KEY_VIDEO_URL to video.video_files.first().link)
                findNavController().navigate(R.id.action_searchFragment_to_videoViewer, data)
            }
        }
        binding.rvVideos.adapter = videoAdapter
    }
}