package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.c0;
import okhttp3.h0;
import retrofit2.http.Streaming;

/* JADX INFO: renamed from: retrofit2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1984b extends AbstractC1989g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41917a;

    public /* synthetic */ C1984b(int i7) {
        this.f41917a = i7;
    }

    @Override // retrofit2.AbstractC1989g
    public Converter a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, N n10) {
        switch (this.f41917a) {
            case 0:
                if (c0.class.isAssignableFrom(U.h(type))) {
                    return C1983a.f41899c;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, n10);
        }
    }

    @Override // retrofit2.AbstractC1989g
    public final Converter b(Type type, Annotation[] annotationArr, N n10) {
        switch (this.f41917a) {
            case 0:
                if (type == h0.class) {
                    return U.l(annotationArr, Streaming.class) ? C1983a.f41900d : C1983a.f41898b;
                }
                if (type == Void.class) {
                    return C1983a.f41903g;
                }
                if (U.m(type)) {
                    return C1983a.f41902f;
                }
                return null;
            default:
                if (U.h(type) != Optional.class) {
                    return null;
                }
                return new p1.c(n10.d(U.g(0, (ParameterizedType) type), annotationArr), 27);
        }
    }
}
