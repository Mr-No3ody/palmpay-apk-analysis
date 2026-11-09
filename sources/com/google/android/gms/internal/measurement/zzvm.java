package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvm {
    private final zzvg zza;
    private final AtomicLong zzb = new AtomicLong(zzi(Integer.MIN_VALUE, Integer.MIN_VALUE));
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(null);
    private final Executor zze = MoreExecutors.newSequentialExecutor(MoreExecutors.directExecutor());
    private final SettableFuture zzf;

    public zzvm(AsyncCallable asyncCallable, Executor executor) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.zzf = settableFutureCreate;
        zzvg zzvgVar = new zzvg(asyncCallable, executor);
        this.zza = zzvgVar;
        settableFutureCreate.addListener(zzvgVar, MoreExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture zzd(int i7) {
        Executor executorZzb;
        AtomicLong atomicLong = this.zzb;
        if (((int) (atomicLong.get() >>> 32)) > i7) {
            return Futures.immediateCancelledFuture();
        }
        zzvl zzvlVar = new zzvl(i7);
        while (true) {
            AtomicReference atomicReference = this.zzc;
            zzvl zzvlVar2 = (zzvl) atomicReference.get();
            if (zzvlVar2 != null && zzvlVar2.zza() > i7) {
                return Futures.immediateCancelledFuture();
            }
            do {
                if (atomicReference.compareAndSet(zzvlVar2, zzvlVar)) {
                    if (((int) (atomicLong.get() >>> 32)) > i7) {
                        zzvlVar.cancel(true);
                        while (!atomicReference.compareAndSet(zzvlVar, null)) {
                            if (atomicReference.get() != zzvlVar) {
                                return zzvlVar;
                            }
                        }
                        return zzvlVar;
                    }
                    zzvg zzvgVar = this.zza;
                    AsyncCallable asyncCallableZza = zzvgVar.zza();
                    if (asyncCallableZza == null || (executorZzb = zzvgVar.zzb()) == null) {
                        zzvlVar.setFuture(this.zzf);
                        return zzvlVar;
                    }
                    zzvlVar.setFuture(Futures.submitAsync(zzxa.zzb(asyncCallableZza), executorZzb));
                    return zzvlVar;
                }
            } while (atomicReference.get() == zzvlVar2);
        }
    }

    private static long zzi(int i7, int i10) {
        return (((long) i10) & 4294967295L) | (i7 << 32);
    }

    public final ListenableFuture zza() {
        AtomicLong atomicLong;
        long j6;
        final int i7;
        SettableFuture settableFuture = this.zzf;
        if (settableFuture.isDone()) {
            return settableFuture;
        }
        do {
            atomicLong = this.zzb;
            j6 = atomicLong.get();
            i7 = (int) (j6 >>> 32);
        } while (!atomicLong.compareAndSet(j6, zzi(i7, ((int) j6) + 1)));
        AtomicReference atomicReference = this.zzd;
        final SettableFuture settableFutureCreate = SettableFuture.create();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(settableFutureCreate);
        settableFutureCreate.setFuture(listenableFuture == null ? Futures.submitAsync(zzxa.zzb(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzvi
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final /* synthetic */ ListenableFuture call() {
                return this.zza.zzd(i7);
            }
        }), MoreExecutors.directExecutor()) : Futures.catchingAsync(listenableFuture, Throwable.class, zzxa.zzc(new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzvh
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzc(i7, (Throwable) obj);
            }
        }), this.zze));
        final zzvk zzvkVar = new zzvk(this, i7, null);
        settableFutureCreate.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzvj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(settableFutureCreate, zzvkVar);
            }
        }, MoreExecutors.directExecutor());
        return zzvkVar;
    }

    public final /* synthetic */ void zzb(SettableFuture settableFuture, zzvk zzvkVar) {
        try {
            Object done = Futures.getDone(settableFuture);
            SettableFuture settableFuture2 = this.zzf;
            settableFuture2.set(done);
            zzvkVar.setFuture(settableFuture2);
        } catch (Throwable unused) {
            zzvkVar.setFuture(settableFuture);
        }
    }

    public final /* synthetic */ ListenableFuture zzc(int i7, Throwable th) {
        return zzd(i7);
    }

    public final /* synthetic */ boolean zze() {
        AtomicLong atomicLong;
        long j6;
        int i7;
        int i10;
        boolean z3;
        do {
            atomicLong = this.zzb;
            j6 = atomicLong.get();
            i7 = (int) j6;
            long j10 = j6 >>> 32;
            if (i7 == Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 13);
                sb2.append("Refcount is: ");
                sb2.append(j6);
                throw new AssertionError(sb2.toString());
            }
            i10 = (int) j10;
            z3 = i7 == -2147483647;
            if (z3) {
                i10++;
            }
        } while (!atomicLong.compareAndSet(j6, zzi(i10, i7 - 1)));
        return z3;
    }

    public final /* synthetic */ zzvg zzf() {
        return this.zza;
    }

    public final /* synthetic */ AtomicReference zzg() {
        return this.zzc;
    }
}
