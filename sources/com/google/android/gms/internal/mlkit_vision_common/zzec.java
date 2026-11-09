package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzec implements ObjectEncoder {
    static final zzec zza = new zzec();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder(CodePushConstants.PENDING_UPDATE_HASH_KEY));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = d.u(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = d.u(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = d.u(9, FieldDescriptor.builder("isManifestModel"));

    private zzec() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
