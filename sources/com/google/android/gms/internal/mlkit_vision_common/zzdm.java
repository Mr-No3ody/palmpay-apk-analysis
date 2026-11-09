package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdm implements ObjectEncoder {
    static final zzdm zza = new zzdm();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("maxMs"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("minMs"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("avgMs"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("firstQuartileMs"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("medianMs"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("thirdQuartileMs"));

    private zzdm() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
