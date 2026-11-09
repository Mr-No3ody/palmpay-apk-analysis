package androidx.camera.core.impl.utils;

import C0.AbstractC0130w;
import C0.C0111c;
import E.AbstractC0198c;
import Sf.p;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0968a0;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.growingio.android.sdk.track.webservices.widget.TipView;
import com.horcrux.svg.d0;
import com.swmansion.rnscreens.gamma.common.FragmentProviding;
import com.transsnet.palmpay.account.business.IApiAccountService;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.send_money.utils.OnSectionListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipException;
import kotlin.collections.C1847n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Decoder, CompositeDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f14249a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Application f14250b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f14251c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static AnimatedFactory f14252d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f14253e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f14254f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Class f14255g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f14256h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f14257i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f14258j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f14259k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f14260l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile boolean f14261m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Application f14262n;

    public static final void A(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, Float f10, Integer num4) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setFitToContents(false);
        if (num != null) {
            bottomSheetBehavior.setState(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.setPeekHeight(num2.intValue());
        }
        if (f10 != null) {
            bottomSheetBehavior.setHalfExpandedRatio(f10.floatValue());
        }
        if (num4 != null) {
            bottomSheetBehavior.setExpandedOffset(num4.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.setMaxHeight(num3.intValue());
        }
    }

    public static /* synthetic */ void B(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f10, Integer num3, int i7) {
        Integer num4 = (i7 & 1) != 0 ? null : 3;
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        if ((i7 & 8) != 0) {
            f10 = null;
        }
        A(bottomSheetBehavior, num4, num, num2, f10, (i7 & 16) != 0 ? null : num3);
    }

    public static final void C(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setFitToContents(true);
        if (num != null) {
            bottomSheetBehavior.setState(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.setPeekHeight(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.setMaxHeight(num3.intValue());
        }
    }

    public static /* synthetic */ void D(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, int i7) {
        Integer num3 = (i7 & 1) != 0 ? null : 3;
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        C(bottomSheetBehavior, num3, num, num2);
    }

    public static float a(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final p133ig.e c(String serialName, p133ig.g kind, SerialDescriptor[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.F(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(p133ig.h.f37622a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        p133ig.a aVar = new p133ig.a(serialName);
        builder.invoke(aVar);
        return new p133ig.e(serialName, kind, aVar.f37593c.size(), C1847n.y(typeParameters), aVar);
    }

    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return X.a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0970b0) it.next()).b();
        }
    }

    public static int g(float f10, int i7, int i10) {
        if (i7 == i10 || f10 <= 0.0f) {
            return i7;
        }
        if (f10 >= 1.0f) {
            return i10;
        }
        float f11 = ((i7 >> 24) & 255) / 255.0f;
        float f12 = ((i10 >> 24) & 255) / 255.0f;
        float fA = a(((i7 >> 16) & 255) / 255.0f);
        float fA2 = a(((i7 >> 8) & 255) / 255.0f);
        float fA3 = a((i7 & 255) / 255.0f);
        float fA4 = a(((i10 >> 16) & 255) / 255.0f);
        float fA5 = a(((i10 >> 8) & 255) / 255.0f);
        float fA6 = a((i10 & 255) / 255.0f);
        float fE = d0.e(f12, f11, f10, f11);
        float fE2 = d0.e(fA4, fA, f10, fA);
        float fE3 = d0.e(fA5, fA2, f10, fA2);
        float fE4 = d0.e(fA6, fA3, f10, fA3);
        float fB = b(fE2) * 255.0f;
        float fB2 = b(fE3) * 255.0f;
        return Math.round(b(fE4) * 255.0f) | (Math.round(fB) << 16) | (Math.round(fE * 255.0f) << 24) | (Math.round(fB2) << 8);
    }

    public static m h(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j6 = length - 22;
        if (j6 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j10 = length - 65558;
        long j11 = j10 >= 0 ? j10 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j6);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                m mVar = new m();
                mVar.f14248c = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                mVar.f14247b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return mVar;
            }
            j6--;
        } while (j6 >= j11);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static Z i(ViewGroup view) {
        boolean z3;
        boolean z8;
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent viewParent = view;
        while (true) {
            z3 = viewParent instanceof ReactRootView;
            if (z3 || (viewParent instanceof FragmentProviding) || viewParent.getParent() == null) {
                break;
            }
            ViewParent parent = viewParent.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            viewParent = parent;
        }
        if (viewParent instanceof FragmentProviding) {
            Fragment associatedFragment = ((FragmentProviding) viewParent).getAssociatedFragment();
            if (associatedFragment != null) {
                return associatedFragment.getChildFragmentManager();
            }
            throw new IllegalStateException(("[RNScreens] Parent fragment providing view " + viewParent + " returned nullish fragment").toString());
        }
        if (!z3) {
            throw new IllegalStateException("[RNScreens] Expected parent to be a ReactRootView, instead found: ".concat(viewParent.getClass().getName()).toString());
        }
        ReactRootView reactRootView = (ReactRootView) viewParent;
        Context context = reactRootView.getContext();
        while (true) {
            z8 = context instanceof E;
            if (z8 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z8) {
            throw new IllegalStateException("[RNScreens] In order to use react-native-screens components your app's activity need to extend ReactActivity");
        }
        E e10 = (E) context;
        if (e10.getSupportFragmentManager().f17069c.f().isEmpty()) {
            return e10.getSupportFragmentManager();
        }
        try {
            return Z.C(reactRootView).getChildFragmentManager();
        } catch (IllegalStateException unused) {
            return e10.getSupportFragmentManager();
        }
    }

    public static final AbstractC0130w j(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AbstractC0130w abstractC0130w = (AbstractC0130w) p.d(p.g(Sf.m.b(view, C0111c.f1014p), C0111c.t));
        if (abstractC0130w != null) {
            return abstractC0130w;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static Object k() {
        Object obj;
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception e10) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e10.getMessage());
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e11) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e11.getMessage());
            return null;
        }
    }

    public static Application l() {
        Object objInvoke;
        Application application = f14250b;
        if (application != null) {
            return application;
        }
        Application application2 = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objK = k();
            if (objK != null && (objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(objK, new Object[0])) != null) {
                application2 = (Application) objInvoke;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (application2 == null) {
            Log.e("Utils", "app is null.");
        } else {
            Application application3 = f14250b;
            if (application3 == null || !application3.equals(application2)) {
                f14250b = application2;
            }
        }
        if (f14250b == null) {
            throw new NullPointerException("reflect failed.");
        }
        G6.c.a();
        return f14250b;
    }

    public static byte[] m(String str, Charset charset) {
        return charset == null ? str.getBytes(Ag.b.f358b) : str.getBytes(charset);
    }

    public static WritableMap n(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str);
        return writableMapCreateMap;
    }

    public static Handler o() {
        if (f14249a != null) {
            return f14249a;
        }
        synchronized (n.class) {
            try {
                if (f14249a == null) {
                    f14249a = d(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14249a;
    }

    public static String p(float f10) throws IOException {
        p305u5.f.f42708a.getClass();
        ArrayList<p305u5.a> arrayListB = C2085k0.b();
        for (int size = arrayListB.size() - 1; size >= 0; size--) {
            if (((p305u5.a) arrayListB.get(size)).f42700a instanceof TipView) {
                arrayListB.remove(size);
                break;
            }
        }
        DisplayMetrics displayMetricsB = p291t5.b.b(com.growingio.android.sdk.d.a().getApplicationContext());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(displayMetricsB.widthPixels, displayMetricsB.heightPixels, Bitmap.Config.ARGB_8888);
        for (p305u5.a aVar : arrayListB) {
            if ((aVar.f42702c.flags & 2) == 2) {
                new Canvas(bitmapCreateBitmap).drawARGB((int) (aVar.f42702c.dimAmount * 255.0f), 0, 0, 0);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Rect rect = aVar.f42701b;
            canvas.translate(rect.left, rect.top);
            aVar.f42700a.draw(canvas);
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f10, f10);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, false);
        if (!bitmapCreateBitmap2.equals(bitmapCreateBitmap)) {
            bitmapCreateBitmap.recycle();
            bitmapCreateBitmap = bitmapCreateBitmap2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        bitmapCreateBitmap.recycle();
        return "data:image/jpeg;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static final ArrayList q(List recipients, Function1 createT) {
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(createT, "createT");
        ArrayList arrayList = new ArrayList();
        Iterator it = recipients.iterator();
        String str = "";
        while (it.hasNext()) {
            OnSectionListener onSectionListener = (OnSectionListener) it.next();
            String strL = null;
            String section = onSectionListener != null ? onSectionListener.getSection() : null;
            String str2 = "#";
            if (!TextUtils.isEmpty(section)) {
                if (section != null) {
                    String strSubstring = section.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring != null) {
                        strL = com.airbnb.lottie.model.layer.d.l("getDefault(...)", strSubstring, "toUpperCase(...)");
                    }
                }
                if (strL == null || new Regex("[A-Z]").b(strL)) {
                    str2 = strL;
                }
            }
            if (!Intrinsics.c(str, str2)) {
                str = str2 == null ? "" : str2;
                arrayList.add(createT.invoke(str));
            }
            arrayList.add(onSectionListener);
        }
        return arrayList;
    }

    public static void r(List list) throws C0968a0 {
        if (list.isEmpty()) {
            return;
        }
        int i7 = 0;
        do {
            try {
                ((AbstractC0970b0) list.get(i7)).d();
                i7++;
            } catch (C0968a0 e10) {
                for (int i10 = i7 - 1; i10 >= 0; i10--) {
                    ((AbstractC0970b0) list.get(i10)).b();
                }
                throw e10;
            }
        } while (i7 < list.size());
    }

    public static void s(Application application) {
        org.sufficientlysecure.htmltextview.g gVar = new org.sufficientlysecure.htmltextview.g(9);
        if (f14261m) {
            return;
        }
        f14262n = application;
        p080f7.a aVar = new p080f7.a(application);
        if (p377z5.l.f44480a == null || p377z5.l.f44481b == null || p377z5.l.f44482c == null) {
            p377z5.l.f44480a = application;
            p377z5.a aVarA = p377z5.a.a();
            aVarA.getClass();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(aVarA);
            }
            p377z5.l.f44481b = aVar;
            aVar.f44476a = p377z5.l.f44480a;
            p377z5.l.f44482c = gVar;
        }
        p377z5.l.f44482c = new Oe.a(p377z5.l.f44482c, 1);
        f14261m = true;
    }

    public static /* synthetic */ Object t(IApiAccountService iApiAccountService, String str, String str2, Ff.h hVar, int i7) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        return iApiAccountService.preCheckPhoneMvvm(str, str2, null, null, hVar);
    }

    public static void u(CharSequence charSequence) {
        p377z5.j jVar = new p377z5.j();
        jVar.f44470a = charSequence;
        p377z5.l.I(jVar);
    }

    public static void v(int i7) {
        Application application = f14262n;
        if (application == null) {
            throw new RuntimeException("PpToast is not init!");
        }
        p377z5.j jVar = new p377z5.j();
        jVar.f44470a = application.getResources().getString(i7);
        jVar.f44472c = new N2.b(L6.g.lib_ui_toast_success);
        p377z5.l.I(jVar);
    }

    public static void w(String str) {
        p377z5.j jVar = new p377z5.j();
        jVar.f44470a = str;
        jVar.f44472c = new N2.b(L6.g.lib_ui_toast_success);
        p377z5.l.I(jVar);
    }

    public static /* synthetic */ void y(ILoanCreditService iLoanCreditService, Z z3, String str, String str2, String str3, int i7) {
        if ((i7 & 4) != 0) {
            str2 = "OTHER";
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        iLoanCreditService.startCredit(z3, str, str2, str3);
    }

    public static androidx.concurrent.futures.m z(List list, long j6, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.utils.executor.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.core.impl.utils.futures.j.e(((AbstractC0970b0) it.next()).c()));
        }
        return AbstractC0198c.y(new defpackage.a(AbstractC0198c.y(new androidx.camera.core.impl.utils.futures.c(androidx.camera.core.impl.utils.futures.j.h(arrayList), dVar, j6, 0)), iVar, list));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        e();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public boolean decodeBooleanElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte decodeByte();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public byte decodeByteElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        e();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public char decodeCharElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        e();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public double decodeDoubleElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        e();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        e();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public float decodeFloatElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Decoder decodeInlineElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeInline(descriptor.getElementDescriptor(i7));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int decodeInt();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeIntElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long decodeLong();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public long decodeLongElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeNullableSerializableElement(SerialDescriptor descriptor, int i7, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!deserializer.getDescriptor().isNullable() && !decodeNotNullMark()) {
            return decodeNull();
        }
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object decodeNullableSerializableValue(DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().isNullable() || decodeNotNullMark()) ? decodeSerializableValue(deserializer) : decodeNull();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public boolean decodeSequentially() {
        return false;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeSerializableElement(SerialDescriptor descriptor, int i7, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object decodeSerializableValue(DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short decodeShort();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public short decodeShortElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        e();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public String decodeStringElement(SerialDescriptor descriptor, int i7) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeString();
    }

    public void e() {
        throw new p104gg.c(G.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }
}
