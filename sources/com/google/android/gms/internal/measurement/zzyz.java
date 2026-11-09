package com.google.android.gms.internal.measurement;

import androidx.camera.video.u;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyz {
    public static final zzyz zza;
    public static final zzyz zzb;
    public static final zzyz zzc;
    public static final zzyz zzd;
    public static final zzyz zze;
    public static final zzyz zzf;
    public static final zzyz zzg;
    public static final zzyz zzh;
    public static final zzyz zzi;
    public static final zzyz zzj;
    private static final zzyz[] zzk;
    private static final /* synthetic */ zzyz[] zzp;
    private final char zzl;
    private final zzzb zzm;
    private final int zzn;
    private final String zzo;

    static {
        zzyz zzyzVar = new zzyz("STRING", 0, 's', zzzb.GENERAL, "-#", true);
        zza = zzyzVar;
        zzyz zzyzVar2 = new zzyz("BOOLEAN", 1, 'b', zzzb.BOOLEAN, "-", true);
        zzb = zzyzVar2;
        zzyz zzyzVar3 = new zzyz("CHAR", 2, 'c', zzzb.CHARACTER, "-", true);
        zzc = zzyzVar3;
        zzzb zzzbVar = zzzb.INTEGRAL;
        zzyz zzyzVar4 = new zzyz("DECIMAL", 3, 'd', zzzbVar, "-0+ ,(", false);
        zzd = zzyzVar4;
        zzyz zzyzVar5 = new zzyz("OCTAL", 4, 'o', zzzbVar, "-#0(", false);
        zze = zzyzVar5;
        zzyz zzyzVar6 = new zzyz("HEX", 5, 'x', zzzbVar, "-#0(", true);
        zzf = zzyzVar6;
        zzzb zzzbVar2 = zzzb.FLOAT;
        zzyz zzyzVar7 = new zzyz("FLOAT", 6, 'f', zzzbVar2, "-#0+ ,(", false);
        zzg = zzyzVar7;
        zzyz zzyzVar8 = new zzyz("EXPONENT", 7, 'e', zzzbVar2, "-#0+ (", true);
        zzh = zzyzVar8;
        zzyz zzyzVar9 = new zzyz("GENERAL", 8, 'g', zzzbVar2, "-0+ ,(", true);
        zzi = zzyzVar9;
        zzyz zzyzVar10 = new zzyz("EXPONENT_HEX", 9, 'a', zzzbVar2, "-#0+ ", true);
        zzj = zzyzVar10;
        zzp = new zzyz[]{zzyzVar, zzyzVar2, zzyzVar3, zzyzVar4, zzyzVar5, zzyzVar6, zzyzVar7, zzyzVar8, zzyzVar9, zzyzVar10};
        zzk = new zzyz[26];
        for (zzyz zzyzVar11 : values()) {
            zzk[zzf(zzyzVar11.zzl)] = zzyzVar11;
        }
    }

    private zzyz(String str, int i7, char c6, zzzb zzzbVar, String str2, boolean z3) {
        super(str, i7);
        this.zzl = c6;
        this.zzm = zzzbVar;
        this.zzn = zzza.zzc(str2, z3);
        this.zzo = u.p(new StringBuilder(String.valueOf(c6).length() + 1), "%", c6);
    }

    public static zzyz[] values() {
        return (zzyz[]) zzp.clone();
    }

    public static zzyz zza(char c6) {
        zzyz zzyzVar = zzk[zzf(c6)];
        if ((c6 & ' ') != 0) {
            return zzyzVar;
        }
        if (zzyzVar == null || (zzyzVar.zzn & 128) == 0) {
            return null;
        }
        return zzyzVar;
    }

    private static int zzf(char c6) {
        return (c6 | ' ') - 97;
    }

    public final char zzb() {
        return this.zzl;
    }

    public final zzzb zzc() {
        return this.zzm;
    }

    public final int zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzo;
    }
}
