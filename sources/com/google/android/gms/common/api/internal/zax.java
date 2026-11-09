package com.google.android.gms.common.api.internal;

import M.f;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes2.dex */
final class zax implements zabv {
    private final Context zaa;
    private final zaaz zab;
    private final Looper zac;
    private final zabd zad;
    private final zabd zae;
    private final Map zaf;

    @Nullable
    private final Api.Client zah;

    @Nullable
    private Bundle zai;
    private final Lock zam;
    private final Set zag = Collections.newSetFromMap(new WeakHashMap());

    @Nullable
    private ConnectionResult zaj = null;

    @Nullable
    private ConnectionResult zak = null;
    private boolean zal = false;
    private int zan = 0;

    private zax(Context context, zaaz zaazVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, @Nullable Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        byte[] bArr = null;
        this.zaa = context;
        this.zab = zaazVar;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        this.zad = new zabd(context, zaazVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zav(this, bArr));
        this.zae = new zabd(context, zaazVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaw(this, bArr));
        f fVar = new f(0);
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            fVar.put((Api.AnyClientKey) it.next(), this.zad);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            fVar.put((Api.AnyClientKey) it2.next(), this.zae);
        }
        this.zaf = Collections.unmodifiableMap(fVar);
    }

    private final void zaA() {
        Set set = this.zag;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((SignInConnectionListener) it.next()).onComplete();
        }
        set.clear();
    }

    private final boolean zaB() {
        ConnectionResult connectionResult = this.zak;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaC(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabd zabdVar = (zabd) this.zaf.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabdVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabdVar.equals(this.zae);
    }

    @Nullable
    private final PendingIntent zaD() {
        Api.Client client = this.zah;
        if (client == null) {
            return null;
        }
        return com.google.android.gms.internal.base.zak.zaa(this.zaa, System.identityHashCode(this.zab), client.getSignInIntent(), com.google.android.gms.internal.base.zak.zaa | 134217728);
    }

    private static boolean zaE(@Nullable ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static zax zaa(Context context, zaaz zaazVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        f fVar = new f(0);
        f fVar2 = new f(0);
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                fVar.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                fVar2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.checkState(!fVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        f fVar3 = new f(0);
        f fVar4 = new f(0);
        for (Api api : map2.keySet()) {
            Api.AnyClientKey anyClientKeyZac = api.zac();
            if (fVar.containsKey(anyClientKeyZac)) {
                fVar3.put(api, (Boolean) map2.get(api));
            } else {
                if (!fVar2.containsKey(anyClientKeyZac)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                fVar4.put(api, (Boolean) map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            zas zasVar = (zas) arrayList.get(i7);
            Api api2 = zasVar.zaa;
            if (fVar3.containsKey(api2)) {
                arrayList2.add(zasVar);
            } else {
                if (!fVar4.containsKey(api2)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zasVar);
            }
        }
        return new zax(context, zaazVar, lock, looper, googleApiAvailabilityLight, fVar, fVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, fVar3, fVar4);
    }

    private final void zaz(ConnectionResult connectionResult) {
        int i7 = this.zan;
        if (i7 == 1) {
            zaA();
        } else if (i7 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.zab.zab(connectionResult);
            zaA();
        }
        this.zan = 0;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final BaseImplementation.ApiMethodImpl zab(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaC(apiMethodImpl)) {
            this.zad.zab(apiMethodImpl);
            return apiMethodImpl;
        }
        if (zaB()) {
            apiMethodImpl.setFailedResult(new Status(4, (String) null, zaD()));
            return apiMethodImpl;
        }
        this.zae.zab(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final BaseImplementation.ApiMethodImpl zac(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaC(apiMethodImpl)) {
            return this.zad.zac(apiMethodImpl);
        }
        if (!zaB()) {
            return this.zae.zac(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new Status(4, (String) null, zaD()));
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    @Nullable
    public final ConnectionResult zad(@NonNull Api api) {
        Object obj = this.zaf.get(api.zac());
        zabd zabdVar = this.zae;
        if (Objects.equal(obj, zabdVar)) {
            return zaB() ? new ConnectionResult(4, zaD()) : zabdVar.zad(api);
        }
        return this.zad.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zae() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zae();
        this.zae.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final ConnectionResult zaf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final ConnectionResult zag(long j6, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zah() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zah();
        this.zae.zah();
        zaA();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zai() {
        this.zam.lock();
        try {
            boolean z3 = false;
            if (this.zad.zai() && (this.zae.zai() || zaB() || this.zan == 1)) {
                z3 = true;
            }
            return z3;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zaj() {
        this.zam.lock();
        try {
            return this.zan == 2;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final boolean zak(SignInConnectionListener signInConnectionListener) {
        this.zam.lock();
        try {
            boolean z3 = false;
            if (zaj() || zai()) {
                zabd zabdVar = this.zae;
                if (!zabdVar.zai()) {
                    this.zag.add(signInConnectionListener);
                    z3 = true;
                    if (this.zan == 0) {
                        this.zan = 1;
                    }
                    this.zak = null;
                    zabdVar.zae();
                }
            }
            return z3;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zal() {
        this.zad.zal();
        this.zae.zal();
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zam() {
        this.zam.lock();
        try {
            boolean zZaj = zaj();
            this.zae.zah();
            this.zak = new ConnectionResult(4);
            if (zZaj) {
                new com.google.android.gms.internal.base.zao(this.zac).post(new zau(this));
            } else {
                zaA();
            }
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabv
    public final void zan(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.zae.zan(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.zad.zan(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final /* synthetic */ void zao() {
        ConnectionResult connectionResult;
        if (!zaE(this.zaj)) {
            if (this.zaj != null && zaE(this.zak)) {
                this.zae.zah();
                zaz((ConnectionResult) Preconditions.checkNotNull(this.zaj));
                return;
            }
            ConnectionResult connectionResult2 = this.zaj;
            if (connectionResult2 == null || (connectionResult = this.zak) == null) {
                return;
            }
            if (this.zae.zaf < this.zad.zaf) {
                connectionResult2 = connectionResult;
            }
            zaz(connectionResult2);
            return;
        }
        if (zaE(this.zak) || zaB()) {
            int i7 = this.zan;
            if (i7 == 1) {
                zaA();
            } else if (i7 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zaaz) Preconditions.checkNotNull(this.zab)).zaa(this.zai);
                zaA();
            }
            this.zan = 0;
            return;
        }
        ConnectionResult connectionResult3 = this.zak;
        if (connectionResult3 != null) {
            if (this.zan == 1) {
                zaA();
            } else {
                zaz(connectionResult3);
                this.zad.zah();
            }
        }
    }

    public final /* synthetic */ void zap(int i7, boolean z3) {
        this.zab.zac(i7, z3);
        this.zak = null;
        this.zaj = null;
    }

    public final /* synthetic */ void zaq(Bundle bundle) {
        Bundle bundle2 = this.zai;
        if (bundle2 == null) {
            this.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public final /* synthetic */ zabd zar() {
        return this.zad;
    }

    public final /* synthetic */ zabd zas() {
        return this.zae;
    }

    public final /* synthetic */ void zat(ConnectionResult connectionResult) {
        this.zaj = connectionResult;
    }

    public final /* synthetic */ ConnectionResult zau() {
        return this.zak;
    }

    public final /* synthetic */ void zav(ConnectionResult connectionResult) {
        this.zak = connectionResult;
    }

    public final /* synthetic */ boolean zaw() {
        return this.zal;
    }

    public final /* synthetic */ void zax(boolean z3) {
        this.zal = z3;
    }

    public final /* synthetic */ Lock zay() {
        return this.zam;
    }
}
