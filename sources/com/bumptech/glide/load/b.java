package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f20515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f20517d;

    static {
        b bVar = new b("PREFER_ARGB_8888", 0);
        f20514a = bVar;
        b bVar2 = new b("PREFER_RGB_565", 1);
        f20515b = bVar2;
        f20517d = new b[]{bVar, bVar2};
        f20516c = bVar;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20517d.clone();
    }
}
