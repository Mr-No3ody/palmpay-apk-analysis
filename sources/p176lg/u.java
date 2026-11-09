package p176lg;

import io.fastkv.n;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p162kg.C;
import p162kg.Z;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f39398a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f39399b = t.f39395b;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        n.b(decoder);
        Intrinsics.checkNotNullParameter(J.f38955a, "<this>");
        Z z3 = Z.f38824a;
        l lVar = l.f39385a;
        Z keySerializer = Z.f38824a;
        l valueSerializer = l.f39385a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        C c6 = new C(valueSerializer);
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new s((Map) c6.f(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f39399b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        s value = (s) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        n.a(encoder);
        Intrinsics.checkNotNullParameter(J.f38955a, "<this>");
        Z z3 = Z.f38824a;
        l lVar = l.f39385a;
        Z keySerializer = Z.f38824a;
        l valueSerializer = l.f39385a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        new C(valueSerializer).serialize(encoder, value);
    }
}
