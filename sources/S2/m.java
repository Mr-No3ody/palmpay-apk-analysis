package S2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 S2.m[], still in use, count: 1, list:
  (r0v1 S2.m[]) from 0x001f: INVOKE (r0v1 S2.m[]) STATIC call: com.facebook.imagepipeline.nativecode.b.n(java.lang.Enum[]):Gf.a A[MD:(java.lang.Enum[]):Gf.a (m)] (LINE:32)
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
public final class m {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(-1),
    /* JADX INFO: Fake field, exist only in values array */
    VISIBLE(1),
    /* JADX INFO: Fake field, exist only in values array */
    INVISIBLE(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m[] f8660b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8662a;

    static {
        com.facebook.imagepipeline.nativecode.b.n(mVarArr);
        new l(null);
        f8660b = values();
    }

    public m(int i7) {
        super(str, i);
        this.f8662a = i7;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f8661c.clone();
    }
}
