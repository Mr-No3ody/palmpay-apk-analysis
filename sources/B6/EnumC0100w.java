package B6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 B6.w[], still in use, count: 1, list:
  (r0v1 B6.w[]) from 0x0073: INVOKE (r0v1 B6.w[]) STATIC call: com.facebook.imagepipeline.nativecode.b.n(java.lang.Enum[]):Gf.a A[MD:(java.lang.Enum[]):Gf.a (m)] (LINE:116)
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
/* JADX INFO: renamed from: B6.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0100w {
    InitialInstruction("smart_selfie_instructions"),
    EnsureFaceInFrame("smart_selfie_directive_unable_to_detect_face"),
    MoveCloser("smart_selfie_directive_face_too_far"),
    MoveAway("smart_selfie_directive_face_too_close"),
    Blink("smart_selfie_directive_blink"),
    Mouth("smart_selfie_directive_mouth_open"),
    NodHead("smart_selfie_directive_nod"),
    ShakeHead("smart_selfie_directive_shake"),
    HoldOn("smart_selfie_directive_hold_on");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f534a;

    static {
        com.facebook.imagepipeline.nativecode.b.n(enumC0100wArr);
    }

    public EnumC0100w(String str) {
        super(str, i);
        this.f534a = str;
    }

    public static EnumC0100w valueOf(String str) {
        return (EnumC0100w) Enum.valueOf(EnumC0100w.class, str);
    }

    public static EnumC0100w[] values() {
        return (EnumC0100w[]) f533p.clone();
    }
}
