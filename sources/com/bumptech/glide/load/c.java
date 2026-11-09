package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f20518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f20519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f20520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f20521d;

    static {
        c cVar = new c("SOURCE", 0);
        f20518a = cVar;
        c cVar2 = new c("TRANSFORMED", 1);
        f20519b = cVar2;
        c cVar3 = new c("NONE", 2);
        f20520c = cVar3;
        f20521d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f20521d.clone();
    }
}
