package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfe implements ObjectEncoder {
    static final zzfe zza = new zzfe();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("downloadStatus"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = d.s(7, FieldDescriptor.builder("mddDownloadErrorCodes"));

    private zzfe() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzjg zzjgVar = (zzjg) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzjgVar.zzc());
        objectEncoderContext2.add(zzc, zzjgVar.zzf());
        objectEncoderContext2.add(zzd, zzjgVar.zza());
        objectEncoderContext2.add(zze, zzjgVar.zze());
        objectEncoderContext2.add(zzf, zzjgVar.zzb());
        objectEncoderContext2.add(zzg, zzjgVar.zzd());
        objectEncoderContext2.add(zzh, (Object) null);
    }
}
