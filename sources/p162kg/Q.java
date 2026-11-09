package p162kg;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Q extends AbstractC1821m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f38812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f38812b = new P(primitiveSerializer.getDescriptor());
    }

    @Override // p162kg.AbstractC1809a
    public final Object a() {
        return (O) i(l());
    }

    @Override // p162kg.AbstractC1809a
    public final int b(Object obj) {
        O o10 = (O) obj;
        Intrinsics.checkNotNullParameter(o10, "<this>");
        return o10.d();
    }

    @Override // p162kg.AbstractC1809a
    public final void c(int i7, Object obj) {
        O o10 = (O) obj;
        Intrinsics.checkNotNullParameter(o10, "<this>");
        o10.b(i7);
    }

    @Override // p162kg.AbstractC1809a
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p162kg.AbstractC1809a, kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return f(decoder);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f38812b;
    }

    @Override // p162kg.AbstractC1809a
    public final Object j(Object obj) {
        O o10 = (O) obj;
        Intrinsics.checkNotNullParameter(o10, "<this>");
        return o10.a();
    }

    @Override // p162kg.AbstractC1821m
    public final void k(int i7, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter((O) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object l();

    public abstract void m(CompositeEncoder compositeEncoder, Object obj, int i7);

    @Override // p162kg.AbstractC1821m, kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iE = e(obj);
        P p3 = this.f38812b;
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(p3, iE);
        m(compositeEncoderBeginCollection, obj, iE);
        compositeEncoderBeginCollection.endStructure(p3);
    }
}
