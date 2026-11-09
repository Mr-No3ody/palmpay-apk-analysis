package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f17700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f17701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f17702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ E[] f17703d;

    static {
        E e10 = new E("AUTOMATIC", 0);
        f17700a = e10;
        E e11 = new E("TRUNCATE", 1);
        f17701b = e11;
        E e12 = new E("WRITE_AHEAD_LOGGING", 2);
        f17702c = e12;
        f17703d = new E[]{e10, e11, e12};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f17703d.clone();
    }
}
