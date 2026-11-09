package G7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f3055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f3056c;

    static {
        c cVar = new c("ALIGN_BALLOON", 0);
        f3054a = cVar;
        c cVar2 = new c("ALIGN_ANCHOR", 1);
        f3055b = cVar2;
        f3056c = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f3056c.clone();
    }
}
