package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public final class zao {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zao() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int iIsGooglePlayServicesAvailable = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZab = zab(context, minApkVersion);
        if (iZab != -1) {
            return iZab;
        }
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            int i7 = 0;
            while (true) {
                try {
                    if (i7 >= sparseIntArray.size()) {
                        iIsGooglePlayServicesAvailable = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i7);
                    if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i7++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iIsGooglePlayServicesAvailable == -1) {
                iIsGooglePlayServicesAvailable = this.zab.isGooglePlayServicesAvailable(context, minApkVersion);
            }
            sparseIntArray.put(minApkVersion, iIsGooglePlayServicesAvailable);
        }
        return iIsGooglePlayServicesAvailable;
    }

    public final int zab(Context context, int i7) {
        int i10;
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i7, -1);
        }
        return i10;
    }

    public final void zac() {
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }

    public zao(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
