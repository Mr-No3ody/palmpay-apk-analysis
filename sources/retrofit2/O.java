package retrofit2;

import N8.q0;
import com.google.common.net.HttpHeaders;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.coroutines.Continuation;
import okhttp3.e0;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes4.dex */
public abstract class O {
    /* JADX WARN: Code duplicated, block: B:391:0x096d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:392:0x096f  */
    /* JADX WARN: Code duplicated, block: B:580:0x098b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r2v153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v159 */
    /* JADX WARN: Type inference failed for: r2v167, types: [int] */
    /* JADX WARN: Type inference failed for: r2v169 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r6v0, types: [retrofit2.I] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static AbstractC1997o a(N n10, Class cls, Method method) {
        Method method2;
        Type genericReturnType;
        boolean z3;
        boolean z8;
        boolean zM;
        Type typeG;
        boolean z10;
        U u6;
        int i7;
        int i10;
        int i11;
        U[] uArr;
        String str;
        char c6;
        Type type;
        int i12;
        Method method3;
        U e10;
        v vVar;
        U vVar2;
        y yVar;
        Annotation[] annotationArr;
        Type type2;
        int i13;
        ?? r3;
        ?? r10;
        int i14 = -1;
        int i15 = 0;
        ?? r11 = 1;
        ?? i16 = new I(n10, cls, method);
        Annotation[] annotationArr2 = i16.f41841d;
        int length = annotationArr2.length;
        int i17 = 0;
        while (true) {
            Method method4 = i16.f41840c;
            String str2 = "HEAD";
            if (i17 >= length) {
                if (i16.f41852o == null) {
                    throw U.n(method4, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!i16.f41853p) {
                    if (i16.f41855r) {
                        throw U.n(method4, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (i16.f41854q) {
                        throw U.n(method4, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                U u10 = null;
                Annotation[][] annotationArr3 = i16.f41842e;
                int length2 = annotationArr3.length;
                i16.f41859w = new U[length2];
                int i18 = length2 - 1;
                int i19 = 0;
                while (i19 < length2) {
                    U[] uArr2 = i16.f41859w;
                    Type type3 = i16.f41843f[i19];
                    Annotation[] annotationArr4 = annotationArr3[i19];
                    int i20 = i19 == i18 ? 1 : i15;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        u6 = u10;
                        int i21 = i15;
                        while (i21 < length3) {
                            Annotation annotation = annotationArr4[i21];
                            int i22 = i21;
                            Annotation[][] annotationArr5 = annotationArr3;
                            if (annotation instanceof Url) {
                                i16.c(i19, type3);
                                if (i16.f41851n) {
                                    throw U.o(method4, i19, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (i16.f41847j) {
                                    throw U.o(method4, i19, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (i16.f41848k) {
                                    throw U.o(method4, i19, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (i16.f41849l) {
                                    throw U.o(method4, i19, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (i16.f41850m) {
                                    throw U.o(method4, i19, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (i16.f41856s != null) {
                                    throw U.o(method4, i19, "@Url cannot be used with @%s URL", i16.f41852o);
                                }
                                i16.f41851n = true;
                                if (type3 != okhttp3.J.class && type3 != String.class && type3 != URI.class && (!(type3 instanceof Class) || !"android.net.Uri".equals(((Class) type3).getName()))) {
                                    throw U.o(method4, i19, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                e10 = new z(method4, i19, 1);
                                i7 = length2;
                                i11 = i18;
                                uArr = uArr2;
                                str = str2;
                                i10 = length3;
                            } else {
                                i7 = length2;
                                boolean z11 = annotation instanceof Path;
                                N n11 = i16.f41838a;
                                if (z11) {
                                    i16.c(i19, type3);
                                    if (i16.f41848k) {
                                        throw U.o(method4, i19, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (i16.f41849l) {
                                        throw U.o(method4, i19, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (i16.f41850m) {
                                        throw U.o(method4, i19, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (i16.f41851n) {
                                        throw U.o(method4, i19, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (i16.f41856s == null) {
                                        throw U.o(method4, i19, "@Path can only be used with relative url on @%s", i16.f41852o);
                                    }
                                    i16.f41847j = true;
                                    Path path = (Path) annotation;
                                    String strValue = path.value();
                                    if (!I.f41837z.matcher(strValue).matches()) {
                                        throw U.o(method4, i19, "@Path parameter name must match %s. Found: %s", I.f41836y.pattern(), strValue);
                                    }
                                    if (!i16.f41858v.contains(strValue)) {
                                        throw U.o(method4, i19, "URL \"%s\" does not contain \"{%s}\".", i16.f41856s, strValue);
                                    }
                                    Annotation[] annotationArr6 = annotationArr4;
                                    Converter converterE = n11.e(type3, annotationArr6);
                                    String str3 = str2;
                                    i10 = length3;
                                    B b7 = new B(method4, i19, strValue, converterE, path.encoded());
                                    type = type3;
                                    annotationArr4 = annotationArr6;
                                    str = str3;
                                    i11 = i18;
                                    uArr = uArr2;
                                    e10 = b7;
                                    i12 = i19;
                                    method3 = method4;
                                } else {
                                    i10 = length3;
                                    i11 = i18;
                                    uArr = uArr2;
                                    if (annotation instanceof Query) {
                                        i16.c(i19, type3);
                                        Query query = (Query) annotation;
                                        String strValue2 = query.value();
                                        boolean zEncoded = query.encoded();
                                        Class clsH = U.h(type3);
                                        str = str2;
                                        i16.f41848k = true;
                                        if (Iterable.class.isAssignableFrom(clsH)) {
                                            if (!(type3 instanceof ParameterizedType)) {
                                                throw U.o(method4, i19, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            e10 = new v(new x(strValue2, n11.e(U.g(0, (ParameterizedType) type3), annotationArr4), zEncoded, 2), 0);
                                        } else if (clsH.isArray()) {
                                            c6 = 2;
                                            e10 = new v(new x(strValue2, n11.e(I.a(clsH.getComponentType()), annotationArr4), zEncoded, 2), 1);
                                        } else {
                                            c6 = 2;
                                            e10 = new x(strValue2, n11.e(type3, annotationArr4), zEncoded, 2);
                                        }
                                    } else {
                                        str = str2;
                                        c6 = 2;
                                        if (annotation instanceof QueryName) {
                                            i16.c(i19, type3);
                                            boolean zEncoded2 = ((QueryName) annotation).encoded();
                                            Class clsH2 = U.h(type3);
                                            i16.f41849l = true;
                                            if (!Iterable.class.isAssignableFrom(clsH2)) {
                                                e10 = clsH2.isArray() ? new v(new C(n11.e(I.a(clsH2.getComponentType()), annotationArr4), zEncoded2), 1) : new C(n11.e(type3, annotationArr4), zEncoded2);
                                            } else {
                                                if (!(type3 instanceof ParameterizedType)) {
                                                    throw U.o(method4, i19, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                e10 = new v(new C(n11.e(U.g(0, (ParameterizedType) type3), annotationArr4), zEncoded2), 0);
                                            }
                                        } else {
                                            Method method5 = method4;
                                            if (annotation instanceof QueryMap) {
                                                i16.c(i19, type3);
                                                Class clsH3 = U.h(type3);
                                                i16.f41850m = true;
                                                if (!Map.class.isAssignableFrom(clsH3)) {
                                                    throw U.o(method5, i19, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeI = U.i(type3, clsH3);
                                                if (!(typeI instanceof ParameterizedType)) {
                                                    throw U.o(method5, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                                                Type typeG2 = U.g(0, parameterizedType);
                                                if (String.class != typeG2) {
                                                    throw U.o(method5, i19, "@QueryMap keys must be of type String: " + typeG2, new Object[0]);
                                                }
                                                Converter converterE2 = n11.e(U.g(1, parameterizedType), annotationArr4);
                                                boolean zEncoded3 = ((QueryMap) annotation).encoded();
                                                annotationArr = annotationArr4;
                                                method4 = method5;
                                                type2 = type3;
                                                yVar = new y(method4, i19, converterE2, zEncoded3, 2);
                                            } else {
                                                Annotation[] annotationArr7 = annotationArr4;
                                                type = type3;
                                                i12 = i19;
                                                method3 = method5;
                                                if (annotation instanceof Header) {
                                                    i16.c(i12, type);
                                                    Header header = (Header) annotation;
                                                    String strValue3 = header.value();
                                                    Class clsH4 = U.h(type);
                                                    if (!Iterable.class.isAssignableFrom(clsH4)) {
                                                        if (clsH4.isArray()) {
                                                            vVar2 = new v(new x(strValue3, n11.e(I.a(clsH4.getComponentType()), annotationArr7), header.allowUnsafeNonAsciiValues(), 1), 1);
                                                        } else {
                                                            e10 = new x(strValue3, n11.e(type, annotationArr7), header.allowUnsafeNonAsciiValues(), 1);
                                                        }
                                                        annotationArr4 = annotationArr7;
                                                    } else {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw U.o(method3, i12, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        vVar2 = new v(new x(strValue3, n11.e(U.g(0, (ParameterizedType) type), annotationArr7), header.allowUnsafeNonAsciiValues(), 1), 0);
                                                    }
                                                    e10 = vVar2;
                                                    annotationArr4 = annotationArr7;
                                                } else {
                                                    if (annotation instanceof HeaderMap) {
                                                        if (type == okhttp3.F.class) {
                                                            vVar2 = new z(method3, i12, 0);
                                                        } else {
                                                            i16.c(i12, type);
                                                            Class clsH5 = U.h(type);
                                                            if (!Map.class.isAssignableFrom(clsH5)) {
                                                                throw U.o(method3, i12, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                            }
                                                            Type typeI2 = U.i(type, clsH5);
                                                            if (!(typeI2 instanceof ParameterizedType)) {
                                                                throw U.o(method3, i12, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                            ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                                                            Type typeG3 = U.g(0, parameterizedType2);
                                                            if (String.class != typeG3) {
                                                                throw U.o(method3, i12, "@HeaderMap keys must be of type String: " + typeG3, new Object[0]);
                                                            }
                                                            Converter converterE3 = n11.e(U.g(1, parameterizedType2), annotationArr7);
                                                            boolean zAllowUnsafeNonAsciiValues = ((HeaderMap) annotation).allowUnsafeNonAsciiValues();
                                                            annotationArr = annotationArr7;
                                                            method4 = method3;
                                                            i19 = i12;
                                                            type2 = type;
                                                            yVar = new y(method4, i19, converterE3, zAllowUnsafeNonAsciiValues, 1);
                                                        }
                                                    } else if (annotation instanceof Field) {
                                                        i16.c(i12, type);
                                                        if (!i16.f41854q) {
                                                            throw U.o(method3, i12, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                        }
                                                        Field field = (Field) annotation;
                                                        String strValue4 = field.value();
                                                        boolean zEncoded4 = field.encoded();
                                                        i16.f41844g = true;
                                                        Class clsH6 = U.h(type);
                                                        if (!Iterable.class.isAssignableFrom(clsH6)) {
                                                            if (clsH6.isArray()) {
                                                                vVar2 = new v(new x(strValue4, n11.e(I.a(clsH6.getComponentType()), annotationArr7), zEncoded4, 0), 1);
                                                            } else {
                                                                e10 = new x(strValue4, n11.e(type, annotationArr7), zEncoded4, 0);
                                                            }
                                                            annotationArr4 = annotationArr7;
                                                        } else {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw U.o(method3, i12, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            vVar2 = new v(new x(strValue4, n11.e(U.g(0, (ParameterizedType) type), annotationArr7), zEncoded4, 0), 0);
                                                        }
                                                    } else if (annotation instanceof FieldMap) {
                                                        i16.c(i12, type);
                                                        if (!i16.f41854q) {
                                                            throw U.o(method3, i12, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                        }
                                                        Class clsH7 = U.h(type);
                                                        if (!Map.class.isAssignableFrom(clsH7)) {
                                                            throw U.o(method3, i12, "@FieldMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type typeI3 = U.i(type, clsH7);
                                                        if (!(typeI3 instanceof ParameterizedType)) {
                                                            throw U.o(method3, i12, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                                                        Type typeG4 = U.g(0, parameterizedType3);
                                                        if (String.class != typeG4) {
                                                            throw U.o(method3, i12, "@FieldMap keys must be of type String: " + typeG4, new Object[0]);
                                                        }
                                                        Converter converterE4 = n11.e(U.g(1, parameterizedType3), annotationArr7);
                                                        i16.f41844g = true;
                                                        annotationArr4 = annotationArr7;
                                                        e10 = new y(method3, i12, converterE4, ((FieldMap) annotation).encoded(), 0);
                                                    } else {
                                                        annotationArr4 = annotationArr7;
                                                        if (annotation instanceof Part) {
                                                            i16.c(i12, type);
                                                            if (!i16.f41855r) {
                                                                throw U.o(method3, i12, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                            }
                                                            Part part = (Part) annotation;
                                                            i16.f41845h = true;
                                                            String strValue5 = part.value();
                                                            Class clsH8 = U.h(type);
                                                            if (strValue5.isEmpty()) {
                                                                boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsH8);
                                                                D d2 = D.f41817d;
                                                                if (zIsAssignableFrom) {
                                                                    if (!(type instanceof ParameterizedType)) {
                                                                        throw U.o(method3, i12, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                                                                    }
                                                                    if (!okhttp3.P.class.isAssignableFrom(U.h(U.g(0, (ParameterizedType) type)))) {
                                                                        throw U.o(method3, i12, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                    }
                                                                    e10 = new v(d2, 0);
                                                                } else if (clsH8.isArray()) {
                                                                    if (!okhttp3.P.class.isAssignableFrom(clsH8.getComponentType())) {
                                                                        throw U.o(method3, i12, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                    }
                                                                    e10 = new v(d2, 1);
                                                                } else {
                                                                    if (!okhttp3.P.class.isAssignableFrom(clsH8)) {
                                                                        throw U.o(method3, i12, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                    }
                                                                    e10 = d2;
                                                                }
                                                            } else {
                                                                okhttp3.F fOf = okhttp3.F.f40566b.of(HttpHeaders.CONTENT_DISPOSITION, q0.k("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", part.encoding());
                                                                if (Iterable.class.isAssignableFrom(clsH8)) {
                                                                    if (!(type instanceof ParameterizedType)) {
                                                                        throw U.o(method3, i12, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                                                                    }
                                                                    Type typeG5 = U.g(0, (ParameterizedType) type);
                                                                    if (okhttp3.P.class.isAssignableFrom(U.h(typeG5))) {
                                                                        throw U.o(method3, i12, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                    vVar = new v(new A(method3, i12, fOf, n11.c(typeG5, annotationArr4, annotationArr2)), 0);
                                                                } else if (clsH8.isArray()) {
                                                                    Class clsA = I.a(clsH8.getComponentType());
                                                                    if (okhttp3.P.class.isAssignableFrom(clsA)) {
                                                                        throw U.o(method3, i12, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                    vVar = new v(new A(method3, i12, fOf, n11.c(clsA, annotationArr4, annotationArr2)), 1);
                                                                } else {
                                                                    if (okhttp3.P.class.isAssignableFrom(clsH8)) {
                                                                        throw U.o(method3, i12, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                    e10 = new A(method3, i12, fOf, n11.c(type, annotationArr4, annotationArr2));
                                                                }
                                                                e10 = vVar;
                                                            }
                                                        } else if (annotation instanceof PartMap) {
                                                            i16.c(i12, type);
                                                            if (!i16.f41855r) {
                                                                throw U.o(method3, i12, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                            }
                                                            i16.f41845h = true;
                                                            Class clsH9 = U.h(type);
                                                            if (!Map.class.isAssignableFrom(clsH9)) {
                                                                throw U.o(method3, i12, "@PartMap parameter type must be Map.", new Object[0]);
                                                            }
                                                            Type typeI4 = U.i(type, clsH9);
                                                            if (!(typeI4 instanceof ParameterizedType)) {
                                                                throw U.o(method3, i12, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                            ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                                                            Type typeG6 = U.g(0, parameterizedType4);
                                                            if (String.class != typeG6) {
                                                                throw U.o(method3, i12, "@PartMap keys must be of type String: " + typeG6, new Object[0]);
                                                            }
                                                            Type typeG7 = U.g(1, parameterizedType4);
                                                            if (okhttp3.P.class.isAssignableFrom(U.h(typeG7))) {
                                                                throw U.o(method3, i12, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                            }
                                                            e10 = new A(method3, i12, n11.c(typeG7, annotationArr4, annotationArr2), ((PartMap) annotation).encoding());
                                                        } else if (annotation instanceof Body) {
                                                            i16.c(i12, type);
                                                            if (i16.f41854q || i16.f41855r) {
                                                                throw U.o(method3, i12, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                            }
                                                            if (i16.f41846i) {
                                                                throw U.o(method3, i12, "Multiple @Body method annotations found.", new Object[0]);
                                                            }
                                                            try {
                                                                Converter converterC = n11.c(type, annotationArr4, annotationArr2);
                                                                i16.f41846i = true;
                                                                e10 = new w(method3, i12, converterC);
                                                            } catch (RuntimeException e11) {
                                                                throw U.p(method3, e11, i12, "Unable to create @Body converter for %s", type);
                                                            }
                                                        } else if (annotation instanceof Tag) {
                                                            i16.c(i12, type);
                                                            Class clsH10 = U.h(type);
                                                            for (int i23 = i12 - 1; i23 >= 0; i23--) {
                                                                U u11 = i16.f41859w[i23];
                                                                if ((u11 instanceof E) && ((E) u11).f41818d.equals(clsH10)) {
                                                                    throw U.o(method3, i12, "@Tag type " + clsH10.getName() + " is duplicate of " + F.f41820b.c(method3, i23) + " and would always overwrite its value.", new Object[0]);
                                                                }
                                                            }
                                                            e10 = new E(clsH10);
                                                        } else {
                                                            e10 = null;
                                                        }
                                                    }
                                                    e10 = vVar2;
                                                    annotationArr4 = annotationArr7;
                                                }
                                            }
                                            type = type2;
                                            annotationArr4 = annotationArr;
                                            e10 = yVar;
                                            i12 = i19;
                                            method3 = method4;
                                        }
                                    }
                                    annotationArr4 = annotationArr4;
                                    type = type3;
                                    i12 = i19;
                                    method3 = method4;
                                }
                                if (e10 != null) {
                                    if (u6 == null) {
                                        throw U.o(method3, i12, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    u6 = e10;
                                }
                                i12 = i12;
                                method3 = method3;
                                type = type;
                                i21 = i22 + 1;
                                method4 = method3;
                                i19 = i12;
                                type3 = type;
                                length2 = i7;
                                annotationArr3 = annotationArr5;
                                length3 = i10;
                                i18 = i11;
                                uArr2 = uArr;
                                str2 = str;
                                annotationArr4 = annotationArr4;
                            }
                            type = type3;
                            i12 = i19;
                            method3 = method4;
                            if (e10 != null) {
                                if (u6 == null) {
                                    throw U.o(method3, i12, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                u6 = e10;
                            }
                            i12 = i12;
                            method3 = method3;
                            type = type;
                            i21 = i22 + 1;
                            method4 = method3;
                            i19 = i12;
                            type3 = type;
                            length2 = i7;
                            annotationArr3 = annotationArr5;
                            length3 = i10;
                            i18 = i11;
                            uArr2 = uArr;
                            str2 = str;
                            annotationArr4 = annotationArr4;
                        }
                    } else {
                        u6 = null;
                    }
                    Annotation[][] annotationArr8 = annotationArr3;
                    int i24 = length2;
                    int i25 = i18;
                    U[] uArr3 = uArr2;
                    String str4 = str2;
                    Type type4 = type3;
                    int i26 = i19;
                    Method method6 = method4;
                    if (u6 == null) {
                        if (i20 != 0) {
                            try {
                                if (U.h(type4) == Continuation.class) {
                                    i16.f41860x = true;
                                    u6 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw U.o(method6, i26, "No Retrofit annotation found.", new Object[0]);
                    }
                    uArr3[i26] = u6;
                    method4 = method6;
                    length2 = i24;
                    annotationArr3 = annotationArr8;
                    i18 = i25;
                    str2 = str4;
                    u10 = null;
                    i15 = 0;
                    i19 = i26 + 1;
                }
                String str5 = str2;
                Method method7 = method4;
                if (i16.f41856s == null && !i16.f41851n) {
                    throw U.n(method7, null, "Missing either @%s URL or @Url parameter.", i16.f41852o);
                }
                boolean z12 = i16.f41854q;
                if (!z12 && !i16.f41855r && !i16.f41853p && i16.f41846i) {
                    throw U.n(method7, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z12 && !i16.f41844g) {
                    throw U.n(method7, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (i16.f41855r && !i16.f41845h) {
                    throw U.n(method7, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                J j6 = new J(i16);
                Type genericReturnType2 = method.getGenericReturnType();
                if (U.j(genericReturnType2)) {
                    throw U.n(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw U.n(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z13 = j6.f41872l;
                if (z13) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type type5 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type5 instanceof WildcardType) {
                        type5 = ((WildcardType) type5).getLowerBounds()[0];
                    }
                    if (U.h(type5) == K.class && (type5 instanceof ParameterizedType)) {
                        typeG = U.g(0, (ParameterizedType) type5);
                        zM = false;
                        z10 = true;
                    } else {
                        if (U.h(type5) == Call.class) {
                            throw U.n(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", U.g(0, (ParameterizedType) type5));
                        }
                        zM = U.m(type5);
                        typeG = type5;
                        z10 = false;
                    }
                    genericReturnType = new S(null, Call.class, typeG);
                    if (!U.l(annotations, SkipCallbackExecutor.class)) {
                        Annotation[] annotationArr9 = new Annotation[annotations.length + 1];
                        annotationArr9[0] = P.f41888b;
                        System.arraycopy(annotations, 0, annotationArr9, 1, annotations.length);
                        annotations = annotationArr9;
                    }
                    z3 = z10;
                    z8 = zM;
                    method2 = method;
                } else {
                    method2 = method;
                    genericReturnType = method2.getGenericReturnType();
                    z3 = false;
                    z8 = false;
                }
                try {
                    CallAdapter callAdapterA = n10.a(genericReturnType, annotations);
                    Type typeResponseType = callAdapterA.responseType();
                    if (typeResponseType == e0.class) {
                        throw U.n(method2, null, "'" + U.h(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeResponseType == K.class) {
                        throw U.n(method2, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (j6.f41864d.equals(str5) && !Void.class.equals(typeResponseType) && !U.m(typeResponseType)) {
                        throw U.n(method2, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        Converter converterD = n10.d(typeResponseType, method2.getAnnotations());
                        okhttp3.Call.Factory factory = n10.f41884b;
                        if (z13) {
                            return z3 ? new C1996n(j6, factory, converterD, callAdapterA) : new C1995m(j6, factory, converterD, callAdapterA, z8);
                        }
                        return new C1994l(j6, factory, converterD, callAdapterA);
                    } catch (RuntimeException e12) {
                        throw U.n(method2, e12, "Unable to create converter for %s", typeResponseType);
                    }
                } catch (RuntimeException e13) {
                    throw U.n(method2, e13, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i17];
            if (annotation2 instanceof DELETE) {
                i16.b("DELETE", ((DELETE) annotation2).value(), false);
            } else if (annotation2 instanceof GET) {
                i16.b("GET", ((GET) annotation2).value(), false);
            } else if (annotation2 instanceof HEAD) {
                i16.b("HEAD", ((HEAD) annotation2).value(), false);
            } else if (annotation2 instanceof PATCH) {
                i16.b("PATCH", ((PATCH) annotation2).value(), r11);
            } else if (annotation2 instanceof POST) {
                i16.b("POST", ((POST) annotation2).value(), r11);
            } else if (annotation2 instanceof PUT) {
                i16.b("PUT", ((PUT) annotation2).value(), r11);
            } else if (annotation2 instanceof OPTIONS) {
                i16.b("OPTIONS", ((OPTIONS) annotation2).value(), false);
            } else {
                if (annotation2 instanceof HTTP) {
                    HTTP http = (HTTP) annotation2;
                    i16.b(http.method(), http.path(), http.hasBody());
                } else if (annotation2 instanceof Headers) {
                    Headers headers = (Headers) annotation2;
                    String[] strArrValue = headers.value();
                    if (strArrValue.length == 0) {
                        throw U.n(method4, null, "@Headers annotation is empty.", new Object[0]);
                    }
                    boolean zAllowUnsafeNonAsciiValues2 = headers.allowUnsafeNonAsciiValues();
                    F1.b bVar = new F1.b(3);
                    int length4 = strArrValue.length;
                    int i27 = 0;
                    while (i27 < length4) {
                        ?? r17 = r10;
                        String str6 = strArrValue[i27];
                        int iIndexOf = str6.indexOf(58);
                        if (iIndexOf == i14) {
                            r10 = r11;
                        } else if (iIndexOf != 0) {
                            int i28 = i14;
                            if (iIndexOf != str6.length() - 1) {
                                String strSubstring = str6.substring(0, iIndexOf);
                                String strTrim = str6.substring(iIndexOf + 1).trim();
                                if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                                    try {
                                        i16.f41857u = okhttp3.L.f40589e.get(strTrim);
                                    } catch (IllegalArgumentException e14) {
                                        throw U.n(method4, e14, "Malformed content type: %s", strTrim);
                                    }
                                } else if (zAllowUnsafeNonAsciiValues2) {
                                    bVar.e(strSubstring, strTrim);
                                } else {
                                    bVar.b(strSubstring, strTrim);
                                }
                                i27++;
                                r10 = r17 == true ? 1 : 0;
                                i14 = i28;
                            }
                        }
                        throw U.n(method4, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str6);
                    }
                    r10 = r11;
                    i13 = i14;
                    i16.t = bVar.h();
                    r3 = r10 == true ? 1 : 0;
                } else {
                    i13 = i14;
                    boolean z14 = r11 == true ? 1 : 0;
                    if (!(annotation2 instanceof Multipart)) {
                        r3 = z14 ? 1 : 0;
                        if (!(annotation2 instanceof FormUrlEncoded)) {
                            continue;
                        } else {
                            if (i16.f41855r) {
                                throw U.n(method4, null, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                            i16.f41854q = r3;
                        }
                    } else {
                        if (i16.f41854q) {
                            throw U.n(method4, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        r3 = z14 ? 1 : 0;
                        i16.f41855r = r3;
                    }
                }
                i17 += r3;
                r11 = r3;
                i14 = i13;
            }
            i13 = i14;
            r3 = r11 == true ? 1 : 0;
            i17 += r3;
            r11 = r3;
            i14 = i13;
        }
    }
}
