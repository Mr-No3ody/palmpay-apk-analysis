package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhf implements ObjectEncoder {
    static final zzhf zza = new zzhf();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("detectorOptions"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("contourDetectedFaces"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("nonContourDetectedFaces"));

    private zzhf() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzll zzllVar = (zzll) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzllVar.zzc());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zzllVar.zzb());
        objectEncoderContext2.add(zze, zzllVar.zza());
        objectEncoderContext2.add(zzf, zzllVar.zzd());
        objectEncoderContext2.add(zzg, zzllVar.zze());
    }
}
