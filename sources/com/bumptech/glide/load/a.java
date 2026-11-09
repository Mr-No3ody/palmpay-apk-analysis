package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f20513f;

    static {
        a aVar = new a("LOCAL", 0);
        f20508a = aVar;
        a aVar2 = new a("REMOTE", 1);
        f20509b = aVar2;
        a aVar3 = new a("DATA_DISK_CACHE", 2);
        f20510c = aVar3;
        a aVar4 = new a("RESOURCE_DISK_CACHE", 3);
        f20511d = aVar4;
        a aVar5 = new a("MEMORY_CACHE", 4);
        f20512e = aVar5;
        f20513f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20513f.clone();
    }
}
