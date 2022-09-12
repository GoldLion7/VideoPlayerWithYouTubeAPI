package com.my_app.videoplayer

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my_app.videoplayer.databinding.VideoItemTop10Binding

class VideoAdapterTop10(val listener: VideoAdapter.Listener): RecyclerView.Adapter<VideoAdapterTop10.VideoHolder>()  {

    class VideoHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = VideoItemTop10Binding.bind(item)
        fun bind(video: Video, listener: VideoAdapter.Listener) = with(binding) {
            downloadImage(video.imageId, binding.imageViewTop10 )
            textViewSongNameTop10.text = video.songName
            textViewArtistNameTop10.text = video.artistName.uppercase()
            itemView.setOnClickListener {
                listener.onClickTop100(video)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_item_top10, parent, false)
        return VideoHolder(view)
    }

    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
        holder.bind(videoListStateTop10.videoLisTop10[position], listener)
    }

    override fun getItemCount(): Int {
        return videoListStateTop10.videoLisTop10.size
    }



}