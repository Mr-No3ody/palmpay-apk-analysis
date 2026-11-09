package com.adjust.sdk.sig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.adjust.sdk.sig.p3[], still in use, count: 1, list:
  (r0v1 com.adjust.sdk.sig.p3[]) from 0x0036: CONSTRUCTOR (r0v1 com.adjust.sdk.sig.p3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:55) call: com.adjust.sdk.sig.f0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class p3 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    /* JADX INFO: Fake field, exist only in values array */
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f0 f19499g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f19500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f19501b;

    static {
        f19499g = new f0(p3VarArr);
    }

    public p3(char c6, char c10) {
        super(str, i);
        this.f19500a = c6;
        this.f19501b = c10;
    }

    public static p3 valueOf(String str) {
        return (p3) Enum.valueOf(p3.class, str);
    }

    public static p3[] values() {
        return (p3[]) f19498f.clone();
    }
}
