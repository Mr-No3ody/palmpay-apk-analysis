package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.PinConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class zzi extends zza implements zzk {
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzd() throws RemoteException {
        return d.d(zzJ(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zze(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        return d.d(zzJ(5, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return d.d(zzJ(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzg(Bitmap bitmap) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bitmap);
        return d.d(zzJ(6, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return d.d(zzJ(3, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return d.d(zzJ(7, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzj(PinConfig pinConfig) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, pinConfig);
        return d.d(zzJ(8, parcelZza));
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final IObjectWrapper zzk(int i7) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        return d.d(zzJ(1, parcelZza));
    }
}
