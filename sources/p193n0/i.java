package p193n0;

import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.protobuf.AbstractC1123n;
import androidx.datastore.preferences.protobuf.AbstractC1145u1;
import androidx.datastore.preferences.protobuf.AbstractC1154x1;
import androidx.datastore.preferences.protobuf.C1120m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p135j0.C1767a;
import p178m0.c;
import p178m0.d;
import p178m0.f;
import p178m0.g;
import p178m0.h;
import p178m0.j;
import p178m0.k;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f39815a = new i();

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return new b(true);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws C1767a {
        byte[] bArr;
        f from = c.f39416a.readFrom(inputStream);
        f[] pairs = new f[0];
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        b bVar = new b(false);
        f[] pairs2 = (f[]) Arrays.copyOf(pairs, 0);
        Intrinsics.checkNotNullParameter(pairs2, "pairs");
        bVar.b();
        if (pairs2.length > 0) {
            f fVar = pairs2[0];
            throw null;
        }
        Map preferencesMap = from.getPreferencesMap();
        Intrinsics.checkNotNullExpressionValue(preferencesMap, "preferencesProto.preferencesMap");
        for (Map.Entry entry : preferencesMap.entrySet()) {
            String name = (String) entry.getKey();
            k value = (k) entry.getValue();
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            j valueCase = value.getValueCase();
            switch (valueCase == null ? -1 : h.f39814a[valueCase.ordinal()]) {
                case -1:
                    throw new C1767a("Value case is null.", 0);
                case 0:
                default:
                    throw new l();
                case 1:
                    Intrinsics.checkNotNullParameter(name, "name");
                    e key = new e(name);
                    Boolean boolValueOf = Boolean.valueOf(value.getBoolean());
                    Intrinsics.checkNotNullParameter(key, "key");
                    bVar.e(key, boolValueOf);
                    break;
                case 2:
                    Intrinsics.checkNotNullParameter(name, "name");
                    e key2 = new e(name);
                    Float fValueOf = Float.valueOf(value.getFloat());
                    Intrinsics.checkNotNullParameter(key2, "key");
                    bVar.e(key2, fValueOf);
                    break;
                case 3:
                    Intrinsics.checkNotNullParameter(name, "name");
                    e key3 = new e(name);
                    Double dValueOf = Double.valueOf(value.getDouble());
                    Intrinsics.checkNotNullParameter(key3, "key");
                    bVar.e(key3, dValueOf);
                    break;
                case 4:
                    Intrinsics.checkNotNullParameter(name, "name");
                    e key4 = new e(name);
                    Integer numValueOf = Integer.valueOf(value.getInteger());
                    Intrinsics.checkNotNullParameter(key4, "key");
                    bVar.e(key4, numValueOf);
                    break;
                case 5:
                    Intrinsics.checkNotNullParameter(name, "name");
                    e key5 = new e(name);
                    Long lValueOf = Long.valueOf(value.getLong());
                    Intrinsics.checkNotNullParameter(key5, "key");
                    bVar.e(key5, lValueOf);
                    break;
                case 6:
                    Intrinsics.checkNotNullParameter(name, "name");
                    e key6 = new e(name);
                    String string = value.getString();
                    Intrinsics.checkNotNullExpressionValue(string, "value.string");
                    Intrinsics.checkNotNullParameter(key6, "key");
                    bVar.e(key6, string);
                    break;
                case 7:
                    e key7 = p377z5.l.K(name);
                    List stringsList = value.getStringSet().getStringsList();
                    Intrinsics.checkNotNullExpressionValue(stringsList, "value.stringSet.stringsList");
                    Set setB0 = CollectionsKt.b0(stringsList);
                    Intrinsics.checkNotNullParameter(key7, "key");
                    bVar.e(key7, setB0);
                    break;
                case 8:
                    Intrinsics.checkNotNullParameter(name, "name");
                    e key8 = new e(name);
                    AbstractC1123n bytes = value.getBytes();
                    int size = bytes.size();
                    if (size == 0) {
                        bArr = AbstractC1154x1.f16809b;
                    } else {
                        byte[] bArr2 = new byte[size];
                        bytes.e(size, bArr2);
                        bArr = bArr2;
                    }
                    Intrinsics.checkNotNullExpressionValue(bArr, "value.bytes.toByteArray()");
                    Intrinsics.checkNotNullParameter(key8, "key");
                    bVar.e(key8, bArr);
                    break;
                case 9:
                    throw new C1767a("Value not set.", 0);
            }
        }
        return new b(G.l(bVar.a()), true);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        AbstractC1145u1 abstractC1145u1Build;
        Map mapA = ((g) obj).a();
        d dVarO = f.o();
        for (Map.Entry entry : mapA.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f39813a;
            if (value instanceof Boolean) {
                p178m0.i iVarW = k.w();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                iVarW.d();
                k.s((k) iVarW.f16750b, zBooleanValue);
                abstractC1145u1Build = iVarW.build();
                Intrinsics.checkNotNullExpressionValue(abstractC1145u1Build, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                p178m0.i iVarW2 = k.w();
                float fFloatValue = ((Number) value).floatValue();
                iVarW2.d();
                k.t((k) iVarW2.f16750b, fFloatValue);
                abstractC1145u1Build = iVarW2.build();
                Intrinsics.checkNotNullExpressionValue(abstractC1145u1Build, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                p178m0.i iVarW3 = k.w();
                double dDoubleValue = ((Number) value).doubleValue();
                iVarW3.d();
                k.q((k) iVarW3.f16750b, dDoubleValue);
                abstractC1145u1Build = iVarW3.build();
                Intrinsics.checkNotNullExpressionValue(abstractC1145u1Build, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                p178m0.i iVarW4 = k.w();
                int iIntValue = ((Number) value).intValue();
                iVarW4.d();
                k.u((k) iVarW4.f16750b, iIntValue);
                abstractC1145u1Build = iVarW4.build();
                Intrinsics.checkNotNullExpressionValue(abstractC1145u1Build, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                p178m0.i iVarW5 = k.w();
                long jLongValue = ((Number) value).longValue();
                iVarW5.d();
                k.n((k) iVarW5.f16750b, jLongValue);
                abstractC1145u1Build = iVarW5.build();
                Intrinsics.checkNotNullExpressionValue(abstractC1145u1Build, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                p178m0.i iVarW6 = k.w();
                iVarW6.d();
                k.o((String) value, (k) iVarW6.f16750b);
                abstractC1145u1Build = iVarW6.build();
                Intrinsics.checkNotNullExpressionValue(abstractC1145u1Build, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                p178m0.i iVarW7 = k.w();
                g gVarP = h.p();
                Intrinsics.f(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                gVarP.d();
                h.n((h) gVarP.f16750b, (Set) value);
                iVarW7.d();
                k.p((k) iVarW7.f16750b, (h) gVarP.build());
                abstractC1145u1Build = iVarW7.build();
                Intrinsics.checkNotNullExpressionValue(abstractC1145u1Build, "newBuilder()\n           …                 .build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                p178m0.i iVarW8 = k.w();
                byte[] bArr = (byte[]) value;
                C1120m c1120m = AbstractC1123n.f16699b;
                C1120m c1120mC = AbstractC1123n.c(0, bArr.length, bArr);
                iVarW8.d();
                k.r((k) iVarW8.f16750b, c1120mC);
                abstractC1145u1Build = iVarW8.build();
                Intrinsics.checkNotNullExpressionValue(abstractC1145u1Build, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            dVarO.getClass();
            str.getClass();
            dVarO.d();
            f.n((f) dVarO.f16750b).put(str, (k) abstractC1145u1Build);
        }
        ((f) dVarO.build()).writeTo(outputStream);
        return Unit.f38893a;
    }
}
