package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: loaded from: classes2.dex */
public final class zzax extends zza implements zzaz {
    public zzax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaz
    public final Tile zzb(int i7, int i10, int i11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        parcelZza.writeInt(i10);
        parcelZza.writeInt(i11);
        Parcel parcelZzJ = zzJ(1, parcelZza);
        Tile tile = (Tile) zzc.zza(parcelZzJ, Tile.CREATOR);
        parcelZzJ.recycle();
        return tile;
    }
}
