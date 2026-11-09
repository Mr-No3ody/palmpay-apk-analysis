package com.dylanvann.fastimage;

/* JADX INFO: loaded from: classes.dex */
public interface FastImageProgressListener {
    float getGranularityPercentage();

    void onProgress(String str, long j6, long j10);
}
