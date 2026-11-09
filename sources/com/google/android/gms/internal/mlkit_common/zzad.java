package com.google.android.gms.internal.mlkit_common;

import N8.q0;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad {
    public static String zza(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                string = BuildConfig.TRAVIS;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    StringBuilder sbQ = q0.q("<", str2, " threw ");
                    sbQ.append(e10.getClass().getName());
                    sbQ.append(">");
                    string = sbQ.toString();
                }
            }
            objArr[i10] = string;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(objArr[i7]);
            i7++;
            i11 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i7 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String zzb(@CheckForNull String str) {
        return zzab.zza(str);
    }

    public static boolean zzc(@CheckForNull String str) {
        return zzab.zzb(str);
    }
}
