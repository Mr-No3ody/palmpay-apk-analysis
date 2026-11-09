package com.google.android.gms.internal.mlkit_vision_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfu implements ObjectEncoder {
    static final zzfu zza = new zzfu();
    private static final FieldDescriptor zzb = d.u(1, FieldDescriptor.builder(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO));
    private static final FieldDescriptor zzc = d.u(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = d.u(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = d.u(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = d.u(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = d.u(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = d.u(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = d.u(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = d.u(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = d.u(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = d.u(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = d.u(12, FieldDescriptor.builder("elapsedUs"));

    private zzfu() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
