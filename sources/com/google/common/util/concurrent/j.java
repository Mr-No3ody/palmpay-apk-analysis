package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22891a;

    public /* synthetic */ j(int i7) {
        this.f22891a = i7;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f22891a) {
            case 0:
                return new Striped.WeakSafeReadWriteLock();
            case 1:
                return new Striped.PaddedLock();
            case 2:
                return Striped.lambda$lazyWeakLock$0();
            default:
                return new ReentrantReadWriteLock();
        }
    }
}
