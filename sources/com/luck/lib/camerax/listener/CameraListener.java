package com.luck.lib.camerax.listener;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface CameraListener {
    void onError(int i7, String str, Throwable th);

    void onPictureSuccess(@NonNull String str);

    void onRecordSuccess(@NonNull String str);
}
