package p191mg;

import Gf.a;
import com.facebook.imagepipeline.nativecode.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mg.s[], still in use, count: 1, list:
  (r0v1 mg.s[]) from 0x0036: INVOKE (r0v1 mg.s[]) STATIC call: com.facebook.imagepipeline.nativecode.b.n(java.lang.Enum[]):Gf.a A[MD:(java.lang.Enum[]):Gf.a (m), WRAPPED] (LINE:55)
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
public final class s {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f39765i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f39766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f39767b;

    static {
        f39765i = b.n(sVarArr);
    }

    public s(char c6, char c10) {
        super(str, i);
        this.f39766a = c6;
        this.f39767b = c10;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f39764g.clone();
    }
}
