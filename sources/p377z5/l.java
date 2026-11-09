package p377z5;

import C0.G;
import C9.C0138e;
import D4.f;
import E.C0212q;
import E.T;
import K3.j;
import Pa.C0525w;
import Pa.i0;
import T5.g;
import T5.h;
import Wf.AbstractC0780y;
import Wf.C0771o;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.camera2.internal.compat.s;
import androidx.camera.video.u;
import androidx.core.text.c;
import androidx.core.widget.i;
import androidx.lifecycle.LifecycleOwner;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.facebook.react.uimanager.ViewProps;
import com.flexibank.sdk.base.FlexiBankLoadingDialogHost;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.growingio.android.debugger.a;
import com.hjq.toast.config.IToastStrategy;
import com.hjq.toast.config.IToastStyle;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfoV2;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.style.StyleConfigMap;
import com.transsnet.palmpay.credit.bean.style.local.StyleConfigMapLocal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.json.JSONException;
import org.json.JSONObject;
import p015ag.r;
import p186mb.d;
import p193n0.e;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f44480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static IToastStrategy f44481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static IToastStyle f44482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f44483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f44484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static StyleConfigMapLocal f44485f;

    public static final boolean A(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.c(method, "GET") || Intrinsics.c(method, "HEAD")) ? false : true;
    }

    public static String B(Bundle bundle) {
        String string = bundle.getString(LoanHomeSource.TRACK_PARAM_KEY);
        if (string != null) {
            if (StringsKt.F(string)) {
                string = null;
            }
            if (string != null) {
                return string;
            }
        }
        String string2 = bundle.getString(LoanHomeSource.TRACK_PARAM_KEY);
        if (string2 == null || StringsKt.F(string2)) {
            return null;
        }
        return string2;
    }

    public static void C(dh.a aVar) {
        f fVar = aVar.f35972a;
        Context contextO = fVar.o();
        String[] strArr = aVar.f35973b;
        int i7 = 0;
        if (o(contextO, (String[]) strArr.clone())) {
            Activity activity = (Activity) fVar.f1592b;
            String[] strArr2 = (String[]) strArr.clone();
            int[] iArr = new int[strArr2.length];
            for (int i10 = 0; i10 < strArr2.length; i10++) {
                iArr[i10] = 0;
            }
            r(aVar.f35974c, strArr2, iArr, activity);
            return;
        }
        String[] strArr3 = (String[]) strArr.clone();
        fVar.getClass();
        int length = strArr3.length;
        while (true) {
            int i11 = aVar.f35974c;
            if (i7 >= length) {
                fVar.k(i11, strArr3);
                return;
            } else {
                if (fVar.s(strArr3[i7])) {
                    fVar.t(aVar.f35975d, aVar.f35976e, aVar.f35977f, aVar.f35978g, i11, strArr3);
                    return;
                }
                i7++;
            }
        }
    }

    public static ArrayList D(LoanHomeDataInfoV2 loanHomeDataInfoV2, boolean z3) {
        List<String> list;
        if (z3) {
            List<String> list2 = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.onboardingDark : null;
            if (list2 != null && !list2.isEmpty()) {
                list = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.onboardingDark : null;
                if (list == null) {
                    list = z.f38935a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!StringsKt.F((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        if (!z3) {
            List<String> list3 = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.onboardingLight : null;
            if (list3 != null && !list3.isEmpty()) {
                list = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.onboardingLight : null;
                if (list == null) {
                    list = z.f38935a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!StringsKt.F((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }
        List<String> list4 = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.onboardingDark : null;
        if (list4 == null || list4.isEmpty()) {
            list = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.onboardingLight : null;
            if (list == null) {
                list = z.f38935a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (!StringsKt.F((String) obj3)) {
                    arrayList3.add(obj3);
                }
            }
            return arrayList3;
        }
        list = loanHomeDataInfoV2 != null ? loanHomeDataInfoV2.onboardingDark : null;
        if (list == null) {
            list = z.f38935a;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (!StringsKt.F((String) obj4)) {
                arrayList4.add(obj4);
            }
        }
        return arrayList4;
    }

    public static void E(TextView textView, int i7) {
        p118hf.a.i(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            X.a.q(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void F(TextView textView, int i7) {
        p118hf.a.i(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i10);
        }
    }

    public static void G(TextView textView, int i7) {
        p118hf.a.i(i7);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i7 != fontMetricsInt) {
            textView.setLineSpacing(i7 - fontMetricsInt, 1.0f);
        }
    }

    public static boolean H(LoanHomeDataInfoV2 loanHomeDataInfoV2) {
        String strK = G.k();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strK);
        sb2.append("_cs_loan_home_onboarding_read");
        return (p059e1.a.C(sb2.toString(), false) || loanHomeDataInfoV2 == null || !loanHomeDataInfoV2.showOnboarding || (D(loanHomeDataInfoV2, false).isEmpty() && D(loanHomeDataInfoV2, true).isEmpty())) ? false : true;
    }

    public static void I(j jVar) {
        if (f44480a == null) {
            throw new IllegalStateException("Toaster has not been initialized");
        }
        CharSequence charSequence = jVar.f44470a;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (jVar.f44473d == null) {
            jVar.f44473d = f44481b;
        }
        if (jVar.f44474e == null) {
            if (f44483d == null) {
                f44483d = new a(11);
            }
            jVar.f44474e = f44483d;
        }
        if (jVar.f44472c == null) {
            jVar.f44472c = f44482c;
        }
        jVar.f44474e.intercept(jVar);
        if (jVar.f44471b == -1) {
            jVar.f44471b = jVar.f44470a.length() > 20 ? 1 : 0;
        }
        jVar.f44473d.showToast(jVar);
    }

    public static final Object J(r rVar, r rVar2, Function2 function2) throws Throwable {
        Object c0771o;
        Object objW;
        try {
            K.d(2, function2);
            c0771o = function2.invoke(rVar2, rVar);
        } catch (Throwable th) {
            c0771o = new C0771o(th, false);
        }
        Ef.a aVar = Ef.a.f2423a;
        if (c0771o == aVar || (objW = rVar.w(c0771o)) == AbstractC0780y.f10913e) {
            return aVar;
        }
        rVar.M();
        if (objW instanceof C0771o) {
            throw ((C0771o) objW).f10891a;
        }
        return AbstractC0780y.r(objW);
    }

    public static final e K(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new e(name);
    }

    public static int L(int i7, int i10) {
        int i11 = i7 ^ i10;
        return ((~i11) & (i11 - 1)) >>> 63;
    }

    public static int M(int i7, int i10) {
        return (int) ((((long) i10) - ((long) i7)) >>> 63);
    }

    public static int N(int i7, int i10) {
        return (int) ((((long) i7) - ((long) i10)) >>> 63);
    }

    public static int O(int i7, int i10, int i11) {
        return ((i7 - 1) & (i11 ^ i10)) ^ i10;
    }

    public static ActionMode.Callback P(ActionMode.Callback callback) {
        return (!(callback instanceof i) || Build.VERSION.SDK_INT < 26) ? callback : ((i) callback).f16367a;
    }

    public static ActionMode.Callback Q(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i7 > 27 || (callback instanceof i) || callback == null) ? callback : new i(callback, textView);
    }

    public static final t0.e a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return new t0.e(new float[]{f10, f11, f12, f13, f14, f15, f16, f17});
    }

    public static final int b(int i7, int i10, int i11) {
        return Math.min(Math.max(0, i11 - i7), i10);
    }

    public static int c() {
        WindowManager windowManager = (WindowManager) D3.a.f1587c.getSystemService("window");
        if (windowManager == null) {
            return D3.a.f1587c.getResources().getDisplayMetrics().widthPixels;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    public static String d(String str, String str2) throws JSONException {
        String strNormalize;
        JSONObject jSONObject = new JSONObject();
        if (str != null && !StringsKt.F(str)) {
            jSONObject.put("action", str);
        }
        if (str2 == null || (strNormalize = LoanHomeSource.INSTANCE.normalize(str2)) == null) {
            strNormalize = Eb.a.f2267a;
            if (StringsKt.F(strNormalize)) {
                strNormalize = null;
            }
        } else {
            if (StringsKt.F(strNormalize)) {
                strNormalize = null;
            }
            if (strNormalize == null) {
                strNormalize = Eb.a.f2267a;
                if (StringsKt.F(strNormalize)) {
                    strNormalize = null;
                }
            }
        }
        if (strNormalize != null && !StringsKt.F(strNormalize)) {
            jSONObject.put(LoanHomeSource.TRACK_PARAM_KEY, strNormalize);
            if (str2 != null) {
                Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(strNormalize);
            }
        }
        if (jSONObject.length() > 0) {
            return jSONObject.toString();
        }
        return null;
    }

    public static final void e(int i7, int i10, int i11, int i12, int i13) {
        p213o2.e.c(i12 >= 0, "count (%d) ! >= 0", Integer.valueOf(i12));
        p213o2.e.c(i7 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i7));
        p213o2.e.c(i11 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i11));
        p213o2.e.c(i7 + i12 <= i13, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i7), Integer.valueOf(i12), Integer.valueOf(i13));
        p213o2.e.c(i11 + i12 <= i10, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10));
    }

    public static Uri f(Context context, String name) {
        X7.a aVar = X7.a.f11052a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Locale locale = Locale.ROOT;
        y.k(u.q(locale, "ROOT", name, locale, "toLowerCase(...)"), "-", "_");
        int iA = aVar.a(context, name, "drawable");
        if (iA != 0) {
            return Uri.parse("res:/" + iA);
        }
        int iA2 = aVar.a(context, name, "raw");
        if (iA2 != 0) {
            return Uri.parse("res:/" + iA2);
        }
        if (!y.m(name, "asset:/", false)) {
            return Uri.parse("file:///android_asset/".concat(name));
        }
        return Uri.parse("file:///android_asset/" + StringsKt.I(name, "asset:/"));
    }

    public static byte g(int i7) {
        int iN = N(i7, 26);
        int iM = M(i7, 25) & N(i7, 52);
        return (byte) (O(M(i7, 51) & N(i7, 62), i7 - 4, 0) | O(iN, i7 + 65, 0) | O(iM, i7 + 71, 0) | O(L(i7, 62), 45, 0) | O(L(i7, 63), 95, 0));
    }

    public static final void h(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (Intrinsics.c(str, "LoanHome") || Intrinsics.c(str, "LoanTabHome")) {
            String strB = B(bundle);
            if (strB != null) {
                Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(strB);
            }
            String strB2 = B(bundle);
            if (strB2 == null || StringsKt.F(strB2)) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                String str2 = Eb.a.f2267a;
                bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
                bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
            }
        }
    }

    public static String i(int i7) {
        ArrayList arrayList = new ArrayList();
        if ((i7 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i7 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "|");
            }
        }
        return sb2.toString();
    }

    public static int j(SectionEntity sectionEntity) {
        Intrinsics.checkNotNullParameter(sectionEntity, "this");
        return sectionEntity.getIsHeader() ? -99 : -100;
    }

    public static int k(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x007c  */
    public static Object l(String str, String str2, Class cls) {
        Object obj;
        StyleConfigMapLocal styleConfigMapLocal;
        Map<String, Object> map;
        Object obj2;
        Map<String, Object> map2;
        Map<String, Object> map3;
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            StyleConfigMap styleConfigMap = d.f39634e.getInstance().f39639d;
            if (styleConfigMap == null || TextUtils.isEmpty(str)) {
                obj = null;
            } else {
                Map<String, Object> map4 = (i0.T() && (map3 = styleConfigMap.configNightMap) != null && map3.containsKey(str)) ? styleConfigMap.configNightMap : styleConfigMap.configMap;
                if (map4 == null || (obj = map4.get(str)) == null) {
                    obj = null;
                }
            }
            if (obj == null) {
                if (f44485f == null) {
                    f44485f = new StyleConfigMapLocal();
                }
                if (TextUtils.isEmpty(str)) {
                    obj = null;
                } else {
                    if (i0.T()) {
                        StyleConfigMapLocal styleConfigMapLocal2 = f44485f;
                        if ((styleConfigMapLocal2 != null ? styleConfigMapLocal2.configNightMap : null) == null || styleConfigMapLocal2 == null || (map2 = styleConfigMapLocal2.configNightMap) == null || !map2.containsKey(str)) {
                            styleConfigMapLocal = f44485f;
                            if (styleConfigMapLocal != null) {
                                map = styleConfigMapLocal.configMap;
                            } else {
                                map = null;
                            }
                        } else {
                            StyleConfigMapLocal styleConfigMapLocal3 = f44485f;
                            if (styleConfigMapLocal3 != null) {
                                map = styleConfigMapLocal3.configNightMap;
                            } else {
                                map = null;
                            }
                        }
                    } else {
                        styleConfigMapLocal = f44485f;
                        if (styleConfigMapLocal != null) {
                            map = styleConfigMapLocal.configMap;
                        } else {
                            map = null;
                        }
                    }
                    if (map == null || (obj2 = map.get(str)) == null) {
                        obj = null;
                    } else {
                        obj = obj2;
                    }
                }
                if (obj == null) {
                    obj = null;
                }
            }
            if (obj != null) {
                try {
                    if (cls.isInstance(obj)) {
                        return obj;
                    }
                    if (obj instanceof LinkedTreeMap) {
                        C0525w c0525wF = C0525w.f();
                        String json = ((Gson) C0525w.f().f7166b).toJson(obj);
                        c0525wF.getClass();
                        return C0525w.d(json, cls);
                    }
                } catch (Exception e10) {
                    Log.e("StyleConfigUtils", str2 + " error: " + e10.getMessage());
                }
            }
        }
        return null;
    }

    public static c m(AppCompatTextView appCompatTextView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return new c(X.a.m(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i7 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z3 = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z3) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(X.a.c(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    public static Matrix n(RectF rectF, RectF rectF2, String str, int i7) {
        double d2;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14 = rectF.left;
        double d15 = rectF.top;
        double dWidth = rectF.width();
        double dHeight = rectF.height();
        double d16 = rectF2.left;
        double d17 = rectF2.top;
        double dWidth2 = rectF2.width();
        double dHeight2 = rectF2.height();
        double dMax = dWidth2 / dWidth;
        double d18 = dHeight2 / dHeight;
        double d19 = d16 - (d14 * dMax);
        double d20 = d17 - (d15 * d18);
        if (i7 == 2) {
            dMax = Math.min(dMax, d18);
            if (dMax > 1.0d) {
                d11 = d19 - (((dWidth2 / dMax) - dWidth) / 2.0d);
                d13 = (dHeight2 / dMax) - dHeight;
            } else {
                d11 = d19 - ((dWidth2 - (dWidth * dMax)) / 2.0d);
                d13 = dHeight2 - (dHeight * dMax);
            }
            d12 = d20 - (d13 / 2.0d);
            d18 = dMax;
        } else {
            if (!str.equals(ViewProps.NONE) && i7 == 0) {
                dMax = Math.min(dMax, d18);
            } else if (str.equals(ViewProps.NONE) || i7 != 1) {
                d2 = d16 - (d14 * dMax);
                d10 = d17 - (d15 * d18);
                if (str.contains("xMid")) {
                    d2 += (dWidth2 - (dWidth * dMax)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d11 = (dWidth2 - (dWidth * dMax)) + d2;
                } else {
                    d11 = d2;
                }
                if (str.contains("YMid")) {
                    d12 = ((dHeight2 - (dHeight * d18)) / 2.0d) + d10;
                } else {
                    d12 = d10;
                }
                if (str.contains("YMax")) {
                    d12 = (dHeight2 - (dHeight * d18)) + d12;
                }
            } else {
                dMax = Math.max(dMax, d18);
            }
            d18 = dMax;
            d2 = d16 - (d14 * dMax);
            d10 = d17 - (d15 * d18);
            if (str.contains("xMid")) {
                d2 += (dWidth2 - (dWidth * dMax)) / 2.0d;
            }
            if (str.contains("xMax")) {
                d11 = (dWidth2 - (dWidth * dMax)) + d2;
            } else {
                d11 = d2;
            }
            if (str.contains("YMid")) {
                d12 = ((dHeight2 - (dHeight * d18)) / 2.0d) + d10;
            } else {
                d12 = d10;
            }
            if (str.contains("YMax")) {
                d12 = (dHeight2 - (dHeight * d18)) + d12;
            }
        }
        double d21 = d11;
        double d22 = d12;
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d21, (float) d22);
        matrix.preScale((float) dMax, (float) d18);
        return matrix;
    }

    public static boolean o(Context context, String... strArr) {
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (androidx.core.content.d.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(s sVar, String str) throws T {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) sVar.a(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i7 : iArr) {
                    if (i7 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (androidx.camera.camera2.internal.compat.a e10) {
            throw new T(new C0212q(e10));
        }
    }

    public static void q(LifecycleOwner lifecycleOwner, j jVar, FlexiBankLoadingDialogHost view, Function2 onSuccess, Function1 onError, int i7) {
        G9.j checkLoading = new G9.j(28);
        boolean z3 = (i7 & 128) != 0;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(checkLoading, "checkLoading");
        if (jVar != null) {
            jVar.e(lifecycleOwner, new C0138e(new L3.a(true, checkLoading, view, z3, onSuccess, jVar, onError)));
        }
    }

    public static void r(int i7, String[] strArr, int[] iArr, Object... objArr) {
        boolean zIsInstance;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (iArr[i10] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof EasyPermissions$PermissionCallbacks)) {
                ((EasyPermissions$PermissionCallbacks) obj).onPermissionsGranted(i7, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof EasyPermissions$PermissionCallbacks)) {
                ((EasyPermissions$PermissionCallbacks) obj).onPermissionsDenied(i7, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                Class<?> superclass = obj.getClass();
                if (obj.getClass().getSimpleName().endsWith("_")) {
                    try {
                        zIsInstance = Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
                    } catch (ClassNotFoundException unused) {
                        zIsInstance = false;
                    }
                } else {
                    zIsInstance = false;
                }
                if (zIsInstance) {
                    superclass = superclass.getSuperclass();
                }
                while (superclass != null) {
                    for (Method method : superclass.getDeclaredMethods()) {
                        AfterPermissionGranted afterPermissionGranted = (AfterPermissionGranted) method.getAnnotation(AfterPermissionGranted.class);
                        if (afterPermissionGranted != null && afterPermissionGranted.value() == i7) {
                            if (method.getParameterTypes().length > 0) {
                                throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                            }
                            try {
                                if (!method.isAccessible()) {
                                    method.setAccessible(true);
                                }
                                method.invoke(obj, new Object[0]);
                            } catch (IllegalAccessException e10) {
                                Log.e("EasyPermissions", "runDefaultMethod:IllegalAccessException", e10);
                            } catch (InvocationTargetException e11) {
                                Log.e("EasyPermissions", "runDefaultMethod:InvocationTargetException", e11);
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
            }
        }
    }

    public static P5.a s(Map map) {
        String str = (String) Z5.c.b(map, "alg", String.class);
        if (str == null) {
            return null;
        }
        return new P5.a(str);
    }

    public static Date t(Map map) {
        if (map.get("exp") == null) {
            return null;
        }
        return new Date(Z5.c.c("exp", map) * 1000);
    }

    public static Date u(Map map) {
        if (map.get("iat") == null) {
            return null;
        }
        return new Date(Z5.c.c("iat", map) * 1000);
    }

    public static LinkedHashSet v(Map map) throws ParseException {
        g gVar;
        List<String> listE = Z5.c.e("key_ops", map);
        if (listE == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : listE) {
            if (str != null) {
                g[] gVarArrValues = g.values();
                int length = gVarArrValues.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        gVar = null;
                        break;
                    }
                    gVar = gVarArrValues[i7];
                    if (str.equals(gVar.f8997a)) {
                        break;
                    }
                    i7++;
                }
                if (gVar == null) {
                    throw new ParseException("Invalid JWK operation: ".concat(str), 0);
                }
                linkedHashSet.add(gVar);
            }
        }
        return linkedHashSet;
    }

    public static h w(Map map) throws ParseException {
        try {
            return h.a((String) Z5.c.b(map, "kty", String.class));
        } catch (IllegalArgumentException e10) {
            throw new ParseException(e10.getMessage(), 0);
        }
    }

    public static T5.i x(Map map) throws ParseException {
        String str = (String) Z5.c.b(map, "use", String.class);
        if (str == null) {
            return null;
        }
        T5.i iVar = T5.i.f9003b;
        if (str.equals(iVar.f9005a)) {
            return iVar;
        }
        T5.i iVar2 = T5.i.f9004c;
        if (str.equals(iVar2.f9005a)) {
            return iVar2;
        }
        if (str.trim().isEmpty()) {
            throw new ParseException("JWK use value must not be empty or blank", 0);
        }
        return new T5.i(str);
    }

    public static Date y(Map map) {
        if (map.get("nbf") == null) {
            return null;
        }
        return new Date(Z5.c.c("nbf", map) * 1000);
    }

    public static LinkedList z(Map map) throws ParseException {
        LinkedList linkedListJ = p118hf.a.J((List) Z5.c.b(map, "x5c", List.class));
        if (linkedListJ == null || !linkedListJ.isEmpty()) {
            return linkedListJ;
        }
        return null;
    }
}
