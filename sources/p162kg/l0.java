package p162kg;

import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p355xf.H;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f38860a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1830w f38861b;

    static {
        Intrinsics.checkNotNullParameter(I.f38954a, "<this>");
        f38861b = L.a("kotlin.UShort", Y.f38822a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new H(decoder.decodeInline(f38861b).decodeShort());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38861b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        short s3 = ((H) obj).f43953a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(f38861b).encodeShort(s3);
    }
}
