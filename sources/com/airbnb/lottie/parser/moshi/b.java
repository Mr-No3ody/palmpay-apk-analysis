package com.airbnb.lottie.parser.moshi;

import Kf.d;
import P0.c;
import Pg.k;
import Pg.l;
import Pg.m;
import Pg.u;
import Pg.x;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.EOFException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public static final m t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m f20168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m f20169w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f20170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f20171g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20173j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f20175p;

    static {
        l lVar = m.f7359d;
        t = lVar.encodeUtf8("'\\");
        f20168v = lVar.encodeUtf8("\"\\");
        f20169w = lVar.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
        lVar.encodeUtf8("\n\r");
        lVar.encodeUtf8("*/");
    }

    public b(x xVar) {
        this.f20165b = new int[32];
        this.f20166c = new String[32];
        this.f20167d = new int[32];
        this.f20172i = 0;
        this.f20170f = xVar;
        this.f20171g = xVar.f7389b;
        k(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void a() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 3) {
            k(1);
            this.f20167d[this.f20164a - 1] = 0;
            this.f20172i = 0;
        } else {
            throw new c("Expected BEGIN_ARRAY but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void b() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 1) {
            k(3);
            this.f20172i = 0;
        } else {
            throw new c("Expected BEGIN_OBJECT but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void c() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ != 4) {
            throw new c("Expected END_ARRAY but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
        }
        int i7 = this.f20164a;
        this.f20164a = i7 - 1;
        int[] iArr = this.f20167d;
        int i10 = i7 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f20172i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f20172i = 0;
        this.f20165b[0] = 8;
        this.f20164a = 1;
        this.f20171g.a();
        this.f20170f.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void d() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ != 2) {
            throw new c("Expected END_OBJECT but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
        }
        int i7 = this.f20164a;
        int i10 = i7 - 1;
        this.f20164a = i10;
        this.f20166c[i10] = null;
        int[] iArr = this.f20167d;
        int i11 = i7 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f20172i = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean e() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        return (iQ == 2 || iQ == 4 || iQ == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean f() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 5) {
            this.f20172i = 0;
            int[] iArr = this.f20167d;
            int i7 = this.f20164a - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        }
        if (iQ == 6) {
            this.f20172i = 0;
            int[] iArr2 = this.f20167d;
            int i10 = this.f20164a - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new c("Expected a boolean but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final double g() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 16) {
            this.f20172i = 0;
            int[] iArr = this.f20167d;
            int i7 = this.f20164a - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f20173j;
        }
        if (iQ == 17) {
            long j6 = this.f20174o;
            k kVar = this.f20171g;
            kVar.getClass();
            this.f20175p = kVar.readString(j6, Charsets.UTF_8);
        } else if (iQ == 9) {
            this.f20175p = v(f20168v);
        } else if (iQ == 8) {
            this.f20175p = v(t);
        } else if (iQ == 10) {
            this.f20175p = w();
        } else if (iQ != 11) {
            throw new c("Expected a double but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
        }
        this.f20172i = 11;
        try {
            double d2 = Double.parseDouble(this.f20175p);
            if (Double.isNaN(d2) || Double.isInfinite(d2)) {
                throw new d("JSON forbids NaN and infinities: " + d2 + " at path " + getPath());
            }
            this.f20175p = null;
            this.f20172i = 0;
            int[] iArr2 = this.f20167d;
            int i10 = this.f20164a - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return d2;
        } catch (NumberFormatException unused) {
            throw new c("Expected a double but was " + this.f20175p + " at path " + getPath(), 6, false);
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int h() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 16) {
            long j6 = this.f20173j;
            int i7 = (int) j6;
            if (j6 == i7) {
                this.f20172i = 0;
                int[] iArr = this.f20167d;
                int i10 = this.f20164a - 1;
                iArr[i10] = iArr[i10] + 1;
                return i7;
            }
            throw new c("Expected an int but was " + this.f20173j + " at path " + getPath(), 6, false);
        }
        if (iQ == 17) {
            long j10 = this.f20174o;
            k kVar = this.f20171g;
            kVar.getClass();
            this.f20175p = kVar.readString(j10, Charsets.UTF_8);
        } else if (iQ == 9 || iQ == 8) {
            String strV = iQ == 9 ? v(f20168v) : v(t);
            this.f20175p = strV;
            try {
                int i11 = Integer.parseInt(strV);
                this.f20172i = 0;
                int[] iArr2 = this.f20167d;
                int i12 = this.f20164a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        } else if (iQ != 11) {
            throw new c("Expected an int but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
        }
        this.f20172i = 11;
        try {
            double d2 = Double.parseDouble(this.f20175p);
            int i13 = (int) d2;
            if (i13 != d2) {
                throw new c("Expected an int but was " + this.f20175p + " at path " + getPath(), 6, false);
            }
            this.f20175p = null;
            this.f20172i = 0;
            int[] iArr3 = this.f20167d;
            int i14 = this.f20164a - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        } catch (NumberFormatException unused2) {
            throw new c("Expected an int but was " + this.f20175p + " at path " + getPath(), 6, false);
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final String i() throws d, EOFException {
        String string;
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 10) {
            string = w();
        } else if (iQ == 9) {
            string = v(f20168v);
        } else if (iQ == 8) {
            string = v(t);
        } else if (iQ == 11) {
            string = this.f20175p;
            this.f20175p = null;
        } else if (iQ == 16) {
            string = Long.toString(this.f20173j);
        } else {
            if (iQ != 17) {
                throw new c("Expected a string but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
            }
            long j6 = this.f20174o;
            k kVar = this.f20171g;
            kVar.getClass();
            string = kVar.readString(j6, Charsets.UTF_8);
        }
        this.f20172i = 0;
        int[] iArr = this.f20167d;
        int i7 = this.f20164a - 1;
        iArr[i7] = iArr[i7] + 1;
        return string;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int j() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        switch (iQ) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int l(p039cb.c cVar) throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ < 12 || iQ > 15) {
            return -1;
        }
        if (iQ == 15) {
            return r(this.f20175p, cVar);
        }
        int iSelect = this.f20170f.select((u) cVar.f18902c);
        if (iSelect != -1) {
            this.f20172i = 0;
            this.f20166c[this.f20164a - 1] = ((String[]) cVar.f18901b)[iSelect];
            return iSelect;
        }
        String str = this.f20166c[this.f20164a - 1];
        String strT = t();
        int iR = r(strT, cVar);
        if (iR == -1) {
            this.f20172i = 15;
            this.f20175p = strT;
            this.f20166c[this.f20164a - 1] = str;
        }
        return iR;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void m() throws d, EOFException {
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 14) {
            long jIndexOfElement = this.f20170f.indexOfElement(f20169w);
            k kVar = this.f20171g;
            if (jIndexOfElement == -1) {
                jIndexOfElement = kVar.f7358b;
            }
            kVar.skip(jIndexOfElement);
        } else if (iQ == 13) {
            y(f20168v);
        } else if (iQ == 12) {
            y(t);
        } else if (iQ != 15) {
            throw new c("Expected a name but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
        }
        this.f20172i = 0;
        this.f20166c[this.f20164a - 1] = BuildConfig.TRAVIS;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void n() throws d, EOFException {
        int i7 = 0;
        do {
            int iQ = this.f20172i;
            if (iQ == 0) {
                iQ = q();
            }
            if (iQ == 3) {
                k(1);
            } else {
                if (iQ == 1) {
                    k(3);
                } else if (iQ == 4) {
                    i7--;
                    if (i7 < 0) {
                        throw new c("Expected a value but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
                    }
                    this.f20164a--;
                } else if (iQ == 2) {
                    i7--;
                    if (i7 < 0) {
                        throw new c("Expected a value but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
                    }
                    this.f20164a--;
                } else {
                    k kVar = this.f20171g;
                    if (iQ == 14 || iQ == 10) {
                        long jIndexOfElement = this.f20170f.indexOfElement(f20169w);
                        if (jIndexOfElement == -1) {
                            jIndexOfElement = kVar.f7358b;
                        }
                        kVar.skip(jIndexOfElement);
                    } else if (iQ == 9 || iQ == 13) {
                        y(f20168v);
                    } else if (iQ == 8 || iQ == 12) {
                        y(t);
                    } else if (iQ == 17) {
                        kVar.skip(this.f20174o);
                    } else if (iQ == 18) {
                        throw new c("Expected a value but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
                    }
                }
                this.f20172i = 0;
            }
            i7++;
            this.f20172i = 0;
        } while (i7 != 0);
        int[] iArr = this.f20167d;
        int i10 = this.f20164a - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f20166c[i10] = BuildConfig.TRAVIS;
    }

    public final void p() throws d {
        o("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:177:0x0201  */
    /* JADX WARN: Code duplicated, block: B:230:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x0131  */
    public final int q() throws d, EOFException {
        int i7;
        String str;
        String str2;
        long j6;
        char cE;
        char c6;
        int i10;
        int i11;
        int i12;
        byte bE;
        char c10;
        int[] iArr = this.f20165b;
        int i13 = this.f20164a - 1;
        int i14 = iArr[i13];
        k kVar = this.f20171g;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else if (i14 == 2) {
            int iU = u(true);
            kVar.readByte();
            if (iU != 44) {
                if (iU == 59) {
                    p();
                    throw null;
                }
                if (iU == 93) {
                    this.f20172i = 4;
                    return 4;
                }
                o("Unterminated array");
                throw null;
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13] = 4;
                if (i14 == 5) {
                    int iU2 = u(true);
                    kVar.readByte();
                    if (iU2 != 44) {
                        if (iU2 == 59) {
                            p();
                            throw null;
                        }
                        if (iU2 == 125) {
                            this.f20172i = 2;
                            return 2;
                        }
                        o("Unterminated object");
                        throw null;
                    }
                }
                int iU3 = u(true);
                if (iU3 == 34) {
                    kVar.readByte();
                    this.f20172i = 13;
                    return 13;
                }
                if (iU3 == 39) {
                    kVar.readByte();
                    p();
                    throw null;
                }
                if (iU3 != 125) {
                    p();
                    throw null;
                }
                if (i14 == 5) {
                    o("Expected name");
                    throw null;
                }
                kVar.readByte();
                this.f20172i = 2;
                return 2;
            }
            if (i14 == 4) {
                iArr[i13] = 5;
                int iU4 = u(true);
                kVar.readByte();
                if (iU4 != 58) {
                    if (iU4 != 61) {
                        o("Expected ':'");
                        throw null;
                    }
                    p();
                    throw null;
                }
            } else if (i14 == 6) {
                iArr[i13] = 7;
            } else {
                if (i14 == 7) {
                    if (u(false) == -1) {
                        this.f20172i = 18;
                        return 18;
                    }
                    p();
                    throw null;
                }
                if (i14 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iU5 = u(true);
        if (iU5 == 34) {
            kVar.readByte();
            this.f20172i = 9;
            return 9;
        }
        if (iU5 == 39) {
            p();
            throw null;
        }
        if (iU5 != 44 && iU5 != 59) {
            if (iU5 == 91) {
                kVar.readByte();
                this.f20172i = 3;
                return 3;
            }
            if (iU5 != 93) {
                if (iU5 == 123) {
                    kVar.readByte();
                    this.f20172i = 1;
                    return 1;
                }
                byte bE2 = kVar.e(0L);
                x xVar = this.f20170f;
                if (bE2 == 116 || bE2 == 84) {
                    i7 = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bE2 != 102 && bE2 != 70) {
                        if (bE2 == 110 || bE2 == 78) {
                            i7 = 7;
                            str2 = BuildConfig.TRAVIS;
                            str = "NULL";
                        } else {
                            j6 = 0;
                            i7 = 0;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        boolean z3 = true;
                        long j10 = j6;
                        c6 = 0;
                        i10 = 0;
                        boolean z8 = false;
                        while (true) {
                            i11 = i10 + 1;
                            if (xVar.request(i11)) {
                                bE = kVar.e(i10);
                                if (bE != 43) {
                                    if (bE != 69 || bE == 101) {
                                        c10 = 6;
                                        if (c6 != 2 || c6 == 4) {
                                            c6 = 5;
                                            i10 = i11;
                                        } else {
                                            i12 = 0;
                                        }
                                    } else if (bE == 45) {
                                        c10 = 6;
                                        if (c6 == 0) {
                                            c6 = 1;
                                            z8 = true;
                                        } else {
                                            if (c6 != 5) {
                                                i12 = 0;
                                            }
                                            c6 = c10;
                                        }
                                        i10 = i11;
                                    } else if (bE != 46) {
                                        if (bE >= 48 && bE <= 57) {
                                            if (c6 == 1 || c6 == 0) {
                                                c10 = 6;
                                                j10 = -(bE - 48);
                                                c6 = 2;
                                            } else {
                                                if (c6 == 2) {
                                                    if (j10 != j6) {
                                                        long j11 = (10 * j10) - ((long) (bE - 48));
                                                        z3 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                                                        j10 = j11;
                                                    }
                                                } else if (c6 == 3) {
                                                    c6 = 4;
                                                } else {
                                                    c10 = 6;
                                                    if (c6 == 5 || c6 == 6) {
                                                        c6 = 7;
                                                    }
                                                }
                                                c10 = 6;
                                                i10 = i11;
                                            }
                                            i10 = i11;
                                        } else if (!s(bE)) {
                                        }
                                        i12 = 0;
                                    } else {
                                        c10 = 6;
                                        if (c6 == 2) {
                                            c6 = 3;
                                            i10 = i11;
                                        } else {
                                            i12 = 0;
                                        }
                                    }
                                    if (i12 != 0) {
                                        return i12;
                                    }
                                    if (s(kVar.e(j6))) {
                                        p();
                                        throw null;
                                    }
                                    o("Expected value");
                                    throw null;
                                }
                                c10 = 6;
                                if (c6 != 5) {
                                    i12 = 0;
                                    if (i12 != 0) {
                                        return i12;
                                    }
                                    if (s(kVar.e(j6))) {
                                        o("Expected value");
                                        throw null;
                                    }
                                    p();
                                    throw null;
                                }
                                c6 = c10;
                                i10 = i11;
                            }
                            if (c6 != 2 && z3 && ((j10 != Long.MIN_VALUE || z8) && (j10 != j6 || !z8))) {
                                if (!z8) {
                                    j10 = -j10;
                                }
                                this.f20173j = j10;
                                kVar.skip(i10);
                                i12 = 16;
                                this.f20172i = 16;
                            } else if (c6 != 2 || c6 == 4 || c6 == 7) {
                                this.f20174o = i10;
                                i12 = 17;
                                this.f20172i = 17;
                            } else {
                                i12 = 0;
                            }
                            if (i12 != 0) {
                                return i12;
                            }
                            if (s(kVar.e(j6))) {
                                o("Expected value");
                                throw null;
                            }
                            p();
                            throw null;
                        }
                    }
                    i7 = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j6 = 0;
                int i15 = 1;
                while (true) {
                    if (i15 >= length) {
                        if (!xVar.request(length + 1) || !s(kVar.e(length))) {
                            kVar.skip(length);
                            this.f20172i = i7;
                            break;
                        }
                    } else {
                        int i16 = i15 + 1;
                        if (xVar.request(i16) && ((cE = kVar.e(i15)) == str2.charAt(i15) || cE == str.charAt(i15))) {
                            i15 = i16;
                        }
                    }
                    i7 = 0;
                    break;
                }
                if (i7 != 0) {
                    return i7;
                }
                boolean z10 = true;
                long j12 = j6;
                c6 = 0;
                i10 = 0;
                boolean z11 = false;
                while (true) {
                    i11 = i10 + 1;
                    if (xVar.request(i11)) {
                        bE = kVar.e(i10);
                        if (bE != 43) {
                            if (bE != 69) {
                                c10 = 6;
                                if (c6 != 2) {
                                }
                                c6 = 5;
                                i10 = i11;
                            } else {
                                c10 = 6;
                                if (c6 != 2) {
                                }
                                c6 = 5;
                                i10 = i11;
                            }
                            if (i12 != 0) {
                                return i12;
                            }
                            if (s(kVar.e(j6))) {
                                o("Expected value");
                                throw null;
                            }
                            p();
                            throw null;
                        }
                        c10 = 6;
                        if (c6 != 5) {
                            i12 = 0;
                            if (i12 != 0) {
                                return i12;
                            }
                            if (s(kVar.e(j6))) {
                                o("Expected value");
                                throw null;
                            }
                            p();
                            throw null;
                        }
                        c6 = c10;
                        i10 = i11;
                    }
                    if (c6 != 2) {
                        if (c6 != 2) {
                        }
                        this.f20174o = i10;
                        i12 = 17;
                        this.f20172i = 17;
                    } else {
                        if (c6 != 2) {
                        }
                        this.f20174o = i10;
                        i12 = 17;
                        this.f20172i = 17;
                    }
                    if (i12 != 0) {
                        return i12;
                    }
                    if (s(kVar.e(j6))) {
                        o("Expected value");
                        throw null;
                    }
                    p();
                    throw null;
                }
            }
            if (i14 == 1) {
                kVar.readByte();
                this.f20172i = 4;
                return 4;
            }
        }
        if (i14 == 1 || i14 == 2) {
            p();
            throw null;
        }
        o("Unexpected value");
        throw null;
    }

    public final int r(String str, p039cb.c cVar) {
        int length = ((String[]) cVar.f18901b).length;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(((String[]) cVar.f18901b)[i7])) {
                this.f20172i = 0;
                this.f20166c[this.f20164a - 1] = str;
                return i7;
            }
        }
        return -1;
    }

    public final boolean s(int i7) throws d {
        if (i7 == 9 || i7 == 10 || i7 == 12 || i7 == 13 || i7 == 32) {
            return false;
        }
        if (i7 != 35) {
            if (i7 == 44) {
                return false;
            }
            if (i7 != 47 && i7 != 61) {
                if (i7 == 123 || i7 == 125 || i7 == 58) {
                    return false;
                }
                if (i7 != 59) {
                    switch (i7) {
                        case 91:
                        case HomeDialogState.PRIORITY_OK_CARD_DIALOG /* 93 */:
                            return false;
                        case HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        p();
        throw null;
    }

    public final String t() throws d, EOFException {
        String strV;
        int iQ = this.f20172i;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 14) {
            strV = w();
        } else if (iQ == 13) {
            strV = v(f20168v);
        } else if (iQ == 12) {
            strV = v(t);
        } else {
            if (iQ != 15) {
                throw new c("Expected a name but was " + com.airbnb.lottie.model.layer.d.w(j()) + " at path " + getPath(), 6, false);
            }
            strV = this.f20175p;
        }
        this.f20172i = 0;
        this.f20166c[this.f20164a - 1] = strV;
        return strV;
    }

    public final String toString() {
        return "JsonReader(" + this.f20170f + ")";
    }

    public final int u(boolean z3) throws d, EOFException {
        int i7 = 0;
        while (true) {
            int i10 = i7 + 1;
            x xVar = this.f20170f;
            if (!xVar.request(i10)) {
                if (z3) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j6 = i7;
            k kVar = this.f20171g;
            byte bE = kVar.e(j6);
            if (bE != 10 && bE != 32 && bE != 13 && bE != 9) {
                kVar.skip(j6);
                if (bE == 47) {
                    if (xVar.request(2L)) {
                        p();
                        throw null;
                    }
                } else if (bE == 35) {
                    p();
                    throw null;
                }
                return bE;
            }
            i7 = i10;
        }
    }

    public final String v(m mVar) throws d, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jIndexOfElement = this.f20170f.indexOfElement(mVar);
            if (jIndexOfElement == -1) {
                o("Unterminated string");
                throw null;
            }
            k kVar = this.f20171g;
            if (kVar.e(jIndexOfElement) != 92) {
                if (sb2 == null) {
                    String string = kVar.readString(jIndexOfElement, Charsets.UTF_8);
                    kVar.readByte();
                    return string;
                }
                sb2.append(kVar.readString(jIndexOfElement, Charsets.UTF_8));
                kVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(kVar.readString(jIndexOfElement, Charsets.UTF_8));
            kVar.readByte();
            sb2.append(x());
        }
    }

    public final String w() {
        long jIndexOfElement = this.f20170f.indexOfElement(f20169w);
        k kVar = this.f20171g;
        if (jIndexOfElement == -1) {
            return kVar.readUtf8();
        }
        kVar.getClass();
        return kVar.readString(jIndexOfElement, Charsets.UTF_8);
    }

    public final char x() throws d, EOFException {
        int i7;
        x xVar = this.f20170f;
        if (!xVar.request(1L)) {
            o("Unterminated escape sequence");
            throw null;
        }
        k kVar = this.f20171g;
        byte b7 = kVar.readByte();
        if (b7 == 10 || b7 == 34 || b7 == 39 || b7 == 47 || b7 == 92) {
            return (char) b7;
        }
        if (b7 == 98) {
            return '\b';
        }
        if (b7 == 102) {
            return '\f';
        }
        if (b7 == 110) {
            return '\n';
        }
        if (b7 == 114) {
            return '\r';
        }
        if (b7 == 116) {
            return '\t';
        }
        if (b7 != 117) {
            o("Invalid escape sequence: \\" + ((char) b7));
            throw null;
        }
        if (!xVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c6 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            byte bE = kVar.e(i10);
            char c10 = (char) (c6 << 4);
            if (bE >= 48 && bE <= 57) {
                i7 = bE - 48;
            } else if (bE >= 97 && bE <= 102) {
                i7 = bE - 87;
            } else {
                if (bE < 65 || bE > 70) {
                    o("\\u".concat(kVar.readString(4L, Charsets.UTF_8)));
                    throw null;
                }
                i7 = bE - 55;
            }
            c6 = (char) (i7 + c10);
        }
        kVar.skip(4L);
        return c6;
    }

    public final void y(m mVar) throws d, EOFException {
        while (true) {
            long jIndexOfElement = this.f20170f.indexOfElement(mVar);
            if (jIndexOfElement == -1) {
                o("Unterminated string");
                throw null;
            }
            k kVar = this.f20171g;
            if (kVar.e(jIndexOfElement) != 92) {
                kVar.skip(jIndexOfElement + 1);
                return;
            } else {
                kVar.skip(jIndexOfElement + 1);
                x();
            }
        }
    }
}
