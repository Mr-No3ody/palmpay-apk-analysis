package com.transsnet.palmpay.core.viewmodel;

import Ed.ViewOnTouchListenerC0223c;
import R8.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class ModelUsePointsWithSwitch extends BaseModel {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f28424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28428g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SwitchCompat f28430j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f28431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f28432p;

    public ModelUsePointsWithSwitch(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_use_points_with_switch, this);
        this.f28424c = (LinearLayout) findViewById(e.cmup_point_used_ll);
        this.f28425d = (TextView) findViewById(e.cmup_point_num_tv);
        this.f28426e = (TextView) findViewById(e.cmup_point_unused_tv);
        this.f28427f = (TextView) findViewById(e.cmup_money_num_tv);
        this.f28428g = (TextView) findViewById(e.cmup_point_sign_tv);
        this.f28429i = (TextView) findViewById(e.cmup_money_sign_tv);
        this.f28430j = (SwitchCompat) findViewById(e.cmup_switch);
        this.f28431o = (ImageView) findViewById(e.cmup_tips_iv);
        setStateLight(true);
        this.f28429i.setText(BaseApplication.getCurrencySymbol());
        this.f28431o.setOnClickListener(new d(this, 21));
        return this;
    }

    public final void d(boolean z3) {
        this.f28430j.setChecked(z3);
        this.f28424c.setVisibility(0);
        this.f28426e.setVisibility(8);
    }

    public final void e(boolean z3, boolean z8) {
        if (!z8) {
            d(z3);
            return;
        }
        this.f28430j.setChecked(z3);
        if (this.f28430j.isChecked()) {
            this.f28424c.setVisibility(0);
            this.f28426e.setVisibility(8);
        } else {
            this.f28424c.setVisibility(8);
            this.f28426e.setVisibility(0);
        }
    }

    public final void f(long j6, String str) {
        this.f28425d.setText(j6 + "");
        this.f28427f.setText(str);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        this.f28430j.setOnCheckedChangeListener(listener);
    }

    public void setPointExchangeRate(long exchangeRate) {
        this.f28432p = exchangeRate;
    }

    public void setStateLight(boolean light) {
        int color = this.f31417a.getResources().getColor(L6.b.ppColorWarning);
        int color2 = this.f31417a.getResources().getColor(L6.b.ppColorTextPrimary);
        int color3 = this.f31417a.getResources().getColor(L6.b.ppColorTextDisable);
        if (light) {
            this.f28425d.setTextColor(color);
            this.f28428g.setTextColor(color);
            this.f28427f.setTextColor(color2);
        } else {
            this.f28425d.setTextColor(color3);
            this.f28428g.setTextColor(color3);
            this.f28427f.setTextColor(color3);
        }
    }

    public void setSwitchClickListener(Runnable r3) {
        this.f28430j.setOnTouchListener(new ViewOnTouchListenerC0223c(r3, 3));
    }

    public ModelUsePointsWithSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelUsePointsWithSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
