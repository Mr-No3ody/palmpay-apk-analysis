package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzij implements ObjectEncoder {
    static final zzij zza = new zzij();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("pipelineNamespace"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("clientLibraryName"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("clientLibraryVersion"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("minClientLibraryVersion"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("maxClientLibraryVersion"));

    private zzij() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
