package androidx.camera.video.internal.audio;

import E.AbstractC0210o;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
interface AudioStreamFactory {
    @NonNull
    AudioStream create(@NonNull a aVar, @Nullable Context context) throws AbstractC0210o;
}
