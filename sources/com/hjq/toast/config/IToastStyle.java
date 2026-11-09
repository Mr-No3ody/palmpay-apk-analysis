package com.hjq.toast.config;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface IToastStyle<V extends View> {
    V createView(Context context);

    default int getGravity() {
        return 17;
    }

    default float getHorizontalMargin() {
        return 0.0f;
    }

    default float getVerticalMargin() {
        return 0.0f;
    }

    default int getXOffset() {
        return 0;
    }

    default int getYOffset() {
        return 0;
    }
}
