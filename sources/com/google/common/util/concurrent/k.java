package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22893b;

    public /* synthetic */ k(int i7, int i10) {
        this.f22892a = i10;
        this.f22893b = i7;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f22892a) {
            case 0:
                return Striped.lambda$semaphore$1(this.f22893b);
            default:
                return Striped.lambda$lazyWeakSemaphore$2(this.f22893b);
        }
    }
}
