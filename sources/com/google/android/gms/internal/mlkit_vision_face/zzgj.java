package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgj implements ObjectEncoder {
    static final zzgj zza = new zzgj();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("durationMs"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("isColdCall"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("autoManageModelOnBackground"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("autoManageModelOnLowMemory"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("isNnApiEnabled"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("eventsCount"));
    private static final FieldDescriptor zzi = d.v(8, FieldDescriptor.builder("otherErrors"));
    private static final FieldDescriptor zzj = d.v(9, FieldDescriptor.builder("remoteConfigValueForAcceleration"));
    private static final FieldDescriptor zzk = d.v(10, FieldDescriptor.builder("isAccelerated"));

    private zzgj() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzkl zzklVar = (zzkl) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzklVar.zze());
        objectEncoderContext2.add(zzc, zzklVar.zza());
        objectEncoderContext2.add(zzd, zzklVar.zzd());
        objectEncoderContext2.add(zze, zzklVar.zzb());
        objectEncoderContext2.add(zzf, zzklVar.zzc());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
        objectEncoderContext2.add(zzk, (Object) null);
    }
}
