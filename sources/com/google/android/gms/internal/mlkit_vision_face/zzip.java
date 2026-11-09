package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzip implements ObjectEncoder {
    static final zzip zza = new zzip();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = d.v(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = d.v(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = d.v(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = d.v(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = d.v(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = d.v(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = d.v(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzip() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzmv zzmvVar = (zzmv) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzmvVar.zzg());
        objectEncoderContext2.add(zzc, zzmvVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzmvVar.zzj());
        objectEncoderContext2.add(zzf, zzmvVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzmvVar.zza());
        objectEncoderContext2.add(zzj, zzmvVar.zzi());
        objectEncoderContext2.add(zzk, zzmvVar.zzb());
        objectEncoderContext2.add(zzl, zzmvVar.zzd());
        objectEncoderContext2.add(zzm, zzmvVar.zzc());
        objectEncoderContext2.add(zzn, zzmvVar.zze());
        objectEncoderContext2.add(zzo, zzmvVar.zzf());
    }
}
