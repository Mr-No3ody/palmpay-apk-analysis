package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class Atomics {
    private Atomics() {
    }

    public static <V> AtomicReference<V> newReference() {
        return new AtomicReference<>();
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(int i7) {
        return new AtomicReferenceArray<>(i7);
    }

    public static <V> AtomicReference<V> newReference(@ParametricNullness V v3) {
        return new AtomicReference<>(v3);
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(E[] eArr) {
        return new AtomicReferenceArray<>(eArr);
    }
}
