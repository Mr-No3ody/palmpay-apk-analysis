package androidx.datastore.preferences.protobuf;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1102h {
    public static void a(byte b7, byte b10, byte b11, byte b12, char[] cArr, int i7) throws C1160z1 {
        if (!r(b10)) {
            if ((((b10 + 112) + (b7 << Ascii.FS)) >> 30) == 0 && !r(b11) && !r(b12)) {
                int i10 = ((b7 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i7] = (char) ((i10 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw C1160z1.b();
    }

    public static void b(byte b7, byte b10, char[] cArr, int i7) throws C1160z1 {
        if (b7 < -62 || r(b10)) {
            throw C1160z1.b();
        }
        cArr[i7] = (char) (((b7 & Ascii.US) << 6) | (b10 & 63));
    }

    public static void c(byte b7, byte b10, byte b11, char[] cArr, int i7) throws C1160z1 {
        if (r(b10) || ((b7 == -32 && b10 < -96) || ((b7 == -19 && b10 >= -96) || r(b11)))) {
            throw C1160z1.b();
        }
        cArr[i7] = (char) (((b7 & Ascii.SI) << 12) | ((b10 & 63) << 6) | (b11 & 63));
    }

    public static int d(byte[] bArr, int i7, C1098g c1098g) throws C1160z1 {
        int iM = m(bArr, i7, c1098g);
        int i10 = c1098g.f16616a;
        if (i10 < 0) {
            throw C1160z1.e();
        }
        if (i10 > bArr.length - iM) {
            throw C1160z1.g();
        }
        if (i10 == 0) {
            c1098g.f16618c = AbstractC1123n.f16699b;
            return iM;
        }
        c1098g.f16618c = AbstractC1123n.c(iM, i10, bArr);
        return iM + i10;
    }

    public static int e(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i7] & UnsignedBytes.MAX_VALUE) | ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i7 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static long f(byte[] bArr, int i7) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public static int g(Schema schema, int i7, byte[] bArr, int i10, int i11, Internal$ProtobufList internal$ProtobufList, C1098g c1098g) throws IOException {
        Object objNewInstance = schema.newInstance();
        Schema schema2 = schema;
        byte[] bArr2 = bArr;
        int i12 = i11;
        C1098g c1098g2 = c1098g;
        int iT = t(objNewInstance, schema2, bArr2, i10, i12, c1098g2);
        schema2.makeImmutable(objNewInstance);
        c1098g2.f16618c = objNewInstance;
        internal$ProtobufList.add(objNewInstance);
        while (iT < i12) {
            C1098g c1098g3 = c1098g2;
            int i13 = i12;
            int iM = m(bArr2, iT, c1098g3);
            if (i7 != c1098g3.f16616a) {
                break;
            }
            byte[] bArr3 = bArr2;
            Schema schema3 = schema2;
            Object objNewInstance2 = schema3.newInstance();
            iT = t(objNewInstance2, schema3, bArr3, iM, i13, c1098g3);
            schema2 = schema3;
            bArr2 = bArr3;
            i12 = i13;
            c1098g2 = c1098g3;
            schema2.makeImmutable(objNewInstance2);
            c1098g2.f16618c = objNewInstance2;
            internal$ProtobufList.add(objNewInstance2);
        }
        return iT;
    }

    public static int h(int i7, byte[] bArr, int i10, int i11, q2 q2Var, C1098g c1098g) throws C1160z1 {
        if ((i7 >>> 3) == 0) {
            throw C1160z1.a();
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int iO = o(bArr, i10, c1098g);
            q2Var.d(i7, Long.valueOf(c1098g.f16617b));
            return iO;
        }
        if (i12 == 1) {
            q2Var.d(i7, Long.valueOf(f(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iM = m(bArr, i10, c1098g);
            int i13 = c1098g.f16616a;
            if (i13 < 0) {
                throw C1160z1.e();
            }
            if (i13 > bArr.length - iM) {
                throw C1160z1.g();
            }
            if (i13 == 0) {
                q2Var.d(i7, AbstractC1123n.f16699b);
            } else {
                q2Var.d(i7, AbstractC1123n.c(iM, i13, bArr));
            }
            return iM + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw C1160z1.a();
            }
            q2Var.d(i7, Integer.valueOf(e(bArr, i10)));
            return i10 + 4;
        }
        q2 q2VarC = q2.c();
        int i14 = (i7 & (-8)) | 4;
        int i15 = c1098g.f16620e + 1;
        c1098g.f16620e = i15;
        if (i15 >= 100) {
            throw new C1160z1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (i10 < i11) {
            int iM2 = m(bArr, i10, c1098g);
            i16 = c1098g.f16616a;
            if (i16 == i14) {
                i10 = iM2;
                break;
            }
            i10 = h(i16, bArr, iM2, i11, q2VarC, c1098g);
        }
        c1098g.f16620e--;
        if (i10 > i11 || i16 != i14) {
            throw C1160z1.f();
        }
        q2Var.d(i7, q2VarC);
        return i10;
    }

    public static String j(ByteBuffer byteBuffer, int i7, int i10) throws C1160z1 {
        if ((i7 | i10 | ((byteBuffer.limit() - i7) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i10)));
        }
        int i11 = i7 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i7 < i11) {
            byte b7 = byteBuffer.get(i7);
            if (b7 < 0) {
                break;
            }
            i7++;
            cArr[i12] = (char) b7;
            i12++;
        }
        int i13 = i12;
        while (i7 < i11) {
            int i14 = i7 + 1;
            byte b10 = byteBuffer.get(i7);
            if (b10 >= 0) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b10;
                int i16 = i14;
                while (i16 < i11) {
                    byte b11 = byteBuffer.get(i16);
                    if (b11 < 0) {
                        break;
                    }
                    i16++;
                    cArr[i15] = (char) b11;
                    i15++;
                }
                i13 = i15;
                i7 = i16;
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw C1160z1.b();
                }
                i7 += 2;
                b(b10, byteBuffer.get(i14), cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw C1160z1.b();
                }
                int i17 = i7 + 2;
                i7 += 3;
                c(b10, byteBuffer.get(i14), byteBuffer.get(i17), cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw C1160z1.b();
                }
                byte b12 = byteBuffer.get(i14);
                int i18 = i7 + 3;
                byte b13 = byteBuffer.get(i7 + 2);
                i7 += 4;
                a(b10, b12, b13, byteBuffer.get(i18), cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static int l(int i7, byte[] bArr, int i10, C1098g c1098g) {
        int i11 = i7 & 127;
        int i12 = i10 + 1;
        byte b7 = bArr[i10];
        if (b7 >= 0) {
            c1098g.f16616a = i11 | (b7 << 7);
            return i12;
        }
        int i13 = i11 | ((b7 & Ascii.DEL) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            c1098g.f16616a = i13 | (b10 << Ascii.SO);
            return i14;
        }
        int i15 = i13 | ((b10 & Ascii.DEL) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            c1098g.f16616a = i15 | (b11 << Ascii.NAK);
            return i16;
        }
        int i17 = i15 | ((b11 & Ascii.DEL) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            c1098g.f16616a = i17 | (b12 << Ascii.FS);
            return i18;
        }
        int i19 = i17 | ((b12 & Ascii.DEL) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                c1098g.f16616a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int m(byte[] bArr, int i7, C1098g c1098g) {
        int i10 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return l(b7, bArr, i10, c1098g);
        }
        c1098g.f16616a = b7;
        return i10;
    }

    public static int n(int i7, byte[] bArr, int i10, int i11, Internal$ProtobufList internal$ProtobufList, C1098g c1098g) {
        C1148v1 c1148v1 = (C1148v1) internal$ProtobufList;
        int iM = m(bArr, i10, c1098g);
        c1148v1.addInt(c1098g.f16616a);
        while (iM < i11) {
            int iM2 = m(bArr, iM, c1098g);
            if (i7 != c1098g.f16616a) {
                break;
            }
            iM = m(bArr, iM2, c1098g);
            c1148v1.addInt(c1098g.f16616a);
        }
        return iM;
    }

    public static int o(byte[] bArr, int i7, C1098g c1098g) {
        int i10 = i7 + 1;
        long j6 = bArr[i7];
        if (j6 >= 0) {
            c1098g.f16617b = j6;
            return i10;
        }
        int i11 = i7 + 2;
        byte b7 = bArr[i10];
        long j10 = (j6 & 127) | (((long) (b7 & Ascii.DEL)) << 7);
        int i12 = 7;
        while (b7 < 0) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            i12 += 7;
            j10 |= ((long) (b10 & Ascii.DEL)) << i12;
            b7 = b10;
            i11 = i13;
        }
        c1098g.f16617b = j10;
        return i11;
    }

    public static String q(AbstractC1123n abstractC1123n) {
        StringBuilder sb2 = new StringBuilder(abstractC1123n.size());
        for (int i7 = 0; i7 < abstractC1123n.size(); i7++) {
            byte bA = abstractC1123n.a(i7);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean r(byte b7) {
        return b7 > -65;
    }

    public static int s(Object obj, Schema schema, byte[] bArr, int i7, int i10, int i11, C1098g c1098g) throws C1160z1 {
        O1 o10 = (O1) schema;
        int i12 = c1098g.f16620e + 1;
        c1098g.f16620e = i12;
        if (i12 >= 100) {
            throw new C1160z1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iX = o10.x(obj, bArr, i7, i10, i11, c1098g);
        c1098g.f16620e--;
        c1098g.f16618c = obj;
        return iX;
    }

    public static int t(Object obj, Schema schema, byte[] bArr, int i7, int i10, C1098g c1098g) throws IOException {
        int iL = i7 + 1;
        int i11 = bArr[i7];
        if (i11 < 0) {
            iL = l(i11, bArr, iL, c1098g);
            i11 = c1098g.f16616a;
        }
        int i12 = iL;
        if (i11 < 0 || i11 > i10 - i12) {
            throw C1160z1.g();
        }
        int i13 = c1098g.f16620e + 1;
        c1098g.f16620e = i13;
        if (i13 >= 100) {
            throw new C1160z1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i14 = i12 + i11;
        schema.mergeFrom(obj, bArr, i12, i14, c1098g);
        c1098g.f16620e--;
        c1098g.f16618c = obj;
        return i14;
    }

    public static int v(int i7, byte[] bArr, int i10, int i11, C1098g c1098g) throws C1160z1 {
        if ((i7 >>> 3) == 0) {
            throw C1160z1.a();
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            return o(bArr, i10, c1098g);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return m(bArr, i10, c1098g) + c1098g.f16616a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw C1160z1.a();
        }
        int i13 = (i7 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = m(bArr, i10, c1098g);
            i14 = c1098g.f16616a;
            if (i14 == i13) {
                break;
            }
            i10 = v(i14, bArr, i10, i11, c1098g);
        }
        if (i10 > i11 || i14 != i13) {
            throw C1160z1.f();
        }
        return i10;
    }

    public abstract String i(byte[] bArr, int i7, int i10);

    public abstract String k(ByteBuffer byteBuffer, int i7, int i10);

    public abstract int p(String str, byte[] bArr, int i7, int i10);

    public abstract int u(byte[] bArr, int i7, int i10);

    public abstract void w(byte[] bArr, int i7, int i10);
}
