package org.aspectj.runtime.reflect;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f41006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f41007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f41008h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41009a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41010b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41011c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41012d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41013e;

    static {
        e eVar = new e();
        f41006f = eVar;
        eVar.f41009a = true;
        eVar.f41010b = false;
        eVar.f41011c = false;
        eVar.f41012d = true;
        e eVar2 = new e();
        f41007g = eVar2;
        eVar2.f41009a = true;
        eVar2.f41010b = true;
        eVar2.f41011c = false;
        eVar2.f41012d = false;
        eVar.f41013e = 1;
        e eVar3 = new e();
        f41008h = eVar3;
        eVar3.f41009a = false;
        eVar3.f41010b = true;
        eVar3.f41011c = true;
        eVar3.f41012d = false;
        eVar3.f41013e = 2;
    }

    public static String a(String str, Class cls, boolean z3) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z3));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
        if (!z3) {
            return str.replace('$', '.');
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            str = str.substring(iLastIndexOf + 1);
        }
        return str.replace('$', '.');
    }
}
