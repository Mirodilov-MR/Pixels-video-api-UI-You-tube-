package com.ytp.pixe.screens.videos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ytp.pixe.CategoryAdapter
import com.ytp.pixe.CategoryItem
import com.ytp.pixe.R
import com.ytp.pixe.databinding.VideosBinding
import com.ytp.pixe.pixels.data.video.Video
import com.ytp.pixe.utils.Constants
import com.ytp.pixe.utils.hide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class Videos : Fragment(), CategoryAdapter.CategoryClickListener {

    private lateinit var binding: VideosBinding
    private val viewModel by activityViewModels<VideosViewModel>()
    private val videoAdapter by lazy { VideoAdapter() }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = VideosBinding.inflate(inflater, container, false)
        setViews()
        setObserves()
        return binding.root
    }

    private fun setViews() {
        binding.apply {
            setAdapter()
            viewModel.categoryList.observe(viewLifecycleOwner) { categoryList ->
                val categoryRecyclerView: RecyclerView = binding.categoryRecyclerView
                val categoryAdapter = CategoryAdapter(categoryList, this@Videos)
                categoryRecyclerView.adapter = categoryAdapter
                categoryRecyclerView.layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            }
            btnSearch.setOnClickListener {
                findNavController().navigate(R.id.action_videos_to_searchFragment)
            }

        }

    }

    // Handle category item click
    override fun onCategoryClick(categoryItem: CategoryItem) {
        // Navigate to the SearchFragment and pass the category name as a bundle argument
        val bundle = bundleOf(Constants.KEY_CATEGORY_NAME to categoryItem.name)
        findNavController().navigate(R.id.action_videos_to_searchFragment, bundle)
    }
    private fun setObserves() {
        viewModel.apply {
            // videos
            videos.observe(viewLifecycleOwner) { videos ->
                lifecycleScope.launchWhenStarted {
                    videos.collectLatest { data ->
                        if (data != null) {
                            MainScope().launch {
                                binding.loader.hide()
                            }
                            videoAdapter.submitData(data)
                        }
                    }
                }
            }
        }
    }

    private fun setAdapter() {
        videoAdapter.listener = object : VideoAdapter.VideoListener {
            override fun onClick(video: Video) {
                val data = bundleOf(Constants.KEY_VIDEO_URL to video.video_files.first().link)
                findNavController().navigate(R.id.action_videos_to_videoViewer, data)
            }
        }
        binding.rvVideos.adapter = videoAdapter
    }
}