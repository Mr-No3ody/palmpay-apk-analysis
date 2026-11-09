package com.google.android.gms.internal.measurement;

import androidx.camera.camera2.internal.F;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzh {
    static final Locale zza = Locale.ROOT;

    public static String zza(Object obj) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        try {
            if (!obj.getClass().isArray()) {
                String string = obj.toString();
                return string != null ? string : zzf(obj, "toString() returned null");
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            return obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
        } catch (RuntimeException e10) {
            return zze(obj, e10);
        }
    }

    public static void zzb(Formattable formattable, StringBuilder sb2, zzza zzzaVar) {
        int iZzj = zzzaVar.zzj();
        int i7 = iZzj & 162;
        if (i7 != 0) {
            i7 = ((iZzj & 32) != 0 ? 1 : 0) | ((iZzj & 128) != 0 ? 2 : 0) | ((iZzj & 2) != 0 ? 4 : 0);
        }
        int length = sb2.length();
        Formatter formatter = new Formatter(sb2, zza);
        try {
            formattable.formatTo(formatter, i7, zzzaVar.zzf(), zzzaVar.zzg());
        } catch (RuntimeException e10) {
            sb2.setLength(length);
            try {
                formatter.out().append(zze(formattable, e10));
            } catch (IOException unused) {
            }
        }
    }

    public static void zzc(StringBuilder sb2, Number number, zzza zzzaVar) {
        boolean zZzk = zzzaVar.zzk();
        long jLongValue = number.longValue();
        if (number instanceof Long) {
            zzd(sb2, jLongValue, zZzk);
            return;
        }
        if (number instanceof Integer) {
            zzd(sb2, jLongValue & 4294967295L, zZzk);
            return;
        }
        if (number instanceof Byte) {
            zzd(sb2, jLongValue & 255, zZzk);
            return;
        }
        if (number instanceof Short) {
            zzd(sb2, jLongValue & 65535, zZzk);
        } else {
            if (!(number instanceof BigInteger)) {
                throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(number.getClass())));
            }
            String string = ((BigInteger) number).toString(16);
            if (zZzk) {
                string = string.toUpperCase(zza);
            }
            sb2.append(string);
        }
    }

    private static void zzd(StringBuilder sb2, long j6, boolean z3) {
        if (j6 == 0) {
            sb2.append("0");
            return;
        }
        String str = true != z3 ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j6)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb2.append(str.charAt((int) ((j6 >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    private static String zze(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
        }
        return zzf(obj, simpleName);
    }

    private static String zzf(Object obj, String str) {
        String name = obj.getClass().getName();
        int iIdentityHashCode = System.identityHashCode(obj);
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(iIdentityHashCode).length() + 2 + String.valueOf(str).length() + 1);
        sb2.append("{");
        sb2.append(name);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return F.d(sb2, ": ", str, "}");
    }
}
