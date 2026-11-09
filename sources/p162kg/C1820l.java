package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: renamed from: kg.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1820l implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1820l f38858a = new C1820l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38859b = new S("kotlin.Char", c.f37601c);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.decodeChar());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38859b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeChar(cCharValue);
    }
}
