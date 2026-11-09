package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzis implements ObjectEncoder {
    static final zzis zza = new zzis();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("language"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("errorCode"));

    private zzis() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
