package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgt implements ObjectEncoder {
    static final zzgt zza = new zzgt();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("inputLength"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("outputLength"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("loadDictionaryErrorCode"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("translateResultStatusCode"));
    private static final FieldDescriptor zzh = d.s(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = d.s(8, FieldDescriptor.builder("downloadHttpResponseCode"));

    private zzgt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
