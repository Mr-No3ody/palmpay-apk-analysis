package androidx.constraintlayout.motion.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f15440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f15441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f15442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f15443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f15444e;

    static {
        u uVar = new u("UNDEFINED", 0);
        f15440a = uVar;
        u uVar2 = new u("SETUP", 1);
        f15441b = uVar2;
        u uVar3 = new u("MOVING", 2);
        f15442c = uVar3;
        u uVar4 = new u("FINISHED", 3);
        f15443d = uVar4;
        f15444e = new u[]{uVar, uVar2, uVar3, uVar4};
    }

    public static u valueOf(String name) {
        return (u) Enum.valueOf(u.class, name);
    }

    public static u[] values() {
        return (u[]) f15444e.clone();
    }
}
