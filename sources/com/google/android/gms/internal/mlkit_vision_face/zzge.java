package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzge implements ObjectEncoder {
    static final zzge zza = new zzge();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("landmarkMode"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("classificationMode"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("performanceMode"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("contourMode"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("isTrackingEnabled"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("minFaceSize"));

    private zzge() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzkd zzkdVar = (zzkd) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzkdVar.zzc());
        objectEncoderContext2.add(zzc, zzkdVar.zza());
        objectEncoderContext2.add(zzd, zzkdVar.zzd());
        objectEncoderContext2.add(zze, zzkdVar.zzb());
        objectEncoderContext2.add(zzf, zzkdVar.zze());
        objectEncoderContext2.add(zzg, zzkdVar.zzf());
    }
}
