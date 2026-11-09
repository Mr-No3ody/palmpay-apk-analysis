package Dg;

import C0.G;
import M.q;
import Pg.k;
import Pg.l;
import Pg.m;
import Pg.t;
import Pg.u;
import Pg.x;
import com.airbnb.lottie.model.layer.d;
import com.google.common.net.HttpHeaders;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.F;
import okhttp3.J;
import okhttp3.L;
import okhttp3.U;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.h0;
import okhttp3.internal.http2.C1934e;
import okio.BufferedSource;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f1879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f1880b = F.f40566b.of(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f1881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f1882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeZone f1883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Regex f1884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1885g;

    static {
        byte[] bArr = new byte[0];
        f1879a = bArr;
        f1881c = g0.create$default(h0.Companion, bArr, (L) null, 1, (Object) null);
        b0.create$default(c0.Companion, bArr, (L) null, 0, 0, 7, (Object) null);
        t tVar = u.f7376d;
        l lVar = m.f7359d;
        f1882d = tVar.of(lVar.decodeHex("efbbbf"), lVar.decodeHex("feff"), lVar.decodeHex("fffe"), lVar.decodeHex("0000ffff"), lVar.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.e(timeZone);
        f1883e = timeZone;
        f1884f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = U.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f1885g = StringsKt.J(StringsKt.I(name, "okhttp3."));
    }

    public static final String A(int i7, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iN = n(i7, i10, str);
        String strSubstring = str.substring(iN, o(iN, i10, str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final boolean a(J j6, J other) {
        Intrinsics.checkNotNullParameter(j6, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.c(j6.f40582d, other.f40582d) && j6.f40583e == other.f40583e && Intrinsics.c(j6.f40579a, other.f40579a);
    }

    public static final int b(String name, long j6, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j6 < 0) {
            throw new IllegalStateException(name.concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j6);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(name.concat(" too large.").toString());
        }
        if (millis != 0 || j6 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(name.concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.c(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i7, String str, int i10, String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i7 < i10) {
            if (StringsKt.B(delimiters, str.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    public static final int f(String str, char c6, int i7, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i7 < i10) {
            if (str.charAt(i7) == c6) {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    public static /* synthetic */ int g(String str, char c6, int i7, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return f(str, c6, i7, i10);
    }

    public static final boolean h(Source source) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return v(source, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return d.o(objArrCopyOf, objArrCopyOf.length, locale, format, "format(locale, format, *args)");
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                q qVarA = AbstractC1859i.a(strArr2);
                while (qVarA.hasNext()) {
                    if (comparator.compare(str, (String) qVarA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        String strA = e0Var.f40733f.a(HttpHeaders.CONTENT_LENGTH);
        if (strA != null) {
            Intrinsics.checkNotNullParameter(strA, "<this>");
            try {
                return Long.parseLong(strA);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final List l(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(C1850q.h(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int m(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Intrinsics.h(cCharAt, 31) <= 0 || Intrinsics.h(cCharAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int n(int i7, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i7 < i10) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    public static final int o(int i7, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = i10 - 1;
        if (i7 <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 != i7) {
                    i11--;
                }
            }
        }
        return i7;
    }

    public static final String[] p(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return y.h(name, HttpHeaders.AUTHORIZATION, true) || y.h(name, "Cookie", true) || y.h(name, HttpHeaders.PROXY_AUTHORIZATION, true) || y.h(name, HttpHeaders.SET_COOKIE, true);
    }

    public static final int r(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' > c6 || c6 >= 'G') {
            return -1;
        }
        return c6 - '7';
    }

    public static final Charset s(BufferedSource bufferedSource, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = bufferedSource.select(f1882d);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            Charsets.f38994a.getClass();
            Charset charset2 = Charsets.f38996c;
            if (charset2 != null) {
                return charset2;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            Charsets.f38996c = charsetForName;
            return charsetForName;
        }
        if (iSelect != 4) {
            throw new AssertionError();
        }
        Charsets.f38994a.getClass();
        Charset charset3 = Charsets.f38995b;
        if (charset3 != null) {
            return charset3;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        Charsets.f38995b = charsetForName2;
        return charsetForName2;
    }

    public static final Object t(Class fieldType, String fieldName, Object instance) throws IllegalAccessException {
        Object objT;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            Object objCast = null;
            if (Intrinsics.c(superclass, Object.class)) {
                if (fieldName.equals("delegate") || (objT = t(Object.class, "delegate", instance)) == null) {
                    return null;
                }
                return t(fieldType, fieldName, objT);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (fieldType.isInstance(obj)) {
                    objCast = fieldType.cast(obj);
                }
                return objCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                Intrinsics.checkNotNullExpressionValue(superclass, "c.superclass");
            }
        }
    }

    public static final int u(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return (xVar.readByte() & UnsignedBytes.MAX_VALUE) | ((xVar.readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((xVar.readByte() & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static final boolean v(Source source, int i7) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i7)) + jNanoTime);
        try {
            k kVar = new k();
            while (source.read(kVar, 8192L) != -1) {
                kVar.a();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return true;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return false;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final F w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1934e c1934e = (C1934e) it.next();
            String name = c1934e.f40818a.l();
            String value = c1934e.f40819b.l();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            arrayList.add(StringsKt.V(value).toString());
        }
        return new F((String[]) arrayList.toArray(new String[0]));
    }

    public static final String x(J j6, boolean z3) {
        Intrinsics.checkNotNullParameter(j6, "<this>");
        boolean zA = StringsKt.A(j6.f40582d, ":", false);
        String strL = j6.f40582d;
        if (zA) {
            strL = G.l(']', "[", strL);
        }
        int i7 = j6.f40583e;
        if (!z3 && i7 == J.f40577k.defaultPort(j6.f40579a)) {
            return strL;
        }
        return strL + ':' + i7;
    }

    public static final List y(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.Z(list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int z(int i7, String str) {
        if (str == null) {
            return i7;
        }
        try {
            long j6 = Long.parseLong(str);
            if (j6 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j6 < 0) {
                return 0;
            }
            return (int) j6;
        } catch (NumberFormatException unused) {
            return i7;
        }
    }
}
