package com.google.android.gms.internal.mlkit_vision_face;

import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzik implements ObjectEncoder {
    static final zzik zza = new zzik();
    private static final FieldDescriptor zzb = d.v(1, FieldDescriptor.builder(CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO));
    private static final FieldDescriptor zzc = d.v(2, FieldDescriptor.builder("nnapiInfo"));
    private static final FieldDescriptor zzd = d.v(3, FieldDescriptor.builder("gpuInfo"));
    private static final FieldDescriptor zze = d.v(4, FieldDescriptor.builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = d.v(5, FieldDescriptor.builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = d.v(6, FieldDescriptor.builder("action"));
    private static final FieldDescriptor zzh = d.v(7, FieldDescriptor.builder("status"));
    private static final FieldDescriptor zzi = d.v(8, FieldDescriptor.builder("customErrors"));
    private static final FieldDescriptor zzj = d.v(9, FieldDescriptor.builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = d.v(10, FieldDescriptor.builder("validationTestResult"));
    private static final FieldDescriptor zzl = d.v(11, FieldDescriptor.builder("timestampUs"));
    private static final FieldDescriptor zzm = d.v(12, FieldDescriptor.builder("elapsedUs"));

    private zzik() {
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
