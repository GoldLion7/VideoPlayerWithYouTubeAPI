package com.my_app.videoplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my_app.videoplayer.databinding.VideoItemTop100Binding

class VideoAdapter(val listener: Listener): RecyclerView.Adapter<VideoAdapter.VideoHolder>() {


    class VideoHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = VideoItemTop100Binding.bind(item)
        fun bind(video: Video, listener: Listener) = with(binding) {
            downloadImage(video.imageId, binding.imageViewTittleSong)
            textViewSongNameRC.text = video.songName
            textViewArtistNameRC.text = video.artistName.uppercase()
            itemView.setOnClickListener {
                listener.onClickTop100(video)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_item_top100, parent, false)
        return VideoHolder(view)
    }


    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
        holder.bind(videoListState.videoList[position], listener)
    }

    override fun getItemCount(): Int {
        return videoListState.videoList.size
    }

    interface Listener {
        fun onClickTop100(video: Video)
    }


}