package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f41883a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okhttp3.Call.Factory f41884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final okhttp3.J f41885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f41886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f41887e;

    public N(okhttp3.Call.Factory factory, okhttp3.J j6, List list, List list2, O1.a aVar) {
        this.f41884b = factory;
        this.f41885c = j6;
        this.f41886d = list;
        this.f41887e = list2;
    }

    public final CallAdapter a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f41887e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = iIndexOf; i7 < size; i7++) {
            CallAdapter callAdapterA = ((AbstractC1986d) list.get(i7)).a(type, annotationArr);
            if (callAdapterA != null) {
                return callAdapterA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC1986d) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Object b(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new L(this, cls));
    }

    public final Converter c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f41886d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = iIndexOf; i7 < size; i7++) {
            Converter converterA = ((AbstractC1989g) list.get(i7)).a(type, annotationArr, annotationArr2, this);
            if (converterA != null) {
                return converterA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC1989g) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Converter d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f41886d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = iIndexOf; i7 < size; i7++) {
            Converter converterB = ((AbstractC1989g) list.get(i7)).b(type, annotationArr, this);
            if (converterB != null) {
                return converterB;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC1989g) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Converter e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f41886d;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Converter converterC = ((AbstractC1989g) list.get(i7)).c(type, annotationArr);
            if (converterC != null) {
                return converterC;
            }
        }
        return C1983a.f41901e;
    }
}
