package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: retrofit2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1988f extends AbstractC1986d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41928a;

    public /* synthetic */ C1988f(int i7) {
        this.f41928a = i7;
    }

    @Override // retrofit2.AbstractC1986d
    public final CallAdapter a(Type type, Annotation[] annotationArr) {
        CallAdapter bVar;
        Type typeG;
        boolean z3;
        boolean z8;
        String str;
        switch (this.f41928a) {
            case 0:
                if (U.h(type) != CompletableFuture.class) {
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
                }
                Type typeG2 = U.g(0, (ParameterizedType) type);
                if (U.h(typeG2) != K.class) {
                    bVar = new Oe.a(typeG2, 24);
                } else {
                    if (!(typeG2 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                    }
                    bVar = new Sd.b(U.g(0, (ParameterizedType) typeG2), 25);
                }
                return bVar;
            default:
                Class clsH = U.h(type);
                if (clsH == df.a.class) {
                    return new retrofit2.adapter.rxjava2.e(Void.class, false, true, false, false, false, true);
                }
                boolean z10 = clsH == df.b.class;
                boolean z11 = clsH == df.j.class;
                boolean z12 = clsH == df.c.class;
                if (clsH != df.d.class && !z10 && !z11 && !z12) {
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    if (z10) {
                        str = "Flowable";
                    } else if (z11) {
                        str = "Single";
                    } else {
                        str = z12 ? "Maybe" : "Observable";
                    }
                    throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
                }
                Type typeG3 = U.g(0, (ParameterizedType) type);
                Class clsH2 = U.h(typeG3);
                if (clsH2 == K.class) {
                    if (!(typeG3 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                    }
                    typeG = U.g(0, (ParameterizedType) typeG3);
                    z8 = false;
                    z3 = false;
                } else if (clsH2 != retrofit2.adapter.rxjava2.d.class) {
                    typeG = typeG3;
                    z3 = true;
                    z8 = false;
                } else {
                    if (!(typeG3 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                    }
                    typeG = U.g(0, (ParameterizedType) typeG3);
                    z8 = true;
                    z3 = false;
                }
                return new retrofit2.adapter.rxjava2.e(typeG, z8, z3, z10, z11, z12, false);
        }
    }
}
