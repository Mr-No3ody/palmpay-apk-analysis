package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: renamed from: kg.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1817i implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1817i f38848a = new C1817i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38849b = new S("kotlin.Byte", c.f37600b);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.decodeByte());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38849b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeByte(bByteValue);
    }
}
