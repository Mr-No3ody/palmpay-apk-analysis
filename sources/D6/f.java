package D6;

import com.horcrux.svg.d0;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f1623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f1624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f1625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f1626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f1627g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f1628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f1629j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f1630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f1631p;
    public static final f t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ f[] f1632v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1634b;

    static {
        LanguageManager$Companion languageManager$Companion = p280s6.a.f42044a;
        f fVar = new f("FaceModuleNotAvailable", 0, FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE, d0.o(languageManager$Companion, "smart_face_module_not_available"));
        f1623c = fVar;
        f fVar2 = new f("FaceModuleInstallPending", 1, "2", d0.o(languageManager$Companion, "smart_face_module_install_pending"));
        f1624d = fVar2;
        f fVar3 = new f("FaceModuleInstallTimeOut", 2, "3", d0.o(languageManager$Companion, "smart_face_module_install_timeOut"));
        f1625e = fVar3;
        f fVar4 = new f("PermissionNotSupport", 3, "4", d0.o(languageManager$Companion, "camera_permission_rationale"));
        f1626f = fVar4;
        f fVar5 = new f("LiveIDNotInit", 4, AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE, d0.o(languageManager$Companion, "smart_ease_id_not_init"));
        f1627g = fVar5;
        f fVar6 = new f("Cancel", 5, "5", d0.o(languageManager$Companion, "smart_cancel"));
        f1628i = fVar6;
        f fVar7 = new f("Unknown", 6, "-99", d0.o(languageManager$Companion, "processing_error_subtitle"));
        f1629j = fVar7;
        languageManager$Companion.getInstance().getClass();
        f fVar8 = new f("CameraError", 7, "-98", p280s6.a.a("processing_error_unknown").concat("[-98]"));
        f1630o = fVar8;
        languageManager$Companion.getInstance().getClass();
        f fVar9 = new f("AnalyzeImageError", 8, "-97", p280s6.a.a("processing_error_unknown").concat("[-97]"));
        f1631p = fVar9;
        languageManager$Companion.getInstance().getClass();
        f fVar10 = new f("CaptureImageError", 9, "-96", p280s6.a.a("processing_error_unknown").concat("[-96]"));
        t = fVar10;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        f1632v = fVarArr;
        com.facebook.imagepipeline.nativecode.b.n(fVarArr);
    }

    public f(String str, int i7, String str2, String str3) {
        super(str, i7);
        this.f1633a = str2;
        this.f1634b = str3;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f1632v.clone();
    }
}
