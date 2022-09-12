package com.my_app.videoplayer

import android.widget.ImageView
import com.squareup.picasso.Picasso


data class Video(val imageId: String, val songName: String, val artistName: String, val videoID: String)


object videoListState {
    val videoList = listOf<Video>(
        Video("https://img.youtube.com/vi/D9G1VOjN_84/mqdefault.jpg","Enemy","IMAGINE DRAGON", "D9G1VOjN_84"),
        Video("https://img.youtube.com/vi/CBDT9LkrrVc/mqdefault.jpg","My Life","IMAGINE DRAGON", "CBDT9LkrrVc"),
        Video("https://img.youtube.com/vi/yUbTU1ojKho/mqdefault.jpg","Lonely","IMAGINE DRAGON", "yUbTU1ojKho"),
        Video("https://img.youtube.com/vi/Y2NkuFIlLEo/mqdefault.jpg","Wrecked","IMAGINE DRAGON", "Y2NkuFIlLEo"),
        Video("https://img.youtube.com/vi/suHvGQYTAG0/mqdefault.jpg","Monday","IMAGINE DRAGON", "suHvGQYTAG0"),
        Video("https://img.youtube.com/vi/ywhcvOy16_E/mqdefault.jpg","#1","IMAGINE DRAGON", "ywhcvOy16_E"),
        Video("https://img.youtube.com/vi/7CgQEvO4DDk/mqdefault.jpg","Easy Come Easy Go","IMAGINE DRAGON", "7CgQEvO4DDk"),
        Video("https://img.youtube.com/vi/zCEA-tm0tmQ/mqdefault.jpg","Giants","IMAGINE DRAGON", "zCEA-tm0tmQ"),
        Video("https://img.youtube.com/vi/W_yRODJ6kfc/mqdefault.jpg","It's Ok","IMAGINE DRAGON", "W_yRODJ6kfc"),
        Video("https://img.youtube.com/vi/7mr8go10ICQ/mqdefault.jpg","Dull Knives","IMAGINE DRAGON", "7mr8go10ICQ"),
        Video("https://img.youtube.com/vi/k3zimSRKqNw/mqdefault.jpg","Follow You","IMAGINE DRAGON", "k3zimSRKqNw"),
        Video("https://img.youtube.com/vi/89xtgEk9jTo/mqdefault.jpg","Cutthroat","IMAGINE DRAGON", "89xtgEk9jTo"),
        Video("https://img.youtube.com/vi/wJt2qKPZpsk/mqdefault.jpg","No Time For Toxic People","IMAGINE DRAGON", "wJt2qKPZpsk"),
        Video("https://img.youtube.com/vi/NzImKCeQnX0/mqdefault.jpg","One Day","IMAGINE DRAGON", "NzImKCeQnX0"),
        Video("https://img.youtube.com/vi/TO-_3tck2tg/mqdefault.jpg","Bones","IMAGINE DRAGON", "TO-_3tck2tg"),
        Video("https://img.youtube.com/vi/f-HjBtN4q6o/mqdefault.jpg","Symphony","IMAGINE DRAGON", "f-HjBtN4q6o"),
        Video("https://img.youtube.com/vi/EJy7K5AWutM/mqdefault.jpg","I Don't Like Myself","IMAGINE DRAGON", "EJy7K5AWutM"),
        Video("https://img.youtube.com/vi/so23_c7lXno/mqdefault.jpg","Blur","IMAGINE DRAGON", "so23_c7lXno"),
        Video("https://img.youtube.com/vi/ZQNSke_9EJ8/mqdefault.jpg","Higher Ground","IMAGINE DRAGON", "ZQNSke_9EJ8"),
        Video("https://img.youtube.com/vi/kw07O6yFka4/mqdefault.jpg","Crushed","IMAGINE DRAGON", "kw07O6yFka4"),
        Video("https://img.youtube.com/vi/mt-qhy4ItfM/mqdefault.jpg","Take It Easy","IMAGINE DRAGON", "mt-qhy4ItfM"),
        Video("https://img.youtube.com/vi/anLxLPzgIG4/mqdefault.jpg","Waves","IMAGINE DRAGON", "anLxLPzgIG4"),
        Video("https://img.youtube.com/vi/-hyfscXeOHY/mqdefault.jpg","I'm Happy","IMAGINE DRAGON", "-hyfscXeOHY"),
        Video("https://img.youtube.com/vi/5UwEq-OELmY/mqdefault.jpg","Ferris Wheel","IMAGINE DRAGON", "5UwEq-OELmY"),
        Video("https://img.youtube.com/vi/3CjIx9K3snI/mqdefault.jpg","Peace of Mind","IMAGINE DRAGON", "3CjIx9K3snI"),
        Video("https://img.youtube.com/vi/ogEhe_v3UwM/mqdefault.jpg","Sirens","IMAGINE DRAGON", "CBDT9LkrrVc"),
        Video("https://img.youtube.com/vi/3pyFAx7k-dc/mqdefault.jpg","Tied","IMAGINE DRAGON", "3pyFAx7k-dc"),
        Video("https://img.youtube.com/vi/FIhonBl-_pM/mqdefault.jpg","Younger","IMAGINE DRAGON", "FIhonBl-_pM"),
        Video("https://img.youtube.com/vi/2uQtt5fdmxU/mqdefault.jpg","I Wish","IMAGINE DRAGON", "2uQtt5fdmxU"),
    )
}

object videoListStateTop10 {
    val videoLisTop10 = listOf<Video>(
        Video("https://img.youtube.com/vi/D83kYtgLZpI/sddefault.jpg","Дежавю","АРТЕМ ПИВОВАРОВ", "D83kYtgLZpI"),
        Video("https://img.youtube.com/vi/CBDT9LkrrVc/sddefault.jpg","ВСЕПРОБАЧАТИ","Dan Balan feat.Oksana Mukha", "CBDT9LkrrVc"),
        Video("https://img.youtube.com/vi/02ALB3jPDxs/sddefault.jpg","Холодок","Мэвл", "02ALB3jPDxs"),
        Video("https://img.youtube.com/vi/5p-IJhnyQMM/sddefault.jpg","Зорі","KALUSHa", "5p-IJhnyQMM"),
        Video("https://img.youtube.com/vi/YDqQ9W0_BBM/sddefault.jpg","Кобра","THE HARDKISS feat. MONATIK", "YDqQ9W0_BBM"),
        Video("https://img.youtube.com/vi/ZSk_yj2eN1E/sddefault.jpg","Плакала","KAZKA", "ZSk_yj2eN1E"),
        Video("https://img.youtube.com/vi/Yh3RPYMt-ik/sddefault.jpg","Звичка","ZOZULYA", "Yh3RPYMt-ik"),
        Video("https://img.youtube.com/vi/B9gvM_-WYwo/sddefault.jpg","Кіно","Антитіла", "B9gvM_-WYwo"),
        Video("https://img.youtube.com/vi/lyEgjIts-wc/sddefault.jpg","Тіпок","KALUSH", "lyEgjIts-wc"),
        Video("https://img.youtube.com/vi/O3nvGYc1UEg/sddefault.jpg","Мріяла","Юлія Думанська", "O3nvGYc1UEg"),


    )
}

fun downloadImage (url: String, imageView: ImageView) {
        Picasso.get().load(url).into(imageView)
}
