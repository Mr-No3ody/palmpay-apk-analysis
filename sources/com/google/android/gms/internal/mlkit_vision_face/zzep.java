package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzep implements ObjectEncoder {
    static final zzep zza = new zzep();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("detectorOptions"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("contourDetectedFaces"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("nonContourDetectedFaces"));

    private zzep() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzdn zzdnVar = (zzdn) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzdnVar.zzb());
        objectEncoderContext2.add(zzc, zzdnVar.zzc());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzdnVar.zza());
        objectEncoderContext2.add(zzf, zzdnVar.zzd());
        objectEncoderContext2.add(zzg, zzdnVar.zze());
    }
}
