package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.util.AbstractList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaed {
    public static final byte[] zza;

    public class zza<T> extends AbstractList<T> {
        private final zzaeb zza;
        private final zzaec<T> zzb;

        public zza(zzaeb zzaebVar, zzaec<T> zzaecVar) {
            this.zza = zzaebVar;
            this.zzb = zzaecVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i7) {
            return (T) this.zzb.zza(this.zza.zzf(i7));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.zza.size();
        }
    }

    static {
        byte[] bArr = new byte[0];
        zza = bArr;
        ByteBuffer.wrap(bArr);
        zzacv.zzN(bArr, 0, 0, false);
    }

    public static int zza(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int zzb(int i7, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i7 = (i7 * 31) + bArr[i12];
        }
        return i7;
    }
}
