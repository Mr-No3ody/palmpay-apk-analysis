package Y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f11278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f11279c;

    static {
        c cVar = new c("LAY_DOWN", 0);
        f11277a = cVar;
        c cVar2 = new c("PULL_OUT", 1);
        f11278b = cVar2;
        f11279c = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f11279c.clone();
    }
}
