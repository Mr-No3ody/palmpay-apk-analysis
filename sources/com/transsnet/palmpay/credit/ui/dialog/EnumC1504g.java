package com.transsnet.palmpay.credit.ui.dialog;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.transsnet.palmpay.credit.ui.dialog.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1504g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1504g f30112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1504g f30113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1504g[] f30114c;

    static {
        EnumC1504g enumC1504g = new EnumC1504g("OVERDUE", 0);
        f30112a = enumC1504g;
        EnumC1504g enumC1504g2 = new EnumC1504g("PENDING", 1);
        f30113b = enumC1504g2;
        EnumC1504g[] enumC1504gArr = {enumC1504g, enumC1504g2};
        f30114c = enumC1504gArr;
        com.facebook.imagepipeline.nativecode.b.n(enumC1504gArr);
    }

    public static EnumC1504g valueOf(String str) {
        return (EnumC1504g) Enum.valueOf(EnumC1504g.class, str);
    }

    public static EnumC1504g[] values() {
        return (EnumC1504g[]) f30114c.clone();
    }
}
