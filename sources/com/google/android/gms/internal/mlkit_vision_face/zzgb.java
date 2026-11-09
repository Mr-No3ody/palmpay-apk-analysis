package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgb implements ObjectEncoder {
    static final zzgb zza = new zzgb();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("osBuild"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("brand"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("device"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("hardware"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("manufacturer"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("model"));
    private static final FieldDescriptor zzi = d.v(8, FieldDescriptor.builder("product"));
    private static final FieldDescriptor zzj = d.v(9, FieldDescriptor.builder("soc"));
    private static final FieldDescriptor zzk = d.v(10, FieldDescriptor.builder("socMetaBuildId"));

    private zzgb() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
