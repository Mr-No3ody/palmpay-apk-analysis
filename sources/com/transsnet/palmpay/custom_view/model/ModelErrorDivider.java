package com.transsnet.palmpay.custom_view.model;

import L6.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.x;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelErrorDivider;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "getDividerView", "()Landroid/view/View;", "Landroid/widget/TextView;", "getErrorTextView", "()Landroid/widget/TextView;", "", "errorMsg", "", "setErrorMessage", "(Ljava/lang/String;)V", "", "hasFocus", "setFocus", "(Z)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelErrorDivider extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f31516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31519g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelErrorDivider(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_error_divider, this);
        this.f31515c = (TextView) findViewById(s.tv_error);
        this.f31516d = findViewById(s.v_divider);
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: getDividerView, reason: from getter */
    public final View getF31516d() {
        return this.f31516d;
    }

    @Nullable
    /* JADX INFO: renamed from: getErrorTextView, reason: from getter */
    public final TextView getF31515c() {
        return this.f31515c;
    }

    public final void setErrorMessage(@Nullable String errorMsg) {
        if (TextUtils.isEmpty(errorMsg)) {
            TextView textView = this.f31515c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.f31516d;
            if (view != null) {
                view.setBackgroundColor(this.f31517e);
                return;
            }
            return;
        }
        TextView textView2 = this.f31515c;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.f31515c;
        if (textView3 != null) {
            textView3.setText(errorMsg);
        }
        View view2 = this.f31516d;
        if (view2 != null) {
            view2.setBackgroundColor(this.f31518f);
        }
    }

    public final void setFocus(boolean hasFocus) {
        if (hasFocus) {
            View view = this.f31516d;
            if (view != null) {
                view.setBackgroundColor(this.f31519g);
                return;
            }
            return;
        }
        View view2 = this.f31516d;
        if (view2 != null) {
            view2.setBackgroundColor(this.f31517e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelErrorDivider(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelErrorDivider(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelErrorDivider(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31517e = getContext().getColor(b.ppColorDividerLineDark);
        this.f31518f = getContext().getColor(b.ppColorError);
        this.f31519g = getContext().getColor(b.ppColorTextPrimary);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.cv_error_divider, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        typedArrayObtainStyledAttributes.getText(x.cv_error_divider_cv_error_message);
        this.f31517e = typedArrayObtainStyledAttributes.getColor(x.cv_error_divider_cv_divider_normal_color, getContext().getColor(b.ppColorDividerLine));
        this.f31518f = typedArrayObtainStyledAttributes.getColor(x.cv_error_divider_cv_divider_error_color, getContext().getColor(b.ppColorError));
        this.f31519g = typedArrayObtainStyledAttributes.getColor(x.cv_error_divider_cv_divider_focus_color, getContext().getColor(b.ppColorTextPrimary));
        typedArrayObtainStyledAttributes.recycle();
    }
}
