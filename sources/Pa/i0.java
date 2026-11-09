package Pa;

import N8.ViewOnClickListenerC0468l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.maps.android.BuildConfig;
import com.luck.picture.lib.config.FileSizeUnit;
import com.palmpay.lib.webview.container.PPWebActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f7095a;

    public static int A(int i7) {
        if (i7 == 1) {
            return com.transsnet.palmpay.custom_view.r.cv_order_result_processing_40;
        }
        if (i7 == 2) {
            return com.transsnet.palmpay.custom_view.r.cv_order_result_success_40;
        }
        return i7 == 3 ? com.transsnet.palmpay.custom_view.r.cv_order_result_fail_40 : com.transsnet.palmpay.custom_view.r.cv_check_gray;
    }

    public static Intent B(String str) {
        if (!TextUtils.isEmpty(str) && RegexUtils.isURL(str)) {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                return u(str);
            }
            if (!r0.Y0(str)) {
                return IntentUtils.getOpenUrlIntent(str, true);
            }
            if (!p267r9.a.f41645a.a()) {
                ToastUtils.showLong(BaseApplication.get().getString(p025ba.k.core_no_webview_installed));
                return null;
            }
            try {
                Postcard postcardBuild = ARouter.getInstance().build("/common/webview");
                LogisticsCenter.completion(postcardBuild);
                Intent intent = new Intent(BaseApplication.getContext(), postcardBuild.getDestination());
                intent.putExtra("linkUrl", str);
                intent.putExtra("url", str);
                intent.putExtra(PPWebActivity.KEY_WEB_NAV_BAR, "true");
                return intent;
            } catch (Exception e10) {
                F6.d.c("SomeUtil", "buildIntentWithLinkUrl: ", e10);
            }
        }
        return null;
    }

    public static String C(int i7, String str, String str2) {
        Application application = BaseApplication.getApplication();
        if (TextUtils.isEmpty(str) || application == null) {
            return "";
        }
        if (i7 == 0) {
            return application.getString(p025ba.k.core_one_time_code_sent_to_phone, r0.Y(str));
        }
        if (i7 == 1) {
            return application.getString(p025ba.k.core_voice_call_code_sent_to_phone, r0.Y(str));
        }
        if (i7 == 2) {
            return application.getString(p025ba.k.core_one_time_code_sent_to_whatsapp, r0.Y(str));
        }
        if (i7 != 3) {
            return i7 != 4 ? application.getString(p025ba.k.core_one_time_code_sent_to_phone, r0.Y(str)) : application.getString(p025ba.k.core_ussd_otp_tips);
        }
        return application.getString(p025ba.k.core_one_time_code_sent_to_email, str2);
    }

    public static String D(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 4) {
            return "";
        }
        return d0(str) ? str.substring(r0.K().length(), str.length()) : str;
    }

    public static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() <= 2 ? str : str.replaceAll("(.{4})(.{4})", "$1 $2 ");
    }

    public static String F(String str) {
        try {
            if (str.startsWith("R_")) {
                str = str.substring(2);
            }
            return str.substring(0, 2);
        } catch (Exception e10) {
            F6.d.c("SomeUtil", "getTransTypeByPayId: ", e10);
            return "";
        }
    }

    public static void G(Class cls) {
        try {
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack(cls.getName());
            Intent intent = new Intent();
            intent.setClassName(AppUtils.getAppPackageName(), cls.getName());
            if (activityIsActivityExistsInStack != null) {
                intent.setFlags(67239936);
                activityIsActivityExistsInStack.startActivity(intent);
                return;
            }
            Activity activityIsActivityExistsInStack2 = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
            if (activityIsActivityExistsInStack2 != null) {
                ActivityUtils.finishToActivity(activityIsActivityExistsInStack2, false);
            }
            intent.addFlags(268435456);
            BaseApplication.get().startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void H(String str) {
        try {
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.get().getPackageName(), "com.transsnet.palmpay.ui.activity.HomeActivity");
            if (activityIsActivityExistsInStack != null) {
                intent.setFlags(67239936);
                activityIsActivityExistsInStack.startActivity(intent);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("extra_type", str);
            }
            intent.addFlags(268435456);
            BaseApplication.get().startActivity(intent);
            ActivityUtils.finishAllActivities();
        } catch (Exception e10) {
            F6.d.c("SomeUtil", "goBackToHome", e10);
        }
    }

    public static void I(String str) {
        if (TextUtils.isEmpty(str)) {
            H(null);
            return;
        }
        try {
            Activity activityS = S(str);
            if (activityS != null) {
                ActivityUtils.finishToActivity(activityS, false);
                return;
            }
        } catch (Exception e10) {
            F6.d.c("SomeUtil", "goBackToPage: ", e10);
        }
        H(null);
    }

    public static void J(String str, String str2, String str3, String str4) {
        StringBuilder sbF = androidx.camera.camera2.internal.F.f("orderType=", str, "&orderNo=", str2, "&paymentMethod=");
        sbF.append(Uri.encode(str3));
        sbF.append("&paymentType=");
        sbF.append(Uri.encode(str4));
        a0(sbF.toString());
    }

    public static void K(String str, String str2) {
        try {
            A.a();
            Intent intent = new Intent();
            String str3 = TextUtils.isEmpty(y()) ? "com.transsnet.palmpay.account.ui.activity.SignUpActivity" : "com.transsnet.palmpay.account.ui.activity.LogInActivity";
            intent.setClassName(BaseApplication.getContext(), str3);
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack(str3);
            intent.putExtra("extra_data", BaseApplication.getCountryLocale());
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("extra_note", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("business_path", str2);
            }
            if (activityIsActivityExistsInStack == null || activityIsActivityExistsInStack.isFinishing()) {
                ActivityUtils.startActivity(intent);
            } else {
                intent.addFlags(131072);
                activityIsActivityExistsInStack.startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    public static void L(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + AppUtils.getAppPackageName()));
        ActivityUtils.startActivity(intent);
    }

    public static void M(Activity activity, OrderInfoForCustomerService orderInfoForCustomerService) {
        if (orderInfoForCustomerService == null) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/echat");
            return;
        }
        if (TextUtils.isEmpty(orderInfoForCustomerService.faqUrl)) {
            if (activity instanceof BaseActivity) {
                ((BaseActivity) activity).showLoadingDialog(true);
            }
            GetCustomerServiceUrlReq getCustomerServiceUrlReqBuildGetCustomerServiceUrlReq = orderInfoForCustomerService.buildGetCustomerServiceUrlReq();
            ((PayApiService) p324va.c.f43141a.f14621b).getCustomerServiceUrl(getCustomerServiceUrlReqBuildGetCustomerServiceUrlReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new N8.r(1, activity, getCustomerServiceUrlReqBuildGetCustomerServiceUrlReq));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_data", orderInfoForCustomerService);
        bundle.putString(PPWebActivity.KEY_WEB_NAV_BAR, "true");
        com.palmpay.lib.apm.launchcounter.util.d.P(bundle, a(orderInfoForCustomerService.faqUrl, orderInfoForCustomerService));
    }

    public static void N(OrderInfoForCustomerService orderInfoForCustomerService) {
        if (TextUtils.isEmpty(orderInfoForCustomerService.feedbackLink)) {
            ToastUtils.showLong(p025ba.k.core_faq_link_error);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_data", orderInfoForCustomerService);
        bundle.putString(PPWebActivity.KEY_WEB_NAV_BAR, "true");
        com.palmpay.lib.apm.launchcounter.util.d.P(bundle, a(orderInfoForCustomerService.feedbackLink, orderInfoForCustomerService));
    }

    public static void O(Context context) {
        P(context, AppUtils.getAppPackageName());
    }

    public static void P(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=" + str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            F6.d.c("SomeUtil", "gotoGooglePlay: ", e10);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("http://play.google.com/store/apps/details?id=" + str));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        }
    }

    public static void Q(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        F6.d.h("SomeUtil", 3, C0.G.o("handleFcmToken fcmToken = ", str));
        p367ya.a.d().getClass();
        p059e1.a.W("fcm_sp_fcm_token", str);
        T.b(-4).execute(new RunnableC0527y(1));
    }

    public static String R(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("@")) {
            return "";
        }
        int iIndexOf = str.indexOf("@");
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf);
        if (strSubstring.length() > 3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strSubstring.substring(0, 3));
            int length = strSubstring.length() - 3;
            StringBuilder sb3 = new StringBuilder();
            for (int i7 = 0; i7 < length; i7++) {
                sb3.append("*");
            }
            sb2.append(sb3.toString());
            strSubstring = sb2.toString();
        }
        return N8.q0.j(strSubstring, strSubstring2);
    }

    public static Activity S(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Postcard postcardBuild = ARouter.getInstance().build(str);
            LogisticsCenter.completion(postcardBuild);
            return ActivityUtils.isActivityExistsInStack(postcardBuild.getDestination().getName());
        } catch (Exception e10) {
            F6.d.c("SomeUtil", "isActivityExistsInStack: ", e10);
            return null;
        }
    }

    public static boolean T() {
        return U(BaseApplication.get().getResources());
    }

    public static boolean U(Resources resources) {
        if (resources == null || !r0.T0()) {
            return false;
        }
        if (r0.V0()) {
            return (resources.getConfiguration().uiMode & 48) == 32;
        }
        return r0.Z0();
    }

    public static boolean V(View view) {
        if (view == null) {
            return false;
        }
        return U(view.getResources());
    }

    public static boolean W(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static boolean X(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return X(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static String Y(String str) {
        return BuildConfig.TRAVIS.equals(str) ? "" : str;
    }

    public static void Z(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("cash://main/home?tab=home&from=palmpay"));
            if (intent.resolveActivity(BaseApplication.get().getPackageManager()) != null) {
                context.startActivity(intent);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String a(String str, OrderInfoForCustomerService orderInfoForCustomerService) {
        if (TextUtils.isEmpty(str) || orderInfoForCustomerService == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (str.contains("?")) {
            sb2.append("&paymentType=");
        } else {
            sb2.append("?paymentType=");
        }
        sb2.append(Uri.encode(orderInfoForCustomerService.paymentType));
        sb2.append("&paymentMethod=");
        sb2.append(Uri.encode(orderInfoForCustomerService.paymentMethod));
        if (!str.contains("transType=")) {
            sb2.append("&transType=");
            sb2.append(orderInfoForCustomerService.transType);
        }
        if (!str.contains("orderStatusDesc=")) {
            sb2.append("&orderStatusDesc=");
            sb2.append(orderInfoForCustomerService.orderStatus);
        }
        if (!str.contains("amount=")) {
            sb2.append("&amount=");
            sb2.append(String.valueOf(orderInfoForCustomerService.amount));
        }
        if (!str.contains("time=")) {
            sb2.append("&time=");
            sb2.append(String.valueOf(orderInfoForCustomerService.time));
        }
        if (!str.contains("entryType=")) {
            sb2.append("&entryType=order");
        }
        return sb2.toString();
    }

    public static void a0(String str) {
        if (str.startsWith("?")) {
            str = str.substring(1);
        }
        StringBuilder sb2 = new StringBuilder("/merchant-dispute/dispute-submit.html?platform=c");
        sb2.append(str.startsWith("&") ? "" : "&");
        sb2.append(str);
        b0(sb2.toString());
    }

    public static boolean b() {
        for (Activity activity : ActivityUtils.getActivityList()) {
            if ((activity instanceof AbstractActivityC1479m) || (activity instanceof BaseCoreCashierPreviewActivity) || "com.transsnet.palmpay.credit.ui.activity.InstalmentsPreviewActivity".equals(activity.getClass().getName())) {
                return true;
            }
        }
        return false;
    }

    public static void b0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (RegexUtils.isURL(str)) {
            c0(str);
        } else {
            c0(com.transsnet.palmpay.core.config.d.g(str));
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 4) {
            str = str.substring(str.length() - 4, str.length());
        }
        return N8.q0.k("(**** ", str, ")");
    }

    public static void c0(String str) {
        Intent intentB = B(str);
        if (intentB != null) {
            ActivityUtils.startActivity(intentB);
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 5) {
            str = str.substring(str.length() - 5, str.length());
        }
        return N8.q0.k("(***** ", str, ")");
    }

    public static boolean d0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(r0.K()) && str.length() > 11;
    }

    public static String e(int i7, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > i7) {
            str = str.substring(str.length() - i7, str.length());
        }
        return N8.q0.k("(", str, ")");
    }

    public static String e0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.length() > 11) {
            str = str.substring(4);
        }
        if (str.length() <= 7) {
            return str;
        }
        return "(" + str.substring(0, 3) + " **** " + str.substring(str.length() - 4, str.length()) + ")";
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 12) {
            return str;
        }
        return str.substring(0, 12) + "...";
    }

    public static void f0(int i7, String str) {
        SPUtils.getInstance().put(str + "_" + i7, true, true);
    }

    public static String g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                return (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? "" : d(str2);
            }
            return f(str);
        }
        return f(str) + d(str2);
    }

    public static boolean g0(Context context, Intent intent) {
        return (context == null || intent == null || context.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) ? false : true;
    }

    public static String h(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return f(str) + c(str2);
        }
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return f(str);
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (str2.length() > 4) {
            str2 = str2.substring(str2.length() - 4, str2.length());
        }
        return C0.G.o("**** ", str2);
    }

    public static void h0(View view, int i7, int i10, int i11) {
        ((ViewGroup) view.getParent()).setClipChildren(false);
        float f10 = i11;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder().setAllCorners(new RoundedCornerTreatment()).setAllCornerSizes(SizeUtils.dp2px(f10)).build());
        materialShapeDrawable.setTint(i7);
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        materialShapeDrawable.initializeElevationOverlay(view.getContext());
        materialShapeDrawable.setShadowRadius(SizeUtils.dp2px(f10));
        materialShapeDrawable.setShadowColor(i10);
        view.setBackground(materialShapeDrawable);
    }

    public static String i(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbS = androidx.camera.video.u.s(str);
            sbS.append(e0(str2));
            return sbS.toString();
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? "" : e0(str2);
        }
        return str;
    }

    public static O6.d i0(Context context, String str, String str2, boolean z3) {
        O6.d dVarA;
        O6.c cVar = new O6.c(context);
        cVar.e(p025ba.k.core_opps);
        cVar.f6598d = str2;
        if ("CFRONT_800078".equals(str) || "33000039".equals(str)) {
            cVar.d(p025ba.k.core_upgrade_now, new K8.a(18));
            dVarA = cVar.a();
            dVarA.show();
        } else if ("CFRONT_800081".equals(str) || "33000040".equals(str)) {
            cVar.d(p025ba.k.core_upgrade_now, new K8.a(19));
            dVarA = cVar.a();
            dVarA.show();
        } else {
            if ("33000093".equals(str)) {
                cVar.f("Transactions over the Limit");
                K8.a aVar = new K8.a(20);
                cVar.f6600f = Constants.LOGTAG;
                cVar.f6602h = aVar;
                cVar.f6604j = new ViewOnClickListenerC0468l(z3, context, 2);
                cVar.f6605k = false;
                O6.d dVarA2 = cVar.a();
                dVarA2.setCanceledOnTouchOutside(false);
                dVarA2.show();
                return dVarA2;
            }
            cVar.d(p025ba.k.core_ok, null);
            dVarA = cVar.a();
            dVarA.show();
        }
        dVarA.setOnDismissListener(new h0(context, 0, z3));
        return dVarA;
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strReplace = str.replace(" ", "").replace("-", "");
        if (strReplace.length() == 10) {
            str = "0".concat(strReplace);
        }
        if (strReplace.length() <= 10) {
            return str;
        }
        return "0" + strReplace.subSequence(strReplace.length() - 10, strReplace.length()).toString();
    }

    public static void j0() {
        try {
            Intent intent = new Intent();
            intent.setClassName(AppUtils.getAppPackageName(), "com.transsnet.palmpay.ui.activity.HomeActivity");
            intent.addFlags(268435456);
            BaseApplication.get().startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String k(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.length() > 12) {
            str = str.substring(0, 12) + "...";
        }
        if (!TextUtils.isEmpty(str2)) {
            str2 = n(D(str2), false);
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return N8.q0.l(str, " (", str2, ")");
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        return str;
    }

    public static void k0() {
        r0.C1(BaseApplication.getContext());
    }

    public static boolean l() {
        Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
        if (activityIsActivityExistsInStack == null) {
            return false;
        }
        activityIsActivityExistsInStack.finish();
        return true;
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 11) {
            return str;
        }
        return str.substring(0, 4) + " " + str.substring(4, 7) + " " + str.substring(7);
    }

    public static String n(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.length() == 11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, 3));
            sb2.append(" ");
            if (z3) {
                sb2.append("****");
            } else {
                sb2.append(str.substring(3, 7));
            }
            sb2.append(" ");
            sb2.append(str.substring(7));
            return sb2.toString();
        }
        if (str.length() != 10 && str.length() != 9) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str.substring(0, 3));
        sb3.append(" ");
        if (z3) {
            sb3.append("***");
        } else {
            sb3.append(str.substring(3, 6));
        }
        sb3.append(" ");
        sb3.append(str.substring(6));
        return sb3.toString();
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() <= 2 ? str : str.replaceAll("(.{3})(.{3})", "$1 $2 ");
    }

    public static int p(Calendar calendar) {
        try {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(new Date());
            if (calendar.after(calendar2)) {
                return 0;
            }
            int i7 = calendar2.get(1);
            int i10 = calendar2.get(2);
            int i11 = calendar2.get(5);
            int i12 = calendar.get(1);
            int i13 = calendar.get(2);
            int i14 = calendar.get(5);
            int i15 = i7 - i12;
            if (i10 == i13) {
                return i11 < i14 ? i15 - 1 : i15;
            }
            return i10 < i13 ? i15 - 1 : i15;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Intent q(Context context) {
        return F.c(context, ARouter.getInstance().build("/account/authentication"));
    }

    public static String r(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.length() <= 5 ? str : N8.q0.y(str.substring(0, 5), " ", str.substring(5));
    }

    public static int s(String str) {
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        return (str.startsWith(TransType.TRANS_TYPE_BUNDLE) || str.startsWith(TransType.TRANS_TYPE_EX_GRATIA_REFUND)) ? 4 : 3;
    }

    public static String t(long j6) {
        if (j6 > FileSizeUnit.KB) {
            return new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(j6 / 1024.0d) + "GB";
        }
        if (j6 < 0) {
            return "0MB";
        }
        return String.valueOf(j6) + "MB";
    }

    public static Intent u(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (g0(BaseApplication.getContext(), intent)) {
            return intent;
        }
        return null;
    }

    public static int v(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return p025ba.d.class.getField(str).getInt(str);
        } catch (IllegalAccessException e10) {
            F6.d.h("SomeUtil", 5, "getDrawableResourceId 2: ", e10);
            return 0;
        } catch (NoSuchFieldException e11) {
            F6.d.h("SomeUtil", 5, "getDrawableResourceId 1: ", e11);
            return 0;
        } catch (Exception e12) {
            F6.d.h("SomeUtil", 5, "getDrawableResourceId 3: ", e12);
            return 0;
        }
    }

    public static String w(Context context) {
        return context.getPackageName() + ".file_provider";
    }

    public static String x(BaseApplication baseApplication) {
        String str;
        if (TextUtils.isEmpty(f7095a)) {
            String installerPackageName = baseApplication.getPackageManager().getInstallerPackageName("com.transsnet.palmpay");
            f7095a = installerPackageName;
            if (TextUtils.isEmpty(installerPackageName)) {
                String channel = BaseApplication.getChannel();
                if (TextUtils.equals(channel, "googleplay")) {
                    str = "com.android.vending";
                } else {
                    str = TextUtils.equals(channel, "palmstore") ? "com.transsnet.store" : "";
                }
                f7095a = str;
            }
        }
        return f7095a;
    }

    public static String y() {
        String phoneNumber = "";
        try {
            User user = BaseApplication.getInstance().getUser();
            if (user != null) {
                phoneNumber = user.getPhoneNumber();
            }
        } catch (Exception e10) {
            F6.d.c("SomeUtil", "getLastLoginNumber: ", e10);
        }
        return TextUtils.isEmpty(phoneNumber) ? p367ya.a.d().g() : phoneNumber;
    }

    public static String z(String str) {
        try {
            int i7 = Integer.parseInt(str);
            if (i7 == 1) {
                return "1st";
            }
            if (i7 == 2) {
                return "2nd";
            }
            if (i7 == 3) {
                return "3rd";
            }
            str = i7 + "th";
            return str;
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return str;
        }
    }
}
