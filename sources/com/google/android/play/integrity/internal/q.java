package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q extends b implements r {
    public q() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
        c.b(parcel);
        b(bundle);
        return true;
    }
}
