package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgc implements ObjectEncoder {
    static final zzgc zza = new zzgc();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzgc() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzjv zzjvVar = (zzjv) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzjvVar.zzc());
        objectEncoderContext2.add(zzc, zzjvVar.zze());
        objectEncoderContext2.add(zzd, zzjvVar.zza());
        objectEncoderContext2.add(zze, zzjvVar.zzb());
        objectEncoderContext2.add(zzf, zzjvVar.zzd());
        objectEncoderContext2.add(zzg, zzjvVar.zzf());
    }
}
