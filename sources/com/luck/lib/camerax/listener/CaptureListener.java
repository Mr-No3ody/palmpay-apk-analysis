package com.luck.lib.camerax.listener;

/* JADX INFO: loaded from: classes3.dex */
public interface CaptureListener {
    void changeTime(long j6);

    void recordEnd(long j6);

    void recordError();

    void recordShort(long j6);

    void recordStart();

    void recordZoom(float f10);

    void takePictures();
}
