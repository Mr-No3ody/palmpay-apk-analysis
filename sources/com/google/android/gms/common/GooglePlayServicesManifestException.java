package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int i7, @NonNull String str) {
        super(str);
        this.zza = i7;
    }

    public int getActualVersion() {
        return this.zza;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
