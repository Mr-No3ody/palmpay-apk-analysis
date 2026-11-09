package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzez implements ObjectEncoder {
    static final zzez zza = new zzez();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("isDownloaded"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("modelName"));

    private zzez() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        zzir zzirVar = (zzir) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(zzb, zzirVar.zza());
        objectEncoderContext2.add(zzc, zzirVar.zzb());
        objectEncoderContext2.add(zzd, (Object) null);
    }
}
