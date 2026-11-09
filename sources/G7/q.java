package G7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f3135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f3136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ q[] f3137c;

    /* JADX INFO: Fake field, exist only in values array */
    q EF0;

    static {
        q qVar = new q("NONE", 0);
        q qVar2 = new q("ELASTIC", 1);
        q qVar3 = new q("FADE", 2);
        f3135a = qVar3;
        q qVar4 = new q("CIRCULAR", 3);
        f3136b = qVar4;
        f3137c = new q[]{qVar, qVar2, qVar3, qVar4, new q("OVERSHOOT", 4)};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f3137c.clone();
    }
}
