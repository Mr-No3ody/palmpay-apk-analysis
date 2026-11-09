package p118hf;

import C2.c;
import Fg.d;
import K3.j;
import L3.b;
import N8.q0;
import Wd.G;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.compat.s;
import androidx.camera.core.ImageProxy;
import androidx.camera.video.u;
import androidx.fragment.app.E;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.common.file.FileTreeVisitor;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.drawable.o;
import com.flexibank.sdk.base.FlexiBankBaseViewModel;
import com.flexibank.sdk.k;
import com.luck.picture.lib.config.FileSizeUnit;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.collections.C;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.y;
import t0.e;
import t0.h;
import t0.q;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f37380c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f37381d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Boolean f37382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f37383f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37385b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f37384a = i7;
        this.f37385b = obj;
    }

    public static void A(FlexiBankBaseViewModel flexiBankBaseViewModel, Function1 request, j viewState) {
        Intrinsics.checkNotNullParameter(flexiBankBaseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        AbstractC0780y.m(V.h(flexiBankBaseViewModel), null, null, new b(viewState, request, null), 3);
    }

    public static void B(FlexiBankBaseViewModel flexiBankBaseViewModel, Function1 request, j viewState) {
        Intrinsics.checkNotNullParameter(flexiBankBaseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        AbstractC0780y.m(V.h(flexiBankBaseViewModel), null, null, new L3.c(viewState, request, null), 3);
    }

    public static File C(File baseDir, String url) {
        String path;
        Intrinsics.checkNotNullParameter(baseDir, "baseDir");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri uri = Uri.parse(url);
            String host = uri.getHost();
            if (host != null) {
                if (host.length() <= 0) {
                    host = null;
                }
                if (host != null && (path = uri.getPath()) != null) {
                    if (path.length() <= 0) {
                        path = null;
                    }
                    if (path != null) {
                        String query = uri.getQuery();
                        if (query == null) {
                            query = "";
                        }
                        String strE = E(host);
                        String strQ = StringsKt.Q(path, "");
                        String strConcat = strQ.length() > 0 ? Consts.DOT.concat(strQ) : "";
                        return new File(baseDir, "web_cache/" + strE + "/" + (E(path.concat(query)) + strConcat));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static int D(int i7, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i7 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i7 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i7 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static String E(String input) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(input, "input");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.e(bArrDigest);
        return C1847n.v(bArrDigest, "", new G(11), 30);
    }

    public static int F(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static String G(long j6) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j6);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static final void H(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.endViewTransition(view);
            viewGroup.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(0.0f);
    }

    public static final void I(IconicsDrawable iconicsDrawable, int i7) {
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        H5.j jVarDp = H5.j.f3734a.dp(Integer.valueOf(i7));
        Intrinsics.checkNotNullParameter(iconicsDrawable, "<this>");
        int iA = jVarDp != null ? jVarDp.a(iconicsDrawable.c()) : -1;
        iconicsDrawable.k(iA);
        iconicsDrawable.l(iA);
    }

    public static LinkedList J(List list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object obj = list.get(i7);
            if (obj == null) {
                throw new ParseException(F.c(i7, "The X.509 certificate at position ", " must not be null"), 0);
            }
            if (!(obj instanceof String)) {
                throw new ParseException(F.c(i7, "The X.509 certificate at position ", " must be encoded as a Base64 string"), 0);
            }
            linkedList.add(new Z5.a((String) obj));
        }
        return linkedList;
    }

    public static void K(Image.Plane plane, int i7, int i10, byte[] bArr, int i11, int i12) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i13 = i7 / (i10 / rowStride);
        int rowStride2 = 0;
        for (int i14 = 0; i14 < rowStride; i14++) {
            int pixelStride = rowStride2;
            for (int i15 = 0; i15 < i13; i15++) {
                bArr[i11] = buffer.get(pixelStride);
                i11 += i12;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    public static void L(File file, FileTreeVisitor fileTreeVisitor) {
        fileTreeVisitor.preVisitDirectory(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    L(file2, fileTreeVisitor);
                } else {
                    fileTreeVisitor.visitFile(file2);
                }
            }
        }
        fileTreeVisitor.postVisitDirectory(file);
    }

    public static int a(float f10) {
        return (int) ((f10 * D3.a.f1587c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final void b(Fg.a aVar, Fg.b bVar, String str) {
        Logger logger = d.f2845h.getLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f2840b);
        sb2.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.f2835a);
        logger.fine(sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static boolean c(int i7, Rect rect, Rect rect2, Rect rect3) {
        int iD;
        int i10;
        int i11;
        boolean zD = d(i7, rect, rect2);
        if (d(i7, rect, rect3) || !zD) {
            return false;
        }
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i7 != 17 && i7 != 66) {
                            iD = D(i7, rect, rect2);
                            if (i7 != 17) {
                                i10 = rect.left;
                                i11 = rect3.left;
                            } else if (i7 != 33) {
                                i10 = rect.top;
                                i11 = rect3.top;
                            } else if (i7 != 66) {
                                i10 = rect3.right;
                                i11 = rect.right;
                            } else {
                                if (i7 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i10 = rect3.bottom;
                                i11 = rect.bottom;
                            }
                            if (iD < Math.max(1, i10 - i11)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i7 != 17) {
                        iD = D(i7, rect, rect2);
                        if (i7 != 17) {
                            i10 = rect.left;
                            i11 = rect3.left;
                        } else if (i7 != 33) {
                            i10 = rect.top;
                            i11 = rect3.top;
                        } else if (i7 != 66) {
                            i10 = rect3.right;
                            i11 = rect.right;
                        } else {
                            if (i7 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i10 = rect3.bottom;
                            i11 = rect.bottom;
                        }
                        if (iD < Math.max(1, i10 - i11)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i7 != 17) {
                    iD = D(i7, rect, rect2);
                    if (i7 != 17) {
                        i10 = rect.left;
                        i11 = rect3.left;
                    } else if (i7 != 33) {
                        i10 = rect.top;
                        i11 = rect3.top;
                    } else if (i7 != 66) {
                        i10 = rect3.right;
                        i11 = rect.right;
                    } else {
                        if (i7 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i10 = rect3.bottom;
                        i11 = rect.bottom;
                    }
                    if (iD < Math.max(1, i10 - i11)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i7 != 17) {
                iD = D(i7, rect, rect2);
                if (i7 != 17) {
                    i10 = rect.left;
                    i11 = rect3.left;
                } else if (i7 != 33) {
                    i10 = rect.top;
                    i11 = rect3.top;
                } else if (i7 != 66) {
                    i10 = rect3.right;
                    i11 = rect.right;
                } else {
                    if (i7 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i10 = rect3.bottom;
                    i11 = rect.bottom;
                }
                if (iD < Math.max(1, i10 - i11)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean d(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final void e(BaseMvvmFragment baseMvvmFragment, OcHomeFinanceViewModel ocHomeFinanceViewModel, Function1 onBound) {
        Intrinsics.checkNotNullParameter(baseMvvmFragment, "<this>");
        Intrinsics.checkNotNullParameter(onBound, "onBound");
        E eRequireActivity = baseMvvmFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
        OcHomeFinanceViewModel ocHomeFinanceViewModel2 = (OcHomeFinanceViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(OcHomeFinanceViewModel.class);
        if (ocHomeFinanceViewModel != ocHomeFinanceViewModel2) {
            if (ocHomeFinanceViewModel != null) {
                baseMvvmFragment.getLifecycle().b(ocHomeFinanceViewModel);
            }
            baseMvvmFragment.getLifecycle().a(ocHomeFinanceViewModel2);
        }
        onBound.invoke(ocHomeFinanceViewModel2);
    }

    public static void f(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void h(int i7, int i10, int i11, String str) {
        if (i7 < i10) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i10 + ", " + i11 + "] (too low)");
        }
        if (i7 <= i11) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i10 + ", " + i11 + "] (too high)");
    }

    public static void i(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void k(boolean z3, String str) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }

    public static float l(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static int m(int i7, int i10, int i11) {
        if (i7 < i10) {
            return i10;
        }
        return i7 > i11 ? i11 : i7;
    }

    public static String n(s sVar, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) sVar.a("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) sVar.a("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    public static boolean o(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                o(file2);
            }
        }
        return file.delete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList p(Af.d f1, Af.d f10) {
        Intrinsics.checkNotNullParameter(f1, "f1");
        Intrinsics.checkNotNullParameter(f10, "f2");
        Iterator it = C1850q.f(f10).iterator();
        Rf.b bVar = (Rf.b) it;
        if (!bVar.f8613c) {
            throw new NoSuchElementException();
        }
        C c6 = (C) it;
        int iA = c6.a();
        if (bVar.f8613c) {
            float fQ = q(((q) f1.get(0)).f42296b, ((q) f10.get(iA)).f42296b);
            do {
                int iA2 = c6.a();
                float fQ2 = q(((q) f1.get(0)).f42296b, ((q) f10.get(iA2)).f42296b);
                if (Float.compare(fQ, fQ2) > 0) {
                    iA = iA2;
                    fQ = fQ2;
                }
            } while (bVar.f8613c);
        }
        int iA3 = f1.a();
        int iA4 = f10.a();
        ArrayList arrayListI = C1850q.i(f10.get(iA));
        int i7 = iA;
        for (int i10 = 1; i10 < iA3; i10++) {
            int i11 = iA - (iA3 - i10);
            if (i11 <= i7) {
                i11 += iA4;
            }
            Iterator it2 = new IntRange(i7 + 1, i11, 1).iterator();
            Rf.b bVar2 = (Rf.b) it2;
            if (!bVar2.f8613c) {
                throw new NoSuchElementException();
            }
            C c10 = (C) it2;
            int iA5 = c10.a();
            if (bVar2.f8613c) {
                float fQ3 = q(((q) f1.get(i10)).f42296b, ((q) f10.get(iA5 % iA4)).f42296b);
                do {
                    int iA6 = c10.a();
                    float fQ4 = q(((q) f1.get(i10)).f42296b, ((q) f10.get(iA6 % iA4)).f42296b);
                    if (Float.compare(fQ3, fQ4) > 0) {
                        iA5 = iA6;
                        fQ3 = fQ4;
                    }
                } while (bVar2.f8613c);
            }
            i7 = iA5;
            arrayListI.add(f10.get(i7 % iA4));
        }
        return arrayListI;
    }

    public static final float q(t0.j f1, t0.j f10) {
        Intrinsics.checkNotNullParameter(f1, "f1");
        Intrinsics.checkNotNullParameter(f10, "f2");
        if ((f1 instanceof h) && (f10 instanceof h) && ((h) f1).f42282d != ((h) f10).f42282d) {
            return Float.MAX_VALUE;
        }
        float f11 = ((e) CollectionsKt.F(f1.f42283a)).f42277a[0];
        List list = f1.f42283a;
        float fA = (((e) CollectionsKt.K(list)).a() + f11) / 2.0f;
        float fB = (((e) CollectionsKt.K(list)).b() + ((e) CollectionsKt.F(list)).f42277a[1]) / 2.0f;
        float f12 = ((e) CollectionsKt.F(f10.f42283a)).f42277a[0];
        List list2 = f10.f42283a;
        float fA2 = (((e) CollectionsKt.K(list2)).a() + f12) / 2.0f;
        float f13 = fA - fA2;
        float fB2 = fB - ((((e) CollectionsKt.K(list2)).b() + ((e) CollectionsKt.F(list2)).f42277a[1]) / 2.0f);
        return (fB2 * fB2) + (f13 * f13);
    }

    public static final String r(long j6) {
        String strN;
        if (j6 <= -999500000) {
            strN = q0.n(new StringBuilder(), " s ", (j6 - ((long) 500000000)) / ((long) FileSizeUnit.ACCURATE_GB));
        } else if (j6 <= -999500) {
            strN = q0.n(new StringBuilder(), " ms", (j6 - ((long) 500000)) / ((long) FileSizeUnit.ACCURATE_MB));
        } else if (j6 <= 0) {
            strN = q0.n(new StringBuilder(), " µs", (j6 - ((long) 500)) / ((long) 1000));
        } else if (j6 < 999500) {
            strN = q0.n(new StringBuilder(), " µs", (j6 + ((long) 500)) / ((long) 1000));
        } else {
            strN = j6 < 999500000 ? q0.n(new StringBuilder(), " ms", (j6 + ((long) 500000)) / ((long) FileSizeUnit.ACCURATE_MB)) : q0.n(new StringBuilder(), " s ", (j6 + ((long) 500000000)) / ((long) FileSizeUnit.ACCURATE_GB));
        }
        return com.airbnb.lottie.model.layer.d.n(new Object[]{strN}, 1, "%6s", "format(format, *args)");
    }

    public static String s(long j6) {
        String str = "0.00";
        if (j6 != 0) {
            double dDoubleValue = j6 * 0.01d;
            try {
                dDoubleValue = BigDecimal.valueOf(dDoubleValue).setScale(2, 4).doubleValue();
            } catch (Exception unused) {
            }
            try {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dDoubleValue);
                if (Math.abs(dDoubleValue) < 100.0d) {
                    str = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(bigDecimalValueOf);
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                } else {
                    str = new DecimalFormat(",###,###.00", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(bigDecimalValueOf);
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                }
            } catch (Exception e10) {
                Log.e("FlexiBankAmountUtil", "getAmountStringWithThousandCharacter: ", e10);
                str = "";
            }
        }
        return "AO".equalsIgnoreCase(k.f22325i) ? y.k(y.k(y.k(str, Consts.DOT, "|"), ",", Consts.DOT), "|", ",") : str;
    }

    public static String t(long j6, boolean z3) {
        String strS = s(j6);
        StringBuilder sb2 = new StringBuilder("₦");
        k kVar = k.f22317a;
        if (!z3) {
            sb2.append(" ");
        }
        sb2.append(strS);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static Bitmap u(ImageProxy imageProxy) {
        if (imageProxy.getImage() == null) {
            return null;
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
        Image.Plane[] planes = imageProxy.getImage().getPlanes();
        int width2 = imageProxy.getWidth();
        int height2 = imageProxy.getHeight();
        int i7 = width2 * height2;
        byte[] bArr = new byte[u.y(i7, 4, 2, i7)];
        ByteBuffer buffer = planes[1].getBuffer();
        ByteBuffer buffer2 = planes[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i10 = (i7 * 2) / 4;
        boolean z3 = buffer2.remaining() == i10 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z3) {
            planes[0].getBuffer().get(bArr, 0, i7);
            ByteBuffer buffer3 = planes[1].getBuffer();
            planes[2].getBuffer().get(bArr, i7, 1);
            buffer3.get(bArr, i7 + 1, i10 - 1);
        } else {
            K(planes[0], width2, height2, bArr, 0, 1);
            K(planes[1], width2, height2, bArr, i7 + 1, 2);
            K(planes[2], width2, height2, bArr, i7, 2);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.rewind();
        int iLimit2 = byteBufferWrap.limit();
        byte[] bArr2 = new byte[iLimit2];
        byteBufferWrap.get(bArr2, 0, iLimit2);
        try {
            YuvImage yuvImage = new YuvImage(bArr2, 17, width, height, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, width, height), 80, byteArrayOutputStream);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            Matrix matrix = new Matrix();
            matrix.postRotate(rotationDegrees);
            matrix.postScale(1.0f, 1.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
            if (bitmapCreateBitmap != bitmapDecodeByteArray) {
                bitmapDecodeByteArray.recycle();
            }
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            Log.e("VisionProcessorBase", "Error: " + e10.getMessage());
            return null;
        }
    }

    public static Drawable v(Context context, TypedArray typedArray, int i7) {
        int resourceId = typedArray.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static p061e3.k w() {
        p061e3.s sVar = p061e3.s.f36098p;
        p213o2.e.e(sVar, "ImagePipelineFactory was not initialized!");
        return sVar.e();
    }

    public static I2.d x(I2.b bVar) {
        if (bVar.f3988p == null) {
            bVar.f3988p = new I2.d();
        }
        return bVar.f3988p;
    }

    public static n y(TypedArray typedArray, int i7) {
        switch (typedArray.getInt(i7, -2)) {
            case -1:
                return null;
            case 0:
                return o.f21336i;
            case 1:
                return o.f21335h;
            case 2:
                return o.f21333f;
            case 3:
                return o.f21334g;
            case 4:
                return o.f21329b;
            case 5:
                return o.f21331d;
            case 6:
                return o.f21330c;
            case 7:
                return o.f21337j;
            case 8:
                return o.f21332e;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static boolean z(int i7, Rect rect, Rect rect2) {
        if (i7 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i7 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i7 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }
}
