package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfa implements ObjectEncoder {
    static final zzfa zza = new zzfa();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("detectorMode"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("multipleObjectsEnabled"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("classificationEnabled"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("maxPerObjectLabelCount"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("classificationConfidenceThreshold"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("customLocalModelOptions"));

    private zzfa() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
