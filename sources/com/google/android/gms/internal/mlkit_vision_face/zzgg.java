package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgg implements ObjectEncoder {
    static final zzgg zza = new zzgg();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("renderer"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("vendor"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("maxImages"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("maxSsbo"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("workGroupSizes"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("errorCode"));

    private zzgg() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
