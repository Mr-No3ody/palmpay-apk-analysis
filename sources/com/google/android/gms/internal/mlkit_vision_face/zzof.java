package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzof implements zznr {
    private final zzku zza;
    private zzmt zzb = new zzmt();
    private final int zzc;

    private zzof(zzku zzkuVar, int i7) {
        this.zza = zzkuVar;
        zzoo.zza();
        this.zzc = i7;
    }

    public static zznr zzf(zzku zzkuVar) {
        return new zzof(zzkuVar, 0);
    }

    public static zznr zzg(zzku zzkuVar, int i7) {
        return new zzof(zzkuVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzb(zzkt zzktVar) {
        this.zza.zzf(zzktVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzc(zzmt zzmtVar) {
        this.zzb = zzmtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final String zzd() {
        zzmv zzmvVarZzf = this.zza.zzj().zzf();
        return (zzmvVarZzf == null || zzac.zzb(zzmvVarZzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzmvVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final byte[] zze(int i7, boolean z3) {
        this.zzb.zzf(Boolean.valueOf(1 == (i7 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzoo.zza();
            if (i7 == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzix.zza).ignoreNullValues(true).build().encode(this.zza.zzj()).getBytes("utf-8");
            }
            zzkw zzkwVarZzj = this.zza.zzj();
            zzcy zzcyVar = new zzcy();
            zzix.zza.configure(zzcyVar);
            return zzcyVar.zza().zza(zzkwVarZzj);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
