package com.palmpay.lib.ui.text;

import L6.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.IconicsDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010a9.m;
import p064e7.a;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eR(\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/palmpay/lib/ui/text/ImageTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "selected", "", "setSelected", "(Z)V", ViewProps.ENABLED, "setEnabled", "Landroidx/appcompat/widget/AppCompatImageView;", "value", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "getImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "Landroidx/appcompat/widget/AppCompatTextView;", "c", "Landroidx/appcompat/widget/AppCompatTextView;", "getTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "textView", "e7/a", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageTextView extends ConstraintLayout {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f24597H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f24598A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f24599B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f24600C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final AppCompatImageView imageView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final AppCompatTextView textView;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24607g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f24608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24609j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f24610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final IconicsDrawable f24611p;
    public final float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f24612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24613w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final AppCompatImageView getImageView() {
        return this.imageView;
    }

    @Nullable
    public final AppCompatTextView getTextView() {
        return this.textView;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        AppCompatImageView appCompatImageView = this.imageView;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled(enabled);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        AppCompatImageView appCompatImageView = this.imageView;
        if (appCompatImageView != null) {
            appCompatImageView.setSelected(selected);
        }
        AppCompatTextView appCompatTextView = this.textView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(this.f24613w);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ImageTextView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        a aVar;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24601a = context;
        this.f24613w = -12303292;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ImageTextView);
        int i10 = typedArrayObtainStyledAttributes.getInt(j.ImageTextView_itv_img_gravity, 1);
        if (i10 == 0) {
            aVar = a.f36177a;
        } else if (i10 == 1) {
            aVar = a.f36178b;
        } else if (i10 == 2) {
            aVar = a.f36179c;
        } else if (i10 != 3) {
            aVar = a.f36178b;
        } else {
            aVar = a.f36180d;
        }
        this.f24608i = aVar;
        this.f24609j = typedArrayObtainStyledAttributes.getResourceId(j.ImageTextView_itv_img_res, 0);
        this.f24610o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.ImageTextView_itv_img_size, p059e1.a.j(context, 16.0f));
        this.t = typedArrayObtainStyledAttributes.getDimension(j.ImageTextView_android_textSize, p059e1.a.j(context, 14.0f));
        this.f24612v = typedArrayObtainStyledAttributes.getString(j.ImageTextView_android_text);
        int color = typedArrayObtainStyledAttributes.getColor(j.ImageTextView_android_textColor, -12303292);
        this.f24613w = color;
        this.f24598A = typedArrayObtainStyledAttributes.getInteger(j.ImageTextView_android_lines, 1);
        this.f24599B = typedArrayObtainStyledAttributes.getInteger(j.ImageTextView_android_maxLines, 1);
        this.f24600C = typedArrayObtainStyledAttributes.getInt(j.ImageTextView_android_gravity, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(j.ImageTextView_itv_color, color);
        String string = typedArrayObtainStyledAttributes.getString(j.ImageTextView_itv_icon);
        if (string != null && string.length() != 0) {
            IconicsDrawable iconicsDrawableH = p059e1.a.h(context, null, string, color2, 1.0f);
            iconicsDrawableH.a(new m(this, 21));
            this.f24611p = iconicsDrawableH;
        }
        this.f24604d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.ImageTextView_itv_img_top_margin, 0);
        this.f24606f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.ImageTextView_itv_img_left_margin, 0);
        this.f24607g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.ImageTextView_itv_img_right_margin, 0);
        this.f24605e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.ImageTextView_itv_img_bottom_margin, 0);
        if (typedArrayObtainStyledAttributes.hasValue(j.ImageTextView_android_fontFamily)) {
            try {
                Typeface.create(typedArrayObtainStyledAttributes.getString(j.ImageTextView_android_fontFamily), 0);
            } catch (Exception unused) {
            }
        }
        a aVar2 = this.f24608i;
        int iOrdinal = aVar2.ordinal();
        int i11 = this.f24605e;
        int i12 = this.f24604d;
        int i13 = this.f24607g;
        int i14 = this.f24606f;
        int i15 = this.f24610o;
        int i16 = this.f24609j;
        IconicsDrawable iconicsDrawable = this.f24611p;
        int i17 = this.f24599B;
        int i18 = this.f24598A;
        String str = this.f24612v;
        int i19 = this.f24600C;
        int i20 = this.f24613w;
        float f10 = this.t;
        Context context2 = this.f24601a;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new l();
                    }
                }
            }
            int id2 = getId();
            AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
            appCompatTextView.setId(View.generateViewId());
            appCompatTextView.setTextSize(0, f10);
            appCompatTextView.setTextColor(i20);
            appCompatTextView.setGravity(i19);
            appCompatTextView.setTextAlignment(1);
            appCompatTextView.setText((str == null || str.length() == 0) ? "" : str);
            appCompatTextView.setLines(i18);
            if (i17 > i18) {
                appCompatTextView.setMaxLines(i17);
            }
            Typeface typeface = appCompatTextView.getTypeface();
            if (typeface != null) {
                appCompatTextView.setTypeface(typeface);
            }
            this.textView = appCompatTextView;
            AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
            appCompatImageView.setId(View.generateViewId());
            if (iconicsDrawable != null) {
                appCompatImageView.setImageDrawable(iconicsDrawable);
            } else {
                appCompatImageView.setImageResource(i16);
            }
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.imageView = appCompatImageView;
            View view = this.textView;
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f15650i = id2;
            layoutParams.f15655l = id2;
            layoutParams.t = id2;
            Unit unit = Unit.f38893a;
            addView(view, layoutParams);
            View view2 = this.imageView;
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(i15, i15);
            AppCompatTextView appCompatTextView2 = this.textView;
            Intrinsics.e(appCompatTextView2);
            layoutParams2.f15668s = appCompatTextView2.getId();
            AppCompatTextView appCompatTextView3 = this.textView;
            Intrinsics.e(appCompatTextView3);
            layoutParams2.f15650i = appCompatTextView3.getId();
            if (aVar2 == a.f36178b) {
                AppCompatTextView appCompatTextView4 = this.textView;
                Intrinsics.e(appCompatTextView4);
                layoutParams2.f15655l = appCompatTextView4.getId();
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i14;
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i13;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i12;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i11;
            addView(view2, layoutParams2);
            return;
        }
        int id3 = getId();
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        appCompatImageView2.setId(View.generateViewId());
        if (iconicsDrawable != null) {
            appCompatImageView2.setImageDrawable(iconicsDrawable);
        } else {
            appCompatImageView2.setImageResource(i16);
        }
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.imageView = appCompatImageView2;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(context2);
        appCompatTextView5.setId(View.generateViewId());
        appCompatTextView5.setTextSize(0, f10);
        appCompatTextView5.setTextColor(i20);
        appCompatTextView5.setGravity(i19);
        appCompatTextView5.setTextAlignment(1);
        appCompatTextView5.setText((str == null || str.length() == 0) ? "" : str);
        appCompatTextView5.setLines(i18);
        if (i17 > i18) {
            appCompatTextView5.setMaxLines(i17);
        }
        Typeface typeface2 = appCompatTextView5.getTypeface();
        if (typeface2 != null) {
            appCompatTextView5.setTypeface(typeface2);
        }
        this.textView = appCompatTextView5;
        View view3 = this.imageView;
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(i15, i15);
        layoutParams3.t = id3;
        if (aVar2 == a.f36177a) {
            AppCompatTextView appCompatTextView6 = this.textView;
            Intrinsics.e(appCompatTextView6);
            layoutParams3.f15650i = appCompatTextView6.getId();
            AppCompatTextView appCompatTextView7 = this.textView;
            Intrinsics.e(appCompatTextView7);
            layoutParams3.f15655l = appCompatTextView7.getId();
        } else {
            AppCompatTextView appCompatTextView8 = this.textView;
            Intrinsics.e(appCompatTextView8);
            layoutParams3.f15650i = appCompatTextView8.getId();
        }
        ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = i14;
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i13;
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i11;
        Unit unit2 = Unit.f38893a;
        addView(view3, layoutParams3);
        View view4 = this.textView;
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams4.f15650i = id3;
        AppCompatImageView appCompatImageView3 = this.imageView;
        Intrinsics.e(appCompatImageView3);
        layoutParams4.f15668s = appCompatImageView3.getId();
        layoutParams4.f15670v = id3;
        layoutParams4.f15655l = id3;
        layoutParams4.f15632W = true;
        addView(view4, layoutParams4);
    }
}
