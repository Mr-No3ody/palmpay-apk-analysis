package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zaw implements zabu {
    final /* synthetic */ zax zaa;

    public /* synthetic */ zaw(zax zaxVar, byte[] bArr) {
        Objects.requireNonNull(zaxVar);
        this.zaa = zaxVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa(@Nullable Bundle bundle) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zav(ConnectionResult.RESULT_SUCCESS);
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
            zaxVar.zav(connectionResult);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zac(int i7, boolean z3) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            if (zaxVar.zaw()) {
                zaxVar.zax(false);
                zaxVar.zap(i7, z3);
            } else {
                zaxVar.zax(true);
                zaxVar.zar().onConnectionSuspended(i7);
            }
        } finally {
            this.zaa.zay().unlock();
        }
    }
}
