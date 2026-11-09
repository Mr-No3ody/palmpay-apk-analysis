package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1204n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1204n f17460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1204n f17461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1204n f17462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1204n f17463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1204n f17464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1204n[] f17465f;

    static {
        EnumC1204n enumC1204n = new EnumC1204n("DESTROYED", 0);
        f17460a = enumC1204n;
        EnumC1204n enumC1204n2 = new EnumC1204n("INITIALIZED", 1);
        f17461b = enumC1204n2;
        EnumC1204n enumC1204n3 = new EnumC1204n("CREATED", 2);
        f17462c = enumC1204n3;
        EnumC1204n enumC1204n4 = new EnumC1204n("STARTED", 3);
        f17463d = enumC1204n4;
        EnumC1204n enumC1204n5 = new EnumC1204n("RESUMED", 4);
        f17464e = enumC1204n5;
        f17465f = new EnumC1204n[]{enumC1204n, enumC1204n2, enumC1204n3, enumC1204n4, enumC1204n5};
    }

    public static EnumC1204n valueOf(String str) {
        return (EnumC1204n) Enum.valueOf(EnumC1204n.class, str);
    }

    public static EnumC1204n[] values() {
        return (EnumC1204n[]) f17465f.clone();
    }

    public final boolean a(EnumC1204n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
