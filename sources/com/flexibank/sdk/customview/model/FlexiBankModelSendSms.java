package com.flexibank.sdk.customview.model;

import R3.e;
import V9.ViewOnFocusChangeListenerC0713b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.t;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001&B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/flexibank/sdk/customview/model/FlexiBankModelSendSms;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getMTitleTv", "()Landroid/widget/TextView;", "setMTitleTv", "(Landroid/widget/TextView;)V", "mTitleTv", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "getMEditText", "()Landroid/widget/EditText;", "setMEditText", "(Landroid/widget/EditText;)V", "mEditText", "c", "getMSendSmsTv", "setMSendSmsTv", "mSendSmsTv", "", "e", "Z", "getMZoomOuted", "()Z", "setMZoomOuted", "(Z)V", "mZoomOuted", "Callback", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelSendSms extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public TextView mTitleTv;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public EditText mEditText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public TextView mSendSmsTv;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f22265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean mZoomOuted;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22267f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/flexibank/sdk/customview/model/FlexiBankModelSendSms$Callback;", "", "onTextTvClick", "", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void onTextTvClick();
    }

    @JvmOverloads
    public FlexiBankModelSendSms(@Nullable Context context) {
        this(context, null, 6, 0);
    }

    @Nullable
    public final EditText getMEditText() {
        return this.mEditText;
    }

    @Nullable
    public final TextView getMSendSmsTv() {
        return this.mSendSmsTv;
    }

    @Nullable
    public final TextView getMTitleTv() {
        return this.mTitleTv;
    }

    public final boolean getMZoomOuted() {
        return this.mZoomOuted;
    }

    public final void setMEditText(@Nullable EditText editText) {
        this.mEditText = editText;
    }

    public final void setMSendSmsTv(@Nullable TextView textView) {
        this.mSendSmsTv = textView;
    }

    public final void setMTitleTv(@Nullable TextView textView) {
        this.mTitleTv = textView;
    }

    public final void setMZoomOuted(boolean z3) {
        this.mZoomOuted = z3;
    }

    @JvmOverloads
    public FlexiBankModelSendSms(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ FlexiBankModelSendSms(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public FlexiBankModelSendSms(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22267f = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.fb_TitleEditView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f22265d = typedArrayObtainStyledAttributes.getText(t.fb_TitleEditView_fb_te_title);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, q.fb_send_sms, this);
        this.mTitleTv = (TextView) findViewById(p.fb_tt_title_tv);
        this.mEditText = (EditText) findViewById(p.fb_tt_et);
        TextView textView = (TextView) findViewById(p.fb_tt_send_sms_text);
        this.mSendSmsTv = textView;
        Intrinsics.e(textView);
        textView.setEnabled(false);
        if (!TextUtils.isEmpty(this.f22265d)) {
            TextView textView2 = this.mTitleTv;
            Intrinsics.e(textView2);
            textView2.setText(this.f22265d);
        }
        TextView textView3 = this.mTitleTv;
        Intrinsics.e(textView3);
        textView3.setPivotX(0.0f);
        TextView textView4 = this.mTitleTv;
        Intrinsics.e(textView4);
        textView4.setPivotY(0.0f);
        EditText editText = this.mEditText;
        Intrinsics.e(editText);
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0713b(this, 5));
        EditText editText2 = this.mEditText;
        Intrinsics.e(editText2);
        editText2.addTextChangedListener(new e(this, 16));
    }
}
