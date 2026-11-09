package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f38791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f38792b;

    public J(KSerializer serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f38791a = serializer;
        this.f38792b = new U(serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeNotNullMark() ? decoder.decodeSerializableValue(this.f38791a) : decoder.decodeNull();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && J.class == obj.getClass() && Intrinsics.c(this.f38791a, ((J) obj).f38791a);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f38792b;
    }

    public final int hashCode() {
        return this.f38791a.hashCode();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(this.f38791a, obj);
        }
    }
}
