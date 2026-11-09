package p206nd;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 nd.b[], still in use, count: 1, list:
  (r0v1 nd.b[]) from 0x006e: INVOKE (r0v1 nd.b[]) STATIC call: com.facebook.imagepipeline.nativecode.b.n(java.lang.Enum[]):Gf.a A[MD:(java.lang.Enum[]):Gf.a (m)] (LINE:111)
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
public final class b {
    ALL(0, "Search Mobile/PalmPay Tag/QR Card No./Agent Account/Email/Facebook Name"),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE(1, "Search Mobile Number eg. 081 0000 0000"),
    /* JADX INFO: Fake field, exist only in values array */
    EMAIL(2, "Search Email Address eg. palmpay@gmail.com"),
    /* JADX INFO: Fake field, exist only in values array */
    PALMPAY_TAG(3, "Search PalmPay Tag eg. @yourFriendsTag"),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_NAME(4, "Search Facebook name eg. PalmPay NG"),
    /* JADX INFO: Fake field, exist only in values array */
    QR_ACCOUNT_NUMBER(5, "Search QR card number eg. 7700 0000 00"),
    /* JADX INFO: Fake field, exist only in values array */
    PARTNER_NUMBER(6, "Search agent account eg. 95500 00000"),
    /* JADX INFO: Fake field, exist only in values array */
    MERCHANT_NUMBER(7, "Search PalmPay merchant"),
    /* JADX INFO: Fake field, exist only in values array */
    JOINT_ABC(8, "Search PalmPay merchant"),
    /* JADX INFO: Fake field, exist only in values array */
    PP_ACCOUNT_NO(10, "Search PalmPay Account No.");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39930c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39934b;

    static {
        com.facebook.imagepipeline.nativecode.b.n(bVarArr);
        f39930c = new a(null);
    }

    public b(int i7, String str) {
        super(str, i);
        this.f39933a = i7;
        this.f39934b = str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f39932e.clone();
    }
}
