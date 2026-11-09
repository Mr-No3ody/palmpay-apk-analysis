package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb extends com.google.android.gms.internal.maps.zza implements ICameraUpdateFactoryDelegate {
    public zzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, cameraPosition);
        return d.d(zzJ(7, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLng(LatLng latLng) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLng);
        return d.d(zzJ(8, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i7) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLngBounds);
        parcelZza.writeInt(i7);
        return d.d(zzJ(10, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i7, int i10, int i11) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLngBounds);
        parcelZza.writeInt(i7);
        parcelZza.writeInt(i10);
        parcelZza.writeInt(i11);
        return d.d(zzJ(11, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngZoom(LatLng latLng, float f10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLng);
        parcelZza.writeFloat(f10);
        return d.d(zzJ(9, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper scrollBy(float f10, float f11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        parcelZza.writeFloat(f11);
        return d.d(zzJ(3, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomBy(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        return d.d(zzJ(5, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomByWithFocus(float f10, int i7, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        parcelZza.writeInt(i7);
        parcelZza.writeInt(i10);
        return d.d(zzJ(6, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomIn() throws RemoteException {
        return d.d(zzJ(1, zza()));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomOut() throws RemoteException {
        return d.d(zzJ(2, zza()));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomTo(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        return d.d(zzJ(4, parcelZza));
    }
}
