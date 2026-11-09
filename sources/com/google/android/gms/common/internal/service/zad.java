package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zad extends zag {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(zaf zafVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        Objects.requireNonNull(zafVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zan) ((zai) anyClient).getService()).zae(new zae(this));
    }
}
