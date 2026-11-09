package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
interface LongAddable {
    void add(long j6);

    void increment();

    long sum();
}
