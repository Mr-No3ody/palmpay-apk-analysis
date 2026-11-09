package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.P0;

/* JADX INFO: loaded from: classes.dex */
public interface EncoderConfig {
    @NonNull
    P0 getInputTimebase();

    @NonNull
    String getMimeType();

    int getProfile();

    @NonNull
    MediaFormat toMediaFormat() throws x;
}
