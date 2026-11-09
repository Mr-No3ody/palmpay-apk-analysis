package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.BasePopupWindow;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends BasePopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f30168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f30169c;

    public n1(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30167a = str;
        final int i7 = 0;
        this.f30168b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f30162b;

            {
                this.f30162b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return n1.b(this.f30162b);
                    default:
                        return n1.a(this.f30162b);
                }
            }
        });
        final int i10 = 1;
        this.f30169c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f30162b;

            {
                this.f30162b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return n1.b(this.f30162b);
                    default:
                        return n1.a(this.f30162b);
                }
            }
        });
        this.mContext = context;
        View viewInflate = LayoutInflater.from(context).inflate(Ya.f.cs_cl_popwindow_temp_quota_desc, (ViewGroup) null, false);
        this.mContentView = viewInflate;
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-2);
        setFocusable(true);
        initViews();
    }

    public static ImageView a(n1 n1Var) {
        return (ImageView) n1Var.mContentView.findViewById(Ya.e.ivClose);
    }

    public static TextView b(n1 n1Var) {
        return (TextView) n1Var.mContentView.findViewById(Ya.e.extend_content_tv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void init() {
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public final void initViews() {
        TextView textView = (TextView) this.f30168b.getValue();
        if (textView != null) {
            String str = this.f30167a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        ImageView imageView = (ImageView) this.f30169c.getValue();
        if (imageView != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 15), imageView);
        }
    }
}
