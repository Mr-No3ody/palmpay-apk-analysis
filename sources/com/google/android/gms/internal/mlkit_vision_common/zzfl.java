package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfl implements ObjectEncoder {
    static final zzfl zza = new zzfl();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("smartReplies"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("resultStatus"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("suggestionsCount"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("blacklistErrorCode"));

    private zzfl() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
