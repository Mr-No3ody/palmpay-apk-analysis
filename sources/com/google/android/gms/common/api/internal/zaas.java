package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zaas implements zaba {
    private final zabd zaa;

    public zaas(zabd zabdVar) {
        this.zaa = zabdVar;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zaa() {
        zabd zabdVar = this.zaa;
        Iterator it = zabdVar.zaa.values().iterator();
        while (it.hasNext()) {
            ((Api.Client) it.next()).disconnect();
        }
        zabdVar.zag.zad = Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zaa.zag.zaa.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final BaseImplementation.ApiMethodImpl zac(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final boolean zad() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zae() throws Throwable {
        this.zaa.zao();
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zaf(@Nullable Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zag(ConnectionResult connectionResult, Api api, boolean z3) {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void zah(int i7) {
    }
}
