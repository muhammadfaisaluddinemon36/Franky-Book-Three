package com.soluation.frankybookthree.model;

import java.io.Serializable;

public class Book implements Serializable {
private String pdfUrl, imageUrl;

    public Book(String pdfUrl, String image) {
        this.pdfUrl = pdfUrl;
        this.imageUrl = image;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImage(String image) {
        this.imageUrl = image;
    }
}
