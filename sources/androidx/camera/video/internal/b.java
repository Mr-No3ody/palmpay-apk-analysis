package androidx.camera.video.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f14619c;

    static {
        b bVar = new b("ACTIVE", 0);
        f14617a = bVar;
        b bVar2 = new b("INACTIVE", 1);
        f14618b = bVar2;
        f14619c = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f14619c.clone();
    }
}
