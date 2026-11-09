package com.transsnet.palmpay.custom_view.smarttablayout;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.N;
import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.custom_view.x;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SmartTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f31661A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmartTabStrip f31662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f31666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31668g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f31669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewPager f31670j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f31671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnScrollChangeListener f31672p;
    public TabProvider t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f31673v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OnTabClickListener f31674w;

    public interface OnScrollChangeListener {
        void onScrollChanged(int i7, int i10);
    }

    public interface OnTabClickListener {
        void onTabClicked(int i7);
    }

    public interface TabColorizer {
        int getDividerColor(int i7);

        int getIndicatorColor(int i7);
    }

    public interface TabProvider {
        View createTabView(ViewGroup viewGroup, int i7, androidx.viewpager.widget.a aVar);
    }

    public SmartTabLayout(Context context) {
        this(context, null);
    }

    public final void a(int i7, float f10) {
        int marginEnd;
        int paddingStart;
        int paddingRight;
        int marginEnd2;
        int marginEnd3;
        int iG;
        int i10;
        SmartTabStrip smartTabStrip = this.f31662a;
        int childCount = smartTabStrip.getChildCount();
        if (childCount == 0 || i7 < 0 || i7 >= childCount) {
            return;
        }
        boolean zP = D3.a.p(this);
        View childAt = smartTabStrip.getChildAt(i7);
        int iH = D3.a.h(childAt);
        if (childAt == null) {
            marginEnd = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginEnd = marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
        }
        int iRound = (int) ((marginEnd + iH) * f10);
        if (smartTabStrip.f31689i) {
            if (0.0f < f10 && f10 < 1.0f) {
                View childAt2 = smartTabStrip.getChildAt(i7 + 1);
                iRound = Math.round(f10 * (D3.a.f(childAt2) + (D3.a.h(childAt2) / 2) + D3.a.e(childAt) + (D3.a.h(childAt) / 2)));
            }
            View childAt3 = smartTabStrip.getChildAt(0);
            if (zP) {
                int iE = D3.a.e(childAt3) + D3.a.h(childAt3);
                int iE2 = D3.a.e(childAt) + D3.a.h(childAt);
                iG = (D3.a.d(childAt, false) - D3.a.e(childAt)) - iRound;
                i10 = (iE - iE2) / 2;
            } else {
                int iF = D3.a.f(childAt3) + D3.a.h(childAt3);
                int iF2 = D3.a.f(childAt) + D3.a.h(childAt);
                iG = (D3.a.g(childAt, false) - D3.a.f(childAt)) + iRound;
                i10 = (iF - iF2) / 2;
            }
            scrollTo(iG - i10, 0);
            return;
        }
        int i11 = this.f31663b;
        if (i11 == -1) {
            if (0.0f < f10 && f10 < 1.0f) {
                View childAt4 = smartTabStrip.getChildAt(i7 + 1);
                iRound = Math.round(f10 * (D3.a.f(childAt4) + (D3.a.h(childAt4) / 2) + D3.a.e(childAt) + (D3.a.h(childAt) / 2)));
            }
            if (zP) {
                int iH2 = D3.a.h(childAt);
                if (childAt == null) {
                    marginEnd3 = 0;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    marginEnd3 = marginLayoutParams2.getMarginEnd() + marginLayoutParams2.getMarginStart();
                }
                int width = (getWidth() / 2) + ((-(marginEnd3 + iH2)) / 2);
                WeakHashMap weakHashMap = N.f16168a;
                paddingStart = width - getPaddingStart();
            } else {
                int iH3 = D3.a.h(childAt);
                if (childAt == null) {
                    marginEnd2 = 0;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    marginEnd2 = marginLayoutParams3.getMarginEnd() + marginLayoutParams3.getMarginStart();
                }
                int width2 = ((marginEnd2 + iH3) / 2) - (getWidth() / 2);
                WeakHashMap weakHashMap2 = N.f16168a;
                paddingStart = width2 + getPaddingStart();
            }
        } else if (zP) {
            if (i7 <= 0 && f10 <= 0.0f) {
                i11 = 0;
            }
            paddingStart = i11;
        } else {
            paddingStart = (i7 > 0 || f10 > 0.0f) ? -i11 : 0;
        }
        int iG2 = D3.a.g(childAt, false);
        int iF3 = D3.a.f(childAt);
        if (zP) {
            paddingRight = getPaddingRight() + getPaddingLeft() + (((iG2 + iF3) - iRound) - getWidth()) + paddingStart;
        } else {
            paddingRight = (iG2 - iF3) + iRound + paddingStart;
        }
        scrollTo(paddingRight, 0);
    }

    public int getTabCount() {
        return this.f31662a.getChildCount();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        ViewPager viewPager;
        super.onLayout(z3, i7, i10, i11, i12);
        if (!z3 || (viewPager = this.f31670j) == null) {
            return;
        }
        a(viewPager.getCurrentItem(), 0.0f);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        OnScrollChangeListener onScrollChangeListener = this.f31672p;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChanged(i7, i11);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        SmartTabStrip smartTabStrip = this.f31662a;
        if (!smartTabStrip.f31689i || smartTabStrip.getChildCount() <= 0) {
            return;
        }
        View childAt = smartTabStrip.getChildAt(0);
        View childAt2 = smartTabStrip.getChildAt(smartTabStrip.getChildCount() - 1);
        int measuredWidth = ((i7 - (childAt == null ? 0 : childAt.getMeasuredWidth())) / 2) - D3.a.f(childAt);
        int measuredWidth2 = ((i7 - (childAt2 == null ? 0 : childAt2.getMeasuredWidth())) / 2) - D3.a.e(childAt2);
        smartTabStrip.setMinimumWidth(smartTabStrip.getMeasuredWidth());
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = N.f16168a;
        setPaddingRelative(measuredWidth, paddingTop, measuredWidth2, paddingBottom);
        setClipToPadding(false);
    }

    public void setCustomTabColorizer(TabColorizer tabColorizer) {
        SmartTabStrip smartTabStrip = this.f31662a;
        smartTabStrip.f31695q0 = tabColorizer;
        smartTabStrip.invalidate();
    }

    public void setCustomTabView(TabProvider tabProvider) {
        this.t = tabProvider;
    }

    public void setDefaultTabTextColor(int i7) {
        this.f31666e = ColorStateList.valueOf(i7);
    }

    public void setDistributeEvenly(boolean z3) {
        this.f31661A = z3;
    }

    public void setDividerColors(int... iArr) {
        SmartTabStrip smartTabStrip = this.f31662a;
        smartTabStrip.f31695q0 = null;
        smartTabStrip.f31678H.f31705b = iArr;
        smartTabStrip.invalidate();
    }

    public void setIndicationInterpolator(Xb.c cVar) {
        SmartTabStrip smartTabStrip = this.f31662a;
        smartTabStrip.f31694p0 = cVar;
        smartTabStrip.invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f31671o = onPageChangeListener;
    }

    public void setOnScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.f31672p = onScrollChangeListener;
    }

    public void setOnTabClickListener(OnTabClickListener onTabClickListener) {
        this.f31674w = onTabClickListener;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        SmartTabStrip smartTabStrip = this.f31662a;
        smartTabStrip.f31695q0 = null;
        smartTabStrip.f31678H.f31704a = iArr;
        smartTabStrip.invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setViewPager(ViewPager viewPager) {
        View viewCreateTabView;
        View view;
        TextView textView;
        SmartTabStrip smartTabStrip = this.f31662a;
        smartTabStrip.removeAllViews();
        this.f31670j = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        viewPager.addOnPageChangeListener(new b(this));
        androidx.viewpager.widget.a adapter = this.f31670j.getAdapter();
        for (int i7 = 0; i7 < adapter.c(); i7++) {
            TabProvider tabProvider = this.t;
            if (tabProvider == null) {
                CharSequence charSequenceE = adapter.e(i7);
                textView = new TextView(getContext());
                textView.setGravity(17);
                textView.setText(charSequenceE);
                textView.setTextColor(this.f31666e);
                textView.setTextSize(0, this.f31667f);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                int i10 = this.f31664c;
                if (i10 != -1) {
                    textView.setBackgroundResource(i10);
                } else {
                    TypedValue typedValue = new TypedValue();
                    getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
                    textView.setBackgroundResource(typedValue.resourceId);
                }
                textView.setAllCaps(this.f31665d);
                int i11 = this.f31668g;
                textView.setPadding(i11, 0, i11, 0);
                int i12 = this.f31669i;
                view = textView;
                if (i12 > 0) {
                    textView.setMinWidth(i12);
                }
            } else {
                viewCreateTabView = tabProvider.createTabView(smartTabStrip, i7, adapter);
            }
            if (view == null) {
                view = viewCreateTabView;
                view = textView;
                throw new IllegalStateException("tabView is null.");
            }
            view = viewCreateTabView;
            if (this.f31661A) {
                view = textView;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            view = textView;
            a aVar = this.f31673v;
            if (aVar != null) {
                view.setOnClickListener(aVar);
            }
            smartTabStrip.addView(view);
            if (i7 == this.f31670j.getCurrentItem()) {
                view.setSelected(true);
            }
        }
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setDefaultTabTextColor(ColorStateList colorStateList) {
        this.f31666e = colorStateList;
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        setHorizontalScrollBarEnabled(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        float fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.stl_SmartTabLayout, i7, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.stl_SmartTabLayout_stl_defaultTabBackground, -1);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(x.stl_SmartTabLayout_stl_defaultTabTextAllCaps, true);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(x.stl_SmartTabLayout_stl_defaultTabTextColor);
        float dimension = typedArrayObtainStyledAttributes.getDimension(x.stl_SmartTabLayout_stl_defaultTabTextSize, fApplyDimension);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.stl_SmartTabLayout_stl_defaultTabTextHorizontalPadding, (int) (16.0f * f10));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.stl_SmartTabLayout_stl_defaultTabTextMinWidth, (int) (0.0f * f10));
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(x.stl_SmartTabLayout_stl_customTabTextLayoutId, -1);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(x.stl_SmartTabLayout_stl_customTabTextViewId, -1);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(x.stl_SmartTabLayout_stl_distributeEvenly, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(x.stl_SmartTabLayout_stl_clickable, true);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(x.stl_SmartTabLayout_stl_titleOffset, (int) (f10 * 24.0f));
        typedArrayObtainStyledAttributes.recycle();
        this.f31663b = layoutDimension;
        this.f31664c = resourceId;
        this.f31665d = z3;
        this.f31666e = colorStateList == null ? ColorStateList.valueOf(-67108864) : colorStateList;
        this.f31667f = dimension;
        this.f31668g = dimensionPixelSize;
        this.f31669i = dimensionPixelSize2;
        this.f31673v = z10 ? new a(this) : null;
        this.f31661A = z8;
        if (resourceId2 != -1) {
            this.t = new c(getContext(), resourceId2, resourceId3);
        }
        SmartTabStrip smartTabStrip = new SmartTabStrip(context, attributeSet);
        this.f31662a = smartTabStrip;
        boolean z11 = smartTabStrip.f31689i;
        if (z8 && z11) {
            throw new UnsupportedOperationException("'distributeEvenly' and 'indicatorAlwaysInCenter' both use does not support");
        }
        setFillViewport(!z11);
        addView(smartTabStrip, -1, -1);
    }
}
