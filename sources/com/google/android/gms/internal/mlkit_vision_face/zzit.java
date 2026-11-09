package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzit implements ObjectEncoder {
    static final zzit zza = new zzit();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("sourceLanguage"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("targetLanguage"));

    private zzit() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
