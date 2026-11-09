package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzen implements ObjectEncoder {
    static final zzen zza = new zzen();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("isSuccessful"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("modelName"));

    private zzen() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzih zzihVar = (zzih) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzihVar.zza());
        objectEncoderContext2.add(zzc, zzihVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
