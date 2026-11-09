package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.flexbox.FlexItem;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f18238A = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f18239B = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f18240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f18241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f18242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f18243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18246g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18248j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f18250p;
    public WeakReference t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18252w;

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        d dVar = new d();
        dVar.f18259a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(dVar);
    }

    public final void a(a aVar, a aVar2) {
        c cVar = this.f18250p;
        if (aVar != null) {
            aVar.f18253a.unregisterObserver(cVar);
            this.t = null;
        }
        if (aVar2 != null) {
            aVar2.f18253a.registerObserver(cVar);
            this.t = new WeakReference(aVar2);
        }
        ViewPager viewPager = this.f18240a;
        if (viewPager != null) {
            this.f18244e = -1;
            this.f18245f = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public final void b(int i7, a aVar) {
        int iC = aVar != null ? aVar.c() : 0;
        this.f18248j = true;
        CharSequence charSequenceE = null;
        CharSequence charSequenceE2 = (i7 < 1 || aVar == null) ? null : aVar.e(i7 - 1);
        TextView textView = this.f18241b;
        textView.setText(charSequenceE2);
        TextView textView2 = this.f18242c;
        textView2.setText((aVar == null || i7 >= iC) ? null : aVar.e(i7));
        int i10 = i7 + 1;
        if (i10 < iC && aVar != null) {
            charSequenceE = aVar.e(i10);
        }
        TextView textView3 = this.f18243d;
        textView3.setText(charSequenceE);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f18244e = i7;
        if (!this.f18249o) {
            c(this.f18245f, false, i7);
        }
        this.f18248j = false;
    }

    public void c(float f10, boolean z3, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (i7 != this.f18244e) {
            b(i7, this.f18240a.getAdapter());
        } else if (!z3 && f10 == this.f18245f) {
            return;
        }
        this.f18249o = true;
        TextView textView = this.f18241b;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f18242c;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f18243d;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i14 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = paddingRight + i14;
        int i16 = (width - (paddingLeft + i14)) - i15;
        float f11 = f10 + 0.5f;
        if (f11 > 1.0f) {
            f11 -= 1.0f;
        }
        int i17 = ((width - i15) - ((int) (i16 * f11))) - i14;
        int i18 = measuredWidth2 + i17;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i19 = iMax - baseline;
        int i20 = iMax - baseline2;
        int i21 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i19, textView2.getMeasuredHeight() + i20), textView3.getMeasuredHeight() + i21);
        int i22 = this.f18247i & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        if (i22 != 16) {
            if (i22 != 80) {
                i11 = i19 + paddingTop;
                i12 = paddingTop + i20;
                i13 = paddingTop + i21;
            } else {
                i10 = (height - paddingBottom) - iMax2;
            }
            textView2.layout(i17, i12, i18, textView2.getMeasuredHeight() + i12);
            int iMin = Math.min(paddingLeft, (i17 - this.f18246g) - measuredWidth);
            textView.layout(iMin, i11, iMin + measuredWidth, textView.getMeasuredHeight() + i11);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i18 + this.f18246g);
            textView3.layout(iMax3, i13, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i13);
            this.f18245f = f10;
            this.f18249o = false;
        }
        i10 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i11 = i19 + i10;
        i12 = i10 + i20;
        i13 = i10 + i21;
        textView2.layout(i17, i12, i18, textView2.getMeasuredHeight() + i12);
        int iMin2 = Math.min(paddingLeft, (i17 - this.f18246g) - measuredWidth);
        textView.layout(iMin2, i11, iMin2 + measuredWidth, textView.getMeasuredHeight() + i11);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i18 + this.f18246g);
        textView3.layout(iMax4, i13, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i13);
        this.f18245f = f10;
        this.f18249o = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f18246g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        a adapter = viewPager.getAdapter();
        c cVar = this.f18250p;
        viewPager.setInternalPageChangeListener(cVar);
        viewPager.addOnAdapterChangeListener(cVar);
        this.f18240a = viewPager;
        WeakReference weakReference = this.t;
        a(weakReference != null ? (a) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f18240a;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            this.f18240a.setInternalPageChangeListener(null);
            this.f18240a.removeOnAdapterChangeListener(this.f18250p);
            this.f18240a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        if (this.f18240a != null) {
            float f10 = this.f18245f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            c(f10, true, this.f18244e);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int iMax;
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i7);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, (int) (size * 0.2f), -2);
        this.f18241b.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f18242c;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f18243d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i10);
        } else {
            iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i10, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f18248j) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i7) {
        this.f18247i = i7;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        int i7 = ((int) (f10 * 255.0f)) & 255;
        this.f18251v = i7;
        int i10 = (i7 << 24) | (this.f18252w & FlexItem.MAX_SIZE);
        this.f18241b.setTextColor(i10);
        this.f18243d.setTextColor(i10);
    }

    public void setTextColor(@ColorInt int i7) {
        this.f18252w = i7;
        this.f18242c.setTextColor(i7);
        int i10 = (this.f18251v << 24) | (this.f18252w & FlexItem.MAX_SIZE);
        this.f18241b.setTextColor(i10);
        this.f18243d.setTextColor(i10);
    }

    public void setTextSpacing(int i7) {
        this.f18246g = i7;
        requestLayout();
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18244e = -1;
        this.f18245f = -1.0f;
        this.f18250p = new c(this);
        TextView textView = new TextView(context);
        this.f18241b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f18242c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f18243d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f18238A);
        boolean z3 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f10 = dimensionPixelSize;
            textView.setTextSize(0, f10);
            textView2.setTextSize(0, f10);
            textView3.setTextSize(0, f10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f18247i = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f18252w = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f18239B);
            z3 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z3) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f18246g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
