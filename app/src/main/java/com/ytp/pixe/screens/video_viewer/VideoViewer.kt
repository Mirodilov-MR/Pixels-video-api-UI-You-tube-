package com.ytp.pixe.screens.video_viewer

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.ytp.pixe.R
import com.ytp.pixe.databinding.VideoViewerBinding
import com.ytp.pixe.utils.Constants

class VideoViewer : Fragment() {
    private lateinit var binding: VideoViewerBinding
    private var likeSelected = false
    private var dislikeSelected = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = VideoViewerBinding.inflate(inflater, container, false)
        setViews()
        initVideo()
        likes()
        buttons()
        return binding.root
    }

    private fun likes() {
        binding.apply {
            btnLike.setOnClickListener {
                likeSelected = !likeSelected
                if (likeSelected) {
                    btnLike.setImageResource(R.drawable.like_black)
                    btnDislike.setImageResource(R.drawable.dislike) // Reset the dislike icon
                } else {
                    btnLike.setImageResource(R.drawable.like)
                }
            }
            btnDislike.setOnClickListener {
                dislikeSelected = !dislikeSelected
                if (dislikeSelected) {
                    btnDislike.setImageResource(R.drawable.dislike_black)
                    btnLike.setImageResource(R.drawable.like) // Reset the like icon
                } else {
                    btnDislike.setImageResource(R.drawable.dislike)
                }
            }
        }
    }

    private fun buttons() {
        binding.apply {
            btnShare.setOnClickListener {
                val videoUrl = getVideoUrl()
                if (videoUrl.isNotEmpty()) {
                    val sharingIntent = Intent(Intent.ACTION_SEND)
                    sharingIntent.type = "text/plain"
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, videoUrl)
                    val shareSubject = "Your Subject Here"
                    sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject)
                    startActivity(Intent.createChooser(sharingIntent, "Share using"))
                } else {
                    Toast.makeText(context, "Video URL not available", Toast.LENGTH_SHORT).show()
                }
            }


            btnClip.setOnClickListener {
                Toast.makeText(context, "Clip", Toast.LENGTH_SHORT).show()
            }

            btnSubscribe.setOnClickListener {
                Toast.makeText(context, "Subscribed", Toast.LENGTH_SHORT).show()
            }

            btnDownload.setOnClickListener {
                Toast.makeText(context, "Downloading", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setViews() {
        binding.apply {
            // back button
            btnBack.setOnClickListener { findNavController().navigateUp() }

        }
    }

    private fun initVideo() {
        val player = ExoPlayer.Builder(requireContext()).build()
        binding.viewer.player = player
        val mediaItem = MediaItem.fromUri(getVideoUrl())
        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()
    }

    private fun getVideoUrl() = try {
        arguments?.getString(Constants.KEY_VIDEO_URL) ?: ""
    } catch (ex: Exception) {
        ""
    }
}