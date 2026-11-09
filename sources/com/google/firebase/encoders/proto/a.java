package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22978a;

    public /* synthetic */ a(int i7) {
        this.f22978a = i7;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        switch (this.f22978a) {
            case 0:
                ProtobufDataEncoderContext.lambda$static$0((Map.Entry) obj, objectEncoderContext);
                break;
            default:
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext);
                break;
        }
    }
}
