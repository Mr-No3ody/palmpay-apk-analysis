package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public interface AudioSource$AudioSourceCallback {
    void onAmplitudeValue(double d2);

    void onError(@NonNull Throwable th);

    void onSilenceStateChanged(boolean z3);

    @VisibleForTesting
    default void onSuspendStateChanged(boolean z3) {
    }
}
