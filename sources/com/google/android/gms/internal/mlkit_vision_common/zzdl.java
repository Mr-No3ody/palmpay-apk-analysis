package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdl implements ObjectEncoder {
    static final zzdl zza = new zzdl();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("device"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("manufacturer"));
    private static final FieldDescriptor zzh = d.u(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = d.u(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = d.u(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = d.u(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzdl() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
