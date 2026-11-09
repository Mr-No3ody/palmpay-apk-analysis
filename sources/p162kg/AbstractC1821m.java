package p162kg;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: renamed from: kg.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1821m extends AbstractC1809a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f38862a;

    public AbstractC1821m(KSerializer kSerializer) {
        this.f38862a = kSerializer;
    }

    @Override // p162kg.AbstractC1809a
    public final void g(CompositeDecoder decoder, Object obj, int i7, int i10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i10 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            h(decoder, i7 + i11, obj);
        }
    }

    @Override // p162kg.AbstractC1809a
    public void h(CompositeDecoder decoder, int i7, Object obj) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        k(i7, obj, decoder.decodeSerializableElement(getDescriptor(), i7, this.f38862a, null));
    }

    public abstract void k(int i7, Object obj, Object obj2);

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(descriptor, iE);
        Iterator itD = d(obj);
        for (int i7 = 0; i7 < iE; i7++) {
            compositeEncoderBeginCollection.encodeSerializableElement(getDescriptor(), i7, this.f38862a, itD.next());
        }
        compositeEncoderBeginCollection.endStructure(descriptor);
    }
}
