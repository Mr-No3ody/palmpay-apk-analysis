package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdv implements ObjectEncoder {
    static final zzdv zza = new zzdv();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("imageSource"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("imageByteSize"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("imageWidth"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("imageHeight"));
    private static final FieldDescriptor zzh = d.u(7, FieldDescriptor.builder("rotationDegrees"));

    private zzdv() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzhn zzhnVar = (zzhn) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzhnVar.zzg());
        objectEncoderContext2.add(zzc, zzhnVar.zzb());
        objectEncoderContext2.add(zzd, zzhnVar.zza());
        objectEncoderContext2.add(zze, zzhnVar.zzc());
        objectEncoderContext2.add(zzf, zzhnVar.zze());
        objectEncoderContext2.add(zzg, zzhnVar.zzd());
        objectEncoderContext2.add(zzh, zzhnVar.zzf());
    }
}
