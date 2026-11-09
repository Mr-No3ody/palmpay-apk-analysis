package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.flexbox.FlexItem;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f18222C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f18223H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f18224L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f18225M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f18226Q;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f18227k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f18228p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Rect f18229q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f18230r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f18231s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f18232t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f18233u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f18234v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f18235w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f18236x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f18237y0;

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void c(float f10, boolean z3, int i7) {
        int height = getHeight();
        TextView textView = this.f18242c;
        int left = textView.getLeft();
        int i10 = this.f18227k0;
        int right = textView.getRight() + i10;
        int i11 = height - this.f18223H;
        Rect rect = this.f18229q0;
        rect.set(left - i10, i11, right, height);
        super.c(f10, z3, i7);
        this.f18230r0 = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i10, i11, textView.getRight() + i10, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f18231s0;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f18226Q);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f18222C;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f18242c;
        int left = textView.getLeft();
        int i7 = this.f18227k0;
        int i10 = left - i7;
        int right = textView.getRight() + i7;
        int i11 = height - this.f18223H;
        Paint paint = this.f18228p0;
        paint.setColor((this.f18230r0 << 24) | (this.f18222C & FlexItem.MAX_SIZE));
        float f10 = height;
        canvas.drawRect(i10, i11, right, f10, paint);
        if (this.f18231s0) {
            paint.setColor((this.f18222C & FlexItem.MAX_SIZE) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f18233u0, getWidth() - getPaddingRight(), f10, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f18234v0) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (action == 0) {
            this.f18235w0 = x3;
            this.f18236x0 = y8;
            this.f18234v0 = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.f18242c;
            int left = textView.getLeft();
            int i7 = this.f18227k0;
            if (x3 < left - i7) {
                ViewPager viewPager = this.f18240a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                return true;
            }
            if (x3 > textView.getRight() + i7) {
                ViewPager viewPager2 = this.f18240a;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x3 - this.f18235w0);
            float f10 = this.f18237y0;
            if (fAbs > f10 || Math.abs(y8 - this.f18236x0) > f10) {
                this.f18234v0 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i7) {
        super.setBackgroundColor(i7);
        if (this.f18232t0) {
            return;
        }
        this.f18231s0 = (i7 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f18232t0) {
            return;
        }
        this.f18231s0 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i7) {
        super.setBackgroundResource(i7);
        if (this.f18232t0) {
            return;
        }
        this.f18231s0 = i7 == 0;
    }

    public void setDrawFullUnderline(boolean z3) {
        this.f18231s0 = z3;
        this.f18232t0 = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        int i13 = this.f18224L;
        if (i12 < i13) {
            i12 = i13;
        }
        super.setPadding(i7, i10, i11, i12);
    }

    public void setTabIndicatorColor(@ColorInt int i7) {
        this.f18222C = i7;
        this.f18228p0.setColor(i7);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i7) {
        setTabIndicatorColor(getContext().getColor(i7));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i7) {
        int i10 = this.f18225M;
        if (i7 < i10) {
            i7 = i10;
        }
        super.setTextSpacing(i7);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f18228p0 = paint;
        this.f18229q0 = new Rect();
        this.f18230r0 = 255;
        this.f18231s0 = false;
        this.f18232t0 = false;
        int i7 = this.f18252w;
        this.f18222C = i7;
        paint.setColor(i7);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f18223H = (int) ((3.0f * f10) + 0.5f);
        this.f18224L = (int) ((6.0f * f10) + 0.5f);
        this.f18225M = (int) (64.0f * f10);
        this.f18227k0 = (int) ((16.0f * f10) + 0.5f);
        this.f18233u0 = (int) ((1.0f * f10) + 0.5f);
        this.f18226Q = (int) ((f10 * 32.0f) + 0.5f);
        this.f18237y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f18241b.setFocusable(true);
        this.f18241b.setOnClickListener(new b(this, 0));
        this.f18243d.setFocusable(true);
        this.f18243d.setOnClickListener(new b(this, 1));
        if (getBackground() == null) {
            this.f18231s0 = true;
        }
    }
}
