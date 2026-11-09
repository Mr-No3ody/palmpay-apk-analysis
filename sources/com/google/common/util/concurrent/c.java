package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableCollection;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22875c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f22873a = i7;
        this.f22874b = obj;
        this.f22875c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22873a) {
            case 0:
                ((AggregateFuture) this.f22874b).lambda$init$1((ImmutableCollection) this.f22875c);
                break;
            default:
                Callables.lambda$threadRenaming$3((Supplier) this.f22874b, (Runnable) this.f22875c);
                break;
        }
    }
}
