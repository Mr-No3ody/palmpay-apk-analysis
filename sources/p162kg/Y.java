package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y f38822a = new Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38823b = new S("kotlin.Short", c.f37606h);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.decodeShort());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38823b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeShort(sShortValue);
    }
}
