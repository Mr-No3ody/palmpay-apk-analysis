package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: renamed from: kg.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1824p implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1824p f38870a = new C1824p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38871b = new S("kotlin.Double", c.f37602d);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.decodeDouble());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38871b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeDouble(dDoubleValue);
    }
}
