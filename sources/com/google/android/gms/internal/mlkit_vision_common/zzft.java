package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzft implements ObjectEncoder {
    static final zzft zza = new zzft();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("pipelineNamespace"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("clientLibraryName"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("clientLibraryVersion"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("minClientLibraryVersion"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("maxClientLibraryVersion"));

    private zzft() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
