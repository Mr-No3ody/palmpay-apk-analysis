package com.transsnet.palmpay.core.viewmodel;

import Pa.i0;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
public class KeyboardGridLayout extends GridLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public NumKeyboardClickListener f28221u0;

    public interface NumKeyboardClickListener {
        void onDeleteClick();

        void onNumClick(String num);
    }

    public KeyboardGridLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void setupButtons(View view) {
        i0.h0(view, Color.parseColor("#ffffff"), Color.parseColor("#e5e5e5"), 8);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == e.digit_del) {
            NumKeyboardClickListener numKeyboardClickListener = this.f28221u0;
            if (numKeyboardClickListener != null) {
                numKeyboardClickListener.onDeleteClick();
                return;
            }
            return;
        }
        NumKeyboardClickListener numKeyboardClickListener2 = this.f28221u0;
        if (numKeyboardClickListener2 != null) {
            numKeyboardClickListener2.onNumClick(((TextView) view).getText().toString());
        }
    }

    public void setNumKeyboardClickListener(NumKeyboardClickListener listener) {
        this.f28221u0 = listener;
        findViewById(e.digit_0).setOnClickListener(this);
        findViewById(e.digit_1).setOnClickListener(this);
        findViewById(e.digit_2).setOnClickListener(this);
        findViewById(e.digit_3).setOnClickListener(this);
        findViewById(e.digit_4).setOnClickListener(this);
        findViewById(e.digit_5).setOnClickListener(this);
        findViewById(e.digit_6).setOnClickListener(this);
        findViewById(e.digit_7).setOnClickListener(this);
        findViewById(e.digit_8).setOnClickListener(this);
        findViewById(e.digit_9).setOnClickListener(this);
        findViewById(e.digit_del).setOnClickListener(this);
    }
}
