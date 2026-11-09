package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class NullnessCasts {
    private NullnessCasts() {
    }

    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(@CheckForNull T t) {
        return t;
    }

    @ParametricNullness
    public static <T> T unsafeNull() {
        return null;
    }
}
