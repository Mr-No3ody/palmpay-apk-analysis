package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zacs<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    private final WeakReference zag;
    private final zacr zah;

    @Nullable
    private ResultTransform zaa = null;

    @Nullable
    private zacs zab = null;

    @Nullable
    private volatile ResultCallbacks zac = null;

    @Nullable
    private PendingResult zad = null;
    private final Object zae = new Object();

    @Nullable
    private Status zaf = null;
    private boolean zai = false;

    public zacs(WeakReference weakReference) {
        Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.zag = weakReference;
        GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
        this.zah = new zacr(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
    }

    private final void zaj() {
        if (this.zaa == null && this.zac == null) {
            return;
        }
        GoogleApiClient googleApiClient = (GoogleApiClient) this.zag.get();
        if (!this.zai && this.zaa != null && googleApiClient != null) {
            googleApiClient.zao(this);
            this.zai = true;
        }
        Status status = this.zaf;
        if (status != null) {
            zal(status);
            return;
        }
        PendingResult pendingResult = this.zad;
        if (pendingResult != null) {
            pendingResult.setResultCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zak, reason: merged with bridge method [inline-methods] */
    public final void zac(Status status) {
        synchronized (this.zae) {
            this.zaf = status;
            zal(status);
        }
    }

    private final void zal(Status status) {
        synchronized (this.zae) {
            try {
                ResultTransform resultTransform = this.zaa;
                if (resultTransform != null) {
                    ((zacs) Preconditions.checkNotNull(this.zab)).zac((Status) Preconditions.checkNotNull(resultTransform.onFailure(status), "onFailure must not return null"));
                } else if (zam()) {
                    ((ResultCallbacks) Preconditions.checkNotNull(this.zac)).onFailure(status);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean zam() {
        return (this.zac == null || ((GoogleApiClient) this.zag.get()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zan(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.zae) {
            Preconditions.checkState(this.zac == null, "Cannot call andFinally() twice.");
            Preconditions.checkState(this.zaa == null, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zac = resultCallbacks;
            zaj();
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(Result result) {
        synchronized (this.zae) {
            try {
                if (!result.getStatus().isSuccess()) {
                    zac(result.getStatus());
                    zan(result);
                } else if (this.zaa != null) {
                    zach.zaa().submit(new zacq(this, result));
                } else if (zam()) {
                    ((ResultCallbacks) Preconditions.checkNotNull(this.zac)).onSuccess(result);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        zacs zacsVar;
        synchronized (this.zae) {
            Preconditions.checkState(this.zaa == null, "Cannot call then() twice.");
            Preconditions.checkState(this.zac == null, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zaa = resultTransform;
            zacsVar = new zacs(this.zag);
            this.zab = zacsVar;
            zaj();
        }
        return zacsVar;
    }

    public final void zaa(PendingResult pendingResult) {
        synchronized (this.zae) {
            this.zad = pendingResult;
            zaj();
        }
    }

    public final void zab() {
        this.zac = null;
    }

    public final /* synthetic */ ResultTransform zad() {
        return this.zaa;
    }

    public final /* synthetic */ zacs zae() {
        return this.zab;
    }

    public final /* synthetic */ Object zaf() {
        return this.zae;
    }

    public final /* synthetic */ WeakReference zag() {
        return this.zag;
    }

    public final /* synthetic */ zacr zah() {
        return this.zah;
    }
}
