package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzer implements ObjectEncoder {
    static final zzer zza = new zzer();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("landmarkMode"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("classificationMode"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("performanceMode"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("contourMode"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("isTrackingEnabled"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("minFaceSize"));

    private zzer() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
