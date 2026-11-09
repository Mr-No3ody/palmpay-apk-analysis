package com.transsnet.palmpay.custom_view.model;

import R3.e;
import V9.ViewOnFocusChangeListenerC0713b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.x;

/* JADX INFO: loaded from: classes4.dex */
public class ModelSendSms extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f31581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f31582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f31583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31584g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Callback f31585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31586j;

    public interface Callback {
        void onTextTvClick();
    }

    public ModelSendSms(Context context) {
        super(context);
        this.f31584g = false;
        this.f31586j = true;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvTitleEditView, i7, 0);
        this.f31583f = typedArrayObtainStyledAttributes.getText(x.CvTitleEditView_cv_te_title);
        typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_required, true);
        typedArrayObtainStyledAttributes.recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_send_sms, this);
        this.f31580c = (TextView) findViewById(s.tt_title_tv);
        this.f31581d = (EditText) findViewById(s.tt_et);
        TextView textView = (TextView) findViewById(s.tt_send_sms_text);
        this.f31582e = textView;
        textView.setEnabled(false);
        if (!TextUtils.isEmpty(this.f31583f)) {
            this.f31580c.setText(this.f31583f);
        }
        this.f31580c.setPivotX(0.0f);
        this.f31580c.setPivotY(0.0f);
        this.f31581d.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0713b(this, 2));
        this.f31581d.addTextChangedListener(new e(this, 9));
        return this;
    }

    public void setCallback(Callback callback) {
        this.f31585i = callback;
    }

    public void setNeedInputPhoneNumber(boolean z3) {
        this.f31586j = z3;
        if (z3) {
            return;
        }
        this.f31582e.setEnabled(true);
    }

    public ModelSendSms(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31584g = false;
        this.f31586j = true;
    }

    public ModelSendSms(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31584g = false;
        this.f31586j = true;
    }
}
