package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: retrofit2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1991i extends AbstractC1986d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O1.a f41931a;

    public C1991i(O1.a aVar) {
        this.f41931a = aVar;
    }

    @Override // retrofit2.AbstractC1986d
    public final CallAdapter a(Type type, Annotation[] annotationArr) {
        if (U.h(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new androidx.work.impl.model.b(19, U.g(0, (ParameterizedType) type), U.l(annotationArr, SkipCallbackExecutor.class) ? null : this.f41931a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
