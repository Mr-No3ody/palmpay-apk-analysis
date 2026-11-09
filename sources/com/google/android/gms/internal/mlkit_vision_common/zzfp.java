package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfp implements ObjectEncoder {
    static final zzfp zza = new zzfp();
    private static final FieldDescriptor zzb = d.u(3, FieldDescriptor.builder("languageOption"));
    private static final FieldDescriptor zzc = d.u(4, FieldDescriptor.builder("isUsingLegacyApi"));
    private static final FieldDescriptor zzd = d.u(5, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));

    private zzfp() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
