package com.facebook.drawee.interfaces;

import android.graphics.drawable.Drawable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes.dex */
@ThreadSafe
public interface SettableDraweeHierarchy extends DraweeHierarchy {
    void reset();

    void setControllerOverlay(Drawable drawable);

    void setFailure(Throwable th);

    void setImage(Drawable drawable, float f10, boolean z3);

    void setProgress(float f10, boolean z3);

    void setRetry(Throwable th);
}
