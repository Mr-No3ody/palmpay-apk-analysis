package com.google.android.gms.internal.mlkit_common;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgx implements ObjectEncoder {
    static final zzgx zza = new zzgx();
    private static final FieldDescriptor zzb = d.s(1, FieldDescriptor.builder(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO));
    private static final FieldDescriptor zzc = d.s(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = d.s(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = d.s(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = d.s(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = d.s(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = d.s(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = d.s(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = d.s(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = d.s(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = d.s(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = d.s(12, FieldDescriptor.builder("elapsedUs"));

    private zzgx() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
