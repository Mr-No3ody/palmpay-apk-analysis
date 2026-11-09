package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: renamed from: kg.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1814f implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1814f f38838a = new C1814f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38839b = new S("kotlin.Boolean", c.f37599a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.decodeBoolean());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38839b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeBoolean(zBooleanValue);
    }
}
