package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends zza implements zzr {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zzd() throws RemoteException {
        Parcel parcelZzJ = zzJ(1, zza());
        int i7 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final String zze() throws RemoteException {
        Parcel parcelZzJ = zzJ(4, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final String zzf() throws RemoteException {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final String zzg() throws RemoteException {
        Parcel parcelZzJ = zzJ(3, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final Map zzh() throws RemoteException {
        Parcel parcelZzJ = zzJ(5, zza());
        HashMap mapZzc = zzc.zzc(parcelZzJ);
        parcelZzJ.recycle();
        return mapZzc;
    }
}
