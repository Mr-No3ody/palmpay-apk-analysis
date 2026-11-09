package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends zza implements zzn {
    public zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzJ = zzJ(16, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final double zzd() throws RemoteException {
        Parcel parcelZzJ = zzJ(6, zza());
        double d2 = parcelZzJ.readDouble();
        parcelZzJ.recycle();
        return d2;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final float zze() throws RemoteException {
        Parcel parcelZzJ = zzJ(8, zza());
        float f10 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final float zzf() throws RemoteException {
        Parcel parcelZzJ = zzJ(14, zza());
        float f10 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzg() throws RemoteException {
        Parcel parcelZzJ = zzJ(12, zza());
        int i7 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzh() throws RemoteException {
        Parcel parcelZzJ = zzJ(10, zza());
        int i7 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzi() throws RemoteException {
        Parcel parcelZzJ = zzJ(18, zza());
        int i7 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final IObjectWrapper zzj() throws RemoteException {
        return d.d(zzJ(24, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final LatLng zzk() throws RemoteException {
        Parcel parcelZzJ = zzJ(4, zza());
        LatLng latLng = (LatLng) zzc.zza(parcelZzJ, LatLng.CREATOR);
        parcelZzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final String zzl() throws RemoteException {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final List zzm() throws RemoteException {
        Parcel parcelZzJ = zzJ(22, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(PatternItem.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzn() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzo(LatLng latLng) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, latLng);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzp(boolean z3) throws RemoteException {
        Parcel parcelZza = zza();
        int i7 = zzc.zza;
        parcelZza.writeInt(z3 ? 1 : 0);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzq(int i7) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzr(double d2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeDouble(d2);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzs(int i7) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzt(List list) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzu(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzv(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzw(boolean z3) throws RemoteException {
        Parcel parcelZza = zza();
        int i7 = zzc.zza;
        parcelZza.writeInt(z3 ? 1 : 0);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzx(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzy(zzn zznVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zznVar);
        Parcel parcelZzJ = zzJ(17, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzz() throws RemoteException {
        Parcel parcelZzJ = zzJ(20, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
