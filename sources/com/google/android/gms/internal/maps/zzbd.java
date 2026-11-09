package com.google.android.gms.internal.maps;

import C0.G;
import N8.q0;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbd {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strQ;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                strQ = BuildConfig.TRAVIS;
            } else {
                try {
                    strQ = obj.toString();
                } catch (Exception e10) {
                    String strY = q0.y(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strY), (Throwable) e10);
                    strQ = G.q("<", strY, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i10] = strQ;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
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
}
