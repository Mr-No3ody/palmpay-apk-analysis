package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface TileProvider {

    @NonNull
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    @Nullable
    Tile getTile(int i7, int i10, int i11);
}
