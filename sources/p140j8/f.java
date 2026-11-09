package p140j8;

import C0.G;
import L6.b;
import L6.d;
import Wf.AbstractC0780y;
import Wf.t0;
import Yf.F;
import Yf.n;
import Yf.t;
import Yf.u;
import Yf.v;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AbsSeekBar;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.biometric.T;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.V;
import androidx.work.impl.model.e;
import androidx.work.impl.model.k;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.observable.E;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import p098ga.c;
import p118hf.a;
import p183m6.j;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f38343a = 3;

    public static final /* synthetic */ Drawable A(Drawable drawable, Context context, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (num == null || num2 == null) {
            return drawable;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static void B(Runnable runnable) {
        if (q()) {
            runnable.run();
        } else {
            a.k(new Handler(Looper.getMainLooper()).post(runnable), "Unable to post to main thread");
        }
    }

    public static void C(String str, Bitmap bitmap) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public static Bitmap D(Bitmap bitmap) {
        if (bitmap.getWidth() < bitmap.getHeight()) {
            return bitmap;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(1, cameraInfo);
        int i7 = cameraInfo.orientation;
        Matrix matrix = new Matrix();
        matrix.postRotate(i7);
        matrix.postScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static final void E(PpButton ppButton, boolean z3, Context context) {
        Intrinsics.checkNotNullParameter(ppButton, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (z3) {
            ppButton.setTextColor(CommonViewExtKt.colorInt(b.ppColorPrimary, context));
            ppButton.setBackgroundResource(d.lib_ui_button_bg_stroke_corner_3);
        } else {
            ppButton.setTextColor(CommonViewExtKt.colorInt(b.ppColorButtonTextWhite, context));
            ppButton.setBackgroundResource(d.lib_ui_button_bg_corner_primary_4);
        }
    }

    public static final void F(Drawable drawable, Integer num) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (num == null) {
            return;
        }
        drawable.setTintList(ColorStateList.valueOf(num.intValue()));
    }

    public static String G(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static boolean H(ObservableSource observableSource, Observer observer, Function function) {
        Disposable disposable = p001if.b.f37587a;
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) observableSource).call();
            if (objCall == null) {
                observer.onSubscribe(disposable);
                observer.onComplete();
                return true;
            }
            try {
                Object objApply = function.apply(objCall);
                p147jf.a.a(objApply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) objApply;
                if (!(observableSource2 instanceof Callable)) {
                    observableSource2.subscribe(observer);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) observableSource2).call();
                    if (objCall2 == null) {
                        observer.onSubscribe(disposable);
                        observer.onComplete();
                        return true;
                    }
                    E e10 = new E(observer, objCall2);
                    observer.onSubscribe(e10);
                    e10.run();
                    return true;
                } catch (Throwable th) {
                    D3.a.H(th);
                    observer.onSubscribe(disposable);
                    observer.onError(th);
                    return true;
                }
            } catch (Throwable th2) {
                D3.a.H(th2);
                observer.onSubscribe(disposable);
                observer.onError(th2);
            }
        } catch (Throwable th3) {
            D3.a.H(th3);
            observer.onSubscribe(disposable);
            observer.onError(th3);
        }
    }

    public static boolean a(View view) {
        if ((view instanceof WebView) || (view instanceof CompoundButton) || (view instanceof AbsSeekBar) || (view instanceof EditText)) {
            return true;
        }
        return (view.isClickable() && view.hasOnClickListeners()) || p291t5.a.d(view.getParent()) || p034c5.a.b(view);
    }

    public static void b() {
        a.k(q(), "Not in application's main thread");
    }

    public static void c(float f10, float f11, float f12) {
        if (f10 >= f11) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    public static final long d(InputStream inputStream, OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        int i7 = inputStream.read(bArr);
        long j6 = 0;
        while (i7 >= 0) {
            out.write(bArr, 0, i7);
            j6 += (long) i7;
            i7 = inputStream.read(bArr);
        }
        return j6;
    }

    public static String e(String str) {
        Object objF;
        if (str == null || StringsKt.F(str)) {
            return str;
        }
        if (!StringsKt.B(str, '%') && !StringsKt.B(str, '+')) {
            return str;
        }
        try {
            o oVar = q.f43977a;
            objF = URLDecoder.decode(str, Constants.ENCODING);
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        Object obj = str;
        if (!(objF instanceof p)) {
            obj = objF;
        }
        return (String) obj;
    }

    public static final int f(float f10) {
        Resources system = Resources.getSystem();
        Intrinsics.d(system, "Resources.getSystem()");
        return (int) ((f10 * system.getDisplayMetrics().density) + 0.5f);
    }

    public static void g(String str, String str2) {
        String strG = G(str);
        if (p(6, strG)) {
            Log.e(strG, str2);
        }
    }

    public static void h(String str, String str2, Throwable th) {
        String strG = G(str);
        if (p(6, strG)) {
            Log.e(strG, str2, th);
        }
    }

    public static final int i(int i7, Object obj) {
        return (i7 * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static final e j(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new e(kVar.f18612a, kVar.t);
    }

    public static String k(int i7, Context context) {
        if (context == null) {
            return "";
        }
        if (i7 == 1) {
            return context.getString(T.fingerprint_error_hw_not_available);
        }
        if (i7 != 7) {
            switch (i7) {
                case 9:
                    break;
                case 10:
                    return context.getString(T.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(T.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(T.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i7);
                    return context.getString(T.default_error_msg);
            }
        }
        return context.getString(T.fingerprint_error_lockout);
    }

    public static Pair l(Activity activity) {
        int i7;
        ContentResolver contentResolver;
        Exception exc;
        int count;
        int i10;
        int count2 = 0;
        if (activity == null || (contentResolver = activity.getContentResolver()) == null) {
            i7 = 0;
        } else {
            try {
                Cursor cursorQuery = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    i10 = 0;
                } else {
                    count = cursorQuery.getCount();
                    try {
                        cursorQuery.close();
                    } catch (Exception e10) {
                        exc = e10;
                        exc.printStackTrace();
                    }
                    i10 = count;
                }
            } catch (Exception e11) {
                exc = e11;
                count = 0;
            }
            try {
                Cursor cursorQuery2 = contentResolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null, null, null, null);
                if (cursorQuery2 != null && cursorQuery2.moveToFirst()) {
                    count2 = cursorQuery2.getCount();
                    cursorQuery2.close();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            int i11 = count2;
            count2 = i10;
            i7 = i11;
        }
        return new Pair(Integer.valueOf(count2), Integer.valueOf(i7));
    }

    public static int m(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 32) {
            return 5;
        }
        if (i7 == 64) {
            return 6;
        }
        if (i7 == 128) {
            return 7;
        }
        if (i7 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(G.m(i7, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static j n(androidx.fragment.app.E activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        j jVar = new j(19);
        jVar.f39520b = activity;
        return jVar;
    }

    public static boolean o(String str) {
        return p(3, G(str));
    }

    public static boolean p(int i7, String str) {
        return f38343a <= i7 || Log.isLoggable(str, i7);
    }

    public static boolean q() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static int r(long j6) {
        if (j6 <= 2147483647L && j6 >= -2147483648L) {
            return (int) j6;
        }
        throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + j6 + ")");
    }

    public static final t0 s(BaseViewModel baseViewModel, Function1 request, l viewState, long j6, boolean z3, boolean z8) {
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return AbstractC0780y.m(V.h(baseViewModel), null, null, new c(z8, viewState, j6, z3, request, null), 3);
    }

    public static final t0 t(BaseViewModel baseViewModel, Function1 request, Function1 onSuccess, Function1 onError) {
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return AbstractC0780y.m(V.h(baseViewModel), null, null, new p098ga.e(request, onSuccess, onError, null), 3);
    }

    public static final t0 v(BaseViewModel baseViewModel, Function1 request, l viewState, long j6) {
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return AbstractC0780y.m(V.h(baseViewModel), null, null, new p098ga.g(j6, viewState, request, null), 3);
    }

    public static final boolean w(JSONObject jSONObject, String str, String str2, boolean z3) {
        if (jSONObject.has(str)) {
            return jSONObject.optBoolean(str, z3);
        }
        return jSONObject.has(str2) ? jSONObject.optBoolean(str2, z3) : z3;
    }

    public static final String x(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static final byte[] y(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(UserMetadata.MAX_INTERNAL_KEY_SIZE, inputStream.available()));
        d(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object z(n nVar, Continuation continuation) {
        F f10;
        Object objV;
        if (continuation instanceof F) {
            f10 = (F) continuation;
            int i7 = f10.f11388b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                f10.f11388b = i7 - Integer.MIN_VALUE;
            } else {
                f10 = new F(continuation);
            }
        } else {
            f10 = new F(continuation);
        }
        Object obj = f10.f11387a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = f10.f11388b;
        if (i10 == 0) {
            g.M(obj);
            f10.f11388b = 1;
            nVar.getClass();
            objV = n.v(nVar, f10);
            if (objV == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            objV = ((v) obj).f11449a;
        }
        t tVar = v.f11447b;
        if (objV instanceof u) {
            return null;
        }
        return objV;
    }
}
