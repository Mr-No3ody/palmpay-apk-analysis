package com.google.android.gms.internal.measurement;

import C0.G;
import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrz {
    private final String zza;
    private String zzb = "files";
    private String zzc = "common";
    private final Account zzd = zzsa.zza;
    private String zze = "";
    private final ImmutableList.Builder zzf = ImmutableList.builder();

    public /* synthetic */ zzrz(Context context, byte[] bArr) {
        zzsq.zza(context != null, "Context cannot be null", new Object[0]);
        this.zza = context.getPackageName();
    }

    public final zzrz zza() {
        zzsa.zzb("directboot-files");
        this.zzb = "directboot-files";
        return this;
    }

    public final zzrz zzb(String str) {
        zzsa.zzc(str);
        this.zzc = str;
        return this;
    }

    public final zzrz zzc(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        int i7 = zzsa.zzb;
        this.zze = str;
        return this;
    }

    public final Uri zzd() {
        String strD;
        String str = this.zzb;
        String str2 = this.zzc;
        Account account = zzrv.zza;
        Account account2 = this.zzd;
        zzsq.zza(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        zzsq.zza(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        zzsq.zza(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (zzrv.zza.equals(account2)) {
            strD = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strD = F.d(new StringBuilder(d.c(1, str3) + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = this.zze;
        StringBuilder sb2 = new StringBuilder(strD.length() + String.valueOf(str2).length() + String.valueOf(str).length() + 2 + 1 + 1 + String.valueOf(str5).length());
        u.x(sb2, "/", str, "/", str2);
        return new Uri.Builder().scheme("android").authority(this.zza).path(G.s(sb2, "/", strD, "/", str5)).encodedFragment(zzsp.zzb(this.zzf.build())).build();
    }
}
