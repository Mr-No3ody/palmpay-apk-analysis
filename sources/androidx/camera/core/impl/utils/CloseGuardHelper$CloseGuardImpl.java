package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
interface CloseGuardHelper$CloseGuardImpl {
    void close();

    void open(@NonNull String str);

    void warnIfOpen();
}
