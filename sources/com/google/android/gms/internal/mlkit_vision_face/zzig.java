package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzig implements ObjectEncoder {
    static final zzig zza = new zzig();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("inputLength"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("outputLength"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("loadDictionaryErrorCode"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("translateResultStatusCode"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = d.v(8, FieldDescriptor.builder("downloadHttpResponseCode"));

    private zzig() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
