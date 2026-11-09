package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    public static void clear(Buffer b7) {
        b7.clear();
    }

    public static void flip(Buffer b7) {
        b7.flip();
    }

    public static void limit(Buffer b7, int limit) {
        b7.limit(limit);
    }

    public static void mark(Buffer b7) {
        b7.mark();
    }

    public static void position(Buffer b7, int position) {
        b7.position(position);
    }

    public static void reset(Buffer b7) {
        b7.reset();
    }
}
