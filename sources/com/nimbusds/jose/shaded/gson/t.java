package com.nimbusds.jose.shaded.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f23717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f23718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f23719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f23720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t[] f23721e;

    static {
        t tVar = new t("ALLOW", 0);
        f23717a = tVar;
        t tVar2 = new t("INDECISIVE", 1);
        f23718b = tVar2;
        t tVar3 = new t("BLOCK_INACCESSIBLE", 2);
        f23719c = tVar3;
        t tVar4 = new t("BLOCK_ALL", 3);
        f23720d = tVar4;
        f23721e = new t[]{tVar, tVar2, tVar3, tVar4};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f23721e.clone();
    }
}
