package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f41966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Converter f41968f;

    public w(Method method, int i7, Converter converter) {
        this.f41966d = method;
        this.f41967e = i7;
        this.f41968f = converter;
    }

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        Method method = this.f41966d;
        int i7 = this.f41967e;
        if (obj == null) {
            throw U.o(method, i7, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            h7.f41835k = (c0) this.f41968f.convert(obj);
        } catch (IOException e10) {
            throw U.p(method, e10, i7, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
