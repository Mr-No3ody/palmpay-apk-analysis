package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzda implements ValueEncoderContext {
    private boolean zza = false;
    private boolean zzb = false;
    private FieldDescriptor zzc;
    private final zzcw zzd;

    public zzda(zzcw zzcwVar) {
        this.zzd = zzcwVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(double d2) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d2, this.zzb);
        return this;
    }

    public final void zza(FieldDescriptor fieldDescriptor, boolean z3) {
        this.zza = false;
        this.zzc = fieldDescriptor;
        this.zzb = z3;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(float f10) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f10, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(int i7) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i7, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(long j6) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j6, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@Nullable String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(boolean z3) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z3 ? 1 : 0, this.zzb);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public final ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
