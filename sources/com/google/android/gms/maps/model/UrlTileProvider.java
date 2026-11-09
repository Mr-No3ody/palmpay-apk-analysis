package com.google.android.gms.maps.model;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int zza;
    private final int zzb;

    public UrlTileProvider(int i7, int i10) {
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    @Nullable
    public final Tile getTile(int i7, int i10, int i11) {
        URL tileUrl = getTileUrl(i7, i10, i11);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzh.zzb(4352);
            int i12 = this.zza;
            int i13 = this.zzb;
            InputStream inputStream = tileUrl.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStream, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int i14 = inputStream.read(bArr);
                if (i14 == -1) {
                    return new Tile(i12, i13, byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i14);
            }
        } catch (IOException unused) {
            return null;
        } finally {
            com.google.android.gms.internal.maps.zzh.zza();
        }
    }

    @Nullable
    public abstract URL getTileUrl(int i7, int i10, int i11);
}
