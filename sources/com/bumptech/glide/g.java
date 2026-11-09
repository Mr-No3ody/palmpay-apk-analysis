package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f20469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f20470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f20471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f20472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f20473e;

    static {
        g gVar = new g("IMMEDIATE", 0);
        f20469a = gVar;
        g gVar2 = new g("HIGH", 1);
        f20470b = gVar2;
        g gVar3 = new g("NORMAL", 2);
        f20471c = gVar3;
        g gVar4 = new g("LOW", 3);
        f20472d = gVar4;
        f20473e = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f20473e.clone();
    }
}
