package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhc implements ObjectEncoder {
    static final zzhc zza = new zzhc();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_ID));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.APP_VERSION));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("firebaseProjectId"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("mlSdkVersion"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("tfliteSchemaVersion"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("gcmSenderId"));
    private static final FieldDescriptor zzh = d.s(7, FieldDescriptor.builder("apiKey"));
    private static final FieldDescriptor zzi = d.s(8, FieldDescriptor.builder("languages"));
    private static final FieldDescriptor zzj = d.s(9, FieldDescriptor.builder("mlSdkInstanceId"));
    private static final FieldDescriptor zzk = d.s(10, FieldDescriptor.builder("isClearcutClient"));
    private static final FieldDescriptor zzl = d.s(11, FieldDescriptor.builder("isStandaloneMlkit"));
    private static final FieldDescriptor zzm = d.s(12, FieldDescriptor.builder("isJsonLogging"));
    private static final FieldDescriptor zzn = d.s(13, FieldDescriptor.builder("buildLevel"));
    private static final FieldDescriptor zzo = d.s(14, FieldDescriptor.builder("optionalModuleVersion"));

    private zzhc() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzlg zzlgVar = (zzlg) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzlgVar.zzg());
        objectEncoderContext2.add(zzc, zzlgVar.zzh());
        objectEncoderContext2.add(zzd, (Object) null);
        objectEncoderContext2.add(zze, zzlgVar.zzj());
        objectEncoderContext2.add(zzf, zzlgVar.zzk());
        objectEncoderContext2.add(zzg, (Object) null);
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, zzlgVar.zza());
        objectEncoderContext2.add(zzj, zzlgVar.zzi());
        objectEncoderContext2.add(zzk, zzlgVar.zzb());
        objectEncoderContext2.add(zzl, zzlgVar.zzd());
        objectEncoderContext2.add(zzm, zzlgVar.zzc());
        objectEncoderContext2.add(zzn, zzlgVar.zze());
        objectEncoderContext2.add(zzo, zzlgVar.zzf());
    }
}
