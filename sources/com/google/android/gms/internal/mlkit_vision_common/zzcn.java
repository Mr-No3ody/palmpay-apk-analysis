package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzcn implements ObjectEncoder {
    static final zzcn zza = new zzcn();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("modelInitializationMs"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("confidenceThreshold"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("imageInfo"));

    private zzcn() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
