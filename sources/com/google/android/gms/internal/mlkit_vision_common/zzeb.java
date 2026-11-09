package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzeb implements ObjectEncoder {
    static final zzeb zza = new zzeb();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder("options"));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("roughDownloadDurationMs"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("errorCode"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("exactDownloadDurationMs"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("downloadStatus"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("downloadFailureStatus"));
    private static final FieldDescriptor zzh = d.u(7, FieldDescriptor.builder("mddDownloadErrorCodes"));

    private zzeb() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
