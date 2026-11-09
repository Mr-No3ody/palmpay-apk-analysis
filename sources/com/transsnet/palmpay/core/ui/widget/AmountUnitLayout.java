package com.transsnet.palmpay.core.ui.widget;

import C0.G;
import Pa.r0;
import Y.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\rJ\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000fJ\u0019\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u0013R\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/AmountUnitLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gravity", "", "setUnitGravity", "(I)V", "getUnitGravity", "()I", "", "auto", "setAutoSetParentClipChildren", "(Z)V", "clipChildren", "setParentClipChildrenManually", "levels", "setParentClipChildrenLevels", "getParentClipChildrenLevels", "Lkotlin/Pair;", "getLayoutPaddings", "()Lkotlin/Pair;", "setParentClipChildren", "", "a", "Ljava/lang/String;", "getAATAG", "()Ljava/lang/String;", "AATAG", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAmountUnitLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmountUnitLayout.kt\ncom/transsnet/palmpay/core/ui/widget/AmountUnitLayout\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,880:1\n158#2,6:881\n*S KotlinDebug\n*F\n+ 1 AmountUnitLayout.kt\ncom/transsnet/palmpay/core/ui/widget/AmountUnitLayout\n*L\n746#1:881,6\n*E\n"})
public final class AmountUnitLayout extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f28075A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f28076B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float f28077C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f28078H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f28079L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f28080M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f28081Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String AATAG;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f28083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TriangleView f28084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f28085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f28087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28088g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f28089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28090j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f28092p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f28093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f28094w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AmountUnitLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(AmountUnitLayout amountUnitLayout, long j6) {
        String unit;
        amountUnitLayout.getClass();
        double d2 = j6 / 100.0d;
        if (d2 >= 1.0E7d) {
            unit = "Tens of Millions";
        } else if (d2 >= 1000000.0d) {
            unit = "Millions";
        } else if (d2 >= 100000.0d) {
            unit = "Hundreds of Thousands";
        } else if (d2 >= 10000.0d) {
            unit = "Tens of Thousands";
        } else if (d2 >= 1000.0d) {
            unit = "Thousands";
        } else {
            unit = d2 >= 100.0d ? "Hundreds" : "";
        }
        Intrinsics.checkNotNullParameter(unit, "unit");
        TextView textView = amountUnitLayout.f28083b;
        if (j6 < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            textView.setVisibility(8);
            TriangleView triangleView = amountUnitLayout.f28084c;
            if (triangleView != null) {
                triangleView.setVisibility(8);
            }
        } else {
            textView.setVisibility(0);
            TriangleView triangleView2 = amountUnitLayout.f28084c;
            if (triangleView2 != null) {
                triangleView2.setVisibility(0);
            }
        }
        String strD = r0.D(j6);
        boolean z3 = amountUnitLayout.f28089i;
        TextView textView2 = amountUnitLayout.f28085d;
        if (z3) {
            SpannableString spannableString = new SpannableString(G.o("₦", strD));
            spannableString.setSpan(new AbsoluteSizeSpan((int) amountUnitLayout.f28086e), 0, 1, 33);
            textView2.setText(spannableString);
        } else {
            textView2.setText(strD);
        }
        textView.setText(unit);
    }

    private final void setParentClipChildren(boolean clipChildren) {
        ViewParent parent = getParent();
        int i7 = 0;
        while (parent != null && (parent instanceof ViewGroup) && i7 < this.f28091o) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipChildren(clipChildren);
            viewGroup.setClipToPadding(clipChildren);
            i7++;
            parent = viewGroup.getParent();
        }
    }

    @NotNull
    public final String getAATAG() {
        return this.AATAG;
    }

    @NotNull
    public final Pair<Integer, Integer> getLayoutPaddings() {
        return new Pair<>(Integer.valueOf(this.f28092p), Integer.valueOf(this.t));
    }

    /* JADX INFO: renamed from: getParentClipChildrenLevels, reason: from getter */
    public final int getF28091o() {
        return this.f28091o;
    }

    /* JADX INFO: renamed from: getUnitGravity, reason: from getter */
    public final int getF28088g() {
        return this.f28088g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28090j) {
            setParentClipChildren(false);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int measuredWidth;
        String string;
        int i13 = i11 - i7;
        int i14 = (i13 - this.f28092p) - this.t;
        int dp = CommonViewExtKt.getDp(2);
        int i15 = this.f28092p;
        TextView textView = this.f28085d;
        int measuredWidth2 = ((i14 - textView.getMeasuredWidth()) / 2) + i15;
        textView.layout(measuredWidth2, dp, textView.getMeasuredWidth() + measuredWidth2, textView.getMeasuredHeight() + dp);
        CharSequence text = textView.getText();
        if (text != null && (string = text.toString()) != null && string.length() != 0 && !string.equals(this.f28094w)) {
            this.f28094w = string;
            int length = string.length();
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    i16 = -1;
                    break;
                } else if (Character.isDigit(string.charAt(i16))) {
                    break;
                } else {
                    i16++;
                }
            }
            if (i16 != -1) {
                String strSubstring = string.substring(0, i16);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = string.substring(i16, i16 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                float fMeasureText = textView.getPaint().measureText(strSubstring);
                float fMeasureText2 = textView.getPaint().measureText(strSubstring2);
                TriangleView triangleView = this.f28084c;
                this.f28093v = (int) ((((fMeasureText2 / 2) + (textView.getLeft() + fMeasureText)) - ((triangleView != null ? triangleView.getMeasuredWidth() : 0) / 2)) - (this.f28089i ? this.f28087f - this.f28086e : 0.0f));
            }
        }
        TriangleView triangleView2 = this.f28084c;
        int i17 = -(triangleView2 != null ? triangleView2.getMeasuredHeight() : 0);
        int i18 = this.f28093v;
        TriangleView triangleView3 = this.f28084c;
        if (triangleView3 != null) {
            int measuredWidth3 = (triangleView3 != null ? triangleView3.getMeasuredWidth() : 0) + i18;
            TriangleView triangleView4 = this.f28084c;
            triangleView3.layout(i18, i17, measuredWidth3, (triangleView4 != null ? triangleView4.getMeasuredHeight() : 0) + i17);
        }
        TriangleView triangleView5 = this.f28084c;
        int measuredWidth4 = ((triangleView5 != null ? triangleView5.getMeasuredWidth() : 0) / 2) + i18;
        int i19 = this.f28088g;
        TextView textView2 = this.f28083b;
        if (i19 == 0) {
            measuredWidth = Math.max(measuredWidth4 - (textView2.getMeasuredWidth() / 2), 0);
        } else {
            measuredWidth = measuredWidth4 - (textView2.getMeasuredWidth() / 2);
            if (textView2.getMeasuredWidth() + measuredWidth > i13) {
                measuredWidth = i13 - textView2.getMeasuredWidth();
            }
        }
        TriangleView triangleView6 = this.f28084c;
        int measuredHeight = (-(triangleView6 != null ? triangleView6.getMeasuredHeight() : 0)) - textView2.getMeasuredHeight();
        textView2.layout(measuredWidth, measuredHeight, textView2.getMeasuredWidth() + measuredWidth, textView2.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        TextView textView = this.f28085d;
        measureChild(textView, i7, i10);
        int measuredWidth = textView.getMeasuredWidth();
        int measuredHeight = textView.getMeasuredHeight();
        TriangleView triangleView = this.f28084c;
        if (triangleView != null) {
            measureChild(triangleView, i7, i10);
        }
        measureChild(this.f28083b, i7, i10);
        setMeasuredDimension(View.resolveSize(measuredWidth + this.f28092p + this.t, i7), View.resolveSize(measuredHeight, i10));
    }

    public final void setAutoSetParentClipChildren(boolean auto) {
        if (this.f28090j != auto) {
            this.f28090j = auto;
            if (auto) {
                setParentClipChildren(false);
            }
        }
    }

    public final void setParentClipChildrenLevels(int levels) {
        if (levels <= 0) {
            throw new IllegalArgumentException("levels must be greater than 0");
        }
        if (this.f28091o != levels) {
            this.f28091o = levels;
            if (this.f28090j) {
                setParentClipChildren(false);
            }
        }
    }

    public final void setParentClipChildrenManually(boolean clipChildren) {
        setParentClipChildren(clipChildren);
    }

    public final void setUnitGravity(int gravity) {
        if (gravity != 0 && gravity != 1) {
            throw new IllegalArgumentException("gravity must be UNIT_GRAVITY_LEFT or UNIT_GRAVITY_RIGHT");
        }
        if (this.f28088g != gravity) {
            this.f28088g = gravity;
            requestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AmountUnitLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AmountUnitLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AmountUnitLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        Typeface typefaceA;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.AATAG = "AmountUnitLayout";
        TextView textView = new TextView(context);
        this.f28083b = textView;
        TextView textView2 = new TextView(context);
        this.f28085d = textView2;
        this.f28086e = CommonViewExtKt.getDp(14);
        this.f28087f = CommonViewExtKt.getDp(14);
        this.f28088g = 1;
        this.f28089i = true;
        this.f28090j = true;
        this.f28091o = 1;
        this.f28075A = -16777216;
        this.f28078H = -1;
        setClipChildren(false);
        setClipToPadding(false);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.AmountUnitLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(m.AmountUnitLayout_amountTextSize, CommonViewExtKt.getDp(14));
            this.f28087f = dimension;
            this.f28086e = typedArrayObtainStyledAttributes.getDimension(m.AmountUnitLayout_currencySymbolSize, dimension);
            this.f28088g = typedArrayObtainStyledAttributes.getInt(m.AmountUnitLayout_unitGravity, 1);
            this.f28089i = typedArrayObtainStyledAttributes.getBoolean(m.AmountUnitLayout_showCurrencySymbol, true);
            this.f28090j = typedArrayObtainStyledAttributes.getBoolean(m.AmountUnitLayout_autoSetParentClipChildren, true);
            this.f28091o = typedArrayObtainStyledAttributes.getInt(m.AmountUnitLayout_parentClipChildrenLevels, 1);
            this.f28092p = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.AmountUnitLayout_marginStart, 0);
            this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.AmountUnitLayout_marginEnd, 0);
            this.f28075A = typedArrayObtainStyledAttributes.getColor(m.AmountUnitLayout_amountTextColor, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext()));
            this.f28076B = typedArrayObtainStyledAttributes.getBoolean(m.AmountUnitLayout_amountTextBold, false);
            this.f28077C = typedArrayObtainStyledAttributes.getDimension(m.AmountUnitLayout_unitTextSize, CommonViewExtKt.getDp(10));
            this.f28078H = typedArrayObtainStyledAttributes.getColor(m.AmountUnitLayout_unitTextColor, CommonViewExtKt.colorInt(L6.b.ppColorTextBase, getContext()));
            this.f28079L = typedArrayObtainStyledAttributes.getColor(m.AmountUnitLayout_unitBackgroundColor, CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext()));
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.AmountUnitLayout_triangleHeight, CommonViewExtKt.getDp(2));
            this.f28080M = dimensionPixelSize;
            this.f28081Q = dimensionPixelSize * 2;
            typedArrayObtainStyledAttributes.recycle();
            int i10 = this.f28078H;
            float f10 = this.f28077C;
            int i11 = this.f28079L;
            textView.setId(View.generateViewId());
            float dp = CommonViewExtKt.getDp(2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            gradientDrawable.setColor(i11);
            textView.setIncludeFontPadding(false);
            textView.setBackground(gradientDrawable);
            textView.setTextColor(i10);
            textView.setTextSize(0, f10);
            textView.setPadding(CommonViewExtKt.getDp(4), CommonViewExtKt.getDp(1), CommonViewExtKt.getDp(4), CommonViewExtKt.getDp(1));
            textView.setGravity(17);
            addView(textView, new ViewGroup.LayoutParams(-2, -2));
            int i12 = this.f28079L;
            int i13 = this.f28081Q;
            int i14 = this.f28080M;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            TriangleView triangleView = new TriangleView(context2, null, i12);
            this.f28084c = triangleView;
            triangleView.setId(View.generateViewId());
            addView(this.f28084c, new ViewGroup.LayoutParams(i13, i14));
            int i15 = this.f28075A;
            boolean z3 = this.f28076B;
            textView2.setId(View.generateViewId());
            textView2.setTextColor(i15);
            textView2.setIncludeFontPadding(false);
            textView2.setTextSize(0, this.f28087f);
            if (z3) {
                typefaceA = j.a(L6.e.lib_ui_number_bold, getContext());
            } else {
                typefaceA = j.a(L6.e.lib_ui_number_normal, getContext());
            }
            textView2.setTypeface(typefaceA);
            textView2.setGravity(17);
            addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
