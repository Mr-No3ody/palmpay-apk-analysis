package Pg;

import C0.G;
import N8.q0;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.C1844k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public class m implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f7359d = new l(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f7360e = new m(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f7362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f7363c;

    public m(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f7361a = data;
    }

    public String a() {
        return AbstractC0554a.a(this.f7361a, AbstractC0554a.f7337a);
    }

    public String b() {
        return AbstractC0554a.a(this.f7361a, AbstractC0554a.f7338b);
    }

    public m c(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f7361a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.e(bArrDigest);
        return new m(bArrDigest);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m other = (m) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int iD = d();
        int iD2 = other.d();
        int iMin = Math.min(iD, iD2);
        for (int i7 = 0; i7 < iMin; i7++) {
            int iG = g(i7) & UnsignedBytes.MAX_VALUE;
            int iG2 = other.g(i7) & UnsignedBytes.MAX_VALUE;
            if (iG != iG2) {
                return iG < iG2 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public int d() {
        return this.f7361a.length;
    }

    public String e() {
        byte[] bArr = this.f7361a;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i10 = i7 + 1;
            char[] cArr2 = Qg.b.f7851a;
            cArr[i7] = cArr2[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i10] = cArr2[b7 & Ascii.SI];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            int iD = mVar.d();
            byte[] bArr = this.f7361a;
            if (iD == bArr.length && mVar.h(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f7361a;
    }

    public byte g(int i7) {
        return this.f7361a[i7];
    }

    public boolean h(int i7, byte[] other, int i10, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i7 < 0) {
            return false;
        }
        byte[] bArr = this.f7361a;
        return i7 <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && AbstractC0555b.a(bArr, i7, other, i10, i11);
    }

    public int hashCode() {
        int i7 = this.f7362b;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = Arrays.hashCode(this.f7361a);
        this.f7362b = iHashCode;
        return iHashCode;
    }

    public boolean i(m other, int i7) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.h(0, this.f7361a, 0, i7);
    }

    public m j() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f7361a;
            if (i7 >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i7];
            if (b7 >= 65 && b7 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i7] = (byte) (b7 + 32);
                for (int i10 = i7 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b10 = bArrCopyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new m(bArrCopyOf);
            }
            i7++;
        }
    }

    public byte[] k() {
        byte[] bArr = this.f7361a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final String l() {
        String str = this.f7363c;
        if (str != null) {
            return str;
        }
        byte[] bArrF = f();
        Intrinsics.checkNotNullParameter(bArrF, "<this>");
        String str2 = new String(bArrF, Charsets.UTF_8);
        this.f7363c = str2;
        return str2;
    }

    public void m(k buffer, int i7, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.l(this.f7361a, i7, i10);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x01c3 A[EDGE_INSN: B:182:0x01c3->B:183:0x01c4 BREAK  A[LOOP:0: B:7:0x000e->B:247:0x000e]] */
    public String toString() {
        m mVar;
        byte b7;
        int i7;
        byte[] bArr = this.f7361a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (i10 < length) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                if ((b10 >> 5) != -2) {
                    if ((b10 >> 4) != -2) {
                        if ((b10 >> 3) != -2) {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                        int i13 = i10 + 3;
                        if (length > i13) {
                            byte b11 = bArr[i10 + 1];
                            if ((b11 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b12 = bArr[i10 + 2];
                            if ((b12 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b13 = bArr[i13];
                            if ((b13 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            int i14 = (((b13 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b12 << 6)) ^ (b11 << Ascii.FF)) ^ (b10 << Ascii.DC2);
                            if (i14 <= 1114111) {
                                if (55296 <= i14 && i14 < 57344) {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                                if (i14 >= 65536) {
                                    int i15 = i12 + 1;
                                    if (i12 == 64) {
                                        break;
                                    }
                                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                        i11 = -1;
                                        break;
                                    }
                                    i11 += i14 < 65536 ? 1 : 2;
                                    Unit unit = Unit.f38893a;
                                    i10 += 4;
                                    i12 = i15;
                                } else {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                            } else {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    } else {
                        int i16 = i10 + 2;
                        if (length > i16) {
                            byte b14 = bArr[i10 + 1];
                            if ((b14 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b15 = bArr[i16];
                            if ((b15 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            int i17 = ((b15 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b14 << 6)) ^ (b10 << Ascii.FF);
                            if (i17 >= 2048) {
                                if (55296 <= i17 && i17 < 57344) {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                                i7 = i12 + 1;
                                if (i12 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    i11 = -1;
                                    break;
                                }
                                i11 += i17 < 65536 ? 1 : 2;
                                Unit unit2 = Unit.f38893a;
                                i10 += 3;
                                i12 = i7;
                            } else {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    }
                } else {
                    int i18 = i10 + 1;
                    if (length > i18) {
                        byte b16 = bArr[i18];
                        if ((b16 & 192) != 128) {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                        int i19 = (b16 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b10 << 6);
                        if (i19 >= 128) {
                            i7 = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                i11 = -1;
                                break;
                            }
                            i11 += i19 < 65536 ? 1 : 2;
                            Unit unit3 = Unit.f38893a;
                            i10 += 2;
                            i12 = i7;
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    } else {
                        if (i12 == 64) {
                            break;
                        }
                        i11 = -1;
                        break;
                    }
                }
            } else {
                int i20 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                    i11 += b10 < 65536 ? 1 : 2;
                    i10++;
                    while (true) {
                        i12 = i20;
                        if (i10 < length && (b7 = bArr[i10]) >= 0) {
                            i10++;
                            i20 = i12 + 1;
                            if (i12 == 64) {
                                break loop0;
                            }
                            if ((b7 == 10 || b7 == 13 || ((b7 < 0 || b7 >= 32) && (127 > b7 || b7 >= 160))) && b7 != 65533) {
                                i11 += b7 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i11 = -1;
                break;
            }
        }
        if (i11 != -1) {
            String strL = l();
            String strSubstring = strL.substring(0, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strK = kotlin.text.y.k(kotlin.text.y.k(kotlin.text.y.k(strSubstring, "\\", "\\\\"), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n"), "\r", "\\r");
            if (i11 >= strL.length()) {
                return G.l(']', "[text=", strK);
            }
            return "[size=" + bArr.length + " text=" + strK + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(q0.m(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 == bArr.length) {
            mVar = this;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            C1844k.a(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
            mVar = new m(bArrCopyOfRange);
        }
        sb2.append(mVar.e());
        sb2.append("…]");
        return sb2.toString();
    }
}
