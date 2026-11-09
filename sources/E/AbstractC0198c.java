package E;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.LocaleList;
import android.os.Trace;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.android.flexbox.FlexItem;
import com.google.mlkit.vision.common.InputImage;
import com.luck.picture.lib.config.FileSizeUnit;
import com.luck.picture.lib.config.PictureMimeType;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;
import com.mikepenz.iconics.utils.IconicsTypefaceSpan;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback;
import com.transsnet.palmpay.photograph.PhotoPickerActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import p355xf.C2126e;
import retrofit2.C1993k;

/* JADX INFO: renamed from: E.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0198c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f1992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f1994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f1995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f1996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Xe.f f1997f;

    public static p039cb.b A(Activity activity) {
        F6.d.h("LocationServiceManager", 3, "getLocationPermissionStatus - Get location permission status");
        try {
            boolean z3 = androidx.core.content.d.a(activity, "android.permission.ACCESS_COARSE_LOCATION") == 0;
            boolean z8 = androidx.core.content.d.a(activity, "android.permission.ACCESS_FINE_LOCATION") == 0;
            boolean zA = J3.a.A(activity);
            boolean z10 = z3 && zA;
            String simpleName = activity.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            p039cb.b bVar = new p039cb.b(z3, z8, zA, z10, simpleName, null, 32);
            F6.d.h("LocationServiceManager", 3, "getLocationPermissionStatus - status: " + bVar);
            return bVar;
        } catch (Exception e10) {
            F6.d.c("LocationServiceManager", "getLocationPermissionStatus - Exception occurred while getting status", e10);
            return new p039cb.b(false, false, false, false, null, e10.getMessage(), 31);
        }
    }

    public static final KSerializer B(KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().isNullable() ? kSerializer : new p162kg.J(kSerializer);
    }

    public static String C(int i7) {
        String str;
        if (i7 == 1) {
            str = "st";
        } else if (i7 != 2) {
            str = i7 != 3 ? "th" : "rd";
        } else {
            str = "nd";
        }
        return androidx.camera.video.u.g(i7, str);
    }

    public static long D(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j6));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        return (N8.q0.c(calendar2, 13, 0, 14, 0) - calendar.getTimeInMillis()) / ((long) 86400000);
    }

    public static float E(androidx.camera.camera2.internal.compat.l lVar) {
        SizeF sizeF = (SizeF) lVar.a(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) lVar.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) lVar.a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Integer num = (Integer) lVar.a(CameraCharacteristics.SENSOR_ORIENTATION);
        p118hf.a.j(sizeF, "The sensor size can't be null.");
        p118hf.a.j(num, "The sensor orientation can't be null.");
        p118hf.a.j(rect, "The active array size can't be null.");
        p118hf.a.j(size, "The pixel array size can't be null.");
        Size sizeE = androidx.camera.core.impl.utils.o.e(rect);
        if (androidx.camera.core.impl.utils.o.c(num.intValue())) {
            SizeF sizeF2 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
            Size size2 = new Size(sizeE.getHeight(), sizeE.getWidth());
            size = new Size(size.getHeight(), size.getWidth());
            sizeE = size2;
            sizeF = sizeF2;
        }
        return (sizeF.getWidth() * sizeE.getWidth()) / size.getWidth();
    }

    public static final float F(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    public static final float G(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static void H(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean I(PhotoPickerActivity photoPickerActivity, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (photoPickerActivity.checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList.size() <= 0;
    }

    public static boolean J() {
        if (Build.VERSION.SDK_INT >= 29) {
            return R0.a.c();
        }
        try {
            if (f1993b == null) {
                f1992a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1993b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1993b.invoke(null, Long.valueOf(f1992a))).booleanValue();
        } catch (Exception e10) {
            H(e10);
            return false;
        }
    }

    public static boolean K(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j6));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar.getTimeInMillis() < calendar2.getTimeInMillis();
    }

    public static void L(ImageView imageView, String str, G1.d dVar) {
        boolean z3 = false;
        if (imageView == null ? false : j4.u.b(imageView.getContext())) {
            Intrinsics.e(imageView);
            com.bumptech.glide.p pVarF = com.bumptech.glide.b.f(imageView);
            if (!TextUtils.isEmpty(str)) {
                Intrinsics.e(str);
                if (kotlin.text.y.m(str, "http://", false)) {
                    str = kotlin.text.y.k(str, "http://", "https://");
                }
            }
            if (str == null) {
                str = "";
            }
            com.bumptech.glide.m mVarLoad = pVarF.load(new p230p4.a(str));
            Intrinsics.checkNotNullExpressionValue(mVarLoad, "load(...)");
            if (dVar != null) {
                mVarLoad.a(dVar);
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2) {
                z3 = true;
            }
            if (z3) {
                mVarLoad.w(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            mVarLoad.S(imageView);
        }
    }

    public static void M(String str, ImageView imageView) {
        if (imageView == null ? false : j4.u.b(imageView.getContext())) {
            N(imageView, str, com.flexibank.sdk.o.fb_default_bank_logo);
        }
    }

    public static void N(ImageView imageView, String str, int i7) {
        if (imageView == null ? false : j4.u.b(imageView.getContext())) {
            L(imageView, str, (G1.d) G1.d.O(i7).d());
        }
    }

    public static final long O(long j6, long j10) {
        return M.h.a(F(j6) - F(j10), G(j6) - G(j10));
    }

    public static void P(Activity activity) {
        F6.d.h("LocationServiceManager", 3, "openLocationSettingsInternal - Open location settings page");
        try {
            activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            F6.d.h("LocationServiceManager", 3, "openLocationSettingsInternal - Location settings page opened");
        } catch (Exception e10) {
            F6.d.c("LocationServiceManager", "openLocationSettingsInternal - Failed to open location settings", e10);
            try {
                activity.startActivity(new Intent("android.settings.SETTINGS"));
                F6.d.h("LocationServiceManager", 3, "openLocationSettingsInternal - General settings page opened");
            } catch (Exception e11) {
                F6.d.c("LocationServiceManager", "openLocationSettingsInternal - Failed to open general settings as well", e11);
            }
        }
    }

    public static final long Q(String str) {
        char cCharAt;
        int length = str.length();
        int i7 = (length <= 0 || !StringsKt.B("+-", str.charAt(0))) ? 0 : 1;
        if (length - i7 > 16) {
            int i10 = i7;
            while (true) {
                if (i7 >= length) {
                    if (length - i10 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 == '0') {
                    if (i10 == i7) {
                        i10++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i7++;
            }
        }
        return (!kotlin.text.y.m(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(kotlin.text.F.v(1, str));
    }

    public static p039cb.a R(Activity activity, boolean z3, String str, p1.c cVar) {
        F6.d.h("LocationServiceManager", 3, "performLocationPermissionCheck - Perform location permission check");
        F6.d.h("LocationServiceManager", 3, "  - showDialog: " + z3);
        F6.d.h("LocationServiceManager", 3, "  - businessType: ".concat(str));
        try {
            p039cb.b bVarA = A(activity);
            if (bVarA.f18897d) {
                F6.d.h("LocationServiceManager", 3, "performLocationPermissionCheck - Location service is ready");
                cVar.onLocationReady(bVarA);
                return new p039cb.a(true, "LOCATION_READY", "Location service is ready", bVarA, null, 16);
            }
            if (!bVarA.f18894a) {
                F6.d.h("LocationServiceManager", 3, "performLocationPermissionCheck - Missing location permission, requesting permission");
                X(activity, str, cVar);
                cVar.onPermissionDenied(bVarA);
                return new p039cb.a(false, "PERMISSION_DENIED", "Location permission not granted, permission request initiated", bVarA, null, 16);
            }
            if (bVarA.f18896c) {
                F6.d.c("LocationServiceManager", "performLocationPermissionCheck - Unknown status");
                cVar.onLocationNotReady(bVarA, "Unknown location service status");
                return new p039cb.a(false, "LOCATION_NOT_READY", "Unknown location service status", bVarA, null, 16);
            }
            F6.d.h("LocationServiceManager", 3, "performLocationPermissionCheck - GPS is disabled");
            if (z3) {
                c0(activity, "Turn on location services", "In order to provide you with a better service, I need to turn on the location service, go to the settings to turn on?", "Confirm", "Cancel", cVar);
            }
            cVar.onGpsDisabled(bVarA);
            return new p039cb.a(false, "GPS_DISABLED", "GPS is disabled, ".concat(z3 ? "enable prompt shown" : "please enable manually"), bVarA, null, 16);
        } catch (Exception e10) {
            F6.d.c("LocationServiceManager", "performLocationPermissionCheck - Exception occurred during check", e10);
            cVar.onError("ERROR_PERMISSION_CHECK_FAILED", e10);
            return new p039cb.a(false, "ERROR", C0.G.o("Location permission check failed: ", e10.getMessage()), null, e10.getMessage(), 8);
        }
    }

    public static final long S(long j6, long j10) {
        return M.h.a(F(j10) + F(j6), G(j10) + G(j6));
    }

    public static void T(Bitmap bitmap, File file, Size size) {
        Size size2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(file, "file");
        Bitmap element = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        if (size != null) {
            float width = element.getWidth() / element.getHeight();
            float width2 = size.getWidth() / size.getHeight();
            int width3 = size.getWidth();
            int height = size.getHeight();
            if (width > width2) {
                height = (int) (width3 / width);
            } else {
                width3 = (int) (height * width);
            }
            size2 = new Size(width3, height);
        } else {
            size2 = null;
        }
        element.getHeight();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (size2 != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                element = Bitmap.createScaledBitmap(element, size2.getWidth(), size2.getHeight(), false);
                Intrinsics.checkNotNullExpressionValue(element, "createScaledBitmap(this, width, height, filter)");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(fileOutputStream, th);
                    throw th2;
                }
            }
        }
        element.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
        fileOutputStream.close();
    }

    public static void U(Bitmap bitmap, File zipFile, Size size) {
        Size size2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        Intrinsics.checkNotNullParameter("B7v$9p@Xq#2LgZt!mR4f", "password");
        Intrinsics.checkNotNullParameter("pp_image.jpg", "zipEntryName");
        Bitmap element = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        if (size != null) {
            float width = element.getWidth() / element.getHeight();
            float width2 = size.getWidth() / size.getHeight();
            int width3 = size.getWidth();
            int height = size.getHeight();
            if (width > width2) {
                height = (int) (width3 / width);
            } else {
                width3 = (int) (height * width);
            }
            size2 = new Size(width3, height);
        } else {
            size2 = null;
        }
        element.getHeight();
        if (size2 != null) {
            Intrinsics.checkNotNullExpressionValue(element, "element");
            element = Bitmap.createScaledBitmap(element, size2.getWidth(), size2.getHeight(), false);
            Intrinsics.checkNotNullExpressionValue(element, "createScaledBitmap(this, width, height, filter)");
        }
        p372yg.h hVar = new p372yg.h();
        hVar.f44401e = 3;
        hVar.f44402f = 2;
        hVar.f44404h = 0L;
        hVar.f44405i = -1L;
        hVar.f44406j = true;
        hVar.f44403g = "pp_image.jpg";
        hVar.f44397a = 2;
        hVar.f44398b = 6;
        hVar.f44399c = true;
        hVar.f44400d = 2;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zipFile));
        char[] charArray = "B7v$9p@Xq#2LgZt!mR4f".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        com.growingio.android.circler.a aVar = new com.growingio.android.circler.a(11);
        p372yg.g gVar = new p372yg.g();
        gVar.f44391a = new ArrayList();
        new ArrayList();
        F1.b bVar = new F1.b();
        bVar.f2516a = new ArrayList();
        gVar.f44392b = bVar;
        p372yg.c cVar = new p372yg.c();
        cVar.f17706a = 4;
        gVar.f44393c = cVar;
        gVar.f44394d = new p372yg.c();
        gVar.f44395e = new p372yg.f();
        gVar.f44396f = false;
        p356xg.i iVar = new p356xg.i();
        iVar.f44010g = new org.sufficientlysecure.htmltextview.o(10);
        iVar.f44011i = new androidx.camera.video.internal.c(24);
        iVar.f44012j = new CRC32();
        iVar.f44013o = new top.zibin.luban.io.a(1);
        iVar.f44014p = 0L;
        iVar.f44016w = true;
        p356xg.d dVar = new p356xg.d();
        dVar.f43997b = 0L;
        dVar.f43996a = bufferedOutputStream;
        iVar.f44004a = dVar;
        iVar.f44005b = charArray;
        iVar.t = aVar;
        iVar.f44006c = gVar;
        iVar.f44015v = false;
        try {
            iVar.b(hVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            element.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            iVar.write(byteArrayOutputStream.toByteArray());
            iVar.a();
            iVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(iVar, th);
                throw th2;
            }
        }
    }

    public static void V(Context ctx, AttributeSet attributeSet, L5.a bundle) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        TypedArray typedArrayObtainStyledAttributes = ctx.obtainStyledAttributes(attributeSet, N5.b.IconicsTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "ctx.obtainStyledAttribut…tyleable.IconicsTextView)");
        Resources resources = ctx.getResources();
        Resources.Theme theme = ctx.getTheme();
        int i7 = N5.b.IconicsTextView_iiv_all_icon;
        int i10 = N5.b.IconicsTextView_iiv_all_color;
        int i11 = N5.b.IconicsTextView_iiv_all_size;
        int i12 = N5.b.IconicsTextView_iiv_all_padding;
        int i13 = N5.b.IconicsTextView_iiv_all_contour_color;
        int i14 = N5.b.IconicsTextView_iiv_all_contour_width;
        int i15 = N5.b.IconicsTextView_iiv_all_background_color;
        int i16 = N5.b.IconicsTextView_iiv_all_corner_radius;
        int i17 = N5.b.IconicsTextView_iiv_all_background_contour_color;
        int i18 = N5.b.IconicsTextView_iiv_all_background_contour_width;
        int i19 = N5.b.IconicsTextView_iiv_all_shadow_radius;
        int i20 = N5.b.IconicsTextView_iiv_all_shadow_dx;
        int i21 = N5.b.IconicsTextView_iiv_all_shadow_dy;
        int i22 = N5.b.IconicsTextView_iiv_all_shadow_color;
        int i23 = N5.b.IconicsTextView_iiv_all_animations;
        int i24 = N5.b.IconicsTextView_iiv_all_automirror;
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        IconicsDrawable iconicsDrawableB = new J5.c(resources, theme, typedArrayObtainStyledAttributes, i7, i11, i10, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24).b(null, true);
        Resources resources2 = ctx.getResources();
        Resources.Theme theme2 = ctx.getTheme();
        int i25 = N5.b.IconicsTextView_iiv_start_icon;
        int i26 = N5.b.IconicsTextView_iiv_start_color;
        int i27 = N5.b.IconicsTextView_iiv_start_size;
        int i28 = N5.b.IconicsTextView_iiv_start_padding;
        int i29 = N5.b.IconicsTextView_iiv_start_contour_color;
        int i30 = N5.b.IconicsTextView_iiv_start_contour_width;
        int i31 = N5.b.IconicsTextView_iiv_start_background_color;
        int i32 = N5.b.IconicsTextView_iiv_start_corner_radius;
        int i33 = N5.b.IconicsTextView_iiv_start_background_contour_color;
        int i34 = N5.b.IconicsTextView_iiv_start_background_contour_width;
        int i35 = N5.b.IconicsTextView_iiv_start_shadow_radius;
        int i36 = N5.b.IconicsTextView_iiv_start_shadow_dx;
        int i37 = N5.b.IconicsTextView_iiv_start_shadow_dy;
        int i38 = N5.b.IconicsTextView_iiv_start_shadow_color;
        int i39 = N5.b.IconicsTextView_iiv_start_animations;
        int i40 = N5.b.IconicsTextView_iiv_start_automirror;
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        bundle.f5553a = new J5.c(resources2, theme2, typedArrayObtainStyledAttributes, i25, i27, i26, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40).b(iconicsDrawableB, true);
        Resources resources3 = ctx.getResources();
        Resources.Theme theme3 = ctx.getTheme();
        int i41 = N5.b.IconicsTextView_iiv_top_icon;
        int i42 = N5.b.IconicsTextView_iiv_top_color;
        int i43 = N5.b.IconicsTextView_iiv_top_size;
        int i44 = N5.b.IconicsTextView_iiv_top_padding;
        int i45 = N5.b.IconicsTextView_iiv_top_contour_color;
        int i46 = N5.b.IconicsTextView_iiv_top_contour_width;
        int i47 = N5.b.IconicsTextView_iiv_top_background_color;
        int i48 = N5.b.IconicsTextView_iiv_top_corner_radius;
        int i49 = N5.b.IconicsTextView_iiv_top_background_contour_color;
        int i50 = N5.b.IconicsTextView_iiv_top_background_contour_width;
        int i51 = N5.b.IconicsTextView_iiv_top_shadow_radius;
        int i52 = N5.b.IconicsTextView_iiv_top_shadow_dx;
        int i53 = N5.b.IconicsTextView_iiv_top_shadow_dy;
        int i54 = N5.b.IconicsTextView_iiv_top_shadow_color;
        int i55 = N5.b.IconicsTextView_iiv_top_animations;
        int i56 = N5.b.IconicsTextView_iiv_top_automirror;
        Intrinsics.checkNotNullExpressionValue(resources3, "resources");
        bundle.f5554b = new J5.c(resources3, theme3, typedArrayObtainStyledAttributes, i41, i43, i42, i44, i45, i46, i47, i48, i49, i50, i51, i52, i53, i54, i55, i56).b(iconicsDrawableB, true);
        Resources resources4 = ctx.getResources();
        Resources.Theme theme4 = ctx.getTheme();
        int i57 = N5.b.IconicsTextView_iiv_end_icon;
        int i58 = N5.b.IconicsTextView_iiv_end_color;
        int i59 = N5.b.IconicsTextView_iiv_end_size;
        int i60 = N5.b.IconicsTextView_iiv_end_padding;
        int i61 = N5.b.IconicsTextView_iiv_end_contour_color;
        int i62 = N5.b.IconicsTextView_iiv_end_contour_width;
        int i63 = N5.b.IconicsTextView_iiv_end_background_color;
        int i64 = N5.b.IconicsTextView_iiv_end_corner_radius;
        int i65 = N5.b.IconicsTextView_iiv_end_background_contour_color;
        int i66 = N5.b.IconicsTextView_iiv_end_background_contour_width;
        int i67 = N5.b.IconicsTextView_iiv_end_shadow_radius;
        int i68 = N5.b.IconicsTextView_iiv_end_shadow_dx;
        int i69 = N5.b.IconicsTextView_iiv_end_shadow_dy;
        int i70 = N5.b.IconicsTextView_iiv_end_shadow_color;
        int i71 = N5.b.IconicsTextView_iiv_end_animations;
        int i72 = N5.b.IconicsTextView_iiv_end_automirror;
        Intrinsics.checkNotNullExpressionValue(resources4, "resources");
        bundle.f5555c = new J5.c(resources4, theme4, typedArrayObtainStyledAttributes, i57, i59, i58, i60, i61, i62, i63, i64, i65, i66, i67, i68, i69, i70, i71, i72).b(iconicsDrawableB, true);
        Resources resources5 = ctx.getResources();
        Resources.Theme theme5 = ctx.getTheme();
        int i73 = N5.b.IconicsTextView_iiv_bottom_icon;
        int i74 = N5.b.IconicsTextView_iiv_bottom_color;
        int i75 = N5.b.IconicsTextView_iiv_bottom_size;
        int i76 = N5.b.IconicsTextView_iiv_bottom_padding;
        int i77 = N5.b.IconicsTextView_iiv_bottom_contour_color;
        int i78 = N5.b.IconicsTextView_iiv_bottom_contour_width;
        int i79 = N5.b.IconicsTextView_iiv_bottom_background_color;
        int i80 = N5.b.IconicsTextView_iiv_bottom_corner_radius;
        int i81 = N5.b.IconicsTextView_iiv_bottom_background_contour_color;
        int i82 = N5.b.IconicsTextView_iiv_bottom_background_contour_width;
        int i83 = N5.b.IconicsTextView_iiv_bottom_shadow_radius;
        int i84 = N5.b.IconicsTextView_iiv_bottom_shadow_dx;
        int i85 = N5.b.IconicsTextView_iiv_bottom_shadow_dy;
        int i86 = N5.b.IconicsTextView_iiv_bottom_shadow_color;
        int i87 = N5.b.IconicsTextView_iiv_bottom_animations;
        int i88 = N5.b.IconicsTextView_iiv_bottom_automirror;
        Intrinsics.checkNotNullExpressionValue(resources5, "resources");
        bundle.f5556d = new J5.c(resources5, theme5, typedArrayObtainStyledAttributes, i73, i75, i74, i76, i77, i78, i79, i80, i81, i82, i83, i84, i85, i86, i87, i88).b(iconicsDrawableB, true);
        Unit unit = Unit.f38893a;
        typedArrayObtainStyledAttributes.recycle();
    }

    public static String W(int i7, Context context) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i7)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                sb2.append(line);
                sb2.append('\n');
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new RuntimeException(C0.G.m(i7, "无法打开raw中的资源resourceId："));
        }
    }

    public static void X(Activity activity, String str, p1.c cVar) {
        F6.d.h("LocationServiceManager", 3, "requestLocationPermission - Request location permission");
        F6.d.h("LocationServiceManager", 3, "  - businessType: ".concat(str));
        try {
            J3.a.L(activity, new p039cb.c(0, activity, cVar));
        } catch (Exception e10) {
            F6.d.c("LocationServiceManager", "requestLocationPermission - Exception occurred while requesting location permission", e10);
            cVar.onError("ERROR_PERMISSION_CHECK_FAILED", e10);
        }
    }

    public static Bitmap Y(int i7, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Matrix matrix = new Matrix();
        matrix.postRotate(i7);
        matrix.postScale(1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        if (bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static void Z(int i7, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            R0.a.d(i7, m0(str));
            return;
        }
        String strM0 = m0(str);
        try {
            if (f1996e == null) {
                f1996e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f1996e.invoke(null, Long.valueOf(f1992a), strM0, Integer.valueOf(i7));
        } catch (Exception e10) {
            H(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0288  */
    /* JADX WARN: Code duplicated, block: B:176:0x029f  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:182:0x02db  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d3 A[SYNTHETIC] */
    public static final long a(String str, boolean z3) {
        boolean z8;
        int iD;
        boolean z10;
        char cCharAt;
        char cCharAt2;
        Tf.e eVar;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Tf.b bVar = Tf.c.f9078b;
        long jM57getZEROUwyO8pc = bVar.m57getZEROUwyO8pc();
        char cCharAt4 = str.charAt(0);
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z11 = length2 > 0;
        boolean z12 = z11 && StringsKt.N(str, '-');
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        Tf.e eVar2 = null;
        char c6 = ':';
        char c10 = '0';
        if (str.charAt(length2) == 'P') {
            int i7 = length2 + 1;
            if (i7 == length) {
                throw new IllegalArgumentException();
            }
            Tf.e eVar3 = null;
            boolean z13 = false;
            while (i7 < length) {
                if (str.charAt(i7) != 'T') {
                    int i10 = i7;
                    while (i10 < str.length() && ((c10 <= (cCharAt3 = str.charAt(i10)) && cCharAt3 < c6) || StringsKt.B("+-.", cCharAt3))) {
                        i10++;
                    }
                    String strSubstring = str.substring(i7, i10);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = strSubstring.length() + i7;
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                    }
                    char cCharAt5 = str.charAt(length3);
                    int i11 = length3 + 1;
                    if (z13) {
                        if (cCharAt5 == 'H') {
                            eVar = Tf.e.HOURS;
                        } else if (cCharAt5 == 'M') {
                            eVar = Tf.e.MINUTES;
                        } else {
                            if (cCharAt5 != 'S') {
                                throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt5);
                            }
                            eVar = Tf.e.SECONDS;
                        }
                    } else {
                        if (cCharAt5 != 'D') {
                            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt5);
                        }
                        eVar = Tf.e.DAYS;
                    }
                    if (eVar3 != null && eVar3.compareTo(eVar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iD2 = StringsKt.D(strSubstring, '.', 0, 6);
                    if (eVar != Tf.e.SECONDS || iD2 <= 0) {
                        jM57getZEROUwyO8pc = Tf.c.g(jM57getZEROUwyO8pc, i0(Q(strSubstring), eVar));
                    } else {
                        String strSubstring2 = strSubstring.substring(0, iD2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jG = Tf.c.g(jM57getZEROUwyO8pc, i0(Q(strSubstring2), eVar));
                        String strSubstring3 = strSubstring.substring(iD2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM57getZEROUwyO8pc = Tf.c.g(jG, g0(Double.parseDouble(strSubstring3), eVar));
                    }
                    eVar3 = eVar;
                    c10 = '0';
                    c6 = ':';
                    i7 = i11;
                } else {
                    if (z13 || (i7 = i7 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z13 = true;
                }
            }
        } else {
            if (z3) {
                throw new IllegalArgumentException();
            }
            char c11 = '0';
            if (kotlin.text.y.i(length2, 0, Math.max(length - length2, 8), str, "Infinity", true)) {
                jM57getZEROUwyO8pc = bVar.m55getINFINITEUwyO8pc();
            } else {
                boolean z14 = !z11;
                if (z11 && str.charAt(length2) == '(' && kotlin.text.F.y(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z8 = true;
                } else {
                    z8 = z14;
                }
                boolean z15 = false;
                while (length2 < length) {
                    if (z15 && z8) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i12 = length2;
                    while (i12 < str.length() && ((c11 <= (cCharAt2 = str.charAt(i12)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i12++;
                    }
                    String strSubstring4 = str.substring(length2, i12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = strSubstring4.length() + length2;
                    int i13 = length4;
                    while (i13 < str.length() && 'a' <= (cCharAt = str.charAt(i13)) && cCharAt < '{') {
                        i13++;
                    }
                    String shortName = str.substring(length4, i13);
                    Intrinsics.checkNotNullExpressionValue(shortName, "substring(...)");
                    length2 = length4 + shortName.length();
                    Intrinsics.checkNotNullParameter(shortName, "shortName");
                    int iHashCode = shortName.hashCode();
                    if (iHashCode != 100) {
                        if (iHashCode != 104) {
                            if (iHashCode != 109) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3494) {
                                        if (iHashCode != 3525) {
                                            if (iHashCode != 3742 || !shortName.equals("us")) {
                                                throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
                                            }
                                            eVar2 = Tf.e.MICROSECONDS;
                                            if (eVar2 == null && eVar2.compareTo(eVar2) <= 0) {
                                                throw new IllegalArgumentException("Unexpected order of duration components");
                                            }
                                            iD = StringsKt.D(strSubstring4, '.', 0, 6);
                                            if (iD > 0) {
                                                String strSubstring5 = strSubstring4.substring(0, iD);
                                                Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                                                z10 = z12;
                                                long jG2 = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring5), eVar2));
                                                String strSubstring6 = strSubstring4.substring(iD);
                                                Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                                                jM57getZEROUwyO8pc = Tf.c.g(jG2, g0(Double.parseDouble(strSubstring6), eVar2));
                                                if (length2 < length) {
                                                    throw new IllegalArgumentException("Fractional component must be last");
                                                }
                                                z12 = z10;
                                            } else {
                                                jM57getZEROUwyO8pc = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring4), eVar2));
                                            }
                                            z15 = true;
                                            c11 = '0';
                                        } else {
                                            if (!shortName.equals("ns")) {
                                                throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
                                            }
                                            eVar2 = Tf.e.NANOSECONDS;
                                            if (eVar2 == null) {
                                            }
                                            iD = StringsKt.D(strSubstring4, '.', 0, 6);
                                            if (iD > 0) {
                                                String strSubstring7 = strSubstring4.substring(0, iD);
                                                Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                                                z10 = z12;
                                                long jG3 = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring7), eVar2));
                                                String strSubstring8 = strSubstring4.substring(iD);
                                                Intrinsics.checkNotNullExpressionValue(strSubstring8, "substring(...)");
                                                jM57getZEROUwyO8pc = Tf.c.g(jG3, g0(Double.parseDouble(strSubstring8), eVar2));
                                                if (length2 < length) {
                                                    throw new IllegalArgumentException("Fractional component must be last");
                                                }
                                                z12 = z10;
                                            } else {
                                                jM57getZEROUwyO8pc = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring4), eVar2));
                                            }
                                            z15 = true;
                                            c11 = '0';
                                        }
                                    } else {
                                        if (!shortName.equals("ms")) {
                                            throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
                                        }
                                        eVar2 = Tf.e.MILLISECONDS;
                                        if (eVar2 == null) {
                                        }
                                        iD = StringsKt.D(strSubstring4, '.', 0, 6);
                                        if (iD > 0) {
                                            String strSubstring9 = strSubstring4.substring(0, iD);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring9, "substring(...)");
                                            z10 = z12;
                                            long jG4 = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring9), eVar2));
                                            String strSubstring10 = strSubstring4.substring(iD);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring10, "substring(...)");
                                            jM57getZEROUwyO8pc = Tf.c.g(jG4, g0(Double.parseDouble(strSubstring10), eVar2));
                                            if (length2 < length) {
                                                throw new IllegalArgumentException("Fractional component must be last");
                                            }
                                            z12 = z10;
                                        } else {
                                            jM57getZEROUwyO8pc = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring4), eVar2));
                                        }
                                        z15 = true;
                                        c11 = '0';
                                    }
                                } else {
                                    if (!shortName.equals("s")) {
                                        throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
                                    }
                                    eVar2 = Tf.e.SECONDS;
                                    if (eVar2 == null) {
                                    }
                                    iD = StringsKt.D(strSubstring4, '.', 0, 6);
                                    if (iD > 0) {
                                        String strSubstring11 = strSubstring4.substring(0, iD);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring11, "substring(...)");
                                        z10 = z12;
                                        long jG5 = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring11), eVar2));
                                        String strSubstring12 = strSubstring4.substring(iD);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring12, "substring(...)");
                                        jM57getZEROUwyO8pc = Tf.c.g(jG5, g0(Double.parseDouble(strSubstring12), eVar2));
                                        if (length2 < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                        z12 = z10;
                                    } else {
                                        jM57getZEROUwyO8pc = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring4), eVar2));
                                    }
                                    z15 = true;
                                    c11 = '0';
                                }
                            } else {
                                if (!shortName.equals("m")) {
                                    throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
                                }
                                eVar2 = Tf.e.MINUTES;
                                if (eVar2 == null) {
                                }
                                iD = StringsKt.D(strSubstring4, '.', 0, 6);
                                if (iD > 0) {
                                    String strSubstring13 = strSubstring4.substring(0, iD);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring13, "substring(...)");
                                    z10 = z12;
                                    long jG6 = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring13), eVar2));
                                    String strSubstring14 = strSubstring4.substring(iD);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring14, "substring(...)");
                                    jM57getZEROUwyO8pc = Tf.c.g(jG6, g0(Double.parseDouble(strSubstring14), eVar2));
                                    if (length2 < length) {
                                        throw new IllegalArgumentException("Fractional component must be last");
                                    }
                                    z12 = z10;
                                } else {
                                    jM57getZEROUwyO8pc = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring4), eVar2));
                                }
                                z15 = true;
                                c11 = '0';
                            }
                        } else {
                            if (!shortName.equals("h")) {
                                throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
                            }
                            eVar2 = Tf.e.HOURS;
                            if (eVar2 == null) {
                            }
                            iD = StringsKt.D(strSubstring4, '.', 0, 6);
                            if (iD > 0) {
                                String strSubstring15 = strSubstring4.substring(0, iD);
                                Intrinsics.checkNotNullExpressionValue(strSubstring15, "substring(...)");
                                z10 = z12;
                                long jG7 = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring15), eVar2));
                                String strSubstring16 = strSubstring4.substring(iD);
                                Intrinsics.checkNotNullExpressionValue(strSubstring16, "substring(...)");
                                jM57getZEROUwyO8pc = Tf.c.g(jG7, g0(Double.parseDouble(strSubstring16), eVar2));
                                if (length2 < length) {
                                    throw new IllegalArgumentException("Fractional component must be last");
                                }
                                z12 = z10;
                            } else {
                                jM57getZEROUwyO8pc = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring4), eVar2));
                            }
                            z15 = true;
                            c11 = '0';
                        }
                    } else {
                        if (!shortName.equals("d")) {
                            throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
                        }
                        eVar2 = Tf.e.DAYS;
                        if (eVar2 == null) {
                        }
                        iD = StringsKt.D(strSubstring4, '.', 0, 6);
                        if (iD > 0) {
                            String strSubstring17 = strSubstring4.substring(0, iD);
                            Intrinsics.checkNotNullExpressionValue(strSubstring17, "substring(...)");
                            z10 = z12;
                            long jG8 = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring17), eVar2));
                            String strSubstring18 = strSubstring4.substring(iD);
                            Intrinsics.checkNotNullExpressionValue(strSubstring18, "substring(...)");
                            jM57getZEROUwyO8pc = Tf.c.g(jG8, g0(Double.parseDouble(strSubstring18), eVar2));
                            if (length2 < length) {
                                throw new IllegalArgumentException("Fractional component must be last");
                            }
                            z12 = z10;
                        } else {
                            jM57getZEROUwyO8pc = Tf.c.g(jM57getZEROUwyO8pc, i0(Long.parseLong(strSubstring4), eVar2));
                        }
                        z15 = true;
                        c11 = '0';
                    }
                }
            }
        }
        return z12 ? Tf.c.i(jM57getZEROUwyO8pc) : jM57getZEROUwyO8pc;
    }

    public static final Context a0(Context context, String language) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(language, "language");
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        configuration.setLocales(new LocaleList(locale));
        configuration.setLayoutDirection(locale);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    public static void b() {
        if (f1997f == null) {
            throw new ExceptionInInitializerError("Please invoke NoHttp.initialize(Application) on Application#onCreate()");
        }
    }

    public static boolean b0(String title, String message, String positiveButtonText, String negativeButtonText, org.greenrobot.eventbus.f fVar) {
        org.greenrobot.eventbus.f fVar2;
        Exception exc;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        F6.d.h("LocationServiceManager", 3, "showGpsEnableDialog - Show GPS enable dialog");
        try {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity != null) {
                fVar2 = fVar;
                try {
                    c0(topActivity, title, message, positiveButtonText, negativeButtonText, fVar2);
                    return true;
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    F6.d.c("LocationServiceManager", "showGpsEnableDialog - Exception occurred while showing GPS enable dialog", exc);
                    fVar2.onError("ERROR_DIALOG_SHOW_FAILED", exc);
                    return false;
                }
            }
            try {
                F6.d.c("LocationServiceManager", "showGpsEnableDialog - Unable to get current Activity");
                fVar.onError("ERROR_NO_ACTIVITY", null);
                return false;
            } catch (Exception e11) {
                exc = e11;
                fVar2 = fVar;
                F6.d.c("LocationServiceManager", "showGpsEnableDialog - Exception occurred while showing GPS enable dialog", exc);
                fVar2.onError("ERROR_DIALOG_SHOW_FAILED", exc);
                return false;
            }
        } catch (Exception e12) {
            e = e12;
            fVar2 = fVar;
        }
    }

    public static void c(String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            R0.a.a(m0(str), i7);
            return;
        }
        String strM0 = m0(str);
        try {
            if (f1994c == null) {
                f1994c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f1994c.invoke(null, Long.valueOf(f1992a), strM0, Integer.valueOf(i7));
        } catch (Exception e10) {
            H(e10);
        }
    }

    public static void c0(Activity activity, String str, String str2, String str3, String str4, LocationServiceManager$LocationServiceCallback locationServiceManager$LocationServiceCallback) {
        F6.d.h("LocationServiceManager", 3, "showGpsEnableDialogInternal - Show GPS enable dialog");
        F6.d.h("LocationServiceManager", 3, "  - title: ".concat(str));
        F6.d.h("LocationServiceManager", 3, "  - message: ".concat(str2));
        try {
            O6.c cVar = new O6.c(activity);
            cVar.f6596b = O6.d.f(str);
            cVar.f6598d = str2;
            p010a9.b bVar = new p010a9.b(5, activity, locationServiceManager$LocationServiceCallback);
            cVar.f6600f = str3;
            cVar.f6602h = bVar;
            Yd.i iVar = new Yd.i(locationServiceManager$LocationServiceCallback, 13);
            cVar.f6601g = str4;
            cVar.f6603i = iVar;
            cVar.g();
            F6.d.h("LocationServiceManager", 3, "showGpsEnableDialogInternal - GPS enable dialog shown");
        } catch (Exception e10) {
            F6.d.c("LocationServiceManager", "showGpsEnableDialogInternal - Exception occurred while showing GPS enable dialog", e10);
            locationServiceManager$LocationServiceCallback.onError("ERROR_DIALOG_SHOW_FAILED", e10);
            P(activity);
        }
    }

    public static final p1.d d(String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        return new p1.d(sectionName, 6);
    }

    public static void d0(p262r2.d dVar, long j6) throws IOException {
        if (!(j6 >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j6 > 0) {
            long jSkip = dVar.skip(j6);
            if (jSkip <= 0) {
                if (dVar.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j6 -= jSkip;
        }
    }

    public static void e(String str) {
        Trace.beginSection(m0(str));
    }

    public static final /* synthetic */ Integer e0(int i7) {
        Integer numValueOf = Integer.valueOf(i7);
        if (i7 != Integer.MIN_VALUE) {
            return numValueOf;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0214  */
    /* JADX WARN: Code duplicated, block: B:51:0x0221  */
    /* JADX WARN: Code duplicated, block: B:53:0x022d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0239  */
    public static SpannableString f(CharSequence on) {
        LinkedList linkedList;
        String str;
        SpannableString spannableString;
        com.mikepenz.iconics.utils.b bVar;
        int i7;
        int i10;
        int i11;
        Object objF;
        int i12 = 1;
        com.mikepenz.iconics.utils.a block = com.mikepenz.iconics.utils.a.f23605a;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(on, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        H5.a aVar = new H5.a();
        block.invoke(aVar);
        Intrinsics.checkNotNullParameter(on, "on");
        SpannableString spannable = new SpannableString(on);
        Intrinsics.checkNotNullParameter(spannable, "on");
        LinkedList fonts = aVar.f3694c;
        LinkedList withStyles = aVar.f3692a;
        HashMap withStylesFor = aVar.f3693b;
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        Intrinsics.checkNotNullParameter(spannable, "text");
        Intrinsics.checkNotNullParameter(withStyles, "withStyles");
        Intrinsics.checkNotNullParameter(withStylesFor, "withStylesFor");
        int iA = kotlin.collections.F.a(kotlin.collections.r.l(fonts, 10));
        if (iA < 16) {
            iA = 16;
        }
        Map fonts2 = new LinkedHashMap(iA);
        for (Object obj : fonts) {
            fonts2.put(((ITypeface) obj).getMappingPrefix(), obj);
        }
        HashMap map = H5.b.f3695a;
        Intrinsics.checkNotNullParameter(spannable, "textSpanned");
        if (fonts2.isEmpty()) {
            fonts2 = M5.a.f5770c;
        }
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        Intrinsics.checkNotNullParameter(fonts2, "fonts");
        LinkedList<com.mikepenz.iconics.utils.b> styleContainers = new LinkedList();
        LinkedList<com.mikepenz.iconics.utils.b> linkedList2 = new LinkedList();
        Object[] spans = spannable.getSpans(0, spannable.length(), ParcelableSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "spannable.getSpans(0, sp…rcelableSpan::class.java)");
        for (Object obj2 : spans) {
            ParcelableSpan parcelableSpan = (ParcelableSpan) obj2;
            linkedList2.add(new com.mikepenz.iconics.utils.b(spannable.getSpanStart(parcelableSpan), spannable.getSpanEnd(parcelableSpan), null, null, parcelableSpan, null, spannable.getSpanFlags(parcelableSpan), 44));
        }
        Object[] spans2 = spannable.getSpans(0, spannable.length(), CharacterStyle.class);
        Intrinsics.checkNotNullExpressionValue(spans2, "spannable.getSpans(0, sp…aracterStyle::class.java)");
        for (Object obj3 : spans2) {
            CharacterStyle characterStyle = (CharacterStyle) obj3;
            linkedList2.add(new com.mikepenz.iconics.utils.b(spannable.getSpanStart(characterStyle), spannable.getSpanEnd(characterStyle), null, null, null, characterStyle, spannable.getSpanFlags(characterStyle), 28));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i13 = 0;
        int i14 = 0;
        int length = 0;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        while (i13 < spannable.length()) {
            char cCharAt = spannable.charAt(i13);
            int i15 = i14 + 1;
            int i16 = i12;
            if (cCharAt == '{') {
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                spannableStringBuilder3.append(cCharAt);
                spannableStringBuilder2 = spannableStringBuilder3;
                linkedList = withStyles;
                str = str2;
                spannableString = spannable;
                fonts2 = fonts2;
            } else if (cCharAt == '}') {
                spannableStringBuilder2.append(cCharAt);
                if (spannableStringBuilder2.length() > 5) {
                    if (spannableStringBuilder2.length() >= 6) {
                        String string = spannableStringBuilder2.subSequence(i16, spannableStringBuilder2.length() - 1).toString();
                        Intrinsics.checkNotNullParameter(string, str2);
                        Intrinsics.checkNotNullParameter(string, str2);
                        linkedList = withStyles;
                        String strReplace = new Regex("-").replace(string, "_");
                        ITypeface iTypeface = (ITypeface) fonts2.get(spannableStringBuilder2.subSequence(1, 4).toString());
                        str = str2;
                        com.growingio.android.circler.a aVar2 = H5.b.f3697c;
                        spannableString = spannable;
                        if (iTypeface != null) {
                            try {
                                p355xf.o oVar = p355xf.q.f43977a;
                                objF = iTypeface.getIcon(strReplace);
                            } catch (Throwable th) {
                                p355xf.o oVar2 = p355xf.q.f43977a;
                                objF = androidx.camera.core.impl.utils.executor.g.f(th);
                            }
                            if (objF instanceof p355xf.p) {
                                objF = null;
                            }
                            IIcon iIcon = (IIcon) objF;
                            if (iIcon != null) {
                                spannableStringBuilder.append(iIcon.getCharacter());
                                bVar = new com.mikepenz.iconics.utils.b(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), strReplace, iTypeface, null, null, 0, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR);
                                fonts2 = fonts2;
                            } else {
                                strReplace = strReplace;
                                String TAG = H5.b.f3696b;
                                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                                aVar2.log(6, TAG, "Wrong icon name: " + strReplace, null);
                            }
                            if (bVar != null) {
                                styleContainers.add(bVar);
                                for (com.mikepenz.iconics.utils.b bVar2 : linkedList2) {
                                    i7 = bVar2.f23606a;
                                    i10 = i14 - length;
                                    if (i7 > i10) {
                                        bVar2.f23606a = (i7 - spannableStringBuilder2.length()) + 1;
                                    }
                                    i11 = bVar2.f23607b;
                                    if (i11 > i10) {
                                        bVar2.f23607b = (i11 - spannableStringBuilder2.length()) + 1;
                                    }
                                }
                                length += spannableStringBuilder2.length() - 1;
                            }
                        }
                        String TAG2 = H5.b.f3696b;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        aVar2.log(6, TAG2, "Wrong fontId: " + strReplace, null);
                    } else {
                        linkedList = withStyles;
                        str = str2;
                        spannableString = spannable;
                        fonts2 = fonts2;
                    }
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                    bVar = null;
                    if (bVar != null) {
                        styleContainers.add(bVar);
                        while (r0.hasNext()) {
                            i7 = bVar2.f23606a;
                            i10 = i14 - length;
                            if (i7 > i10) {
                                bVar2.f23606a = (i7 - spannableStringBuilder2.length()) + 1;
                            }
                            i11 = bVar2.f23607b;
                            if (i11 > i10) {
                                bVar2.f23607b = (i11 - spannableStringBuilder2.length()) + 1;
                            }
                        }
                        length += spannableStringBuilder2.length() - 1;
                    }
                } else {
                    linkedList = withStyles;
                    str = str2;
                    spannableString = spannable;
                    fonts2 = fonts2;
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                }
                spannableStringBuilder2 = new SpannableStringBuilder();
            } else {
                linkedList = withStyles;
                str = str2;
                spannableString = spannable;
                fonts2 = fonts2;
                if (spannableStringBuilder2.length() == 0) {
                    spannableStringBuilder.append(cCharAt);
                } else {
                    spannableStringBuilder2.append(cCharAt);
                }
            }
            i13++;
            i14 = i15;
            withStyles = linkedList;
            fonts2 = fonts2;
            str2 = str;
            spannable = spannableString;
            i12 = 1;
        }
        LinkedList linkedList3 = withStyles;
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        styleContainers.addAll(linkedList2);
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "spannableStringBuilder");
        Intrinsics.checkNotNullParameter(styleContainers, "styleContainers");
        SpannableString text = SpannableString.valueOf(spannableStringBuilder);
        Intrinsics.checkNotNullExpressionValue(text, "sb");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(styleContainers, "styleContainers");
        for (com.mikepenz.iconics.utils.b bVar3 : styleContainers) {
            Object obj4 = bVar3.f23611f;
            if (obj4 == null) {
                obj4 = bVar3.f23610e;
            }
            int i17 = bVar3.f23612g;
            if (obj4 != null) {
                text.setSpan(obj4, bVar3.f23606a, bVar3.f23607b, i17);
            } else {
                ITypeface iTypeface2 = bVar3.f23609d;
                if (iTypeface2 != null) {
                    text.setSpan(new IconicsTypefaceSpan(iTypeface2.getRawTypeface()), bVar3.f23606a, bVar3.f23607b, 33);
                }
            }
            if (withStylesFor != null) {
                String str3 = bVar3.f23608c;
                if (withStylesFor.containsKey(str3)) {
                    List list = (List) withStylesFor.get(str3);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            text.setSpan(CharacterStyle.wrap((CharacterStyle) it.next()), bVar3.f23606a, bVar3.f23607b, i17);
                        }
                    }
                }
            }
            if (linkedList3 != null) {
                Iterator it2 = linkedList3.iterator();
                while (it2.hasNext()) {
                    text.setSpan(CharacterStyle.wrap((CharacterStyle) it2.next()), bVar3.f23606a, bVar3.f23607b, i17);
                }
            }
        }
        return text;
    }

    public static final long f0(long j6, float f10) {
        return M.h.a(F(j6) * f10, G(j6) * f10);
    }

    public static p039cb.b g() {
        F6.d.h("LocationServiceManager", 3, "checkLocationPermissionStatus - Check location permission status");
        try {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity != null) {
                return A(topActivity);
            }
            F6.d.c("LocationServiceManager", "checkLocationPermissionStatus - Unable to get current Activity");
            return new p039cb.b(false, false, false, false, null, "ERROR_NO_ACTIVITY", 31);
        } catch (Exception e10) {
            F6.d.c("LocationServiceManager", "checkLocationPermissionStatus - Exception occurred while checking location permission status", e10);
            return new p039cb.b(false, false, false, false, null, C0.G.o("ERROR_PERMISSION_CHECK_FAILED: ", e10.getMessage()), 31);
        }
    }

    public static final long g0(double d2, Tf.e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = Tf.f.a(d2, unit, Tf.e.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jC = Nf.b.c(dA);
        return (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? p(Nf.b.c(Tf.f.a(d2, unit, Tf.e.MILLISECONDS))) : q(jC);
    }

    public static final String h(int i7, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf(context.getColor(i7) & FlexItem.MAX_SIZE)}, 1, "#%06X", "format(...)");
    }

    public static final long h0(int i7, Tf.e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(Tf.e.SECONDS) <= 0 ? q(Tf.f.c(i7, unit, Tf.e.NANOSECONDS)) : i0(i7, unit);
    }

    public static androidx.emoji2.text.s i(Context context) {
        ProviderInfo providerInfo;
        androidx.core.provider.e eVar;
        ApplicationInfo applicationInfo;
        p262r2.c cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(3) : new p262r2.c(3);
        PackageManager packageManager = context.getPackageManager();
        p118hf.a.j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            eVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrB = cVar.b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrB) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new androidx.core.provider.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                eVar = null;
            }
        }
        if (eVar == null) {
            return null;
        }
        return new androidx.emoji2.text.s(new androidx.emoji2.text.r(context, eVar));
    }

    public static final long i0(long j6, Tf.e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Tf.e eVar = Tf.e.NANOSECONDS;
        long jC = Tf.f.c(4611686018426999999L, eVar, unit);
        return ((-jC) > j6 || j6 > jC) ? o(kotlin.ranges.b.d(Tf.f.b(j6, unit, Tf.e.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : q(Tf.f.c(j6, unit, eVar));
    }

    public static File j(String imageType) {
        p232p6.p pVar = p232p6.p.f41234a;
        String str = p232p6.p.f41239f;
        if (str == null) {
            Intrinsics.n("fileSavePath");
            throw null;
        }
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        return new File(str, "pp_" + imageType + "_" + System.currentTimeMillis() + PictureMimeType.JPG);
    }

    public static final Throwable j0(Exception throwable) {
        okhttp3.Y y8;
        okhttp3.J j6;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof IOException)) {
            if (!(throwable instanceof C1993k)) {
                return throwable;
            }
            C1993k c1993k = (C1993k) throwable;
            retrofit2.K k2 = c1993k.f41934c;
            String strValueOf = String.valueOf((k2 == null || (y8 = k2.f41873a.f40728a) == null || (j6 = y8.f40685a) == null) ? null : j6.l());
            boolean zIsEmpty = TextUtils.isEmpty(strValueOf);
            String strY = c1993k.f41933b;
            if (!zIsEmpty) {
                strY = N8.q0.y(strY, " when call ", strValueOf);
            }
            int i7 = c1993k.f41932a;
            return new LiveIDException(String.valueOf(i7), com.horcrux.svg.d0.o(p280s6.a.f42044a, "processing_net_error") + "[" + i7 + "]", strY, null, 8, null);
        }
        try {
            if (throwable.getCause() instanceof C1993k) {
                Throwable cause = throwable.getCause();
                Intrinsics.f(cause, "null cannot be cast to non-null type retrofit2.HttpException");
                C1993k c1993k2 = (C1993k) cause;
                int i10 = c1993k2.f41932a;
                String strValueOf2 = String.valueOf(i10);
                p280s6.a.f42044a.getInstance().getClass();
                return new LiveIDException(strValueOf2, p280s6.a.a("processing_net_error") + "[" + i10 + "]", c1993k2.f41933b, null, 8, null);
            }
            String simpleName = null;
            String str = "-99";
            p280s6.a.f42044a.getInstance().getClass();
            String strA = p280s6.a.a("smart_internal_error");
            Throwable cause2 = throwable.getCause();
            if (cause2 != null) {
                simpleName = cause2.getClass().getSimpleName();
            }
            return new LiveIDException(str, strA + "[" + simpleName + "]", throwable.getMessage(), null, 8, null);
        } catch (Exception e10) {
            e10.printStackTrace();
            C2126e.a(throwable, e10);
            return throwable;
        }
    }

    public static final File k() {
        p232p6.p pVar = p232p6.p.f41234a;
        String str = p232p6.p.f41239f;
        if (str == null) {
            Intrinsics.n("fileSavePath");
            throw null;
        }
        Intrinsics.checkNotNullParameter("liveness", "imageType");
        return new File(str, "pp_liveness_" + System.currentTimeMillis() + OfflineConstant.ZIP_SUFFIX);
    }

    public static final long k0(long j6, p039cb.c f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        long jMo72transformXgqJiTY = f10.mo72transformXgqJiTY(F(j6), G(j6));
        return M.h.a(Float.intBitsToFloat((int) (jMo72transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (jMo72transformXgqJiTY & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    public static final int l(com.facebook.imagepipeline.common.i rotationOptions, com.facebook.imagepipeline.common.g gVar, p109h3.e encodedImage, int i7) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int i15 = 1;
        if (!p109h3.e.h(encodedImage)) {
            return 1;
        }
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!p109h3.e.h(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        int i16 = 2;
        if (gVar == null || (i10 = gVar.f21433b) <= 0 || (i11 = gVar.f21432a) <= 0) {
            f10 = 1.0f;
        } else {
            encodedImage.k();
            if (encodedImage.f37278e != 0) {
                encodedImage.k();
                if (encodedImage.f37279f == 0) {
                    f10 = 1.0f;
                } else {
                    if (rotationOptions.a()) {
                        encodedImage.k();
                        i12 = encodedImage.f37276c;
                        if (i12 != 0 && i12 != 90 && i12 != 180 && i12 != 270) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        i12 = 0;
                    }
                    boolean z3 = i12 == 90 || i12 == 270;
                    if (z3) {
                        encodedImage.k();
                        i13 = encodedImage.f37279f;
                    } else {
                        encodedImage.k();
                        i13 = encodedImage.f37278e;
                    }
                    if (z3) {
                        encodedImage.k();
                        i14 = encodedImage.f37278e;
                    } else {
                        encodedImage.k();
                        i14 = encodedImage.f37279f;
                    }
                    float f11 = i11 / i13;
                    float f12 = i10 / i14;
                    f10 = f11 < f12 ? f12 : f11;
                    Object[] objArr = {Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i13), Integer.valueOf(i14), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f10)};
                    if (p229p2.a.f41180a.isLoggable(2)) {
                        p229p2.b.a(2, "DownsampleUtil", String.format(null, "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", objArr));
                    }
                }
            } else {
                f10 = 1.0f;
            }
        }
        encodedImage.k();
        double d2 = 1.0d;
        if (encodedImage.f37275b == W2.c.f10530a) {
            if (f10 <= 0.6666667f) {
                i15 = 2;
                while (true) {
                    int i17 = i15 * 2;
                    double d10 = 1.0d / ((double) i17);
                    if ((((double) 0.33333334f) * d10) + d10 <= f10) {
                        break;
                    }
                    i15 = i17;
                }
            }
        } else if (f10 <= 0.6666667f) {
            while (true) {
                double d11 = i16;
                int i18 = i15;
                if (((d2 / (Math.pow(d11, 2.0d) - d11)) * ((double) 0.33333334f)) + (d2 / d11) <= f10) {
                    break;
                }
                i16++;
                i15 = i18;
                d2 = 1.0d;
            }
            i15 = i16 - 1;
        }
        encodedImage.k();
        int i19 = encodedImage.f37279f;
        encodedImage.k();
        int iMax = Math.max(i19, encodedImage.f37278e);
        float f13 = gVar != null ? 2048.0f : i7;
        while (iMax / i15 > f13) {
            encodedImage.k();
            i15 = encodedImage.f37275b == W2.c.f10530a ? i15 * 2 : i15 + 1;
        }
        return i15;
    }

    public static void l0(String businessType, boolean z3, p1.c cVar) {
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        F6.d.h("LocationServiceManager", 3, "triggerLocationPermissionCheck - Trigger location permission check");
        F6.d.h("LocationServiceManager", 3, "  - businessType: ".concat(businessType));
        F6.d.h("LocationServiceManager", 3, "  - showDialog: " + z3);
        try {
            Activity topActivity = ActivityUtils.getTopActivity();
            if (topActivity != null) {
                F6.d.h("LocationServiceManager", 3, "triggerLocationPermissionCheck - current Activity: ".concat(topActivity.getClass().getSimpleName()));
                R(topActivity, z3, businessType, cVar);
            } else {
                F6.d.c("LocationServiceManager", "triggerLocationPermissionCheck - Unable to get current Activity");
                cVar.onError("ERROR_NO_ACTIVITY", null);
                Intrinsics.checkNotNullParameter("ERROR_NO_ACTIVITY", "status");
                Intrinsics.checkNotNullParameter("Unable to get current Activity", "message");
            }
        } catch (Exception e10) {
            String message = C0.G.o("Failed to trigger location permission check: ", e10.getMessage());
            F6.d.c("LocationServiceManager", C0.G.o("triggerLocationPermissionCheck - ", message), e10);
            cVar.onError("ERROR_PERMISSION_CHECK_FAILED", e10);
            e10.getMessage();
            Intrinsics.checkNotNullParameter("ERROR_PERMISSION_CHECK_FAILED", "status");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public static final long m(long j6, float f10) {
        return M.h.a(F(j6) / f10, G(j6) / f10);
    }

    public static String m0(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final float n(long j6, long j10) {
        return (G(j10) * G(j6)) + (F(j10) * F(j6));
    }

    public static final long o(long j6) {
        long j10 = (j6 << 1) + 1;
        Tf.b bVar = Tf.c.f9078b;
        int i7 = Tf.d.f9082a;
        return j10;
    }

    public static final long p(long j6) {
        return (-4611686018426L > j6 || j6 >= 4611686018427L) ? o(kotlin.ranges.b.d(j6, -4611686018427387903L, 4611686018427387903L)) : q(j6 * ((long) FileSizeUnit.ACCURATE_MB));
    }

    public static final long q(long j6) {
        long j10 = j6 << 1;
        Tf.b bVar = Tf.c.f9078b;
        int i7 = Tf.d.f9082a;
        return j10;
    }

    public static void r(String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            R0.a.b(m0(str), i7);
            return;
        }
        String strM0 = m0(str);
        try {
            if (f1995d == null) {
                f1995d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f1995d.invoke(null, Long.valueOf(f1992a), strM0, Integer.valueOf(i7));
        } catch (Exception e10) {
            H(e10);
        }
    }

    public static int s(float f10, float f11) {
        p118hf.a.g(f10 > 0.0f, "Focal length should be positive.");
        p118hf.a.g(f11 > 0.0f, "Sensor length should be positive.");
        int degrees = (int) Math.toDegrees(Math.atan(f11 / (f10 * 2.0f)) * 2.0d);
        p118hf.a.h(degrees, 0, MessageEvent.EVENT_CL_REPAYMENT_FAILED, "The provided focal length and sensor length result in an invalid view angle degrees.");
        return degrees;
    }

    public static final int t(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.width() * rect.height();
    }

    public static final int u(InputImage inputImage) {
        Intrinsics.checkNotNullParameter(inputImage, "<this>");
        return inputImage.getWidth() * inputImage.getHeight();
    }

    public static int v(androidx.camera.camera2.internal.compat.s sVar, int i7) {
        int i10;
        try {
            for (String str : sVar.f13482a.getCameraIdList()) {
                androidx.camera.camera2.internal.compat.l lVarA = sVar.a(str);
                Integer num = (Integer) lVarA.a(CameraCharacteristics.LENS_FACING);
                p118hf.a.j(num, "Lens facing can not be null");
                int iIntValue = num.intValue();
                if (i7 != 0) {
                    i10 = 1;
                    if (i7 != 1) {
                        i10 = 2;
                        if (i7 != 2) {
                            throw new IllegalArgumentException("The given lens facing: " + i7 + " can not be recognized.");
                        }
                    }
                } else {
                    i10 = 0;
                }
                if (iIntValue == i10) {
                    float[] fArr = (float[]) lVarA.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    p118hf.a.j(fArr, "The focal lengths can not be empty.");
                    return s(fArr[0], E(lVarA));
                }
            }
            throw new IllegalArgumentException("Unable to get the default focal length with the specified lens facing.");
        } catch (androidx.camera.camera2.internal.compat.a unused) {
            throw new IllegalArgumentException("Unable to get the default focal length.");
        }
    }

    public static final long w(long j6) {
        float fSqrt = (float) Math.sqrt((G(j6) * G(j6)) + (F(j6) * F(j6)));
        if (fSqrt > 0.0f) {
            return m(j6, fSqrt);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final A6.a x(Function1 proxy) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        return new A6.a(proxy);
    }

    public static androidx.concurrent.futures.m y(CallbackToFutureAdapter$Resolver callbackToFutureAdapter$Resolver) {
        androidx.concurrent.futures.k kVar = new androidx.concurrent.futures.k();
        kVar.f15062c = new androidx.concurrent.futures.o();
        androidx.concurrent.futures.m mVar = new androidx.concurrent.futures.m(kVar);
        kVar.f15061b = mVar;
        kVar.f15060a = callbackToFutureAdapter$Resolver.getClass();
        try {
            Object objAttachCompleter = callbackToFutureAdapter$Resolver.attachCompleter(kVar);
            if (objAttachCompleter != null) {
                kVar.f15060a = objAttachCompleter;
                return mVar;
            }
        } catch (Exception e10) {
            mVar.f15066b.setException(e10);
        }
        return mVar;
    }

    public static long z(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j6));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (long) Math.floor((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / ((double) 86400000));
    }
}
