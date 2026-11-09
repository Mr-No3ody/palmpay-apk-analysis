package S2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 S2.i[], still in use, count: 1, list:
  (r0v1 S2.i[]) from 0x0042: INVOKE (r0v1 S2.i[]) STATIC call: com.facebook.imagepipeline.nativecode.b.n(java.lang.Enum[]):Gf.a A[MD:(java.lang.Enum[]):Gf.a (m)] (LINE:67)
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
public final class i {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(-1),
    /* JADX INFO: Fake field, exist only in values array */
    REQUESTED(0),
    /* JADX INFO: Fake field, exist only in values array */
    INTERMEDIATE_AVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    SUCCESS(3),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    EMPTY_EVENT(7),
    /* JADX INFO: Fake field, exist only in values array */
    RELEASED(8);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i[] f8657b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8659a;

    static {
        com.facebook.imagepipeline.nativecode.b.n(iVarArr);
        new h(null);
        f8657b = values();
    }

    public i(int i7) {
        super(str, i);
        this.f8659a = i7;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f8658c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return "requested";
        }
        if (iOrdinal == 2) {
            return "intermediate_available";
        }
        if (iOrdinal == 3) {
            return "success";
        }
        if (iOrdinal != 4) {
            return iOrdinal != 6 ? "unknown" : "released";
        }
        return "error";
    }
}
