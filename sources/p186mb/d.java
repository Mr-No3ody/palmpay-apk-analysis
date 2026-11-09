package p186mb;

import Pa.C0525w;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.credit.bean.KingKongContentInfo;
import com.transsnet.palmpay.credit.bean.LoanHomeBottomInfo;
import com.transsnet.palmpay.credit.bean.LoanHomeThemeInfo;
import com.transsnet.palmpay.credit.bean.style.StyleConfigMap;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f39634e = new c(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f39635f = C2131j.a(EnumC2132k.f43969a, new p171lb.d(21));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LoanHomeBottomInfo f39636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LoanHomeThemeInfo f39637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f39638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StyleConfigMap f39639d;

    public final void a(Map map) {
        if (map != null) {
            try {
                C0525w c0525wF = C0525w.f();
                String str = (String) map.get("APP_MAIN_CONFIG_250715");
                c0525wF.getClass();
                LoanHomeBottomInfo loanHomeBottomInfo = (LoanHomeBottomInfo) C0525w.d(str, LoanHomeBottomInfo.class);
                if (loanHomeBottomInfo != null) {
                    this.f39636a = loanHomeBottomInfo;
                }
                C0525w c0525wF2 = C0525w.f();
                String str2 = (String) map.get("MAIN_LOAN_STYLE_CONFIG_GT690");
                c0525wF2.getClass();
                LoanHomeThemeInfo loanHomeThemeInfo = (LoanHomeThemeInfo) C0525w.d(str2, LoanHomeThemeInfo.class);
                if (loanHomeThemeInfo != null) {
                    this.f39637b = loanHomeThemeInfo;
                }
                ArrayList arrayList = (ArrayList) ((Gson) C0525w.f().f7166b).fromJson((String) map.get("MAIN_LOAN_ACTIVITY_CONFIG"), new TypeToken<ArrayList<KingKongContentInfo>>() { // from class: com.transsnet.palmpay.credit.manager.LoanBusinessConfigManager$save$1$3
                }.getType());
                if (arrayList != null) {
                    this.f39638c = arrayList;
                }
                String str3 = (String) map.get("MAIN_LOAN_STYLE_CONFIG_HIRE_PURCHASE_0610");
                if (str3 == null && (str3 = (String) map.get("MAIN_LOAN_STYLE_CONFIG_HIRE_PURCHASE_0520")) == null) {
                    str3 = (String) map.get("MAIN_LOAN_STYLE_CONFIG_HIRE_PURCHASE");
                }
                C0525w.f().getClass();
                StyleConfigMap styleConfigMap = (StyleConfigMap) C0525w.d(str3, StyleConfigMap.class);
                if (styleConfigMap != null) {
                    this.f39639d = styleConfigMap;
                    Unit unit = Unit.f38893a;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                Unit unit2 = Unit.f38893a;
            }
        }
    }
}
