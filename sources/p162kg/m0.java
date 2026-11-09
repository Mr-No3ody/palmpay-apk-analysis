package p162kg;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f38863b = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f38864a = new K(Unit.f38893a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f38864a.deserialize(decoder);
        return Unit.f38893a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f38864a.getDescriptor();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f38864a.serialize(encoder, value);
    }
}
