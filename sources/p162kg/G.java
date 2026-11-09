package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f38786a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38787b = new S("kotlin.Long", c.f37605g);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.decodeLong());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38787b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeLong(jLongValue);
    }
}
