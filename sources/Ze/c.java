package Ze;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Canvas f11702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SurfaceView f11704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f11705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Paint f11706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f11707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f11708g;

    public c(e eVar, Canvas canvas, View view, SurfaceView surfaceView, Bitmap bitmap, Paint paint, CountDownLatch countDownLatch) {
        this.f11708g = eVar;
        this.f11702a = canvas;
        this.f11703b = view;
        this.f11704c = surfaceView;
        this.f11705d = bitmap;
        this.f11706e = paint;
        this.f11707f = countDownLatch;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i7) {
        Canvas canvas = this.f11702a;
        int iSave = canvas.save();
        View view = this.f11703b;
        this.f11708g.getClass();
        e.d(canvas, view, this.f11704c);
        Paint paint = this.f11706e;
        Bitmap bitmap = this.f11705d;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restoreToCount(iSave);
        e.h(bitmap);
        this.f11707f.countDown();
    }
}
