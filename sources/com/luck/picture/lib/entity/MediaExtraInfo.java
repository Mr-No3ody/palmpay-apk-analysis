package com.luck.picture.lib.entity;

import C0.G;

/* JADX INFO: loaded from: classes3.dex */
public class MediaExtraInfo {
    private long duration;
    private int height;
    private String orientation;
    private String videoThumbnail;
    private int width;

    public long getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getVideoThumbnail() {
        return this.videoThumbnail;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDuration(long j6) {
        this.duration = j6;
    }

    public void setHeight(int i7) {
        this.height = i7;
    }

    public void setOrientation(String str) {
        this.orientation = str;
    }

    public void setVideoThumbnail(String str) {
        this.videoThumbnail = str;
    }

    public void setWidth(int i7) {
        this.width = i7;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediaExtraInfo{videoThumbnail='");
        sb2.append(this.videoThumbnail);
        sb2.append("', width=");
        sb2.append(this.width);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", orientation='");
        return G.r(sb2, this.orientation, "'}");
    }
}
