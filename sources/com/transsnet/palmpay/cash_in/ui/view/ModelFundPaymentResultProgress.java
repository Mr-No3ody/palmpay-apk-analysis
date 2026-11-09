package com.transsnet.palmpay.cash_in.ui.view;

import I9.d;
import I9.e;
import I9.f;
import I9.g;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import p366y9.b;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
public class ModelFundPaymentResultProgress extends BaseModel {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f27074g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f27075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ModelPaymentResultProgress.OnClaimRewardListener f27076j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f27077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f27078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f27079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f27080f;

    public ModelFundPaymentResultProgress(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        setOrientation(1);
        View.inflate(context, c.ci_model_payment_result_progress, this);
        return this;
    }

    public final void d(String str) {
        TextView textView;
        f fVar = this.f27079e;
        if (fVar != null) {
            fVar.a(8);
        }
        g gVar = this.f27077c;
        if (gVar != null) {
            gVar.a(8);
        }
        if (this.f27078d == null) {
            ((ViewStub) findViewById(p025ba.e.failStub)).inflate();
            View viewFindViewById = findViewById(p025ba.e.viewFailRoot);
            e eVar = new e(viewFindViewById, 0);
            eVar.f4283e = (TextView) viewFindViewById.findViewById(b.tvFailMsg);
            eVar.f4284f = (TextView) viewFindViewById.findViewById(b.cm_fail_title);
            this.f27078d = eVar;
        }
        TextView textView2 = this.f27078d.f4283e;
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (!TextUtils.isEmpty(null) && (textView = this.f27078d.f4284f) != null) {
            textView.setText((CharSequence) null);
        }
        this.f27078d.a(0);
    }

    public TextView getFailAmountView() {
        e eVar = this.f27078d;
        if (eVar != null) {
            return eVar.f4277c;
        }
        return null;
    }

    public TextView getPendingAmountView() {
        f fVar = this.f27079e;
        if (fVar != null) {
            return fVar.f4277c;
        }
        return null;
    }

    public TextView getSuccessAmountView() {
        g gVar = this.f27077c;
        if (gVar != null) {
            return gVar.f4277c;
        }
        return null;
    }

    public void setAmount(long j6) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        g gVar = this.f27077c;
        if (gVar != null && (textView3 = gVar.f4277c) != null) {
            textView3.setText(r0.B(j6, true));
        }
        f fVar = this.f27079e;
        if (fVar != null && (textView2 = fVar.f4277c) != null) {
            textView2.setText(r0.B(j6, true));
        }
        e eVar = this.f27078d;
        if (eVar == null || (textView = eVar.f4277c) == null) {
            return;
        }
        textView.setText(r0.B(j6, true));
    }

    public void setOnClaimRewardListener(ModelPaymentResultProgress.OnClaimRewardListener onClaimRewardListener) {
        f27076j = onClaimRewardListener;
    }

    public void setTransType(String str) {
        f27074g = str;
    }

    public ModelFundPaymentResultProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModelFundPaymentResultProgress(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
