package dc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f35862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f35863d;

    static {
        a aVar = new a("Common", 0);
        f35860a = aVar;
        a aVar2 = new a("Holo", 1);
        f35861b = aVar2;
        a aVar3 = new a("None", 2);
        f35862c = aVar3;
        f35863d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f35863d.clone();
    }
}
