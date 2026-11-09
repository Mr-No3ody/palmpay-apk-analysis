package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class I {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f41836y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f41837z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f41838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f41839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f41840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Annotation[] f41841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Annotation[][] f41842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Type[] f41843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f41849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f41852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f41856s;
    public okhttp3.F t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public okhttp3.L f41857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinkedHashSet f41858v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public U[] f41859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f41860x;

    public I(N n10, Class cls, Method method) {
        this.f41838a = n10;
        this.f41839b = cls;
        this.f41840c = method;
        this.f41841d = method.getAnnotations();
        this.f41843f = method.getGenericParameterTypes();
        this.f41842e = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z3) {
        String str3 = this.f41852o;
        Method method = this.f41840c;
        if (str3 != null) {
            throw U.n(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f41852o = str;
        this.f41853p = z3;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f41836y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw U.n(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f41856s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f41858v = linkedHashSet;
    }

    public final void c(int i7, Type type) {
        if (U.j(type)) {
            throw U.o(this.f41840c, i7, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
