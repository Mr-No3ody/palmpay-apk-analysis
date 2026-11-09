package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.core.network.annotation.JsonName;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.AbstractC1989g;
import retrofit2.Converter;
import retrofit2.N;
import retrofit2.http.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1989g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gson f41919b;

    public /* synthetic */ a(Gson gson, int i7) {
        this.f41918a = i7;
        this.f41919b = gson;
    }

    @Override // retrofit2.AbstractC1989g
    public final Converter a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, N n10) {
        switch (this.f41918a) {
            case 0:
                TypeToken<?> typeToken = TypeToken.get(type);
                Gson gson = this.f41919b;
                return new b(gson, gson.getAdapter(typeToken));
            default:
                for (Annotation annotation : annotationArr) {
                    if (annotation instanceof JsonName) {
                        String strValue = ((JsonName) annotation).value();
                        p324va.b bVar = new p324va.b();
                        bVar.f43140a = strValue;
                        return bVar;
                    }
                }
                TypeToken<?> typeToken2 = TypeToken.get(type);
                Gson gson2 = this.f41919b;
                return new p324va.a(gson2, gson2.getAdapter(typeToken2));
        }
    }

    @Override // retrofit2.AbstractC1989g
    public final Converter b(Type type, Annotation[] annotationArr, N n10) {
        switch (this.f41918a) {
            case 0:
                TypeToken<?> typeToken = TypeToken.get(type);
                Gson gson = this.f41919b;
                return new c(gson, gson.getAdapter(typeToken), 0);
            default:
                TypeToken<?> typeToken2 = TypeToken.get(type);
                Gson gson2 = this.f41919b;
                return new c(gson2, gson2.getAdapter(typeToken2), 1);
        }
    }

    @Override // retrofit2.AbstractC1989g
    public Converter c(Type type, Annotation[] annotationArr) {
        switch (this.f41918a) {
            case 1:
                if (String.class.equals(type)) {
                    for (Annotation annotation : annotationArr) {
                        if (annotation instanceof Field) {
                            ((Field) annotation).value();
                            return new p184m8.b(21);
                        }
                    }
                }
                return null;
            default:
                return super.c(type, annotationArr);
        }
    }
}
