package androidx.camera.view.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f14976c;

    static {
        a aVar = new a("PREVIEW_VIEW", 0);
        f14974a = aVar;
        a aVar2 = new a("SCREEN_FLASH_VIEW", 1);
        f14975b = aVar2;
        f14976c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14976c.clone();
    }
}
