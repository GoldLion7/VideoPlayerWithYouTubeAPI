package com.my_app.videoplayer

import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import com.my_app.videoplayer.databinding.ActivityMainBinding
import com.google.android.youtube.player.YouTubeIntents;
import java.io.IOException

class MainActivity : AppCompatActivity(), VideoAdapter.Listener {

    lateinit var binding: ActivityMainBinding
    private val adapter = VideoAdapter(this)
    private val adapterTop10 = VideoAdapterTop10(this)
    private var mediaPlayer: MediaPlayer? = null
    private var videoId = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()




    }



    private fun init(){

        binding.apply {
            recyclerViewTop100.layoutManager = GridLayoutManager(this@MainActivity, 3)
            recyclerViewTop100.adapter = adapter
            recyclerViewTop10.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false )
            recyclerViewTop10.adapter = adapterTop10

        }
    }

    override fun onClickTop100(video: Video) {
        binding.constraintLayoutBottomBar.visibility = android.view.View.VISIBLE
        downloadImage(video.imageId, binding.imageTitleVideoCurrent)
        binding.textViewArtistName.text = video.artistName
        binding.textViewSongName.text = video.songName
        videoId = video.videoID
    }




    fun onClickVideoPlayer(video: View) {
        val intent = Intent(this, ActivityVideoPlayer::class.java)
        intent.putExtra("videoId", videoId)
        intent.putExtra("songName", binding.textViewSongName.text)
        intent.putExtra("ArtistName", binding.textViewArtistName.text)
        startActivity(intent)
    }






}