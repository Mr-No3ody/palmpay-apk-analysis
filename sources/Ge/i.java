package Ge;

import Ce.N;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f3402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f3403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f3404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, N listener) {
        super(LayoutInflater.from(context).inflate(Ac.f.main_layout_home_giveaway_more, (ViewGroup) null), -2, -2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f3402a = listener;
        final int i7 = 0;
        t tVarB = C2131j.b(new Function0(this) { // from class: Ge.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f3399b;

            {
                this.f3399b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView1);
                    case 1:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView2);
                    case 2:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView3);
                    case 3:
                        return this.f3399b.getContentView().findViewById(Ac.e.line1);
                    default:
                        return this.f3399b.getContentView().findViewById(Ac.e.line2);
                }
            }
        });
        final int i10 = 1;
        t tVarB2 = C2131j.b(new Function0(this) { // from class: Ge.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f3399b;

            {
                this.f3399b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView1);
                    case 1:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView2);
                    case 2:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView3);
                    case 3:
                        return this.f3399b.getContentView().findViewById(Ac.e.line1);
                    default:
                        return this.f3399b.getContentView().findViewById(Ac.e.line2);
                }
            }
        });
        this.f3403b = tVarB2;
        final int i11 = 2;
        t tVarB3 = C2131j.b(new Function0(this) { // from class: Ge.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f3399b;

            {
                this.f3399b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView1);
                    case 1:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView2);
                    case 2:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView3);
                    case 3:
                        return this.f3399b.getContentView().findViewById(Ac.e.line1);
                    default:
                        return this.f3399b.getContentView().findViewById(Ac.e.line2);
                }
            }
        });
        final int i12 = 3;
        t tVarB4 = C2131j.b(new Function0(this) { // from class: Ge.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f3399b;

            {
                this.f3399b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView1);
                    case 1:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView2);
                    case 2:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView3);
                    case 3:
                        return this.f3399b.getContentView().findViewById(Ac.e.line1);
                    default:
                        return this.f3399b.getContentView().findViewById(Ac.e.line2);
                }
            }
        });
        final int i13 = 4;
        t tVarB5 = C2131j.b(new Function0(this) { // from class: Ge.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f3399b;

            {
                this.f3399b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView1);
                    case 1:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView2);
                    case 2:
                        return this.f3399b.getContentView().findViewById(Ac.e.itemView3);
                    case 3:
                        return this.f3399b.getContentView().findViewById(Ac.e.line1);
                    default:
                        return this.f3399b.getContentView().findViewById(Ac.e.line2);
                }
            }
        });
        this.f3404c = tVarB5;
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setTouchable(true);
        setFocusable(true);
        Object value = tVarB.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i14 = 0;
        ((View) value).setOnClickListener(new View.OnClickListener(this) { // from class: Ge.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f3401b;

            {
                this.f3401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        i iVar = this.f3401b;
                        N n10 = iVar.f3402a;
                        Intrinsics.e(view);
                        n10.invoke(view, 0);
                        iVar.dismiss();
                        break;
                    case 1:
                        i iVar2 = this.f3401b;
                        N n11 = iVar2.f3402a;
                        Intrinsics.e(view);
                        n11.invoke(view, 1);
                        iVar2.dismiss();
                        break;
                    default:
                        i iVar3 = this.f3401b;
                        N n12 = iVar3.f3402a;
                        Intrinsics.e(view);
                        n12.invoke(view, 2);
                        iVar3.dismiss();
                        break;
                }
            }
        });
        Object value2 = tVarB2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i15 = 1;
        ((View) value2).setOnClickListener(new View.OnClickListener(this) { // from class: Ge.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f3401b;

            {
                this.f3401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        i iVar = this.f3401b;
                        N n10 = iVar.f3402a;
                        Intrinsics.e(view);
                        n10.invoke(view, 0);
                        iVar.dismiss();
                        break;
                    case 1:
                        i iVar2 = this.f3401b;
                        N n11 = iVar2.f3402a;
                        Intrinsics.e(view);
                        n11.invoke(view, 1);
                        iVar2.dismiss();
                        break;
                    default:
                        i iVar3 = this.f3401b;
                        N n12 = iVar3.f3402a;
                        Intrinsics.e(view);
                        n12.invoke(view, 2);
                        iVar3.dismiss();
                        break;
                }
            }
        });
        Object value3 = tVarB3.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i16 = 2;
        ((View) value3).setOnClickListener(new View.OnClickListener(this) { // from class: Ge.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f3401b;

            {
                this.f3401b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        i iVar = this.f3401b;
                        N n10 = iVar.f3402a;
                        Intrinsics.e(view);
                        n10.invoke(view, 0);
                        iVar.dismiss();
                        break;
                    case 1:
                        i iVar2 = this.f3401b;
                        N n11 = iVar2.f3402a;
                        Intrinsics.e(view);
                        n11.invoke(view, 1);
                        iVar2.dismiss();
                        break;
                    default:
                        i iVar3 = this.f3401b;
                        N n12 = iVar3.f3402a;
                        Intrinsics.e(view);
                        n12.invoke(view, 2);
                        iVar3.dismiss();
                        break;
                }
            }
        });
        Object value4 = tVarB5.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((View) value4).setBackgroundColor(CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, context));
        Object value5 = tVarB4.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((View) value5).setBackgroundColor(CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, context));
    }
}
