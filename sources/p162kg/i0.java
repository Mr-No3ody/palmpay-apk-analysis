package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p355xf.D;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f38850a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1830w f38851b;

    static {
        Intrinsics.checkNotNullParameter(p.f38972a, "<this>");
        f38851b = L.a("kotlin.ULong", G.f38786a);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new D(decoder.decodeInline(f38851b).decodeLong());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38851b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        long j6 = ((D) obj).f43949a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.encodeInline(f38851b).encodeLong(j6);
    }
}
