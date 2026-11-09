package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i7) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        return d.d(zzB(2, parcelZza));
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z3) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z3 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    public final IObjectWrapper zzg(IObjectWrapper iObjectWrapper, String str, int i7) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        return d.d(zzB(4, parcelZza));
    }

    public final int zzh(IObjectWrapper iObjectWrapper, String str, boolean z3) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z3 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    public final int zzi() throws RemoteException {
        Parcel parcelZzB = zzB(6, zza());
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, boolean z3, long j6) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z3 ? 1 : 0);
        parcelZza.writeLong(j6);
        return d.d(zzB(7, parcelZza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, int i7, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return d.d(zzB(8, parcelZza));
    }
}
