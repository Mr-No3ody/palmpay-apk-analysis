package androidx.camera.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f15003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ q[] f15004c;

    static {
        q qVar = new q("IDLE", 0);
        f15002a = qVar;
        q qVar2 = new q("STREAMING", 1);
        f15003b = qVar2;
        f15004c = new q[]{qVar, qVar2};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f15004c.clone();
    }
}
