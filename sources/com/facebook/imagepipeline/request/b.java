package com.facebook.imagepipeline.request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f21655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f21656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f21658d;

    static {
        b bVar = new b("SMALL", 0);
        f21655a = bVar;
        b bVar2 = new b("DEFAULT", 1);
        f21656b = bVar2;
        b bVar3 = new b("DYNAMIC", 2);
        f21657c = bVar3;
        f21658d = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f21658d.clone();
    }
}
