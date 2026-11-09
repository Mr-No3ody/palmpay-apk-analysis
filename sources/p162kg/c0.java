package p162kg;

import kotlin.jvm.internal.C1853c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p355xf.x;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f38830a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1830w f38831b;

    static {
        Intrinsics.checkNotNullParameter(C1853c.f38960a, "<this>");
        f38831b = L.a("kotlin.UByte", C1817i.f38848a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new x(decoder.decodeInline(f38831b).decodeByte());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38831b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        byte b7 = ((x) obj).f43989a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(f38831b).encodeByte(b7);
    }
}
