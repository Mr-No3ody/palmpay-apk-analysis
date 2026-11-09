package p077f4;

import com.flexibank.sdk.core.network.annotation.FlexiBankJsonName;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p039cb.c;
import retrofit2.AbstractC1989g;
import retrofit2.Converter;
import retrofit2.N;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1989g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f36387b = new f(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f36388a;

    public g(Gson gson) {
        this.f36388a = gson;
    }

    @Override // retrofit2.AbstractC1989g
    public final Converter a(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, N retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        for (Annotation annotation : parameterAnnotations) {
            if (annotation instanceof FlexiBankJsonName) {
                return new d(((FlexiBankJsonName) annotation).value());
            }
        }
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f36388a;
        Intrinsics.f(gson.getAdapter(typeToken), "null cannot be cast to non-null type com.google.gson.TypeAdapter<kotlin.Any?>");
        return new b(gson);
    }

    @Override // retrofit2.AbstractC1989g
    public final Converter b(Type type, Annotation[] annotations, N retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new c(this.f36388a, type);
    }
}
