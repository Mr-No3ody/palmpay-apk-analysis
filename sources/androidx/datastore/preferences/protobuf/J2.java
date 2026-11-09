package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class J2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J2 f16510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J2 f16511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ J2[] f16512c;

    static {
        J2 j6 = new J2("ASCENDING", 0);
        f16510a = j6;
        J2 j10 = new J2("DESCENDING", 1);
        f16511b = j10;
        f16512c = new J2[]{j6, j10};
    }

    public static J2 valueOf(String name) {
        return (J2) Enum.valueOf(J2.class, name);
    }

    public static J2[] values() {
        return (J2[]) f16512c.clone();
    }
}
