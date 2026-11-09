package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
final class zzok implements Comparable {
    private static final AtomicReferenceFieldUpdater zzc = AtomicReferenceFieldUpdater.newUpdater(zzok.class, Object.class, "zzb");
    private final String zza;
    private volatile Object zzb;

    public /* synthetic */ zzok(String str, byte[] bArr, byte[] bArr2) {
        this.zza = str;
        this.zzb = bArr;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza.compareTo((String) obj);
    }

    public final /* synthetic */ String zza() {
        return this.zza;
    }

    public final /* synthetic */ void zzb(byte[] bArr, boolean z3) {
        byte[][] bArr2;
        int i7 = 0;
        while (true) {
            Object obj = this.zzb;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i7 >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i7])) {
                        return;
                    } else {
                        i7++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i7 = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zzc;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bArr2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }
}
