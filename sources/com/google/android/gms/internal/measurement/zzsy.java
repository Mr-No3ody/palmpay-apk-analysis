package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzsy implements zzsx {
    public abstract zzsx zzb();

    public Uri zzf(Uri uri) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream zzj(Uri uri) throws IOException {
        return zzb().zzj(zzf(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzk(Uri uri) throws IOException {
        zzb().zzk(zzf(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzl(Uri uri, Uri uri2) throws IOException {
        zzb().zzl(zzf(uri), zzf(uri2));
    }
}
