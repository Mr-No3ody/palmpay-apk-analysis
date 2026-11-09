package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(@NonNull Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    @KeepForSdk
    public final void onResult(@NonNull R r3) {
        Status status = r3.getStatus();
        if (status.isSuccess()) {
            onSuccess(r3);
            return;
        }
        onFailure(status);
        if (r3 instanceof Releasable) {
            try {
                ((Releasable) r3).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r3));
            }
        }
    }

    public abstract void onSuccess(@NonNull R r3);
}
