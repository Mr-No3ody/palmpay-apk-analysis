package com.google.android.gms.internal.mlkit_common;

import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzp {
    final long zza;
    final long zzb;
    final boolean zzc;

    private zzp(long j6, long j10, boolean z3) {
        this.zza = j6;
        this.zzb = j10;
        this.zzc = z3;
    }

    public static zzp zza(final FileDescriptor fileDescriptor) throws IOException {
        StructStat structStat = (StructStat) zzc(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Os.fstat(fileDescriptor);
            }
        });
        return new zzp(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
    }

    public static zzp zzb(final String str) throws IOException {
        StructStat structStat = (StructStat) zzc(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Os.lstat(str);
            }
        });
        return new zzp(structStat.st_dev, structStat.st_ino, OsConstants.S_ISLNK(structStat.st_mode));
    }

    private static Object zzc(Callable callable) throws IOException {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
