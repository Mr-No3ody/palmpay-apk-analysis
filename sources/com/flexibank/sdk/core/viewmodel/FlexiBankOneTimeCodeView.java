package com.flexibank.sdk.core.viewmodel;

import D.b;
import Ja.RunnableC0336i;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flexibank.sdk.core.listener.FlexiBankOnSendCodeListener;
import com.flexibank.sdk.customview.FlexiBankPinEntryView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0003QQRB)\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0013R$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R$\u0010H\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00103\u001a\u0004\bF\u00105\"\u0004\bG\u00107R$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lcom/flexibank/sdk/core/viewmodel/FlexiBankOneTimeCodeView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$OnPinEnteredListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setCodeEnteredListener", "(Lcom/flexibank/sdk/customview/FlexiBankPinEntryView$OnPinEnteredListener;)V", "", "enable", "setSendOtcButtonState", "(Z)V", "", "error", "setError", "(Ljava/lang/String;)V", "visibility", "setSendVoiceVisibility", "(I)V", "number", "setMobileNumber", "code", "setCode", "setSendVoiceButtonStateInternal", "setSendOtcButtonStateInternal", "Lcom/flexibank/sdk/customview/FlexiBankPinEntryView;", "c", "Lcom/flexibank/sdk/customview/FlexiBankPinEntryView;", "getMSmsCodeView", "()Lcom/flexibank/sdk/customview/FlexiBankPinEntryView;", "setMSmsCodeView", "(Lcom/flexibank/sdk/customview/FlexiBankPinEntryView;)V", "mSmsCodeView", "Lcom/palmpay/lib/ui/button/PpButton;", "d", "Lcom/palmpay/lib/ui/button/PpButton;", "getMTextViewSendSms", "()Lcom/palmpay/lib/ui/button/PpButton;", "setMTextViewSendSms", "(Lcom/palmpay/lib/ui/button/PpButton;)V", "mTextViewSendSms", "Landroid/view/View;", "e", "Landroid/view/View;", "getMViewError", "()Landroid/view/View;", "setMViewError", "(Landroid/view/View;)V", "mViewError", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getMTextViewError", "()Landroid/widget/TextView;", "setMTextViewError", "(Landroid/widget/TextView;)V", "mTextViewError", "g", "getMTextViewMessage", "setMTextViewMessage", "mTextViewMessage", "i", "getMViewSendVoiceCode", "setMViewSendVoiceCode", "mViewSendVoiceCode", "Lcom/flexibank/sdk/core/listener/FlexiBankOnSendCodeListener;", "o", "Lcom/flexibank/sdk/core/listener/FlexiBankOnSendCodeListener;", "getSendCodeListener", "()Lcom/flexibank/sdk/core/listener/FlexiBankOnSendCodeListener;", "setSendCodeListener", "(Lcom/flexibank/sdk/core/listener/FlexiBankOnSendCodeListener;)V", "sendCodeListener", "Ja/i", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankOneTimeCodeView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f22135p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0336i f22136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableC0336i f22137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public FlexiBankPinEntryView mSmsCodeView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public PpButton mTextViewSendSms;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public View mViewError;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public TextView mTextViewError;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public TextView mTextViewMessage;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public View mViewSendVoiceCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22144j;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public FlexiBankOnSendCodeListener sendCodeListener;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f22135p = 60000;
    }

    @JvmOverloads
    public FlexiBankOneTimeCodeView(@Nullable Context context) {
        this(context, null, 6, 0);
    }

    public static void a(FlexiBankOneTimeCodeView flexiBankOneTimeCodeView, boolean z3) {
        flexiBankOneTimeCodeView.setSendOtcButtonStateInternal(z3);
    }

    private final void setSendOtcButtonStateInternal(boolean enable) {
        PpButton ppButton = this.mTextViewSendSms;
        if (ppButton != null) {
            if (enable) {
                ppButton.removeCallbacks(this.f22136a);
                PpButton ppButton2 = this.mTextViewSendSms;
                Intrinsics.e(ppButton2);
                Context context = ppButton2.getContext();
                PpButton ppButton3 = this.mTextViewSendSms;
                Intrinsics.e(ppButton3);
                ppButton3.setText(context.getString(this.f22144j ? r.fb_resend : r.fb_send_code));
            }
            PpButton ppButton4 = this.mTextViewSendSms;
            Intrinsics.e(ppButton4);
            ppButton4.setEnabled(enable);
        }
        setSendVoiceVisibility(this.f22144j ? 0 : 4);
        setSendVoiceButtonStateInternal(enable);
    }

    private final void setSendVoiceButtonStateInternal(boolean enable) {
        View view = this.mViewSendVoiceCode;
        if (view != null) {
            Intrinsics.e(view);
            view.setEnabled(enable);
            View view2 = this.mViewSendVoiceCode;
            Intrinsics.e(view2);
            view2.setAlpha(enable ? 1.0f : 0.5f);
        }
    }

    public final void b() {
        PpButton ppButton = this.mTextViewSendSms;
        if (ppButton != null) {
            Intrinsics.e(ppButton);
            RunnableC0336i runnableC0336i = this.f22136a;
            ppButton.removeCallbacks(runnableC0336i);
            PpButton ppButton2 = this.mTextViewSendSms;
            Intrinsics.e(ppButton2);
            ppButton2.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            setSendOtcButtonStateInternal(false);
            PpButton ppButton3 = this.mTextViewSendSms;
            Intrinsics.e(ppButton3);
            ppButton3.post(runnableC0336i);
        }
    }

    @Nullable
    public final FlexiBankPinEntryView getMSmsCodeView() {
        return this.mSmsCodeView;
    }

    @Nullable
    public final TextView getMTextViewError() {
        return this.mTextViewError;
    }

    @Nullable
    public final TextView getMTextViewMessage() {
        return this.mTextViewMessage;
    }

    @Nullable
    public final PpButton getMTextViewSendSms() {
        return this.mTextViewSendSms;
    }

    @Nullable
    public final View getMViewError() {
        return this.mViewError;
    }

    @Nullable
    public final View getMViewSendVoiceCode() {
        return this.mViewSendVoiceCode;
    }

    @Nullable
    public final FlexiBankOnSendCodeListener getSendCodeListener() {
        return this.sendCodeListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        if (p.fb_textViewSendSms == v3.getId()) {
            b();
            FlexiBankOnSendCodeListener flexiBankOnSendCodeListener = this.sendCodeListener;
            if (flexiBankOnSendCodeListener != null) {
                Intrinsics.e(flexiBankOnSendCodeListener);
                flexiBankOnSendCodeListener.onSend(0, 0, null);
                return;
            }
            return;
        }
        if (p.fb_viewSendVoiceCode == v3.getId()) {
            b();
            FlexiBankOnSendCodeListener flexiBankOnSendCodeListener2 = this.sendCodeListener;
            if (flexiBankOnSendCodeListener2 != null) {
                Intrinsics.e(flexiBankOnSendCodeListener2);
                flexiBankOnSendCodeListener2.onSend(1, 0, null);
            }
        }
    }

    public final void setCode(@Nullable String code) {
        FlexiBankPinEntryView flexiBankPinEntryView;
        if (TextUtils.isEmpty(code) || !TextUtils.isDigitsOnly(code) || (flexiBankPinEntryView = this.mSmsCodeView) == null) {
            return;
        }
        Intrinsics.e(flexiBankPinEntryView);
        flexiBankPinEntryView.setText(code);
    }

    public final void setCodeEnteredListener(@Nullable FlexiBankPinEntryView.OnPinEnteredListener listener) {
        FlexiBankPinEntryView flexiBankPinEntryView = this.mSmsCodeView;
        if (flexiBankPinEntryView != null) {
            Intrinsics.e(flexiBankPinEntryView);
            flexiBankPinEntryView.setOnPinEnteredListener(listener);
        }
    }

    public final void setError(@Nullable String error) {
        TextView textView = this.mTextViewError;
        if (textView != null) {
            Intrinsics.e(textView);
            textView.setText(error);
            if (TextUtils.isEmpty(error)) {
                View view = this.mViewError;
                Intrinsics.e(view);
                view.setVisibility(4);
            } else {
                View view2 = this.mViewError;
                Intrinsics.e(view2);
                view2.setVisibility(0);
                TextView textView2 = this.mTextViewError;
                Intrinsics.e(textView2);
                textView2.postDelayed(this.f22137b, 2000L);
            }
        }
    }

    public final void setMSmsCodeView(@Nullable FlexiBankPinEntryView flexiBankPinEntryView) {
        this.mSmsCodeView = flexiBankPinEntryView;
    }

    public final void setMTextViewError(@Nullable TextView textView) {
        this.mTextViewError = textView;
    }

    public final void setMTextViewMessage(@Nullable TextView textView) {
        this.mTextViewMessage = textView;
    }

    public final void setMTextViewSendSms(@Nullable PpButton ppButton) {
        this.mTextViewSendSms = ppButton;
    }

    public final void setMViewError(@Nullable View view) {
        this.mViewError = view;
    }

    public final void setMViewSendVoiceCode(@Nullable View view) {
        this.mViewSendVoiceCode = view;
    }

    public final void setMobileNumber(@Nullable String number) {
        TextView textView;
        if (TextUtils.isEmpty(number) || (textView = this.mTextViewMessage) == null) {
            return;
        }
        textView.setText(getResources().getString(r.fb_msg_send_voice_code, J3.a.w(number)));
    }

    public final void setSendCodeListener(@Nullable FlexiBankOnSendCodeListener flexiBankOnSendCodeListener) {
        this.sendCodeListener = flexiBankOnSendCodeListener;
    }

    public final void setSendOtcButtonState(boolean enable) {
        if (Intrinsics.c(Looper.getMainLooper(), Looper.myLooper())) {
            setSendOtcButtonStateInternal(enable);
        } else {
            post(new b(this, enable, 17));
        }
    }

    public final void setSendVoiceVisibility(int visibility) {
        TextView textView = this.mTextViewMessage;
        if (textView != null) {
            Intrinsics.e(textView);
            textView.setVisibility(visibility);
        }
        View view = this.mViewSendVoiceCode;
        if (view != null) {
            Intrinsics.e(view);
            view.setVisibility(visibility);
        }
    }

    @JvmOverloads
    public FlexiBankOneTimeCodeView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ FlexiBankOneTimeCodeView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @JvmOverloads
    public FlexiBankOneTimeCodeView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        setOrientation(1);
        View.inflate(context, q.fb_layout_one_time_code_view, this);
        this.f22136a = new RunnableC0336i(this, 10);
        this.f22137b = new RunnableC0336i(this, 9);
        this.mSmsCodeView = (FlexiBankPinEntryView) findViewById(p.fb_smsCodeView);
        this.mTextViewSendSms = (PpButton) findViewById(p.fb_textViewSendSms);
        this.mViewError = findViewById(p.fb_viewError);
        this.mTextViewError = (TextView) findViewById(p.fb_textViewError);
        this.mViewSendVoiceCode = findViewById(p.fb_viewSendVoiceCode);
        this.mTextViewMessage = (TextView) findViewById(p.fb_textViewMessage);
        setSendVoiceVisibility(this.f22144j ? 0 : 4);
        PpButton ppButton = this.mTextViewSendSms;
        Intrinsics.e(ppButton);
        ppButton.setOnClickListener(this);
        View view = this.mViewSendVoiceCode;
        Intrinsics.e(view);
        view.setOnClickListener(this);
    }
}
