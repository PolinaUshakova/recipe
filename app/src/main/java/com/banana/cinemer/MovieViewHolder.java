package com.banana.cinemer;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Класс хранит внутренние вьюхи элемента списка.
 */
public class MovieViewHolder extends RecyclerView.ViewHolder {

    View itemView; // контейнер элемента списка
    TextView titleTextView; // текстовое поле для заголовка фильма
    ImageView posterImageView; // ImageView для постера
    TextView rateTextView;

    public MovieViewHolder(View itemView) {
        super(itemView);

        // сохраняем сам контейнер, потому что хотим кликать по нему
        this.itemView = itemView;

        // itemView - это большая вьюха элемента списка, в ней лежит несколько маленьких,
        // которые ниже находим и сохраняем в переменные, чтобы findViewById часто не вызывать
        titleTextView = itemView.findViewById(R.id.title_text_view);
        posterImageView = itemView.findViewById(R.id.poster_image_view);
        rateTextView = itemView.findViewById(R.id.rating_text);
    }

}
