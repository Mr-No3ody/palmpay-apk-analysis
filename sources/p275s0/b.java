package p275s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f41997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f41998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f41999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f42000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f42001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f42002g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f42003i;

    /* JADX INFO: Fake field, exist only in values array */
    b EF0;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        b bVar2 = new b("PENALTY_DEATH", 1);
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f41996a = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f41997b = bVar4;
        b bVar5 = new b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f41998c = bVar5;
        b bVar6 = new b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f41999d = bVar6;
        b bVar7 = new b("DETECT_SET_USER_VISIBLE_HINT", 6);
        f42000e = bVar7;
        b bVar8 = new b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f42001f = bVar8;
        b bVar9 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f42002g = bVar9;
        f42003i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f42003i.clone();
    }
}
