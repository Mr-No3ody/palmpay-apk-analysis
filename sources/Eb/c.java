package Eb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f2272a;

    /* JADX INFO: Fake field, exist only in values array */
    c EF5;

    static {
        c[] cVarArr = {new c("NONE", 0), new c("SUCCESS", 1), new c("FAIL", 2)};
        f2272a = cVarArr;
        com.facebook.imagepipeline.nativecode.b.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2272a.clone();
    }
}
