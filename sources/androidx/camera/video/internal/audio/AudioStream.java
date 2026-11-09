package androidx.camera.video.internal.audio;

import E.AbstractC0210o;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface AudioStream {

    public interface AudioStreamCallback {
        default void onSilenceStateChanged(boolean z3) {
        }
    }

    @NonNull
    c read(@NonNull ByteBuffer byteBuffer);

    void release();

    void setCallback(@Nullable AudioStreamCallback audioStreamCallback, @Nullable Executor executor);

    void start() throws IllegalStateException, AbstractC0210o;

    void stop() throws IllegalStateException;
}
