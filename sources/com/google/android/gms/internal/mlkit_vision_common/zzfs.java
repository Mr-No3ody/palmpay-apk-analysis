package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfs implements ObjectEncoder {
    static final zzfs zza = new zzfs();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("stages"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("runMiniBenchmark"));

    private zzfs() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
