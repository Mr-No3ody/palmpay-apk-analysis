package com.palmpay.lib.scanplus.bean;

/* JADX INFO: loaded from: classes3.dex */
public class CameraDataBean {
    private byte[] data;
    private int height;
    private int width;

    public CameraDataBean(byte[] bArr, int i7, int i10) {
        this.data = bArr;
        this.width = i7;
        this.height = i10;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setHeight(int i7) {
        this.height = i7;
    }

    public void setWidth(int i7) {
        this.width = i7;
    }
}
