package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zabn implements BaseGmsClient.ConnectionProgressReportCallbacks, zacl {
    final /* synthetic */ GoogleApiManager zaa;
    private final Api.Client zab;
    private final ApiKey zac;

    @Nullable
    private IAccountAccessor zad;

    @Nullable
    private Set zae;
    private boolean zaf;

    public zabn(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        Objects.requireNonNull(googleApiManager);
        this.zaa = googleApiManager;
        this.zad = null;
        this.zae = null;
        this.zaf = false;
        this.zab = client;
        this.zac = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zah, reason: merged with bridge method [inline-methods] */
    public final void zad() {
        IAccountAccessor iAccountAccessor;
        if (!this.zaf || (iAccountAccessor = this.zad) == null) {
            return;
        }
        this.zab.getRemoteService(iAccountAccessor, this.zae);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        this.zaa.zaF().post(new zabm(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacl
    @WorkerThread
    public final void zaa(ConnectionResult connectionResult) {
        zabk zabkVar = (zabk) this.zaa.zaC().get(this.zac);
        if (zabkVar != null) {
            zabkVar.zab(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacl
    @WorkerThread
    public final void zab(int i7) {
        zabk zabkVar = (zabk) this.zaa.zaC().get(this.zac);
        if (zabkVar != null) {
            if (zabkVar.zaB()) {
                zabkVar.zab(new ConnectionResult(17));
            } else {
                zabkVar.onConnectionSuspended(i7);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacl
    @WorkerThread
    public final void zac(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            zaa(new ConnectionResult(4));
        } else {
            this.zad = iAccountAccessor;
            this.zae = set;
            zad();
        }
    }

    public final /* synthetic */ Api.Client zae() {
        return this.zab;
    }

    public final /* synthetic */ ApiKey zaf() {
        return this.zac;
    }

    public final /* synthetic */ void zag(boolean z3) {
        this.zaf = true;
    }
}
