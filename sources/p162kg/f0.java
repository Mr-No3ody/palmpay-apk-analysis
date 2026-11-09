package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p355xf.A;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f38840a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1830w f38841b;

    static {
        Intrinsics.checkNotNullParameter(n.f38971a, "<this>");
        f38841b = L.a("kotlin.UInt", A.f38776a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new A(decoder.decodeInline(f38841b).decodeInt());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38841b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        int i7 = ((A) obj).f43946a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(f38841b).encodeInt(i7);
    }
}
