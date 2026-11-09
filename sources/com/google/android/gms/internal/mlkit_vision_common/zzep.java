package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzep implements ObjectEncoder {
    static final zzep zza = new zzep();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("detectorOptions"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("contourDetectedFaces"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("nonContourDetectedFaces"));

    private zzep() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
