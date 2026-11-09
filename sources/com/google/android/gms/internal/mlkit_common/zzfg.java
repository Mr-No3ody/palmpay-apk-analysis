package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfg implements ObjectEncoder {
    static final zzfg zza = new zzfg();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("modelInfo"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("initialDownloadConditions"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("updateDownloadConditions"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("isModelUpdateEnabled"));

    private zzfg() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, ((zzjp) obj).zza());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, (Object) null);
    }
}
