package p162kg;

import C0.G;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p068ec.d;
import p104gg.c;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f38793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f38794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38795c;

    public K(Unit objectInstance) {
        Intrinsics.checkNotNullParameter("kotlin.Unit", "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f38793a = objectInstance;
        this.f38794b = z.f38935a;
        this.f38795c = C2131j.a(EnumC2132k.f43970b, new d(this, 6));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (!compositeDecoderBeginStructure.decodeSequentially() && (iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor())) != -1) {
            throw new c(G.m(iDecodeElementIndex, "Unexpected index "));
        }
        Unit unit = Unit.f38893a;
        compositeDecoderBeginStructure.endStructure(descriptor);
        return this.f38793a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f38795c.getValue();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }
}
