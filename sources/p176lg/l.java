package p176lg;

import androidx.camera.core.impl.utils.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.b;
import p133ig.e;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f39385a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f39386b = n.c("kotlinx.serialization.json.JsonElement", b.f37598a, new SerialDescriptor[0], new D(1));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return io.fastkv.n.b(decoder).decodeJsonElement();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f39386b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        j value = (j) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        io.fastkv.n.a(encoder);
        if (value instanceof w) {
            encoder.encodeSerializableValue(x.f39400a, value);
        } else if (value instanceof s) {
            encoder.encodeSerializableValue(u.f39398a, value);
        } else {
            if (!(value instanceof e)) {
                throw new p355xf.l();
            }
            encoder.encodeSerializableValue(g.f39377a, value);
        }
    }
}
