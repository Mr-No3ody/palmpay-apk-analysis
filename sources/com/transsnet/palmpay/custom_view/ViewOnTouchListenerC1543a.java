package com.transsnet.palmpay.custom_view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.Random;

/* JADX INFO: renamed from: com.transsnet.palmpay.custom_view.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC1543a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoinRainNewView f31182a;

    public ViewOnTouchListenerC1543a(CoinRainNewView coinRainNewView) {
        this.f31182a = coinRainNewView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1546d c1546d;
        int iOnIconClicked;
        if (motionEvent.getAction() == 0) {
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int i7 = CoinRainNewView.f30959A;
            CoinRainNewView coinRainNewView = this.f31182a;
            coinRainNewView.getClass();
            Rect rect = new Rect();
            int i10 = 0;
            while (true) {
                if (i10 >= coinRainNewView.f30963d.size()) {
                    c1546d = null;
                    break;
                }
                c1546d = (C1546d) coinRainNewView.f30963d.get(i10);
                Bitmap bitmap = c1546d.f31233e;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i11 = c1546d.f31229a;
                    rect.left = i11;
                    Bitmap bitmap2 = c1546d.f31233e;
                    rect.right = bitmap2.getWidth() + i11;
                    int i12 = c1546d.f31230b;
                    rect.top = i12;
                    rect.bottom = bitmap2.getHeight() + i12;
                    if (rect.contains((int) x3, (int) y8)) {
                        break;
                    }
                }
                i10++;
            }
            if (c1546d != null) {
                coinRainNewView.f30963d.remove(c1546d);
                coinRainNewView.postInvalidate();
                CoinRainNewView.Callback callback = coinRainNewView.f30972w;
                if (callback != null) {
                    iOnIconClicked = callback.onIconClicked(x3, y8);
                    F6.d.h("CoinRainView", 3, "onIconClicked, x:" + x3 + ", y: " + y8 + ", count: " + iOnIconClicked);
                } else {
                    iOnIconClicked = 0;
                }
                if (iOnIconClicked > 0 && coinRainNewView.f30969o) {
                    String strM = C0.G.m(iOnIconClicked, "+");
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    paint.setTextSize(SizeUtils.sp2px(38.0f));
                    paint.setTypeface(Typeface.DEFAULT_BOLD);
                    paint.setTextAlign(Paint.Align.LEFT);
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (paint.measureText(strM) + 2.0f), (int) ((fontMetrics.bottom - fontMetrics.top) + 2.0f), Bitmap.Config.ARGB_8888);
                    new Canvas(bitmapCreateBitmap).drawText(strM, 1.0f, (-fontMetrics.top) + 1.0f, paint);
                    if (bitmapCreateBitmap != null) {
                        C1545c c1545c = new C1545c();
                        c1545c.f31202j = 1.0f;
                        c1545c.f31203k = 0.0f;
                        c1545c.f31204l = 0.0f;
                        c1545c.f31205m = 0.0f;
                        c1545c.f31206n = 1.0f;
                        c1545c.f31193a = bitmapCreateBitmap;
                        c1545c.f31207o = System.currentTimeMillis();
                        float width = x3 - (bitmapCreateBitmap.getWidth() / 2.0f);
                        float height = y8 - bitmapCreateBitmap.getHeight();
                        c1545c.f31194b = width;
                        c1545c.f31195c = height;
                        c1545c.f31196d = width;
                        c1545c.f31197e = height;
                        float fDp2px = SizeUtils.dp2px(100.0f);
                        float fDp2px2 = SizeUtils.dp2px(50.0f);
                        Random random = coinRainNewView.f30965f;
                        float fNextFloat = ((random.nextFloat() * 2.0f) - 1.0f) * fDp2px;
                        float f10 = (((-random.nextFloat()) * 30.0f) * fDp2px2) / 100.0f;
                        c1545c.f31198f = c1545c.f31194b + fNextFloat;
                        c1545c.f31199g = c1545c.f31195c + f10;
                        float fNextFloat2 = (random.nextFloat() - 0.5f) * fDp2px;
                        float f11 = (((-random.nextFloat()) * 50.0f) * fDp2px2) / 100.0f;
                        c1545c.f31200h = c1545c.f31194b + fNextFloat2;
                        c1545c.f31201i = c1545c.f31195c + f11;
                        double dNextFloat = (random.nextFloat() * 2.0f) - 1.0f;
                        c1545c.f31204l = (float) (0.2617993877991494d * dNextFloat);
                        c1545c.f31205m = (float) (dNextFloat * 0.6283185307179586d);
                        coinRainNewView.f30964e.add(c1545c);
                    }
                }
            }
        }
        return false;
    }
}
