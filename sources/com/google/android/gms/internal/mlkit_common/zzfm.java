package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfm implements ObjectEncoder {
    static final zzfm zza = new zzfm();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("category"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("classificationConfidence"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("trackingId"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("labelCount"));

    private zzfm() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
