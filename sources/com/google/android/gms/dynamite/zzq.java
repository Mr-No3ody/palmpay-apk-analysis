package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i7, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return d.d(zzB(2, parcelZza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i7, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return d.d(zzB(3, parcelZza));
    }
}
