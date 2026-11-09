package Pa;

import Ce.C0170l;
import N8.C0457a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.app.AbstractC0841t;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.utils.Consts;
import com.luck.picture.lib.config.PictureMimeType;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.ShareAppInfo;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.InstalledAppBean;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.EncodeUtils;
import com.transsnet.palmpay.util.FileIOUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.internal.operators.observable.C1755g;
import java.io.File;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f7152a = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f7153b = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f7154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile List f7155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile long f7156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7157f = 0;

    public static String A(long j6) {
        String strD = D(j6);
        return BaseApplication.isAO() ? strD.replace(Consts.DOT, "|").replace(",", Consts.DOT).replace("|", ",") : strD;
    }

    public static String A0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "***** " + e0(str2);
        }
        if (str.length() <= 12) {
            StringBuilder sbT = C0.G.t(str, "(***** ");
            sbT.append(e0(str2));
            sbT.append(")");
            return sbT.toString();
        }
        return str.substring(0, 12) + "... (***** " + e0(str2) + ")";
    }

    public static void A1() {
        org.greenrobot.eventbus.c.b().f(new MessageEvent(6, "SEND_PAGE_SELECT_PAYMENT_METHOD_PAGE"));
    }

    public static String B(long j6, boolean z3) {
        return C(A(j6), z3);
    }

    public static String B0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "" + e0(str2);
        }
        return H(str) + " (" + f0(str2) + ")";
    }

    public static void B1() {
        org.greenrobot.eventbus.c.b().f(new MessageEvent(7, ""));
    }

    public static String C(String str, boolean z3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BaseApplication.getCurrencySymbol());
        if (!z3) {
            sb2.append(" ");
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String C0(String str) {
        int iIndexOf;
        try {
            if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf("@")) <= 2) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, 2));
            sb2.append("***");
            sb2.append(str.substring(iIndexOf > 2 ? iIndexOf - 2 : 0));
            return sb2.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static void C1(Context context) {
        Vibrator vibrator;
        if (context == null || (vibrator = (Vibrator) context.getSystemService("vibrator")) == null || !vibrator.hasVibrator()) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(200L, 128));
            } else {
                vibrator.vibrate(200L);
            }
        } catch (Exception e10) {
            F6.d.c("r0", "playOnce: ", e10);
        }
    }

    public static String D(long j6) {
        if (j6 == 0) {
            return "0.00";
        }
        try {
            double dH = h(j6);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dH);
            return Math.abs(dH) < 100.0d ? y1("0.00", bigDecimalValueOf) : y1(",###,###.00", bigDecimalValueOf);
        } catch (Exception e10) {
            F6.d.c("AmountUtil", "getAmountStringWithThousandCharacter: ", e10);
            return "";
        }
    }

    public static String D0(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 6) {
            return str;
        }
        if (str.startsWith(K())) {
            str = w0(str);
        }
        return i0.n(str, false);
    }

    public static void D1(Context context, String str) {
        if (i0.X(context)) {
            com.bumptech.glide.b.e(context).g().load(str).f0(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public static String E(long j6) {
        if (j6 == 0) {
            return "0";
        }
        try {
            double dH = h(j6);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dH);
            return Math.abs(dH) < 100.0d ? y1("0", bigDecimalValueOf) : y1(",###,###", bigDecimalValueOf);
        } catch (Exception e10) {
            F6.d.c("AmountUtil", "getAmountStringWithThousandCharacter: ", e10);
            return "";
        }
    }

    public static String E0(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 6) {
            return str;
        }
        if (str.startsWith(K())) {
            str = w0(str);
        }
        return i0.n(str, true);
    }

    public static void E1(Context context, String str, CompleteCallback completeCallback) {
        com.bumptech.glide.b.e(context).g().load(new Rb.a(str)).U(new C0523u(new WeakReference(completeCallback))).f0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static String F(long j6) {
        return BaseApplication.getCurrencySymbol() + E(j6);
    }

    public static ArrayList F0(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            new ArrayList();
            Intent intent = new Intent("android.intent.action.SEND", (Uri) null);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setType("text/plain");
            PackageManager packageManager = context.getPackageManager();
            int i7 = 0;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                ResolveInfo resolveInfo = listQueryIntentActivities.get(i10);
                if (resolveInfo != null) {
                    try {
                        CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(packageManager);
                        Drawable drawableLoadIcon = resolveInfo.loadIcon(packageManager);
                        String str = resolveInfo.activityInfo.packageName;
                        ShareAppInfo shareAppInfo = new ShareAppInfo();
                        shareAppInfo.icon = drawableLoadIcon;
                        shareAppInfo.label = charSequenceLoadLabel;
                        shareAppInfo.resolveInfo = resolveInfo;
                        F6.d.h("debug_tag", 3, "label:" + ((Object) charSequenceLoadLabel) + ", " + str);
                        if ("com.whatsapp".equals(str)) {
                            shareAppInfo.index = 1;
                            arrayList.add(0, shareAppInfo);
                        } else if ("com.facebook.katana".equals(str)) {
                            shareAppInfo.index = 2;
                            arrayList.add(0, shareAppInfo);
                        } else if ("com.instagram.android".equals(str)) {
                            shareAppInfo.index = 3;
                            arrayList.add(0, shareAppInfo);
                        } else if ("com.twitter.android".equals(str)) {
                            shareAppInfo.index = 4;
                            arrayList.add(0, shareAppInfo);
                        } else {
                            arrayList.add(shareAppInfo);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            int size = arrayList.size();
            F6.d.h("AppInfoUtil", 3, "耗时排序开始");
            while (i7 < size) {
                int i11 = i7 + 1;
                for (int i12 = i11; i12 < size; i12++) {
                    if (((ShareAppInfo) arrayList.get(i7)).index > ((ShareAppInfo) arrayList.get(i12)).index) {
                        Collections.swap(arrayList, i7, i12);
                    }
                }
                i7 = i11;
            }
            F6.d.h("AppInfoUtil", 3, "耗时排序结束");
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static final void F1(ImageView imageView, AbstractActivityC0837o context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!i0.X(context) || imageView == null) {
            return;
        }
        try {
            View decorView = context.getWindow().getDecorView();
            if (!(decorView instanceof ViewGroup)) {
                decorView = null;
            }
            if (decorView != null) {
                ((ViewGroup) decorView).removeView(imageView);
            }
        } catch (Exception unused) {
        }
    }

    public static String G(String str) {
        return "***** " + e0(str);
    }

    public static p038ca.e G0(View... viewArr) {
        if (viewArr.length != 0 && (viewArr[0].getContext() instanceof BaseActivity)) {
            return ((BaseActivity) viewArr[0].getContext()).getF28604i();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public static void G1(AbstractActivityC0837o abstractActivityC0837o) {
        int i7;
        if (AbstractC0520q.f7143i && AbstractC0520q.f7138d == 28) {
            return;
        }
        try {
            if (!T0()) {
                abstractActivityC0837o.getDelegate().l(1);
                return;
            }
            int iL0 = l0(abstractActivityC0837o);
            AbstractC0841t delegate = abstractActivityC0837o.getDelegate();
            if (iL0 != -1) {
                i7 = iL0 == 2 ? 1 : 2;
            }
            delegate.l(i7);
            abstractActivityC0837o.getDelegate().l(iL0);
        } catch (Exception unused) {
            AbstractC0841t.k(1);
        }
    }

    public static String H(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() <= 20) {
            return str;
        }
        return str.substring(0, 20) + "...";
    }

    public static final String H0(int i7) {
        String string = BaseApplication.get().getString(i7);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static io.reactivex.internal.operators.observable.K H1(Class cls, String str) {
        return new C1755g(new p279s5.d(8, str, cls), 0).k(p298tf.f.f42629b);
    }

    public static String I(String str) {
        return "**** " + f0(str);
    }

    public static String I0(long j6) {
        return "-" + A(j6);
    }

    public static final void I1(Context context, String url, String text, MediaStoreHelper$showLoadingDialogInterface callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.showDialog(true);
        com.bumptech.glide.m mVarU = com.bumptech.glide.b.e(context).g().load(url).U(new B(callback, context, text));
        mVarU.getClass();
        mVarU.T(new H1.j(mVarU.f21022k0), null, mVarU, J1.g.f4461a);
    }

    public static String J(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 4) {
            return "";
        }
        try {
            return String.valueOf(Integer.parseInt(str.substring(0, 4)));
        } catch (Exception e10) {
            F6.d.c("PayStringUtils", e10.getMessage());
            return "234";
        }
    }

    public static int J0(Resources resources) {
        return resources.getConfiguration().uiMode & 48;
    }

    public static void J1(C0170l c0170l, View... viewArr) {
        if (viewArr.length != 0) {
            if (viewArr[0] == null) {
                return;
            }
            WeakReference[] weakReferenceArr = new WeakReference[viewArr.length];
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                weakReferenceArr[i7] = new WeakReference(viewArr[i7]);
            }
            WeakReference weakReference = new WeakReference(c0170l);
            T.b(-4).submit(new Da.h(weakReferenceArr, 9, new WeakReference(G0(viewArr)), weakReference));
        }
    }

    public static String K() {
        User user;
        String strG = p367ya.a.d().g();
        if (TextUtils.isEmpty(strG) && (user = BaseApplication.getInstance().getUser()) != null) {
            strG = user.getPhoneNumber();
        }
        return !TextUtils.isEmpty(strG) ? strG.substring(0, 4) : "0234";
    }

    public static Typeface K0(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if ("fonts/PalmPayNum-Bold.ttf".equals(str)) {
                return Y.j.a(L6.e.lib_ui_palmpaynum_bold_ttf, context);
            }
            if ("fonts/PalmPayNum-Regular.ttf".equals(str)) {
                return Y.j.a(L6.e.lib_ui_palmpaynum_regular_ttf, context);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K1(String str, int i7, CompleteCallback completeCallback, View... viewArr) {
        if (viewArr.length != 0) {
            if (viewArr[0] != null) {
                WeakReference[] weakReferenceArr = new WeakReference[viewArr.length];
                for (int i10 = 0; i10 < viewArr.length; i10++) {
                    weakReferenceArr[i10] = new WeakReference(viewArr[i10]);
                }
                WeakReference weakReference = new WeakReference(completeCallback);
                T.b(-4).submit(new X(str, i7, weakReferenceArr, new WeakReference(G0(viewArr)), weakReference, 0));
                return;
            }
        }
        if (completeCallback != null) {
            completeCallback.onComplete(null);
        }
    }

    public static SpannableStringBuilder L(int i7, int i10, int i11, long j6) {
        String currencySymbol = BaseApplication.getCurrencySymbol();
        String strA = A(j6);
        if (i11 <= 0 && strA.contains(Consts.DOT)) {
            strA.substring(0, strA.length() - 3);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) currencySymbol);
        spannableStringBuilder.append((CharSequence) strA);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i7, true), 0, currencySymbol.length(), 33);
        if (!strA.contains(Consts.DOT)) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i10, true), currencySymbol.length(), spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i10, true), currencySymbol.length(), spannableStringBuilder.length() - 3, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i11, true), spannableStringBuilder.length() - 3, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String L0(String str) {
        return PhoneBaseNumberUtils.INSTANCE.getValidMobileNumber(str, BaseApplication.getCountryLocale());
    }

    public static void L1(String str, CompleteCallback completeCallback, View... viewArr) {
        K1(str, 0, completeCallback, viewArr);
        Arrays.fill(viewArr, (Object) null);
    }

    public static SpannableStringBuilder M(int i7, int i10, long j6) {
        String currencySymbol = BaseApplication.getCurrencySymbol();
        String strA = A(j6);
        if (strA.contains(Consts.DOT)) {
            strA = androidx.camera.video.u.f(3, 0, strA);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) currencySymbol);
        spannableStringBuilder.append((CharSequence) strA);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i7, true), 0, currencySymbol.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i10, true), currencySymbol.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String M0(long j6, TimeZone timeZone) {
        Date date = new Date(j6);
        String[] strArr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTimeZone(timeZone);
        int i7 = calendar.get(7) - 1;
        if (i7 < 0) {
            i7 = 0;
        }
        return strArr[i7];
    }

    public static void M1(String str, int i7, CompleteCallback completeCallback, View... viewArr) {
        if (viewArr.length != 0) {
            if (viewArr[0] != null) {
                WeakReference[] weakReferenceArr = new WeakReference[viewArr.length];
                for (int i10 = 0; i10 < viewArr.length; i10++) {
                    weakReferenceArr[i10] = new WeakReference(viewArr[i10]);
                }
                WeakReference weakReference = new WeakReference(completeCallback);
                T.b(-4).submit(new X(str, i7, weakReferenceArr, new WeakReference(G0(viewArr)), weakReference, 1));
                return;
            }
        }
        completeCallback.onComplete(null);
    }

    public static String N(long j6) {
        return new SimpleDateFormat("MMM dd, yyyy h:mm:ss aa", Locale.ENGLISH).format(Long.valueOf(j6));
    }

    public static int N0(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        int i7 = calendar.get(1);
        F6.d.h("TimeUtil", 3, "getYear timeInMillis = " + j6 + "  ,year = " + i7);
        return i7;
    }

    public static final void N1(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        p220oa.b.a(context, name, file);
    }

    public static String O(long j6) {
        return new SimpleDateFormat("MMM dd, yyyy h:mm aa", Locale.ENGLISH).format(Long.valueOf(j6));
    }

    public static void O0(String str, Integer num, String str2, Bundle bundle) {
        if (Intrinsics.c(str, TransType.TRANS_TYPE_PAY_SHOP)) {
            Postcard postcardBuild = ARouter.getInstance().build("/sm/pay_shop_input_amount");
            bundle.putString("sn_no", str2);
            postcardBuild.with(bundle).navigation();
            return;
        }
        if (Intrinsics.c(str, TransType.TRANS_TYPE_WITHDRAW_TO_AGENT)) {
            Postcard postcardBuild2 = ARouter.getInstance().build("/sm/withdraw_input_amount");
            bundle.putString("sn_no", str2);
            postcardBuild2.with(bundle).navigation();
            return;
        }
        if ((num != null && num.intValue() == 2) || ((num != null && num.intValue() == 5) || (num != null && num.intValue() == 4))) {
            Postcard postcardBuild3 = ARouter.getInstance().build("/sm/palmpay_personal_transfer");
            bundle.putInt("extra_type", (num == null || num.intValue() != 4) ? num.intValue() : 2);
            bundle.putString("phone_number", str2);
            postcardBuild3.with(bundle).navigation();
            return;
        }
        Postcard postcardWithInt = ARouter.getInstance().build((num != null && num.intValue() == 10) ? "/sm/trans_to_mobile" : "/credit_score/input_amount").withInt("extra_type", num != null ? num.intValue() : 14);
        if (!TextUtils.isEmpty(str2)) {
            postcardWithInt.withString("extra_data", str2).withString("sn_no", str2);
        }
        if (bundle.containsKey("MEMBER_ID")) {
            postcardWithInt.withString("MEMBER_ID", bundle.getString("MEMBER_ID"));
        }
        postcardWithInt.navigation();
    }

    public static void O1(String str, String str2, String str3) {
        MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_SEND_EVENT_BACK_TO_RN_PAGE);
        messageEvent.setEventContent(str);
        StringBuilder sbT = C0.G.t(str, "_");
        sbT.append(System.currentTimeMillis());
        messageEvent.setEventTag(sbT.toString());
        messageEvent.setEventObj(str2);
        messageEvent.setEventObjExt(str3);
        org.greenrobot.eventbus.c.b().f(messageEvent);
    }

    public static String P(long j6) {
        Date date = new Date(j6);
        if (TimeUtils.isToday(j6)) {
            return "Today";
        }
        if (TimeUtils.isYesterday(j6)) {
            return "Yesterday";
        }
        if (TimeUtils.isTomorrow(j6)) {
            return "Tomorrow";
        }
        return TimeUtils.isCurrentYear(j6) ? new SimpleDateFormat("MMM dd", Locale.ENGLISH).format(date) : new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH).format(date);
    }

    public static void P0(Context context, double d2, double d10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("google.navigation:q=" + d2 + "," + d10));
            intent.setPackage("com.google.android.apps.maps");
            context.startActivity(intent);
        } catch (Exception unused) {
            ToastUtils.showLong("Please install Google map first to use navigation feature");
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.maps")));
        }
    }

    public static void P1(int i7) {
        org.greenrobot.eventbus.c.b().f(new MessageEvent(i7));
    }

    public static String Q(long j6) {
        return TimeUtils.millis2String(j6, new SimpleDateFormat("HH:mm, MMM dd, yyyy", Locale.ENGLISH));
    }

    public static boolean Q0(byte[] bArr) {
        if (bArr != null && bArr.length > 15 && bArr[13] == 45) {
            int i7 = 0;
            while (true) {
                if (i7 >= bArr.length) {
                    i7 = -1;
                    break;
                }
                if (bArr[i7] == 32) {
                    break;
                }
                i7++;
            }
            if (i7 > 14) {
                return true;
            }
        }
        return false;
    }

    public static void Q1(boolean z3) {
        String strL = com.transsnet.palmpay.core.config.d.l();
        F6.d.h("PatternLockUtil", 3, "setPatternOnOffState  key:" + strL + ",isOn" + z3);
        SPUtils.getInstance().put(strL, z3, true);
        if (z3) {
            return;
        }
        o();
    }

    public static String R(long j6) {
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm aa", locale);
        Date date = new Date(j6);
        if (TimeUtils.isToday(j6)) {
            return "Today " + simpleDateFormat.format(date);
        }
        if (TimeUtils.isYesterday(j6)) {
            return "Yesterday " + simpleDateFormat.format(date);
        }
        if (!TimeUtils.isTomorrow(j6)) {
            return TimeUtils.isCurrentYear(j6) ? new SimpleDateFormat("MMM dd, h:mm aa", locale).format(date) : new SimpleDateFormat("MMM dd, yyyy, h:mm aa", locale).format(date);
        }
        return "Tomorrow " + simpleDateFormat.format(date);
    }

    public static String R0(String str, String str2) {
        String str3;
        boolean zBooleanValue;
        String strD;
        JSONObject jSONObject = new JSONObject();
        try {
            String strF = androidx.work.impl.model.b.f();
            String uniqueId = PhoneUtils.getUniqueId();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            if (TextUtils.isEmpty(str)) {
                jSONObject.put("PP_DEVICE_ID", uniqueId);
            } else {
                jSONObject.put("PP_DEVICE_ID", str + uniqueId);
            }
            jSONObject.put("PP_DEVICE_TYPE", "ANDROID");
            jSONObject.put("PP_CLIENT_VER", strF);
            jSONObject.put("PP_CLIENT_VER_CODE", BaseApplication.get().getVersionCode());
            jSONObject.put("PP_TIMESTAMP", strValueOf);
            jSONObject.put("PP_COUNTRY_CODE", BaseApplication.getCountryLocale());
            jSONObject.put("PARAM_PP_APP_SOURCE", "PalmPay");
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF != null && !locationRecordF.isExpired()) {
                jSONObject.put("PP_LAT", String.valueOf(locationRecordF.getLatitude()));
                jSONObject.put("PP_LNG", String.valueOf(locationRecordF.getLongitude()));
            }
            String token = BaseApplication.get().getToken();
            jSONObject.put("PP_TOKEN", token);
            String strG = SecurityUtils.g(uniqueId, strF, strValueOf, token);
            try {
                strG = URLEncoder.encode(strG, "utf-8");
            } catch (Exception e10) {
                F6.d.c("AppInfoUtil", "encode: ", e10);
            }
            jSONObject.put("PP_REQ_SIGN", strG);
            if (TextUtils.isEmpty(str2)) {
                str3 = str2;
                zBooleanValue = false;
            } else {
                if (C0525w.g(str2, "isBlackBox").booleanValue()) {
                    strD = d(str2);
                    jSONObject.put("PP_BODY_WITH_BLACK_BOX", EncodeUtils.base64Encode2String(strD));
                } else {
                    strD = str2;
                }
                zBooleanValue = C0525w.g(str2, "useSignV2").booleanValue();
                str3 = strD;
            }
            if (TextUtils.isEmpty(str3)) {
                jSONObject.put("PP_REQ_SIGN_2", strG);
            } else {
                String strE = SecurityUtils.e(str3.getBytes());
                try {
                    strE = URLEncoder.encode(strE, "utf-8");
                } catch (Exception e11) {
                    F6.d.c("AppInfoUtil", "encode: ", e11);
                }
                jSONObject.put("PP_REQ_SIGN_2", strE);
            }
            if (zBooleanValue) {
                try {
                    jSONObject.put("PP_REQ_SIGN_V2", URLEncoder.encode(SecurityUtils.f(uniqueId, "ANDROID", strF, strValueOf, token, str3), "utf-8"));
                } catch (Exception e12) {
                    F6.d.c("AppInfoUtil", "httpHeaderInfo: add PARAM_PP_REQ_SIGN_V2 fail", e12);
                }
            }
        } catch (Exception e13) {
            F6.d.c("AppInfoUtil", "httpHeaderInfo2: ", e13);
        }
        return jSONObject.toString();
    }

    public static void R1(TextView textView, String str) {
        Typeface typefaceA;
        if (textView == null || textView.getContext() == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if ("fonts/PalmPayNum-Bold.ttf".equals(str)) {
                typefaceA = Y.j.a(L6.e.lib_ui_palmpaynum_bold_ttf, textView.getContext());
            } else if ("fonts/PalmPayNum-Regular.ttf".equals(str)) {
                typefaceA = Y.j.a(L6.e.lib_ui_palmpaynum_regular_ttf, textView.getContext());
            } else {
                typefaceA = null;
            }
            if (typefaceA != null) {
                textView.setTypeface(typefaceA);
            }
        } catch (Throwable unused) {
        }
    }

    public static String S(long j6) {
        return TimeUtils.millis2String(j6, new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH));
    }

    public static boolean S0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (new BigDecimal(str).compareTo(new BigDecimal(str2)) > 0) {
                    return true;
                }
            } catch (Exception e10) {
                F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
            }
        }
        return false;
    }

    public static void S1(ModelTitleContentImg modelTitleContentImg, int i7, String str, String str2, String str3) {
        if (BaseApplication.getContext() == null || modelTitleContentImg == null) {
            return;
        }
        modelTitleContentImg.f31587c.setText(p025ba.k.core_payment_method);
        modelTitleContentImg.f31588d.setText(q0(i7, str, str3));
        if (i7 == 1) {
            modelTitleContentImg.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_small);
            return;
        }
        if (i7 == 5 || i7 == 23 || i7 == 6) {
            if (TextUtils.isEmpty(str2)) {
                modelTitleContentImg.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_default_bank_logo);
                return;
            } else {
                o1(str2, modelTitleContentImg.f31589e);
                return;
            }
        }
        if (i7 == 8 || i7 == 13) {
            modelTitleContentImg.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_mobile_wallet_icon);
            return;
        }
        if (i7 == 28) {
            modelTitleContentImg.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_ok_card_icon);
        } else if (i7 == 36) {
            modelTitleContentImg.f31589e.setImageResource(com.transsnet.palmpay.custom_view.r.cv_ok_card_icon);
        } else {
            modelTitleContentImg.setVisibility(8);
        }
    }

    public static String T(long j6) {
        return TimeUtils.millis2String(j6, new SimpleDateFormat("MM dd, yyyy", Locale.ENGLISH));
    }

    public static boolean T0() {
        return SPUtils.get().getBoolean("key_dark_mode_setting_enable", true);
    }

    public static String T1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 8 && str.startsWith("M010001")) {
            str = str.substring(str.length() - 8);
        }
        if (str.length() > 8) {
            return str.substring(0, 4) + " " + str.substring(4, 8);
        }
        if (str.length() <= 4) {
            return str;
        }
        return str.substring(0, 4) + " " + str.substring(4);
    }

    public static int U(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        int i7 = calendar.get(5);
        F6.d.h("TimeUtil", 3, "getDay timeInMillis = " + j6 + "  ,day = " + i7);
        return i7;
    }

    public static boolean U0() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f7154c < 500) {
            return true;
        }
        f7154c = jElapsedRealtime;
        return false;
    }

    public static BigDecimal U1(String str, String str2) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        try {
            return W1(str).subtract(W1(str2));
        } catch (Exception e10) {
            F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
            return bigDecimal;
        }
    }

    public static Drawable V(Context context, String str) {
        if (!i0.X(context) || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (Drawable) ((com.bumptech.glide.m) com.bumptech.glide.b.e(context).load(str).q(true)).f0(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean V0() {
        return SPUtils.get().getBoolean("key_mode_night_follow_system", false);
    }

    public static String V1(String str) {
        return str.indexOf(Consts.DOT) > 0 ? str.replaceAll("0+?$", "").replaceAll("[.]$", "") : str;
    }

    public static String W(Context context, long j6) {
        return j6 <= 0 ? "" : context.getResources().getString(p025ba.k.core_msg_fee_include_vat, B(j6, false));
    }

    public static boolean W0(PackageManager pm, String packageName) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    pm.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
                    return true;
                }
                pm.getPackageInfo(packageName, 0);
                return true;
            } catch (Exception e10) {
                F6.d.h("InstalledAppsUtil", 3, C0.G.o("撞库验证失败: ", packageName), e10);
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return pm.getLaunchIntentForPackage(packageName) != null;
        } catch (Exception e11) {
            F6.d.c("InstalledAppsUtil", C0.G.o("撞库验证异常: ", packageName), e11);
            return false;
        }
    }

    public static BigDecimal W1(String str) {
        try {
            return new BigDecimal(str);
        } catch (Exception e10) {
            F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
            return BigDecimal.ZERO;
        }
    }

    public static String X(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 5) {
            return "";
        }
        String strSubstring = str.substring(5);
        if (strSubstring.length() <= 5) {
            return strSubstring;
        }
        return strSubstring.substring(0, 5) + " " + strSubstring.substring(5, strSubstring.length());
    }

    public static boolean X0(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (iArr[i7] == -1 && i7 < 4) {
                return false;
            }
        }
        return true;
    }

    public static String X1(Long l5, String str) {
        if (l5 == null || TextUtils.isEmpty(str)) {
            return "";
        }
        return new SimpleDateFormat(str, Locale.ENGLISH).format(new Date(l5.longValue()));
    }

    public static String Y(String str) {
        return (TextUtils.isEmpty(str) || str.length() <= 4) ? "" : i0.n(str.substring(4), false);
    }

    public static boolean Y0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null || !Constants.SCHEME.equalsIgnoreCase(scheme)) {
                F6.d.h("PayUrls", 5, C0.G.o("isSafeUrl: blocked non-https scheme: ", scheme));
                return false;
            }
            String host = uri.getHost();
            if (host == null || host.isEmpty()) {
                F6.d.h("PayUrls", 5, "isSafeUrl: blocked null/empty host");
                return false;
            }
            String lowerCase = host.toLowerCase(Locale.ROOT);
            String[] strArr = {"https://palmpay.app", "https://palmpay.com", "https://palmmerchant.com", "https://palmpay-inc.com", "https://transspay.net", "https://fleximfb.com"};
            for (int i7 = 0; i7 < 6; i7++) {
                String str2 = strArr[i7];
                String lowerCase2 = null;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        String host2 = new URI(str2).getHost();
                        if (host2 != null && !host2.isEmpty()) {
                            lowerCase2 = host2.toLowerCase(Locale.ROOT);
                        }
                    } catch (URISyntaxException unused) {
                        F6.d.h("PayUrls", 5, C0.G.o("isSafeUrl: invalid safe url config: ", str2));
                    }
                }
                if (lowerCase2 != null && (lowerCase.equals(lowerCase2) || lowerCase.endsWith(Consts.DOT.concat(lowerCase2)))) {
                    return true;
                }
            }
            return false;
        } catch (URISyntaxException e10) {
            F6.d.c("PayUrls", C0.G.o("isSafeUrl: invalid URL syntax: ", str), e10);
            return false;
        }
    }

    public static String Z(String str) {
        return (TextUtils.isEmpty(str) || str.length() <= 5) ? "" : i0.n(str.substring(5), false);
    }

    public static boolean Z0() {
        return SPUtils.get().getBoolean("key_mode_night_yes", false);
    }

    public static boolean a(String str) {
        String[] strArr;
        byte[] bytes = str.getBytes();
        if (Q0(bytes)) {
            String str2 = new String(r(0, 13, bytes));
            int i7 = 0;
            while (true) {
                if (i7 >= bytes.length) {
                    i7 = -1;
                    break;
                }
                if (bytes[i7] == 32) {
                    break;
                }
                i7++;
            }
            strArr = new String[]{str2, new String(r(14, i7, bytes))};
        } else {
            strArr = null;
        }
        if (strArr != null && strArr.length == 2) {
            String strSubstring = strArr[0];
            while (strSubstring.startsWith("0")) {
                strSubstring = strSubstring.substring(1, strSubstring.length());
            }
            if (System.currentTimeMillis() > (Long.valueOf(strArr[1]).longValue() * 1000) + Long.valueOf(strSubstring).longValue()) {
                return true;
            }
        }
        return false;
    }

    public static String a0(String str) {
        return PhoneBaseNumberUtils.INSTANCE.getFullMobileNumber(str, BaseApplication.getCountryLocale());
    }

    public static boolean a1(String str) {
        int length;
        return !TextUtils.isEmpty(str) && (length = str.length()) >= 16 && length <= 19;
    }

    public static BigDecimal b(String str, String str2) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        try {
            return W1(str).add(W1(str2));
        } catch (Exception e10) {
            F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
            return bigDecimal;
        }
    }

    public static String b0(String str, String str2, String str3) {
        String strO = TextUtils.isEmpty(str) ? "" : C0.G.o("", str);
        if (!TextUtils.isEmpty(str2)) {
            strO = N8.q0.j(N8.q0.j(strO, " "), str2);
        }
        return !TextUtils.isEmpty(str3) ? N8.q0.j(N8.q0.j(strO, " "), str3) : strO;
    }

    public static boolean b1(String str) {
        return PhoneBaseNumberUtils.INSTANCE.isValidMobileNumber(str, BaseApplication.getCountryLocale(), true);
    }

    public static void c(ArrayList arrayList, CashierPaymentMethodBean cashierPaymentMethodBean) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.size() == 2) {
            arrayList.remove(1);
        }
        arrayList.add(0, cashierPaymentMethodBean);
    }

    public static List c0(int i7, List list, boolean z3) {
        try {
            PackageManager packageManager = BaseApplication.get().getPackageManager();
            List listD0 = d0();
            F6.d.h("InstalledAppsUtil", 3, "设备已安装应用总数: " + listD0.size() + "，最大收集数量: " + i7 + "，包含系统应用: " + z3);
            ArrayList arrayList = new ArrayList();
            Iterator it = listD0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PackageInfo packageInfo = (PackageInfo) it.next();
                InstalledAppBean installedAppBeanP = null;
                try {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo == null) {
                        F6.d.h("InstalledAppsUtil", 5, "应用信息为空，跳过: " + packageInfo.packageName);
                    } else {
                        boolean z8 = (applicationInfo.flags & 1) != 0;
                        if (z3 || !z8) {
                            Intrinsics.e(packageManager);
                            installedAppBeanP = p(packageInfo);
                        }
                    }
                } catch (Exception e10) {
                    F6.d.c("InstalledAppsUtil", "解析应用信息失败: " + packageInfo.packageName, e10);
                }
                if (installedAppBeanP != null) {
                    arrayList.add(installedAppBeanP);
                }
                F6.d.c("InstalledAppsUtil", "获取已安装应用详细信息失败", e);
                return kotlin.collections.z.f38935a;
            }
            ArrayList arrayListZ = CollectionsKt.Z(CollectionsKt.U(arrayList, i7));
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                F6.d.h("InstalledAppsUtil", 3, "检查指定的 " + list.size() + " 个应用包名是否需要撞库验证");
                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(arrayListZ, 10));
                Iterator it2 = arrayListZ.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((InstalledAppBean) it2.next()).getPackageName());
                }
                Set setB0 = CollectionsKt.b0(arrayList2);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (setB0.contains(str)) {
                        F6.d.h("InstalledAppsUtil", 3, "应用已在列表中: " + str);
                    } else {
                        try {
                            Intrinsics.e(packageManager);
                            if (W0(packageManager, str)) {
                                try {
                                    PackageInfo packageInfo2 = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0);
                                    Intrinsics.e(packageInfo2);
                                    InstalledAppBean installedAppBeanP2 = p(packageInfo2);
                                    if (installedAppBeanP2 != null) {
                                        arrayListZ.add(installedAppBeanP2);
                                        F6.d.h("InstalledAppsUtil", 3, "应用已安装（撞库验证）: " + str + "，已添加到列表");
                                    }
                                } catch (Exception e11) {
                                    F6.d.h("InstalledAppsUtil", 5, "撞库验证后获取应用详细信息失败（受限制）: " + str + "，添加基本信息", e11);
                                    arrayListZ.add(new InstalledAppBean(str, 0L, 0L));
                                    F6.d.h("InstalledAppsUtil", 3, "应用已安装（撞库验证，基本信息）: " + str);
                                }
                            } else {
                                F6.d.h("InstalledAppsUtil", 3, "应用未安装（撞库验证）: " + str);
                            }
                        } catch (Exception e12) {
                            F6.d.c("InstalledAppsUtil", "撞库验证失败: " + str, e12);
                        }
                    }
                }
            }
            return arrayListZ;
        } catch (Exception e13) {
            F6.d.c("InstalledAppsUtil", "获取已安装应用详细信息失败", e13);
            return kotlin.collections.z.f38935a;
        }
    }

    public static boolean c1(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        return layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2;
    }

    public static String d(String str) {
        String strA;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            strA = p017b1.a.a();
        } catch (Exception e10) {
            n0 n0VarG = n0.g();
            e10.getMessage();
            n0VarG.getClass();
            strA = null;
        }
        if (TextUtils.isEmpty(strA)) {
            strA = "EmptyBlackCode";
        }
        StringBuilder sb2 = new StringBuilder("{\"blackBox\":\"");
        if (strA == null || !strA.contains("\"")) {
            sb2.append(strA);
        } else {
            sb2.append(strA.replace("\"", "\\\""));
        }
        if (str.equals("{}")) {
            sb2.append("\"");
        } else {
            sb2.append("\",");
        }
        sb2.append(str.substring(1));
        return sb2.toString();
    }

    public static List d0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f7155d == null || jCurrentTimeMillis - f7156e >= 300000) {
            F6.d.h("InstalledAppsUtil", 3, "缓存失效或不存在，重新查询应用列表");
            PackageManager packageManager = BaseApplication.get().getPackageManager();
            List<PackageInfo> installedPackages = Build.VERSION.SDK_INT >= 33 ? packageManager.getInstalledPackages(PackageManager.PackageInfoFlags.of(0L)) : packageManager.getInstalledPackages(0);
            Intrinsics.e(installedPackages);
            f7155d = installedPackages;
            f7156e = jCurrentTimeMillis;
            F6.d.h("InstalledAppsUtil", 3, C0.G.m(installedPackages.size(), "已更新缓存，应用数量: "));
            return installedPackages;
        }
        List list = f7155d;
        F6.d.h("InstalledAppsUtil", 3, "使用缓存的应用列表，数量: " + (list != null ? Integer.valueOf(list.size()) : null));
        List list2 = f7155d;
        Intrinsics.e(list2);
        return list2;
    }

    public static void d1(ImageView imageView, int i7) {
        if (n(imageView)) {
            com.bumptech.glide.m mVarL = com.bumptech.glide.b.f(imageView).load(Integer.valueOf(i7));
            if (c1(imageView)) {
                mVarL = (com.bumptech.glide.m) mVarL.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            mVarL.S(imageView);
        }
    }

    public static final ImageView e(ImageView imageView, AbstractActivityC0837o context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i0.X(context)) {
            try {
                View decorView = context.getWindow().getDecorView();
                if (!(decorView instanceof ViewGroup)) {
                    decorView = null;
                }
                if (decorView != null) {
                    ViewGroup viewGroup = (ViewGroup) decorView;
                    viewGroup.removeView(imageView);
                    ImageView appCompatImageView = imageView == null ? new AppCompatImageView(context) : imageView;
                    if (imageView == null) {
                        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        appCompatImageView.setImageResource(p025ba.d.core_bg_vague);
                        appCompatImageView.setOnClickListener(new Oc.j(5, viewGroup, appCompatImageView));
                    }
                    viewGroup.addView(appCompatImageView);
                    return appCompatImageView;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String e0(String str) {
        return (TextUtils.isEmpty(str) || str.length() <= 5) ? str : str.substring(str.length() - 5);
    }

    public static void e1(ImageView imageView, Drawable drawable) {
        if (!n(imageView) || drawable == null) {
            return;
        }
        com.bumptech.glide.m mVarI = com.bumptech.glide.b.f(imageView).load(drawable);
        if (c1(imageView)) {
            mVarI = (com.bumptech.glide.m) mVarI.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        mVarI.S(imageView);
    }

    public static long f(double d2) {
        return new BigDecimal(String.valueOf(d2)).multiply(new BigDecimal(100)).longValue();
    }

    public static String f0(String str) {
        return (TextUtils.isEmpty(str) || str.length() <= 4) ? str : str.substring(str.length() - 4);
    }

    public static void f1(ImageView imageView, Uri uri) {
        if (!n(imageView) || uri == null) {
            return;
        }
        com.bumptech.glide.m mVarJ = com.bumptech.glide.b.f(imageView).load(uri);
        if (c1(imageView)) {
            mVarJ = (com.bumptech.glide.m) mVarJ.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        mVarJ.S(imageView);
    }

    public static long g(String str) {
        BigDecimal bigDecimalMultiply;
        try {
            bigDecimalMultiply = new BigDecimal(String.valueOf(str)).multiply(new BigDecimal(100));
        } catch (Exception e10) {
            F6.d.c("AmountUtil", e10.getMessage());
            bigDecimalMultiply = null;
        }
        if (bigDecimalMultiply == null) {
            return 0L;
        }
        return bigDecimalMultiply.longValue();
    }

    public static String g0(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 12) {
            return str;
        }
        return str.substring(0, 12) + "... ";
    }

    public static void g1(ImageView imageView, Uri uri, G1.d dVar) {
        if (!n(imageView) || uri == null) {
            return;
        }
        String string = uri.toString();
        com.bumptech.glide.m mVarM = (!TextUtils.isEmpty(string) && (string.startsWith("http://") || string.startsWith("https://"))) ? com.bumptech.glide.b.f(imageView).load(new Rb.a(string)) : com.bumptech.glide.b.f(imageView).load(uri);
        if (dVar != null) {
            mVarM = mVarM.a(dVar);
        }
        if (c1(imageView)) {
            mVarM = (com.bumptech.glide.m) mVarM.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        mVarM.S(imageView);
    }

    public static double h(long j6) {
        double d2 = j6 * 0.01d;
        try {
            return BigDecimal.valueOf(d2).setScale(2, 4).doubleValue();
        } catch (Exception unused) {
            return d2;
        }
    }

    public static int h0(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        int i7 = calendar.get(2) + 1;
        F6.d.h("TimeUtil", 3, "getMonth timeInMillis = " + j6 + "  ,month = " + i7);
        return i7;
    }

    public static void h1(ImageView imageView, String str, int i7) {
        if (n(imageView)) {
            j1(imageView, str, (G1.d) G1.d.O(i7).j(i7));
        }
    }

    public static Intent i(String str, String str2) {
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        intent.putExtra("android.intent.extra.TITLE", str);
        return intent;
    }

    public static String i0(int i7) {
        if (BaseApplication.isAO()) {
            return (i7 < 0 || i7 >= 12) ? "" : f7153b[i7];
        }
        return (i7 < 0 || i7 >= 12) ? "" : f7152a[i7];
    }

    public static void i1(ImageView imageView, String str, int i7, int i10) {
        if (n(imageView)) {
            com.bumptech.glide.m mVarN = com.bumptech.glide.b.f(imageView).load(v(str));
            if (i7 > 0 && i10 > 0) {
                mVarN = (com.bumptech.glide.m) mVarN.w(i7, i10);
            } else if (i7 > 0) {
                mVarN = (com.bumptech.glide.m) mVarN.w(i7, Integer.MIN_VALUE);
            } else if (i10 > 0) {
                mVarN = (com.bumptech.glide.m) mVarN.w(Integer.MIN_VALUE, i10);
            }
            mVarN.S(imageView);
        }
    }

    public static boolean j(androidx.fragment.app.E e10, int i7, String str, int i10, UssdUtils$UssdResponseCallback ussdUtils$UssdResponseCallback) {
        TelephonyManager telephonyManagerCreateForSubscriptionId;
        if (e10 != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            if (Build.VERSION.SDK_INT < 26) {
                PhoneUtils.dial(Uri.encode(str));
                return false;
            }
            String[] strArr = {"android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE"};
            if (!p377z5.l.o(e10, strArr)) {
                p377z5.l.C(new dh.a(D4.f.p(e10), strArr, i10, "Without the requested permission, you need to dial USSD manually", "Reselect", "Dial Now"));
                return false;
            }
            if (androidx.core.content.d.a(e10, "android.permission.CALL_PHONE") == 0 && (telephonyManagerCreateForSubscriptionId = (TelephonyManager) e10.getSystemService("phone")) != null) {
                if (i7 >= 0) {
                    telephonyManagerCreateForSubscriptionId = telephonyManagerCreateForSubscriptionId.createForSubscriptionId(i7);
                }
                try {
                    telephonyManagerCreateForSubscriptionId.sendUssdRequest(str, new s0(new WeakReference(ussdUtils$UssdResponseCallback)), handler);
                    return true;
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static int j0(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        int i7 = calendar.get(2);
        F6.d.h("TimeUtil", 3, "getMonthInt timeInMillis = " + j6 + "  ,month = " + i7);
        return i7;
    }

    public static void j1(ImageView imageView, String str, G1.d dVar) {
        if (n(imageView)) {
            com.bumptech.glide.m mVarM = com.bumptech.glide.b.f(imageView).load(new Rb.a(v(str)));
            if (dVar != null) {
                mVarM.a(dVar);
            }
            if (c1(imageView)) {
                mVarM.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            mVarM.S(imageView);
        }
    }

    public static final boolean k(CashierPaymentMethodBean cashierPaymentMethodBean, Long l5) {
        Intrinsics.checkNotNullParameter(cashierPaymentMethodBean, "<this>");
        int i7 = cashierPaymentMethodBean.senderAccountType;
        return !(i7 == 1 || i7 == 28 || i7 == 40) || cashierPaymentMethodBean.availableBalance >= l5.longValue();
    }

    public static String k0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            return "" + D0(w0(str2));
        }
        StringBuilder sb2 = new StringBuilder("");
        if (!TextUtils.isEmpty(str) && str.length() > 12) {
            str = str.substring(0, 12) + "...";
        }
        sb2.append(str);
        String string = sb2.toString();
        if (TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sbT = C0.G.t(string, " (");
        sbT.append(D0(w0(str2)));
        sbT.append(")");
        return sbT.toString();
    }

    public static void k1(ImageView imageView, String str, String str2) {
        if (!TextUtils.isEmpty(str2) && i0.V(imageView)) {
            str = str2;
        }
        l1(str, imageView);
    }

    public static final boolean l(CashierPaymentMethodBean cashierPaymentMethodBean, CashierPaymentMethodBean cashierPaymentMethodBean2) {
        String str;
        Intrinsics.checkNotNullParameter(cashierPaymentMethodBean, "<this>");
        if (cashierPaymentMethodBean2 == null) {
            return false;
        }
        boolean z3 = cashierPaymentMethodBean instanceof CashierCombinationPaymentMethodBean;
        if (z3 && (cashierPaymentMethodBean2 instanceof CashierCombinationPaymentMethodBean)) {
            return cashierPaymentMethodBean.senderAccountType == ((CashierCombinationPaymentMethodBean) cashierPaymentMethodBean2).senderAccountType;
        }
        if (!z3 && !(cashierPaymentMethodBean2 instanceof CashierCombinationPaymentMethodBean)) {
            int i7 = cashierPaymentMethodBean2.senderAccountType;
            if (i7 == 1 && cashierPaymentMethodBean.senderAccountType == i7) {
                return true;
            }
            if (i7 == 57 && cashierPaymentMethodBean.senderAccountType == i7) {
                return true;
            }
            if (i7 == 23 && (str = cashierPaymentMethodBean.bankCode) != null && Intrinsics.c(str, cashierPaymentMethodBean2.bankCode)) {
                return true;
            }
            if (!TextUtils.isEmpty(cashierPaymentMethodBean.cardNo) && Intrinsics.c(cashierPaymentMethodBean.cardNo, cashierPaymentMethodBean2.cardNo)) {
                return true;
            }
            if (!TextUtils.isEmpty(cashierPaymentMethodBean.accountId) && Intrinsics.c(cashierPaymentMethodBean.accountId, cashierPaymentMethodBean2.accountId)) {
                return true;
            }
            if (!TextUtils.isEmpty(cashierPaymentMethodBean.bankAccountNo) && Intrinsics.c(cashierPaymentMethodBean.bankAccountNo, cashierPaymentMethodBean2.bankAccountNo)) {
                return true;
            }
        }
        return false;
    }

    public static int l0(AbstractActivityC0837o abstractActivityC0837o) {
        if (abstractActivityC0837o instanceof BaseActivity ? ((BaseActivity) abstractActivityC0837o).isForceNoNightMode() : false) {
            return 1;
        }
        if (V0()) {
            return -1;
        }
        return Z0() ? 2 : 1;
    }

    public static void l1(String str, ImageView imageView) {
        if (n(imageView)) {
            com.bumptech.glide.m mVarM = com.bumptech.glide.b.f(imageView).load(new Rb.a(v(str)));
            if (c1(imageView)) {
                mVarM = (com.bumptech.glide.m) mVarM.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            mVarM.S(imageView);
        }
    }

    public static boolean m(int[] iArr) {
        String string;
        String string2 = SPUtils.getInstance().getString(com.transsnet.palmpay.core.config.d.m());
        if (TextUtils.isEmpty(string2)) {
            string2 = FileIOUtils.readFile2String(new File(BaseApplication.getContext().getCacheDir(), com.transsnet.palmpay.core.config.d.m()));
            SPUtils.getInstance().put(com.transsnet.palmpay.core.config.d.m(), string2);
        }
        if (iArr == null) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (int i7 : iArr) {
                sb2.append(i7);
            }
            string = sb2.toString();
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            if (string2.length() > 14) {
                string = AppUtils.getSHA256StrJava(string);
            }
            if (string2.equals(string)) {
                return true;
            }
        }
        return false;
    }

    public static String m0(long j6) {
        return D(j6).split("\\.")[0].replace(Consts.DOT, "").replace(",", "").replace("|", "");
    }

    public static void m1(String str, ImageView imageView) {
        if (n(imageView)) {
            u1(imageView, str, com.transsnet.palmpay.custom_view.r.cv_avatar_default);
        }
    }

    public static boolean n(View view) {
        if (view == null) {
            return false;
        }
        return i0.X(view.getContext());
    }

    public static String n0(long j6) {
        String str = D(j6).split("\\.")[0];
        return BaseApplication.isAO() ? str.replace(Consts.DOT, "|").replace(",", Consts.DOT).replace("|", ",") : str;
    }

    public static void n1(View view, String str) {
        if (!n(view) || TextUtils.isEmpty(str)) {
            return;
        }
        com.bumptech.glide.m mVarN = com.bumptech.glide.b.f(view).load(str);
        mVarN.T(new C0522t(view, 0), null, mVarN, J1.g.f4461a);
    }

    public static void o() {
        SPUtils.getInstance().put(com.transsnet.palmpay.core.config.d.k(), 0L);
        SPUtils.getInstance().put("PATTERN_LOCK_ERROR_COUNT", 0);
    }

    public static int o0() {
        return SPUtils.getInstance().getInt(BaseApplication.getInstance().getUser().getPhoneNumber() + "PATTERN_PIN_SETTING", 0);
    }

    public static void o1(String str, ImageView imageView) {
        if (n(imageView)) {
            u1(imageView, str, com.transsnet.palmpay.custom_view.r.cv_default_bank_logo);
        }
    }

    public static InstalledAppBean p(PackageInfo packageInfo) {
        try {
            if (packageInfo.applicationInfo == null) {
                return null;
            }
            String packageName = packageInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            return new InstalledAppBean(packageName, packageInfo.lastUpdateTime, packageInfo.firstInstallTime);
        } catch (Exception e10) {
            F6.d.c("InstalledAppsUtil", C0.G.o("转换应用信息失败: ", packageInfo.packageName), e10);
            return null;
        }
    }

    public static final String p0(CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean) {
        Intrinsics.checkNotNullParameter(cashierCombinationPaymentMethodBean, "<this>");
        int i7 = cashierCombinationPaymentMethodBean.senderAccountType;
        if (i7 != 1 && i7 != 40) {
            return "";
        }
        String strB = B(cashierCombinationPaymentMethodBean.availableBalance, true);
        return N8.q0.k("(", strB, ")");
    }

    public static void p1(ImageView imageView, String str, boolean z3) {
        l1(str, imageView);
        if (z3) {
            imageView.setColorFilter(Color.argb(76, 0, 0, 0), PorterDuff.Mode.DARKEN);
        } else {
            imageView.setColorFilter((ColorFilter) null);
        }
    }

    public static int q(String str) {
        try {
            return new BigDecimal(str).setScale(2, RoundingMode.HALF_UP).intValue();
        } catch (Exception e10) {
            F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
            return 0;
        }
    }

    public static String q0(int i7, String str, String str2) {
        Context context = BaseApplication.getContext();
        String strD = "";
        if (context == null) {
            return "";
        }
        if (i7 == 1) {
            return context.getString(p025ba.k.core_palmpay_payment_balance);
        }
        if (i7 == 5) {
            String strH = i0.h(str, str2);
            return TextUtils.isEmpty(strH) ? context.getString(p025ba.k.core_bank_card) : strH;
        }
        if (i7 == 6) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                strD = i0.f(str) + i0.d(str2);
            } else if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                strD = i0.f(str);
            } else if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                strD = i0.d(str2);
            }
            return TextUtils.isEmpty(strD) ? context.getString(p025ba.k.core_bank_account) : strD;
        }
        if (i7 == 8 || i7 == 13) {
            return context.getString(p025ba.k.core_mobile_wallet);
        }
        if (i7 == 23) {
            return context.getString(p025ba.k.core_ussd_balance);
        }
        if (i7 == 27) {
            return context.getString(p025ba.k.core_palmpay_pre_pay);
        }
        if (i7 == 28) {
            return context.getString(p025ba.k.core_ok_card);
        }
        if (i7 == 36) {
            return context.getString(p025ba.k.core_okc_installment);
        }
        if (i7 == 20) {
            return context.getString(p025ba.k.core_palmpay_qr_card);
        }
        if (i7 == 40) {
            return context.getString(p025ba.k.core_cash_box);
        }
        return i7 == 57 ? context.getString(p025ba.k.core_flexi_pay) : "";
    }

    public static void q1(ImageView imageView, String str, String str2) {
        if (!TextUtils.isEmpty(str2) && i0.T()) {
            str = str2;
        }
        l1(str, imageView);
    }

    public static byte[] r(int i7, int i10, byte[] bArr) {
        int i11 = i10 - i7;
        if (i11 >= 0) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i7, bArr2, 0, Math.min(bArr.length - i7, i11));
            return bArr2;
        }
        throw new IllegalArgumentException(i7 + " > " + i10);
    }

    public static String r0(int i7, String str, String str2) {
        int i10 = 1;
        if (i7 != 1) {
            if (i7 == 2) {
                i10 = 5;
            } else if (i7 == 7) {
                i10 = 6;
            } else if (i7 == 11) {
                i10 = 8;
            } else if (i7 != 13) {
                i10 = 40;
                if (i7 != 40) {
                    return null;
                }
            } else {
                i10 = 23;
            }
        }
        return q0(i10, str, str2);
    }

    public static void r1(String str, ImageView imageView) {
        if (n(imageView)) {
            com.bumptech.glide.b.f(imageView).load(new Rb.a(v(str))).a(((G1.d) new G1.d().m(com.bumptech.glide.load.b.f20514a)).w(Integer.MIN_VALUE, Integer.MIN_VALUE)).S(imageView);
        }
    }

    public static File s(String str) {
        return new File(BaseApplication.get().getExternalFilesDir(Environment.DIRECTORY_PICTURES), N8.q0.k("Receipt_", str, PictureMimeType.JPG));
    }

    public static final Uri s0(CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean) {
        Intrinsics.checkNotNullParameter(cashierCombinationPaymentMethodBean, "<this>");
        int i7 = cashierCombinationPaymentMethodBean.senderAccountType;
        if (i7 == 1) {
            return CommonExtKt.toDrawableUri(com.transsnet.palmpay.custom_view.r.cv_palmpay_icon_circle_purple);
        }
        if (i7 != 8 && i7 != 23) {
            if (i7 == 28 || i7 == 36) {
                return CommonExtKt.toDrawableUri(com.transsnet.palmpay.custom_view.r.cv_ok_card_icon);
            }
            if (i7 == 40) {
                return CommonExtKt.toDrawableUri(com.transsnet.palmpay.custom_view.r.cv_cash_box_icon_circle_cashier);
            }
            if (i7 != 5 && i7 != 6 && i7 != 12 && i7 != 13) {
                return CommonExtKt.toDrawableUri(com.transsnet.palmpay.custom_view.r.cv_palmpay_icon_circle_purple);
            }
        }
        String str = cashierCombinationPaymentMethodBean.bankUrl;
        if (str == null || str.length() == 0) {
            return CommonExtKt.toDrawableUri(com.transsnet.palmpay.custom_view.r.cv_palmpay_icon_circle_purple);
        }
        Uri uri = Uri.parse(cashierCombinationPaymentMethodBean.bankUrl);
        Intrinsics.e(uri);
        return uri;
    }

    public static void s1(ImageView imageView, int i7) {
        if (n(imageView)) {
            com.bumptech.glide.b.f(imageView).load(Integer.valueOf(i7)).a(new G1.d().I(new Sa.a(), true)).S(imageView);
        }
    }

    public static String t(String str) {
        String plainString = BigDecimal.ZERO.toPlainString();
        try {
            return W1(str).divide(W1("100"), 8, 3).toPlainString();
        } catch (Exception e10) {
            F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
            return plainString;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final String t0(CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean, Context context) {
        String str;
        Intrinsics.checkNotNullParameter(cashierCombinationPaymentMethodBean, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i7 = cashierCombinationPaymentMethodBean.senderAccountType;
        if (i7 == 1) {
            String string = context.getString(p025ba.k.core_palmpay_payment_balance);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i7 == 8) {
            str = cashierCombinationPaymentMethodBean.bankName;
            if (str == null) {
                return str;
            }
        } else if (i7 != 23) {
            if (i7 == 28 || i7 == 36) {
                String string2 = context.getString(p025ba.k.core_oc_limit);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (i7 == 40) {
                String string3 = context.getString(p025ba.k.core_palmpay_payment_cash_box);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            if (i7 == 5 || i7 == 6 || i7 == 12) {
                String str2 = cashierCombinationPaymentMethodBean.bankName;
                if (str2 != null) {
                    return str2;
                }
            } else if (i7 == 13) {
                str = cashierCombinationPaymentMethodBean.bankName;
                if (str == null) {
                    return str;
                }
            }
        } else if (!TextUtils.isEmpty(cashierCombinationPaymentMethodBean.bankName)) {
            String strG0 = g0(cashierCombinationPaymentMethodBean.bankName);
            Intrinsics.e(strG0);
            return strG0;
        }
        return "";
    }

    public static void t1(ImageView imageView, Uri uri) {
        if (n(imageView)) {
            g1(imageView, uri, (G1.d) new G1.d().I(new Sa.a(), true));
        }
    }

    public static final String u(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() > 10) {
            str = str.substring(str.length() - 10);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        String strSubstring = str.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(str.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return N8.q0.y(strSubstring, "***", strSubstring2);
    }

    public static String u0(int i7) {
        Context context = BaseApplication.getContext();
        if (context == null) {
            return "";
        }
        if (i7 == 5) {
            return context.getString(p025ba.k.core_bank_card);
        }
        if (i7 == 23) {
            return context.getString(p025ba.k.core_ussd);
        }
        return i7 == 6 ? context.getString(p025ba.k.core_bank_account) : "";
    }

    public static void u1(ImageView imageView, String str, int i7) {
        if (n(imageView)) {
            j1(imageView, str, (G1.d) ((G1.d) G1.d.O(i7).j(i7)).H(new Sa.a()));
        }
    }

    public static String v(String str) {
        return (TextUtils.isEmpty(str) || !str.startsWith("http://")) ? str : str.replace("http://", "https://");
    }

    public static String v0(String str) {
        User user;
        if (TextUtils.isEmpty(str) || (user = BaseApplication.getInstance().getUser()) == null) {
            return str;
        }
        String phoneNumber = user.getPhoneNumber();
        if (TextUtils.isEmpty(phoneNumber) || phoneNumber.length() < 4) {
            return C0.G.o("0234", str);
        }
        return phoneNumber.substring(0, 4) + str;
    }

    public static void v1(String str, ImageView imageView) {
        if (n(imageView)) {
            j1(imageView, str, (G1.d) new G1.d().I(new Sa.a(), true));
        }
    }

    public static final String w(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 10) {
            return str;
        }
        String strSubstring = str.substring(str.length() - 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String w0(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 4) {
            return "";
        }
        int length = str.length();
        if (length > PhoneBaseNumberUtils.INSTANCE.getMobileNumberValidLength(BaseApplication.getCountryLocale())) {
            if (str.startsWith("0234") || str.startsWith("+234") || str.startsWith("0233") || str.startsWith("0255") || str.startsWith("0244")) {
                return str.substring(4, length);
            }
            if (str.startsWith("234") || str.startsWith("233") || str.startsWith("255") || str.startsWith("244")) {
                return str.substring(3, length);
            }
        }
        return str;
    }

    public static BigDecimal w1(String str, String str2) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return W1(str).multiply(W1(str2));
            } catch (Exception e10) {
                F6.d.c("BigDecimalUtil", e10.getMessage(), e10.fillInStackTrace());
            }
        }
        return bigDecimal;
    }

    public static final void x(ARouter aRouter, Fragment fragment, Postcard postcard, int i7) {
        Intrinsics.checkNotNullParameter(aRouter, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        try {
            LogisticsCenter.completion(postcard);
            Intent intent = new Intent(fragment.getActivity(), postcard.getDestination());
            intent.putExtras(postcard.getExtras());
            fragment.startActivityForResult(intent, i7);
        } catch (Exception unused) {
        }
    }

    public static String x0(long j6) {
        return B(j6 * 100, false);
    }

    public static void x1(WeakReference weakReference, File file) {
        CompleteCallback completeCallback = (CompleteCallback) weakReference.get();
        if (completeCallback != null) {
            df.d.h(file).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p161kf.e(new C0457a(completeCallback, 9), p147jf.a.f38601e, p147jf.a.f38599c));
        }
    }

    public static String y(long j6) {
        return "+" + A(j6);
    }

    public static String y0(String str) {
        return (TextUtils.isEmpty(str) || !str.startsWith("/")) ? C0.G.o("https://static.chuanyinet.com/palmpayAppIcon/", str) : "https://static.chuanyinet.com/palmpayAppIcon".concat(str);
    }

    public static String y1(String str, BigDecimal bigDecimal) {
        return new DecimalFormat(str, DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(bigDecimal);
    }

    public static String z(long j6) {
        return "+" + B(j6, false);
    }

    public static String z0(String str) {
        if (str == null) {
            return "0";
        }
        return str.indexOf(Consts.DOT) > 0 ? str.replaceAll("0+?$", "").replaceAll("[.]$", "") : str;
    }

    public static String z1(int i7, CharSequence charSequence) {
        try {
            Matcher matcher = Pattern.compile("(?<![0-9])([0-9]{" + i7 + "})(?![0-9])").matcher(charSequence);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
