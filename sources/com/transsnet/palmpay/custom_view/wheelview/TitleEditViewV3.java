package com.transsnet.palmpay.custom_view.wheelview;

import L6.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.x;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0019B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/custom_view/wheelview/TitleEditViewV3;", "Lcom/transsnet/palmpay/custom_view/TitleEditView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", ReactTextInputShadowNode.PROP_TEXT, "", "setEditText", "(Ljava/lang/String;)V", "Lcom/transsnet/palmpay/custom_view/wheelview/TitleEditViewV3$OnErrorViewVisibleListener;", "A0", "Lcom/transsnet/palmpay/custom_view/wheelview/TitleEditViewV3$OnErrorViewVisibleListener;", "getErrorListener", "()Lcom/transsnet/palmpay/custom_view/wheelview/TitleEditViewV3$OnErrorViewVisibleListener;", "setErrorListener", "(Lcom/transsnet/palmpay/custom_view/wheelview/TitleEditViewV3$OnErrorViewVisibleListener;)V", "errorListener", "OnErrorViewVisibleListener", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TitleEditViewV3 extends TitleEditView {

    /* JADX INFO: renamed from: A0, reason: collision with root package name and from kotlin metadata */
    public OnErrorViewVisibleListener errorListener;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final boolean f31716z0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/custom_view/wheelview/TitleEditViewV3$OnErrorViewVisibleListener;", "", "onErrorViewVisible", "", ViewProps.VISIBLE, "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnErrorViewVisibleListener {
        void onErrorViewVisible(boolean visible);
    }

    public TitleEditViewV3(@Nullable Context context) {
        this(context, null);
    }

    @Override // com.transsnet.palmpay.custom_view.TitleEditView
    public final void d(CharSequence charSequence) {
        Drawable background;
        Drawable drawableMutate;
        Drawable background2;
        if (this.f31171p0) {
            if (TextUtils.isEmpty(charSequence)) {
                this.f31170p.setVisibility(8);
                OnErrorViewVisibleListener onErrorViewVisibleListener = this.errorListener;
                if (onErrorViewVisibleListener != null) {
                    onErrorViewVisibleListener.onErrorViewVisible(false);
                }
                AppCompatEditText appCompatEditText = this.f31165g;
                if (appCompatEditText == null || (background2 = appCompatEditText.getBackground()) == null) {
                    return;
                }
                background2.setColorFilter(null);
                return;
            }
            this.f31170p.setVisibility(0);
            this.t.setText(charSequence);
            AppCompatEditText appCompatEditText2 = this.f31165g;
            if (appCompatEditText2 != null && (background = appCompatEditText2.getBackground()) != null && (drawableMutate = background.mutate()) != null) {
                drawableMutate.setColorFilter(getContext().getColor(b.ppColorError), PorterDuff.Mode.SRC_ATOP);
            }
            OnErrorViewVisibleListener onErrorViewVisibleListener2 = this.errorListener;
            if (onErrorViewVisibleListener2 != null) {
                onErrorViewVisibleListener2.onErrorViewVisible(true);
            }
        }
    }

    @Nullable
    public final OnErrorViewVisibleListener getErrorListener() {
        return this.errorListener;
    }

    @Override // com.transsnet.palmpay.custom_view.TitleEditView, android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        setTitle(this.f31152A);
        TextView textView = this.f31166i;
        if (textView != null) {
            textView.setVisibility(this.f31716z0 ? 0 : 8);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.TitleEditView
    public void setEditText(@Nullable String text) {
        super.setEditText(text);
        TextView textView = this.f31166i;
        if (textView != null) {
            textView.setVisibility(this.f31716z0 ? 0 : 8);
        }
    }

    public final void setErrorListener(@Nullable OnErrorViewVisibleListener onErrorViewVisibleListener) {
        this.errorListener = onErrorViewVisibleListener;
    }

    public TitleEditViewV3(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleEditViewV3(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31716z0 = true;
        TypedArray typedArrayObtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, x.CvTitleEditView, i7, 0) : null;
        boolean z3 = typedArrayObtainStyledAttributes != null ? typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_show_title, true) : true;
        this.f31716z0 = z3;
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
        }
        TextView textView = this.f31166i;
        if (textView != null) {
            textView.setVisibility(z3 ? 0 : 8);
        }
        this.f31170p.setVisibility(8);
        OnErrorViewVisibleListener onErrorViewVisibleListener = this.errorListener;
        if (onErrorViewVisibleListener != null) {
            onErrorViewVisibleListener.onErrorViewVisible(false);
        }
    }
}
