package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: loaded from: classes2.dex */
public interface zzaz extends IInterface {
    @Nullable
    Tile zzb(int i7, int i10, int i11) throws RemoteException;
}
