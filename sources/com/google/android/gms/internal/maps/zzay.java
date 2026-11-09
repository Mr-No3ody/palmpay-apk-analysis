package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzay extends zzb implements zzaz {
    public zzay() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static zzaz zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzaz ? (zzaz) iInterfaceQueryLocalInterface : new zzax(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        int i11 = parcel.readInt();
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        zzc.zzd(parcel);
        Tile tileZzb = zzb(i11, i12, i13);
        parcel2.writeNoException();
        zzc.zzf(parcel2, tileZzb);
        return true;
    }
}
