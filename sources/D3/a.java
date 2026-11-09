package D3;

import E.AbstractC0198c;
import H5.e;
import Kf.d;
import M.m;
import N8.q0;
import Pa.n0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.camera.camera2.internal.C0950r0;
import androidx.camera.camera2.internal.N;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.r;
import androidx.camera.video.u;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.soloader.nativeloader.NativeLoaderDelegate;
import com.google.gson.JsonParseException;
import com.google.mlkit.vision.face.Face;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.palmpay.lib.liveness.model.FacingDetectThreshold;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentCardData;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import kotlin.collections.C;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.y;
import kotlin.time.ComparableTimeMark;
import org.json.JSONException;
import p195n2.b;
import p195n2.c;
import p232p6.p;
import retrofit2.C1993k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static NativeLoaderDelegate f1585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f1586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Application f1587c;

    public static void A(File file, File file2) throws c {
        Throwable dVar;
        file.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.exists()) {
            dVar = new d(file2.getAbsolutePath());
        } else if (file.getParentFile().exists()) {
            dVar = !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null;
        } else {
            dVar = new b(file.getAbsolutePath());
        }
        c cVar = new c("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        cVar.initCause(dVar);
        throw cVar;
    }

    public static final String B(String str) {
        String strC = C(str);
        if (strC.equals("transfer")) {
            return "transfer_confirm";
        }
        return strC.equals("bill_payment") ? "bill_confirm" : "cashier";
    }

    public static final String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "payment";
        }
        if ("03".equalsIgnoreCase(str)) {
            return "transfer";
        }
        Intrinsics.e(str);
        return StringsKt.A(str, "BILLER", true) ? "bill_payment" : "payment";
    }

    public static final String D(String str, String str2, String str3, boolean z3) {
        if (str3 == null || StringsKt.F(str3)) {
            str3 = null;
        }
        if (str == null || StringsKt.F(str) || str.equalsIgnoreCase("success")) {
            str = null;
        }
        if (!z3 || str3 == null) {
            if (str != null) {
                return str;
            }
            if (str3 == null) {
                if (str2 == null || StringsKt.F(str2)) {
                    return null;
                }
                return str2;
            }
        }
        return str3;
    }

    public static final void E(IconicsDrawable iconicsDrawable, e eVar) {
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        iconicsDrawable.g(eVar != null ? eVar.a(iconicsDrawable.c(), iconicsDrawable.f23579b) : null);
    }

    public static final void F(IconicsDrawable iconicsDrawable, int i7) {
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        E(iconicsDrawable, e.f3702a.colorInt(i7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean G(ActivityResultCaller activityResultCaller, String permission) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (activityResultCaller instanceof Activity) {
            return AbstractC1032a.h((Activity) activityResultCaller, permission);
        }
        if (activityResultCaller instanceof Fragment) {
            return AbstractC1032a.h(((Fragment) activityResultCaller).requireActivity(), permission);
        }
        return false;
    }

    public static void H(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void I(AbstractC0999q abstractC0999q, ArrayList arrayList) {
        if (abstractC0999q instanceof r) {
            Iterator it = ((r) abstractC0999q).f14127a.iterator();
            while (it.hasNext()) {
                I((AbstractC0999q) it.next(), arrayList);
            }
        } else if (abstractC0999q instanceof C0950r0) {
            arrayList.add(((C0950r0) abstractC0999q).f13643a);
        } else {
            arrayList.add(new N(abstractC0999q));
        }
    }

    public static final void J(String scene, String authType, String supportStatus, String str, String str2) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(supportStatus, "supportStatus");
        ViewEvent viewEventAdd = new ViewEvent("auth_capability_check").add("scene", scene).add("auth_type", authType).add("support_status", supportStatus);
        if (str != null) {
            viewEventAdd.add("unsupported_reason", str);
        }
        viewEventAdd.add("entry_source", str2);
        n0.g().u(viewEventAdd);
    }

    public static final void K(String fallbackType, String scene) {
        Intrinsics.checkNotNullParameter("fingerprint", "originAuthType");
        Intrinsics.checkNotNullParameter(fallbackType, "fallbackType");
        Intrinsics.checkNotNullParameter(scene, "scene");
        n0.g().u(new ViewEvent("auth_fallback_used").add("origin_auth_type", "fingerprint").add("fallback_type", fallbackType).add("scene", scene));
    }

    public static final void L(String authType, String str) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        O(new Qa.a("login", authType, "login_page", "fail", "server_verify", "network", "unknown_error", str, 0, 1792));
    }

    public static final void M(String str, String authType, boolean z3, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        O(new Qa.a(C(str), authType, B(str), z3 ? "success" : "fail", "payment_confirm", str2, str3, str4, 0, 1792));
    }

    public static final void N(String action, String result, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter("fingerprint", "authType");
        Intrinsics.checkNotNullParameter(result, "result");
        ViewEvent viewEventAdd = new ViewEvent("auth_setting_change").add("action", action).add("auth_type", "fingerprint").add("result", result);
        if (str != null) {
            viewEventAdd.add("fail_code", str);
        }
        n0.g().u(viewEventAdd);
    }

    public static final void O(Qa.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ViewEvent viewEventAdd = new ViewEvent("auth_verify_result").afEvt(false).add("scene", params.f7648a).add("auth_type", params.f7649b).add("result", params.f7651d);
        viewEventAdd.add("entry_source", params.f7650c);
        viewEventAdd.add("fail_stage", params.f7652e);
        String str = params.f7653f;
        if (str != null) {
            viewEventAdd.add("fail_category", str);
        }
        String str2 = params.f7654g;
        if (str2 != null) {
            viewEventAdd.add("fail_code", str2);
        }
        String strSubstring = params.f7655h;
        if (strSubstring != null) {
            if (strSubstring.length() > 120) {
                strSubstring = strSubstring.substring(0, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            viewEventAdd.add("fail_message", strSubstring);
        }
        int i7 = params.f7656i;
        if (i7 > 0) {
            viewEventAdd.add("retry_count", String.valueOf(i7));
        }
        viewEventAdd.add("fallback_used", String.valueOf(false));
        viewEventAdd.add("fallback_type", ViewProps.NONE);
        n0.g().q(viewEventAdd);
    }

    public static final void P(View view, IconicsDrawable iconicsDrawable) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if ((iconicsDrawable instanceof I5.a ? (I5.a) iconicsDrawable : null) != null) {
            ((I5.a) iconicsDrawable).r(view);
        }
    }

    public static final void Q(TextView textView, IconicsDrawable... drawables) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(drawables, "drawables");
        ArrayList arrayList = new ArrayList();
        for (IconicsDrawable iconicsDrawable : drawables) {
            I5.a aVar = iconicsDrawable instanceof I5.a ? (I5.a) iconicsDrawable : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((I5.a) it.next()).r(textView);
        }
    }

    public static final void R(m p3) {
        int i7;
        Intrinsics.checkNotNullParameter(p3, "p");
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = p3.f5691a;
        int i10 = p3.f5692b;
        int i11 = 0;
        while (true) {
            boolean z3 = true;
            if (i11 >= i10) {
                break;
            }
            float f10 = fArr[i11];
            if (!boolValueOf.booleanValue() || 0.0f > f10 || f10 > 1.0f) {
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
            i11++;
        }
        if (!boolValueOf.booleanValue()) {
            throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + m.c(p3, 31)).toString());
        }
        Iterable iterableF = kotlin.ranges.b.f(1, p3.f5692b);
        if ((iterableF instanceof Collection) && ((Collection) iterableF).isEmpty()) {
            i7 = 0;
        } else {
            Iterator it = iterableF.iterator();
            i7 = 0;
            while (((Rf.b) it).f8613c) {
                int iA = ((C) it).a();
                if (p3.b(iA) < p3.b(iA - 1) && (i7 = i7 + 1) < 0) {
                    C1850q.j();
                    throw null;
                }
            }
        }
        if (i7 <= 1) {
            return;
        }
        throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + m.c(p3, 31)).toString());
    }

    public static final void a(String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        AbstractC0198c.e(sectionName);
    }

    public static int b(ComparableTimeMark comparableTimeMark, ComparableTimeMark other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Tf.c.c(comparableTimeMark.mo11minusUwyO8pc(other), Tf.c.f9078b.m57getZEROUwyO8pc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context c(ActivityResultCaller activityResultCaller) {
        Context contextRequireContext;
        Intrinsics.checkNotNullParameter(activityResultCaller, "<this>");
        if (activityResultCaller instanceof Activity) {
            contextRequireContext = (Context) activityResultCaller;
        } else {
            if (!(activityResultCaller instanceof Fragment)) {
                throw new IllegalArgumentException("The constructor's ActivityResultCaller argument must be Activity or Fragment.");
            }
            contextRequireContext = ((Fragment) activityResultCaller).requireContext();
        }
        Intrinsics.e(contextRequireContext);
        return contextRequireContext;
    }

    public static int d(View view, boolean z3) {
        if (view == null) {
            return 0;
        }
        if (p(view)) {
            if (!z3) {
                return view.getLeft();
            }
            int left = view.getLeft();
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            return view.getPaddingEnd() + left;
        }
        if (!z3) {
            return view.getRight();
        }
        int right = view.getRight();
        WeakHashMap weakHashMap2 = androidx.core.view.N.f16168a;
        return right - view.getPaddingEnd();
    }

    public static int e(View view) {
        if (view == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
    }

    public static int f(View view) {
        if (view == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
    }

    public static int g(View view, boolean z3) {
        if (view == null) {
            return 0;
        }
        if (p(view)) {
            if (!z3) {
                return view.getRight();
            }
            int right = view.getRight();
            WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
            return right - view.getPaddingStart();
        }
        if (!z3) {
            return view.getLeft();
        }
        int left = view.getLeft();
        WeakHashMap weakHashMap2 = androidx.core.view.N.f16168a;
        return view.getPaddingStart() + left;
    }

    public static int h(View view) {
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    public static final void i(IconicsDrawable iconicsDrawable, IIcon icon) {
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        if (!H5.b.b()) {
            Log.e("IconicsDrawable", "Iconics.init() not yet executed, icon will be missing");
        }
        iconicsDrawable.i(icon);
    }

    public static final void j(IconicsDrawable iconicsDrawable, ITypeface typeface, IIcon icon) {
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(icon, "icon");
        if (!H5.b.b()) {
            Log.e("IconicsDrawable", "Iconics.init() not yet executed, icon will be missing");
        }
        ((TextPaint) iconicsDrawable.f23580c.f3699a).setTypeface(typeface.getRawTypeface());
        iconicsDrawable.i(icon);
    }

    public static final void k(IconicsDrawable iconicsDrawable, String icon) {
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        if (!H5.b.b()) {
            Log.e("IconicsDrawable", "Iconics.init() not yet executed, icon will be missing");
        }
        try {
            Intrinsics.checkNotNullParameter(icon, "<this>");
            String key = icon.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(key, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNullParameter(key, "key");
            ITypeface iTypeface = (ITypeface) M5.a.f5770c.get(key);
            if (iTypeface == null) {
                Intrinsics.checkNotNullParameter(icon, "<this>");
                Intrinsics.checkNotNullExpressionValue(icon.substring(0, 3), "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                Intrinsics.checkNotNullParameter(icon, "<this>");
                Intrinsics.checkNotNullParameter(icon, "<this>");
                i(iconicsDrawable, iTypeface.getIcon(new Regex("-").replace(icon, "_")));
            }
        } catch (Exception unused) {
            com.growingio.android.circler.a aVar = H5.b.f3697c;
            String TAG = H5.b.f3696b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar.log(6, TAG, "Wrong icon name: " + icon, null);
        }
    }

    public static void l(NativeLoaderDelegate nativeLoaderDelegate) {
        boolean z3;
        synchronized (a.class) {
            z3 = f1585a != null;
        }
        if (z3) {
            return;
        }
        synchronized (a.class) {
            try {
                if (f1585a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f1585a = nativeLoaderDelegate;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean m(Face face2, int i7) {
        int i10;
        Intrinsics.checkNotNullParameter(face2, "face");
        Rect boundingBox = face2.getBoundingBox();
        Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
        int iCenterX = boundingBox.centerX();
        int iCenterY = boundingBox.centerY();
        int i11 = i7 / 8;
        int i12 = p292t6.a.f42345a;
        StringBuilder sbP = q0.p(i11, "gridSize: ", iCenterX, " fx: ", " fy: ");
        sbP.append(iCenterY);
        p292t6.a.a(sbP.toString());
        int i13 = i11 * 2;
        if (iCenterX >= i13 && iCenterX <= (i10 = i11 * 6) && iCenterY >= i13 && iCenterY <= i10) {
            return true;
        }
        p292t6.a.a("face center point is out of rect: (" + iCenterX + ", " + iCenterY + ")");
        return false;
    }

    public static boolean n(Face face2, int i7, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(face2, "face");
        if (i11 <= 0 || i12 <= 0) {
            return false;
        }
        Rect boundingBox = face2.getBoundingBox();
        Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
        int i14 = p292t6.a.f42345a;
        StringBuilder sbP = q0.p(i7, "imageWidth: ", i10, ", imageHeight: ", ", previewWidth: ");
        u.u(sbP, i11, ", previewHeight: ", i12, ", rotationDegrees: ");
        sbP.append(i13);
        p292t6.a.a(sbP.toString());
        Pair pair = (i13 == 90 || i13 == 270) ? new Pair(Float.valueOf(i10), Float.valueOf(i7)) : new Pair(Float.valueOf(i7), Float.valueOf(i10));
        float fFloatValue = ((Number) pair.f38891a).floatValue();
        float fFloatValue2 = ((Number) pair.f38892b).floatValue();
        float f10 = i11;
        float f11 = i12;
        float fMin = Math.min(f10 / fFloatValue, f11 / fFloatValue2);
        float f12 = 2;
        float f13 = (f10 - (fFloatValue * fMin)) / f12;
        float fA = u.a(fFloatValue2, fMin, f11, f12);
        Rect rect = new Rect((int) (f10 - ((boundingBox.right * fMin) + f13)), (int) ((boundingBox.top * fMin) + fA), (int) (f10 - ((boundingBox.left * fMin) + f13)), (int) ((boundingBox.bottom * fMin) + fA));
        p292t6.a.a("uiRect: " + rect);
        return new RectF(0.0f, 0.0f, f10, f11).contains(new RectF(rect));
    }

    public static boolean o(Face face2) {
        Float headEulerAngleX;
        Float headEulerAngleY;
        Float headEulerAngleZ;
        ExtendFeature extendFeature;
        Intrinsics.checkNotNullParameter(face2, "face");
        r6.a aVar = p.f41237d;
        FacingDetectThreshold facingDetectThresholdObj = (aVar == null || (extendFeature = aVar.f41587s) == null) ? null : extendFeature.getFacingDetectThresholdObj();
        float fFloatValue = (facingDetectThresholdObj == null || (headEulerAngleZ = facingDetectThresholdObj.getHeadEulerAngleZ()) == null) ? 7.78f : headEulerAngleZ.floatValue();
        float fFloatValue2 = (facingDetectThresholdObj == null || (headEulerAngleY = facingDetectThresholdObj.getHeadEulerAngleY()) == null) ? 11.8f : headEulerAngleY.floatValue();
        float fFloatValue3 = (facingDetectThresholdObj == null || (headEulerAngleX = facingDetectThresholdObj.getHeadEulerAngleX()) == null) ? 19.8f : headEulerAngleX.floatValue();
        return face2.getHeadEulerAngleZ() < fFloatValue && face2.getHeadEulerAngleZ() > (-fFloatValue) && face2.getHeadEulerAngleY() < fFloatValue2 && face2.getHeadEulerAngleY() > (-fFloatValue2) && face2.getHeadEulerAngleX() < fFloatValue3 && face2.getHeadEulerAngleX() > (-fFloatValue3);
    }

    public static boolean p(View view) {
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        return view.getLayoutDirection() == 1;
    }

    public static final float q(m xValues, m yValues, float f10) {
        int iA;
        int i7;
        Intrinsics.checkNotNullParameter(xValues, "xValues");
        Intrinsics.checkNotNullParameter(yValues, "yValues");
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f10).toString());
        }
        Iterator it = kotlin.ranges.b.f(0, xValues.f5692b).iterator();
        while (true) {
            if (!it.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            iA = ((C) it).a();
            float fB = xValues.b(iA);
            i7 = iA + 1;
            float fB2 = xValues.b(i7 % xValues.f5692b);
            if (fB2 >= fB) {
                if (fB <= f10 && f10 <= fB2) {
                    break;
                }
            } else if (f10 >= fB || f10 <= fB2) {
                break;
            }
        }
        int i10 = i7 % xValues.f5692b;
        float fD = t0.u.d(xValues.b(i10) - xValues.b(iA), 1.0f);
        return t0.u.d((t0.u.d(yValues.b(i10) - yValues.b(iA), 1.0f) * (fD < 0.001f ? 0.5f : t0.u.d(f10 - xValues.b(iA), 1.0f) / fD)) + yValues.b(iA), 1.0f);
    }

    public static boolean r(String str) {
        NativeLoaderDelegate nativeLoaderDelegate;
        synchronized (a.class) {
            nativeLoaderDelegate = f1585a;
            if (nativeLoaderDelegate == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return nativeLoaderDelegate.loadLibrary(str, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    public static final Qa.a s(int i7, CharSequence charSequence, String scene, String str, int i10) {
        Qa.b bVar;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter("fingerprint", "authType");
        String string = charSequence != null ? charSequence.toString() : null;
        if (i7 == 1) {
            bVar = new Qa.b("fail", "device", "hardware_unavailable");
        } else if (i7 == 3) {
            bVar = new Qa.b("timeout", "unknown", "timeout");
        } else if (i7 == 5) {
            bVar = new Qa.b(PPRNBridge.DIALOG_ACTION_CANCEL, "system_permission", "system_cancelled");
        } else if (i7 == 7) {
            bVar = new Qa.b("fail", "device", "biometric_lockout");
        } else if (i7 != 13) {
            switch (i7) {
                case 9:
                    bVar = new Qa.b("fail", "device", "biometric_lockout");
                    break;
                case 10:
                    bVar = new Qa.b(PPRNBridge.DIALOG_ACTION_CANCEL, "user_action", "user_cancelled");
                    break;
                case 11:
                    bVar = new Qa.b("fail", "device", "biometric_not_enrolled");
                    break;
                default:
                    bVar = new Qa.b("fail", "unknown", "unknown_error");
                    break;
            }
        } else {
            bVar = new Qa.b(PPRNBridge.DIALOG_ACTION_CANCEL, "user_action", "user_cancelled");
        }
        String str2 = bVar.f7659c;
        return new Qa.a(scene, "fingerprint", str, bVar.f7657a, "biometric_prompt", bVar.f7658b, str2, (string == null || StringsKt.F(string)) ? str2 : string, i10, 1536);
    }

    public static final Pair t(String str, boolean z3, boolean z8) {
        if (z3) {
            return new Pair("user_action", "too_many_attempts");
        }
        if (!z8 && (str == null || str.length() == 0)) {
            return new Pair("user_action", "password_incorrect");
        }
        Pair pairU = u(str);
        String str2 = (String) pairU.f38891a;
        String str3 = (String) pairU.f38892b;
        return Intrinsics.c(str3, "pin_incorrect") ? new Pair("user_action", "password_incorrect") : new Pair(str2, str3);
    }

    public static final Pair u(String str) {
        if (str == null) {
            return new Pair("unknown", "unknown_error");
        }
        if (str.equalsIgnoreCase(CommonResult.CODE_PIN_LOCKED) || str.equalsIgnoreCase("pin_300026")) {
            return new Pair("user_action", "too_many_attempts");
        }
        if (str.equalsIgnoreCase("pin_300001")) {
            return new Pair("user_action", "pin_incorrect");
        }
        return y.m(str, "pin_", true) ? new Pair("user_action", str) : new Pair("server", str);
    }

    public static void v(File file) throws p195n2.a {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                d dVar = new d(file.getAbsolutePath());
                p195n2.a aVar = new p195n2.a(absolutePath);
                aVar.initCause(dVar);
                throw aVar;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new p195n2.a(file.getAbsolutePath());
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[PHI: r5
      0x0038: PHI (r5v7 int) = (r5v5 int), (r5v8 int) binds: [B:33:0x0054, B:21:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    public static void w(MobileInstallmentCardData mobileInstallmentCardData) {
        int iIntValue;
        Bundle bundle = new Bundle();
        String loanNo = mobileInstallmentCardData != null ? mobileInstallmentCardData.getLoanNo() : null;
        if (loanNo == null) {
            loanNo = "";
        }
        bundle.putString("loanNo", loanNo);
        String cardNo = mobileInstallmentCardData != null ? mobileInstallmentCardData.getCardNo() : null;
        bundle.putString("cardNo", cardNo != null ? cardNo : "");
        int i7 = 0;
        if (mobileInstallmentCardData != null) {
            Integer overdueDays = mobileInstallmentCardData.getOverdueDays();
            if (overdueDays != null) {
                iIntValue = overdueDays.intValue();
                if (iIntValue >= 0) {
                    i7 = iIntValue;
                }
            } else {
                Integer overDueStatus = mobileInstallmentCardData.getOverDueStatus();
                if (overDueStatus != null && overDueStatus.intValue() == 1) {
                    Integer lockDay = mobileInstallmentCardData.getLockDay();
                    iIntValue = lockDay != null ? lockDay.intValue() : 0;
                    if (iIntValue >= 0) {
                        i7 = iIntValue;
                    }
                }
            }
        }
        bundle.putInt("overdueDays", i7);
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "MobileInstallmentDailyRepaymentHome");
    }

    public static final String x(Throwable e10) {
        String str;
        Intrinsics.checkNotNullParameter(e10, "e");
        if (e10 instanceof C1993k) {
            int i7 = ((C1993k) e10).f41932a;
            if (i7 == 404) {
                return "Service unavailable";
            }
            return i7 == 400 ? "Bad request" : "Bad network";
        }
        if ((e10 instanceof ConnectException) || (e10 instanceof UnknownHostException) || (e10 instanceof SSLHandshakeException)) {
            return "Connection error";
        }
        if (e10 instanceof InterruptedIOException) {
            return CommonResult.ERROR_MSG_CONNECT_TIMEOUT;
        }
        if ((e10 instanceof JsonParseException) || (e10 instanceof JSONException) || (e10 instanceof ParseException)) {
            return "Bad response";
        }
        if (e10 instanceof CancellationException) {
            return "";
        }
        if (!(e10 instanceof p046d4.a)) {
            return "Unknown Error";
        }
        p046d4.a aVar = (p046d4.a) e10;
        return (!Intrinsics.c(aVar.f35519a, CommonResult.CODE_FAIL) || (str = aVar.f35520b) == null) ? "" : str;
    }

    public static X509Certificate y(byte[] bArr) throws CertificateException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        if (certificateGenerateCertificate instanceof X509Certificate) {
            return (X509Certificate) certificateGenerateCertificate;
        }
        throw new CertificateException("Not a X.509 certificate: " + certificateGenerateCertificate.getType());
    }

    public static Object z(Class cls, String str, Class[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Throwable th) {
            if (th instanceof NoSuchMethodException) {
                Class superclass = cls.getSuperclass();
                if (superclass != null) {
                    return z(superclass, str, clsArr, objArr);
                }
            } else {
                Throwable cause = th.getCause();
                if (cause instanceof IllegalArgumentException) {
                    throw new IllegalArgumentException(cause.getMessage());
                }
            }
            return null;
        }
    }
}
