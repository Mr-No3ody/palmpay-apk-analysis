package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zace extends RegisterListenerMethod {
    final /* synthetic */ RegistrationMethods.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zace(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z3, int i7) {
        super(listenerHolder, featureArr, z3, i7);
        Objects.requireNonNull(builder);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void registerListener(Api.AnyClient anyClient, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.zaa.zaa().accept(anyClient, taskCompletionSource);
    }
}
