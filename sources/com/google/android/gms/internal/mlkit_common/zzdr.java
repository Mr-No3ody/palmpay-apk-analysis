package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdr implements ObjectEncoder {
    static final zzdr zza = new zzdr();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("remoteModelOptions"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("localModelOptions"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("errorCodes"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("modelInitializationMs"));

    private zzdr() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
