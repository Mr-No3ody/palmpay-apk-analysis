package com.yalantis.ucrop.callback;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface BitmapCropCallback {
    void onBitmapCropped(@NonNull Uri uri, int i7, int i10, int i11, int i12);

    void onCropFailure(@NonNull Throwable th);
}
