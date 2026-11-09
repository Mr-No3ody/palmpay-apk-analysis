package D6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 D6.h[], still in use, count: 1, list:
  (r0v1 D6.h[]) from 0x009a: INVOKE (r0v1 D6.h[]) STATIC call: com.facebook.imagepipeline.nativecode.b.n(java.lang.Enum[]):Gf.a A[MD:(java.lang.Enum[]):Gf.a (m)] (LINE:155)
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
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    InitialInstruction("smart_selfie_instructions"),
    Capturing("smart_selfie_directive_capturing"),
    EnsureFaceInFrame("smart_selfie_directive_unable_to_detect_face"),
    SquarelyFaceInFrame("smart_selfie_squarely_face_in_camera"),
    MoveCloser("smart_selfie_directive_face_too_far"),
    MoveAway("smart_selfie_directive_face_too_close"),
    Smile("smart_selfie_directive_smile"),
    Blink("smart_selfie_directive_blink"),
    Mouth("smart_selfie_directive_mouth_open"),
    NodHead("smart_selfie_directive_nod"),
    ShakeHead("smart_selfie_directive_shake"),
    HoldOn("smart_selfie_directive_hold_on");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1652a;

    static {
        com.facebook.imagepipeline.nativecode.b.n(hVarArr);
    }

    public h(String str) {
        super(str, i);
        this.f1652a = str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f1651w.clone();
    }
}
