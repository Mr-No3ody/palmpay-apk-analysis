package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public interface zal {
    ExecutorService zaa(int i7, int i10);

    ExecutorService zab(int i7, ThreadFactory threadFactory, int i10);

    ExecutorService zac(ThreadFactory threadFactory, int i7);
}
