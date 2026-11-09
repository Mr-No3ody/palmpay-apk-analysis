package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzeo implements ObjectEncoder {
    static final zzeo zza = new zzeo();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("device"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("manufacturer"));
    private static final FieldDescriptor zzh = d.s(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = d.s(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = d.s(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = d.s(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzeo() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
