package com.adjust.sdk.sig;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f19494a;

    static {
        j1 j1Var = new j1(i1.f19464b);
        a(j1Var);
        f19494a = new n1(new l1(j1Var.f19467a, j1Var.f19468b, j1Var.f19469c));
    }

    public static String a(a0 a0Var) {
        n1 n1Var = f19494a;
        n1Var.getClass();
        z zVar = z.f19528a;
        o1 o1Var = new o1();
        try {
            new v2(new x(o1Var), n1Var, p3.OBJ, new v2[p3.f19499g.f19451a.length]).a(zVar, a0Var);
            String string = o1Var.toString();
            o1Var.a();
            byte[] bArr = s2.f19505a;
            byte[] bArrA = d3.a(string);
            int length = bArrA.length;
            for (int i7 = 0; i7 < length; i7++) {
                bArrA[i7] = (byte) (bArrA[i7] ^ bArr[i7 % 19]);
            }
            return Base64.encodeToString(bArrA, 2);
        } catch (Throwable th) {
            o1Var.a();
            throw th;
        }
    }

    public static final m3 a(j1 j1Var) {
        j1Var.f19467a = true;
        j1Var.f19468b = false;
        return m3.f19486a;
    }
}
