package com.google.android.gms.measurement.internal;

import N8.q0;
import android.os.Bundle;
import androidx.camera.video.u;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgn {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzgm zzd;

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (Objects.equals(str, strArr[i7])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i7];
                        if (str2 == null) {
                            str2 = strArr2[i7] + "(" + strArr[i7] + ")";
                            strArr3[i7] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzf, zzjm.zza, zza);
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjn.zzb, zzjn.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            return str.startsWith("_exp_") ? q0.k("experiment_id(", str, ")") : zzg(str, zzjo.zzb, zzjo.zza, zzc);
        }
        return str;
    }

    public final String zzd(zzbh zzbhVar) {
        String string;
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbhVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzbhVar.zzc);
        sb2.append(",name=");
        sb2.append(zza(zzbhVar.zza));
        sb2.append(",params=");
        zzbf zzbfVar = zzbhVar.zzb;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !zzgmVar.zza() ? zzbfVar.toString() : zze(zzbfVar.zzf());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String zze(Bundle bundle) {
        String strZzf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbS = u.s("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbS.length() != 8) {
                sbS.append(", ");
            }
            sbS.append(zzb(str));
            sbS.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strZzf = zzf(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strZzf = zzf((Object[]) obj);
            } else {
                strZzf = obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbS.append(strZzf);
        }
        sbS.append("}]");
        return sbS.toString();
    }

    public final String zzf(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbS = u.s("[");
        for (Object obj : objArr) {
            String strZze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (strZze != null) {
                if (sbS.length() != 1) {
                    sbS.append(", ");
                }
                sbS.append(strZze);
            }
        }
        sbS.append("]");
        return sbS.toString();
    }
}
