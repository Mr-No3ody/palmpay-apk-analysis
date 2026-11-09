package Z4;

import C0.C0114f;
import Da.i;
import E.AbstractC0198c;
import G7.j;
import M7.r;
import N8.q0;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.camera.core.impl.C1005t0;
import androidx.camera.core.impl.y0;
import androidx.core.view.C1052d;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import androidx.core.view.w0;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.JsonParseException;
import com.growingio.android.sdk.autotrack.GrowingAppModule;
import com.growingio.android.sdk.track.log.ILogger;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.util.network.PPNetworkUtils$OnNetworkFailListener;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanV4Data;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanV4Group;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import io.reactivex.Observer;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p025ba.k;
import p198n5.h;
import p355xf.l;
import retrofit2.C1993k;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.K;
import t0.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements Observer, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile c f11512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f11513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f11514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f11515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f11516e;

    public static final void A(Path path, Af.d dVar) {
        path.rewind();
        int iA = dVar.a();
        boolean z3 = true;
        for (int i7 = 0; i7 < iA; i7++) {
            t0.e eVar = (t0.e) dVar.get(i7);
            if (z3) {
                float[] fArr = eVar.f42277a;
                path.moveTo(fArr[0], fArr[1]);
                z3 = false;
            }
            float[] fArr2 = eVar.f42277a;
            path.cubicTo(fArr2[2], fArr2[3], fArr2[4], fArr2[5], eVar.a(), eVar.b());
        }
        path.close();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    public static BillerListItemBean B(List list, List list2, String str) {
        Iterator it;
        Object obj = null;
        if (str != null) {
            if (str.length() <= 0 || list2 == null || !list2.contains(str)) {
                str = null;
            }
            if (str != null) {
                if (list != null) {
                    for (Object obj2 : list) {
                        if (Intrinsics.c(((BillerListItemBean) obj2).getBillerId(), str)) {
                            obj = obj2;
                            break;
                        }
                    }
                    return (BillerListItemBean) obj;
                }
            } else if (list != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    BillerListItemBean billerListItemBean = (BillerListItemBean) it.next();
                    if (list2 == null) {
                    }
                }
            }
        } else if (list != null) {
            it = list.iterator();
            while (it.hasNext()) {
                BillerListItemBean billerListItemBean2 = (BillerListItemBean) it.next();
                if (list2 == null && CollectionsKt.A(list2, billerListItemBean2.getBillerId())) {
                    return billerListItemBean2;
                }
            }
        }
        return null;
    }

    public static void E(Screen screen, Activity activity) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Screen screenE = e(screen, r.f5849c);
        boolean zBooleanValue = (screenE == null || (bool = screenE.isStatusBarHidden) == null) ? false : bool.booleanValue();
        Window window = activity.getWindow();
        UiThreadUtil.runOnUiThread(new D.b(zBooleanValue, new w0(window.getDecorView(), window), 2));
    }

    public static final void F(View view, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (num != null) {
                marginLayoutParams.topMargin = num.intValue();
            }
            if (num2 != null) {
                marginLayoutParams.leftMargin = num2.intValue();
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void G(Screen screen, Activity activity) {
        org.chromium.support_lib_boundary.util.b s0Var;
        org.chromium.support_lib_boundary.util.b s0Var2;
        Boolean bool;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        Screen screenE = e(screen, r.f5850d);
        if (!((screenE == null || (bool = screenE.isNavigationBarHidden) == null) ? false : bool.booleanValue())) {
            C1052d c1052d = new C1052d(window.getDecorView(), 4);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 35) {
                s0Var = new v0(window, c1052d);
            } else if (i7 >= 30) {
                s0Var = new u0(window, c1052d);
            } else {
                s0Var = i7 >= 26 ? new s0(window, c1052d) : new r0(window, c1052d);
            }
            s0Var.k0(2);
            return;
        }
        C1052d c1052d2 = new C1052d(window.getDecorView(), 4);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            s0Var2 = new v0(window, c1052d2);
        } else if (i10 >= 30) {
            s0Var2 = new u0(window, c1052d2);
        } else {
            s0Var2 = i10 >= 26 ? new s0(window, c1052d2) : new r0(window, c1052d2);
        }
        s0Var2.G(2);
        s0Var2.h0();
    }

    public static final void H(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
    }

    public static void I(Activity activity) {
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(activity.getColor(L6.b.ppColorBackgroundLight));
    }

    public static void J(Screen screen, Activity activity, ReactContext reactContext) {
        String statusBarStyle;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        Screen screenE = e(screen, r.f5848b);
        if (screenE == null || (statusBarStyle = screenE.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new i(activity, statusBarStyle, 1));
    }

    public static final void K(View view, boolean z3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!z3) {
            if (view.getVisibility() == 8 || view.getVisibility() == 4) {
                return;
            }
            view.animate().alpha(0.0f).setDuration(500L).setListener(new j(view, 3));
            return;
        }
        if (view.getVisibility() == 0) {
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(500L).setListener(null);
    }

    public static String L(String str, byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 2)));
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(privateKeyGeneratePrivate);
        signature.update(bArr);
        return new String(Base64.encode(signature.sign(), 2));
    }

    public static void M(Application application, p1.d dVar) {
        if (f11512a != null) {
            h.c("GrowingAutotracker", "CdpAutotracker is running", new Object[0]);
            return;
        }
        new GrowingAppModule();
        if (TextUtils.isEmpty(((b) ((HashMap) dVar.f41179c).get(b.class)).f11510a)) {
            throw new IllegalStateException("DataSourceId is NULL");
        }
        com.growingio.android.sdk.a aVar = (com.growingio.android.sdk.a) dVar.f41178b;
        HashMap map = (HashMap) dVar.f41179c;
        Object[] objArr = new Object[0];
        Iterator it = h.f39849b.entrySet().iterator();
        while (it.hasNext()) {
            ((ILogger) ((Map.Entry) it.next()).getValue()).w("ConfigurationProvider", "Warning!! GrowingSDK already has the config, please don't initialized again!", objArr);
        }
        p279s5.d.f42023d = new p279s5.d(aVar, map);
        f11512a = new c(application);
        Object[] objArr2 = new Object[0];
        Iterator it2 = h.f39849b.entrySet().iterator();
        while (it2.hasNext()) {
            ((ILogger) ((Map.Entry) it2.next()).getValue()).i("GrowingAutotracker", "!!! Thank you very much for using GrowingIO. We will do our best to provide you with the best service. !!!", objArr2);
        }
        Object[] objArr3 = new Object[0];
        Iterator it3 = h.f39849b.entrySet().iterator();
        while (it3.hasNext()) {
            ((ILogger) ((Map.Entry) it3.next()).getValue()).i("GrowingAutotracker", "!!! GrowingIO Tracker version: 3.3.6 !!!", objArr3);
        }
        p279s5.d.b();
        ((com.growingio.android.sdk.a) p279s5.d.b().f42025b).getClass();
        h.a("GrowingAutotracker", "GrowingSDK display config info only in debug environment.", new Object[0]);
    }

    public static int N(int i7, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final t O(t tVar, Matrix matrix) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        p039cb.c f10 = new p039cb.c(16, new float[2], matrix);
        tVar.getClass();
        Intrinsics.checkNotNullParameter(f10, "f");
        long jK0 = AbstractC0198c.k0(M.h.a(tVar.f42308b, tVar.f42309c), f10);
        Af.d dVarB = C1849p.b();
        AbstractList abstractList = tVar.f42307a;
        int size = abstractList.size();
        for (int i7 = 0; i7 < size; i7++) {
            dVarB.add(((t0.j) abstractList.get(i7)).a(f10));
        }
        return new t(C1849p.a(dVarB), AbstractC0198c.F(jK0), AbstractC0198c.G(jK0));
    }

    public static void P(Screen screen, Activity activity, ReactContext reactContext) {
        Integer screenOrientation;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (f11513b) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            if (activity != null) {
                Screen screenE = e(screen, r.f5847a);
                activity.setRequestedOrientation((screenE == null || (screenOrientation = screenE.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
            }
        }
        if (f11514c) {
            J(screen, activity, reactContext);
            E(screen, activity);
        }
        if (f11515d) {
            G(screen, activity);
        }
    }

    public static boolean a(Screen screen, r rVar) {
        int iOrdinal = rVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new l();
                        }
                        if (screen.isNavigationBarHidden == null) {
                            return false;
                        }
                    } else if (screen.isStatusBarAnimated == null) {
                        return false;
                    }
                } else if (screen.isStatusBarHidden == null) {
                    return false;
                }
            } else if (screen.getStatusBarStyle() == null) {
                return false;
            }
        } else if (screen.getScreenOrientation() == null) {
            return false;
        }
        return true;
    }

    public static Screen b(Screen screen, r rVar) {
        ScreenFragmentWrapper fragmentWrapper;
        if (screen == null || (fragmentWrapper = screen.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator<ScreenContainer> it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            Screen topScreen = it.next().getTopScreen();
            Screen screenB = b(topScreen, rVar);
            if (screenB != null) {
                return screenB;
            }
            if (topScreen != null && a(topScreen, rVar)) {
                return topScreen;
            }
        }
        return null;
    }

    public static String c(String str) {
        String strDecode;
        String str2;
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile("\\[\\[(.*?)\\]\\]").matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                try {
                    try {
                        str2 = new String(Base64.decode(strGroup, 0), "utf-8");
                    } catch (Exception unused) {
                        strDecode = URLDecoder.decode(strGroup, Constants.ENCODING);
                        str2 = strDecode;
                        matcher.appendReplacement(stringBuffer, str2);
                    }
                } catch (Exception unused2) {
                    strDecode = "";
                    str2 = strDecode;
                }
                matcher.appendReplacement(stringBuffer, str2);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (Exception unused3) {
            return str;
        }
    }

    public static String d(Throwable th) {
        if (th == null) {
            return "";
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message) || !message.startsWith("E2EE")) {
            return "";
        }
        int iIndexOf = message.indexOf(58);
        if (iIndexOf >= 0) {
            message = message.substring(0, iIndexOf);
        }
        return TextUtils.isEmpty(message) ? "" : message;
    }

    public static Screen e(Screen screen, r rVar) {
        Screen screenB = b(screen, rVar);
        if (screenB != null) {
            return screenB;
        }
        if (a(screen, rVar)) {
            return screen;
        }
        for (ViewParent container = screen.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen2 = (Screen) container;
                if (a(screen2, rVar)) {
                    return screen2;
                }
            }
        }
        return null;
    }

    public static c f() {
        if (f11512a == null) {
            h.c("GrowingAutotracker", "CdpAutotracker is UNINITIALIZED, please initialized before use API", new Object[0]);
            return new c(null);
        }
        synchronized (e.class) {
            try {
                if (f11512a != null) {
                    return f11512a;
                }
                h.c("GrowingAutotracker", "CdpAutotracker is UNINITIALIZED, please initialized before use API", new Object[0]);
                return new c(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:283:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:315:0x0552  */
    /* JADX WARN: Multi-variable type inference failed */
    public static y0 g(androidx.camera.camera2.internal.compat.l lVar) {
        boolean z3;
        boolean z8;
        boolean z10;
        boolean z11;
        Integer num;
        androidx.camera.core.impl.v0 v0Var = androidx.camera.core.impl.v0.f14272c;
        v0Var.getClass();
        try {
            C1005t0 c1005t0 = (C1005t0) v0Var.f14273a.fetchData().get();
            ArrayList arrayList = new ArrayList();
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num2 = (Integer) lVar.a(key);
            boolean z12 = false;
            if (c1005t0.a(AeFpsRangeLegacyQuirk.class, num2 != null && num2.intValue() == 2)) {
                arrayList.add(new AeFpsRangeLegacyQuirk(lVar));
            }
            if (c1005t0.a(AspectRatioLegacyApi21Quirk.class, false)) {
                arrayList.add(new AspectRatioLegacyApi21Quirk());
            }
            HashSet hashSet = JpegHalCorruptImageQuirk.f13468a;
            String str = Build.DEVICE;
            Locale locale = Locale.US;
            if (c1005t0.a(JpegHalCorruptImageQuirk.class, hashSet.contains(str.toLowerCase(locale)))) {
                arrayList.add(new JpegHalCorruptImageQuirk());
            }
            HashSet hashSet2 = JpegCaptureDownsizingQuirk.f13467a;
            String str2 = Build.MODEL;
            if (c1005t0.a(JpegCaptureDownsizingQuirk.class, hashSet2.contains(str2.toLowerCase(locale)) && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new JpegCaptureDownsizingQuirk());
            }
            Integer num3 = (Integer) lVar.a(key);
            if (c1005t0.a(CamcorderProfileResolutionQuirk.class, num3 != null && num3.intValue() == 2)) {
                arrayList.add(new CamcorderProfileResolutionQuirk(lVar));
            }
            String str3 = Build.HARDWARE;
            if (c1005t0.a(CaptureNoResponseQuirk.class, ("samsungexynos7420".equalsIgnoreCase(str3) || "universal7420".equalsIgnoreCase(str3)) && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CaptureNoResponseQuirk());
            }
            Integer num4 = (Integer) lVar.a(key);
            if (c1005t0.a(LegacyCameraOutputConfigNullPointerQuirk.class, num4 != null && num4.intValue() == 2)) {
                arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
            }
            if (c1005t0.a(LegacyCameraSurfaceCleanupQuirk.class, Build.VERSION.SDK_INT < 29 && (num = (Integer) lVar.a(key)) != null && num.intValue() == 2)) {
                arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
            }
            List list = ImageCaptureWashedOutImageQuirk.f13462a;
            if (c1005t0.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.f13462a.contains(str2.toUpperCase(locale)) && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWashedOutImageQuirk());
            }
            List list2 = CameraNoResponseWhenEnablingFlashQuirk.f13448a;
            if (c1005t0.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.f13448a.contains(str2.toUpperCase(locale)) && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
            }
            String str4 = Build.BRAND;
            if (c1005t0.a(YuvImageOnePixelShiftQuirk.class, ("motorola".equalsIgnoreCase(str4) && "MotoG3".equalsIgnoreCase(str2)) || (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str4) && "SM-G532F".equalsIgnoreCase(str2)) || ((Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str4) && "SM-J700F".equalsIgnoreCase(str2)) || ((Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str4) && "SM-A920F".equalsIgnoreCase(str2)) || ((Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(str4) && "SM-J415F".equalsIgnoreCase(str2)) || (Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(str4) && "Mi A1".equalsIgnoreCase(str2))))))) {
                arrayList.add(new YuvImageOnePixelShiftQuirk());
            }
            Iterator it = FlashTooSlowQuirk.f13456a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                        if (((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                break;
            }
            if (c1005t0.a(FlashTooSlowQuirk.class, z3)) {
                arrayList.add(new FlashTooSlowQuirk());
            }
            if (c1005t0.a(AfRegionFlipHorizontallyQuirk.class, Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new AfRegionFlipHorizontallyQuirk());
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num5 = (Integer) lVar.a(key2);
            if (c1005t0.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, num5 != null && num5.intValue() == 2)) {
                arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
            }
            Integer num6 = (Integer) lVar.a(key2);
            if (c1005t0.a(PreviewOrientationIncorrectQuirk.class, num6 != null && num6.intValue() == 2)) {
                arrayList.add(new PreviewOrientationIncorrectQuirk());
            }
            Integer num7 = (Integer) lVar.a(key2);
            if (c1005t0.a(CaptureSessionStuckQuirk.class, num7 != null && num7.intValue() == 2)) {
                arrayList.add(new CaptureSessionStuckQuirk());
            }
            List list3 = ImageCaptureFlashNotFireQuirk.f13459a;
            String str5 = Build.MODEL;
            Locale locale2 = Locale.US;
            if (c1005t0.a(ImageCaptureFlashNotFireQuirk.class, (ImageCaptureFlashNotFireQuirk.f13460b.contains(str5.toLowerCase(locale2)) && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || ImageCaptureFlashNotFireQuirk.f13459a.contains(str5.toLowerCase(locale2)))) {
                arrayList.add(new ImageCaptureFlashNotFireQuirk());
            }
            List list4 = ImageCaptureWithFlashUnderexposureQuirk.f13463a;
            if (c1005t0.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.f13463a.contains(str5.toLowerCase(locale2)) && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
            }
            List list5 = ImageCaptureFailWithAutoFlashQuirk.f13457a;
            if (c1005t0.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.f13457a.contains(str5.toLowerCase(locale2)) && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
            }
            Integer num8 = (Integer) lVar.a(key2);
            if (c1005t0.a(IncorrectCaptureStateQuirk.class, num8 != null && num8.intValue() == 2)) {
                arrayList.add(new IncorrectCaptureStateQuirk());
            }
            Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.f13472b.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).equals((String) it2.next())) {
                        if (((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            z8 = true;
                            break;
                        }
                    }
                }
                z8 = false;
                break;
            }
            if (c1005t0.a(TorchFlashRequiredFor3aUpdateQuirk.class, z8)) {
                arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(lVar));
            }
            String str6 = Build.MANUFACTURER;
            if (c1005t0.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ("HUAWEI".equalsIgnoreCase(str6) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str6) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str6) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str6) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(str6) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str6) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            if (c1005t0.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(str6))) {
                arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
            }
            if (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.a() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.b() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.e() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.c()) {
                z10 = true;
            } else {
                String str7 = Build.MODEL;
                if (("pixel 4 xl".equalsIgnoreCase(str7) && Build.VERSION.SDK_INT == 29) || (("motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(str7)) || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.d())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (c1005t0.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z10)) {
                arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
            }
            String str8 = Build.MODEL;
            if (c1005t0.a(TemporalNoiseQuirk.class, "Pixel 8".equalsIgnoreCase(str8) && ((Integer) lVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new TemporalNoiseQuirk());
            }
            HashSet hashSet3 = ImageCaptureFailedForVideoSnapshotQuirk.f13458a;
            Locale locale3 = Locale.US;
            if (hashSet3.contains(str8.toLowerCase(locale3)) || (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER))) {
                z11 = true;
            } else {
                String str9 = Build.HARDWARE;
                if (str9.toLowerCase(locale3).startsWith("ums")) {
                    z11 = true;
                } else {
                    String str10 = Build.BRAND;
                    if (("itel".equalsIgnoreCase(str10) && str9.toLowerCase(locale3).startsWith("sp")) || ("HUAWEI".equalsIgnoreCase(str10) && "FIG-LX1".equalsIgnoreCase(str8))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
            if (c1005t0.a(ImageCaptureFailedForVideoSnapshotQuirk.class, z11)) {
                arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
            }
            if (Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND) && str8.toLowerCase(locale3).startsWith("sm-m556")) {
                z12 = true;
            }
            if (c1005t0.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, z12)) {
                arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
            }
            y0 y0Var = new y0(arrayList);
            y0.d(y0Var);
            p140j8.f.G("CameraQuirks");
            return y0Var;
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    public static String h(Context context, String str) {
        String str2;
        HashMap map;
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            str2 = applicationInfo == null ? null : applicationInfo.sourceDir;
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            map = null;
        } else {
            try {
                String strT = J3.a.t(new File(str2));
                if (strT == null) {
                    map = null;
                } else {
                    JSONObject jSONObject = new JSONObject(strT);
                    Iterator<String> itKeys = jSONObject.keys();
                    map = new HashMap();
                    while (itKeys.hasNext()) {
                        String string = itKeys.next().toString();
                        map.put(string, jSONObject.getString(string));
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public static String i(String str) {
        return TextUtils.isEmpty(str) ? "App service busy. Please try again later." : q0.k("App service busy. Please try again later.(", str, ")");
    }

    public static String j(String str) {
        return TextUtils.isEmpty(str) ? "Network Connection issue. Please check network settings or retry." : q0.k("Network Connection issue. Please check network settings or retry.(", str, ")");
    }

    public static String k(String str) {
        String strReplace = str.trim().replace(" ", "").replace("-", "").replace("+", "");
        if (!BaseApplication.isNG()) {
            return strReplace;
        }
        if (strReplace.length() == 10) {
            return "0".concat(strReplace);
        }
        if (strReplace.length() == 11 || strReplace.length() <= 11) {
            return strReplace;
        }
        if (strReplace.startsWith("234")) {
            String strSubstring = strReplace.substring(3, strReplace.length());
            return strSubstring.length() == 10 ? "0".concat(strSubstring) : strSubstring;
        }
        if (!strReplace.startsWith("0234")) {
            return strReplace;
        }
        String strSubstring2 = strReplace.substring(4, strReplace.length());
        return strSubstring2.length() == 10 ? "0".concat(strSubstring2) : strSubstring2;
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str)) {
            return "#";
        }
        String upperCase = str.substring(0, 1).toUpperCase();
        return !upperCase.matches("[A-Z]") ? "#" : upperCase;
    }

    public static final p140j8.d n(ViewGroup rootView, View view) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new p140j8.d(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Object o(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return F.b.b(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (ActivityResult.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 int, still in use, count: 6, list:
      (r1v0 int) from 0x0016: IF  (r1v0 int) == (1540 int)  -> B:61:0x00cc A[HIDDEN] (LINE:23)
      (r1v0 int) from 0x001a: IF  (r1v0 int) == (1607 int)  -> B:56:0x00b9 A[HIDDEN] (LINE:27)
      (r1v0 int) from 0x001e: IF  (r1v0 int) == (1633 int)  -> B:51:0x00a6 A[HIDDEN] (LINE:31)
      (r1v0 int) from 0x0022: IF  (r1v0 int) == (1821 int)  -> B:46:0x0093 A[HIDDEN] (LINE:35)
      (r1v0 int) from 0x0026: IF  (r1v0 int) == (3711 int)  -> B:41:0x0080 A[HIDDEN] (LINE:39)
      (r1v0 int) from 0x002a: IF  (r1v0 int) == (3713 int)  -> B:36:0x006d A[HIDDEN] (LINE:43)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public static String p(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Application application = BaseApplication.getApplication();
        if (str == null) {
            return "";
        }
        if (iHashCode == 1540) {
            if (!str.equals("04")) {
                return "";
            }
            String string = application.getString(k.airtime_result_pop_slot_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (iHashCode == 1607) {
            if (!str.equals("29")) {
                return "";
            }
            String string2 = application.getString(k.net_result_pop_slot_id);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (iHashCode == 1633) {
            if (!str.equals(TransType.TRANS_TYPE_BUNDLE)) {
                return "";
            }
            String string3 = application.getString(k.data_bundle_result_pop_slot_id);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (iHashCode == 1821) {
            if (!str.equals(TransType.TRANS_TYPE_BILLER_BETTING)) {
                return "";
            }
            String string4 = application.getString(k.betting_result_page_pop_slot_id);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (iHashCode == 3711) {
            if (!str.equals(TransType.TRANS_TYPE_GIFT_CARD)) {
                return "";
            }
            String string5 = application.getString(Vd.a.ad_payment_popu_gift_card_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (iHashCode == 3713) {
            if (!str.equals(TransType.TRANS_TYPE_TRIP)) {
                return "";
            }
            String string6 = application.getString(Vd.a.ad_payment_popu_trip_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        switch (str) {
            case "15":
                String string7 = application.getString(k.water_result_pop_slot_id);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case "16":
                String string8 = application.getString(k.electricity_result_pop_slot_id);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case "17":
                String string9 = application.getString(k.tv_result_page_pop_slot_id);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            default:
                return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    public static final p140j8.a q(View view) {
        p140j8.a aVar;
        Insets insets;
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getHeight() != 0) {
            View rootView = view.getRootView();
            Intrinsics.e(rootView);
            if (Build.VERSION.SDK_INT >= 30) {
                WindowInsets rootWindowInsets = rootView.getRootWindowInsets();
                if (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar())) == null) {
                    aVar = null;
                } else {
                    aVar = new p140j8.a(insets.top, insets.right, insets.bottom, insets.left);
                }
            } else {
                WindowInsets rootWindowInsets2 = rootView.getRootWindowInsets();
                if (rootWindowInsets2 == null) {
                    aVar = null;
                } else {
                    aVar = new p140j8.a(rootWindowInsets2.getSystemWindowInsetTop(), rootWindowInsets2.getSystemWindowInsetRight(), Math.min(rootWindowInsets2.getSystemWindowInsetBottom(), rootWindowInsets2.getStableInsetBottom()), rootWindowInsets2.getSystemWindowInsetLeft());
                }
            }
            if (aVar != null) {
                float width = rootView.getWidth();
                float height = rootView.getHeight();
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                return new p140j8.a(Math.max(aVar.f38332a - rect.top, 0.0f), Math.max(Math.min((view.getWidth() + rect.left) - width, 0.0f) + aVar.f38333b, 0.0f), Math.max(Math.min((view.getHeight() + rect.top) - height, 0.0f) + aVar.f38334c, 0.0f), Math.max(aVar.f38335d - rect.left, 0.0f));
            }
        }
        return null;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 int, still in use, count: 10, list:
      (r1v0 int) from 0x0016: IF  (r1v0 int) == (1540 int)  -> B:89:0x012c A[HIDDEN] (LINE:23)
      (r1v0 int) from 0x001a: IF  (r1v0 int) == (1607 int)  -> B:84:0x0119 A[HIDDEN] (LINE:27)
      (r1v0 int) from 0x001e: IF  (r1v0 int) == (1821 int)  -> B:79:0x0106 A[HIDDEN] (LINE:31)
      (r1v0 int) from 0x0022: IF  (r1v0 int) == (3117 int)  -> B:74:0x00f3 A[HIDDEN] (LINE:35)
      (r1v0 int) from 0x0026: IF  (r1v0 int) == (3711 int)  -> B:69:0x00e0 A[HIDDEN] (LINE:39)
      (r1v0 int) from 0x002a: IF  (r1v0 int) == (3713 int)  -> B:64:0x00cd A[HIDDEN] (LINE:43)
      (r1v0 int) from 0x002e: IF  (r1v0 int) == (1633 int)  -> B:59:0x00b9 A[HIDDEN] (LINE:47)
      (r1v0 int) from 0x0032: IF  (r1v0 int) == (1634 int)  -> B:54:0x00a5 A[HIDDEN] (LINE:51)
      (r1v0 int) from 0x0036: IF  (r1v0 int) == (1790 int)  -> B:49:0x0091 A[HIDDEN] (LINE:55)
      (r1v0 int) from 0x003a: IF  (r1v0 int) == (1791 int)  -> B:44:0x007d A[HIDDEN] (LINE:59)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public static String r(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Application application = BaseApplication.getApplication();
        if (str == null) {
            return "";
        }
        if (iHashCode == 1540) {
            if (!str.equals("04")) {
                return "";
            }
            String string = application.getString(k.ad_payment_airtime_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (iHashCode == 1607) {
            if (!str.equals("29")) {
                return "";
            }
            String string2 = application.getString(k.ad_payment_internet_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (iHashCode == 1821) {
            if (!str.equals(TransType.TRANS_TYPE_BILLER_BETTING)) {
                return "";
            }
            String string3 = application.getString(k.ad_payment_betting_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (iHashCode == 3117) {
            if (!str.equals(TransType.TRANS_TYPE_PAY_MONEY_TO_PALMPAY_BUSINESS)) {
                return "";
            }
            String string4 = application.getString(k.ad_payment_pay_money_to_palmpay_business_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (iHashCode == 3711) {
            if (!str.equals(TransType.TRANS_TYPE_GIFT_CARD)) {
                return "";
            }
            String string5 = application.getString(k.ad_payment_gift_card_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (iHashCode == 3713) {
            if (!str.equals(TransType.TRANS_TYPE_TRIP)) {
                return "";
            }
            String string6 = application.getString(Vd.a.ad_payment_trip_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        if (iHashCode == 1633) {
            if (!str.equals(TransType.TRANS_TYPE_BUNDLE)) {
                return "";
            }
            String string7 = application.getString(k.ad_payment_bundle_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            return string7;
        }
        if (iHashCode == 1634) {
            if (!str.equals(TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT)) {
                return "";
            }
            String string8 = application.getString(k.ad_payment_third_part_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            return string8;
        }
        if (iHashCode == 1790) {
            if (!str.equals(TransType.TRANS_TYPE_PARTNER_MERCHANT_B_SCAN_C)) {
                return "";
            }
            String string9 = application.getString(k.ad_payment_partner_merchant_b_scan_c_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            return string9;
        }
        if (iHashCode == 1791) {
            if (!str.equals(TransType.TRANS_TYPE_PARTNER_MERCHANT_C_SCAN_B)) {
                return "";
            }
            String string10 = application.getString(k.ad_payment_partner_merchant_c_scan_b_result_slot_id);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            return string10;
        }
        switch (str) {
            case "15":
                String string11 = application.getString(k.ad_payment_water_result_slot_id);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case "16":
                String string12 = application.getString(k.ad_payment_electricity_result_slot_id);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
            case "17":
                String string13 = application.getString(k.ad_payment_tv_result_slot_id);
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                return string13;
            default:
                return "";
        }
    }

    public static void t(Context context, String str, ImageView imageView) {
        com.bumptech.glide.b.e(context).load(str).a((G1.d) G1.d.O(com.transsnet.palmpay.custom_view.r.cv_avatar_default).d()).S(imageView);
    }

    public static final ArrayList u(LinkedHashMap linkedHashMap, Function1 isArgumentMissing) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C0114f c0114f = (C0114f) entry.getValue();
            if (c0114f != null && !c0114f.f1039b && !c0114f.f1040c) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List z(CLRepaymentPlanV4Data cLRepaymentPlanV4Data) {
        Object next;
        Integer accountType;
        List<CLRepaymentPlanV4Group> repayPlanAndCouponList = cLRepaymentPlanV4Data != null ? cLRepaymentPlanV4Data.getRepayPlanAndCouponList() : null;
        if (repayPlanAndCouponList == null) {
            repayPlanAndCouponList = z.f38935a;
        }
        Iterator<T> it = repayPlanAndCouponList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer accountType2 = ((CLRepaymentPlanV4Group) next).getAccountType();
            if (accountType2 != null && accountType2.intValue() == 9) {
                break;
            }
        }
        CLRepaymentPlanV4Group cLRepaymentPlanV4Group = (CLRepaymentPlanV4Group) next;
        if (cLRepaymentPlanV4Group == null) {
            if (cLRepaymentPlanV4Data == null || (accountType = cLRepaymentPlanV4Data.getAccountType()) == null || accountType.intValue() != 9 || repayPlanAndCouponList.size() != 1) {
                repayPlanAndCouponList = null;
            }
            CLRepaymentPlanV4Group cLRepaymentPlanV4Group2 = repayPlanAndCouponList != null ? (CLRepaymentPlanV4Group) CollectionsKt.firstOrNull(repayPlanAndCouponList) : null;
            if (cLRepaymentPlanV4Group2 == null) {
                return z.f38935a;
            }
            cLRepaymentPlanV4Group = cLRepaymentPlanV4Group2;
        }
        List<CLRepaymentPlanData> calcRepayPlanForFCAndCouponDTOS = cLRepaymentPlanV4Group.getCalcRepayPlanForFCAndCouponDTOS();
        if (calcRepayPlanForFCAndCouponDTOS == null) {
            calcRepayPlanForFCAndCouponDTOS = z.f38935a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : calcRepayPlanForFCAndCouponDTOS) {
            if (!Intrinsics.c(((CLRepaymentPlanData) obj).getAvailable(), Boolean.FALSE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public abstract void C(boolean z3);

    public abstract void D(boolean z3);

    public abstract TransformationMethod Q(TransformationMethod transformationMethod);

    public abstract InputFilter[] l(InputFilter[] inputFilterArr);

    @Override // io.reactivex.Observer
    public void onComplete() {
        F6.d.h("BaseObserver", 3, "onComplete: ");
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        F6.d.c("BaseObserver", "onError: ", th);
        if (th instanceof p203na.b) {
            p252qa.a.a(null);
            return;
        }
        if (th instanceof C1993k) {
            int i7 = ((C1993k) th).f41932a;
            if (i7 == 404) {
                v(6, "");
                return;
            } else if (i7 == 400) {
                v(7, "");
                return;
            } else {
                v(2, String.valueOf(i7));
                return;
            }
        }
        if (th instanceof p203na.a) {
            w("");
            return;
        }
        if ((th instanceof ConnectException) || (th instanceof UnknownHostException) || (th instanceof SSLHandshakeException)) {
            v(3, th.getClass().getSimpleName());
            return;
        }
        if (th instanceof InterruptedIOException) {
            v(4, th.getClass().getSimpleName());
            return;
        }
        if ((th instanceof JsonParseException) || (th instanceof JSONException) || (th instanceof ParseException)) {
            v(1, th.getClass().getSimpleName());
            F6.d.c("BaseObserver", "Parse error" + th.getMessage());
            return;
        }
        if (th instanceof p203na.c) {
            p203na.c cVar = (p203na.c) th;
            if (CommonResult.CODE_TOKEN_EXPIRED.equalsIgnoreCase(cVar.f39871a)) {
                return;
            }
            String str = cVar.f39871a;
            if (CommonResult.CODE_SHOW_COMMON_ERROR_DIALOG.equalsIgnoreCase(str) || CommonResult.CODE_SHOW_INVEST_ERROR_DIALOG.equalsIgnoreCase(str)) {
                w("");
                return;
            } else {
                w(th.getMessage());
                return;
            }
        }
        if (th instanceof IllegalArgumentException) {
            v(5, th.getClass().getSimpleName());
            return;
        }
        if (!(th instanceof IOException)) {
            F6.d.c("BaseObserver", "UnknownErrorException :" + th.getMessage());
            v(5, th.getClass().getSimpleName());
            return;
        }
        String strD = d(th);
        F6.d.c("BaseObserver", "IOException :" + th.getMessage());
        if (TextUtils.isEmpty(strD)) {
            strD = th.getClass().getSimpleName();
        }
        v(8, strD);
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        y(obj);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, K k2) {
        CommonResult commonResult = (CommonResult) k2.f41874b;
        if (commonResult == null) {
            onFailure(call, new Throwable("server return null"));
        } else if (commonResult.isSuccess() && k2.f41873a.isSuccessful()) {
            x(k2);
        } else {
            onFailure(call, new Throwable(commonResult.getRespMsg()));
        }
    }

    public abstract boolean s();

    public void v(int i7, String code) {
        switch (F.i(i7)) {
            case 0:
            case 4:
                w(i(code));
                break;
            case 1:
            case 2:
            case 3:
            case 7:
                Intrinsics.checkNotNullParameter(code, "code");
                if (AppUtils.isAppForeground()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - p118hf.a.f37383f;
                    if (jCurrentTimeMillis < 0) {
                        p118hf.a.f37383f = System.currentTimeMillis();
                    }
                    if (jCurrentTimeMillis >= 15000) {
                        p118hf.a.f37383f = System.currentTimeMillis();
                        ComponentCallbacks2 topActivity = ActivityUtils.getTopActivity();
                        PPNetworkUtils$OnNetworkFailListener pPNetworkUtils$OnNetworkFailListener = topActivity instanceof PPNetworkUtils$OnNetworkFailListener ? (PPNetworkUtils$OnNetworkFailListener) topActivity : null;
                        if (pPNetworkUtils$OnNetworkFailListener != null) {
                            pPNetworkUtils$OnNetworkFailListener.onNetworkFail(code);
                        }
                    }
                }
                w(j(code));
                break;
            case 5:
                w(i("404"));
                break;
            case 6:
                w(i("400"));
                break;
        }
    }

    public abstract void w(String str);

    public abstract void x(K k2);

    public abstract void y(Object obj);
}
