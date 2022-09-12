package com.my_app.videoplayer

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener
import com.my_app.videoplayer.databinding.ActivityVideoPlayerBinding


class ActivityVideoPlayer : YouTubeBaseActivity() {

    private var seekTime = 0
    private var mPlayer: YouTubePlayer? = null
    private var mSeekBar: SeekBar? = null
    private lateinit var binding: ActivityVideoPlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityVideoPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val videoId = intent.getStringExtra("videoId")
        val songName = intent.getStringExtra("songName")
        val artistName = intent.getStringExtra("ArtistName")
        binding.apply {
            textViewSongNameTop10.text = songName
            textViewArtistNameTop10.text = artistName
        }

        if (videoId != null) {
            initPlayer(videoId)
        }

        mSeekBar = binding.seekBarPlayingVideo




    }




    private fun initPlayer(videoIdYT: String) {
        binding.youTubePlayer.initialize(getString(R.string.GOOGLE_API_KEY), object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                youtubeplayer: YouTubePlayer?,
                p2: Boolean
            ) {
                youtubeplayer?.setPlaybackEventListener(playbackEventListener)
                youtubeplayer?.loadVideo(videoIdYT, seekTime)


            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext, "error occured", Toast.LENGTH_LONG).show()
            }

        })


    }


    private val playbackEventListener = object: PlaybackEventListener {
        override fun onSeekTo(p0: Int) {
        }

        override fun onBuffering(p0: Boolean) {
        }

        override fun onPlaying() {

        }

        override fun onStopped() {

        }

        override fun onPaused() {

        }
    }


    fun onClickToMainMenu(view: View) {
        finish()
    }

    fun onClicktoPause(view: View) {

        binding.imageViewBtPause.visibility = android.view.View.INVISIBLE
        binding.imageViewBtPlay.visibility = android.view.View.VISIBLE
    }

    fun onClickPlay(view: View) {
        binding.imageViewBtPause.visibility = android.view.View.VISIBLE
        binding.imageViewBtPlay.visibility = android.view.View.INVISIBLE
    }



}