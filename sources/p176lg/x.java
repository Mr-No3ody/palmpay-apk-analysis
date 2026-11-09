package p176lg;

import androidx.camera.core.impl.utils.n;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p051d9.C1624v;
import p133ig.c;
import p133ig.e;
import p191mg.k;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f39400a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f39401b = n.c("kotlinx.serialization.json.JsonPrimitive", c.f37607i, new SerialDescriptor[0], new C1624v(21));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        j jVarDecodeJsonElement = io.fastkv.n.b(decoder).decodeJsonElement();
        if (jVarDecodeJsonElement instanceof w) {
            return (w) jVarDecodeJsonElement;
        }
        throw k.b(jVarDecodeJsonElement.toString(), -1, "Unexpected JSON element, expected JsonPrimitive, had " + G.a(jVarDecodeJsonElement.getClass()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f39401b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        w value = (w) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        io.fastkv.n.a(encoder);
        if (value instanceof p) {
            encoder.encodeSerializableValue(q.f39392a, p.INSTANCE);
        } else {
            encoder.encodeSerializableValue(o.f39390a, (n) value);
        }
    }
}
