package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zziv implements ObjectEncoder {
    static final zziv zza = new zziv();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("result"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("ok"));

    private zziv() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
