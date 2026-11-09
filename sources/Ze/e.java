package Ze;

import C0.G;
import Ce.H;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.camera.video.u;
import com.facebook.react.bridge.Promise;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.rnmaps.maps.MapModule;
import fr.greweb.reactnativeviewshot.ViewShot$Formats;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements UIBlock, com.facebook.react.fabric.interop.UIBlock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f11715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f11716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f11717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f11718g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Promise f11720j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Boolean f11721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f11722p;
    public final Activity t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f11723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static byte[] f11711w = new byte[65536];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Object f11709A = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Set f11710B = Collections.newSetFromMap(new WeakHashMap());

    public e(int i7, String str, int i10, double d2, Integer num, Integer num2, File file, String str2, Boolean bool, Activity activity, boolean z3, Promise promise, Executor executor) {
        this.f11712a = i7;
        this.f11713b = str;
        this.f11714c = i10;
        this.f11715d = d2;
        this.f11716e = num;
        this.f11717f = num2;
        this.f11718g = file;
        this.f11719i = str2;
        this.f11721o = bool;
        this.t = activity;
        this.f11722p = z3;
        this.f11720j = promise;
        this.f11723v = executor;
    }

    public static void a(e eVar, View view) throws IOException {
        String string;
        boolean z3 = -1 == eVar.f11714c;
        boolean zEquals = "zip-base64".equals(eVar.f11719i);
        d dVar = new d(f11711w);
        try {
            Point pointE = eVar.e(view, dVar);
            dVar.close();
            f11711w = dVar.b();
            int size = dVar.size();
            Locale locale = Locale.US;
            String str = pointE.x + ":" + pointE.y + "|";
            if (!z3) {
                str = "";
            }
            if (zEquals) {
                Deflater deflater = new Deflater();
                deflater.setInput(f11711w, 0, size);
                deflater.finish();
                d dVar2 = new d(new byte[32]);
                byte[] bArr = new byte[1024];
                while (!deflater.finished()) {
                    dVar2.write(bArr, 0, deflater.deflate(bArr));
                }
                StringBuilder sbS = u.s(str);
                sbS.append(Base64.encodeToString(dVar2.b(), 0, dVar2.size(), 2));
                string = sbS.toString();
            } else {
                StringBuilder sbS2 = u.s(str);
                sbS2.append(Base64.encodeToString(f11711w, 0, size, 2));
                string = sbS2.toString();
            }
            eVar.f11720j.resolve(string);
        } catch (Throwable th) {
            dVar.close();
            throw th;
        }
    }

    public static void b(e eVar, View view) throws IOException {
        eVar.getClass();
        d dVar = new d(f11711w);
        try {
            eVar.e(view, dVar);
            dVar.close();
            f11711w = dVar.b();
            String strEncodeToString = Base64.encodeToString(f11711w, 0, dVar.size(), 2);
            String str = eVar.f11713b;
            if (MapModule.SNAPSHOT_FORMAT_JPG.equals(str)) {
                str = "jpeg";
            }
            eVar.f11720j.resolve(G.p("data:image/", str, ";base64,", strEncodeToString));
        } catch (Throwable th) {
            dVar.close();
            throw th;
        }
    }

    public static void c(e eVar, View view) throws IOException {
        File file = eVar.f11718g;
        String string = Uri.fromFile(file).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        d dVar = new d(f11711w);
        try {
            Point pointE = eVar.e(view, dVar);
            dVar.close();
            f11711w = dVar.b();
            int size = dVar.size();
            Locale locale = Locale.US;
            fileOutputStream.write((pointE.x + ":" + pointE.y + "|").getBytes(Charset.forName("US-ASCII")));
            fileOutputStream.write(f11711w, 0, size);
            fileOutputStream.close();
            eVar.f11720j.resolve(string);
        } catch (Throwable th) {
            dVar.close();
            throw th;
        }
    }

    public static Matrix d(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList<View> linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        for (View view4 : linkedList) {
            canvas.save();
            int paddingTop = 0;
            float translationX = view4.getTranslationX() + view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0);
            int top2 = view4.getTop();
            if (view4 != view2) {
                paddingTop = view4.getPaddingTop();
            }
            float translationY = view4.getTranslationY() + top2 + paddingTop;
            canvas.translate(translationX, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(translationX, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    public static ArrayList f(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            arrayList2.addAll(f(viewGroup.getChildAt(i7)));
        }
        return arrayList2;
    }

    public static Bitmap g(int i7, int i10) {
        synchronized (f11709A) {
            try {
                for (Bitmap bitmap : f11710B) {
                    if (bitmap.getWidth() == i7 && bitmap.getHeight() == i10) {
                        f11710B.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(Bitmap bitmap) {
        synchronized (f11709A) {
            f11710B.add(bitmap);
        }
    }

    public final Point e(View view, OutputStream outputStream) {
        int i7;
        Bitmap bitmapCreateBitmap;
        SurfaceView surfaceView;
        View view2 = view;
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        boolean z3 = false;
        if (this.f11721o.booleanValue()) {
            ScrollView scrollView = (ScrollView) view2;
            int height2 = 0;
            for (int i10 = 0; i10 < scrollView.getChildCount(); i10++) {
                height2 += scrollView.getChildAt(i10).getHeight();
            }
            i7 = height2;
        } else {
            i7 = height;
        }
        Point point = new Point(width, i7);
        synchronized (f11709A) {
            try {
                Iterator it = f11710B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bitmapCreateBitmap = Bitmap.createBitmap(width, i7, Bitmap.Config.ARGB_8888);
                        break;
                    }
                    bitmapCreateBitmap = (Bitmap) it.next();
                    if (bitmapCreateBitmap.getWidth() == width && bitmapCreateBitmap.getHeight() == i7) {
                        f11710B.remove(bitmapCreateBitmap);
                        bitmapCreateBitmap.eraseColor(0);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Bitmap bitmap = bitmapCreateBitmap;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(bitmap);
        view2.draw(canvas);
        for (View view3 : f(view2)) {
            if (view3 instanceof TextureView) {
                if (view3.getVisibility() == 0) {
                    TextureView textureView = (TextureView) view3;
                    textureView.setOpaque(z3);
                    Bitmap bitmap2 = textureView.getBitmap(g(view3.getWidth(), view3.getHeight()));
                    int iSave = canvas.save();
                    d(canvas, view2, view3);
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    canvas.restoreToCount(iSave);
                    h(bitmap2);
                }
            } else if ((view3 instanceof SurfaceView) && this.f11722p) {
                SurfaceView surfaceView2 = (SurfaceView) view3;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Bitmap bitmapG = g(view3.getWidth(), view3.getHeight());
                try {
                    surfaceView = surfaceView2;
                    try {
                        PixelCopy.request(surfaceView, bitmapG, new c(this, canvas, view2, (SurfaceView) view3, bitmapG, paint, countDownLatch), new Handler(Looper.getMainLooper()));
                        countDownLatch.await(5L, TimeUnit.SECONDS);
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("e", "Cannot PixelCopy for " + surfaceView, e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    surfaceView = surfaceView2;
                }
            }
            view2 = view;
            z3 = false;
        }
        Integer num = this.f11716e;
        if (num != null && this.f11717f != null && (num.intValue() != width || this.f11717f.intValue() != i7)) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.f11716e.intValue(), this.f11717f.intValue(), true);
            h(bitmap);
            bitmap = bitmapCreateScaledBitmap;
        }
        int i11 = this.f11714c;
        if (-1 == i11 && (outputStream instanceof d)) {
            int i12 = width * i7 * 4;
            d dVar = (d) outputStream;
            bitmap.copyPixelsToBuffer(dVar.a(i12));
            dVar.c(i12);
        } else {
            bitmap.compress(ViewShot$Formats.f36802a[i11], (int) (this.f11715d * 100.0d), outputStream);
        }
        h(bitmap);
        return point;
    }

    @Override // com.facebook.react.fabric.interop.UIBlock
    public final void execute(UIBlockViewResolver uIBlockViewResolver) {
        this.f11723v.execute(new H(15, this, uIBlockViewResolver, null, false));
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        this.f11723v.execute(new H(15, this, null, nativeViewHierarchyManager, false));
    }
}
