package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.b;
import Sc.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class P2PEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f33002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f33003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f33004c;

    public P2PEmptyView(@NonNull Context context) {
        this(context, null);
    }

    public void setImg(int i7) {
        this.f33002a.setImageResource(i7);
    }

    public void setTx1(String str) {
        this.f33003b.setText(str);
    }

    public void setTx2(String str) {
        this.f33004c.setText(str);
    }

    public P2PEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public P2PEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        View.inflate(context, c.p2p_empty_view_layout, this);
        this.f33002a = (ImageView) findViewById(b.p2p_img);
        this.f33003b = (TextView) findViewById(b.p2p_txt1);
        this.f33004c = (TextView) findViewById(b.p2p_txt2);
    }
}
