package com.google.android.gms.internal.measurement;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzvk extends AbstractFuture {
    private zzvm zza;
    private final int zzb;

    public /* synthetic */ zzvk(zzvm zzvmVar, int i7, byte[] bArr) {
        this.zza = zzvmVar;
        this.zzb = i7;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        zzvm zzvmVar = this.zza;
        this.zza = null;
        if (zzvmVar != null && zzvmVar.zze()) {
            while (true) {
                zzvl zzvlVar = (zzvl) zzvmVar.zzg().get();
                if (zzvlVar != null) {
                    if (zzvlVar.zza() <= this.zzb) {
                        zzvlVar.cancel(true);
                        AtomicReference atomicReferenceZzg = zzvmVar.zzg();
                        while (!atomicReferenceZzg.compareAndSet(zzvlVar, null)) {
                            if (atomicReferenceZzg.get() != zzvlVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        AsyncCallable asyncCallableZza;
        zzvm zzvmVar = this.zza;
        if (zzvmVar == null || (asyncCallableZza = zzvmVar.zzf().zza()) == null) {
            return null;
        }
        String string = asyncCallableZza.toString();
        String strD = F.d(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        zzvl zzvlVar = (zzvl) this.zza.zzg().get();
        if (zzvlVar == null) {
            return strD;
        }
        int length = strD.length();
        String string2 = zzvlVar.toString();
        return G.s(new StringBuilder(string2.length() + length + 9 + 1), strD, ", trial=[", string2, "]");
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final boolean setFuture(ListenableFuture listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
