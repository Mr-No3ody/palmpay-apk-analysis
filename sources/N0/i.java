package N0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f6040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f6041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f6042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f6043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f6044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i[] f6045f;

    static {
        i iVar = new i("ON_CONFIGURE", 0);
        f6040a = iVar;
        i iVar2 = new i("ON_CREATE", 1);
        f6041b = iVar2;
        i iVar3 = new i("ON_UPGRADE", 2);
        f6042c = iVar3;
        i iVar4 = new i("ON_DOWNGRADE", 3);
        f6043d = iVar4;
        i iVar5 = new i("ON_OPEN", 4);
        f6044e = iVar5;
        f6045f = new i[]{iVar, iVar2, iVar3, iVar4, iVar5};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f6045f.clone();
    }
}
