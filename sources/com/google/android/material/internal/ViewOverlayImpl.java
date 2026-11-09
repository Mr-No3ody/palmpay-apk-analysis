package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
@Deprecated
public interface ViewOverlayImpl {
    void add(@NonNull Drawable drawable);

    void remove(@NonNull Drawable drawable);
}
