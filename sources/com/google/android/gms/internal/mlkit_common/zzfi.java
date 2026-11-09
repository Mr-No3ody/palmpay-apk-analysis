package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfi implements ObjectEncoder {
    static final zzfi zza = new zzfi();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("errorCode"));

    private zzfi() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
