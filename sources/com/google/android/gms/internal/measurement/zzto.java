package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Callables;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class zzto implements AsyncFunction {
    public static final /* synthetic */ int zza = 0;
    private final List zzb;
    private final Executor zzc;

    private zzto(List list, Executor executor) {
        this.zzb = list;
        this.zzc = executor;
    }

    public static zzto zza(List list, Executor executor) {
        return new zzto(list, executor);
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final /* bridge */ /* synthetic */ ListenableFuture apply(Object obj) throws Exception {
        List list = this.zzb;
        zzth zzthVar = (zzth) obj;
        final int size = list.size();
        final ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zztj) it.next()).zza());
        }
        return Futures.transformAsync(zzthVar.zza(zzxa.zzc(new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zztn
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj2) {
                return this.zza.zzb(arrayList, size, (zzafc) obj2);
            }
        }), MoreExecutors.directExecutor()), zzxa.zzc(new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zztk
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj2) {
                return this.zza.zzc(size, arrayList, obj2);
            }
        }), MoreExecutors.directExecutor());
    }

    public final /* synthetic */ ListenableFuture zzb(final List list, final int i7, final zzafc zzafcVar) {
        return Futures.whenAllComplete(list).callAsync(zzxa.zzb(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zztl
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final /* synthetic */ ListenableFuture call() {
                return this.zza.zzd(zzafcVar, i7, list);
            }
        }), this.zzc);
    }

    public final /* synthetic */ ListenableFuture zzc(int i7, List list, Object obj) {
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            if (((Boolean) Futures.getDone((Future) list.get(i10))).booleanValue()) {
                arrayList.add(((zztj) this.zzb.get(i10)).zzb());
            }
        }
        return Futures.whenAllSucceed(arrayList).call(Callables.returning(null), MoreExecutors.directExecutor());
    }

    public final /* synthetic */ ListenableFuture zzd(zzafc zzafcVar, int i7, List list) {
        ListenableFuture listenableFutureImmediateFuture = Futures.immediateFuture(zzafcVar);
        for (int i10 = 0; i10 < i7; i10++) {
            if (((Boolean) Futures.getDone((Future) list.get(i10))).booleanValue()) {
                final zztj zztjVar = (zztj) this.zzb.get(i10);
                listenableFutureImmediateFuture = Futures.transformAsync(listenableFutureImmediateFuture, zzxa.zzc(new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zztm
                    @Override // com.google.common.util.concurrent.AsyncFunction
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        return zztjVar.zzc();
                    }
                }), MoreExecutors.directExecutor());
            }
        }
        return listenableFutureImmediateFuture;
    }
}
