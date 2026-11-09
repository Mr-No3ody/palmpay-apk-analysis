package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(@CheckForNull Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }
}
