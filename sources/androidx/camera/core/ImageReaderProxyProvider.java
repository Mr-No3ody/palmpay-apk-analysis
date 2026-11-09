package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39801b})
public interface ImageReaderProxyProvider {
    @NonNull
    ImageReaderProxy newInstance(int i7, int i10, int i11, int i12, long j6);
}
