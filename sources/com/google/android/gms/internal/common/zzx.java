package com.google.android.gms.internal.common;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzx {
    public static String zza(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i7 >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(zzb(objArr[i7]));
            i10 = iIndexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i7 < length) {
            String str2 = " [";
            while (i7 < objArr.length) {
                sb2.append(str2);
                sb2.append(zzb(objArr[i7]));
                i7++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String zzb(Object obj) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strD = F.d(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strD), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strD.length() + 8 + name2.length() + 1);
            u.x(sb2, "<", strD, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
