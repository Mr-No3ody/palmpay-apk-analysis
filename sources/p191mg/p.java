package p191mg;

import C9.N;
import N8.q0;
import com.google.maps.android.BuildConfig;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonEncoder;
import p133ig.g;
import p176lg.c;
import p176lg.h;
import p176lg.j;
import p176lg.k;
import p176lg.l;
import p176lg.s;
import p209ng.a;
import p209ng.b;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements JsonEncoder, Encoder, CompositeEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f39748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f39749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f39750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonEncoder[] f39751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f39752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f39753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39756i;

    public p(N composer, c json, s mode, JsonEncoder[] jsonEncoderArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f39748a = composer;
        this.f39749b = json;
        this.f39750c = mode;
        this.f39751d = jsonEncoderArr;
        this.f39752e = json.f39371b;
        this.f39753f = json.f39370a;
        int iOrdinal = mode.ordinal();
        if (jsonEncoderArr != null) {
            JsonEncoder jsonEncoder = jsonEncoderArr[iOrdinal];
            if (jsonEncoder == null && jsonEncoder == this) {
                return;
            }
            jsonEncoderArr[iOrdinal] = this;
        }
    }

    public final void a(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int iOrdinal = this.f39750c.ordinal();
        boolean z3 = true;
        N n10 = this.f39748a;
        if (iOrdinal == 1) {
            if (!n10.f1268b) {
                n10.f(',');
            }
            n10.d();
            return;
        }
        if (iOrdinal == 2) {
            if (n10.f1268b) {
                this.f39754g = true;
                n10.d();
                return;
            }
            if (i7 % 2 == 0) {
                n10.f(',');
                n10.d();
            } else {
                n10.f(':');
                n10.m();
                z3 = false;
            }
            this.f39754g = z3;
            return;
        }
        if (iOrdinal == 3) {
            if (i7 == 0) {
                this.f39754g = true;
            }
            if (i7 == 1) {
                n10.f(',');
                n10.m();
                this.f39754g = false;
                return;
            }
            return;
        }
        if (!n10.f1268b) {
            n10.f(',');
        }
        n10.d();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        c json = this.f39749b;
        Intrinsics.checkNotNullParameter(json, "json");
        k.i(descriptor, json);
        encodeString(descriptor.getElementName(i7));
        n10.f(':');
        n10.m();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder beginCollection(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        JsonEncoder jsonEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        c cVar = this.f39749b;
        s sVarJ = k.j(descriptor, cVar);
        char c6 = sVarJ.f39766a;
        N n10 = this.f39748a;
        n10.f(c6);
        n10.f1268b = true;
        String str = this.f39755h;
        if (str != null) {
            String serialName = this.f39756i;
            if (serialName == null) {
                serialName = descriptor.getSerialName();
            }
            n10.d();
            encodeString(str);
            n10.f(':');
            encodeString(serialName);
            this.f39755h = null;
            this.f39756i = null;
        }
        if (this.f39750c == sVarJ) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.f39751d;
        return (jsonEncoderArr == null || (jsonEncoder = jsonEncoderArr[sVarJ.ordinal()]) == null) ? new p(n10, cVar, sVarJ, jsonEncoderArr) : jsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean z3) {
        if (this.f39754g) {
            encodeString(String.valueOf(z3));
        } else {
            ((C4.a) this.f39748a.f1269c).write(String.valueOf(z3));
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(SerialDescriptor descriptor, int i7, boolean z3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        encodeBoolean(z3);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b7) {
        if (this.f39754g) {
            encodeString(String.valueOf((int) b7));
        } else {
            this.f39748a.e(b7);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(SerialDescriptor descriptor, int i7, byte b7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        encodeByte(b7);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c6) {
        encodeString(String.valueOf(c6));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(SerialDescriptor descriptor, int i7, char c6) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        encodeChar(c6);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double d2) {
        boolean z3 = this.f39754g;
        N n10 = this.f39748a;
        if (z3) {
            encodeString(String.valueOf(d2));
        } else {
            ((C4.a) n10.f1269c).write(String.valueOf(d2));
        }
        if (Double.isInfinite(d2) || Double.isNaN(d2)) {
            throw k.a(((C4.a) n10.f1269c).toString(), Double.valueOf(d2));
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(SerialDescriptor descriptor, int i7, double d2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        encodeDouble(d2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(SerialDescriptor enumDescriptor, int i7) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.getElementName(i7));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f10) {
        boolean z3 = this.f39754g;
        N n10 = this.f39748a;
        if (z3) {
            encodeString(String.valueOf(f10));
        } else {
            ((C4.a) n10.f1269c).write(String.valueOf(f10));
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw k.a(((C4.a) n10.f1269c).toString(), Float.valueOf(f10));
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(SerialDescriptor descriptor, int i7, float f10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        encodeFloat(f10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean zA = q.a(descriptor);
        s sVar = this.f39750c;
        c cVar = this.f39749b;
        N eVar = this.f39748a;
        if (zA) {
            if (!(eVar instanceof f)) {
                eVar = new f((C4.a) eVar.f1269c, this.f39754g);
            }
            return new p(eVar, cVar, sVar, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (descriptor.isInline() && descriptor.equals(k.f39384a)) {
            if (!(eVar instanceof e)) {
                eVar = new e((C4.a) eVar.f1269c, this.f39754g);
            }
            return new p(eVar, cVar, sVar, null);
        }
        if (this.f39755h != null) {
            this.f39756i = descriptor.getSerialName();
            return this;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder encodeInlineElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        return encodeInline(descriptor.getElementDescriptor(i7));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int i7) {
        if (this.f39754g) {
            encodeString(String.valueOf(i7));
        } else {
            this.f39748a.g(i7);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(SerialDescriptor descriptor, int i7, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        encodeInt(i10);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final void encodeJsonElement(j element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f39755h == null || (element instanceof s)) {
            encodeSerializableValue(l.f39385a, element);
            return;
        }
        String str = this.f39756i;
        Intrinsics.checkNotNullParameter(element, "element");
        StringBuilder sbQ = q0.q("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbQ.append(G.a(element.getClass()).getSimpleName());
        sbQ.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new h(sbQ.toString());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long j6) {
        if (this.f39754g) {
            encodeString(String.valueOf(j6));
        } else {
            this.f39748a.h(j6);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(SerialDescriptor descriptor, int i7, long j6) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        encodeLong(j6);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
        this.f39748a.i(BuildConfig.TRAVIS);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeNullableSerializableElement(SerialDescriptor descriptor, int i7, SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f39753f.f39379a) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            a(descriptor, i7);
            encodeNullableSerializableValue(serializer, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeNullableSerializableValue(SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.getDescriptor().isNullable()) {
            encodeSerializableValue(serializer, obj);
        } else if (obj == null) {
            encodeNull();
        } else {
            encodeSerializableValue(serializer, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeSerializableElement(SerialDescriptor descriptor, int i7, SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        a(descriptor, i7);
        encodeSerializableValue(serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeSerializableValue(SerializationStrategy serializer, Object obj) {
        String strDiscriminator;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        c json = this.f39749b;
        int iOrdinal = json.f39370a.f39383e.ordinal();
        if (iOrdinal == 0) {
            strDiscriminator = null;
        } else {
            if (iOrdinal == 1) {
                g kind = serializer.getDescriptor().getKind();
                if (Intrinsics.c(kind, p133ig.h.f37622a) || Intrinsics.c(kind, p133ig.h.f37625d)) {
                    SerialDescriptor descriptor = serializer.getDescriptor();
                    Intrinsics.checkNotNullParameter(descriptor, "<this>");
                    Intrinsics.checkNotNullParameter(json, "json");
                    Iterator<Annotation> it = descriptor.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = json.f39370a.f39381c;
                            break;
                        }
                        Annotation next = it.next();
                        if (next instanceof JsonClassDiscriminator) {
                            strDiscriminator = ((JsonClassDiscriminator) next).discriminator();
                            break;
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                throw new p355xf.l();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.f39755h = strDiscriminator;
            this.f39756i = serialName;
        }
        serializer.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short s3) {
        if (this.f39754g) {
            encodeString(String.valueOf((int) s3));
        } else {
            this.f39748a.j(s3);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(SerialDescriptor descriptor, int i7, short s3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a(descriptor, i7);
        encodeShort(s3);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f39748a.k(value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(SerialDescriptor descriptor, int i7, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        a(descriptor, i7);
        encodeString(value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        s sVar = this.f39750c;
        N n10 = this.f39748a;
        n10.getClass();
        n10.f1268b = false;
        n10.f(sVar.f39767b);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final c getJson() {
        return this.f39749b;
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final b getSerializersModule() {
        return this.f39752e;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return false;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeNotNullMark() {
    }
}
