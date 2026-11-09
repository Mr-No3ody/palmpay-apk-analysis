package p162kg;

import Tf.b;
import Tf.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p133ig.c;

/* JADX INFO: renamed from: kg.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1825q implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1825q f38872a = new C1825q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f38873b = new S("kotlin.time.Duration", c.f37607i);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new Tf.c(Tf.c.f9078b.m59parseIsoStringUwyO8pc(decoder.decodeString()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f38873b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        long j6 = ((Tf.c) obj).f9081a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        b bVar = Tf.c.f9078b;
        StringBuilder sb2 = new StringBuilder();
        if (Tf.c.f(j6)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jI = Tf.c.f(j6) ? Tf.c.i(j6) : j6;
        long jH = Tf.c.h(jI, e.HOURS);
        boolean z3 = false;
        int iH = Tf.c.e(jI) ? 0 : (int) (Tf.c.h(jI, e.MINUTES) % ((long) 60));
        int iH2 = Tf.c.e(jI) ? 0 : (int) (Tf.c.h(jI, e.SECONDS) % ((long) 60));
        int iD = Tf.c.d(jI);
        if (Tf.c.e(j6)) {
            jH = 9999999999999L;
        }
        boolean z8 = jH != 0;
        boolean z10 = (iH2 == 0 && iD == 0) ? false : true;
        if (iH != 0 || (z10 && z8)) {
            z3 = true;
        }
        if (z8) {
            sb2.append(jH);
            sb2.append('H');
        }
        if (z3) {
            sb2.append(iH);
            sb2.append('M');
        }
        if (z10 || (!z8 && !z3)) {
            Tf.c.b(sb2, iH2, iD, 9, "S", true);
        }
        encoder.encodeString(sb2.toString());
    }
}
