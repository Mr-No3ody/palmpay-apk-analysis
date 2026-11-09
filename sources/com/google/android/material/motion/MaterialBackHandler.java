package com.google.android.material.motion;

import androidx.activity.C0812c;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(@NonNull C0812c c0812c);

    void updateBackProgress(@NonNull C0812c c0812c);
}
