package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface CaptureStage {
    @NonNull
    T getCaptureConfig();

    int getId();
}
