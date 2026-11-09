package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzff implements ObjectEncoder {
    static final zzff zza = new zzff();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder(CodePushConstants.PENDING_UPDATE_HASH_KEY));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = d.s(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = d.s(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = d.s(9, FieldDescriptor.builder("isManifestModel"));

    private zzff() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzjl zzjlVar = (zzjl) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzjlVar.zzd());
        objectEncoderContext2.add(zzc, (Object) null);
        objectEncoderContext2.add(zzd, zzjlVar.zzb());
        objectEncoderContext2.add(zze, (Object) null);
        objectEncoderContext2.add(zzf, zzjlVar.zzc());
        objectEncoderContext2.add(zzg, zzjlVar.zza());
        objectEncoderContext2.add(zzh, (Object) null);
        objectEncoderContext2.add(zzi, (Object) null);
        objectEncoderContext2.add(zzj, (Object) null);
    }
}
