package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i7, @NonNull String str, @NonNull Intent intent) {
        super(str, intent);
        this.zza = i7;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
