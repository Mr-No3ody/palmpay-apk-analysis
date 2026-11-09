package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdn implements ObjectEncoder {
    static final zzdn zza = new zzdn();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("errorCode"));

    private zzdn() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
