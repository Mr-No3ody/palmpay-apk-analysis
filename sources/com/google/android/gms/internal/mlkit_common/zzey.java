package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzey implements ObjectEncoder {
    static final zzey zza = new zzey();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("imageSource"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("imageFormat"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("imageByteSize"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("imageWidth"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("imageHeight"));
    private static final FieldDescriptor zzh = d.s(7, FieldDescriptor.builder("rotationDegrees"));

    private zzey() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
