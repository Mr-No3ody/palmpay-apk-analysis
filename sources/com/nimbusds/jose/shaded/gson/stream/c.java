package com.nimbusds.jose.shaded.gson.stream;

import com.google.maps.android.BuildConfig;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f23708i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f23709j = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f23710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f23711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23716g;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f23709j[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f23709j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f23711b = iArr;
        this.f23712c = 0;
        if (iArr.length == 0) {
            this.f23711b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f23711b;
        int i7 = this.f23712c;
        this.f23712c = i7 + 1;
        iArr2[i7] = 6;
        this.f23713d = ":";
        this.f23716g = true;
        Objects.requireNonNull(writer, "out == null");
        this.f23710a = writer;
    }

    public final void a() throws IOException {
        int iJ = j();
        if (iJ == 1) {
            this.f23711b[this.f23712c - 1] = 2;
            h();
            return;
        }
        Writer writer = this.f23710a;
        if (iJ == 2) {
            writer.append(',');
            h();
        } else {
            if (iJ == 4) {
                writer.append((CharSequence) this.f23713d);
                this.f23711b[this.f23712c - 1] = 5;
                return;
            }
            if (iJ != 6) {
                if (iJ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f23714e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f23711b[this.f23712c - 1] = 7;
        }
    }

    public void b() throws IOException {
        r();
        a();
        int i7 = this.f23712c;
        int[] iArr = this.f23711b;
        if (i7 == iArr.length) {
            this.f23711b = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f23711b;
        int i10 = this.f23712c;
        this.f23712c = i10 + 1;
        iArr2[i10] = 1;
        this.f23710a.write(91);
    }

    public void c() throws IOException {
        r();
        a();
        int i7 = this.f23712c;
        int[] iArr = this.f23711b;
        if (i7 == iArr.length) {
            this.f23711b = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = this.f23711b;
        int i10 = this.f23712c;
        this.f23712c = i10 + 1;
        iArr2[i10] = 3;
        this.f23710a.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23710a.close();
        int i7 = this.f23712c;
        if (i7 > 1 || (i7 == 1 && this.f23711b[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f23712c = 0;
    }

    public final void d(int i7, int i10, char c6) throws IOException {
        int iJ = j();
        if (iJ != i10 && iJ != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f23715f != null) {
            throw new IllegalStateException("Dangling name: " + this.f23715f);
        }
        this.f23712c--;
        if (iJ == i10) {
            h();
        }
        this.f23710a.write(c6);
    }

    public void e() throws IOException {
        d(1, 2, ']');
    }

    public void f() throws IOException {
        d(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.f23712c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f23710a.flush();
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f23715f != null) {
            throw new IllegalStateException();
        }
        if (this.f23712c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f23715f = str;
    }

    public final void h() {
    }

    public c i() throws IOException {
        if (this.f23715f != null) {
            if (!this.f23716g) {
                this.f23715f = null;
                return this;
            }
            r();
        }
        a();
        this.f23710a.write(BuildConfig.TRAVIS);
        return this;
    }

    public final int j() {
        int i7 = this.f23712c;
        if (i7 != 0) {
            return this.f23711b[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void k(String str) throws IOException {
        String str2;
        Writer writer = this.f23710a;
        writer.write(34);
        int length = str.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                str2 = f23709j[cCharAt];
                if (str2 != null) {
                    if (i7 < i10) {
                        writer.write(str, i7, i10 - i7);
                    }
                    writer.write(str2);
                    i7 = i10 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i7 < i10) {
                    writer.write(str, i7, i10 - i7);
                }
                writer.write(str2);
                i7 = i10 + 1;
            }
        }
        if (i7 < length) {
            writer.write(str, i7, length - i7);
        }
        writer.write(34);
    }

    public void l(double d2) throws IOException {
        r();
        if (this.f23714e || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            a();
            this.f23710a.append((CharSequence) Double.toString(d2));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
    }

    public void m(long j6) throws IOException {
        r();
        a();
        this.f23710a.write(Long.toString(j6));
    }

    public void n(Boolean bool) throws IOException {
        if (bool == null) {
            i();
            return;
        }
        r();
        a();
        this.f23710a.write(bool.booleanValue() ? "true" : "false");
    }

    public void o(Number number) throws IOException {
        if (number == null) {
            i();
            return;
        }
        r();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f23708i.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f23714e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        a();
        this.f23710a.append((CharSequence) string);
    }

    public void p(String str) throws IOException {
        if (str == null) {
            i();
            return;
        }
        r();
        a();
        k(str);
    }

    public void q(boolean z3) throws IOException {
        r();
        a();
        this.f23710a.write(z3 ? "true" : "false");
    }

    public final void r() throws IOException {
        if (this.f23715f != null) {
            int iJ = j();
            if (iJ == 5) {
                this.f23710a.write(44);
            } else if (iJ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f23711b[this.f23712c - 1] = 4;
            k(this.f23715f);
            this.f23715f = null;
        }
    }
}
