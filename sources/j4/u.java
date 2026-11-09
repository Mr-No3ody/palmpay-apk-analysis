package j4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.core.web.FlexiBankPWebActivity;
import com.palmpay.lib.webview.container.PPWebActivity;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.F;
import kotlin.text.StringsKt;
import kotlin.text.y;
import p052da.ViewOnClickListenerC1649v;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f38320a;

    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    public static Intent a(String str) {
        boolean zBooleanValue;
        Long lU;
        if (str != null && !StringsKt.F(str)) {
            if (y.m(str, "arouter://", false)) {
                try {
                    String strI = StringsKt.I(str, "arouter:/");
                    Postcard postcardBuild = ARouter.getInstance().build(StringsKt.S(strI, '?'));
                    Iterator it = StringsKt.M(StringsKt.O('?', strI, ""), new char[]{'&'}, 6).iterator();
                    while (it.hasNext()) {
                        List listM = StringsKt.M((String) it.next(), new char[]{'='}, 2);
                        if (listM.size() == 2 && ((CharSequence) listM.get(1)).length() != 0) {
                            String str2 = (String) listM.get(0);
                            String str3 = (String) listM.get(1);
                            if (y.g(str3, "I", false) || y.g(str3, "L", false)) {
                                String strW = F.w(1, str3);
                                if (strW.length() <= 0 || !TextUtils.isDigitsOnly(strW)) {
                                    strW = null;
                                }
                                if (strW != null) {
                                    lU = StringsKt.U(strW);
                                } else {
                                    lU = null;
                                }
                            } else {
                                lU = null;
                            }
                            if (lU != null && y.g(str3, "I", false)) {
                                postcardBuild.withInt(str2, (int) lU.longValue());
                            } else if (lU != null) {
                                postcardBuild.withLong(str2, lU.longValue());
                            } else if (str3.equalsIgnoreCase("true")) {
                                postcardBuild.withBoolean(str2, true);
                            } else if (str3.equalsIgnoreCase("false")) {
                                postcardBuild.withBoolean(str2, false);
                            } else {
                                postcardBuild.withString(str2, str3);
                            }
                        }
                    }
                    LogisticsCenter.completion(postcardBuild);
                    Intent intent = new Intent(com.flexibank.sdk.k.g(), postcardBuild.getDestination());
                    intent.putExtras(postcardBuild.getExtras());
                    return intent;
                } catch (Exception e10) {
                    Log.e("FlexiBankSomeUtil", "getARouterIntent: ", e10);
                } catch (LinkageError e11) {
                    Log.e("FlexiBankSomeUtil", "getARouterIntent: host ARouter is unavailable", e11);
                }
            } else if (y.m(str, "system://", false)) {
                String strI2 = StringsKt.I(str, "system://");
                if (!StringsKt.F(strI2)) {
                    Intent intent2 = new Intent(strI2);
                    if ("android.settings.APPLICATION_DETAILS_SETTINGS".equalsIgnoreCase(strI2)) {
                        intent2.setData(Uri.parse("package:" + com.flexibank.sdk.k.g().getPackageName()));
                    }
                    return intent2;
                }
            } else if (RegexUtils.isURL(str)) {
                if (!y.m(str, "http://", false) && !y.m(str, "https://", false)) {
                    if (!TextUtils.isEmpty(str)) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(Uri.parse(str));
                        Context contextG = com.flexibank.sdk.k.g();
                        if (contextG != null) {
                            List<ResolveInfo> listQueryIntentActivities = contextG.getPackageManager().queryIntentActivities(intent3, 0);
                            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
                            if (listQueryIntentActivities.size() > 0) {
                                return intent3;
                            }
                        }
                    }
                    return null;
                }
                if (!y.m(str, "https://h5.flexi-bank.com", false)) {
                    return IntentUtils.getOpenUrlIntent(str, true);
                }
                K3.f fVar = K3.g.f4925c;
                K3.g gVar = fVar.get();
                Boolean bool = gVar.f4927b;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    Context context = fVar.getContext();
                    if (context != null) {
                        zBooleanValue = androidx.webkit.j.b(context) != null;
                        gVar.f4927b = Boolean.valueOf(zBooleanValue);
                    } else {
                        zBooleanValue = false;
                    }
                }
                if (!zBooleanValue) {
                    ToastUtils.showLong(com.flexibank.sdk.k.g().getString(com.flexibank.sdk.r.fb_no_webview_installed), new Object[0]);
                    return null;
                }
                try {
                    Intent intent4 = new Intent(com.flexibank.sdk.k.g(), (Class<?>) FlexiBankPWebActivity.class);
                    intent4.putExtra("linkUrl", str);
                    intent4.putExtra("url", str);
                    intent4.putExtra(PPWebActivity.KEY_WEB_NAV_BAR, "true");
                    return intent4;
                } catch (Exception e12) {
                    Log.e("FlexiBankSomeUtil", "getOpenUrlIntent: ", e12);
                }
            }
        }
        return null;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static void c(Context context, String str, String str2) {
        O6.d dVarA;
        O6.c cVar = new O6.c(context);
        cVar.e(com.flexibank.sdk.r.fb_opps);
        cVar.f6598d = str2;
        if ("CFRONT_800078".equals(str) || "33000039".equals(str)) {
            cVar.d(com.flexibank.sdk.r.fb_upgrade_now, null);
            dVarA = cVar.a();
            dVarA.show();
        } else if ("CFRONT_800081".equals(str) || "33000040".equals(str)) {
            cVar.d(com.flexibank.sdk.r.fb_upgrade_now, null);
            dVarA = cVar.a();
            dVarA.show();
        } else {
            if ("33000093".equals(str)) {
                cVar.f("Transactions over the Limit");
                cVar.f6600f = "Increase";
                cVar.f6602h = null;
                cVar.f6604j = new ViewOnClickListenerC1649v(context, 14);
                O6.d dVarA2 = cVar.a();
                dVarA2.setCancelable(false);
                dVarA2.setCanceledOnTouchOutside(false);
                dVarA2.show();
                return;
            }
            cVar.d(com.flexibank.sdk.r.fb_core_ok, null);
            dVarA = cVar.a();
            dVarA.show();
        }
        dVarA.setOnDismissListener(new Dd.b(context, 25));
    }
}
