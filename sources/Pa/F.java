package Pa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.UrlCoderUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f7013a = new HashSet(Arrays.asList("com.transsnet.palmpay.ui.activity.HomeActivity"));

    public static Intent a(Context context, String str) {
        Postcard postcardBuild = null;
        if (!TextUtils.isEmpty(str)) {
            Context context2 = context != null ? context : BaseApplication.getContext();
            if (!Ea.a.f2263b && str.length() > 24) {
                str.substring(0, 24);
            }
            Ea.a.a(context2);
            if (str.startsWith("http://") || str.startsWith("https://")) {
                return i0.B(str);
            }
            if (str.startsWith("com.transsnet.palmpay.action") || str.startsWith("com.transsnet.palmpay.intent")) {
                return new Intent(str);
            }
            if (str.startsWith("palmpay://")) {
                Intent intentU = i0.u(str);
                if (intentU != null && context != null) {
                    intentU.setPackage(context.getPackageName());
                }
                return intentU;
            }
            if (str.startsWith("market://")) {
                return i0.u(str);
            }
            if (str.startsWith("system://")) {
                String strSubstring = str.substring(9);
                Intent intent = new Intent(strSubstring);
                if ("android.settings.APPLICATION_DETAILS_SETTINGS".equalsIgnoreCase(strSubstring)) {
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                }
                return intent;
            }
            if (str.startsWith("arouter://")) {
                if (!TextUtils.isEmpty(str) && str.startsWith("arouter:/")) {
                    Ea.a.a(BaseApplication.getContext());
                    String strSubstring2 = str.substring(9);
                    if (!TextUtils.isEmpty(strSubstring2)) {
                        if (strSubstring2.contains("?")) {
                            String[] strArrSplit = strSubstring2.split("\\?");
                            if (strArrSplit != null && strArrSplit.length >= 2) {
                                try {
                                    postcardBuild = ARouter.getInstance().build(strArrSplit[0]);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                postcardBuild = h(postcardBuild, strArrSplit[1]);
                            }
                        } else {
                            try {
                                postcardBuild = ARouter.getInstance().build(strSubstring2);
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                }
                return c(context, postcardBuild);
            }
            if (str.startsWith("/")) {
                try {
                    return c(context, ARouter.getInstance().build(str));
                } catch (Exception e12) {
                    F6.d.c("F", "buildIntentWithLinkUrl: ", e12);
                    return null;
                }
            }
        }
        return null;
    }

    public static String b(String str, String str2, String str3) {
        try {
            if (str.startsWith("arouter://")) {
                return str;
            }
            if ("0".equals(str2)) {
                StringBuilder sb2 = new StringBuilder("arouter:/");
                sb2.append(str);
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append("?");
                    sb2.append(str3);
                }
                return sb2.toString();
            }
            if ("1".equals(str2)) {
                return "arouter://common/webview?url=" + UrlCoderUtil.encode(com.transsnet.palmpay.core.config.d.g(str));
            }
            if (!"4".equals(str2) && !"5".equals(str2) && AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE.equals(str2)) {
                com.palmpay.lib.apm.launchcounter.util.d.x(j(str3), str);
                StringBuilder sb3 = new StringBuilder("arouter://coreImpl/rn_host?rn_module_name=");
                sb3.append(str);
                if (!TextUtils.isEmpty(str3)) {
                    sb3.append("&");
                    sb3.append(str3);
                }
                return sb3.toString();
            }
            return null;
        } catch (Exception e10) {
            Log.e("F", "buildOneLink: ", e10);
        }
    }

    public static Intent c(Context context, Postcard postcard) {
        if (context != null && postcard != null) {
            try {
                LogisticsCenter.completion(postcard);
                Intent intent = new Intent(context, postcard.getDestination());
                intent.putExtras(postcard.getExtras());
                return intent;
            } catch (Exception e10) {
                F6.d.c("F", "convertPostCardToIntent: ", e10);
            }
        }
        return null;
    }

    public static void d(HomeMenuBean homeMenuBean) {
        if (homeMenuBean == null || TextUtils.isEmpty(homeMenuBean.jumpPath)) {
            return;
        }
        f(homeMenuBean.jumpPath, homeMenuBean.jumpType, homeMenuBean.jumpParams);
    }

    public static void e(String str) {
        Intent intentA = a(BaseApplication.getContext(), str);
        if (intentA == null) {
            Log.e("F", "gotoPage: invalid routerPath");
        } else {
            k(intentA, str);
            ActivityUtils.startActivity(intentA);
        }
    }

    public static void f(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                Log.e("F", "gotoPage: jumpPath is empty");
                return;
            }
            Ea.a.a(BaseApplication.getContext());
            if (str.startsWith("arouter://")) {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(str.contains("?") ? "&" : "?");
                    sb2.append(str3);
                    str = sb2.toString();
                }
                Intent intentA = a(BaseApplication.getContext(), str);
                if (intentA != null) {
                    k(intentA, str);
                    ActivityUtils.startActivity(intentA);
                    return;
                }
                return;
            }
            if ("0".equals(str2)) {
                h(ARouter.getInstance().build(str), str3).navigation();
                return;
            }
            if ("1".equals(str2)) {
                i0.c0(com.transsnet.palmpay.core.config.d.g(str));
                return;
            }
            if ("4".equals(str2)) {
                return;
            }
            if ("5".equals(str2)) {
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "SpendSaveHome");
            } else if (AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE.equals(str2)) {
                com.palmpay.lib.apm.launchcounter.util.d.x(j(str3), str);
            } else {
                i0.c0(str);
            }
        } catch (Exception e10) {
            F6.d.c("F", "gotoPage: ", e10);
        }
    }

    public static boolean g(Context context, String str) {
        if (context == null) {
            return false;
        }
        Intent intentA = a(context, str);
        if (intentA == null) {
            Log.e("F", "gotoPage: invalid routerPath");
            return false;
        }
        k(intentA, str);
        ActivityUtils.startActivity(intentA);
        return true;
    }

    public static Postcard h(Postcard postcard, String str) {
        if (!TextUtils.isEmpty(str) && postcard != null) {
            HashMap mapI = i(str);
            for (String str2 : mapI.keySet()) {
                String str3 = (String) mapI.get(str2);
                if (!TextUtils.isEmpty(str3)) {
                    if (str3.endsWith("L") || str3.endsWith("I")) {
                        Long lValueOf = null;
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                String strSubstring = str3.substring(0, str3.length() - 1);
                                if (!TextUtils.isEmpty(strSubstring) && TextUtils.isDigitsOnly(strSubstring)) {
                                    lValueOf = Long.valueOf(Long.parseLong(strSubstring));
                                }
                            } catch (Exception e10) {
                                F6.d.c("F", "getLongValue: ", e10);
                            }
                        }
                        if (lValueOf == null) {
                            postcard.withString(str2, str3);
                        } else if (str3.endsWith("I")) {
                            postcard.withInt(str2, lValueOf.intValue());
                        } else {
                            postcard.withLong(str2, lValueOf.longValue());
                        }
                    } else if (str3.equalsIgnoreCase("TRUE")) {
                        postcard.withBoolean(str2, true);
                    } else if (str3.equalsIgnoreCase("FALSE")) {
                        postcard.withBoolean(str2, false);
                    } else {
                        postcard.withString(str2, str3);
                    }
                }
            }
        }
        return postcard;
    }

    public static HashMap i(String str) {
        HashMap map = new HashMap();
        if (str != null && str.length() != 0) {
            if (str.startsWith("?")) {
                str = str.substring(1);
            }
            if (str != null && str.length() != 0) {
                try {
                    for (String str2 : str.split("&")) {
                        String[] strArrSplit = str2.split("=");
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], strArrSplit[1]);
                        }
                    }
                } catch (Exception e10) {
                    F6.d.c("F", "parseQueryString: ", e10);
                }
            }
        }
        return map;
    }

    public static Bundle j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return h(new Postcard(), str).getExtras();
    }

    public static void k(Intent intent, String str) {
        String str2 = null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(LoanHomeSource.TRACK_PARAM_KEY) && str.contains("?")) {
            for (String str3 : str.substring(str.indexOf(63) + 1).split("&")) {
                int iIndexOf = str3.indexOf(61);
                if (iIndexOf > 0 && LoanHomeSource.TRACK_PARAM_KEY.equals(str3.substring(0, iIndexOf))) {
                    String strDecode = Uri.decode(str3.substring(iIndexOf + 1));
                    if (!TextUtils.isEmpty(strDecode)) {
                        str2 = strDecode;
                        break;
                    }
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        intent.putExtra(LoanHomeSource.TRACK_PARAM_KEY, str2);
    }

    public static Intent l(Intent intent) {
        ComponentName component;
        if (!intent.getBooleanExtra("_route_rules_applied", false) && (component = intent.getComponent()) != null) {
            String className = component.getClassName();
            if (f7013a.contains(className)) {
                try {
                    Object objInvoke = Class.forName(className).getMethod("applyRouterRules", Intent.class).invoke(null, intent);
                    if (objInvoke instanceof Intent) {
                        Intent intent2 = (Intent) objInvoke;
                        intent2.putExtra("_route_rules_applied", true);
                        return intent2;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                } catch (Exception e10) {
                    F6.d.c("F", C0.G.o("tryApplyRouterRules: ", className), e10);
                }
            }
        }
        return intent;
    }
}
