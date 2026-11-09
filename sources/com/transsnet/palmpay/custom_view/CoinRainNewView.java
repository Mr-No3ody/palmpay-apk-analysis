package com.transsnet.palmpay.custom_view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.util.ImageUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class CoinRainNewView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f30959A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f30961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f30963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f30964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f30965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30966g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f30968j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30970p;
    public ValueAnimator t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f30971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Callback f30972w;

    public interface Callback {
        void onAnimEnd();

        int onIconClicked(float f10, float f11);
    }

    public CoinRainNewView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f30965f = new Random();
        this.f30966g = 0;
        this.f30967i = 0;
        this.f30969o = true;
        this.f30971v = new HashMap();
        b(context);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    public static Bitmap a(CoinRainNewView coinRainNewView, int i7) {
        int coinTypeCount = i7 % coinRainNewView.getCoinTypeCount();
        HashMap map = coinRainNewView.f30971v;
        Bitmap bitmapDecodeResource = (Bitmap) map.get(String.valueOf(coinTypeCount));
        if (bitmapDecodeResource == null) {
            List list = coinRainNewView.f30968j;
            int size = list != null ? list.size() : 0;
            if (size > 0 && coinTypeCount < size) {
                String str = (String) coinRainNewView.f30968j.get(coinTypeCount);
                if (TextUtils.isEmpty(str) || (bitmapDecodeResource = ImageUtils.getBitmap(new File(str))) == null) {
                    if (coinTypeCount % 2 == 0) {
                        bitmapDecodeResource = BitmapFactory.decodeResource(coinRainNewView.f30960a.getResources(), r.cv_gift_1);
                    } else {
                        bitmapDecodeResource = BitmapFactory.decodeResource(coinRainNewView.f30960a.getResources(), r.cv_gift_5);
                    }
                }
            } else if (coinTypeCount % 2 == 0) {
                bitmapDecodeResource = BitmapFactory.decodeResource(coinRainNewView.f30960a.getResources(), r.cv_gift_1);
            } else {
                bitmapDecodeResource = BitmapFactory.decodeResource(coinRainNewView.f30960a.getResources(), r.cv_gift_5);
            }
            map.put(String.valueOf(coinTypeCount), bitmapDecodeResource);
        }
        return bitmapDecodeResource;
    }

    private int getCoinTypeCount() {
        List list = this.f30968j;
        if (list == null || list.isEmpty()) {
            return 5;
        }
        return this.f30968j.size();
    }

    public final void b(Context context) {
        this.f30960a = context;
        this.f30967i = ScreenUtils.getScreenHeight();
        Paint paint = new Paint();
        this.f30961b = paint;
        paint.setAntiAlias(true);
        this.f30961b.setDither(true);
        this.f30961b.setFilterBitmap(true);
        this.f30963d = new ArrayList();
        this.f30964e = new ArrayList();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 100);
        this.t = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.t.setDuration(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
        this.t.addUpdateListener(new Re.g(this, 3));
        this.t.addListener(new C1544b(this));
        setOnTouchListener(new ViewOnTouchListenerC1543a(this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        try {
            for (C1546d c1546d : this.f30963d) {
                if (c1546d != null && (bitmap = c1546d.f31233e) != null && !bitmap.isRecycled()) {
                    int i7 = c1546d.f31229a;
                    int i10 = c1546d.f31230b;
                    int i11 = c1546d.f31231c;
                    canvas.save();
                    Matrix matrix = new Matrix();
                    matrix.postTranslate(i7, i10);
                    matrix.postRotate(i11 % MessageEvent.EVENT_CL_REPAYMENT_FAILED, i7 + (bitmap.getWidth() / 2), i10 + (bitmap.getHeight() / 2));
                    canvas.drawBitmap(bitmap, matrix, this.f30961b);
                    canvas.restore();
                }
            }
        } catch (Exception e10) {
            F6.d.h("CoinRainView", 3, "drawLeaf: ", e10);
        }
        if (this.f30969o || !this.f30964e.isEmpty()) {
            try {
                for (C1545c c1545c : this.f30964e) {
                    if (c1545c != null && !c1545c.f31193a.isRecycled()) {
                        canvas.save();
                        int i12 = (int) (c1545c.f31206n * 255.0f);
                        int alpha = this.f30961b.getAlpha();
                        this.f30961b.setAlpha(i12);
                        Matrix matrix2 = new Matrix();
                        float width = (c1545c.f31193a.getWidth() / 2.0f) + c1545c.f31196d;
                        float height = (c1545c.f31193a.getHeight() / 2.0f) + c1545c.f31197e;
                        matrix2.postTranslate(c1545c.f31196d, c1545c.f31197e);
                        float f10 = c1545c.f31202j;
                        matrix2.postScale(f10, f10, width, height);
                        matrix2.postRotate((float) Math.toDegrees(c1545c.f31203k), width, height);
                        canvas.drawBitmap(c1545c.f31193a, matrix2, this.f30961b);
                        this.f30961b.setAlpha(alpha);
                        canvas.restore();
                    }
                }
            } catch (Exception e11) {
                F6.d.h("CoinRainView", 3, "drawClickFeedbacks: ", e11);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        this.f30962c = getWidth();
        invalidate();
        super.onWindowFocusChanged(z3);
    }

    public void setCallback(Callback callback) {
        this.f30972w = callback;
    }

    public void setCoinIcons(List<String> list) {
        this.f30968j = list;
    }

    public void setEnableClickFeedback(boolean z3) {
        this.f30969o = z3;
    }

    public CoinRainNewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30965f = new Random();
        this.f30966g = 0;
        this.f30967i = 0;
        this.f30969o = true;
        this.f30971v = new HashMap();
        b(context);
    }

    public CoinRainNewView(Context context) {
        super(context);
        this.f30965f = new Random();
        this.f30966g = 0;
        this.f30967i = 0;
        this.f30969o = true;
        this.f30971v = new HashMap();
        b(context);
    }
}
