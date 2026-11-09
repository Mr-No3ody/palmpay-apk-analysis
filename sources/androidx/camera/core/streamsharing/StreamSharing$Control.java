package androidx.camera.core.streamsharing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
interface StreamSharing$Control {
    @NonNull
    ListenableFuture<Void> jpegSnapshot(@IntRange(from = 0, to = 100) int i7, @IntRange(from = 0, to = 359) int i10);
}
