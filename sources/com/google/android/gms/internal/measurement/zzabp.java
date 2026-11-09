package com.google.android.gms.internal.measurement;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzabp extends zzabn {
    private static final String zza;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            }
        } catch (SecurityException unused) {
        }
        zza = property;
    }

    public static int zze(String str, int i7) throws zzabo {
        while (i7 < str.length()) {
            int i10 = i7 + 1;
            if (str.charAt(i7) != '%') {
                i7 = i10;
            } else {
                if (i10 >= str.length()) {
                    throw zzabo.zzc("trailing unquoted '%' character", str, i7);
                }
                char cCharAt = str.charAt(i10);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i7;
                }
                i7 += 2;
            }
        }
        return -1;
    }

    public abstract int zzb(zzabm zzabmVar, int i7, String str, int i10, int i11, int i12) throws zzabo;

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void zzc(zzabm zzabmVar) throws zzabo {
        int i7;
        char cCharAt;
        int i10;
        int i11;
        int i12;
        int i13;
        String strZzi = zzabmVar.zzi();
        int iZze = zze(strZzi, 0);
        int i14 = 0;
        int i15 = -1;
        while (iZze >= 0) {
            int i16 = iZze + 1;
            int i17 = i16;
            int i18 = 0;
            while (true) {
                if (i17 >= strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                i7 = i17 + 1;
                cCharAt = strZzi.charAt(i17);
                char c6 = (char) (cCharAt - '0');
                if (c6 < '\n') {
                    i18 = (i18 * 10) + c6;
                    if (i18 >= 1000000) {
                        throw zzabo.zza("index too large", strZzi, iZze, i7);
                    }
                    i17 = i7;
                }
            }
            if (cCharAt == '$') {
                if (i17 - i16 == 0) {
                    throw zzabo.zza("missing index", strZzi, iZze, i7);
                }
                if (strZzi.charAt(i16) == '0') {
                    throw zzabo.zza("index has leading zero", strZzi, iZze, i7);
                }
                int i19 = i18 - 1;
                if (i7 == strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                strZzi.charAt(i7);
                i13 = i14;
                i12 = i17 + 2;
                i10 = i7;
                i11 = i19;
            } else if (cCharAt != '<') {
                int i20 = i14 + 1;
                i10 = i16;
                i11 = i14;
                i12 = i7;
                i13 = i20;
            } else {
                if (i15 == -1) {
                    throw zzabo.zza("invalid relative parameter", strZzi, iZze, i7);
                }
                if (i7 == strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                strZzi.charAt(i7);
                i13 = i14;
                i12 = i17 + 2;
                i10 = i7;
                i11 = i15;
            }
            int i21 = i12 - 1;
            while (true) {
                if (i21 >= strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                if (((char) ((strZzi.charAt(i21) & (-33)) - 65)) < 26) {
                    break;
                } else {
                    i21++;
                }
            }
            zzabm zzabmVar2 = zzabmVar;
            iZze = zze(strZzi, zzb(zzabmVar2, i11, strZzi, iZze, i10, i21));
            zzabmVar = zzabmVar2;
            i15 = i11;
            i14 = i13;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void zzd(StringBuilder sb2, String str, int i7, int i10) {
        int i11 = i7;
        while (i7 < i10) {
            int i12 = i7 + 1;
            if (str.charAt(i7) == '%') {
                if (i12 == i10) {
                    break;
                }
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%') {
                    sb2.append((CharSequence) str, i11, i12);
                } else if (cCharAt == 'n') {
                    sb2.append((CharSequence) str, i11, i7);
                    sb2.append(zza);
                }
                i11 = i7 + 2;
                i7 = i11;
            }
            i7 = i12;
        }
        if (i11 < i10) {
            sb2.append((CharSequence) str, i11, i10);
        }
    }
}
