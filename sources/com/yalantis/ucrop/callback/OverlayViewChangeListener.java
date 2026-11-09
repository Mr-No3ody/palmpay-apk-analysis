package com.yalantis.ucrop.callback;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public interface OverlayViewChangeListener {
    void onCropRectUpdated(RectF rectF);

    void postTranslate(float f10, float f11);
}
