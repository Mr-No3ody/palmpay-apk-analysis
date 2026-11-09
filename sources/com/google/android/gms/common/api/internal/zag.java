package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class zag extends zac {
    private final TaskApiCall zaa;
    private final TaskCompletionSource zab;
    private final StatusExceptionMapper zad;

    public zag(int i7, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i7);
        this.zab = taskCompletionSource;
        this.zaa = taskApiCall;
        this.zad = statusExceptionMapper;
        if (i7 == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zaa(zabk zabkVar) {
        return this.zaa.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zab(zabk zabkVar) {
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int zac(zabk zabkVar) {
        return this.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        this.zab.trySetException(this.zad.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        this.zab.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(@NonNull zaaa zaaaVar, boolean z3) {
        zaaaVar.zab(this.zab, z3);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(zabk zabkVar) throws DeadObjectException {
        try {
            this.zaa.doExecute(zabkVar.zaf(), this.zab);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            zad(zai.zai(e11));
        } catch (RuntimeException e12) {
            this.zab.trySetException(e12);
        }
    }
}
