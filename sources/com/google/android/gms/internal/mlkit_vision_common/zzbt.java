package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbt implements ObjectEncoder {
    static final zzbt zza = new zzbt();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("inputsFormats"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("outputFormats"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("options"));

    private zzbt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
