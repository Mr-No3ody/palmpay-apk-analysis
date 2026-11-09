package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
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

    public static void mark(Buffer buffer) {
        buffer.mark();
    }

    public static void position(Buffer buffer, int i7) {
        buffer.position(i7);
    }

    public static void reset(Buffer buffer) {
        buffer.reset();
    }
}
