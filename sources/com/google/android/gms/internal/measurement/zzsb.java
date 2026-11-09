package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsb {
    private final Uri.Builder zza = new Uri.Builder().scheme("file").authority("").path("/");
    private final ImmutableList.Builder zzb = ImmutableList.builder();

    private zzsb() {
    }

    public final zzsb zza(File file) {
        this.zza.path(file.getAbsolutePath());
        return this;
    }

    public final Uri zzb() {
        return this.zza.encodedFragment(zzsp.zzb(this.zzb.build())).build();
    }

    public /* synthetic */ zzsb(byte[] bArr) {
    }
}
