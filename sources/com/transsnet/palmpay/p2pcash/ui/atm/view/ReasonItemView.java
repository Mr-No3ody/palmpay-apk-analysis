package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.b;
import Sc.c;
import Uc.I0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class ReasonItemView extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33044e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f33046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Listener f33048d;

    public interface Listener {
        void onSelect(String str);
    }

    public ReasonItemView(@NonNull Context context) {
        this(context, null);
    }

    public void setListener(Listener listener) {
        this.f33048d = listener;
    }

    public void setReason(String str) {
        this.f33047c = str;
        this.f33045a.setText(str);
    }

    public ReasonItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReasonItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        View.inflate(context, c.p2p_reason_item_layout, this);
        this.f33045a = (TextView) findViewById(b.p2p_reason);
        this.f33046b = (ImageView) findViewById(b.p2p_selector);
        setOnClickListener(new I0(this, 24));
    }
}
