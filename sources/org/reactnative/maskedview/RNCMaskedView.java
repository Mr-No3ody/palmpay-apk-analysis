package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class RNCMaskedView extends ReactViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f41105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f41107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PorterDuffXfermode f41108d;

    public RNCMaskedView(Context context) {
        super(context);
        this.f41105a = null;
        this.f41106b = false;
        setRenderingMode("hardware");
        this.f41107c = new Paint(1);
        this.f41108d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Bitmap bitmapCreateBitmap;
        super.dispatchDraw(canvas);
        if (this.f41106b) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.setVisibility(0);
                Bitmap bitmap = this.f41105a;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                if (childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) {
                    bitmapCreateBitmap = null;
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    childAt.draw(new Canvas(bitmapCreateBitmap));
                }
                this.f41105a = bitmapCreateBitmap;
                childAt.setVisibility(4);
            }
            this.f41106b = false;
        }
        if (this.f41105a != null) {
            Paint paint = this.f41107c;
            paint.setXfermode(this.f41108d);
            canvas.drawBitmap(this.f41105a, 0.0f, 0.0f, paint);
            paint.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41106b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (this.f41106b || (childAt = getChildAt(0)) == null || !childAt.equals(view)) {
            return;
        }
        this.f41106b = true;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        if (z3) {
            this.f41106b = true;
        }
    }

    public void setRenderingMode(String str) {
        if (str.equals("software")) {
            setLayerType(1, null);
        } else {
            setLayerType(2, null);
        }
    }
}
