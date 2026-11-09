package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f38867a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38868b = new S("kotlin.uuid.Uuid", c.f37607i);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Uf.c.f9766c.parse(decoder.decodeString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38868b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Uf.c value = (Uf.c) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.toString());
    }
}
