package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzef implements ObjectEncoder {
    static final zzef zza = new zzef();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("handledErrors"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("partiallyHandledErrors"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("unhandledErrors"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("modelNamespace"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("delegateFilter"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("httpResponseCode"));

    private zzef() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
