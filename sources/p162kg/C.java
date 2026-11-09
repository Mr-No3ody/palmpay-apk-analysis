package p162kg;

import androidx.camera.video.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.ranges.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.d;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends AbstractC1809a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f38780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f38781b;

    public C(KSerializer vSerializer) {
        Z kSerializer = Z.f38824a;
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f38780a = vSerializer;
        this.f38781b = new B(Z.f38825b, vSerializer.getDescriptor());
    }

    @Override // p162kg.AbstractC1809a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // p162kg.AbstractC1809a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // p162kg.AbstractC1809a
    public final void c(int i7, Object obj) {
        Intrinsics.checkNotNullParameter((LinkedHashMap) obj, "<this>");
    }

    @Override // p162kg.AbstractC1809a
    public final Iterator d(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // p162kg.AbstractC1809a
    public final int e(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // p162kg.AbstractC1809a
    public final void g(CompositeDecoder decoder, Object obj, int i7, int i10) {
        Map builder = (Map) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i10 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        a aVarE = b.e(b.f(0, i10 * 2), 2);
        int i11 = aVarE.f38977a;
        int i12 = aVarE.f38978b;
        int i13 = aVarE.f38979c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return;
        }
        while (true) {
            k(decoder, i7 + i11, builder, false);
            if (i11 == i12) {
                return;
            } else {
                i11 += i13;
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f38781b;
    }

    @Override // p162kg.AbstractC1809a
    public final /* bridge */ /* synthetic */ void h(CompositeDecoder compositeDecoder, int i7, Object obj) {
        k(compositeDecoder, i7, (Map) obj, true);
    }

    @Override // p162kg.AbstractC1809a
    public final Object i(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // p162kg.AbstractC1809a
    public final Object j(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    public final void k(CompositeDecoder decoder, int i7, Map builder, boolean z3) {
        int iDecodeElementIndex;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Z z8 = Z.f38824a;
        B b7 = this.f38781b;
        Object objDecodeSerializableElement = decoder.decodeSerializableElement(b7, i7, z8, null);
        if (z3) {
            iDecodeElementIndex = decoder.decodeElementIndex(b7);
            if (iDecodeElementIndex != i7 + 1) {
                throw new IllegalArgumentException(u.h(i7, "Value must follow key in a map, index for key: ", iDecodeElementIndex, ", returned index for value: ").toString());
            }
        } else {
            iDecodeElementIndex = i7 + 1;
        }
        boolean zContainsKey = builder.containsKey(objDecodeSerializableElement);
        KSerializer kSerializer = this.f38780a;
        builder.put(objDecodeSerializableElement, (!zContainsKey || (kSerializer.getDescriptor().getKind() instanceof d)) ? decoder.decodeSerializableElement(b7, iDecodeElementIndex, kSerializer, null) : decoder.decodeSerializableElement(b7, iDecodeElementIndex, kSerializer, G.d(builder, objDecodeSerializableElement)));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        B b7 = this.f38781b;
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(b7, iE);
        Iterator itD = d(obj);
        int i7 = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i7 + 1;
            compositeEncoderBeginCollection.encodeSerializableElement(b7, i7, Z.f38824a, key);
            i7 += 2;
            compositeEncoderBeginCollection.encodeSerializableElement(b7, i10, this.f38780a, value);
        }
        compositeEncoderBeginCollection.endStructure(b7);
    }
}
