package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfz implements ObjectEncoder {
    static final zzfz zza = new zzfz();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder("confidence"));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE));

    private zzfz() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
