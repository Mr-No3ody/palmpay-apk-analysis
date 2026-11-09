package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface EncoderCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f14646a = new i();

    void onEncodeError(@NonNull f fVar);

    default void onEncodePaused() {
    }

    void onEncodeStart();

    void onEncodeStop();

    void onEncodedData(@NonNull EncodedData encodedData);

    void onOutputConfigUpdate(@NonNull OutputConfig outputConfig);
}
