package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdu implements ObjectEncoder {
    static final zzdu zza = new zzdu();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("cameraSource"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("eventType"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("requestedPreviewHeight"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("requestedPreviewWidth"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("actualPreviewHeight"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("actualPreviewWidth"));

    private zzdu() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
