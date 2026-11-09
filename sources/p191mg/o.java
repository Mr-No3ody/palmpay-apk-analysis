package p191mg;

import C0.G;
import Pa.C0505b;
import androidx.camera.core.impl.utils.n;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.D;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonDecoder;
import p104gg.b;
import p162kg.C1826s;
import p176lg.c;
import p176lg.j;
import p185ma.t;
import p209ng.a;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends n implements JsonDecoder, ChunkedDecoder {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f39743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f39744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f39745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f39746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f39747s;
    public final j t;

    public o(c json, s mode, t lexer, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f39743o = json;
        this.f39744p = mode;
        this.f39745q = lexer;
        this.f39746r = json.f39371b;
        this.f39747s = -1;
        this.t = json.f39370a.f39379a ? null : new j(descriptor);
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder beginStructure(SerialDescriptor sd2) {
        Intrinsics.checkNotNullParameter(sd2, "descriptor");
        c cVar = this.f39743o;
        s sVarJ = k.j(sd2, cVar);
        t tVar = this.f39745q;
        C0505b c0505b = (C0505b) tVar.f39629e;
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i7 = c0505b.f7072b + 1;
        c0505b.f7072b = i7;
        Object[] objArr = (Object[]) c0505b.f7073c;
        if (i7 == objArr.length) {
            int i10 = i7 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            c0505b.f7073c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) c0505b.f7074d, i10);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            c0505b.f7074d = iArrCopyOf;
        }
        ((Object[]) c0505b.f7073c)[i7] = sd2;
        tVar.h(sVarJ.f39766a);
        if (tVar.q() == 4) {
            t.n(tVar, "Unexpected leading comma", 0, 6);
            throw null;
        }
        int iOrdinal = sVarJ.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new o(cVar, sVarJ, tVar, sd2);
        }
        return (this.f39744p == sVarJ && cVar.f39370a.f39379a) ? this : new o(cVar, sVarJ, tVar, sd2);
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        boolean z3;
        boolean z8;
        t tVar = this.f39745q;
        int iT = tVar.t();
        String str = (String) tVar.f39628d;
        if (iT == str.length()) {
            t.n(tVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iT) == '\"') {
            iT++;
            z3 = true;
        } else {
            z3 = false;
        }
        int iR = tVar.r(iT);
        if (iR >= str.length() || iR == -1) {
            t.n(tVar, "EOF", 0, 6);
            throw null;
        }
        int i7 = iR + 1;
        int iCharAt = str.charAt(iR) | ' ';
        if (iCharAt == 102) {
            tVar.d(i7, "alse");
            z8 = false;
        } else {
            if (iCharAt != 116) {
                t.n(tVar, "Expected valid boolean literal prefix, but had '" + tVar.k() + '\'', 0, 6);
                throw null;
            }
            tVar.d(i7, "rue");
            z8 = true;
        }
        if (!z3) {
            return z8;
        }
        if (tVar.f39626b == str.length()) {
            t.n(tVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(tVar.f39626b) == '\"') {
            tVar.f39626b++;
            return z8;
        }
        t.n(tVar, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        t tVar = this.f39745q;
        long jI = tVar.i();
        byte b7 = (byte) jI;
        if (jI == b7) {
            return b7;
        }
        t.n(tVar, "Failed to parse byte for input '" + jI + '\'', 0, 6);
        throw null;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        t tVar = this.f39745q;
        String strK = tVar.k();
        if (strK.length() == 1) {
            return strK.charAt(0);
        }
        t.n(tVar, G.l('\'', "Expected single char, but got '", strK), 0, 6);
        throw null;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        t tVar = this.f39745q;
        String strK = tVar.k();
        try {
            double d2 = Double.parseDouble(strK);
            if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
                return d2;
            }
            k.k(tVar, Double.valueOf(d2));
            throw null;
        } catch (IllegalArgumentException unused) {
            t.n(tVar, G.l('\'', "Failed to parse type 'double' for input '", strK), 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0168 A[EDGE_INSN: B:77:0x0168->B:78:0x0169 BREAK  A[LOOP:0: B:61:0x0101->B:86:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        s sVar = this.f39744p;
        int iOrdinal = sVar.ordinal();
        c cVar = this.f39743o;
        t tVar = this.f39745q;
        int i7 = 0;
        zU = false;
        boolean zU = false;
        int iF = -1;
        if (iOrdinal == 0) {
            boolean zU2 = tVar.u();
            boolean zB = tVar.b();
            j jVar = this.t;
            if (zB) {
                String key = tVar.e();
                tVar.h(':');
                iF = k.f(descriptor, cVar, key);
                if (iF == -3) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    tVar.m(StringsKt.G(((String) tVar.f39628d).subSequence(0, tVar.f39626b).toString(), 6, key), G.l('\'', "Encountered an unknown key '", key), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
                if (jVar != null) {
                    C1826s c1826s = jVar.f39729a;
                    if (iF < 64) {
                        c1826s.f38877c |= 1 << iF;
                    } else {
                        int i10 = (iF >>> 6) - 1;
                        long[] jArr = c1826s.f38878d;
                        jArr[i10] = jArr[i10] | (1 << (iF & 63));
                    }
                }
            } else if (!zU2) {
                if (jVar == null) {
                    iF = -1;
                    break;
                }
                C1826s c1826s2 = jVar.f39729a;
                SerialDescriptor serialDescriptor = c1826s2.f38875a;
                int elementsCount = serialDescriptor.getElementsCount();
                while (true) {
                    long j6 = c1826s2.f38877c;
                    long j10 = -1;
                    i iVar = c1826s2.f38876b;
                    if (j6 == -1) {
                        if (elementsCount <= 64) {
                            iF = -1;
                            break;
                        }
                        long[] jArr2 = c1826s2.f38878d;
                        int length = jArr2.length;
                        loop1: while (true) {
                            if (i7 >= length) {
                                iF = -1;
                                break;
                            }
                            int i11 = i7 + 1;
                            int i12 = i11 * 64;
                            long j11 = j10;
                            long j12 = jArr2[i7];
                            while (true) {
                                if (j12 != j11) {
                                    i iVar2 = iVar;
                                    int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j12);
                                    j12 |= 1 << iNumberOfTrailingZeros;
                                    iF = iNumberOfTrailingZeros + i12;
                                    if (((Boolean) iVar2.invoke(serialDescriptor, Integer.valueOf(iF))).booleanValue()) {
                                        jArr2[i7] = j12;
                                        break;
                                    }
                                    iVar = iVar2;
                                } else {
                                    jArr2[i7] = j12;
                                    i7 = i11;
                                    j10 = j11;
                                }
                            }
                        }
                    } else {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j6);
                        c1826s2.f38877c |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) iVar.invoke(serialDescriptor, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            iF = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                }
            } else {
                k.g(tVar, "object");
                throw null;
            }
        } else if (iOrdinal != 2) {
            boolean zU3 = tVar.u();
            if (tVar.b()) {
                int i13 = this.f39747s;
                if (i13 != -1 && !zU3) {
                    t.n(tVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                iF = i13 + 1;
                this.f39747s = iF;
            } else if (zU3) {
                k.g(tVar, "array");
                throw null;
            }
        } else {
            int i14 = this.f39747s;
            Object[] objArr = i14 % 2 != 0;
            if (objArr != true) {
                tVar.h(':');
            } else if (i14 != -1) {
                zU = tVar.u();
            }
            if (tVar.b()) {
                if (objArr != false) {
                    if (this.f39747s == -1) {
                        int i15 = tVar.f39626b;
                        if (zU) {
                            t.n(tVar, "Unexpected leading comma", i15, 4);
                            throw null;
                        }
                    } else {
                        int i16 = tVar.f39626b;
                        if (!zU) {
                            t.n(tVar, "Expected comma after the key-value pair", i16, 4);
                            throw null;
                        }
                    }
                }
                iF = this.f39747s + 1;
                this.f39747s = iF;
            } else if (zU) {
                k.g(tVar, "object");
                throw null;
            }
        }
        if (sVar != s.MAP) {
            C0505b c0505b = (C0505b) tVar.f39629e;
            ((int[]) c0505b.f7074d)[c0505b.f7072b] = iF;
        }
        return iF;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        t tVar = this.f39745q;
        String name = tVar.j();
        String suffix = " at path " + ((C0505b) tVar.f39629e).i();
        c json = this.f39743o;
        Intrinsics.checkNotNullParameter(enumDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iF = k.f(enumDescriptor, json, name);
        if (iF != -3) {
            return iF;
        }
        throw new p104gg.c(enumDescriptor.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        t tVar = this.f39745q;
        String strK = tVar.k();
        try {
            float f10 = Float.parseFloat(strK);
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            k.k(tVar, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            t.n(tVar, G.l('\'', "Failed to parse type 'float' for input '", strK), 0, 6);
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (q.a(descriptor)) {
            return new g(this.f39745q, this.f39743o);
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        t tVar = this.f39745q;
        long jI = tVar.i();
        int i7 = (int) jI;
        if (jI == i7) {
            return i7;
        }
        t.n(tVar, "Failed to parse int for input '" + jI + '\'', 0, 6);
        throw null;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final j decodeJsonElement() {
        return new C4.a(this.f39743o.f39370a, this.f39745q).f();
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return this.f39745q.i();
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final boolean decodeNotNullMark() {
        j jVar = this.t;
        if (!(jVar != null ? jVar.f39730b : false)) {
            t tVar = this.f39745q;
            int iR = tVar.r(tVar.t());
            String str = (String) tVar.f39628d;
            int length = str.length() - iR;
            boolean z3 = false;
            if (length >= 4 && iR != -1) {
                for (int i7 = 0; i7 < 4; i7++) {
                    if (BuildConfig.TRAVIS.charAt(i7) == str.charAt(iR + i7)) {
                    }
                }
                if (length <= 4 || k.d(str.charAt(iR + 4)) != 0) {
                    tVar.f39626b = iR + 4;
                    z3 = true;
                }
            }
            if (!z3) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final Void decodeNull() {
        return null;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.CompositeDecoder
    public final Object decodeSerializableElement(SerialDescriptor descriptor, int i7, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z3 = this.f39744p == s.MAP && (i7 & 1) == 0;
        C0505b c0505b = (C0505b) this.f39745q.f39629e;
        if (z3) {
            int[] iArr = (int[]) c0505b.f7074d;
            int i10 = c0505b.f7072b;
            if (iArr[i10] == -2) {
                ((Object[]) c0505b.f7073c)[i10] = l.f39732a;
            }
        }
        Object objDecodeSerializableElement = super.decodeSerializableElement(descriptor, i7, deserializer, obj);
        if (z3) {
            int[] iArr2 = (int[]) c0505b.f7074d;
            int i11 = c0505b.f7072b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                c0505b.f7072b = i12;
                Object[] objArr = (Object[]) c0505b.f7073c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    c0505b.f7073c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) c0505b.f7074d, i13);
                    Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                    c0505b.f7074d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) c0505b.f7073c;
            int i14 = c0505b.f7072b;
            objArr2[i14] = objDecodeSerializableElement;
            ((int[]) c0505b.f7074d)[i14] = -2;
        }
        return objDecodeSerializableElement;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final Object decodeSerializableValue(DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            return deserializer.deserialize(this);
        } catch (b e10) {
            String message = e10.getMessage();
            Intrinsics.e(message);
            if (StringsKt.A(message, "at path", false)) {
                throw e10;
            }
            throw new b(e10.f37247a, e10.getMessage() + " at path: " + ((C0505b) this.f39745q.f39629e).i(), e10);
        }
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        t tVar = this.f39745q;
        long jI = tVar.i();
        short s3 = (short) jI;
        if (jI == s3) {
            return s3;
        }
        t.n(tVar, "Failed to parse short for input '" + jI + '\'', 0, 6);
        throw null;
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.Decoder
    public final String decodeString() {
        return this.f39745q.j();
    }

    @Override // kotlinx.serialization.encoding.ChunkedDecoder
    public final void decodeStringChunked(Function1 consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        t tVar = this.f39745q;
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        String strJ = tVar.j();
        Intrinsics.checkNotNullParameter(strJ, "<this>");
        Intrinsics.checkNotNullParameter(strJ, "<this>");
        D transform = new D(0);
        Intrinsics.checkNotNullParameter(strJ, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        com.facebook.imagepipeline.nativecode.b.e(16384, 16384);
        int length = strJ.length();
        int i7 = 0;
        ArrayList arrayList = new ArrayList((length / 16384) + (length % 16384 == 0 ? 0 : 1));
        while (i7 >= 0 && i7 < length) {
            int i10 = i7 + 16384;
            arrayList.add(transform.invoke(strJ.subSequence(i7, (i10 < 0 || i10 > length) ? length : i10)));
            i7 = i10;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            consumeChunk.invoke(it.next());
        }
    }

    @Override // androidx.camera.core.impl.utils.n, kotlinx.serialization.encoding.CompositeDecoder
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        t tVar = this.f39745q;
        if (tVar.u()) {
            k.g(tVar, "");
            throw null;
        }
        tVar.h(this.f39744p.f39767b);
        C0505b c0505b = (C0505b) tVar.f39629e;
        int i7 = c0505b.f7072b;
        int[] iArr = (int[]) c0505b.f7074d;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            c0505b.f7072b = i7 - 1;
        }
        int i10 = c0505b.f7072b;
        if (i10 != -1) {
            c0505b.f7072b = i10 - 1;
        }
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final c getJson() {
        return this.f39743o;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public final p209ng.b getSerializersModule() {
        return this.f39746r;
    }
}
