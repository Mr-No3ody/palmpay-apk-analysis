package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.room.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1237p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1237p f17785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1237p[] f17786b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1237p EF0;

    static {
        EnumC1237p enumC1237p = new EnumC1237p("FTS3", 0);
        EnumC1237p enumC1237p2 = new EnumC1237p("FTS4", 1);
        f17785a = enumC1237p2;
        f17786b = new EnumC1237p[]{enumC1237p, enumC1237p2};
    }

    public static EnumC1237p valueOf(String str) {
        return (EnumC1237p) Enum.valueOf(EnumC1237p.class, str);
    }

    public static EnumC1237p[] values() {
        return (EnumC1237p[]) f17786b.clone();
    }
}
