package com.google.android.gms.maps;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzh extends com.google.android.gms.maps.internal.zzay {
    final /* synthetic */ GoogleMap.OnMyLocationButtonClickListener zza;

    public zzh(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.zza = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaz
    public final boolean zzb() throws RemoteException {
        return this.zza.onMyLocationButtonClick();
    }
}
