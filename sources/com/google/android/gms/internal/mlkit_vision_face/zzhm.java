package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhm implements ObjectEncoder {
    static final zzhm zza = new zzhm();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("confidence"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE));

    private zzhm() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
