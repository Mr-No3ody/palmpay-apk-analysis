package com.google.android.gms.common.api.internal;

import C0.G;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.E;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import p381za.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaz extends GoogleApiClient implements zabu {

    @Nullable
    @VisibleForTesting
    zabs zab;
    final Map zac;
    Set zad;
    final ClientSettings zae;
    final Map zaf;
    final Api.AbstractClientBuilder zag;

    @Nullable
    Set zah;
    final zacu zai;
    private final Lock zaj;
    private final com.google.android.gms.common.internal.zan zak;
    private final int zam;
    private final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zaax zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList zav;
    private Integer zaw;
    private final com.google.android.gms.common.internal.zam zax;

    @Nullable
    private zabv zal = null;

    @VisibleForTesting
    final Queue zaa = new LinkedList();

    public zaaz(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, Map map, List list, List list2, Map map2, int i7, int i10, ArrayList arrayList) {
        this.zaq = true != ClientLibraryUtils.isPackageSide() ? 120000L : DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
        this.zar = 5000L;
        this.zad = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zah = null;
        zaat zaatVar = new zaat(this);
        this.zax = zaatVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zan(looper, zaatVar);
        this.zao = looper;
        this.zas = new zaax(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i7;
        if (i7 >= 0) {
            this.zaw = Integer.valueOf(i10);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new zacu();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf((GoogleApiClient.ConnectionCallbacks) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zai((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zaf(Iterable iterable, boolean z3) {
        Iterator it = iterable.iterator();
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z3) ? 2 : 1;
        }
        return 3;
    }

    public static String zag(int i7) {
        if (i7 == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i7 != 2) {
            return i7 != 3 ? c.UNKNOWN_PROCESS_NAME : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    private final void zal(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z3) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zaaw(this, statusPendingResult, z3, googleApiClient));
    }

    private final void zam(int i7) {
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i7);
        } else if (num.intValue() != i7) {
            String strZag = zag(this.zaw.intValue());
            String strZag2 = zag(i7);
            throw new IllegalStateException(G.s(new StringBuilder(strZag.length() + strZag2.length() + 51), "Cannot use sign-in mode: ", strZag2, ". Mode was already set to ", strZag));
        }
        if (this.zal != null) {
            return;
        }
        Map map = this.zac;
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (Api.Client client : map.values()) {
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        int iIntValue = this.zaw.intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2 && zRequiresSignIn) {
                this.zal = zax.zaa(this.zan, this, this.zaj, this.zao, this.zat, map, this.zae, this.zaf, this.zag, this.zav);
                return;
            }
        } else {
            if (!zRequiresSignIn) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zProvidesSignIn) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.zal = new zabd(this.zan, this, this.zaj, this.zao, this.zat, map, this.zae, this.zaf, this.zag, this.zav, this);
    }

    private final void zan() {
        this.zak.zab();
        ((zabv) Preconditions.checkNotNull(this.zal)).zae();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z3 = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Lock lock = this.zaj;
        lock.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z3 = false;
                }
                Preconditions.checkState(z3, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zam(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult connectionResultZaf = ((zabv) Preconditions.checkNotNull(this.zal)).zaf();
            lock.unlock();
            return connectionResultZaf;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        boolean z3 = true;
        if (num != null && num.intValue() == 2) {
            z3 = false;
        }
        Preconditions.checkState(z3, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.zac.containsKey(Common.CLIENT_KEY)) {
            zal(this, statusPendingResult, false);
            return statusPendingResult;
        }
        AtomicReference atomicReference = new AtomicReference();
        zaau zaauVar = new zaau(this, atomicReference, statusPendingResult);
        zaav zaavVar = new zaav(this, statusPendingResult);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.zan);
        builder.addApi(Common.API);
        builder.addConnectionCallbacks(zaauVar);
        builder.addOnConnectionFailedListener(zaavVar);
        builder.setHandler(this.zas);
        GoogleApiClient googleApiClientBuild = builder.build();
        atomicReference.set(googleApiClientBuild);
        googleApiClientBuild.connect();
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        Lock lock = this.zaj;
        lock.lock();
        try {
            int i7 = 2;
            boolean z3 = false;
            if (this.zam >= 0) {
                Preconditions.checkState(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.zaw)).intValue();
            lock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i7 = iIntValue;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 22);
                    sb2.append("Illegal sign-in mode: ");
                    sb2.append(i7);
                    Preconditions.checkArgument(z3, sb2.toString());
                    zam(i7);
                    zan();
                    Lock lock2 = this.zaj;
                    lock2.unlock();
                    lock2.unlock();
                    return;
                }
                i7 = iIntValue;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 22);
                sb3.append("Illegal sign-in mode: ");
                sb3.append(i7);
                Preconditions.checkArgument(z3, sb3.toString());
                zam(i7);
                zan();
                Lock lock3 = this.zaj;
                lock3.unlock();
                lock3.unlock();
                return;
            } catch (Throwable th) {
                this.zaj.unlock();
                throw th;
            }
            z3 = true;
        } catch (Throwable th2) {
            this.zaj.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.zaj.lock();
        try {
            this.zai.zab();
            zabv zabvVar = this.zal;
            if (zabvVar != null) {
                zabvVar.zah();
            }
            this.zau.zab();
            Queue<BaseImplementation.ApiMethodImpl> queue = this.zaa;
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : queue) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            queue.clear();
            if (this.zal != null) {
                zad();
                this.zak.zaa();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        zabv zabvVar = this.zal;
        if (zabvVar != null) {
            zabvVar.zan(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        Api<?> api = t.getApi();
        boolean zContainsKey = this.zac.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(strZad);
        sb2.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb2.toString());
        this.zaj.lock();
        try {
            zabv zabvVar = this.zal;
            if (zabvVar == null) {
                this.zaa.add(t);
            } else {
                t = (T) zabvVar.zab(t);
            }
            return t;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Map map = this.zac;
        Api<?> api = t.getApi();
        boolean zContainsKey = map.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(strZad);
        sb2.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb2.toString());
        Lock lock = this.zaj;
        lock.lock();
        try {
            zabv zabvVar = this.zal;
            if (zabvVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (!this.zap) {
                T t3 = (T) zabvVar.zac(t);
                this.zaj.unlock();
                return t3;
            }
            Queue queue = this.zaa;
            queue.add(t);
            while (!queue.isEmpty()) {
                BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) queue.remove();
                this.zai.zaa(apiMethodImpl);
                apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c6 = (C) this.zac.get(anyClientKey);
        Preconditions.checkNotNull(c6, "Appropriate Api was not requested.");
        return c6;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        ConnectionResult connectionResult;
        Lock lock = this.zaj;
        lock.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.zac.containsKey(api.zac())) {
                String strZad = api.zad();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZad).length() + 42);
                sb2.append(strZad);
                sb2.append(" was never registered with GoogleApiClient");
                throw new IllegalArgumentException(sb2.toString());
            }
            ConnectionResult connectionResultZad = ((zabv) Preconditions.checkNotNull(this.zal)).zad(api);
            if (connectionResultZad != null) {
                lock.unlock();
                return connectionResultZad;
            }
            if (this.zap) {
                connectionResult = ConnectionResult.RESULT_SUCCESS;
            } else {
                zae();
                String strZad2 = api.zad();
                StringBuilder sb3 = new StringBuilder(String.valueOf(strZad2).length() + 100);
                sb3.append(strZad2);
                sb3.append(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
                Log.wtf("GoogleApiClientImpl", sb3.toString(), new Exception());
                connectionResult = new ConnectionResult(8, null);
            }
            lock.unlock();
            return connectionResult;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@NonNull Api<?> api) {
        return this.zac.containsKey(api.zac());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        return isConnected() && (client = (Api.Client) this.zac.get(api.zac())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zabv zabvVar = this.zal;
        return zabvVar != null && zabvVar.zai();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zabv zabvVar = this.zal;
        return zabvVar != null && zabvVar.zaj();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zag(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zaj(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zabv zabvVar = this.zal;
        return zabvVar != null && zabvVar.zak(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zabv zabvVar = this.zal;
        if (zabvVar != null) {
            zabvVar.zam();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(@NonNull L l5) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l5, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull E e10) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) e10);
        int i7 = this.zam;
        if (i7 < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zak.zaa(lifecycleActivity).zac(i7);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa(@Nullable Bundle bundle) {
        while (true) {
            Queue queue = this.zaa;
            if (queue.isEmpty()) {
                this.zak.zac(bundle);
                return;
            }
            execute((BaseImplementation.ApiMethodImpl) queue.remove());
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zab(ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zad();
        }
        if (this.zap) {
            return;
        }
        com.google.android.gms.common.internal.zan zanVar = this.zak;
        zanVar.zae(connectionResult);
        zanVar.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zac(int i7, boolean z3) {
        if (i7 == 1) {
            if (!z3 && !this.zap) {
                this.zap = true;
                if (this.zab == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.zab = this.zat.zag(this.zan.getApplicationContext(), new zaay(this));
                    } catch (SecurityException unused) {
                    }
                }
                zaax zaaxVar = this.zas;
                zaaxVar.sendMessageDelayed(zaaxVar.obtainMessage(1), this.zaq);
                zaaxVar.sendMessageDelayed(zaaxVar.obtainMessage(2), this.zar);
            }
            i7 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zai.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zacu.zaa);
        }
        com.google.android.gms.common.internal.zan zanVar = this.zak;
        zanVar.zad(i7);
        zanVar.zaa();
        if (i7 == 2) {
            zan();
        }
    }

    public final boolean zad() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        zaax zaaxVar = this.zas;
        zaaxVar.removeMessages(2);
        zaaxVar.removeMessages(1);
        zabs zabsVar = this.zab;
        if (zabsVar != null) {
            zabsVar.zab();
            this.zab = null;
        }
        return true;
    }

    public final String zae() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final /* synthetic */ void zah(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z3) {
        zal(googleApiClient, statusPendingResult, true);
    }

    public final /* synthetic */ void zai() {
        this.zaj.lock();
        try {
            if (this.zap) {
                zan();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    public final /* synthetic */ void zaj() {
        this.zaj.lock();
        try {
            if (zad()) {
                zan();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    public final /* synthetic */ Context zak() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zacs zacsVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new HashSet();
            }
            this.zah.add(zacsVar);
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zacs zacsVar) {
        Lock lock = this.zaj;
        lock.lock();
        try {
            Set set = this.zah;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (set.remove(zacsVar)) {
                lock.lock();
                try {
                    Set set2 = this.zah;
                    if (set2 == null) {
                        lock.unlock();
                    } else {
                        boolean zIsEmpty = set2.isEmpty();
                        this.zaj.unlock();
                        if (zIsEmpty) {
                        }
                    }
                    zabv zabvVar = this.zal;
                    if (zabvVar != null) {
                        zabvVar.zal();
                    }
                } finally {
                    this.zaj.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j6, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        Lock lock = this.zaj;
        lock.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zam(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult connectionResultZag = ((zabv) Preconditions.checkNotNull(this.zal)).zag(j6, timeUnit);
            lock.unlock();
            return connectionResultZag;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i7) {
        this.zaj.lock();
        boolean z3 = true;
        if (i7 != 3 && i7 != 1) {
            if (i7 == 2) {
                i7 = 2;
            } else {
                z3 = false;
            }
        }
        try {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 22);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i7);
            Preconditions.checkArgument(z3, sb2.toString());
            zam(i7);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}
