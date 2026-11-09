package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface zztc {
    String zza();

    default InputStream zzb(Uri uri, InputStream inputStream) throws IOException {
        if (inputStream != null) {
            inputStream.close();
        }
        throw new zzsk("wrapForRead not supported by ".concat(String.valueOf(zza())));
    }

    default OutputStream zzc(Uri uri, OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new zzsk("wrapForWrite not supported by ".concat(String.valueOf(zza())));
    }
}
