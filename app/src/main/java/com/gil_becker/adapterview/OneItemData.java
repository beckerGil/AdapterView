package com.gil_becker.adapterview;

/**
 * Created by Gil-B on 14/01/2017.
 */

public class OneItemData {
    private int imageId;
    private String title;
    private String subTitle;

    public OneItemData(int imageId, String title, String subTitle) {
        this.imageId = imageId;
        this.title = title;
        this.subTitle = subTitle;
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getSubTitle() {
        return subTitle;
    }
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + "\n" + subTitle;
    }

}
