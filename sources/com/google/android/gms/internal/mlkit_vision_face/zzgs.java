package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgs implements ObjectEncoder {
    static final zzgs zza = new zzgs();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder("name"));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("version"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("source"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("uri"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder(CodePushConstants.PENDING_UPDATE_HASH_KEY));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("modelType"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("size"));
    private static final FieldDescriptor zzi = d.v(8, FieldDescriptor.builder("hasLabelMap"));
    private static final FieldDescriptor zzj = d.v(9, FieldDescriptor.builder("isManifestModel"));

    private zzgs() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
