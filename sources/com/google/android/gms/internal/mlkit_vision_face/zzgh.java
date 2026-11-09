package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgh implements ObjectEncoder {
    static final zzgh zza = new zzgh();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("originalImageSize"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("compressedImageSize"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("isOdmlImage"));

    private zzgh() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzkh zzkhVar = (zzkh) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzkhVar.zza());
        objectEncoderContext2.add(zzc, zzkhVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, (Object) null);
    }
}
