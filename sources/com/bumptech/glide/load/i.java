package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f20808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f20809b;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("SRGB", 0);
        i iVar2 = new i("DISPLAY_P3", 1);
        f20808a = iVar2;
        f20809b = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f20809b.clone();
    }
}
