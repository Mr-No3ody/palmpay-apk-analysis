package Pa;

import B6.ViewOnClickListenerC0087i;
import N8.C0469m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.core.bean.CommonErrorResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.EncryptUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: renamed from: Pa.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0521s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0521s f7158a = new C0521s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p355xf.t f7159b = C2131j.b(new La.i(29));

    public static boolean a(String str) {
        long jLongValue;
        String strE = e(str);
        String strD = d(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!c().containsKey(strE)) {
            c().put(strE, Long.valueOf(p059e1.a.E(jCurrentTimeMillis, strE)));
        }
        Long l5 = (Long) c().get(strE);
        long jLongValue2 = l5 != null ? l5.longValue() : 0L;
        if (c().containsKey(strD)) {
            Long l6 = (Long) c().get(strD);
            jLongValue = l6 != null ? l6.longValue() : 0L;
        } else {
            jLongValue = 1;
        }
        StringBuilder sb2 = new StringBuilder("checkValidationCheck: ");
        sb2.append(str);
        sb2.append(" nextShow:");
        sb2.append(jLongValue2);
        androidx.camera.video.u.v(sb2, " now:", jCurrentTimeMillis, " leftShowCount:");
        sb2.append(jLongValue);
        F6.d.h("Dialog", 3, sb2.toString());
        return jLongValue2 <= jCurrentTimeMillis && jLongValue > 0;
    }

    public static void b() {
        c().clear();
        SPUtils.getInstance("dialog").clear();
    }

    public static HashMap c() {
        return (HashMap) f7159b.getValue();
    }

    public static String d(String str) {
        return e(str) + "-" + r0.U(System.currentTimeMillis());
    }

    public static String e(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = EncryptUtils.encryptMD5ToString(Uri.parse(str).getPath());
        }
        return C0.G.o("dialog_sp_", str);
    }

    public static void f(String str) {
        C0.G.z("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_RESET_PIN, "_number", str);
    }

    public static O6.d g(Activity activity, String str, CommonErrorResult commonErrorResult) {
        long jMin;
        if (TextUtils.isEmpty(str) || activity == null || commonErrorResult == null) {
            return null;
        }
        String strE = e(str);
        String strD = d(str);
        Long l5 = (Long) c().get(strE);
        long jLongValue = l5 != null ? l5.longValue() : 0L;
        if (c().containsKey(strD)) {
            Long l6 = (Long) c().get(strD);
            jMin = l6 != null ? l6.longValue() : 0L;
        } else {
            jMin = Long.min(p059e1.a.E(Long.MAX_VALUE, strD), commonErrorResult.showCount);
        }
        if (jLongValue > System.currentTimeMillis() || jMin <= 0) {
            long j6 = commonErrorResult.showCount;
            StringBuilder sb2 = new StringBuilder("handleCommonErrorDialogResult: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(jLongValue);
            androidx.camera.video.u.v(sb2, " ", jMin, "/");
            sb2.append(j6);
            F6.d.h("Dialog", 3, sb2.toString());
            return null;
        }
        HashMap map = new HashMap();
        map.put("Url", str);
        map.put("Strategy", String.valueOf(commonErrorResult.strategy));
        int i7 = commonErrorResult.strategy;
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            n0.g().w("PopUp_View", map);
            Intent intentA = F.a(activity, commonErrorResult.androidForceJumpLink);
            if (intentA != null) {
                ActivityUtils.startActivity(intentA);
            }
            long jCurrentTimeMillis = (commonErrorResult.showInterval * ((long) 60) * 1000) + System.currentTimeMillis();
            c().put(strE, Long.valueOf(jCurrentTimeMillis));
            p059e1.a.V(jCurrentTimeMillis, strE);
            long j10 = jMin > 0 ? jMin - 1 : 0L;
            c().put(strD, Long.valueOf(j10));
            p059e1.a.V(j10, strD);
            return null;
        }
        O6.c cVar = new O6.c(activity);
        cVar.f6596b = O6.d.f(commonErrorResult.title);
        cVar.f6598d = commonErrorResult.message;
        if (commonErrorResult.strategy == 2 && !TextUtils.isEmpty(commonErrorResult.ignoreBtnText)) {
            String str2 = commonErrorResult.ignoreBtnText;
            ViewOnClickListenerC0087i viewOnClickListenerC0087i = new ViewOnClickListenerC0087i(map, 19, commonErrorResult, activity);
            cVar.f6601g = str2;
            cVar.f6603i = viewOnClickListenerC0087i;
        }
        if (!TextUtils.isEmpty(commonErrorResult.jumpBtnText)) {
            map.put("JumpBtnText", commonErrorResult.jumpBtnText);
            map.put("JumpUrl", commonErrorResult.jumpBtnAndroidLink);
            n0.g().n("PopUp_JumpBtn_Click", map);
            String str3 = commonErrorResult.jumpBtnText;
            Oc.j jVar = new Oc.j(6, activity, commonErrorResult);
            cVar.f6600f = str3;
            cVar.f6602h = jVar;
        }
        cVar.f6605k = commonErrorResult.strategy == 1;
        cVar.f6604j = new Nc.x(map, 11);
        O6.d dVarA = cVar.a();
        if (commonErrorResult.strategy == 1) {
            dVarA.setCancelable(false);
            dVarA.setCanceledOnTouchOutside(false);
        }
        dVarA.setOnCancelListener(new Da.j(map, 2));
        dVarA.show();
        long jCurrentTimeMillis2 = (commonErrorResult.showInterval * ((long) 60) * 1000) + System.currentTimeMillis();
        c().put(strE, Long.valueOf(jCurrentTimeMillis2));
        p059e1.a.V(jCurrentTimeMillis2, strE);
        long j11 = jMin > 0 ? jMin - 1 : 0L;
        c().put(strD, Long.valueOf(j11));
        p059e1.a.V(j11, strD);
        return dVarA;
    }

    public static O6.d h(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || activity == null) {
            return null;
        }
        return g(activity, str, (CommonErrorResult) com.horcrux.svg.d0.l(CommonErrorResult.class, str2));
    }

    public static void i(Context context) {
        O6.c cVar = new O6.c(context);
        cVar.e(p025ba.k.core_tips);
        cVar.b(p025ba.k.core_enroll_fingerprints_first);
        cVar.d(p025ba.k.core_enroll, new K8.a(15));
        cVar.c(p025ba.k.core_cancel, null);
        cVar.g();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean k(final androidx.fragment.app.E e10, CommonResult result, String str, final boolean z3, final Function0 function0) {
        String respCode;
        O6.c cVar;
        int i7;
        O6.c cVar2;
        int i10;
        Intrinsics.checkNotNullParameter(result, "result");
        final kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        f10.f38951a = str;
        if (TextUtils.isEmpty(str)) {
            f10.f38951a = C0.G.A();
        }
        if (e10 == null || (respCode = result.getRespCode()) == null) {
            return false;
        }
        switch (respCode.hashCode()) {
            case -1500329102:
                if (!respCode.equals("CMPW0001")) {
                    return false;
                }
                cVar = new O6.c(e10);
                cVar.e(p025ba.k.core_failed_all_cap);
                cVar.f6598d = result.getRespMsg();
                cVar.f6605k = true;
                if (z3 != 0) {
                    i7 = p025ba.k.core_forgot_psw;
                } else {
                    i7 = p025ba.k.core_forgot_pin;
                }
                final int i11 = 0;
                cVar.c(i7, new View.OnClickListener() { // from class: Pa.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        androidx.fragment.app.E e11 = e10;
                        boolean z8 = z3;
                        kotlin.jvm.internal.F f11 = f10;
                        Function0 function1 = function0;
                        switch (i11) {
                            case 0:
                                if (function1 == null) {
                                    C0521s c0521s = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                            default:
                                if (function1 == null) {
                                    C0521s c0521s2 = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                        }
                    }
                });
                cVar.d(p025ba.k.core_confirm, null);
                if (z3 != 0) {
                    cVar.f6614u = 2;
                }
                cVar.g();
                return true;
            case -1500329101:
                if (!respCode.equals("CMPW0002")) {
                    return false;
                }
                cVar = new O6.c(e10);
                cVar.e(p025ba.k.core_failed_all_cap);
                cVar.f6598d = result.getRespMsg();
                cVar.f6605k = true;
                if (z3 != 0) {
                    i7 = p025ba.k.core_forgot_psw;
                } else {
                    i7 = p025ba.k.core_forgot_pin;
                }
                final int i12 = 0;
                cVar.c(i7, new View.OnClickListener() { // from class: Pa.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        androidx.fragment.app.E e11 = e10;
                        boolean z8 = z3;
                        kotlin.jvm.internal.F f11 = f10;
                        Function0 function1 = function0;
                        switch (i12) {
                            case 0:
                                if (function1 == null) {
                                    C0521s c0521s = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                            default:
                                if (function1 == null) {
                                    C0521s c0521s2 = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                        }
                    }
                });
                cVar.d(p025ba.k.core_confirm, null);
                if (z3 != 0) {
                    cVar.f6614u = 2;
                }
                cVar.g();
                return true;
            case -1500329100:
                if (!respCode.equals("CMPW0003")) {
                    return false;
                }
                cVar = new O6.c(e10);
                cVar.e(p025ba.k.core_failed_all_cap);
                cVar.f6598d = result.getRespMsg();
                cVar.f6605k = true;
                if (z3 != 0) {
                    i7 = p025ba.k.core_forgot_psw;
                } else {
                    i7 = p025ba.k.core_forgot_pin;
                }
                final int i13 = 0;
                cVar.c(i7, new View.OnClickListener() { // from class: Pa.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        androidx.fragment.app.E e11 = e10;
                        boolean z8 = z3;
                        kotlin.jvm.internal.F f11 = f10;
                        Function0 function1 = function0;
                        switch (i13) {
                            case 0:
                                if (function1 == null) {
                                    C0521s c0521s = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                            default:
                                if (function1 == null) {
                                    C0521s c0521s2 = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                        }
                    }
                });
                cVar.d(p025ba.k.core_confirm, null);
                if (z3 != 0) {
                    cVar.f6614u = 2;
                }
                cVar.g();
                return true;
            case -1500329099:
                if (!respCode.equals("CMPW0004")) {
                    return false;
                }
                cVar2 = new O6.c(e10);
                cVar2.e(p025ba.k.core_failed_all_cap);
                cVar2.f6598d = result.getRespMsg();
                cVar2.f6605k = true;
                if (z3) {
                    i10 = p025ba.k.core_forgot_psw;
                } else {
                    i10 = p025ba.k.core_forgot_pin;
                }
                final int i14 = 1;
                cVar2.d(i10, new View.OnClickListener() { // from class: Pa.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        androidx.fragment.app.E e11 = e10;
                        boolean z8 = z3;
                        kotlin.jvm.internal.F f11 = f10;
                        Function0 function1 = function0;
                        switch (i14) {
                            case 0:
                                if (function1 == null) {
                                    C0521s c0521s = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                            default:
                                if (function1 == null) {
                                    C0521s c0521s2 = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                        }
                    }
                });
                cVar2.c(p025ba.k.core_confirm, null);
                if (z3) {
                    cVar2.f6614u = 2;
                }
                cVar2.g();
                return true;
            case -1500329098:
                if (!respCode.equals("CMPW0005")) {
                    return false;
                }
                cVar = new O6.c(e10);
                cVar.e(p025ba.k.core_failed_all_cap);
                cVar.f6598d = result.getRespMsg();
                cVar.f6605k = true;
                if (z3 != 0) {
                    i7 = p025ba.k.core_forgot_psw;
                } else {
                    i7 = p025ba.k.core_forgot_pin;
                }
                final int i15 = 0;
                cVar.c(i7, new View.OnClickListener() { // from class: Pa.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        androidx.fragment.app.E e11 = e10;
                        boolean z8 = z3;
                        kotlin.jvm.internal.F f11 = f10;
                        Function0 function1 = function0;
                        switch (i15) {
                            case 0:
                                if (function1 == null) {
                                    C0521s c0521s = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                            default:
                                if (function1 == null) {
                                    C0521s c0521s2 = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                        }
                    }
                });
                cVar.d(p025ba.k.core_confirm, null);
                if (z3 != 0) {
                    cVar.f6614u = 2;
                }
                cVar.g();
                return true;
            case -1500329097:
                if (!respCode.equals("CMPW0006")) {
                    return false;
                }
                cVar = new O6.c(e10);
                cVar.e(p025ba.k.core_failed_all_cap);
                cVar.f6598d = result.getRespMsg();
                cVar.f6605k = true;
                if (z3 != 0) {
                    i7 = p025ba.k.core_forgot_psw;
                } else {
                    i7 = p025ba.k.core_forgot_pin;
                }
                final int i16 = 0;
                cVar.c(i7, new View.OnClickListener() { // from class: Pa.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        androidx.fragment.app.E e11 = e10;
                        boolean z8 = z3;
                        kotlin.jvm.internal.F f11 = f10;
                        Function0 function1 = function0;
                        switch (i16) {
                            case 0:
                                if (function1 == null) {
                                    C0521s c0521s = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                            default:
                                if (function1 == null) {
                                    C0521s c0521s2 = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                        }
                    }
                });
                cVar.d(p025ba.k.core_confirm, null);
                if (z3 != 0) {
                    cVar.f6614u = 2;
                }
                cVar.g();
                return true;
            case -1500329096:
                if (!respCode.equals("CMPW0007")) {
                    return false;
                }
                cVar = new O6.c(e10);
                cVar.e(p025ba.k.core_failed_all_cap);
                cVar.f6598d = result.getRespMsg();
                cVar.f6605k = true;
                if (z3 != 0) {
                    i7 = p025ba.k.core_forgot_psw;
                } else {
                    i7 = p025ba.k.core_forgot_pin;
                }
                final int i17 = 0;
                cVar.c(i7, new View.OnClickListener() { // from class: Pa.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        androidx.fragment.app.E e11 = e10;
                        boolean z8 = z3;
                        kotlin.jvm.internal.F f11 = f10;
                        Function0 function1 = function0;
                        switch (i17) {
                            case 0:
                                if (function1 == null) {
                                    C0521s c0521s = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                            default:
                                if (function1 == null) {
                                    C0521s c0521s2 = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                        }
                    }
                });
                cVar.d(p025ba.k.core_confirm, null);
                if (z3 != 0) {
                    cVar.f6614u = 2;
                }
                cVar.g();
                return true;
            case -1500329095:
                if (!respCode.equals("CMPW0008")) {
                    return false;
                }
                cVar2 = new O6.c(e10);
                cVar2.e(p025ba.k.core_failed_all_cap);
                cVar2.f6598d = result.getRespMsg();
                cVar2.f6605k = true;
                if (z3) {
                    i10 = p025ba.k.core_forgot_psw;
                } else {
                    i10 = p025ba.k.core_forgot_pin;
                }
                final int i18 = 1;
                cVar2.d(i10, new View.OnClickListener() { // from class: Pa.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        androidx.fragment.app.E e11 = e10;
                        boolean z8 = z3;
                        kotlin.jvm.internal.F f11 = f10;
                        Function0 function1 = function0;
                        switch (i18) {
                            case 0:
                                if (function1 == null) {
                                    C0521s c0521s = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                            default:
                                if (function1 == null) {
                                    C0521s c0521s2 = C0521s.f7158a;
                                    if (z8) {
                                        N8.q0.v("/main/sub_settings", "pageId", "4");
                                    } else {
                                        C0521s.f((String) f11.f38951a);
                                    }
                                    if (e11 != null) {
                                        e11.finish();
                                    }
                                } else {
                                    function1.invoke();
                                }
                                break;
                        }
                    }
                });
                cVar2.c(p025ba.k.core_confirm, null);
                if (z3) {
                    cVar2.f6614u = 2;
                }
                cVar2.g();
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean l(C0521s c0521s, androidx.fragment.app.E e10, CommonResult commonResult, String str, C0469m c0469m, int i7) {
        if ((i7 & 16) != 0) {
            c0469m = null;
        }
        c0521s.getClass();
        return k(e10, commonResult, str, false, c0469m);
    }

    public final boolean j(androidx.fragment.app.E e10, CommonResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return l(this, e10, result, null, null, 24);
    }
}
