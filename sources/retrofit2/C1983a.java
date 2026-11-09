package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import okhttp3.c0;
import okhttp3.h0;

/* JADX INFO: renamed from: retrofit2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1983a implements Converter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1983a f41898b = new C1983a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1983a f41899c = new C1983a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1983a f41900d = new C1983a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1983a f41901e = new C1983a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1983a f41902f = new C1983a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1983a f41903g = new C1983a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41904a;

    public /* synthetic */ C1983a(int i7) {
        this.f41904a = i7;
    }

    public List a(O1.a aVar) {
        return Collections.singletonList(new C1991i(aVar));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(Method method, int i7) {
        return "parameter #" + (i7 + 1);
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        switch (this.f41904a) {
            case 0:
                h0 h0Var = (h0) obj;
                try {
                    Pg.k kVar = new Pg.k();
                    h0Var.source().readAll(kVar);
                    return h0.create(h0Var.contentType(), h0Var.contentLength(), kVar);
                } finally {
                    h0Var.close();
                }
            case 1:
                return (c0) obj;
            case 2:
                return (h0) obj;
            case 3:
                return obj.toString();
            case 4:
                ((h0) obj).close();
                return Unit.f38893a;
            default:
                ((h0) obj).close();
                return null;
        }
    }

    public Object d(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean e(Method method) {
        return false;
    }
}
