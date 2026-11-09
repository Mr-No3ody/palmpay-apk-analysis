package com.palmpay.lib.scanplus.bean;

/* JADX INFO: loaded from: classes3.dex */
public class CodeData {
    private int[] data;
    private int height;
    private int width;

    public CodeData(int[] iArr, int i7, int i10) {
        this.data = iArr;
        this.width = i7;
        this.height = i10;
    }

    public int[] getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setData(int[] iArr) {
        this.data = iArr;
    }

    public void setHeight(int i7) {
        this.height = i7;
    }

    public void setWidth(int i7) {
        this.width = i7;
    }
}
