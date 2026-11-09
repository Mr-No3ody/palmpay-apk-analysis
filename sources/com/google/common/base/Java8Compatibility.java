package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int i7) {
        buffer.limit(i7);
    }

    public static void position(Buffer buffer, int i7) {
        buffer.position(i7);
    }
}
