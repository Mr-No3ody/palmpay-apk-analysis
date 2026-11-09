package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.horcrux.svg.d0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zan implements Handler.Callback {
    private final zam zab;
    private final Handler zah;
    private final ArrayList zac = new ArrayList();

    @VisibleForTesting
    final ArrayList zaa = new ArrayList();
    private final ArrayList zad = new ArrayList();
    private volatile boolean zae = false;
    private final AtomicInteger zaf = new AtomicInteger(0);
    private boolean zag = false;
    private final Object zai = new Object();

    public zan(Looper looper, zam zamVar) {
        this.zab = zamVar;
        this.zah = new com.google.android.gms.internal.base.zao(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.wtf("GmsClientEvents", d0.n(i7, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i7).length() + 34)), new Exception());
            return false;
        }
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.zai) {
            try {
                if (this.zae && this.zab.isConnected() && this.zac.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void zaa() {
        this.zae = false;
        this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    @VisibleForTesting
    public final void zac(@Nullable Bundle bundle) {
        Handler handler = this.zah;
        Preconditions.checkHandlerThread(handler, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.zai) {
            try {
                Preconditions.checkState(!this.zag);
                handler.removeMessages(1);
                this.zag = true;
                ArrayList arrayList = this.zaa;
                Preconditions.checkState(arrayList.isEmpty());
                ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList2 = new ArrayList(this.zac);
                AtomicInteger atomicInteger = this.zaf;
                int i7 = atomicInteger.get();
                for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList2) {
                    if (!this.zae || !this.zab.isConnected() || atomicInteger.get() != i7) {
                        break;
                        break;
                        break;
                    } else if (!arrayList.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected(bundle);
                    }
                }
                arrayList.clear();
                this.zag = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void zad(int i7) {
        Handler handler = this.zah;
        Preconditions.checkHandlerThread(handler, "onUnintentionalDisconnection must only be called on the Handler thread");
        handler.removeMessages(1);
        synchronized (this.zai) {
            try {
                this.zag = true;
                ArrayList arrayList = this.zac;
                ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = this.zaf;
                int i10 = atomicInteger.get();
                for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList2) {
                    if (!this.zae || atomicInteger.get() != i10) {
                        break;
                        break;
                    } else if (arrayList.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i7);
                    }
                }
                this.zaa.clear();
                this.zag = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void zae(ConnectionResult connectionResult) {
        Handler handler = this.zah;
        Preconditions.checkHandlerThread(handler, "onConnectionFailure must only be called on the Handler thread");
        handler.removeMessages(1);
        synchronized (this.zai) {
            try {
                ArrayList arrayList = this.zad;
                ArrayList<GoogleApiClient.OnConnectionFailedListener> arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = this.zaf;
                int i7 = atomicInteger.get();
                for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : arrayList2) {
                    if (this.zae && atomicInteger.get() == i7) {
                        if (arrayList.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult);
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            try {
                ArrayList arrayList = this.zac;
                if (arrayList.contains(connectionCallbacks)) {
                    new StringBuilder(String.valueOf(connectionCallbacks).length() + 62);
                } else {
                    arrayList.add(connectionCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zab.isConnected()) {
            Handler handler = this.zah;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final boolean zag(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean zContains;
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            zContains = this.zac.contains(connectionCallbacks);
        }
        return zContains;
    }

    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            try {
                if (!this.zac.remove(connectionCallbacks)) {
                    new StringBuilder(String.valueOf(connectionCallbacks).length() + 52);
                } else if (this.zag) {
                    this.zaa.add(connectionCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            try {
                ArrayList arrayList = this.zad;
                if (arrayList.contains(onConnectionFailedListener)) {
                    new StringBuilder(String.valueOf(onConnectionFailedListener).length() + 67);
                } else {
                    arrayList.add(onConnectionFailedListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zaj(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean zContains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            zContains = this.zad.contains(onConnectionFailedListener);
        }
        return zContains;
    }

    public final void zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            try {
                if (!this.zad.remove(onConnectionFailedListener)) {
                    new StringBuilder(String.valueOf(onConnectionFailedListener).length() + 57);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
