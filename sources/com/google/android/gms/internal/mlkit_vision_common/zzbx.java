package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbx implements ObjectEncoder {
    static final zzbx zza = new zzbx();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("imageInfo"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("isColdCall"));

    private zzbx() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
