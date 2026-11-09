package com.facebook.imagepipeline.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f21428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f21429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f21430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f21431e;

    static {
        e eVar = new e("LOW", 0);
        f21428b = eVar;
        e eVar2 = new e("MEDIUM", 1);
        f21429c = eVar2;
        e eVar3 = new e("HIGH", 2);
        f21430d = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f21431e = eVarArr;
        com.facebook.imagepipeline.nativecode.b.n(eVarArr);
        f21427a = new d(null);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f21431e.clone();
    }
}
