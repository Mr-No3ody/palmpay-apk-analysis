package p176lg;

import Af.e;
import Af.f;
import Af.h;
import Af.k;
import io.fastkv.n;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.s;
import kotlin.text.x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;
import p162kg.S;
import p162kg.T;
import p162kg.i0;
import p355xf.D;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f39390a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f39391b;

    static {
        c kind = c.f37607i;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.F("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        e eVar = T.f38815a;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Object it = ((k) T.f38815a.values()).iterator();
        while (((h) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((f) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(kSerializer.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(s.b("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + G.a(kSerializer.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f39391b = new S("kotlinx.serialization.json.JsonLiteral", kind);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        j jVarDecodeJsonElement = n.b(decoder).decodeJsonElement();
        if (jVarDecodeJsonElement instanceof n) {
            return (n) jVarDecodeJsonElement;
        }
        throw p191mg.k.b(jVarDecodeJsonElement.toString(), -1, "Unexpected JSON element, expected JsonLiteral, had " + G.a(jVarDecodeJsonElement.getClass()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f39391b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Boolean bool;
        n value = (n) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        n.a(encoder);
        boolean z3 = value.f39388a;
        String str = value.f39389b;
        if (z3) {
            encoder.encodeString(str);
            return;
        }
        Long lU = StringsKt.U(str);
        if (lU != null) {
            encoder.encodeLong(lU.longValue());
            return;
        }
        D dF = kotlin.text.G.f(str);
        if (dF != null) {
            Intrinsics.checkNotNullParameter(D.f43948b, "<this>");
            encoder.encodeInline(i0.f38851b).encodeLong(dF.f43949a);
            return;
        }
        Double dE = x.e(str);
        if (dE != null) {
            encoder.encodeDouble(dE.doubleValue());
            return;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            encoder.encodeBoolean(bool.booleanValue());
        } else {
            encoder.encodeString(str);
        }
    }
}
