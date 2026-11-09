package Yd;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.d f11329a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, p1.d listener) {
        super(LayoutInflater.from(context).inflate(Pd.d.qt_edit_beneficiaries_popu, (ViewGroup) null), -2, -2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f11329a = listener;
        final int i7 = 0;
        p355xf.t tVarB = C2131j.b(new Function0(this) { // from class: Yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f11326b;

            {
                this.f11326b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (LinearLayout) this.f11326b.getContentView().findViewById(Pd.c.ll_beneficiary_popu_edit);
                    default:
                        return (LinearLayout) this.f11326b.getContentView().findViewById(Pd.c.ll_beneficiary_popu_delete);
                }
            }
        });
        final int i10 = 1;
        p355xf.t tVarB2 = C2131j.b(new Function0(this) { // from class: Yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f11326b;

            {
                this.f11326b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return (LinearLayout) this.f11326b.getContentView().findViewById(Pd.c.ll_beneficiary_popu_edit);
                    default:
                        return (LinearLayout) this.f11326b.getContentView().findViewById(Pd.c.ll_beneficiary_popu_delete);
                }
            }
        });
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setTouchable(true);
        setFocusable(true);
        Object value = tVarB.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i11 = 0;
        ((LinearLayout) value).setOnClickListener(new View.OnClickListener(this) { // from class: Yd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f11328b;

            {
                this.f11328b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c cVar = this.f11328b;
                        cVar.f11329a.onEdit();
                        cVar.dismiss();
                        break;
                    default:
                        c cVar2 = this.f11328b;
                        cVar2.f11329a.onDelete();
                        cVar2.dismiss();
                        break;
                }
            }
        });
        Object value2 = tVarB2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i12 = 1;
        ((LinearLayout) value2).setOnClickListener(new View.OnClickListener(this) { // from class: Yd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f11328b;

            {
                this.f11328b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c cVar = this.f11328b;
                        cVar.f11329a.onEdit();
                        cVar.dismiss();
                        break;
                    default:
                        c cVar2 = this.f11328b;
                        cVar2.f11329a.onDelete();
                        cVar2.dismiss();
                        break;
                }
            }
        });
    }
}
