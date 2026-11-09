package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class zzol implements zzoh {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final ConcurrentMap zzb;
    private final ConcurrentMap zzc;

    public zzol() {
        new ConcurrentHashMap();
        this.zzb = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.zzc = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x002e A[EDGE_INSN: B:42:0x002e->B:40:0x002e BREAK  A[LOOP:1: B:12:0x004e->B:45:?], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzoh
    public final void zza(zzacr zzacrVar, Set set, String str) {
        zzok[] zzokVarArr;
        if (!set.isEmpty() && !this.zza.getAndSet(true)) {
            zzbu.zza().zzb(new zzoj(this, null));
        }
        final byte[] bArrZzm = zzacrVar.zzm();
        this.zzb.compute(str, new BiFunction() { // from class: com.google.android.gms.internal.measurement.zzoi
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrZzm;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) this.zzc.putIfAbsent((String) it.next(), new AtomicReference(new zzok(str, bArrZzm, null)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof zzok) {
                        zzok zzokVar = (zzok) obj;
                        if (str.equals(zzokVar.zza())) {
                            zzokVar.zzb(bArrZzm, false);
                            break;
                        }
                        zzok zzokVar2 = new zzok(str, bArrZzm, null);
                        zzokVarArr = str.compareTo(zzokVar.zza()) < 0 ? new zzok[]{zzokVar2, zzokVar} : new zzok[]{zzokVar, zzokVar2};
                        do {
                            if (atomicReference.compareAndSet(obj, zzokVarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        zzok[] zzokVarArr2 = (zzok[]) obj;
                        int iBinarySearch = Arrays.binarySearch(zzokVarArr2, str);
                        if (iBinarySearch >= 0) {
                            zzokVarArr2[iBinarySearch].zzb(bArrZzm, false);
                            break;
                        }
                        int i7 = ~iBinarySearch;
                        int length = zzokVarArr2.length;
                        int i10 = length + 1;
                        int i11 = length - i7;
                        if (i11 == 0) {
                            zzokVarArr = (zzok[]) Arrays.copyOf(zzokVarArr2, i10);
                        } else {
                            zzok[] zzokVarArr3 = new zzok[i10];
                            System.arraycopy(zzokVarArr2, 0, zzokVarArr3, 0, i7);
                            System.arraycopy(zzokVarArr2, i7, zzokVarArr3, i7 + 1, i11);
                            zzokVarArr = zzokVarArr3;
                        }
                        zzokVarArr[i7] = new zzok(str, bArrZzm, null);
                        do {
                            if (atomicReference.compareAndSet(obj, zzokVarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }
}
