package com.flexibank.sdk.customview;

import V9.ViewOnFocusChangeListenerC0713b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.flexibank.sdk.m;
import com.flexibank.sdk.o;
import com.flexibank.sdk.t;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p052da.ViewOnClickListenerC1649v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005ijkl\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010&\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010)\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010,\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0017\u0010/\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001fR\u0017\u00102\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u001fR\u0017\u00105\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001fR$\u00108\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u0010\u001d\u001a\u0004\b7\u0010\u001fR\u0017\u0010;\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010\u001d\u001a\u0004\b:\u0010\u001fR\u0017\u0010>\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010\u001fR\u0017\u0010A\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u0010\u001d\u001a\u0004\b@\u0010\u001fR(\u0010G\u001a\u0004\u0018\u00010B2\b\u0010\u0012\u001a\u0004\u0018\u00010B8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR(\u0010M\u001a\u0004\u0018\u00010H2\b\u0010\u0012\u001a\u0004\u0018\u00010H8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0017\u0010Z\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\"\u0010\\\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010Y\"\u0004\b]\u0010\u0018R(\u0010c\u001a\u0004\u0018\u00010^2\b\u0010\u0012\u001a\u0004\u0018\u00010^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR(\u0010e\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\b\u0013\u0010h¨\u0006m"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankPinEntryView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnFocusChangeListener;", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "l", "", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "", "value", "setText", "(Ljava/lang/CharSequence;)V", "", ViewProps.ENABLED, "setEnabled", "(Z)V", CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "setNumDigits", "(I)V", "a", "I", "getDigits", "()I", "digits", "b", "getInputType", "inputType", "c", "getDigitWidth", "digitWidth", "d", "getDigitHeight", "digitHeight", "e", "getDigitBackground", "digitBackground", "f", "getDigitSpacing", "digitSpacing", "g", "getDigitTextSize", "digitTextSize", "i", "getDigitTextColor", "digitTextColor", "j", "getDigitElevation", "digitElevation", "A", "getAccentType", "accentType", "B", "getAccentWidth", "accentWidth", "C", "getAccentColor", "accentColor", "", "H", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "mask", "Landroid/widget/EditText;", "L", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$OnPinEnteredListener;", "Q", "Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$OnPinEnteredListener;", "getOnPinEnteredListener", "()Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$OnPinEnteredListener;", "setOnPinEnteredListener", "(Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$OnPinEnteredListener;)V", "onPinEnteredListener", "k0", "Z", "getAccentRequiresFocus", "()Z", "accentRequiresFocus", "p0", "isShowError", "setShowError", "Landroid/widget/ImageView;", "s0", "Landroid/widget/ImageView;", "getIvHide", "()Landroid/widget/ImageView;", "ivHide", "Landroid/text/Editable;", ReactTextInputShadowNode.PROP_TEXT, "getText", "()Landroid/text/Editable;", "(Landroid/text/Editable;)V", "SavedState", "DigitView", "OnPinEnteredListener", "OnPinHideStateChangeListener", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankPinEntryView extends LinearLayout {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f22147t0;

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final int accentType;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final int accentWidth;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final int accentColor;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final String mask;

    /* JADX INFO: renamed from: L, reason: collision with root package name and from kotlin metadata */
    public EditText editText;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public View.OnFocusChangeListener f22153M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public OnPinEnteredListener onPinEnteredListener;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int digits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int inputType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int digitWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int digitHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int digitBackground;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int digitSpacing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int digitTextSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int digitTextColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int digitElevation;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public final boolean accentRequiresFocus;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f22165o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f22166p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public boolean isShowError;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f22168q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f22169r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public ImageView ivHide;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f22171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f22172w;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$DigitView;", "Landroid/widget/TextView;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class DigitView extends TextView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f22173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f22174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22176d;

        public DigitView(Context context) {
            super(context, null, 0);
            Paint paint = new Paint();
            this.f22173a = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(FlexiBankPinEntryView.this.getAccentColor());
            Paint paint2 = new Paint(1);
            this.f22174b = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(FlexiBankPinEntryView.this.f22165o);
            paint2.setColor(FlexiBankPinEntryView.this.f22166p);
            if (isInEditMode()) {
                setText("●");
            }
            setLayerType(1, paint2);
        }

        @Override // android.widget.TextView, android.view.View
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            super.onDraw(canvas);
            boolean zIsSelected = isSelected();
            FlexiBankPinEntryView flexiBankPinEntryView = FlexiBankPinEntryView.this;
            if (zIsSelected || !flexiBankPinEntryView.getAccentRequiresFocus()) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - flexiBankPinEntryView.getAccentWidth(), getWidth(), getHeight(), this.f22173a);
            } else {
                canvas2 = canvas;
            }
            boolean z3 = flexiBankPinEntryView.isShowError;
            Paint paint = this.f22174b;
            if (z3) {
                paint.setColor(getResources().getColor(m.fb_base_color_fail));
            } else {
                int i7 = flexiBankPinEntryView.f22166p;
                if (isSelected()) {
                    i7 = flexiBankPinEntryView.t;
                }
                paint.setColor(i7);
            }
            if (flexiBankPinEntryView.getDigitSpacing() != 0) {
                if (flexiBankPinEntryView.f22171v <= 0) {
                    canvas2.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint);
                    return;
                }
                int i10 = flexiBankPinEntryView.f22165o;
                RectF rectF = new RectF(i10 / 2, i10 / 2, getWidth() - (flexiBankPinEntryView.f22165o / 2), getHeight() - (flexiBankPinEntryView.f22165o / 2));
                int i11 = flexiBankPinEntryView.f22171v;
                canvas2.drawRoundRect(rectF, i11, i11, paint);
                return;
            }
            paint.setColor(flexiBankPinEntryView.f22166p);
            if (flexiBankPinEntryView.f22171v <= 0) {
                if (this.f22176d) {
                    canvas2.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint);
                    return;
                } else {
                    canvas2.drawRect(new Rect(0, 0, getWidth() * 2, getHeight()), paint);
                    return;
                }
            }
            int i12 = flexiBankPinEntryView.f22165o;
            RectF rectF2 = new RectF(i12 / 2, i12 / 2, getWidth() - (flexiBankPinEntryView.f22165o / 2), getHeight() - (flexiBankPinEntryView.f22165o / 2));
            if (this.f22175c) {
                RectF rectF3 = new RectF(rectF2);
                float f10 = rectF3.right;
                int i13 = flexiBankPinEntryView.f22171v;
                rectF3.right = f10 + i13;
                canvas2.drawRoundRect(rectF3, i13, i13, paint);
                return;
            }
            if (!this.f22176d) {
                int i14 = flexiBankPinEntryView.f22165o;
                canvas2.drawRect(new Rect(i14 / 2, i14 / 2, getWidth() * 2, getHeight() - (flexiBankPinEntryView.f22165o / 2)), paint);
                return;
            }
            RectF rectF4 = new RectF(rectF2);
            float f11 = rectF4.left;
            int i15 = flexiBankPinEntryView.f22171v;
            rectF4.left = f11 - i15;
            canvas2.drawRoundRect(rectF4, i15, i15, paint);
            float f12 = rectF2.left;
            canvas2.drawLine(f12, rectF2.top, f12, rectF2.bottom, paint);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$OnPinEnteredListener;", "", "onPinEntered", "", "pin", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnPinEnteredListener {
        void onPinEntered(@Nullable String pin);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$OnPinHideStateChangeListener;", "", "onHideStateChanged", "", "pinEntryView", "Lcom/flexibank/sdk/customview/FlexiBankPinEntryView;", "hide", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnPinHideStateChangeListener {
        void onHideStateChanged(@Nullable FlexiBankPinEntryView pinEntryView, boolean hide);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$SavedState;", "Landroid/view/View$BaseSavedState;", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @JvmField
        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22178a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            new a(null);
            CREATOR = new com.flexibank.sdk.customview.a();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            super.writeToParcel(dest, i7);
            dest.writeString(this.f22178a);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        Intrinsics.checkNotNullExpressionValue("FlexiBankPinEntryView", "getSimpleName(...)");
        f22147t0 = "FlexiBankPinEntryView";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankPinEntryView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        String str;
        int i7;
        int i10 = this.digits;
        int i11 = 0;
        while (true) {
            str = this.mask;
            i7 = this.digitSpacing;
            if (i11 >= i10) {
                break;
            }
            DigitView digitView = new DigitView(getContext());
            digitView.setWidth(this.digitWidth);
            digitView.setHeight(this.digitHeight);
            digitView.setBackgroundResource(this.digitBackground);
            digitView.setTextColor(this.digitTextColor);
            digitView.setTextSize(0, this.digitTextSize);
            digitView.setGravity(17);
            digitView.setElevation(this.digitElevation);
            digitView.f22175c = i11 == 0;
            digitView.f22176d = i11 == this.digits - 1;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i11 < this.digits - 1) {
                layoutParams.rightMargin = i7;
            }
            if (i11 == 0 && !TextUtils.isEmpty(str)) {
                layoutParams.leftMargin = (i7 * 2) + this.f22172w;
            }
            addView(digitView, layoutParams);
            i11++;
        }
        if (!TextUtils.isEmpty(str) && !this.f22168q0) {
            if (this.ivHide == null) {
                this.ivHide = new ImageView(getContext());
            }
            ImageView imageView = this.ivHide;
            Intrinsics.e(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            ImageView imageView2 = this.ivHide;
            Intrinsics.e(imageView2);
            imageView2.setOnClickListener(new ViewOnClickListenerC1649v(this, 27));
            ImageView imageView3 = this.ivHide;
            Intrinsics.e(imageView3);
            imageView3.setImageResource(this.f22169r0 ? o.fb_hide_psw : o.fb_show_psw);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            layoutParams2.leftMargin = i7 * 2;
            addView(this.ivHide, layoutParams2);
        }
        EditText editText = new EditText(getContext());
        this.editText = editText;
        editText.setEnabled(isEnabled());
        EditText editText2 = this.editText;
        Intrinsics.e(editText2);
        editText2.setBackgroundColor(getResources().getColor(R.color.transparent));
        EditText editText3 = this.editText;
        Intrinsics.e(editText3);
        editText3.setTextColor(getResources().getColor(R.color.transparent));
        EditText editText4 = this.editText;
        Intrinsics.e(editText4);
        editText4.setCursorVisible(false);
        EditText editText5 = this.editText;
        Intrinsics.e(editText5);
        editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.digits)});
        EditText editText6 = this.editText;
        Intrinsics.e(editText6);
        editText6.setInputType(this.inputType);
        EditText editText7 = this.editText;
        Intrinsics.e(editText7);
        editText7.setImeOptions(268435462);
        EditText editText8 = this.editText;
        Intrinsics.e(editText8);
        editText8.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0713b(this, 4));
        EditText editText9 = this.editText;
        Intrinsics.e(editText9);
        editText9.addTextChangedListener(new b(this));
        addView(this.editText, new LinearLayout.LayoutParams(1, 1));
    }

    public final void b(Editable editable) {
        if (editable == null) {
            return;
        }
        int length = TextUtils.isEmpty(editable) ? 0 : editable.length();
        int i7 = this.digits;
        for (int i10 = 0; i10 < i7; i10++) {
            if (length > i10) {
                String strValueOf = this.mask;
                if (strValueOf == null || strValueOf.length() == 0 || !this.f22169r0) {
                    strValueOf = String.valueOf(editable.charAt(i10));
                }
                View childAt = getChildAt(i10);
                Intrinsics.f(childAt, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) childAt).setText(strValueOf);
            } else {
                View childAt2 = getChildAt(i10);
                Intrinsics.f(childAt2, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) childAt2).setText("");
            }
        }
    }

    public final int getAccentColor() {
        return this.accentColor;
    }

    public final boolean getAccentRequiresFocus() {
        return this.accentRequiresFocus;
    }

    public final int getAccentType() {
        return this.accentType;
    }

    public final int getAccentWidth() {
        return this.accentWidth;
    }

    public final int getDigitBackground() {
        return this.digitBackground;
    }

    public final int getDigitElevation() {
        return this.digitElevation;
    }

    public final int getDigitHeight() {
        return this.digitHeight;
    }

    public final int getDigitSpacing() {
        return this.digitSpacing;
    }

    public final int getDigitTextColor() {
        return this.digitTextColor;
    }

    public final int getDigitTextSize() {
        return this.digitTextSize;
    }

    public final int getDigitWidth() {
        return this.digitWidth;
    }

    public final int getDigits() {
        return this.digits;
    }

    @Nullable
    public final EditText getEditText() {
        return this.editText;
    }

    public final int getInputType() {
        return this.inputType;
    }

    @Nullable
    public final ImageView getIvHide() {
        return this.ivHide;
    }

    @Nullable
    public final String getMask() {
        return this.mask;
    }

    @Override // android.view.View
    @Nullable
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f22153M;
    }

    @Nullable
    public final OnPinEnteredListener getOnPinEnteredListener() {
        return this.onPinEnteredListener;
    }

    @Nullable
    public final Editable getText() {
        EditText editText = this.editText;
        Intrinsics.e(editText);
        return editText.getText();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Intrinsics.f(parcelable, "null cannot be cast to non-null type com.flexibank.sdk.customview.FlexiBankPinEntryView.SavedState");
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        try {
            EditText editText = this.editText;
            Intrinsics.e(editText);
            editText.setText(savedState.f22178a);
            EditText editText2 = this.editText;
            Intrinsics.e(editText2);
            String str = savedState.f22178a;
            Intrinsics.e(str);
            editText2.setSelection(str.length());
        } catch (Exception e10) {
            Log.e(f22147t0, "onRestoreInstanceState: ", e10);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        EditText editText = this.editText;
        Intrinsics.e(editText);
        savedState.f22178a = editText.getText().toString();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || !isEnabled()) {
            return super.onTouchEvent(event);
        }
        try {
            EditText editText = this.editText;
            if (editText == null) {
                return true;
            }
            editText.requestFocus();
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.editText, 0);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        EditText editText = this.editText;
        if (editText != null) {
            Intrinsics.e(editText);
            editText.setEnabled(enabled);
        }
    }

    public final void setNumDigits(int count) {
        if (this.digits != count) {
            this.digits = count;
            removeAllViews();
            a();
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(@Nullable View.OnFocusChangeListener l5) {
        this.f22153M = l5;
    }

    public final void setOnPinEnteredListener(@Nullable OnPinEnteredListener onPinEnteredListener) {
        this.onPinEnteredListener = onPinEnteredListener;
    }

    public final void setShowError(boolean z3) {
        this.isShowError = z3;
    }

    public final void setText(@Nullable Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        Editable editableSubSequence = editable;
        if (!zIsEmpty) {
            Intrinsics.e(editable);
            int length = editable.length();
            int i7 = this.digits;
            if (length > i7) {
                editableSubSequence = editable;
                editableSubSequence = editable.subSequence(0, i7);
            }
        }
        editableSubSequence = editable;
        EditText editText = this.editText;
        Intrinsics.e(editText);
        editText.setText(editableSubSequence);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankPinEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiBankPinEntryView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankPinEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mask = "*";
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.fb_PinEntryView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.digits = typedArrayObtainStyledAttributes.getInt(t.fb_PinEntryView_fb_numDigits, 4);
        this.inputType = typedArrayObtainStyledAttributes.getInt(t.fb_PinEntryView_fb_pinInputType, 2);
        this.accentType = typedArrayObtainStyledAttributes.getInt(t.fb_PinEntryView_fb_accentType, 0);
        this.f22168q0 = typedArrayObtainStyledAttributes.getBoolean(t.fb_PinEntryView_fb_hideEyesForever, false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.digitWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_PinEntryView_fb_digitWidth, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
        this.digitHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_PinEntryView_fb_digitHeight, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
        this.digitSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_PinEntryView_fb_digitSpacing, (int) TypedValue.applyDimension(1, 20.0f, displayMetrics));
        this.digitTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_PinEntryView_fb_digitTextSize, (int) TypedValue.applyDimension(2, 15.0f, displayMetrics));
        this.accentWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_PinEntryView_fb_accentWidth, (int) TypedValue.applyDimension(1, 3.0f, displayMetrics));
        this.f22171v = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_PinEntryView_fb_digitRadius, 0);
        int i10 = t.fb_PinEntryView_fb_leftMargin;
        Drawable drawable = context.getDrawable(o.fb_hide_psw);
        Intrinsics.e(drawable);
        this.f22172w = typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, drawable.getIntrinsicWidth());
        this.digitElevation = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_PinEntryView_fb_digitElevation, 0);
        Resources.Theme theme = getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.windowBackground, typedValue, true);
        this.digitBackground = typedArrayObtainStyledAttributes.getResourceId(t.fb_PinEntryView_fb_digitBackground, typedValue.resourceId);
        theme.resolveAttribute(R.attr.textColorPrimary, new TypedValue(), true);
        this.digitTextColor = typedArrayObtainStyledAttributes.getColor(t.fb_PinEntryView_fb_digitTextColor, -16777216);
        this.f22166p = typedArrayObtainStyledAttributes.getColor(t.fb_PinEntryView_fb_digitStrokeColor, -16777216);
        this.t = typedArrayObtainStyledAttributes.getColor(t.fb_PinEntryView_fb_digitSelectStrokeColor, -16776961);
        this.f22165o = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_PinEntryView_fb_digitStrokeWidth, 0);
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(p241q.a.colorAccent, typedValue2, true);
        this.accentColor = typedArrayObtainStyledAttributes.getColor(t.fb_PinEntryView_fb_pinAccentColor, typedValue2.resourceId > 0 ? getResources().getColor(typedValue2.resourceId) : typedValue2.data);
        String string = typedArrayObtainStyledAttributes.getString(t.fb_PinEntryView_fb_mask);
        if (string != null) {
            this.mask = string;
        }
        this.accentRequiresFocus = typedArrayObtainStyledAttributes.getBoolean(t.fb_PinEntryView_fb_accentRequiresFocus, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f22169r0 = true;
        setVerticalGravity(1);
        a();
    }

    public final void setText(@Nullable CharSequence value) {
        if (value != null && value.length() != 0) {
            int length = value.length();
            int i7 = this.digits;
            if (length > i7) {
                value = value.subSequence(0, i7);
            }
        }
        EditText editText = this.editText;
        Intrinsics.e(editText);
        editText.setText(value);
    }
}
