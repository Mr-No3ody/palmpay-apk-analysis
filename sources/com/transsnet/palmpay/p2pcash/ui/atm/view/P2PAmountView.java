package com.transsnet.palmpay.p2pcash.ui.atm.view;

import L6.b;
import Pa.r0;
import Sc.c;
import Sc.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.android.arouter.utils.Consts;

/* JADX INFO: loaded from: classes4.dex */
public class P2PAmountView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32990c;

    public P2PAmountView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Context context = this.f32988a;
        if (action == 0) {
            this.f32989b.setTextColor(context.getColor(b.ppColorPrimary));
        } else if (action == 1 || action == 3) {
            this.f32989b.setTextColor(context.getColor(b.ppColorTextPrimary));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAmount(long j6) {
        String strB = r0.B(j6, true);
        this.f32990c = strB;
        this.f32989b.setText(strB.substring(0, strB.indexOf(Consts.DOT)));
    }

    public P2PAmountView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public P2PAmountView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f32988a = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.P2PAmountView);
            this.f32990c = typedArrayObtainStyledAttributes.getString(f.P2PAmountView_p2p_text);
            typedArrayObtainStyledAttributes.recycle();
        }
        View.inflate(context, c.p2p_amount_view_layout, this);
        TextView textView = (TextView) findViewById(Sc.b.p2p_txt);
        this.f32989b = textView;
        textView.setText(this.f32990c);
    }
}
