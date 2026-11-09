package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f41087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadMode f41088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f41089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41092f;

    public i(Method method, Class cls, ThreadMode threadMode, int i7, boolean z3) {
        this.f41087a = method;
        this.f41088b = threadMode;
        this.f41089c = cls;
        this.f41090d = i7;
        this.f41091e = z3;
    }

    public final synchronized void a() {
        if (this.f41092f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f41087a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f41087a.getName());
            sb2.append('(');
            sb2.append(this.f41089c.getName());
            this.f41092f = sb2.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        a();
        i iVar = (i) obj;
        iVar.a();
        return this.f41092f.equals(iVar.f41092f);
    }

    public final int hashCode() {
        return this.f41087a.hashCode();
    }
}
