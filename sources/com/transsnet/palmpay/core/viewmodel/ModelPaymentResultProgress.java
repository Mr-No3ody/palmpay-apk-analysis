package com.transsnet.palmpay.core.viewmodel;

import C9.ViewOnClickListenerC0150q;
import I9.d;
import Pa.r0;
import Ua.C0624e0;
import Ua.f0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.util.SpanUtils;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class ModelPaymentResultProgress extends BaseModel {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f28400g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f28401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static OnClaimRewardListener f28402j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0624e0 f28403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0624e0 f28404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0 f28405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f28406f;

    public interface OnClaimRewardListener {
        void onClaimRewardButtonClick();

        void onCountDownFinished();
    }

    public ModelPaymentResultProgress(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        setOrientation(1);
        View.inflate(context, g.core_model_payment_result_progress, this);
        return this;
    }

    public final void d(String str) {
        TextView textView;
        f0 f0Var = this.f28405e;
        if (f0Var != null) {
            f0Var.a(8);
        }
        C0624e0 c0624e0 = this.f28403c;
        if (c0624e0 != null) {
            c0624e0.a(8);
        }
        if (this.f28404d == null) {
            ((ViewStub) findViewById(e.failStub)).inflate();
            View viewFindViewById = findViewById(e.viewFailRoot);
            C0624e0 c0624e1 = new C0624e0(viewFindViewById, 1);
            c0624e1.f9396e = (TextView) viewFindViewById.findViewById(e.tvFailMsg);
            c0624e1.f9397f = (TextView) viewFindViewById.findViewById(e.cm_fail_title);
            this.f28404d = c0624e1;
        }
        TextView textView2 = this.f28404d.f9396e;
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (!TextUtils.isEmpty(null) && (textView = this.f28404d.f9397f) != null) {
            textView.setText((CharSequence) null);
        }
        this.f28404d.a(0);
    }

    public final void e(long j6, String str) {
        C0624e0 c0624e0 = this.f28404d;
        if (c0624e0 != null) {
            c0624e0.a(8);
        }
        C0624e0 c0624e1 = this.f28403c;
        if (c0624e1 != null) {
            c0624e1.a(8);
        }
        if (this.f28405e == null) {
            ((ViewStub) findViewById(e.pendingStub)).inflate();
            this.f28405e = new f0(this, findViewById(e.viewPendingRoot));
        }
        this.f28405e.b(j6);
        f0 f0Var = this.f28405e;
        f0Var.getClass();
        boolean zIsNG = BaseApplication.isNG();
        TextView textView = f0Var.f9401f;
        if (!zIsNG) {
            f0Var.f9400e.setText(k.core_pending);
            textView.setText("");
        } else if (!TextUtils.isEmpty(str)) {
            if (j6 > 0) {
                SpanUtils spanUtilsAppend = new SpanUtils().append(str).append(" ");
                int i7 = k.core_view_overtime_rewards;
                Context context = f0Var.f4278d;
                textView.setText(spanUtilsAppend.append(context.getString(i7)).setForegroundColor(context.getColor(L6.b.ppColorPrimary)).create());
                textView.setOnClickListener(new ViewOnClickListenerC0150q(str, 1));
            } else {
                textView.setOnClickListener(null);
                textView.setText(str);
                F6.d.h("debug_tag", 3, "4 tvPendingMsg. setText, pendingMessage:" + str);
            }
        }
        this.f28405e.a(0);
    }

    public final void f(long j6, String str, String str2) {
        f28401i = str;
        C0624e0 c0624e0 = this.f28404d;
        if (c0624e0 != null) {
            c0624e0.a(8);
        }
        C0624e0 c0624e1 = this.f28403c;
        if (c0624e1 != null) {
            c0624e1.a(8);
        }
        if (this.f28405e == null) {
            ((ViewStub) findViewById(e.pendingStub)).inflate();
            this.f28405e = new f0(this, findViewById(e.viewPendingRoot));
        }
        this.f28405e.b(j6);
        f0 f0Var = this.f28405e;
        f0Var.getClass();
        boolean zIsNG = BaseApplication.isNG();
        TextView textView = f0Var.f9401f;
        if (!zIsNG) {
            f0Var.f9400e.setText(k.core_pending);
            textView.setText("");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            if (j6 - System.currentTimeMillis() > 0) {
                textView.setOnClickListener(null);
                textView.setText(str2);
                F6.d.h("debug_tag", 3, "5 tvPendingMsg. setText, pendingCountDownTips:" + str2);
            } else if (TextUtils.equals(f28400g, "01")) {
                textView.setOnClickListener(null);
                textView.setText(str);
            } else {
                SpanUtils spanUtilsAppend = new SpanUtils().append(str).append(" ");
                int i7 = k.core_view_overtime_rewards;
                Context context = f0Var.f4278d;
                SpannableStringBuilder spannableStringBuilderCreate = spanUtilsAppend.append(context.getString(i7)).setForegroundColor(context.getColor(L6.b.ppColorPrimary)).create();
                textView.setText(spannableStringBuilderCreate);
                F6.d.h("debug_tag", 3, "6 tvPendingMsg. setText, pendingMessage: " + ((Object) spannableStringBuilderCreate));
                textView.setOnClickListener(new K8.a(29));
            }
        }
        this.f28405e.a(0);
    }

    public final void g(String str) {
        TextView textView;
        C0624e0 c0624e0 = this.f28404d;
        if (c0624e0 != null) {
            c0624e0.a(8);
        }
        f0 f0Var = this.f28405e;
        if (f0Var != null) {
            f0Var.a(8);
        }
        if (this.f28403c == null) {
            ((ViewStub) findViewById(e.successStub)).inflate();
            View viewFindViewById = findViewById(e.viewSuccessRoot);
            C0624e0 c0624e1 = new C0624e0(viewFindViewById, 1);
            c0624e1.f9396e = (TextView) viewFindViewById.findViewById(e.cm_desc_tv);
            c0624e1.f9397f = (TextView) viewFindViewById.findViewById(e.tv_award_point);
            this.f28403c = c0624e1;
        }
        if (!TextUtils.isEmpty(str) && (textView = this.f28403c.f9396e) != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        this.f28403c.a(0);
    }

    public TextView getFailAmountView() {
        C0624e0 c0624e0 = this.f28404d;
        if (c0624e0 != null) {
            return c0624e0.f4277c;
        }
        return null;
    }

    public TextView getPendingAmountView() {
        f0 f0Var = this.f28405e;
        if (f0Var != null) {
            return f0Var.f4277c;
        }
        return null;
    }

    public TextView getSuccessAmountView() {
        C0624e0 c0624e0 = this.f28403c;
        if (c0624e0 != null) {
            return c0624e0.f4277c;
        }
        return null;
    }

    public void setAmount(long amount) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        C0624e0 c0624e0 = this.f28403c;
        if (c0624e0 != null && (textView3 = c0624e0.f4277c) != null) {
            textView3.setText(r0.B(amount, true));
        }
        f0 f0Var = this.f28405e;
        if (f0Var != null && (textView2 = f0Var.f4277c) != null) {
            textView2.setText(r0.B(amount, true));
        }
        C0624e0 c0624e1 = this.f28404d;
        if (c0624e1 == null || (textView = c0624e1.f4277c) == null) {
            return;
        }
        textView.setText(r0.B(amount, true));
    }

    public void setOnClaimRewardListener(OnClaimRewardListener claimRewardListener) {
        f28402j = claimRewardListener;
    }

    public void setTransType(String transType) {
        f28400g = transType;
    }

    public ModelPaymentResultProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelPaymentResultProgress(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
