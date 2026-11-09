package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzew implements ObjectEncoder {
    static final zzew zza = new zzew();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = d.s(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = d.s(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = d.s(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = d.s(10, FieldDescriptor.builder("isAccelerated"));

    private zzew() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
