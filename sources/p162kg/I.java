package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p104gg.c;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f38789a = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f38790b = H.f38788a;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new c("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38790b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new c("'kotlin.Nothing' cannot be serialized");
    }
}
