package com.flexibank.sdk.customview;

import C0.G;
import Ed.ViewOnTouchListenerC0223c;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.flexibank.sdk.m;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.t;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.Nullable;
import p141j9.B;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003jklB)\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u0018J\u0017\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010\u0014J\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0011¢\u0006\u0004\b*\u0010\u0014J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\u000eR$\u00104\u001a\u0004\u0018\u00010-8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010=\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010E\u001a\u0004\u0018\u00010>8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010I\u001a\u0004\u0018\u0001058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R$\u0010O\u001a\u0004\u0018\u00010\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\u0018R\"\u0010U\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\u0014R(\u0010Y\u001a\u0004\u0018\u00010\u00152\b\u0010V\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010M\"\u0004\bX\u0010\u0018R(\u0010\\\u001a\u0004\u0018\u00010\u00152\b\u0010V\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010\u0018R(\u0010`\u001a\u0004\u0018\u00010\u00192\b\u0010V\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u001cR$\u0010e\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010\u000eR\u0013\u0010i\u001a\u0004\u0018\u00010f8F¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006m"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankTitleEditView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "type", "", "setInputType", "(I)V", "gravity", "setGravity", "", ViewProps.VISIBLE, "setCursorVisible", "(Z)V", "", "error", "setError", "(Ljava/lang/CharSequence;)V", "", "desc", "setDesc", "(Ljava/lang/String;)V", "setInfo", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawableLeft", "(Landroid/graphics/drawable/Drawable;)V", "setDrawableRight", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDrawableRightClickListener", "(Landroid/view/View$OnClickListener;)V", ViewProps.ENABLED, "setEnabled", "show", "setShowClearButton", ViewProps.COLOR, "setTextColor", "Landroidx/appcompat/widget/AppCompatEditText;", "g", "Landroidx/appcompat/widget/AppCompatEditText;", "getMEditTextInput", "()Landroidx/appcompat/widget/AppCompatEditText;", "setMEditTextInput", "(Landroidx/appcompat/widget/AppCompatEditText;)V", "mEditTextInput", "Landroid/widget/TextView;", "value", "i", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "setTitleView", "(Landroid/widget/TextView;)V", "titleView", "Landroid/view/View;", "o", "Landroid/view/View;", "getMErrorView", "()Landroid/view/View;", "setMErrorView", "(Landroid/view/View;)V", "mErrorView", "p", "getMTextViewError", "setMTextViewError", "mTextViewError", "w", "Ljava/lang/CharSequence;", "getMTitle", "()Ljava/lang/CharSequence;", "setMTitle", "mTitle", "k0", "Z", "getMShowErrorText", "()Z", "setMShowErrorText", "mShowErrorText", ReactTextInputShadowNode.PROP_TEXT, "getHint", "setHint", "hint", "getTitle", "setTitle", "title", "getEditText", "()Ljava/lang/String;", "setEditText", "editText", "length", "getMaxLength", "()I", "setMaxLength", "maxLength", "Landroid/widget/EditText;", "getEditTextView", "()Landroid/widget/EditText;", "editTextView", "OnTextInputListener", "CallBack", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankTitleEditView extends LinearLayout implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f22193w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f22194x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f22195y0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CharSequence f22196A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f22197B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f22198C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f22199H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f22200L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f22201M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final boolean f22202Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public AppCompatEditText mEditTextInput;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public TextView titleView;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f22211j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public boolean mShowErrorText;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public View mErrorView;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public TextView mTextViewError;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f22215p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Drawable f22216q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Drawable f22217r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f22218s0;
    public final TextView t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TextWatcher f22219t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View.OnClickListener f22220u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f22221v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final B f22222v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public CharSequence mTitle;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankTitleEditView$CallBack;", "", "onFocusChange", "", "v", "Landroid/view/View;", "hasFocus", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onFocusChange(@Nullable View v3, boolean hasFocus);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/customview/FlexiBankTitleEditView$OnTextInputListener;", "", "OnTextInput", "", ReactTextInputShadowNode.PROP_TEXT, "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnTextInputListener {
        void OnTextInput(@Nullable String text);
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
        Intrinsics.checkNotNullExpressionValue("FlexiBankTitleEditView", "getSimpleName(...)");
        f22193w0 = "FlexiBankTitleEditView";
        f22194x0 = SizeUtils.dp2px(36.0f);
        f22195y0 = -100;
    }

    @JvmOverloads
    public FlexiBankTitleEditView(@Nullable Context context) {
        this(context, null, 6, 0);
    }

    public final void a(TextView textView) {
        if (textView == null) {
            return;
        }
        String string = textView.getText().toString();
        textView.setText(G.i("* ").setForegroundColor(this.f22203a).append(string).setForegroundColor(textView.getTextColors().getDefaultColor()).create());
    }

    public final void b(EditText editText) {
        if (editText == null) {
            return;
        }
        if (!this.f22215p0 || !editText.isFocused()) {
            editText.setCompoundDrawables(this.f22217r0, null, this.f22216q0, null);
            return;
        }
        try {
            Drawable drawable = editText.getContext().getDrawable(o.fb_circle_gray_cross);
            Intrinsics.e(drawable);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            String string = editText.getEditableText().toString();
            Drawable drawable2 = this.f22217r0;
            if (TextUtils.isEmpty(string)) {
                drawable = this.f22216q0;
            }
            editText.setCompoundDrawables(drawable2, null, drawable, null);
        } catch (Exception e10) {
            Log.e(f22193w0, "updateDrawableRight: ", e10);
        }
    }

    public final void c(CharSequence charSequence) {
        if (this.mShowErrorText) {
            if (TextUtils.isEmpty(charSequence)) {
                View view = this.mErrorView;
                Intrinsics.e(view);
                view.setVisibility(8);
                AppCompatEditText appCompatEditText = this.mEditTextInput;
                Intrinsics.e(appCompatEditText);
                if (appCompatEditText.getBackground() != null) {
                    AppCompatEditText appCompatEditText2 = this.mEditTextInput;
                    Intrinsics.e(appCompatEditText2);
                    appCompatEditText2.getBackground().setColorFilter(null);
                    return;
                }
                return;
            }
            AppCompatEditText appCompatEditText3 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText3);
            if (appCompatEditText3.getBackground() != null) {
                AppCompatEditText appCompatEditText4 = this.mEditTextInput;
                Intrinsics.e(appCompatEditText4);
                appCompatEditText4.getBackground().mutate().setColorFilter(getContext().getColor(m.fb_text_color_red5), PorterDuff.Mode.SRC_ATOP);
            }
            View view2 = this.mErrorView;
            Intrinsics.e(view2);
            view2.setVisibility(0);
            TextView textView = this.mTextViewError;
            Intrinsics.e(textView);
            textView.setText(charSequence);
        }
    }

    public final void d(int i7) {
        TextView textView = this.f22211j;
        Intrinsics.e(textView);
        textView.setVisibility(i7);
        if (TextUtils.isEmpty(this.f22196A)) {
            return;
        }
        if (i7 == 0) {
            AppCompatEditText appCompatEditText = this.mEditTextInput;
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setHintTextColor(0);
        } else {
            AppCompatEditText appCompatEditText2 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText2);
            appCompatEditText2.setHintTextColor(this.f22207e);
        }
    }

    public final void e(int i7) {
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText == null) {
            return;
        }
        int i10 = this.f22198C;
        if (1 == i10 || i10 == 131072) {
            appCompatEditText.setFilters(new InputFilter[]{new Tb.c(i7, 1), new p246q4.b()});
        } else {
            appCompatEditText.setFilters(new InputFilter[]{new Tb.c(i7, 1)});
        }
    }

    @Nullable
    public final String getEditText() {
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            String strValueOf = String.valueOf(appCompatEditText.getText());
            if (!TextUtils.isEmpty(strValueOf)) {
                return this.f22199H == 5 ? y.k(strValueOf, " ", "") : strValueOf;
            }
        }
        return "";
    }

    @Nullable
    public final EditText getEditTextView() {
        return this.mEditTextInput;
    }

    @Nullable
    public final CharSequence getHint() {
        TextView textView = this.f22211j;
        if (textView == null) {
            return "";
        }
        Intrinsics.e(textView);
        return textView.getText();
    }

    @Nullable
    public final AppCompatEditText getMEditTextInput() {
        return this.mEditTextInput;
    }

    @Nullable
    public final View getMErrorView() {
        return this.mErrorView;
    }

    public final boolean getMShowErrorText() {
        return this.mShowErrorText;
    }

    @Nullable
    public final TextView getMTextViewError() {
        return this.mTextViewError;
    }

    @Nullable
    public final CharSequence getMTitle() {
        return this.mTitle;
    }

    /* JADX INFO: renamed from: getMaxLength, reason: from getter */
    public final int getF22218s0() {
        return this.f22218s0;
    }

    @Nullable
    public final CharSequence getTitle() {
        TextView textView = this.titleView;
        if (textView == null) {
            return "";
        }
        Intrinsics.e(textView);
        return textView.getText();
    }

    @Nullable
    public final TextView getTitleView() {
        return this.titleView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            appCompatEditText.removeCallbacks(this.f22222v0);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        setTitle(this.mTitle);
        if (!this.f22221v) {
            TextView textView = this.titleView;
            Intrinsics.e(textView);
            textView.setVisibility(0);
            return;
        }
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        Intrinsics.e(appCompatEditText);
        if (!TextUtils.isEmpty(appCompatEditText.getText())) {
            d(8);
            TextView textView2 = this.titleView;
            Intrinsics.e(textView2);
            textView2.setVisibility(0);
            return;
        }
        Property property = LinearLayout.ALPHA;
        Property property2 = LinearLayout.TRANSLATION_Y;
        int i7 = f22194x0;
        if (!z3) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.titleView, (Property<TextView, Float>) property2, 0.0f, i7);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.titleView, (Property<TextView, Float>) property, 1.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new AccelerateInterpolator());
            animatorSet.addListener(new p168l4.b(this, 0));
            animatorSet.start();
            return;
        }
        TextView textView3 = this.titleView;
        Intrinsics.e(textView3);
        float f10 = i7;
        textView3.setTranslationY(f10);
        TextView textView4 = this.titleView;
        Intrinsics.e(textView4);
        float translationY = textView4.getTranslationY();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.titleView, (Property<TextView, Float>) property2, translationY, translationY - f10);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.titleView, (Property<TextView, Float>) property, 0.0f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        animatorSet2.setInterpolator(new AccelerateInterpolator());
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new p168l4.b(this, 1));
        animatorSet2.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22200L) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setCursorVisible(boolean visible) {
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setCursorVisible(visible);
        }
    }

    public final void setDesc(@Nullable String desc) {
        TextView textView = this.t;
        if (textView != null) {
            Intrinsics.e(textView);
            textView.setVisibility(0);
            TextView textView2 = this.t;
            Intrinsics.e(textView2);
            textView2.setText(desc);
        }
    }

    public final void setDrawableLeft(@Nullable Drawable drawable) {
        this.f22217r0 = drawable;
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setCompoundDrawables(this.f22217r0, null, this.f22216q0, null);
        }
    }

    public final void setDrawableRight(@Nullable Drawable drawable) {
        this.f22216q0 = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setCompoundDrawables(this.f22217r0, null, this.f22216q0, null);
        }
    }

    public final void setDrawableRightClickListener(@Nullable View.OnClickListener listener) {
        this.f22220u0 = listener;
    }

    public final void setEditText(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setText(str);
            try {
                if (!TextUtils.isEmpty(str)) {
                    AppCompatEditText appCompatEditText2 = this.mEditTextInput;
                    Intrinsics.e(appCompatEditText2);
                    AppCompatEditText appCompatEditText3 = this.mEditTextInput;
                    Intrinsics.e(appCompatEditText3);
                    Editable text = appCompatEditText3.getText();
                    Intrinsics.e(text);
                    appCompatEditText2.setSelection(text.length());
                }
            } catch (Exception e10) {
                Log.e(f22193w0, "setEditText: ", e10);
            }
        }
        TextView textView = this.titleView;
        if (textView == null || this.f22211j == null || this.mEditTextInput == null) {
            return;
        }
        if (!this.f22221v) {
            Intrinsics.e(textView);
            textView.setVisibility(0);
            d(8);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AppCompatEditText appCompatEditText4 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText4);
            if (!appCompatEditText4.isFocused()) {
                TextView textView2 = this.titleView;
                Intrinsics.e(textView2);
                textView2.setVisibility(4);
                d(0);
                return;
            }
        }
        TextView textView3 = this.titleView;
        Intrinsics.e(textView3);
        textView3.setVisibility(0);
        d(8);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        this.f22200L = enabled;
        if (enabled) {
            AppCompatEditText appCompatEditText = this.mEditTextInput;
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setFocusable(true);
            AppCompatEditText appCompatEditText2 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText2);
            appCompatEditText2.setFocusableInTouchMode(true);
            AppCompatEditText appCompatEditText3 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText3);
            appCompatEditText3.setCursorVisible(true);
        } else {
            AppCompatEditText appCompatEditText4 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText4);
            appCompatEditText4.setFocusable(false);
            AppCompatEditText appCompatEditText5 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText5);
            appCompatEditText5.setFocusableInTouchMode(false);
            AppCompatEditText appCompatEditText6 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText6);
            appCompatEditText6.setCursorVisible(false);
        }
        AppCompatEditText appCompatEditText7 = this.mEditTextInput;
        Intrinsics.e(appCompatEditText7);
        appCompatEditText7.setEnabled(enabled);
        setTitle(this.mTitle);
    }

    public final void setError(@Nullable CharSequence error) {
        this.f22197B = error;
        c(error);
        this.f22197B = "";
        TextView textView = this.mTextViewError;
        if (textView != null) {
            Intrinsics.e(textView);
            textView.setTextColor(getResources().getColor(m.fb_base_color_fail));
        }
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int gravity) {
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setGravity(gravity);
        }
    }

    public final void setHint(@Nullable CharSequence charSequence) {
        TextView textView = this.f22211j;
        if (textView != null) {
            Intrinsics.e(textView);
            textView.setText(charSequence);
            AppCompatEditText appCompatEditText = this.mEditTextInput;
            Intrinsics.e(appCompatEditText);
            d(TextUtils.isEmpty(appCompatEditText.getText()) ? 0 : 8);
            if (this.f22201M) {
                a(this.f22211j);
            }
        }
    }

    public final void setInfo(@Nullable CharSequence error) {
        setError(error);
        TextView textView = this.mTextViewError;
        if (textView != null) {
            Intrinsics.e(textView);
            textView.setTextColor(getResources().getColor(m.fb_text_color_gray2));
        }
    }

    public final void setInputType(int type) {
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setInputType(type);
        }
    }

    public final void setMEditTextInput(@Nullable AppCompatEditText appCompatEditText) {
        this.mEditTextInput = appCompatEditText;
    }

    public final void setMErrorView(@Nullable View view) {
        this.mErrorView = view;
    }

    public final void setMShowErrorText(boolean z3) {
        this.mShowErrorText = z3;
    }

    public final void setMTextViewError(@Nullable TextView textView) {
        this.mTextViewError = textView;
    }

    public final void setMTitle(@Nullable CharSequence charSequence) {
        this.mTitle = charSequence;
    }

    public final void setMaxLength(int i7) {
        if (i7 != this.f22218s0) {
            e(i7);
        }
        this.f22218s0 = i7;
    }

    public final void setShowClearButton(boolean show) {
        this.f22215p0 = show;
        b(this.mEditTextInput);
    }

    public final void setTextColor(int color) {
        AppCompatEditText appCompatEditText = this.mEditTextInput;
        if (appCompatEditText != null) {
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setTextColor(color);
        }
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        TextView textView = this.titleView;
        if (textView != null) {
            this.mTitle = charSequence;
            Intrinsics.e(textView);
            textView.setText(charSequence);
            TextView textView2 = this.titleView;
            Intrinsics.e(textView2);
            AppCompatEditText appCompatEditText = this.mEditTextInput;
            Intrinsics.e(appCompatEditText);
            boolean zHasFocus = appCompatEditText.hasFocus();
            boolean z3 = this.f22202Q;
            int i7 = this.f22206d;
            if (!z3) {
                if (!this.f22200L) {
                    i7 = this.f22205c;
                } else if (zHasFocus) {
                    i7 = this.f22204b;
                }
            }
            textView2.setTextColor(i7);
            if (this.f22201M) {
                a(this.titleView);
            }
            if (TextUtils.isEmpty(this.f22196A)) {
                setHint(this.mTitle);
            }
        }
    }

    public final void setTitleView(@Nullable TextView textView) {
        this.titleView = textView;
    }

    @JvmOverloads
    public FlexiBankTitleEditView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ FlexiBankTitleEditView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public FlexiBankTitleEditView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22221v = true;
        this.f22218s0 = 50;
        this.f22222v0 = new B(this, 4);
        c cVar = new c(this);
        this.f22203a = getContext().getResources().getColor(m.fb_base_color_fail);
        this.f22206d = getContext().getResources().getColor(m.fb_text_color_black1);
        this.f22204b = getContext().getResources().getColor(m.fb_text_color_purple);
        int color = getContext().getResources().getColor(m.fb_text_color_gray11_c0c3c8);
        this.f22205c = color;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.fb_TitleEditView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mTitle = typedArrayObtainStyledAttributes.getText(t.fb_TitleEditView_fb_te_title);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(t.fb_TitleEditView_fb_te_text_size, SizeUtils.dp2px(14.0f));
        int i10 = typedArrayObtainStyledAttributes.getInt(t.fb_TitleEditView_fb_te_title_color, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(t.fb_TitleEditView_fb_te_hint_color, color);
        this.f22207e = i11;
        int i12 = typedArrayObtainStyledAttributes.getInt(t.fb_TitleEditView_fb_te_no_focus_title_color, 0);
        this.f22208f = i12;
        if (i10 != 0) {
            this.f22206d = i10;
        }
        if (typedArrayObtainStyledAttributes.hasValue(t.fb_TitleEditView_fb_te_no_focus_title_color)) {
            this.f22205c = i12;
        }
        CharSequence text = typedArrayObtainStyledAttributes.getText(t.fb_TitleEditView_fb_te_hint);
        this.f22196A = text;
        int i13 = typedArrayObtainStyledAttributes.getInt(t.fb_TitleEditView_fb_te_inputType, 0);
        this.f22199H = i13;
        int i14 = f22195y0;
        switch (i13) {
            case 0:
            case 5:
                this.f22198C = 2;
                break;
            case 1:
                this.f22198C = 18;
                break;
            case 2:
                this.f22198C = 524289;
                break;
            case 3:
                this.f22198C = 131072;
                break;
            case 4:
                this.f22198C = 32;
                break;
            case 6:
                this.f22198C = i14;
                break;
        }
        this.f22201M = typedArrayObtainStyledAttributes.getBoolean(t.fb_TitleEditView_fb_te_required, false);
        this.f22202Q = typedArrayObtainStyledAttributes.getBoolean(t.fb_TitleEditView_fb_te_always_show_title_color, false);
        this.f22218s0 = typedArrayObtainStyledAttributes.getInteger(t.fb_TitleEditView_fb_max_length, Integer.MAX_VALUE);
        this.f22200L = typedArrayObtainStyledAttributes.getBoolean(t.fb_TitleEditView_fb_te_enable, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(t.fb_TitleEditView_fb_set_same_text_size, false);
        this.mShowErrorText = typedArrayObtainStyledAttributes.getBoolean(t.fb_TitleEditView_fb_te_error_text, true);
        this.f22215p0 = typedArrayObtainStyledAttributes.getBoolean(t.fb_TitleEditView_fb_te_show_clear_button, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(t.fb_TitleEditView_fb_te_collapse, true);
        this.f22221v = z8;
        this.f22216q0 = typedArrayObtainStyledAttributes.getDrawable(t.fb_TitleEditView_fb_te_drawable_right);
        setOrientation(1);
        View.inflate(context, q.fb_layout_title_input, this);
        TextView textView = (TextView) findViewById(p.fb_TextViewHint);
        this.f22211j = textView;
        Intrinsics.e(textView);
        textView.setTextColor(i11);
        this.titleView = (TextView) findViewById(p.fb_TextViewTitle);
        this.mErrorView = findViewById(p.fb_viewError);
        this.mTextViewError = (TextView) findViewById(p.fb_textViewErrorText);
        this.t = (TextView) findViewById(p.fb_tvBillerviewDesc);
        this.mEditTextInput = (AppCompatEditText) findViewById(p.fb_EditTextInput);
        if (!this.mShowErrorText) {
            View view = this.mErrorView;
            Intrinsics.e(view);
            view.setVisibility(8);
        }
        int i15 = this.f22198C;
        if (i15 != i14) {
            AppCompatEditText appCompatEditText = this.mEditTextInput;
            Intrinsics.e(appCompatEditText);
            appCompatEditText.setInputType(i15);
        }
        AppCompatEditText appCompatEditText2 = this.mEditTextInput;
        Intrinsics.e(appCompatEditText2);
        appCompatEditText2.setSupportBackgroundTintList(getResources().getColorStateList(m.fb_edit_underline_color));
        AppCompatEditText appCompatEditText3 = this.mEditTextInput;
        Intrinsics.e(appCompatEditText3);
        appCompatEditText3.setOnFocusChangeListener(this);
        if (i15 == 131072) {
            AppCompatEditText appCompatEditText4 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText4);
            appCompatEditText4.setHorizontallyScrolling(false);
            AppCompatEditText appCompatEditText5 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText5);
            appCompatEditText5.setSingleLine(false);
        }
        setTitle(this.mTitle);
        if (TextUtils.isEmpty(text)) {
            setHint(this.mTitle);
        } else {
            setHint(text);
            if (!Intrinsics.c(text, this.mTitle)) {
                AppCompatEditText appCompatEditText6 = this.mEditTextInput;
                Intrinsics.e(appCompatEditText6);
                appCompatEditText6.setHintTextColor(0);
                AppCompatEditText appCompatEditText7 = this.mEditTextInput;
                Intrinsics.e(appCompatEditText7);
                appCompatEditText7.setHint(text);
            }
        }
        e(this.f22218s0);
        if (i15 == 131072) {
            AppCompatEditText appCompatEditText8 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText8);
            AppCompatEditText appCompatEditText9 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText9);
            int paddingLeft = appCompatEditText9.getPaddingLeft();
            AppCompatEditText appCompatEditText10 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText10);
            int iDp2px = SizeUtils.dp2px(3.0f) + appCompatEditText10.getPaddingTop();
            AppCompatEditText appCompatEditText11 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText11);
            int paddingRight = appCompatEditText11.getPaddingRight();
            AppCompatEditText appCompatEditText12 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText12);
            appCompatEditText8.setPadding(paddingLeft, iDp2px, paddingRight, SizeUtils.dp2px(3.0f) + appCompatEditText12.getPaddingBottom());
        }
        AppCompatEditText appCompatEditText13 = this.mEditTextInput;
        Intrinsics.e(appCompatEditText13);
        appCompatEditText13.addTextChangedListener(cVar);
        setEnabled(this.f22200L);
        AppCompatEditText appCompatEditText14 = this.mEditTextInput;
        Intrinsics.e(appCompatEditText14);
        appCompatEditText14.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 9));
        Drawable drawable = this.f22216q0;
        if (drawable != null) {
            Intrinsics.e(drawable);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            Drawable drawable2 = this.f22216q0;
            Intrinsics.e(drawable2);
            drawable.setBounds(0, 0, intrinsicWidth, drawable2.getIntrinsicHeight());
            AppCompatEditText appCompatEditText15 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText15);
            appCompatEditText15.setCompoundDrawables(this.f22217r0, null, this.f22216q0, null);
        }
        if (!z8) {
            d(8);
            TextView textView2 = this.titleView;
            Intrinsics.e(textView2);
            textView2.setVisibility(0);
            AppCompatEditText appCompatEditText16 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText16);
            appCompatEditText16.setHint(text);
        }
        if (typedArrayObtainStyledAttributes.hasValue(t.fb_TitleEditView_fb_te_text_color)) {
            AppCompatEditText appCompatEditText17 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText17);
            appCompatEditText17.setTextColor(typedArrayObtainStyledAttributes.getColor(t.fb_TitleEditView_fb_te_text_color, -16777216));
        }
        AppCompatEditText appCompatEditText18 = this.mEditTextInput;
        Intrinsics.e(appCompatEditText18);
        float f10 = dimensionPixelSize;
        appCompatEditText18.setTextSize(0, f10);
        if (z3) {
            TextView textView3 = this.f22211j;
            Intrinsics.e(textView3);
            textView3.setTextSize(0, f10);
        }
        if (!z8) {
            AppCompatEditText appCompatEditText19 = this.mEditTextInput;
            Intrinsics.e(appCompatEditText19);
            appCompatEditText19.setHintTextColor(i11);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
