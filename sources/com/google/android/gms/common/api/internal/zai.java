package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zai {
    public final int zac;

    public zai(int i7) {
        this.zac = i7;
    }

    public static /* synthetic */ Status zai(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(@NonNull Status status);

    public abstract void zae(@NonNull Exception exc);

    public abstract void zaf(@NonNull zaaa zaaaVar, boolean z3);

    public abstract void zag(zabk zabkVar) throws DeadObjectException;
}
