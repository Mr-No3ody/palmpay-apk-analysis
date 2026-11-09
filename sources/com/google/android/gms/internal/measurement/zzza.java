package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzza {
    private static final long zza;
    private static final zzza zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
        long jCharAt = 0;
        for (int i7 = 0; i7 < 7; i7++) {
            jCharAt |= (((long) i7) + 1) << ((int) (((long) (" #(+,-0".charAt(i7) - ' ')) * 3));
        }
        zza = jCharAt;
        zzb = new zzza(0, -1, -1);
    }

    private zzza(int i7, int i10, int i11) {
        this.zzc = i7;
        this.zzd = i10;
        this.zze = i11;
    }

    public static zzza zza() {
        return zzb;
    }

    public static zzza zzb(String str, int i7, int i10, boolean z3) throws zzabo {
        if (i7 == i10 && !z3) {
            return zzb;
        }
        int i11 = true != z3 ? 0 : 128;
        while (i7 != i10) {
            int i12 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt < ' ' || cCharAt > '0') {
                if (cCharAt > '9') {
                    throw zzabo.zzb("invalid flag", str, i7);
                }
                int i13 = cCharAt - '0';
                while (i12 != i10) {
                    int i14 = i12 + 1;
                    char cCharAt2 = str.charAt(i12);
                    if (cCharAt2 == '.') {
                        return new zzza(i11, i13, zzn(str, i14, i10));
                    }
                    char c6 = (char) (cCharAt2 - '0');
                    if (c6 >= '\n') {
                        throw zzabo.zzb("invalid width character", str, i12);
                    }
                    i13 = (i13 * 10) + c6;
                    if (i13 > 999999) {
                        throw zzabo.zza("width too large", str, i7, i10);
                    }
                    i12 = i14;
                }
                return new zzza(i11, i13, -1);
            }
            int iZzm = zzm(cCharAt);
            if (iZzm < 0) {
                if (cCharAt == '.') {
                    return new zzza(i11, -1, zzn(str, i12, i10));
                }
                throw zzabo.zzb("invalid flag", str, i7);
            }
            int i15 = 1 << iZzm;
            if ((i11 & i15) != 0) {
                throw zzabo.zzb("repeated flag", str, i7);
            }
            i11 |= i15;
            i7 = i12;
        }
        return new zzza(i11, -1, -1);
    }

    public static int zzc(String str, boolean z3) {
        int i7 = true != z3 ? 0 : 128;
        for (int i10 = 0; i10 < str.length(); i10++) {
            int iZzm = zzm(str.charAt(i10));
            if (iZzm < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i7 |= 1 << iZzm;
        }
        return i7;
    }

    private static int zzm(char c6) {
        return ((int) ((zza >>> ((c6 - ' ') * 3)) & 7)) - 1;
    }

    private static int zzn(String str, int i7, int i10) throws zzabo {
        if (i7 == i10) {
            throw zzabo.zzb("missing precision", str, i7 - 1);
        }
        int i11 = 0;
        for (int i12 = i7; i12 < i10; i12++) {
            char cCharAt = (char) (str.charAt(i12) - '0');
            if (cCharAt >= '\n') {
                throw zzabo.zzb("invalid precision character", str, i12);
            }
            i11 = (i11 * 10) + cCharAt;
            if (i11 > 999999) {
                throw zzabo.zza("precision too large", str, i7, i10);
            }
        }
        if (i11 != 0) {
            return i11;
        }
        if (i10 == i7 + 1) {
            return 0;
        }
        throw zzabo.zza("invalid precision", str, i7, i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzza) {
            zzza zzzaVar = (zzza) obj;
            if (zzzaVar.zzc == this.zzc && zzzaVar.zzd == this.zzd && zzzaVar.zze == this.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzc * 31) + this.zzd) * 31) + this.zze;
    }

    public final zzza zzd(int i7, boolean z3, boolean z8) {
        if (!zze()) {
            int i10 = this.zzc;
            int i11 = i10 & 128;
            if (i11 == 0) {
                return zzb;
            }
            if (i11 != i10 || this.zzd != -1 || this.zze != -1) {
                return new zzza(i11, -1, -1);
            }
        }
        return this;
    }

    public final boolean zze() {
        return this == zzb;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zze;
    }

    public final boolean zzh(int i7, boolean z3) {
        int i10;
        if (zze()) {
            return true;
        }
        int i11 = this.zzc;
        if (((~i7) & i11) != 0) {
            return false;
        }
        if (!z3 && this.zze != -1) {
            return false;
        }
        int i12 = this.zzd;
        if ((i11 & 9) == 9 || (i10 = i11 & 96) == 96) {
            return false;
        }
        return i10 == 0 || i12 != -1;
    }

    public final boolean zzi(zzyz zzyzVar) {
        return zzh(zzyzVar.zzd(), zzyzVar.zzc().zza());
    }

    public final int zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        return (this.zzc & 128) != 0;
    }

    public final StringBuilder zzl(StringBuilder sb2) {
        if (!zze()) {
            int i7 = this.zzc;
            int i10 = 0;
            while (true) {
                int i11 = i7 & (-129);
                int i12 = 1 << i10;
                if (i12 > i11) {
                    break;
                }
                if ((i11 & i12) != 0) {
                    sb2.append(" #(+,-0".charAt(i10));
                }
                i10++;
            }
            int i13 = this.zzd;
            if (i13 != -1) {
                sb2.append(i13);
            }
            int i14 = this.zze;
            if (i14 != -1) {
                sb2.append('.');
                sb2.append(i14);
            }
        }
        return sb2;
    }
}
