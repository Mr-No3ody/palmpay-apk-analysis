package com.microsoft.codepush.react;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

/* JADX INFO: loaded from: classes3.dex */
class DownloadProgress {
    private long mReceivedBytes;
    private long mTotalBytes;

    public DownloadProgress(long j6, long j10) {
        this.mTotalBytes = j6;
        this.mReceivedBytes = j10;
    }

    public WritableMap createWritableMap() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        long j6 = this.mTotalBytes;
        if (j6 < 2147483647L) {
            writableNativeMap.putInt("totalBytes", (int) j6);
            writableNativeMap.putInt("receivedBytes", (int) this.mReceivedBytes);
            return writableNativeMap;
        }
        writableNativeMap.putDouble("totalBytes", j6);
        writableNativeMap.putDouble("receivedBytes", this.mReceivedBytes);
        return writableNativeMap;
    }

    public boolean isCompleted() {
        return this.mTotalBytes == this.mReceivedBytes;
    }
}
