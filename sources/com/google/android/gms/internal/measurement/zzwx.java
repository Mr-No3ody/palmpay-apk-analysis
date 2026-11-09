package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwx implements AsyncCallable {
    final /* synthetic */ zzws zza;
    final /* synthetic */ AsyncCallable zzb;

    public zzwx(zzws zzwsVar, AsyncCallable asyncCallable) {
        this.zza = zzwsVar;
        this.zzb = asyncCallable;
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public final ListenableFuture call() {
        zzws zzwsVar = this.zza;
        Intrinsics.e(zzwsVar);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVarZzc = zzvy.zzc(zzwqVarZzd, zzwsVar);
        try {
            ListenableFuture listenableFutureCall = this.zzb.call();
            zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
            Intrinsics.checkNotNullExpressionValue(listenableFutureCall, "wrapInTrace(...)");
            return listenableFutureCall;
        } catch (Throwable th) {
            try {
                zzvu.zza(th);
                throw th;
            } catch (Throwable th2) {
                zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
                throw th2;
            }
        }
    }

    public final String toString() {
        AsyncCallable asyncCallable = this.zzb;
        StringBuilder sb2 = new StringBuilder(asyncCallable.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(asyncCallable);
        sb2.append("]");
        return sb2.toString();
    }
}
