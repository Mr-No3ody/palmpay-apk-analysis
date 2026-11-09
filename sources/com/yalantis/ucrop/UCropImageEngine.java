package com.yalantis.ucrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public interface UCropImageEngine {

    public interface OnCallbackListener<T> {
        void onCall(T t);
    }

    void loadImage(Context context, Uri uri, int i7, int i10, OnCallbackListener<Bitmap> onCallbackListener);

    void loadImage(Context context, String str, ImageView imageView);
}
