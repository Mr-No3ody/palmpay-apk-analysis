package p176lg;

import io.fastkv.n;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.e;
import p162kg.C1810b;
import p162kg.C1811c;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f39377a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f39378b = f.f39374b;

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        n.b(decoder);
        l elementSerializer = l.f39385a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        C1811c c1811c = new C1811c();
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new e((List) c1811c.f(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f39378b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        e value = (e) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        n.a(encoder);
        l elementSerializer = l.f39385a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        l element = l.f39385a;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        e elementDesc = l.f39386b;
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        C1810b c1810b = new C1810b(elementDesc);
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "<this>");
        int size = value.size();
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(c1810b, size);
        Intrinsics.checkNotNullParameter(value, "<this>");
        Iterator<j> it = value.iterator();
        for (int i7 = 0; i7 < size; i7++) {
            compositeEncoderBeginCollection.encodeSerializableElement(c1810b, i7, element, it.next());
        }
        compositeEncoderBeginCollection.endStructure(c1810b);
    }
}
