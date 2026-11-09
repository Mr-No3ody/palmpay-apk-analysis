package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzel implements ObjectEncoder {
    static final zzel zza = new zzel();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("hasResult"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("detectedBarcodeFormats"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("detectedBarcodeValueTypes"));

    private zzel() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
