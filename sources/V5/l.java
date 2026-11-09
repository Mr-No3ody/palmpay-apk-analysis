package V5;

import N8.q0;
import androidx.camera.camera2.internal.F;
import com.google.api.Service;
import com.google.maps.android.BuildConfig;
import com.horcrux.svg.d0;
import com.nimbusds.jose.shaded.gson.z;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f10023b = new k(new l(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10024a;

    public /* synthetic */ l(int i7) {
        this.f10024a = i7;
    }

    public static com.nimbusds.jose.shaded.gson.o c(com.nimbusds.jose.shaded.gson.stream.b bVar, int i7) throws IOException {
        int i10 = F.i(i7);
        if (i10 == 5) {
            return new com.nimbusds.jose.shaded.gson.s(bVar.u());
        }
        if (i10 == 6) {
            return new com.nimbusds.jose.shaded.gson.s(new com.nimbusds.jose.shaded.gson.internal.h(bVar.u()));
        }
        if (i10 == 7) {
            return new com.nimbusds.jose.shaded.gson.s(Boolean.valueOf(bVar.m()));
        }
        if (i10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(d0.u(i7)));
        }
        bVar.s();
        return com.nimbusds.jose.shaded.gson.q.f23687a;
    }

    public static void d(com.nimbusds.jose.shaded.gson.stream.c cVar, com.nimbusds.jose.shaded.gson.o oVar) throws IOException {
        if (oVar == null || (oVar instanceof com.nimbusds.jose.shaded.gson.q)) {
            cVar.i();
            return;
        }
        boolean z3 = oVar instanceof com.nimbusds.jose.shaded.gson.s;
        if (z3) {
            if (!z3) {
                throw new IllegalStateException("Not a JSON Primitive: " + oVar);
            }
            com.nimbusds.jose.shaded.gson.s sVar = (com.nimbusds.jose.shaded.gson.s) oVar;
            Serializable serializable = sVar.f23692a;
            if (serializable instanceof Number) {
                cVar.o(sVar.b());
                return;
            } else if (serializable instanceof Boolean) {
                cVar.q(sVar.a());
                return;
            } else {
                cVar.p(sVar.c());
                return;
            }
        }
        boolean z8 = oVar instanceof com.nimbusds.jose.shaded.gson.n;
        if (z8) {
            cVar.b();
            if (!z8) {
                throw new IllegalStateException("Not a JSON Array: " + oVar);
            }
            Iterator it = ((com.nimbusds.jose.shaded.gson.n) oVar).f23686a.iterator();
            while (it.hasNext()) {
                d(cVar, (com.nimbusds.jose.shaded.gson.o) it.next());
            }
            cVar.e();
            return;
        }
        boolean z10 = oVar instanceof com.nimbusds.jose.shaded.gson.r;
        if (!z10) {
            throw new IllegalArgumentException("Couldn't write " + oVar.getClass());
        }
        cVar.c();
        if (!z10) {
            throw new IllegalStateException("Not a JSON Object: " + oVar);
        }
        Iterator it2 = ((com.nimbusds.jose.shaded.gson.internal.j) ((com.nimbusds.jose.shaded.gson.r) oVar).f23688a.entrySet()).iterator();
        while (((com.nimbusds.jose.shaded.gson.internal.i) it2).hasNext()) {
            com.nimbusds.jose.shaded.gson.internal.k kVarB = ((com.nimbusds.jose.shaded.gson.internal.i) it2).b();
            cVar.g((String) kVarB.getKey());
            d(cVar, (com.nimbusds.jose.shaded.gson.o) kVarB.getValue());
        }
        cVar.f();
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        com.nimbusds.jose.shaded.gson.o nVar;
        com.nimbusds.jose.shaded.gson.o nVar2;
        boolean zM;
        switch (this.f10024a) {
            case 0:
                int iW = bVar.w();
                int i7 = F.i(iW);
                if (i7 == 5 || i7 == 6) {
                    return new com.nimbusds.jose.shaded.gson.internal.h(bVar.u());
                }
                if (i7 == 8) {
                    bVar.s();
                    return null;
                }
                throw new com.nimbusds.jose.shaded.gson.p("Expecting number, got: " + d0.u(iW) + "; at path " + bVar.getPath(), 10, false);
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.j()) {
                    try {
                        arrayList.add(Integer.valueOf(bVar.o()));
                    } catch (NumberFormatException e10) {
                        throw new com.nimbusds.jose.shaded.gson.p(10, e10);
                    }
                }
                bVar.e();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                try {
                    return Long.valueOf(bVar.p());
                } catch (NumberFormatException e11) {
                    throw new com.nimbusds.jose.shaded.gson.p(10, e11);
                }
            case 3:
                if (bVar.w() != 9) {
                    return Float.valueOf((float) bVar.n());
                }
                bVar.s();
                return null;
            case 4:
                if (bVar.w() != 9) {
                    return Double.valueOf(bVar.n());
                }
                bVar.s();
                return null;
            case 5:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                String strU = bVar.u();
                if (strU.length() == 1) {
                    return Character.valueOf(strU.charAt(0));
                }
                StringBuilder sbQ = q0.q("Expecting character, got: ", strU, "; at ");
                sbQ.append(bVar.i());
                throw new com.nimbusds.jose.shaded.gson.p(sbQ.toString(), 10, false);
            case 6:
                int iW2 = bVar.w();
                if (iW2 != 9) {
                    return iW2 == 8 ? Boolean.toString(bVar.m()) : bVar.u();
                }
                bVar.s();
                return null;
            case 7:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                String strU2 = bVar.u();
                try {
                    return new BigDecimal(strU2);
                } catch (NumberFormatException e12) {
                    StringBuilder sbQ2 = q0.q("Failed parsing '", strU2, "' as BigDecimal; at path ");
                    sbQ2.append(bVar.i());
                    throw new com.nimbusds.jose.shaded.gson.p(10, sbQ2.toString(), e12);
                }
            case 8:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                String strU3 = bVar.u();
                try {
                    return new BigInteger(strU3);
                } catch (NumberFormatException e13) {
                    StringBuilder sbQ3 = q0.q("Failed parsing '", strU3, "' as BigInteger; at path ");
                    sbQ3.append(bVar.i());
                    throw new com.nimbusds.jose.shaded.gson.p(10, sbQ3.toString(), e13);
                }
            case 9:
                if (bVar.w() != 9) {
                    return new com.nimbusds.jose.shaded.gson.internal.h(bVar.u());
                }
                bVar.s();
                return null;
            case 10:
                if (bVar.w() != 9) {
                    return new StringBuilder(bVar.u());
                }
                bVar.s();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (bVar.w() != 9) {
                    return new StringBuffer(bVar.u());
                }
                bVar.s();
                return null;
            case 13:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                String strU4 = bVar.u();
                if (BuildConfig.TRAVIS.equals(strU4)) {
                    return null;
                }
                return new URL(strU4);
            case 14:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                try {
                    String strU5 = bVar.u();
                    if (BuildConfig.TRAVIS.equals(strU5)) {
                        return null;
                    }
                    return new URI(strU5);
                } catch (URISyntaxException e14) {
                    throw new com.nimbusds.jose.shaded.gson.p(10, e14);
                }
            case 15:
                if (bVar.w() != 9) {
                    return InetAddress.getByName(bVar.u());
                }
                bVar.s();
                return null;
            case 16:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                String strU6 = bVar.u();
                try {
                    return UUID.fromString(strU6);
                } catch (IllegalArgumentException e15) {
                    StringBuilder sbQ4 = q0.q("Failed parsing '", strU6, "' as UUID; at path ");
                    sbQ4.append(bVar.i());
                    throw new com.nimbusds.jose.shaded.gson.p(10, sbQ4.toString(), e15);
                }
            case 17:
                String strU7 = bVar.u();
                try {
                    return Currency.getInstance(strU7);
                } catch (IllegalArgumentException e16) {
                    StringBuilder sbQ5 = q0.q("Failed parsing '", strU7, "' as Currency; at path ");
                    sbQ5.append(bVar.i());
                    throw new com.nimbusds.jose.shaded.gson.p(10, sbQ5.toString(), e16);
                }
            case 18:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                bVar.b();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (bVar.w() != 4) {
                    String strQ = bVar.q();
                    int iO = bVar.o();
                    if ("year".equals(strQ)) {
                        i11 = iO;
                    } else if ("month".equals(strQ)) {
                        i12 = iO;
                    } else if ("dayOfMonth".equals(strQ)) {
                        i13 = iO;
                    } else if ("hourOfDay".equals(strQ)) {
                        i14 = iO;
                    } else if ("minute".equals(strQ)) {
                        i15 = iO;
                    } else if ("second".equals(strQ)) {
                        i16 = iO;
                    }
                }
                bVar.f();
                return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
            case 19:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(bVar.u(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 20:
                if (bVar instanceof g) {
                    g gVar = (g) bVar;
                    int iW3 = gVar.w();
                    if (iW3 != 5 && iW3 != 2 && iW3 != 4 && iW3 != 10) {
                        com.nimbusds.jose.shaded.gson.o oVar = (com.nimbusds.jose.shaded.gson.o) gVar.I();
                        gVar.C();
                        return oVar;
                    }
                    throw new IllegalStateException("Unexpected " + d0.u(iW3) + " when reading a JsonElement.");
                }
                int iW4 = bVar.w();
                int i17 = F.i(iW4);
                if (i17 == 0) {
                    bVar.a();
                    nVar = new com.nimbusds.jose.shaded.gson.n();
                } else if (i17 != 2) {
                    nVar = null;
                } else {
                    bVar.b();
                    nVar = new com.nimbusds.jose.shaded.gson.r();
                }
                if (nVar == null) {
                    return c(bVar, iW4);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (bVar.j()) {
                        String strQ2 = nVar instanceof com.nimbusds.jose.shaded.gson.r ? bVar.q() : null;
                        int iW5 = bVar.w();
                        int i18 = F.i(iW5);
                        if (i18 == 0) {
                            bVar.a();
                            nVar2 = new com.nimbusds.jose.shaded.gson.n();
                        } else if (i18 != 2) {
                            nVar2 = null;
                        } else {
                            bVar.b();
                            nVar2 = new com.nimbusds.jose.shaded.gson.r();
                        }
                        boolean z3 = nVar2 != null;
                        if (nVar2 == null) {
                            nVar2 = c(bVar, iW5);
                        }
                        if (nVar instanceof com.nimbusds.jose.shaded.gson.n) {
                            ((com.nimbusds.jose.shaded.gson.n) nVar).f23686a.add(nVar2);
                        } else {
                            ((com.nimbusds.jose.shaded.gson.r) nVar).f23688a.put(strQ2, nVar2);
                        }
                        if (z3) {
                            arrayDeque.addLast(nVar);
                            nVar = nVar2;
                        }
                    } else {
                        if (nVar instanceof com.nimbusds.jose.shaded.gson.n) {
                            bVar.e();
                        } else {
                            bVar.f();
                        }
                        if (arrayDeque.isEmpty()) {
                            return nVar;
                        }
                        nVar = (com.nimbusds.jose.shaded.gson.o) arrayDeque.removeLast();
                    }
                }
                break;
            case 21:
                BitSet bitSet = new BitSet();
                bVar.a();
                int iW6 = bVar.w();
                int i19 = 0;
                while (iW6 != 2) {
                    int i20 = F.i(iW6);
                    if (i20 == 5 || i20 == 6) {
                        int iO2 = bVar.o();
                        if (iO2 == 0) {
                            zM = false;
                        } else {
                            if (iO2 != 1) {
                                StringBuilder sbE = F.e(iO2, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                sbE.append(bVar.i());
                                throw new com.nimbusds.jose.shaded.gson.p(sbE.toString(), 10, false);
                            }
                            zM = true;
                        }
                    } else {
                        if (i20 != 7) {
                            throw new com.nimbusds.jose.shaded.gson.p("Invalid bitset value type: " + d0.u(iW6) + "; at path " + bVar.getPath(), 10, false);
                        }
                        zM = bVar.m();
                    }
                    if (zM) {
                        bitSet.set(i19);
                    }
                    i19++;
                    iW6 = bVar.w();
                }
                bVar.e();
                return bitSet;
            case 22:
                int iW7 = bVar.w();
                if (iW7 != 9) {
                    return iW7 == 6 ? Boolean.valueOf(Boolean.parseBoolean(bVar.u())) : Boolean.valueOf(bVar.m());
                }
                bVar.s();
                return null;
            case 23:
                if (bVar.w() != 9) {
                    return Boolean.valueOf(bVar.u());
                }
                bVar.s();
                return null;
            case 24:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                try {
                    int iO3 = bVar.o();
                    if (iO3 <= 255 && iO3 >= -128) {
                        return Byte.valueOf((byte) iO3);
                    }
                    StringBuilder sbE2 = F.e(iO3, "Lossy conversion from ", " to byte; at path ");
                    sbE2.append(bVar.i());
                    throw new com.nimbusds.jose.shaded.gson.p(sbE2.toString(), 10, false);
                } catch (NumberFormatException e17) {
                    throw new com.nimbusds.jose.shaded.gson.p(10, e17);
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                try {
                    int iO4 = bVar.o();
                    if (iO4 <= 65535 && iO4 >= -32768) {
                        return Short.valueOf((short) iO4);
                    }
                    StringBuilder sbE3 = F.e(iO4, "Lossy conversion from ", " to short; at path ");
                    sbE3.append(bVar.i());
                    throw new com.nimbusds.jose.shaded.gson.p(sbE3.toString(), 10, false);
                } catch (NumberFormatException e18) {
                    throw new com.nimbusds.jose.shaded.gson.p(10, e18);
                }
            case 26:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                try {
                    return Integer.valueOf(bVar.o());
                } catch (NumberFormatException e19) {
                    throw new com.nimbusds.jose.shaded.gson.p(10, e19);
                }
            case 27:
                try {
                    return new AtomicInteger(bVar.o());
                } catch (NumberFormatException e20) {
                    throw new com.nimbusds.jose.shaded.gson.p(10, e20);
                }
            default:
                return new AtomicBoolean(bVar.m());
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IOException {
        switch (this.f10024a) {
            case 0:
                cVar.o((Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.b();
                int length = atomicIntegerArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    cVar.m(atomicIntegerArray.get(i7));
                }
                cVar.e();
                return;
            case 2:
                Number number = (Number) obj;
                if (number == null) {
                    cVar.i();
                    return;
                } else {
                    cVar.m(number.longValue());
                    return;
                }
            case 3:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    cVar.i();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                cVar.o(numberValueOf);
                return;
            case 4:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    cVar.i();
                    return;
                } else {
                    cVar.l(number2.doubleValue());
                    return;
                }
            case 5:
                Character ch2 = (Character) obj;
                cVar.p(ch2 == null ? null : String.valueOf(ch2));
                return;
            case 6:
                cVar.p((String) obj);
                return;
            case 7:
                cVar.o((BigDecimal) obj);
                return;
            case 8:
                cVar.o((BigInteger) obj);
                return;
            case 9:
                cVar.o((com.nimbusds.jose.shaded.gson.internal.h) obj);
                return;
            case 10:
                StringBuilder sb2 = (StringBuilder) obj;
                cVar.p(sb2 == null ? null : sb2.toString());
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                cVar.p(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 13:
                URL url = (URL) obj;
                cVar.p(url == null ? null : url.toExternalForm());
                return;
            case 14:
                URI uri = (URI) obj;
                cVar.p(uri == null ? null : uri.toASCIIString());
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                cVar.p(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 16:
                UUID uuid = (UUID) obj;
                cVar.p(uuid == null ? null : uuid.toString());
                return;
            case 17:
                cVar.p(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    cVar.i();
                    return;
                }
                cVar.c();
                cVar.g("year");
                cVar.m(calendar.get(1));
                cVar.g("month");
                cVar.m(calendar.get(2));
                cVar.g("dayOfMonth");
                cVar.m(calendar.get(5));
                cVar.g("hourOfDay");
                cVar.m(calendar.get(11));
                cVar.g("minute");
                cVar.m(calendar.get(12));
                cVar.g("second");
                cVar.m(calendar.get(13));
                cVar.f();
                return;
            case 19:
                Locale locale = (Locale) obj;
                cVar.p(locale == null ? null : locale.toString());
                return;
            case 20:
                d(cVar, (com.nimbusds.jose.shaded.gson.o) obj);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                cVar.b();
                int length2 = bitSet.length();
                for (int i10 = 0; i10 < length2; i10++) {
                    cVar.m(bitSet.get(i10) ? 1L : 0L);
                }
                cVar.e();
                return;
            case 22:
                cVar.n((Boolean) obj);
                return;
            case 23:
                Boolean bool = (Boolean) obj;
                cVar.p(bool == null ? BuildConfig.TRAVIS : bool.toString());
                return;
            case 24:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    cVar.i();
                    return;
                } else {
                    cVar.m(number3.byteValue());
                    return;
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    cVar.i();
                    return;
                } else {
                    cVar.m(number4.shortValue());
                    return;
                }
            case 26:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    cVar.i();
                    return;
                } else {
                    cVar.m(number5.intValue());
                    return;
                }
            case 27:
                cVar.m(((AtomicInteger) obj).get());
                return;
            default:
                cVar.q(((AtomicBoolean) obj).get());
                return;
        }
    }
}
