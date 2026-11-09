package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfs implements ObjectEncoder {
    static final zzfs zza = new zzfs();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("detectorOptions"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("contourDetectedFaces"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("nonContourDetectedFaces"));

    private zzfs() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
