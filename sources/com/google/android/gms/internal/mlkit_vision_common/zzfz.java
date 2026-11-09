package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfz implements ObjectEncoder {
    static final zzfz zza = new zzfz();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = d.u(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = d.u(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = d.u(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = d.u(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = d.u(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = d.u(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = d.u(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = d.u(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzfz() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzjq zzjqVar = (zzjq) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzjqVar.zzg());
        objectEncoderContext2.add(zzc, zzjqVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzjqVar.zzj());
        objectEncoderContext2.add(zzf, zzjqVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzjqVar.zza());
        objectEncoderContext2.add(zzj, zzjqVar.zzi());
        objectEncoderContext2.add(zzk, zzjqVar.zzb());
        objectEncoderContext2.add(zzl, zzjqVar.zzd());
        objectEncoderContext2.add(zzm, zzjqVar.zzc());
        objectEncoderContext2.add(zzn, zzjqVar.zze());
        objectEncoderContext2.add(zzo, zzjqVar.zzf());
    }
}
