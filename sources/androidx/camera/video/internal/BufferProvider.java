package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Observable;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public interface BufferProvider<T> extends Observable<b> {
    @NonNull
    ListenableFuture<T> acquireBuffer();
}
