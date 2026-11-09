package V5;

import N8.q0;
import com.nimbusds.jose.shaded.gson.z;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f10028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Method f10033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f10035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.nimbusds.jose.shaded.gson.m f10036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.nimbusds.jose.shaded.gson.reflect.a f10037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f10038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f10039m;

    public n(String str, Field field, boolean z3, boolean z8, boolean z10, Method method, boolean z11, z zVar, com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar, boolean z12, boolean z13) {
        this.f10032f = z10;
        this.f10033g = method;
        this.f10034h = z11;
        this.f10035i = zVar;
        this.f10036j = mVar;
        this.f10037k = aVar;
        this.f10038l = z12;
        this.f10039m = z13;
        this.f10027a = str;
        this.f10028b = field;
        this.f10029c = field.getName();
        this.f10030d = z3;
        this.f10031e = z8;
    }

    public final void a(com.nimbusds.jose.shaded.gson.stream.c cVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.f10030d) {
            Field field = this.f10028b;
            boolean z3 = this.f10032f;
            Method method = this.f10033g;
            if (z3) {
                if (method == null) {
                    r.a(obj, field);
                } else {
                    r.a(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e10) {
                    throw new com.nimbusds.jose.shaded.gson.p(10, q0.k("Accessor ", X5.c.d(method, false), " threw exception"), e10.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            cVar.g(this.f10027a);
            boolean z8 = this.f10034h;
            z jVar = this.f10035i;
            if (!z8) {
                jVar = new j(this.f10036j, jVar, this.f10037k.f23690b);
            }
            jVar.b(cVar, objInvoke);
        }
    }
}
