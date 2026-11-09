package com.transsnet.palmpay.core.ui.widget;

import Pa.r0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import p025ba.m;

/* JADX INFO: loaded from: classes3.dex */
public class DigitalKeyboardView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f28127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DigitalKeyboardClickListener f28128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28129c;

    public interface DigitalKeyboardClickListener {
        void onActionClick();

        void onDeleteClick();

        void onDigitalClick(CharSequence digital);
    }

    public DigitalKeyboardView(Context context) {
        super(context, null);
        a(context, null, 0);
    }

    private void setNumberFont(TextView... views) {
        for (TextView textView : views) {
            r0.R1(textView, "fonts/PalmPayNum-Regular.ttf");
        }
    }

    public final void a(Context context, AttributeSet attributeSet, int i7) {
        View.inflate(context, p025ba.g.core_digital_keyboard_view_layout, this);
        TextView textView = (TextView) findViewById(p025ba.e.keyboard_action);
        this.f28127a = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(p025ba.e.digit00);
        textView2.setText(TransType.TRANS_SCENE_REFUND);
        textView2.setOnClickListener(this);
        findViewById(p025ba.e.digit0).setOnClickListener(this);
        findViewById(p025ba.e.digit1).setOnClickListener(this);
        findViewById(p025ba.e.digit2).setOnClickListener(this);
        findViewById(p025ba.e.digit3).setOnClickListener(this);
        findViewById(p025ba.e.digit4).setOnClickListener(this);
        findViewById(p025ba.e.digit5).setOnClickListener(this);
        findViewById(p025ba.e.digit6).setOnClickListener(this);
        findViewById(p025ba.e.digit7).setOnClickListener(this);
        findViewById(p025ba.e.digit8).setOnClickListener(this);
        findViewById(p025ba.e.digit9).setOnClickListener(this);
        findViewById(p025ba.e.delete).setOnClickListener(this);
        setNumberFont(textView2, (TextView) findViewById(p025ba.e.digit0), (TextView) findViewById(p025ba.e.digit1), (TextView) findViewById(p025ba.e.digit2), (TextView) findViewById(p025ba.e.digit3), (TextView) findViewById(p025ba.e.digit4), (TextView) findViewById(p025ba.e.digit5), (TextView) findViewById(p025ba.e.digit6), (TextView) findViewById(p025ba.e.digit7), (TextView) findViewById(p025ba.e.digit8), (TextView) findViewById(p025ba.e.digit9));
        TextView textView3 = (TextView) findViewById(p025ba.e.point);
        this.f28129c = textView3;
        textView3.setOnClickListener(this);
        if (BaseApplication.isAO()) {
            this.f28129c.setText(",");
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.CoreKeyboard, i7, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(m.CoreKeyboard_core_confirm_key_bg);
        typedArrayObtainStyledAttributes.recycle();
        if (drawable != null) {
            this.f28127a.setBackground(drawable);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == p025ba.e.keyboard_action) {
            DigitalKeyboardClickListener digitalKeyboardClickListener = this.f28128b;
            if (digitalKeyboardClickListener != null) {
                digitalKeyboardClickListener.onActionClick();
                return;
            }
            return;
        }
        if (id2 == p025ba.e.delete) {
            DigitalKeyboardClickListener digitalKeyboardClickListener2 = this.f28128b;
            if (digitalKeyboardClickListener2 != null) {
                digitalKeyboardClickListener2.onDeleteClick();
                return;
            }
            return;
        }
        DigitalKeyboardClickListener digitalKeyboardClickListener3 = this.f28128b;
        if (digitalKeyboardClickListener3 != null) {
            digitalKeyboardClickListener3.onDigitalClick(((TextView) view).getText());
        }
    }

    public void setActionButtonEnable(boolean enable) {
        TextView textView = this.f28127a;
        if (textView != null) {
            textView.setEnabled(enable);
        }
    }

    public void setActionText(String text) {
        TextView textView = this.f28127a;
        if (textView != null) {
            textView.setText(text);
        }
    }

    public void setDigitalKeyboardClickListener(DigitalKeyboardClickListener listener) {
        this.f28128b = listener;
    }

    public DigitalKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        a(context, attrs, 0);
    }

    public DigitalKeyboardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a(context, attrs, defStyleAttr);
    }
}
