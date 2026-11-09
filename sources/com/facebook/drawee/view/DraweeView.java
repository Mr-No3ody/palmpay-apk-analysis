package com.facebook.drawee.view;

import J2.a;
import J2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.video.internal.c;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import javax.annotation.Nullable;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DraweeView<DH extends DraweeHierarchy> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled = false;
    private float mAspectRatio;
    private b mDraweeHolder;

    @Nullable
    private Object mExtraData;
    private boolean mInitialised;
    private boolean mLegacyVisibilityHandlingEnabled;
    private final a mMeasureSpec;

    public DraweeView(Context context) {
        super(context);
        this.mMeasureSpec = new a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        a(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z3) {
        sGlobalLegacyVisibilityHandlingEnabled = z3;
    }

    public final void a(Context context) {
        try {
            p181m3.a.a();
            if (this.mInitialised) {
                return;
            }
            boolean z3 = true;
            this.mInitialised = true;
            this.mDraweeHolder = new b(null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z3 = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z3;
        } finally {
            p181m3.a.a();
        }
    }

    public final void b() {
        Drawable drawable;
        if (!this.mLegacyVisibilityHandlingEnabled || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public void doAttach() {
        this.mDraweeHolder.e();
    }

    public void doDetach() {
        this.mDraweeHolder.f();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    @Nullable
    public DraweeController getController() {
        return this.mDraweeHolder.f4487e;
    }

    @Nullable
    public Object getExtraData() {
        return this.mExtraData;
    }

    public DH getHierarchy() {
        DH dh2 = (DH) this.mDraweeHolder.f4486d;
        dh2.getClass();
        return dh2;
    }

    @Nullable
    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.c();
    }

    public boolean hasController() {
        return this.mDraweeHolder.f4487e != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.f4486d != null;
    }

    public void onAttach() {
        doAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        onAttach();
    }

    public void onDetach() {
        doDetach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
        onAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i7, int i10) {
        a aVar = this.mMeasureSpec;
        aVar.f4481a = i7;
        aVar.f4482b = i10;
        float f10 = this.mAspectRatio;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f10 > 0.0f && layoutParams != null) {
            int i11 = layoutParams.height;
            if (i11 == 0 || i11 == -2) {
                aVar.f4482b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f4481a) - paddingRight) / f10) + paddingBottom), aVar.f4482b), 1073741824);
            } else {
                int i12 = layoutParams.width;
                if (i12 == 0 || i12 == -2) {
                    aVar.f4481a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f4482b) - paddingBottom) * f10) + paddingRight), aVar.f4481a), 1073741824);
                }
            }
        }
        a aVar2 = this.mMeasureSpec;
        super.onMeasure(aVar2.f4481a, aVar2.f4482b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
        onDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar = this.mDraweeHolder;
        if (!bVar.d() ? false : bVar.f4487e.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        b();
    }

    public void resetActualImage() {
        setController(null);
    }

    public void setAspectRatio(float f10) {
        if (f10 == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f10;
        requestLayout();
    }

    public void setController(@Nullable DraweeController draweeController) {
        this.mDraweeHolder.g(draweeController);
        super.setImageDrawable(this.mDraweeHolder.c());
    }

    public void setExtraData(@Nullable Object obj) {
        this.mExtraData = obj;
    }

    public void setHierarchy(DH dh2) {
        this.mDraweeHolder.h(dh2);
        super.setImageDrawable(this.mDraweeHolder.c());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.mDraweeHolder.g(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(@Nullable Drawable drawable) {
        a(getContext());
        this.mDraweeHolder.g(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i7) {
        a(getContext());
        this.mDraweeHolder.g(null);
        super.setImageResource(i7);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.mDraweeHolder.g(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z3) {
        this.mLegacyVisibilityHandlingEnabled = z3;
    }

    @Override // android.view.View
    public String toString() {
        c cVarM = e.m(this);
        b bVar = this.mDraweeHolder;
        cVarM.c(bVar != null ? bVar.toString() : "<no holder set>", "holder");
        return cVarM.toString();
    }

    public DraweeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMeasureSpec = new a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        a(context);
    }

    public DraweeView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mMeasureSpec = new a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        a(context);
    }
}
