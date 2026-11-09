package p059e1;

import C0.G;
import Dg.c;
import G1.d;
import O.f;
import Yf.A;
import Yf.EnumC0789a;
import Yf.n;
import Yf.q;
import Z4.g;
import android.content.Context;
import android.graphics.Point;
import android.opengl.Matrix;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.biometric.C0915t;
import androidx.core.view.ViewPropertyAnimatorListener;
import com.alibaba.android.arouter.utils.Consts;
import com.bumptech.glide.load.engine.k;
import com.google.common.primitives.UnsignedBytes;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.SPUtils;
import io.fastkv.m;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.y;
import kotlinx.coroutines.channels.Channel;
import p021b5.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ViewPropertyAnimatorListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f35989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ScheduledExecutorService f35990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f35991d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35992a;

    public /* synthetic */ a(int i7) {
        this.f35992a = i7;
    }

    public static final boolean C(String key, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        return SPUtils.getInstance(G(key)).getBoolean(key, z3);
    }

    public static final int D(int i7, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return SPUtils.getInstance(G(key)).getInt(key, i7);
    }

    public static final long E(long j6, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return SPUtils.getInstance(G(key)).getLong(key, j6);
    }

    public static final long F(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return SPUtils.getInstance(G(key)).getLong(p367ya.a.d().e(key), 0L);
    }

    public static final String G(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return StringsKt.A(key, "_sp_", false) ? StringsKt.T(key, "_sp_") : "";
    }

    public static final String H(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = SPUtils.getInstance(G(key)).getString(key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final String I(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String string = SPUtils.getInstance(G(key)).getString(key, value);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static b K(View view) {
        Object tag = view.getTag(g.growing_tracker_view_page);
        if (tag instanceof b) {
            return (b) tag;
        }
        return null;
    }

    public static ClassLoader L() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final boolean M(int i7, byte[] byteArray, byte[] pattern) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (pattern.length + i7 <= byteArray.length) {
            Intrinsics.checkNotNullParameter(pattern, "<this>");
            Intrinsics.checkNotNullParameter(pattern, "<this>");
            Iterable intRange = new IntRange(0, pattern.length - 1, 1);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (((Rf.b) it).f8613c) {
                    int iA = ((C) it).a();
                    if (byteArray[i7 + iA] != pattern[iA]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void N(Context context, String str, ImageView imageView, int i7) {
        if (context == null || imageView == null || TextUtils.isEmpty(str)) {
            return;
        }
        d dVar = (d) new d().g(k.f20703b);
        if (i7 > 0) {
            dVar = (d) dVar.v(i7);
        }
        com.bumptech.glide.b.c(context).c(context).load(str).a(dVar).S(imageView);
    }

    public static long O(float f10, float f11) {
        return ((long) Float.floatToRawIntBits(f11)) | (((long) Float.floatToRawIntBits(f10)) << 32);
    }

    public static void S(float f10, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void T(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static final void U(int i7, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SPUtils.getInstance(G(key)).put(key, i7);
    }

    public static final void V(long j6, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SPUtils.getInstance(G(key)).put(key, j6);
    }

    public static final void W(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SPUtils.getInstance(G(key)).put(key, value);
    }

    public static final void X(String key, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        SPUtils.getInstance(G(key)).put(key, z3);
    }

    public static final void Y(long j6, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SPUtils.getInstance(G(key)).put(p367ya.a.d().e(key), j6);
    }

    public static final void Z(String key, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        SPUtils.getInstance(G(key)).put(p367ya.a.d().e(key), z3);
    }

    public static n a(int i7, EnumC0789a enumC0789a, int i10) {
        if ((i10 & 1) != 0) {
            i7 = 0;
        }
        if ((i10 & 2) != 0) {
            enumC0789a = EnumC0789a.f11390a;
        }
        if (i7 == -2) {
            if (enumC0789a != EnumC0789a.f11390a) {
                return new A(1, enumC0789a);
            }
            Channel.f39041m0.getClass();
            return new n(q.f11442b);
        }
        if (i7 == -1) {
            if (enumC0789a == EnumC0789a.f11390a) {
                return new A(1, EnumC0789a.f11391b);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i7 == 0) {
            return enumC0789a == EnumC0789a.f11390a ? new n(0) : new A(1, enumC0789a);
        }
        if (i7 != Integer.MAX_VALUE) {
            return enumC0789a == EnumC0789a.f11390a ? new n(i7) : new A(i7, enumC0789a);
        }
        return new n(Integer.MAX_VALUE);
    }

    public static final boolean a0(byte[] byteArray, byte[] pattern) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return M(0, byteArray, pattern);
    }

    public static final void b(int i7, StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i10 = 0; i10 < i7; i10++) {
            builder.append("?");
            if (i10 < i7 - 1) {
                builder.append(",");
            }
        }
    }

    public static final String b0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i7 = 0;
        int i10 = -1;
        if (!StringsKt.A(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = lowerCase.charAt(i11);
                    if (Intrinsics.h(cCharAt, 31) <= 0 || Intrinsics.h(cCharAt, 127) >= 0 || StringsKt.D(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressI = (y.m(str, "[", false) && y.g(str, "]", false)) ? i(1, str.length() - 1, str) : i(0, str.length(), str);
        if (inetAddressI == null) {
            return null;
        }
        byte[] address = inetAddressI.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressI.getHostAddress();
            }
            throw new AssertionError(G.l('\'', "Invalid IPv6 address: '", str));
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        Pg.k kVar = new Pg.k();
        while (i7 < address.length) {
            if (i7 == i10) {
                kVar.m(58);
                i7 += i13;
                if (i7 == 16) {
                    kVar.m(58);
                }
            } else {
                if (i7 > 0) {
                    kVar.m(58);
                }
                byte b7 = address[i7];
                byte[] bArr = c.f1879a;
                kVar.o(((b7 & UnsignedBytes.MAX_VALUE) << 8) | (address[i7 + 1] & UnsignedBytes.MAX_VALUE));
                i7 += 2;
            }
        }
        return kVar.readUtf8();
    }

    public static final byte[] c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Charset charsetForName = Charset.forName("ASCII");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = value.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static void d(boolean z3) {
        if (!z3) {
            throw new AssertionError();
        }
    }

    public static void e(boolean z3, String str) {
        if (!z3) {
            throw new AssertionError(str);
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new AssertionError();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new AssertionError(str);
        }
    }

    public static IconicsDrawable h(Context context, IIcon iIcon, String str, int i7, float f10) {
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context);
        if (iIcon != null) {
            iconicsDrawable.i(iIcon);
        } else if (!TextUtils.isEmpty(str)) {
            D3.a.k(iconicsDrawable, str);
        }
        int iJ = j(context, f10);
        iconicsDrawable.j(j(context, 0.0f));
        iconicsDrawable.k(iJ);
        iconicsDrawable.l(iJ);
        iconicsDrawable.setTint(i7);
        return iconicsDrawable;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final InetAddress i(int i7, int i10, String str) {
        int i11;
        int i12;
        int iR;
        byte[] bArr = new byte[16];
        int i13 = i7;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (i13 < i10) {
            if (i14 == 16) {
                return null;
            }
            int i17 = i13 + 2;
            if (i17 <= i10 && y.l(str, "::", i13, false)) {
                if (i15 != -1) {
                    return null;
                }
                i14 += 2;
                i15 = i14;
                if (i17 == i10) {
                    break;
                }
                i16 = i17;
                i11 = 0;
                i13 = i16;
                while (i13 < i10) {
                    iR = c.r(str.charAt(i13));
                    if (iR != -1) {
                        break;
                        break;
                    }
                    i11 = (i11 << 4) + iR;
                    i13++;
                }
                i12 = i13 - i16;
                return i12 == 0 ? null : null;
            }
            if (i14 != 0) {
                if (!y.l(str, ":", i13, false)) {
                    if (!y.l(str, Consts.DOT, i13, false)) {
                        return null;
                    }
                    int i18 = i14 - 2;
                    int i19 = i18;
                    while (i16 < i10) {
                        if (i19 == 16) {
                            return null;
                        }
                        if (i19 != i18) {
                            if (str.charAt(i16) != '.') {
                                return null;
                            }
                            i16++;
                        }
                        int i20 = 0;
                        int i21 = i16;
                        while (i21 < i10) {
                            char cCharAt = str.charAt(i21);
                            if (Intrinsics.h(cCharAt, 48) < 0 || Intrinsics.h(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i20 == 0 && i16 != i21) || (i20 = ((i20 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i21++;
                        }
                        if (i21 - i16 == 0) {
                            return null;
                        }
                        bArr[i19] = (byte) i20;
                        i19++;
                        i16 = i21;
                    }
                    if (i19 != i14 + 2) {
                        return null;
                    }
                    i14 += 2;
                    break;
                }
                i13++;
            }
            i16 = i13;
            i11 = 0;
            i13 = i16;
            while (i13 < i10) {
                iR = c.r(str.charAt(i13));
                if (iR != -1) {
                    break;
                }
                i11 = (i11 << 4) + iR;
                i13++;
            }
            i12 = i13 - i16;
            if (i12 == 0 && i12 <= 4) {
                int i22 = i14 + 1;
                bArr[i14] = (byte) (255 & (i11 >>> 8));
                i14 += 2;
                bArr[i22] = (byte) (i11 & 255);
            }
        }
        if (i14 != 16) {
            if (i15 == -1) {
                return null;
            }
            int i23 = i14 - i15;
            System.arraycopy(bArr, i15, bArr, 16 - i23, i23);
            Arrays.fill(bArr, i15, (16 - i14) + i15, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static int j(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void k(m mVar, String str) {
        Log.e("FastKV", mVar.f37648b + " " + str);
    }

    public static InvocationHandler l() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, L()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static View m(int i7, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewFindViewById = viewGroup.getChildAt(i10).findViewById(i7);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static a n(int i7, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i7 = 2;
        }
        if (i7 == 0) {
            return new O.g(dArr, dArr2);
        }
        if (i7 == 2) {
            double d2 = dArr[0];
            double[] dArr3 = dArr2[0];
            O.c cVar = new O.c(5);
            cVar.f6481e = d2;
            cVar.f6482f = dArr3;
            return cVar;
        }
        f fVar = new f(5);
        int length = dArr2[0].length;
        fVar.f6493g = new double[length];
        fVar.f6491e = dArr;
        fVar.f6492f = dArr2;
        if (length > 2) {
            double d10 = 0.0d;
            int i10 = 0;
            while (true) {
                double d11 = d10;
                if (i10 >= dArr.length) {
                    break;
                }
                double d12 = dArr2[i10][0];
                if (i10 > 0) {
                    Math.hypot(d12 - d10, d12 - d11);
                }
                i10++;
                d10 = d12;
            }
        }
        return fVar;
    }

    public static String q(View view) {
        Object tag = view.getTag(g.growing_tracker_view_custom_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static String s(String str) {
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

    public static String t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "#";
            }
            String upperCase = str.substring(0, 1).toUpperCase();
            return !upperCase.matches("[A-Z]") ? "#" : upperCase;
        } catch (Exception unused) {
            return "#";
        }
    }

    public static int y(Context context) {
        if (context == null) {
            return 0;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public abstract double A(double d2);

    public abstract void B(double d2, double[] dArr);

    public abstract double[] J();

    public abstract int o(View view, int i7, int i10);

    public p317v0.g p() {
        return new p317v0.g();
    }

    public abstract String r();

    public String toString() {
        switch (this.f35992a) {
            case 19:
                return "Alignment:" + r();
            default:
                return super.toString();
        }
    }

    public abstract int u(int i7, View view);

    public abstract double v(double d2);

    public abstract void w(double d2, double[] dArr);

    public abstract void x(double d2, float[] fArr);

    public void Q() {
    }

    public void R(C0915t c0915t) {
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel(View view) {
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart(View view) {
    }

    public void P(int i7, CharSequence charSequence) {
    }

    public int z(int i7, int i10) {
        return i7;
    }
}
