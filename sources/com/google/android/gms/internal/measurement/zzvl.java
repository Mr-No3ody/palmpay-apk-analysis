package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzvl extends AbstractFuture {
    private final int zza;

    public zzvl(int i7) {
        this.zza = i7;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final boolean setFuture(ListenableFuture listenableFuture) {
        return super.setFuture(listenableFuture);
    }

    public final /* synthetic */ int zza() {
        return this.zza;
    }
}
