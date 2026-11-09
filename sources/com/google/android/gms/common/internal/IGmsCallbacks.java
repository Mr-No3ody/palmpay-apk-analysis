package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i7, @NonNull IBinder iBinder, @NonNull Bundle bundle) throws RemoteException;

    void zzb(int i7, @NonNull Bundle bundle) throws RemoteException;

    void zzc(int i7, IBinder iBinder, zzj zzjVar) throws RemoteException;
}
