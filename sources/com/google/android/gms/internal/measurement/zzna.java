package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzna implements zzrt {
    private final boolean zza;

    public zzna(boolean z3) {
        this.zza = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object zza(zzrs openContext) throws IOException {
        zznd zzndVarZzb;
        Intrinsics.checkNotNullParameter(openContext, "openContext");
        InputStream inputStreamZzc = zzst.zzc(openContext);
        try {
            int i7 = 4096;
            if (this.zza) {
                if (inputStreamZzc instanceof zzsf) {
                    long length = ((zzsf) inputStreamZzc).zza().length();
                    if (length == 0) {
                        i7 = 512;
                    } else if (length < 4096) {
                        i7 = (int) length;
                    }
                }
                zzndVarZzb = zznd.zzb(zzacv.zzM(inputStreamZzc, i7), true);
                Intrinsics.checkNotNullExpressionValue(zzndVarZzb, "parseFrom(...)");
            } else {
                zzndVarZzb = zznd.zzb(zzacv.zzM(inputStreamZzc, 4096), false);
                Intrinsics.checkNotNullExpressionValue(zzndVarZzb, "parseFrom(...)");
            }
            b.o(inputStreamZzc, null);
            return zzndVarZzb;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.o(inputStreamZzc, th);
                throw th2;
            }
        }
    }
}
