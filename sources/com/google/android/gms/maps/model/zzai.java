package com.google.android.gms.maps.model;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzay;

/* JADX INFO: loaded from: classes2.dex */
final class zzai extends zzay {
    final /* synthetic */ TileProvider zza;

    public zzai(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzaz
    @Nullable
    public final Tile zzb(int i7, int i10, int i11) {
        return this.zza.getTile(i7, i10, i11);
    }
}
