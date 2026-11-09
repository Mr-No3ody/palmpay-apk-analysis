package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f18129a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int b(f0 f0Var, int i7) {
        int[] iArr;
        if (f0Var == null || (iArr = (int[]) f0Var.f18045a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i7];
    }
}
