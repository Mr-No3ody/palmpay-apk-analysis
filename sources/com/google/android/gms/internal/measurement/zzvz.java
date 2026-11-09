package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import com.google.common.annotations.VisibleForTesting;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class zzvz {
    private static final zzvz zza;
    private final UUID zzb;
    private final AtomicLong zzc;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zza = new zzvz(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @VisibleForTesting
    public zzvz(UUID uuid, long j6) {
        this.zzb = uuid;
        this.zzc = new AtomicLong((j6 ^ 25214903917L) & 281474976710655L);
    }

    public static zzvz zza() {
        return zza;
    }

    @VisibleForTesting
    public final long zzb() {
        AtomicLong atomicLong;
        long j6;
        long j10;
        long j11;
        do {
            atomicLong = this.zzc;
            j6 = atomicLong.get();
            j10 = ((j6 * 25214903917L) + 11) & 281474976710655L;
            j11 = ((25214903917L * j10) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j6, j11));
        return (((long) ((int) (j10 >>> 16))) << 32) + ((long) ((int) (j11 >>> 16)));
    }

    public final UUID zzc() {
        long jZzb = zzb() & (-61441);
        long jZzb2 = zzb() >>> 2;
        UUID uuid = this.zzb;
        return new UUID(jZzb ^ uuid.getMostSignificantBits(), jZzb2 ^ uuid.getLeastSignificantBits());
    }
}
