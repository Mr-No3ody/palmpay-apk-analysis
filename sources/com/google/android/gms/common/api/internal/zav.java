package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes2.dex */
final class zav implements zabu {
    final /* synthetic */ zax zaa;

    public /* synthetic */ zav(zax zaxVar, byte[] bArr) {
        Objects.requireNonNull(zaxVar);
        this.zaa = zaxVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa(@Nullable Bundle bundle) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zaq(bundle);
            zaxVar.zat(ConnectionResult.RESULT_SUCCESS);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zab(@NonNull ConnectionResult connectionResult) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zat(connectionResult);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zac(int i7, boolean z3) {
        Lock lockZay;
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            if (zaxVar.zaw() || zaxVar.zau() == null || !zaxVar.zau().isSuccess()) {
                zaxVar.zax(false);
                zaxVar.zap(i7, z3);
                lockZay = zaxVar.zay();
            } else {
                zaxVar.zax(true);
                zaxVar.zas().onConnectionSuspended(i7);
                lockZay = this.zaa.zay();
            }
            lockZay.unlock();
        } catch (Throwable th) {
            this.zaa.zay().unlock();
            throw th;
        }
    }
}
