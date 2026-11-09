package com.nimbusds.jose.shaded.gson.stream;

import N8.q0;
import androidx.camera.video.u;
import com.google.maps.android.BuildConfig;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int[] f23694A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f23695a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f23703j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f23705p;
    public int[] t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String[] f23707w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23696b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char[] f23697c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23698d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23699e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23700f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23701g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23702i = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23706v = 1;

    static {
        a.f23693a = new a();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.t = iArr;
        iArr[0] = 6;
        this.f23707w = new String[32];
        this.f23694A = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f23695a = reader;
    }

    public final void A() {
        char c6;
        do {
            if (this.f23698d >= this.f23699e && !g(1)) {
                return;
            }
            int i7 = this.f23698d;
            int i10 = i7 + 1;
            this.f23698d = i10;
            c6 = this.f23697c[i7];
            if (c6 == '\n') {
                this.f23700f++;
                this.f23701g = i10;
                return;
            }
        } while (c6 != '\r');
    }

    public final void B() throws d {
        do {
            int i7 = 0;
            while (true) {
                int i10 = this.f23698d;
                if (i10 + i7 < this.f23699e) {
                    char c6 = this.f23697c[i10 + i7];
                    if (c6 != '\t' && c6 != '\n' && c6 != '\f' && c6 != '\r' && c6 != ' ') {
                        if (c6 != '#') {
                            if (c6 != ',') {
                                if (c6 != '/' && c6 != '=') {
                                    if (c6 != '{' && c6 != '}' && c6 != ':') {
                                        if (c6 != ';') {
                                            switch (c6) {
                                                case '[':
                                                case HomeDialogState.PRIORITY_OK_CARD_DIALOG /* 93 */:
                                                    break;
                                                case HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG /* 92 */:
                                                    break;
                                                default:
                                                    i7++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    this.f23698d += i7;
                    return;
                }
                this.f23698d = i10 + i7;
            }
        } while (g(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void C() throws IOException {
        int i7 = 0;
        do {
            int iD = this.f23702i;
            if (iD == 0) {
                iD = d();
            }
            switch (iD) {
                case 1:
                    x(3);
                    i7++;
                    this.f23702i = 0;
                    break;
                case 2:
                    if (i7 == 0) {
                        this.f23707w[this.f23706v - 1] = null;
                    }
                    this.f23706v--;
                    i7--;
                    this.f23702i = 0;
                    break;
                case 3:
                    x(1);
                    i7++;
                    this.f23702i = 0;
                    break;
                case 4:
                    this.f23706v--;
                    i7--;
                    this.f23702i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f23702i = 0;
                    break;
                case 8:
                    z('\'');
                    this.f23702i = 0;
                    break;
                case 9:
                    z('\"');
                    this.f23702i = 0;
                    break;
                case 10:
                    B();
                    this.f23702i = 0;
                    break;
                case 12:
                    z('\'');
                    if (i7 == 0) {
                        this.f23707w[this.f23706v - 1] = "<skipped>";
                    }
                    this.f23702i = 0;
                    break;
                case 13:
                    z('\"');
                    if (i7 == 0) {
                        this.f23707w[this.f23706v - 1] = "<skipped>";
                    }
                    this.f23702i = 0;
                    break;
                case 14:
                    B();
                    if (i7 == 0) {
                        this.f23707w[this.f23706v - 1] = "<skipped>";
                    }
                    this.f23702i = 0;
                    break;
                case 16:
                    this.f23698d += this.f23704o;
                    this.f23702i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i7 > 0);
        int[] iArr = this.f23694A;
        int i10 = this.f23706v - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final void D(String str) throws d {
        StringBuilder sbS = u.s(str);
        sbS.append(l());
        throw new d(sbS.toString());
    }

    public void a() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 3) {
            x(1);
            this.f23694A[this.f23706v - 1] = 0;
            this.f23702i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + d0.u(w()) + l());
        }
    }

    public void b() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 1) {
            x(3);
            this.f23702i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + d0.u(w()) + l());
        }
    }

    public final void c() throws d {
        if (this.f23696b) {
            return;
        }
        D("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23702i = 0;
        this.t[0] = 8;
        this.f23706v = 1;
        this.f23695a.close();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:115:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x0180  */
    /* JADX WARN: Code duplicated, block: B:119:0x0192  */
    /* JADX WARN: Code duplicated, block: B:122:0x0198  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9 A[PHI: r4 r15
      0x01a9: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]
      0x01a9: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0214  */
    /* JADX WARN: Code duplicated, block: B:169:0x0216  */
    /* JADX WARN: Code duplicated, block: B:181:0x0237 A[DONT_INVERT, PHI: r8
      0x0237: PHI (r8v19 int) = (r8v18 int), (r8v20 int) binds: [B:167:0x0212, B:173:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0239  */
    /* JADX WARN: Code duplicated, block: B:195:0x0256  */
    /* JADX WARN: Code duplicated, block: B:197:0x0259  */
    /* JADX WARN: Code duplicated, block: B:200:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0267 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:0x0268  */
    /* JADX WARN: Code duplicated, block: B:207:0x0272  */
    /* JADX WARN: Code duplicated, block: B:209:0x0278  */
    /* JADX WARN: Code duplicated, block: B:211:0x027e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x0283  */
    /* JADX WARN: Code duplicated, block: B:216:0x0287  */
    /* JADX WARN: Code duplicated, block: B:226:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:228:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:269:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    public final int d() throws IOException {
        int iR;
        int i7;
        int iR2;
        char c6;
        String str;
        String str2;
        int i10;
        int length;
        int i11;
        char c10;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        char c11;
        int i16;
        int i17;
        int[] iArr = this.t;
        int i18 = this.f23706v - 1;
        int i19 = iArr[i18];
        char[] cArr = this.f23697c;
        if (i19 == 1) {
            iArr[i18] = 2;
        } else if (i19 == 2) {
            int iR3 = r(true);
            if (iR3 != 44) {
                if (iR3 != 59) {
                    if (iR3 == 93) {
                        this.f23702i = 4;
                        return 4;
                    }
                    D("Unterminated array");
                    throw null;
                }
                c();
            }
        } else {
            if (i19 == 3 || i19 == 5) {
                iArr[i18] = 4;
                if (i19 == 5 && (iR = r(true)) != 44) {
                    if (iR != 59) {
                        if (iR == 125) {
                            this.f23702i = 2;
                            return 2;
                        }
                        D("Unterminated object");
                        throw null;
                    }
                    c();
                }
                int iR4 = r(true);
                if (iR4 == 34) {
                    this.f23702i = 13;
                    return 13;
                }
                if (iR4 == 39) {
                    c();
                    this.f23702i = 12;
                    return 12;
                }
                if (iR4 == 125) {
                    if (i19 != 5) {
                        this.f23702i = 2;
                        return 2;
                    }
                    D("Expected name");
                    throw null;
                }
                c();
                this.f23698d--;
                if (k((char) iR4)) {
                    this.f23702i = 14;
                    return 14;
                }
                D("Expected name");
                throw null;
            }
            if (i19 != 4) {
                if (i19 == 6) {
                    if (this.f23696b) {
                        r(true);
                        int i20 = this.f23698d;
                        this.f23698d = i20 - 1;
                        if (i20 + 4 <= this.f23699e || g(5)) {
                            int i21 = this.f23698d;
                            if (cArr[i21] == ')' && cArr[i21 + 1] == ']' && cArr[i21 + 2] == '}' && cArr[i21 + 3] == '\'' && cArr[i21 + 4] == '\n') {
                                this.f23698d = i21 + 5;
                            }
                        }
                    }
                    this.t[this.f23706v - 1] = 7;
                } else if (i19 == 7) {
                    i7 = 0;
                    if (r(false) == -1) {
                        this.f23702i = 17;
                        return 17;
                    }
                    c();
                    this.f23698d--;
                } else {
                    i7 = 0;
                    if (i19 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iR2 = r(true);
                if (iR2 != 34) {
                    this.f23702i = 9;
                    return 9;
                }
                if (iR2 != 39) {
                    c();
                    this.f23702i = 8;
                    return 8;
                }
                if (iR2 != 44 && iR2 != 59) {
                    if (iR2 != 91) {
                        this.f23702i = 3;
                        return 3;
                    }
                    if (iR2 != 93) {
                        if (iR2 != 123) {
                            this.f23702i = 1;
                            return 1;
                        }
                        int i22 = this.f23698d - 1;
                        this.f23698d = i22;
                        c6 = cArr[i22];
                        if (c6 != 't' || c6 == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i10 = 5;
                        } else {
                            if (c6 != 'f' && c6 != 'F') {
                                if (c6 != 'n' && c6 != 'N') {
                                    i10 = i7;
                                    break;
                                }
                                str = BuildConfig.TRAVIS;
                                str2 = "NULL";
                                i10 = 7;
                                if (i10 != 0) {
                                    return i10;
                                }
                                int i23 = this.f23698d;
                                i12 = this.f23699e;
                                i13 = i7;
                                i14 = i13;
                                int i24 = i14;
                                i15 = i23;
                                z3 = true;
                                long j6 = 0;
                                while (true) {
                                    if (i15 + i14 != i12) {
                                        c11 = cArr[i15 + i14];
                                        if (c11 != '+') {
                                            if (c11 != 'E' || c11 == 'e') {
                                                if (i13 != 2 || i13 == 4) {
                                                    i13 = 5;
                                                    i14++;
                                                }
                                            } else if (c11 == '-') {
                                                if (i13 == 0) {
                                                    i13 = 1;
                                                    i24 = 1;
                                                } else {
                                                    if (i13 != 5) {
                                                    }
                                                    i13 = 6;
                                                }
                                                i14++;
                                            } else if (c11 != '.') {
                                                if (c11 >= '0' && c11 <= '9') {
                                                    if (i13 == 1 || i13 == 0) {
                                                        j6 = -(c11 - '0');
                                                        i13 = 2;
                                                    } else if (i13 == 2) {
                                                        if (j6 != 0) {
                                                            long j10 = (10 * j6) - ((long) (c11 - '0'));
                                                            z3 &= j6 > -922337203685477580L || (j6 == -922337203685477580L && j10 < j6);
                                                            j6 = j10;
                                                        }
                                                    } else if (i13 == 3) {
                                                        i13 = 4;
                                                    } else if (i13 == 5 || i13 == 6) {
                                                        i13 = 7;
                                                    }
                                                    i14++;
                                                } else if (!k(c11)) {
                                                    i17 = 2;
                                                    if (i13 != 2) {
                                                        if (i13 != i17 || i13 == 4 || i13 == 7) {
                                                            this.f23704o = i14;
                                                            i16 = 16;
                                                            this.f23702i = 16;
                                                        }
                                                    } else if (z3 || ((j6 == Long.MIN_VALUE && i24 == 0) || (j6 == 0 && i24 != 0))) {
                                                        i17 = 2;
                                                        if (i13 != i17) {
                                                        }
                                                        this.f23704o = i14;
                                                        i16 = 16;
                                                        this.f23702i = 16;
                                                    } else {
                                                        if (i24 == 0) {
                                                            j6 = -j6;
                                                        }
                                                        this.f23703j = j6;
                                                        this.f23698d += i14;
                                                        i16 = 15;
                                                        this.f23702i = 15;
                                                    }
                                                }
                                            } else if (i13 == 2) {
                                                i13 = 3;
                                                i14++;
                                            }
                                            if (i16 != 0) {
                                                return i16;
                                            }
                                            if (k(cArr[this.f23698d])) {
                                                D("Expected value");
                                                throw null;
                                            }
                                            c();
                                            this.f23702i = 10;
                                            return 10;
                                        }
                                        if (i13 != 5) {
                                        }
                                        i13 = 6;
                                        i14++;
                                    } else if (i14 != cArr.length) {
                                        if (g(i14 + 1)) {
                                            i15 = this.f23698d;
                                            i12 = this.f23699e;
                                            c11 = cArr[i15 + i14];
                                            if (c11 != '+') {
                                                if (c11 != 'E') {
                                                    if (i13 != 2) {
                                                    }
                                                    i13 = 5;
                                                    i14++;
                                                } else {
                                                    if (i13 != 2) {
                                                    }
                                                    i13 = 5;
                                                    i14++;
                                                }
                                                if (i16 != 0) {
                                                    return i16;
                                                }
                                                if (k(cArr[this.f23698d])) {
                                                    D("Expected value");
                                                    throw null;
                                                }
                                                c();
                                                this.f23702i = 10;
                                                return 10;
                                            }
                                            if (i13 != 5) {
                                            }
                                            i13 = 6;
                                            i14++;
                                        }
                                        i17 = 2;
                                        if (i13 != 2) {
                                            if (i13 != i17) {
                                            }
                                            this.f23704o = i14;
                                            i16 = 16;
                                            this.f23702i = 16;
                                        } else {
                                            if (z3) {
                                            }
                                            i17 = 2;
                                            if (i13 != i17) {
                                            }
                                            this.f23704o = i14;
                                            i16 = 16;
                                            this.f23702i = 16;
                                        }
                                        if (i16 != 0) {
                                            return i16;
                                        }
                                        if (k(cArr[this.f23698d])) {
                                            D("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.f23702i = 10;
                                        return 10;
                                    }
                                    i16 = 0;
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (k(cArr[this.f23698d])) {
                                        D("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.f23702i = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i10 = 6;
                        }
                        length = str.length();
                        i11 = 1;
                        while (true) {
                            if (i11 >= length) {
                                if ((this.f23698d + length < this.f23699e && !g(length + 1)) || !k(cArr[this.f23698d + length])) {
                                    this.f23698d += length;
                                    this.f23702i = i10;
                                    break;
                                }
                                break;
                            }
                            if ((this.f23698d + i11 >= this.f23699e || g(i11 + 1)) && ((c10 = cArr[this.f23698d + i11]) == str.charAt(i11) || c10 == str2.charAt(i11))) {
                            }
                            i10 = i7;
                            break;
                        }
                        if (i10 != 0) {
                            return i10;
                        }
                        int i25 = this.f23698d;
                        i12 = this.f23699e;
                        i13 = i7;
                        i14 = i13;
                        int i26 = i14;
                        i15 = i25;
                        z3 = true;
                        long j11 = 0;
                        while (true) {
                            if (i15 + i14 != i12) {
                                c11 = cArr[i15 + i14];
                                if (c11 != '+') {
                                    if (c11 != 'E') {
                                        if (i13 != 2) {
                                        }
                                        i13 = 5;
                                        i14++;
                                    } else {
                                        if (i13 != 2) {
                                        }
                                        i13 = 5;
                                        i14++;
                                    }
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (k(cArr[this.f23698d])) {
                                        D("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.f23702i = 10;
                                    return 10;
                                }
                                if (i13 != 5) {
                                }
                                i13 = 6;
                                i14++;
                            } else if (i14 != cArr.length) {
                                if (g(i14 + 1)) {
                                    i15 = this.f23698d;
                                    i12 = this.f23699e;
                                    c11 = cArr[i15 + i14];
                                    if (c11 != '+') {
                                        if (c11 != 'E') {
                                            if (i13 != 2) {
                                            }
                                            i13 = 5;
                                            i14++;
                                        } else {
                                            if (i13 != 2) {
                                            }
                                            i13 = 5;
                                            i14++;
                                        }
                                        if (i16 != 0) {
                                            return i16;
                                        }
                                        if (k(cArr[this.f23698d])) {
                                            D("Expected value");
                                            throw null;
                                        }
                                        c();
                                        this.f23702i = 10;
                                        return 10;
                                    }
                                    if (i13 != 5) {
                                    }
                                    i13 = 6;
                                    i14++;
                                }
                                i17 = 2;
                                if (i13 != 2) {
                                    if (i13 != i17) {
                                    }
                                    this.f23704o = i14;
                                    i16 = 16;
                                    this.f23702i = 16;
                                } else {
                                    if (z3) {
                                    }
                                    i17 = 2;
                                    if (i13 != i17) {
                                    }
                                    this.f23704o = i14;
                                    i16 = 16;
                                    this.f23702i = 16;
                                }
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (k(cArr[this.f23698d])) {
                                    D("Expected value");
                                    throw null;
                                }
                                c();
                                this.f23702i = 10;
                                return 10;
                            }
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (k(cArr[this.f23698d])) {
                                D("Expected value");
                                throw null;
                            }
                            c();
                            this.f23702i = 10;
                            return 10;
                        }
                    }
                    if (i19 == 1) {
                        this.f23702i = 4;
                        return 4;
                    }
                }
                if (i19 == 1 && i19 != 2) {
                    D("Unexpected value");
                    throw null;
                }
                c();
                this.f23698d--;
                this.f23702i = 7;
                return 7;
            }
            iArr[i18] = 5;
            int iR5 = r(true);
            if (iR5 != 58) {
                if (iR5 != 61) {
                    D("Expected ':'");
                    throw null;
                }
                c();
                if (this.f23698d < this.f23699e || g(1)) {
                    int i27 = this.f23698d;
                    if (cArr[i27] == '>') {
                        this.f23698d = i27 + 1;
                    }
                }
            }
        }
        i7 = 0;
        iR2 = r(true);
        if (iR2 != 34) {
            this.f23702i = 9;
            return 9;
        }
        if (iR2 != 39) {
            c();
            this.f23702i = 8;
            return 8;
        }
        if (iR2 != 44) {
            if (iR2 != 91) {
                this.f23702i = 3;
                return 3;
            }
            if (iR2 != 93) {
                if (iR2 != 123) {
                    this.f23702i = 1;
                    return 1;
                }
                int i28 = this.f23698d - 1;
                this.f23698d = i28;
                c6 = cArr[i28];
                if (c6 != 't') {
                    str = "true";
                    str2 = "TRUE";
                    i10 = 5;
                    length = str.length();
                    i11 = 1;
                    while (true) {
                        if (i11 >= length) {
                            if (this.f23698d + length < this.f23699e) {
                            }
                            this.f23698d += length;
                            this.f23702i = i10;
                            break;
                        }
                        i11 = this.f23698d + i11 >= this.f23699e ? i11 + 1 : i11 + 1;
                    }
                    if (i10 != 0) {
                        return i10;
                    }
                    int i29 = this.f23698d;
                    i12 = this.f23699e;
                    i13 = i7;
                    i14 = i13;
                    int i210 = i14;
                    i15 = i29;
                    z3 = true;
                    long j12 = 0;
                    while (true) {
                        if (i15 + i14 != i12) {
                            c11 = cArr[i15 + i14];
                            if (c11 != '+') {
                                if (c11 != 'E') {
                                    if (i13 != 2) {
                                    }
                                    i13 = 5;
                                    i14++;
                                } else {
                                    if (i13 != 2) {
                                    }
                                    i13 = 5;
                                    i14++;
                                }
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (k(cArr[this.f23698d])) {
                                    D("Expected value");
                                    throw null;
                                }
                                c();
                                this.f23702i = 10;
                                return 10;
                            }
                            if (i13 != 5) {
                            }
                            i13 = 6;
                            i14++;
                        } else if (i14 != cArr.length) {
                            if (g(i14 + 1)) {
                                i15 = this.f23698d;
                                i12 = this.f23699e;
                                c11 = cArr[i15 + i14];
                                if (c11 != '+') {
                                    if (c11 != 'E') {
                                        if (i13 != 2) {
                                        }
                                        i13 = 5;
                                        i14++;
                                    } else {
                                        if (i13 != 2) {
                                        }
                                        i13 = 5;
                                        i14++;
                                    }
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (k(cArr[this.f23698d])) {
                                        D("Expected value");
                                        throw null;
                                    }
                                    c();
                                    this.f23702i = 10;
                                    return 10;
                                }
                                if (i13 != 5) {
                                }
                                i13 = 6;
                                i14++;
                            }
                            i17 = 2;
                            if (i13 != 2) {
                                if (i13 != i17) {
                                }
                                this.f23704o = i14;
                                i16 = 16;
                                this.f23702i = 16;
                            } else {
                                if (z3) {
                                }
                                i17 = 2;
                                if (i13 != i17) {
                                }
                                this.f23704o = i14;
                                i16 = 16;
                                this.f23702i = 16;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (k(cArr[this.f23698d])) {
                                D("Expected value");
                                throw null;
                            }
                            c();
                            this.f23702i = 10;
                            return 10;
                        }
                        i16 = 0;
                        if (i16 != 0) {
                            return i16;
                        }
                        if (k(cArr[this.f23698d])) {
                            D("Expected value");
                            throw null;
                        }
                        c();
                        this.f23702i = 10;
                        return 10;
                    }
                }
                str = "true";
                str2 = "TRUE";
                i10 = 5;
                length = str.length();
                i11 = 1;
                while (true) {
                    if (i11 >= length) {
                        if (this.f23698d + length < this.f23699e) {
                        }
                        this.f23698d += length;
                        this.f23702i = i10;
                        break;
                    }
                    if (this.f23698d + i11 >= this.f23699e) {
                    }
                }
                if (i10 != 0) {
                    return i10;
                }
                int i211 = this.f23698d;
                i12 = this.f23699e;
                i13 = i7;
                i14 = i13;
                int i212 = i14;
                i15 = i211;
                z3 = true;
                long j13 = 0;
                while (true) {
                    if (i15 + i14 != i12) {
                        c11 = cArr[i15 + i14];
                        if (c11 != '+') {
                            if (c11 != 'E') {
                                if (i13 != 2) {
                                }
                                i13 = 5;
                                i14++;
                            } else {
                                if (i13 != 2) {
                                }
                                i13 = 5;
                                i14++;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (k(cArr[this.f23698d])) {
                                D("Expected value");
                                throw null;
                            }
                            c();
                            this.f23702i = 10;
                            return 10;
                        }
                        if (i13 != 5) {
                        }
                        i13 = 6;
                        i14++;
                    } else if (i14 != cArr.length) {
                        if (g(i14 + 1)) {
                            i15 = this.f23698d;
                            i12 = this.f23699e;
                            c11 = cArr[i15 + i14];
                            if (c11 != '+') {
                                if (c11 != 'E') {
                                    if (i13 != 2) {
                                    }
                                    i13 = 5;
                                    i14++;
                                } else {
                                    if (i13 != 2) {
                                    }
                                    i13 = 5;
                                    i14++;
                                }
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (k(cArr[this.f23698d])) {
                                    D("Expected value");
                                    throw null;
                                }
                                c();
                                this.f23702i = 10;
                                return 10;
                            }
                            if (i13 != 5) {
                            }
                            i13 = 6;
                            i14++;
                        }
                        i17 = 2;
                        if (i13 != 2) {
                            if (i13 != i17) {
                            }
                            this.f23704o = i14;
                            i16 = 16;
                            this.f23702i = 16;
                        } else {
                            if (z3) {
                            }
                            i17 = 2;
                            if (i13 != i17) {
                            }
                            this.f23704o = i14;
                            i16 = 16;
                            this.f23702i = 16;
                        }
                        if (i16 != 0) {
                            return i16;
                        }
                        if (k(cArr[this.f23698d])) {
                            D("Expected value");
                            throw null;
                        }
                        c();
                        this.f23702i = 10;
                        return 10;
                    }
                    i16 = 0;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (k(cArr[this.f23698d])) {
                        D("Expected value");
                        throw null;
                    }
                    c();
                    this.f23702i = 10;
                    return 10;
                }
                i10 = i7;
                if (i10 != 0) {
                    return i10;
                }
                int i213 = this.f23698d;
                i12 = this.f23699e;
                i13 = i7;
                i14 = i13;
                int i214 = i14;
                i15 = i213;
                z3 = true;
                long j14 = 0;
                while (true) {
                    if (i15 + i14 != i12) {
                        c11 = cArr[i15 + i14];
                        if (c11 != '+') {
                            if (c11 != 'E') {
                                if (i13 != 2) {
                                }
                                i13 = 5;
                                i14++;
                            } else {
                                if (i13 != 2) {
                                }
                                i13 = 5;
                                i14++;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (k(cArr[this.f23698d])) {
                                D("Expected value");
                                throw null;
                            }
                            c();
                            this.f23702i = 10;
                            return 10;
                        }
                        if (i13 != 5) {
                        }
                        i13 = 6;
                        i14++;
                    } else if (i14 != cArr.length) {
                        if (g(i14 + 1)) {
                            i15 = this.f23698d;
                            i12 = this.f23699e;
                            c11 = cArr[i15 + i14];
                            if (c11 != '+') {
                                if (c11 != 'E') {
                                    if (i13 != 2) {
                                    }
                                    i13 = 5;
                                    i14++;
                                } else {
                                    if (i13 != 2) {
                                    }
                                    i13 = 5;
                                    i14++;
                                }
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (k(cArr[this.f23698d])) {
                                    D("Expected value");
                                    throw null;
                                }
                                c();
                                this.f23702i = 10;
                                return 10;
                            }
                            if (i13 != 5) {
                            }
                            i13 = 6;
                            i14++;
                        }
                        i17 = 2;
                        if (i13 != 2) {
                            if (i13 != i17) {
                            }
                            this.f23704o = i14;
                            i16 = 16;
                            this.f23702i = 16;
                        } else {
                            if (z3) {
                            }
                            i17 = 2;
                            if (i13 != i17) {
                            }
                            this.f23704o = i14;
                            i16 = 16;
                            this.f23702i = 16;
                        }
                        if (i16 != 0) {
                            return i16;
                        }
                        if (k(cArr[this.f23698d])) {
                            D("Expected value");
                            throw null;
                        }
                        c();
                        this.f23702i = 10;
                        return 10;
                    }
                    i16 = 0;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (k(cArr[this.f23698d])) {
                        D("Expected value");
                        throw null;
                    }
                    c();
                    this.f23702i = 10;
                    return 10;
                }
            }
            if (i19 == 1) {
                this.f23702i = 4;
                return 4;
            }
        }
        if (i19 == 1) {
        }
        c();
        this.f23698d--;
        this.f23702i = 7;
        return 7;
    }

    public void e() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + d0.u(w()) + l());
        }
        int i7 = this.f23706v;
        this.f23706v = i7 - 1;
        int[] iArr = this.f23694A;
        int i10 = i7 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f23702i = 0;
    }

    public void f() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + d0.u(w()) + l());
        }
        int i7 = this.f23706v;
        int i10 = i7 - 1;
        this.f23706v = i10;
        this.f23707w[i10] = null;
        int[] iArr = this.f23694A;
        int i11 = i7 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f23702i = 0;
    }

    public final boolean g(int i7) throws IOException {
        int i10;
        int i11;
        int i12 = this.f23701g;
        int i13 = this.f23698d;
        this.f23701g = i12 - i13;
        int i14 = this.f23699e;
        char[] cArr = this.f23697c;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f23699e = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f23699e = 0;
        }
        this.f23698d = 0;
        do {
            int i16 = this.f23699e;
            int i17 = this.f23695a.read(cArr, i16, cArr.length - i16);
            if (i17 == -1) {
                return false;
            }
            i10 = this.f23699e + i17;
            this.f23699e = i10;
            if (this.f23700f == 0 && (i11 = this.f23701g) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f23698d++;
                this.f23701g = i11 + 1;
                i7++;
            }
        } while (i10 < i7);
        return true;
    }

    public String getPath() {
        return h(false);
    }

    public final String h(boolean z3) {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i10 = this.f23706v;
            if (i7 >= i10) {
                return sb2.toString();
            }
            int i11 = this.t[i7];
            if (i11 == 1 || i11 == 2) {
                int i12 = this.f23694A[i7];
                if (z3 && i12 > 0 && i7 == i10 - 1) {
                    i12--;
                }
                sb2.append('[');
                sb2.append(i12);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = this.f23707w[i7];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i7++;
        }
    }

    public String i() {
        return h(true);
    }

    public boolean j() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4 || iD == 17) ? false : true;
    }

    public final boolean k(char c6) throws d {
        if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
            return false;
        }
        if (c6 != '#') {
            if (c6 == ',') {
                return false;
            }
            if (c6 != '/' && c6 != '=') {
                if (c6 == '{' || c6 == '}' || c6 == ':') {
                    return false;
                }
                if (c6 != ';') {
                    switch (c6) {
                        case '[':
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
        c();
        return false;
    }

    final String l() {
        StringBuilder sbP = q0.p(this.f23700f + 1, " at line ", (this.f23698d - this.f23701g) + 1, " column ", " path ");
        sbP.append(getPath());
        return sbP.toString();
    }

    public boolean m() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.f23702i = 0;
            int[] iArr = this.f23694A;
            int i7 = this.f23706v - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        }
        if (iD != 6) {
            throw new IllegalStateException("Expected a boolean but was " + d0.u(w()) + l());
        }
        this.f23702i = 0;
        int[] iArr2 = this.f23694A;
        int i10 = this.f23706v - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public double n() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.f23702i = 0;
            int[] iArr = this.f23694A;
            int i7 = this.f23706v - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f23703j;
        }
        if (iD == 16) {
            this.f23705p = new String(this.f23697c, this.f23698d, this.f23704o);
            this.f23698d += this.f23704o;
        } else if (iD == 8 || iD == 9) {
            this.f23705p = t(iD == 8 ? '\'' : '\"');
        } else if (iD == 10) {
            this.f23705p = v();
        } else if (iD != 11) {
            throw new IllegalStateException("Expected a double but was " + d0.u(w()) + l());
        }
        this.f23702i = 11;
        double d2 = Double.parseDouble(this.f23705p);
        if (!this.f23696b && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new d("JSON forbids NaN and infinities: " + d2 + l());
        }
        this.f23705p = null;
        this.f23702i = 0;
        int[] iArr2 = this.f23694A;
        int i10 = this.f23706v - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return d2;
    }

    public int o() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            long j6 = this.f23703j;
            int i7 = (int) j6;
            if (j6 != i7) {
                throw new NumberFormatException("Expected an int but was " + this.f23703j + l());
            }
            this.f23702i = 0;
            int[] iArr = this.f23694A;
            int i10 = this.f23706v - 1;
            iArr[i10] = iArr[i10] + 1;
            return i7;
        }
        if (iD == 16) {
            this.f23705p = new String(this.f23697c, this.f23698d, this.f23704o);
            this.f23698d += this.f23704o;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw new IllegalStateException("Expected an int but was " + d0.u(w()) + l());
            }
            if (iD == 10) {
                this.f23705p = v();
            } else {
                this.f23705p = t(iD == 8 ? '\'' : '\"');
            }
            try {
                int i11 = Integer.parseInt(this.f23705p);
                this.f23702i = 0;
                int[] iArr2 = this.f23694A;
                int i12 = this.f23706v - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23702i = 11;
        double d2 = Double.parseDouble(this.f23705p);
        int i13 = (int) d2;
        if (i13 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.f23705p + l());
        }
        this.f23705p = null;
        this.f23702i = 0;
        int[] iArr3 = this.f23694A;
        int i14 = this.f23706v - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public long p() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.f23702i = 0;
            int[] iArr = this.f23694A;
            int i7 = this.f23706v - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f23703j;
        }
        if (iD == 16) {
            this.f23705p = new String(this.f23697c, this.f23698d, this.f23704o);
            this.f23698d += this.f23704o;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw new IllegalStateException("Expected a long but was " + d0.u(w()) + l());
            }
            if (iD == 10) {
                this.f23705p = v();
            } else {
                this.f23705p = t(iD == 8 ? '\'' : '\"');
            }
            try {
                long j6 = Long.parseLong(this.f23705p);
                this.f23702i = 0;
                int[] iArr2 = this.f23694A;
                int i10 = this.f23706v - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return j6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23702i = 11;
        double d2 = Double.parseDouble(this.f23705p);
        long j10 = (long) d2;
        if (j10 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.f23705p + l());
        }
        this.f23705p = null;
        this.f23702i = 0;
        int[] iArr3 = this.f23694A;
        int i11 = this.f23706v - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j10;
    }

    public String q() throws IOException {
        String strT;
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strT = v();
        } else if (iD == 12) {
            strT = t('\'');
        } else {
            if (iD != 13) {
                throw new IllegalStateException("Expected a name but was " + d0.u(w()) + l());
            }
            strT = t('\"');
        }
        this.f23702i = 0;
        this.f23707w[this.f23706v - 1] = strT;
        return strT;
    }

    public final int r(boolean z3) throws IOException {
        int i7 = this.f23698d;
        int i10 = this.f23699e;
        while (true) {
            if (i7 == i10) {
                this.f23698d = i7;
                if (!g(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input" + l());
                }
                i7 = this.f23698d;
                i10 = this.f23699e;
            }
            int i11 = i7 + 1;
            char[] cArr = this.f23697c;
            char c6 = cArr[i7];
            if (c6 == '\n') {
                this.f23700f++;
                this.f23701g = i11;
            } else if (c6 != ' ' && c6 != '\r' && c6 != '\t') {
                if (c6 == '/') {
                    this.f23698d = i11;
                    if (i11 == i10) {
                        this.f23698d = i7;
                        boolean zG = g(2);
                        this.f23698d++;
                        if (!zG) {
                        }
                        return c6;
                    }
                    c();
                    int i12 = this.f23698d;
                    char c10 = cArr[i12];
                    if (c10 == '*') {
                        this.f23698d = i12 + 1;
                        while (true) {
                            if (this.f23698d + 2 > this.f23699e && !g(2)) {
                                D("Unterminated comment");
                                throw null;
                            }
                            int i13 = this.f23698d;
                            if (cArr[i13] != '\n') {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= 2) {
                                        i7 = this.f23698d + 2;
                                        i10 = this.f23699e;
                                        break;
                                    }
                                    if (cArr[this.f23698d + i14] != "*/".charAt(i14)) {
                                        break;
                                    }
                                    i14++;
                                }
                            } else {
                                this.f23700f++;
                                this.f23701g = i13 + 1;
                            }
                            this.f23698d++;
                        }
                    } else {
                        if (c10 != '/') {
                            return c6;
                        }
                        this.f23698d = i12 + 1;
                        A();
                        i7 = this.f23698d;
                        i10 = this.f23699e;
                    }
                } else {
                    if (c6 != '#') {
                        this.f23698d = i11;
                        return c6;
                    }
                    this.f23698d = i11;
                    c();
                    A();
                    i7 = this.f23698d;
                    i10 = this.f23699e;
                }
            }
            i7 = i11;
        }
    }

    public void s() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 7) {
            throw new IllegalStateException("Expected null but was " + d0.u(w()) + l());
        }
        this.f23702i = 0;
        int[] iArr = this.f23694A;
        int i7 = this.f23706v - 1;
        iArr[i7] = iArr[i7] + 1;
    }

    public final String t(char c6) throws d {
        int i7;
        char[] cArr;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f23698d;
            int i11 = this.f23699e;
            while (true) {
                int i12 = i11;
                i7 = i10;
                while (true) {
                    cArr = this.f23697c;
                    if (i10 < i12) {
                        int i13 = i10 + 1;
                        char c10 = cArr[i10];
                        if (c10 == c6) {
                            this.f23698d = i13;
                            int i14 = (i13 - i7) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i7, i14);
                            }
                            sb2.append(cArr, i7, i14);
                            return sb2.toString();
                        }
                        if (c10 == '\\') {
                            this.f23698d = i13;
                            int i15 = i13 - i7;
                            int i16 = i15 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i15 * 2, 16));
                            }
                            sb2.append(cArr, i7, i16);
                            sb2.append(y());
                            i10 = this.f23698d;
                            i11 = this.f23699e;
                        } else {
                            if (c10 == '\n') {
                                this.f23700f++;
                                this.f23701g = i13;
                            }
                            i10 = i13;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i10 - i7) * 2, 16));
            }
            sb2.append(cArr, i7, i10 - i7);
            this.f23698d = i10;
        } while (g(1));
        D("Unterminated string");
        throw null;
    }

    public String toString() {
        return getClass().getSimpleName() + l();
    }

    public String u() throws IOException {
        String str;
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = v();
        } else if (iD == 8) {
            str = t('\'');
        } else if (iD == 9) {
            str = t('\"');
        } else if (iD == 11) {
            str = this.f23705p;
            this.f23705p = null;
        } else if (iD == 15) {
            str = Long.toString(this.f23703j);
        } else {
            if (iD != 16) {
                throw new IllegalStateException("Expected a string but was " + d0.u(w()) + l());
            }
            str = new String(this.f23697c, this.f23698d, this.f23704o);
            this.f23698d += this.f23704o;
        }
        this.f23702i = 0;
        int[] iArr = this.f23694A;
        int i7 = this.f23706v - 1;
        iArr[i7] = iArr[i7] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String v() throws d {
        String string;
        StringBuilder sb2 = null;
        int i7 = 0;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = this.f23698d;
                int i12 = i11 + i10;
                int i13 = this.f23699e;
                char[] cArr = this.f23697c;
                if (i12 < i13) {
                    char c6 = cArr[i11 + i10];
                    if (c6 != '\t' && c6 != '\n' && c6 != '\f' && c6 != '\r' && c6 != ' ') {
                        if (c6 != '#') {
                            if (c6 != ',') {
                                if (c6 != '/' && c6 != '=') {
                                    if (c6 != '{' && c6 != '}' && c6 != ':') {
                                        if (c6 != ';') {
                                            switch (c6) {
                                                case '[':
                                                case HomeDialogState.PRIORITY_OK_CARD_DIALOG /* 93 */:
                                                    break;
                                                case HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG /* 92 */:
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c();
                    }
                    i7 = i10;
                } else if (i10 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i10, 16));
                    }
                    sb2.append(cArr, this.f23698d, i10);
                    this.f23698d += i10;
                    if (!g(1)) {
                    }
                } else if (!g(i10 + 1)) {
                    i7 = i10;
                }
                if (sb2 == null) {
                    string = new String(cArr, this.f23698d, i7);
                } else {
                    sb2.append(cArr, this.f23698d, i7);
                    string = sb2.toString();
                }
                this.f23698d += i7;
                return string;
            }
        }
    }

    public int w() throws IOException {
        int iD = this.f23702i;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
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
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void x(int i7) {
        int i10 = this.f23706v;
        int[] iArr = this.t;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.t = Arrays.copyOf(iArr, i11);
            this.f23694A = Arrays.copyOf(this.f23694A, i11);
            this.f23707w = (String[]) Arrays.copyOf(this.f23707w, i11);
        }
        int[] iArr2 = this.t;
        int i12 = this.f23706v;
        this.f23706v = i12 + 1;
        iArr2[i12] = i7;
    }

    public final char y() throws d {
        int i7;
        if (this.f23698d == this.f23699e && !g(1)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f23698d;
        int i11 = i10 + 1;
        this.f23698d = i11;
        char[] cArr = this.f23697c;
        char c6 = cArr[i10];
        if (c6 == '\n') {
            this.f23700f++;
            this.f23701g = i11;
            return c6;
        }
        if (c6 == '\"' || c6 == '\'' || c6 == '/' || c6 == '\\') {
            return c6;
        }
        if (c6 == 'b') {
            return '\b';
        }
        if (c6 == 'f') {
            return '\f';
        }
        if (c6 == 'n') {
            return '\n';
        }
        if (c6 == 'r') {
            return '\r';
        }
        if (c6 == 't') {
            return '\t';
        }
        if (c6 != 'u') {
            D("Invalid escape sequence");
            throw null;
        }
        if (i10 + 5 > this.f23699e && !g(4)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i12 = this.f23698d;
        int i13 = i12 + 4;
        char c10 = 0;
        while (i12 < i13) {
            char c11 = cArr[i12];
            char c12 = (char) (c10 << 4);
            if (c11 >= '0' && c11 <= '9') {
                i7 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i7 = c11 - 'W';
            } else {
                if (c11 < 'A' || c11 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f23698d, 4)));
                }
                i7 = c11 - '7';
            }
            c10 = (char) (i7 + c12);
            i12++;
        }
        this.f23698d += 4;
        return c10;
    }

    public final void z(char c6) throws d {
        do {
            int i7 = this.f23698d;
            int i10 = this.f23699e;
            while (i7 < i10) {
                int i11 = i7 + 1;
                char c10 = this.f23697c[i7];
                if (c10 == c6) {
                    this.f23698d = i11;
                    return;
                }
                if (c10 == '\\') {
                    this.f23698d = i11;
                    y();
                    i7 = this.f23698d;
                    i10 = this.f23699e;
                } else {
                    if (c10 == '\n') {
                        this.f23700f++;
                        this.f23701g = i11;
                    }
                    i7 = i11;
                }
            }
            this.f23698d = i7;
        } while (g(1));
        D("Unterminated string");
        throw null;
    }
}
