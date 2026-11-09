package p176lg;

import androidx.camera.core.impl.utils.n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p051d9.C1624v;
import p133ig.e;
import p133ig.f;
import p191mg.h;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f39392a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f39393b = n.c("kotlinx.serialization.json.JsonNull", f.f37621b, new SerialDescriptor[0], new C1624v(21));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        io.fastkv.n.b(decoder);
        if (decoder.decodeNotNullMark()) {
            Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
            throw new h("Expected 'null' literal");
        }
        decoder.decodeNull();
        return p.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f39393b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        p value = (p) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        io.fastkv.n.a(encoder);
        encoder.encodeNull();
    }
}
