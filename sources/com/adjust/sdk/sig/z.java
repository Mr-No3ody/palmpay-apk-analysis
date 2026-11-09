package com.adjust.sdk.sig;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f19528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2 f19529b;

    static {
        z zVar = new z();
        f19528a = zVar;
        d2 d2Var = new d2(zVar);
        String[] strArr = d2Var.f19432c;
        int i7 = d2Var.f19431b + 1;
        d2Var.f19431b = i7;
        strArr[i7] = "os_name";
        d2Var.f19434e[i7] = true;
        d2Var.f19433d[i7] = null;
        if (i7 == 0) {
            HashMap map = new HashMap();
            int length = d2Var.f19432c.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(d2Var.f19432c[i10], Integer.valueOf(i10));
            }
            d2Var.f19435f = map;
        }
        f19529b = d2Var;
    }

    @Override // com.adjust.sdk.sig.r1
    public final l2 a() {
        return f19529b;
    }

    @Override // com.adjust.sdk.sig.r1
    public final void a(v2 v2Var, Object obj) {
        p3 p3Var;
        d2 d2Var = f19529b;
        e3 e3Var = e3.f19448a;
        if (e3Var == f3.f19456a) {
            p3Var = p3.LIST;
        } else if (e3Var != g3.f19458a) {
            p3Var = p3.OBJ;
        } else {
            l2 l2VarA = q3.a(d2Var.b(0));
            p2 p2VarD = l2VarA.d();
            if (!(p2VarD instanceof f2) && !g1.a(p2VarD, o2.f19493a)) {
                throw new m1("Value of type '" + l2VarA.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + l2VarA.d() + '\'', "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
            }
            p3Var = p3.MAP;
        }
        v2Var.f19513a.a(p3Var.f19500a);
        x xVar = v2Var.f19513a;
        xVar.f19523b = true;
        String str = v2Var.f19518f;
        if (str != null) {
            String str2 = v2Var.f19519g;
            if (str2 == null) {
                str2 = "com.adjust.sdk.sig.755f89ae93acbe52c30f8a09";
            }
            xVar.a();
            v2Var.a(str);
            v2Var.f19513a.a(':');
            v2Var.a(str2);
            v2Var.f19518f = null;
            v2Var.f19519g = null;
        }
        if (v2Var.f19515c != p3Var) {
            v2 v2Var2 = v2Var.f19516d[p3Var.ordinal()];
            if (v2Var2 == null) {
                v2Var2 = new v2(v2Var.f19513a, v2Var.f19514b, p3Var, v2Var.f19516d);
            }
            v2Var = v2Var2;
        }
        if (v2Var.f19517e.f19477a) {
            x2 x2Var = x2.f19526a;
            int iOrdinal = v2Var.f19515c.ordinal();
            if (iOrdinal == 1) {
                x xVar2 = v2Var.f19513a;
                if (!xVar2.f19523b) {
                    xVar2.a(',');
                }
                v2Var.f19513a.a();
            } else if (iOrdinal == 2) {
                x xVar3 = v2Var.f19513a;
                if (xVar3.f19523b) {
                    xVar3.a();
                } else {
                    xVar3.a(',');
                    v2Var.f19513a.a();
                }
            } else if (iOrdinal != 3) {
                x xVar4 = v2Var.f19513a;
                if (!xVar4.f19523b) {
                    xVar4.a(',');
                }
                v2Var.f19513a.a();
                g1.a(e3Var, e3Var);
                v2Var.a(d2Var.f19432c[0]);
                v2Var.f19513a.a(':');
            }
            v2Var.a(x2Var, "android");
        }
        x xVar5 = v2Var.f19513a;
        xVar5.f19523b = false;
        xVar5.a(v2Var.f19515c.f19501b);
    }
}
