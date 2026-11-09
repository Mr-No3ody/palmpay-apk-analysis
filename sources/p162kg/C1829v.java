package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: renamed from: kg.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1829v implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1829v f38882a = new C1829v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38883b = new S("kotlin.Float", c.f37603e);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.decodeFloat());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38883b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeFloat(fFloatValue);
    }
}
