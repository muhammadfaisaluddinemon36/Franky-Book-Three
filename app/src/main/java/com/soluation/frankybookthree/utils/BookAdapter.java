package com.soluation.frankybookthree.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.soluation.frankybookthree.R;
import com.soluation.frankybookthree.model.Book;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private List<Book> bookList;
    private OnBookClickListener listener;

    public BookAdapter(List<Book> bookList, OnBookClickListener listener) {
        this.bookList = bookList;
        this.listener = listener;
    }
    @NonNull
    @Override
    public BookAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item_design,parent,false);
        return new BookViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull BookAdapter.BookViewHolder holder, int position) {
        Book book = bookList.get(position);
        holder.bind(book);
    }
    @Override
    public int getItemCount() {
        return bookList.size();
    }
    public class BookViewHolder extends RecyclerView.ViewHolder {
        private ImageView bookImage;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImage = itemView.findViewById(R.id.iv_book);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(bookList.get(getAdapterPosition()));
                }
            });
        }
        public void bind(Book book) {
            Picasso.get().load(book.getImageUrl()).into(bookImage);
//            Picasso.get().load("https://booksondemand.ma/cdn/shop/products/51DwJ-pSRwL._SX351_BO1_204_203_200_-min.jpg?v=1631701481").into(bookImage);
        }
    }
    public interface OnBookClickListener {
        void onItemClick(Book book);

    }

}
