package D8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f1696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f1697d;

    static {
        c cVar = new c("Common", 0);
        f1694a = cVar;
        c cVar2 = new c("Holo", 1);
        f1695b = cVar2;
        c cVar3 = new c("None", 2);
        f1696c = cVar3;
        f1697d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f1697d.clone();
    }
}
