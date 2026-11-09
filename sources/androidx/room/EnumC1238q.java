package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.room.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1238q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1238q f17787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1238q[] f17788b;

    static {
        EnumC1238q enumC1238q = new EnumC1238q("ASC", 0);
        f17787a = enumC1238q;
        f17788b = new EnumC1238q[]{enumC1238q, new EnumC1238q("DESC", 1)};
    }

    public static EnumC1238q valueOf(String str) {
        return (EnumC1238q) Enum.valueOf(EnumC1238q.class, str);
    }

    public static EnumC1238q[] values() {
        return (EnumC1238q[]) f17788b.clone();
    }
}
