package com.transsnet.palmpay.core.viewmodel;

import Ed.ViewOnFocusChangeListenerC0235o;
import Pa.r0;
import R8.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import p025ba.m;

/* JADX INFO: loaded from: classes3.dex */
public class ModelEnterPhoneNumber1 extends BaseModel {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f28342v = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditText f28343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f28344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CallBack f28346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f28347g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f28348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f28349j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f28351p;
    public boolean t;

    public interface CallBack {
        void onNumberEditing(String num);

        void onNumberInputComplete(String num);
    }

    public ModelEnterPhoneNumber1(Context context) {
        this(context, null, 0);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.CorePhoneNumberItem, i7, 0);
        this.f28351p = typedArrayObtainStyledAttributes.getBoolean(m.CorePhoneNumberItem_core_show_title_hint, true);
        this.t = typedArrayObtainStyledAttributes.getBoolean(m.CorePhoneNumberItem_core_use_touch_clear, false);
        typedArrayObtainStyledAttributes.recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_layout_enterphone_num1, this);
        this.f28343c = (EditText) findViewById(s.lepn_num_input_et);
        this.f28344d = (ImageView) findViewById(s.lepn_contact_tv);
        this.f28345e = (TextView) findViewById(s.lepn_title_hint_tv);
        this.f28347g = (ImageView) findViewById(s.lepn_clear_tv);
        this.f28348i = (ImageView) findViewById(s.lepn_new_tv);
        this.f28349j = findViewById(s.cle_bottom_line);
        this.f28345e.setVisibility(this.f28351p ? 0 : 8);
        this.f28350o = true;
        r0.R1(this.f28343c, "fonts/PalmPayNum-Bold.ttf");
        if (this.t) {
            this.f28347g.setOnTouchListener(new G7.m(this, 1));
        } else {
            this.f28347g.setOnClickListener(new d(this, 18));
        }
        this.f28343c.addTextChangedListener(new b(this));
        this.f28343c.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 7));
        return this;
    }

    public final void d(boolean z3) {
        if (TextUtils.isEmpty(this.f28343c.getText().toString())) {
            this.f28347g.setVisibility(8);
            this.f28344d.setVisibility(0);
            this.f28348i.setVisibility(0);
        } else if (z3) {
            this.f28347g.setVisibility(8);
            this.f28344d.setVisibility(0);
            this.f28348i.setVisibility(0);
        } else {
            this.f28347g.setVisibility(0);
            this.f28344d.setVisibility(8);
            this.f28348i.setVisibility(8);
        }
    }

    public String getPhoneNumInput() {
        return this.f28343c.getText().toString().replace(" ", "");
    }

    public void setCallBack(CallBack callBack) {
        this.f28346f = callBack;
    }

    public ModelEnterPhoneNumber1(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ModelEnterPhoneNumber1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
