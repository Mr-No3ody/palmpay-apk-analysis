package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.alibaba.android.arouter.utils.Consts;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzvn implements zzws {
    private final zzws zza;
    private final UUID zzb;
    private final String zzc;
    private final String zzd;
    private Thread zze;

    public zzvn(String str, zzws zzwsVar, zzwq zzwqVar) {
        this.zzd = (String) Preconditions.checkNotNull(str);
        this.zza = zzwsVar;
        this.zzb = zzwsVar.zzc();
        this.zzc = zzwsVar.zzd();
        zzxb zzxbVar = zzwqVar.zzc;
        this.zze = Thread.currentThread();
    }

    public static String zzcL(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // com.google.android.gms.internal.measurement.zzwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i7 = zzvy.zzb;
        Preconditions.checkNotNull(this);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVar = zzwqVarZzd.zzb;
        if (zzwsVar == null) {
            String strZze = zze();
            throw new zzvv(F.d(new StringBuilder(String.valueOf(strZze).length() + 101), "Tried to end [", strZze, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == zzwsVar) {
            zzvy.zzc(zzwqVarZzd, zzwsVar.zzb());
            this.zze = null;
            return;
        }
        String strZze2 = zze();
        String strZze3 = zzwsVar.zze();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZze2).length() + 79 + String.valueOf(strZze3).length() + 1);
        u.x(sb2, "Tried to end span ", strZze2, ", but that span is not the current span. The current span is ", strZze3);
        sb2.append(Consts.DOT);
        throw new zzvw(sb2.toString());
    }

    public final String toString() {
        int i7 = zzvy.zzb;
        zzws zzwsVarZzb = this;
        int i10 = 0;
        int length = 0;
        while (zzwsVarZzb != null) {
            i10++;
            length += zzwsVarZzb.zze().length();
            zzwsVarZzb = zzwsVarZzb.zzb();
            if (zzwsVarZzb != null) {
                length += 4;
            }
        }
        if (i10 > 250) {
            String[] strArr = new String[i10];
            zzws zzwsVarZzb2 = this;
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                strArr[i11] = zzwsVarZzb2.zze();
                zzwsVarZzb2 = zzwsVarZzb2.zzb();
            }
            ImmutableMap.Builder builder = ImmutableMap.builder();
            UnmodifiableIterator it = ImmutableSet.copyOf(strArr).iterator();
            int i12 = 0;
            while (it.hasNext()) {
                builder.put(it.next(), Integer.valueOf(i12));
                i12++;
            }
            ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
            int i13 = i10 >> 2;
            zzwo zzwoVar = null;
            if (immutableMapBuildOrThrow.size() <= i13) {
                int[] iArr = new int[i10 + 1];
                for (int i14 = 0; i14 < i10; i14++) {
                    iArr[i14] = ((Integer) immutableMapBuildOrThrow.get(strArr[i14])).intValue();
                }
                iArr[i10] = immutableMapBuildOrThrow.size();
                zzwo zzwoVarZzd = zzwp.zza(iArr).zzd();
                if ((zzwoVarZzd.zzb - zzwoVarZzd.zza) * zzwoVarZzd.zzc >= i13) {
                    zzwoVar = zzwoVarZzd;
                }
            }
            String strConcat = "";
            if (zzwoVar != null) {
                int i15 = zzwoVar.zza;
                String strConcat2 = i15 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i15))).concat(" -> ") : "";
                int i16 = zzwoVar.zzb;
                int i17 = zzwoVar.zzc;
                int i18 = ((i16 - i15) * i17) + i15;
                strConcat = i18 < i10 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i18, i10)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i15, i16));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i17 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        zzws zzwsVarZzb3 = this;
        while (zzwsVarZzb3 != null) {
            String strZze = zzwsVarZzb3.zze();
            length -= strZze.length();
            strZze.getChars(0, strZze.length(), cArr, length);
            zzwsVarZzb3 = zzwsVarZzb3.zzb();
            if (zzwsVarZzb3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final Thread zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final UUID zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zze() {
        return this.zzd;
    }

    public zzvn(String str, UUID uuid, String str2, zzwq zzwqVar) {
        this.zzd = (String) Preconditions.checkNotNull(str);
        this.zza = null;
        this.zzb = uuid;
        this.zzc = str2;
        zzxb zzxbVar = zzwqVar.zzc;
        this.zze = Thread.currentThread();
    }
}
