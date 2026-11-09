package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.horcrux.svg.d0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class zak extends zap {
    private final SparseArray zad;

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        return zakVar != null ? zakVar : new zak(fragment);
    }

    @Nullable
    private final zaj zai(int i7) {
        SparseArray sparseArray = this.zad;
        if (sparseArray.size() <= i7) {
            return null;
        }
        return (zaj) sparseArray.get(sparseArray.keyAt(i7));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        for (int i7 = 0; i7 < this.zad.size(); i7++) {
            zaj zajVarZai = zai(i7);
            if (zajVarZai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(zajVarZai.zaa);
                printWriter.println(":");
                zajVarZai.zab.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.zad;
        boolean z3 = this.zaa;
        String strValueOf = String.valueOf(sparseArray);
        new StringBuilder(String.valueOf(z3).length() + 9 + strValueOf.length());
        if (this.zab.get() == null) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                zaj zajVarZai = zai(i7);
                if (zajVarZai != null) {
                    zajVarZai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i7 = 0; i7 < this.zad.size(); i7++) {
            zaj zajVarZai = zai(i7);
            if (zajVarZai != null) {
                zajVarZai.zab.disconnect();
            }
        }
    }

    public final void zab(int i7, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        SparseArray sparseArray = this.zad;
        int iIndexOfKey = sparseArray.indexOfKey(i7);
        Preconditions.checkState(iIndexOfKey < 0, d0.n(i7, "Already managing a GoogleApiClient with id ", new StringBuilder(String.valueOf(i7).length() + 43)));
        zam zamVar = (zam) this.zab.get();
        boolean z3 = this.zaa;
        String strValueOf = String.valueOf(zamVar);
        new StringBuilder(String.valueOf(i7).length() + 32 + String.valueOf(z3).length() + 1 + strValueOf.length());
        zaj zajVar = new zaj(this, i7, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        sparseArray.put(i7, zajVar);
        if (this.zaa && zamVar == null) {
            "connecting ".concat(googleApiClient.toString());
            googleApiClient.connect();
        }
    }

    public final void zac(int i7) {
        SparseArray sparseArray = this.zad;
        zaj zajVar = (zaj) sparseArray.get(i7);
        sparseArray.remove(i7);
        if (zajVar != null) {
            GoogleApiClient googleApiClient = zajVar.zab;
            googleApiClient.unregisterConnectionFailedListener(zajVar);
            googleApiClient.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zad(ConnectionResult connectionResult, int i7) {
        if (i7 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaj zajVar = (zaj) this.zad.get(i7);
        if (zajVar != null) {
            zac(i7);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zae() {
        for (int i7 = 0; i7 < this.zad.size(); i7++) {
            zaj zajVarZai = zai(i7);
            if (zajVarZai != null) {
                zajVarZai.zab.connect();
            }
        }
    }
}
