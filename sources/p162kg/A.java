package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f38776a = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38777b = new S("kotlin.Int", c.f37604f);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.decodeInt());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38777b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInt(iIntValue);
    }
}
