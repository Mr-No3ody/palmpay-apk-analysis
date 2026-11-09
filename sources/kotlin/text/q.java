package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlin.text.q[], still in use, count: 1, list:
  (r0v1 kotlin.text.q[]) from 0x0060: INVOKE (r0v1 kotlin.text.q[]) STATIC call: com.facebook.imagepipeline.nativecode.b.n(java.lang.Enum[]):Gf.a A[MD:(java.lang.Enum[]):Gf.a (m)] (LINE:97)
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
/* JADX INFO: loaded from: classes4.dex */
public final class q implements FlagEnum {
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_CASE(2, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    DOT_MATCHES_ALL(32, 0, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(128, 0, 2, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39039b;

    static {
        com.facebook.imagepipeline.nativecode.b.n(qVarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i);
        i10 = (i11 & 2) != 0 ? i7 : i10;
        this.f39038a = i7;
        this.f39039b = i10;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f39037d.clone();
    }

    @Override // kotlin.text.FlagEnum
    public final int getMask() {
        return this.f39039b;
    }

    @Override // kotlin.text.FlagEnum
    public final int getValue() {
        return this.f39038a;
    }
}
