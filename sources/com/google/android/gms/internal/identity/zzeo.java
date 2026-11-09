package com.google.android.gms.internal.identity;

import androidx.annotation.GuardedBy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeo {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;

    @GuardedBy("sharedStringBuilder")
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j6) {
        return j6 >= 0 ? zza.format(new Date(j6)) : Long.toString(j6);
    }

    public static String zzb(long j6) {
        String string;
        StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzc(j6, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public static StringBuilder zzc(long j6, StringBuilder sb2) {
        if (j6 == 0) {
            sb2.append("0s");
            return sb2;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z3 = false;
        if (j6 < 0) {
            sb2.append("-");
            if (j6 != Long.MIN_VALUE) {
                j6 = -j6;
            } else {
                j6 = Long.MAX_VALUE;
                z3 = true;
            }
        }
        if (j6 >= 86400000) {
            sb2.append(j6 / 86400000);
            sb2.append("d");
            j6 %= 86400000;
        }
        if (true == z3) {
            j6 = 25975808;
        }
        if (j6 >= 3600000) {
            sb2.append(j6 / 3600000);
            sb2.append("h");
            j6 %= 3600000;
        }
        if (j6 >= 60000) {
            sb2.append(j6 / 60000);
            sb2.append("m");
            j6 %= 60000;
        }
        if (j6 >= 1000) {
            sb2.append(j6 / 1000);
            sb2.append("s");
            j6 %= 1000;
        }
        if (j6 > 0) {
            sb2.append(j6);
            sb2.append("ms");
        }
        return sb2;
    }
}
