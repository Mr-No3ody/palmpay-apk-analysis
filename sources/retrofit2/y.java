package retrofit2;

import N8.q0;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f41974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Converter f41976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f41977h;

    public /* synthetic */ y(Method method, int i7, Converter converter, boolean z3, int i10) {
        this.f41973d = i10;
        this.f41974e = method;
        this.f41975f = i7;
        this.f41976g = converter;
        this.f41977h = z3;
    }

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        switch (this.f41973d) {
            case 0:
                Map map = (Map) obj;
                Method method = this.f41974e;
                int i7 = this.f41975f;
                if (map == null) {
                    throw U.o(method, i7, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw U.o(method, i7, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw U.o(method, i7, q0.k("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    Converter converter = this.f41976g;
                    String str2 = (String) converter.convert(value);
                    if (str2 == null) {
                        throw U.o(method, i7, "Field map value '" + value + "' converted to null by " + converter.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    h7.a(str, str2, this.f41977h);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                Method method2 = this.f41974e;
                int i10 = this.f41975f;
                if (map2 == null) {
                    throw U.o(method2, i10, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (str3 == null) {
                        throw U.o(method2, i10, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw U.o(method2, i10, q0.k("Header map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    h7.b(str3, (String) this.f41976g.convert(value2), this.f41977h);
                }
                return;
            default:
                Map map3 = (Map) obj;
                Method method3 = this.f41974e;
                int i11 = this.f41975f;
                if (map3 == null) {
                    throw U.o(method3, i11, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str4 = (String) entry3.getKey();
                    if (str4 == null) {
                        throw U.o(method3, i11, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw U.o(method3, i11, q0.k("Query map contained null value for key '", str4, "'."), new Object[0]);
                    }
                    Converter converter2 = this.f41976g;
                    String str5 = (String) converter2.convert(value3);
                    if (str5 == null) {
                        throw U.o(method3, i11, "Query map value '" + value3 + "' converted to null by " + converter2.getClass().getName() + " for key '" + str4 + "'.", new Object[0]);
                    }
                    h7.c(str4, str5, this.f41977h);
                }
                return;
        }
    }
}
