package com.soluation.frankybookthree.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;
import com.soluation.frankybookthree.R;
import com.soluation.frankybookthree.model.Book;
import com.soluation.frankybookthree.utils.BaseActivity;
import com.soluation.frankybookthree.utils.Constant;

public class InAppBrowser extends BaseActivity {
    private Book book;
    private WebView webView;
    private MaterialToolbar materialToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_in_app_browser);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setupToolbar(R.id.materialToolbar);
        webView = findViewById(R.id.web_view);
        book = (Book) getIntent().getSerializableExtra(Constant.BOOK);

//        if (book.getPdfurl().isEmpty()){
//            dialog.setMessage("Notice Not Found!");
//            dialog.setCancelable(true);
//        }else {
//            dialog.setMessage("Please Wait...");
//            Handler handler = new Handler(Looper.getMainLooper());
//            handler.postDelayed(new Runnable() {


//        public void run() {
//                    dialog.dismiss();
                    webView.setWebViewClient(new WebViewClient());
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl(book.getPdfUrl());
                }
            };

