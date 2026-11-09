package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: retrofit2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1998p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f41942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f41944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f41945d;

    public C1998p(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f41942a = cls;
        this.f41943b = obj;
        this.f41944c = method;
        this.f41945d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f41942a.getName(), this.f41944c.getName(), this.f41945d);
    }
}
