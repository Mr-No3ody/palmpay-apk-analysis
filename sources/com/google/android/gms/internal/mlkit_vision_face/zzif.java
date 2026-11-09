package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzif implements ObjectEncoder {
    static final zzif zza = new zzif();
    private static final FieldDescriptor zzb = d.v(3, FieldDescriptor.builder("languageOption"));
    private static final FieldDescriptor zzc = d.v(4, FieldDescriptor.builder("isUsingLegacyApi"));
    private static final FieldDescriptor zzd = d.v(5, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.SDK_VERSION));

    private zzif() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
