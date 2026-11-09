package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdt implements ObjectEncoder {
    static final zzdt zza = new zzdt();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = d.u(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = d.u(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = d.u(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = d.u(10, FieldDescriptor.builder("isAccelerated"));

    private zzdt() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
