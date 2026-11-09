package com.google.android.gms.common.api.internal;

import C0.G;
import M.f;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zabk implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zat {
    final /* synthetic */ GoogleApiManager zaa;
    private final Queue zab;
    private final Api.Client zac;
    private final ApiKey zad;
    private final zaaa zae;
    private final Set zaf;
    private final Map zag;
    private final int zah;

    @Nullable
    private final zacm zai;
    private boolean zaj;
    private final List zak;

    @Nullable
    private ConnectionResult zal;
    private int zam;

    @WorkerThread
    public zabk(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        Objects.requireNonNull(googleApiManager);
        this.zaa = googleApiManager;
        this.zab = new LinkedList();
        this.zaf = new HashSet();
        this.zag = new HashMap();
        this.zak = new ArrayList();
        this.zal = null;
        this.zam = 0;
        Api.Client clientZaf = googleApi.zaf(googleApiManager.zaF().getLooper(), this);
        this.zac = clientZaf;
        this.zad = googleApi.getApiKey();
        this.zae = new zaaa();
        this.zah = googleApi.zab();
        if (clientZaf.requiresSignIn()) {
            this.zai = googleApi.zac(googleApiManager.zaz(), googleApiManager.zaF());
        } else {
            this.zai = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zaC, reason: merged with bridge method [inline-methods] */
    public final void zat() {
        zah();
        zaN(ConnectionResult.RESULT_SUCCESS);
        zaK();
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            RegisterListenerMethod registerListenerMethod = ((zacd) it.next()).zaa;
            if (zaO(registerListenerMethod.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    registerListenerMethod.registerListener(this.zac, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e10) {
                    e = e10;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e11) {
                    e = e11;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        zaF();
        zaL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zaD, reason: merged with bridge method [inline-methods] */
    public final void zau(int i7) {
        zah();
        this.zaj = true;
        this.zae.zae(i7, this.zac.getLastDisconnectMessage());
        ApiKey apiKey = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zaF().sendMessageDelayed(Message.obtain(googleApiManager.zaF(), 9, apiKey), 5000L);
        googleApiManager.zaF().sendMessageDelayed(Message.obtain(googleApiManager.zaF(), 11, apiKey), 120000L);
        googleApiManager.zaB().zac();
        Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((zacd) it.next()).zac.run();
        }
    }

    @WorkerThread
    private final boolean zaE(@NonNull ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.zae) {
            try {
                GoogleApiManager googleApiManager = this.zaa;
                if (googleApiManager.zaD() == null || !googleApiManager.zaE().contains(this.zad)) {
                    return false;
                }
                googleApiManager.zaD().zaf(connectionResult, this.zah);
                googleApiManager.zaA().zae(googleApiManager.zaz(), connectionResult, true);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    private final void zaF() {
        Queue queue = this.zab;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            zai zaiVar = (zai) arrayList.get(i7);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaG(zaiVar)) {
                queue.remove(zaiVar);
            }
        }
    }

    @WorkerThread
    private final boolean zaG(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaH(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature featureZaO = zaO(zacVar.zaa(this));
        if (featureZaO == null) {
            zaH(zaiVar);
            return true;
        }
        String name = this.zac.getClass().getName();
        String name2 = featureZaO.getName();
        long version = featureZaO.getVersion();
        int length = name.length();
        new StringBuilder(length + 53 + String.valueOf(name2).length() + 2 + String.valueOf(version).length() + 2);
        GoogleApiManager googleApiManager = this.zaa;
        if (!googleApiManager.zaG() || !zacVar.zab(this)) {
            zacVar.zae(new UnsupportedApiCallException(featureZaO));
            return true;
        }
        int iZac = zacVar.zac(this);
        zabl zablVar = new zabl(this.zad, featureZaO, null);
        List list = this.zak;
        int iIndexOf = list.indexOf(zablVar);
        if (iIndexOf >= 0) {
            zabl zablVar2 = (zabl) list.get(iIndexOf);
            googleApiManager.zaF().removeMessages(15, zablVar2);
            googleApiManager.zaF().sendMessageDelayed(Message.obtain(googleApiManager.zaF(), 15, zablVar2), 5000L);
            return false;
        }
        list.add(zablVar);
        googleApiManager.zaF().sendMessageDelayed(Message.obtain(googleApiManager.zaF(), 15, zablVar), 5000L);
        googleApiManager.zaF().sendMessageDelayed(Message.obtain(googleApiManager.zaF(), 16, zablVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null, null, Integer.valueOf(iZac));
        if (zaE(connectionResult)) {
            String name3 = featureZaO.getName();
            long version2 = featureZaO.getVersion();
            new StringBuilder(String.valueOf(name3).length() + 61 + String.valueOf(version2).length());
            return false;
        }
        if (!googleApiManager.zap(connectionResult, this.zah)) {
            return false;
        }
        String name4 = featureZaO.getName();
        long version3 = featureZaO.getVersion();
        new StringBuilder(String.valueOf(name4).length() + 55 + String.valueOf(version3).length());
        return false;
    }

    @WorkerThread
    private final void zaH(zai zaiVar) {
        zaiVar.zaf(this.zae, zap());
        try {
            zaiVar.zag(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @WorkerThread
    private final void zaI(@Nullable Status status, @Nullable Exception exc, boolean z3) {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.zab.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z3 || zaiVar.zac == 2) {
                if (status != null) {
                    zaiVar.zad(status);
                } else {
                    zaiVar.zae(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zaJ, reason: merged with bridge method [inline-methods] */
    public final void zav(Status status) {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        zaI(status, null, false);
    }

    @WorkerThread
    private final void zaK() {
        if (this.zaj) {
            GoogleApiManager googleApiManager = this.zaa;
            ApiKey apiKey = this.zad;
            googleApiManager.zaF().removeMessages(11, apiKey);
            googleApiManager.zaF().removeMessages(9, apiKey);
            this.zaj = false;
        }
    }

    private final void zaL() {
        ApiKey apiKey = this.zad;
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zaF().removeMessages(12, apiKey);
        googleApiManager.zaF().sendMessageDelayed(googleApiManager.zaF().obtainMessage(12, apiKey), googleApiManager.zaw());
    }

    @WorkerThread
    private final boolean zaM(boolean z3) {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        Api.Client client = this.zac;
        if (!client.isConnected() || !this.zag.isEmpty()) {
            return false;
        }
        if (!this.zae.zac()) {
            client.disconnect("Timing out service connection.");
            return true;
        }
        if (!z3) {
            return false;
        }
        zaL();
        return false;
    }

    @WorkerThread
    private final void zaN(ConnectionResult connectionResult) {
        Set set = this.zaf;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((zal) it.next()).zac(this.zad, connectionResult, com.google.android.gms.common.internal.Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.zac.getEndpointPackageName() : null);
        }
        set.clear();
    }

    @Nullable
    @WorkerThread
    private final Feature zaO(@Nullable Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.zac.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            f fVar = new f(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                fVar.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l5 = (Long) fVar.get(feature2.getName());
                if (l5 == null || l5.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        GoogleApiManager googleApiManager = this.zaa;
        if (Looper.myLooper() == googleApiManager.zaF().getLooper()) {
            zat();
        } else {
            googleApiManager.zaF().post(new zabg(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zac(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i7) {
        GoogleApiManager googleApiManager = this.zaa;
        if (Looper.myLooper() == googleApiManager.zaF().getLooper()) {
            zau(i7);
        } else {
            googleApiManager.zaF().post(new zabh(this, i7));
        }
    }

    public final /* synthetic */ ApiKey zaA() {
        return this.zad;
    }

    public final /* synthetic */ boolean zaB() {
        return this.zaj;
    }

    @Override // com.google.android.gms.common.api.internal.zat
    public final void zaa(ConnectionResult connectionResult, Api api, boolean z3) {
        throw null;
    }

    @WorkerThread
    public final void zab(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        Api.Client client = this.zac;
        String name = client.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        client.disconnect(G.s(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        zac(connectionResult, null);
    }

    @WorkerThread
    public final void zac(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        GoogleApiManager googleApiManager = this.zaa;
        Preconditions.checkHandlerThread(googleApiManager.zaF());
        zacm zacmVar = this.zai;
        if (zacmVar != null) {
            zacmVar.zad();
        }
        zah();
        googleApiManager.zaB().zac();
        zaN(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zau) && connectionResult.getErrorCode() != 24) {
            googleApiManager.zax(true);
            googleApiManager.zaF().sendMessageDelayed(googleApiManager.zaF().obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            zav(GoogleApiManager.zab);
            return;
        }
        if (connectionResult.getErrorCode() == 25) {
            zav(GoogleApiManager.zaJ(this.zad, connectionResult));
            return;
        }
        Queue queue = this.zab;
        if (queue.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            Preconditions.checkHandlerThread(googleApiManager.zaF());
            zaI(null, exc, false);
            return;
        }
        if (!googleApiManager.zaG()) {
            zav(GoogleApiManager.zaJ(this.zad, connectionResult));
            return;
        }
        ApiKey apiKey = this.zad;
        zaI(GoogleApiManager.zaJ(apiKey, connectionResult), null, true);
        if (queue.isEmpty() || zaE(connectionResult) || googleApiManager.zap(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.zaj = true;
        }
        if (this.zaj) {
            googleApiManager.zaF().sendMessageDelayed(Message.obtain(googleApiManager.zaF(), 9, apiKey), 5000L);
        } else {
            zav(GoogleApiManager.zaJ(apiKey, connectionResult));
        }
    }

    @WorkerThread
    public final void zad(zai zaiVar) {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        if (this.zac.isConnected()) {
            if (zaG(zaiVar)) {
                zaL();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zam();
        } else {
            zac(this.zal, null);
        }
    }

    @WorkerThread
    public final void zae() {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        zav(GoogleApiManager.zaa);
        this.zae.zad();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zad(new zah(listenerKey, new TaskCompletionSource()));
        }
        zaN(new ConnectionResult(4));
        Api.Client client = this.zac;
        if (client.isConnected()) {
            client.onUserSignOut(new zabj(this));
        }
    }

    public final Api.Client zaf() {
        return this.zac;
    }

    public final Map zag() {
        return this.zag;
    }

    @WorkerThread
    public final void zah() {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        this.zal = null;
    }

    @Nullable
    @WorkerThread
    public final ConnectionResult zai() {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        return this.zal;
    }

    @WorkerThread
    public final void zaj() {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        if (this.zaj) {
            zam();
        }
    }

    @WorkerThread
    public final void zak() {
        GoogleApiManager googleApiManager = this.zaa;
        Preconditions.checkHandlerThread(googleApiManager.zaF());
        if (this.zaj) {
            zaK();
            zav(googleApiManager.zaA().isGooglePlayServicesAvailable(googleApiManager.zaz()) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    @WorkerThread
    public final boolean zal() {
        return zaM(true);
    }

    @WorkerThread
    public final void zam() {
        GoogleApiManager googleApiManager = this.zaa;
        Preconditions.checkHandlerThread(googleApiManager.zaF());
        Api.Client client = this.zac;
        if (client.isConnected() || client.isConnecting()) {
            return;
        }
        try {
            int iZaa = googleApiManager.zaB().zaa(googleApiManager.zaz(), client);
            if (iZaa != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iZaa, null);
                new StringBuilder(this.zac.getClass().getName().length() + 35 + connectionResult.toString().length());
                zac(connectionResult, null);
                return;
            }
            zabn zabnVar = new zabn(googleApiManager, client, this.zad);
            if (client.requiresSignIn()) {
                ((zacm) Preconditions.checkNotNull(this.zai)).zac(zabnVar);
            }
            try {
                client.connect(zabnVar);
            } catch (SecurityException e10) {
                zac(new ConnectionResult(10), e10);
            }
        } catch (IllegalStateException e11) {
            zac(new ConnectionResult(10), e11);
        }
    }

    @WorkerThread
    public final void zan(zal zalVar) {
        Preconditions.checkHandlerThread(this.zaa.zaF());
        this.zaf.add(zalVar);
    }

    public final boolean zao() {
        return this.zac.isConnected();
    }

    public final boolean zap() {
        return this.zac.requiresSignIn();
    }

    public final int zaq() {
        return this.zah;
    }

    @WorkerThread
    public final int zar() {
        return this.zam;
    }

    @WorkerThread
    public final void zas() {
        this.zam++;
    }

    public final /* synthetic */ boolean zaw(boolean z3) {
        return zaM(false);
    }

    public final /* synthetic */ void zax(zabl zablVar) {
        if (this.zak.contains(zablVar) && !this.zaj) {
            if (this.zac.isConnected()) {
                zaF();
            } else {
                zam();
            }
        }
    }

    public final /* synthetic */ void zay(zabl zablVar) {
        Feature[] featureArrZaa;
        if (this.zak.remove(zablVar)) {
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zaF().removeMessages(15, zablVar);
            googleApiManager.zaF().removeMessages(16, zablVar);
            Feature featureZab = zablVar.zab();
            Queue<zai> queue = this.zab;
            ArrayList arrayList = new ArrayList(queue.size());
            for (zai zaiVar : queue) {
                if ((zaiVar instanceof zac) && (featureArrZaa = ((zac) zaiVar).zaa(this)) != null && ArrayUtils.contains(featureArrZaa, featureZab)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                zai zaiVar2 = (zai) arrayList.get(i7);
                queue.remove(zaiVar2);
                zaiVar2.zae(new UnsupportedApiCallException(featureZab));
            }
        }
    }

    public final /* synthetic */ Api.Client zaz() {
        return this.zac;
    }
}
