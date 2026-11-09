package Sg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f8907a = {new a("BEFORE", 0), new a("AFTER", 1), new a("AFTER_RETURNING", 2), new a("AFTER_THROWING", 3), new a("AROUND", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8907a.clone();
    }
}
