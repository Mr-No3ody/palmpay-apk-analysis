package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbp implements ObjectEncoder {
    static final zzbp zza = new zzbp();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("handledErrors"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("partiallyHandledErrors"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("unhandledErrors"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("modelNamespace"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("delegateFilter"));
    private static final FieldDescriptor zzh = d.u(7, FieldDescriptor.builder("httpResponseCode"));

    private zzbp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
