package com.gha.niramaya;

public class DataHolderBMI {
    String TITLE, TITLE_CONTENT;
    int IMAGE;

    public DataHolderBMI(String TITLE, String TITLE_CONTENT, int IMAGE) {
        this.TITLE = TITLE;
        this.TITLE_CONTENT = TITLE_CONTENT;
        this.IMAGE = IMAGE;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getTITLE_CONTENT() {
        return TITLE_CONTENT;
    }

    public void setTITLE_CONTENT(String TITLE_CONTENT) {
        this.TITLE_CONTENT = TITLE_CONTENT;
    }

    public int getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(int IMAGE) {
        this.IMAGE = IMAGE;
    }
}
