package p073f;

import com.transsnet.mtn.sdk.MTN;
import com.transsnet.palmpay.core.util.PayStringUtils$OperatorType;
import p349x8.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f36324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f36325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f36326g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36330d;

    static {
        int i7 = c.mtn_mtn_logo_my_mtn;
        a aVar = new a("MTN_NG", 0, "My MTN", i7, MTN.MTN_NG, "MTN_NG");
        f36324e = aVar;
        a aVar2 = new a("MTN_", 1, PayStringUtils$OperatorType.MTN, i7, MTN.MTN, PayStringUtils$OperatorType.MTN);
        f36325f = aVar2;
        f36326g = new a[]{aVar, aVar2};
    }

    public a(String str, int i7, String str2, int i10, String str3, String str4) {
        super(str, i7);
        this.f36327a = str2;
        this.f36328b = i10;
        this.f36329c = str3;
        this.f36330d = str4;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f36326g.clone();
    }
}
