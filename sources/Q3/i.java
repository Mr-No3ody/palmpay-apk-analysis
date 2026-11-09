package Q3;

import Hb.L;
import Pa.b0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p215o4.b implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f7607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f7608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f7609g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f7610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f7611j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f7613p;
    public final ArrayList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FlexiBankCashierPaymentMethodBean f7614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FlexiBankCashierSelectPayMethodDialog$CallBack f7615w;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Context context) {
        int i7 = s.fb_BaseDialogTheme;
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        super(context, 0, i7);
        this.f7607e = C2131j.b(new Function0(this) { // from class: Q3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f7605b;

            {
                this.f7605b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.f7605b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (ImageView) this.f7605b.findViewById(p.fb_cdspm_close_iv);
                    default:
                        return (TextView) this.f7605b.findViewById(p.fb_cdspm_title_tv);
                }
            }
        });
        final int i11 = 1;
        this.f7608f = C2131j.b(new Function0(this) { // from class: Q3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f7605b;

            {
                this.f7605b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return this.f7605b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (ImageView) this.f7605b.findViewById(p.fb_cdspm_close_iv);
                    default:
                        return (TextView) this.f7605b.findViewById(p.fb_cdspm_title_tv);
                }
            }
        });
        final int i12 = 2;
        this.f7609g = C2131j.b(new Function0(this) { // from class: Q3.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f7605b;

            {
                this.f7605b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.f7605b.findViewById(p.fb_viewRoot);
                    case 1:
                        return (ImageView) this.f7605b.findViewById(p.fb_cdspm_close_iv);
                    default:
                        return (TextView) this.f7605b.findViewById(p.fb_cdspm_title_tv);
                }
            }
        });
        this.f7610i = C2131j.b(new L(3, this, context));
        this.f7611j = C2131j.b(new b0(2));
        this.f7613p = C2131j.b(new b0(3));
        this.t = new ArrayList();
    }

    @Override // p215o4.b
    public final void a() {
        ViewTreeObserver viewTreeObserver;
        TextView textView;
        setContentView(q.fb_dialog_cashier_select_payment_method);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        t tVar = this.f7609g;
        if (!zIsEmpty && (textView = (TextView) tVar.getValue()) != null) {
            textView.setText((CharSequence) null);
        }
        RecyclerView recyclerView = (RecyclerView) this.f7610i.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(c());
        }
        M3.e eVarC = c();
        M1.j.addFooterView$default(eVarC, (FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem) eVarC.f5758f.getValue(), 0, 0, 6, null);
        t tVar2 = eVarC.f5758f;
        ((FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem) tVar2.getValue()).setVisibility(0);
        ((FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem) tVar2.getValue()).d();
        c().f5757e = new h(this);
        p215o4.b.b(this, getWindow());
        TextView textView2 = (TextView) tVar.getValue();
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        ImageView imageView = (ImageView) this.f7608f.getValue();
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        View view = (View) this.f7607e.getValue();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new Be.c(this, 4));
    }

    public final M3.e c() {
        return (M3.e) this.f7611j.getValue();
    }

    @Override // p215o4.b, android.view.View.OnClickListener
    public final void onClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        if (v3.getId() == p.fb_cdspm_close_iv) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        M3.e eVarC = c();
        if (eVarC.hasHeaderLayout()) {
            eVarC.removeAllHeaderView();
        }
        c().getClass();
        c().f5755c = this.f7612o;
        c().setList((List) this.f7613p.getValue());
        M3.e eVarC2 = c();
        ArrayList addablePaymentMethods = this.t;
        eVarC2.getClass();
        Intrinsics.checkNotNullParameter(addablePaymentMethods, "addablePaymentMethods");
        ArrayList arrayList = eVarC2.f5756d;
        arrayList.clear();
        arrayList.addAll(addablePaymentMethods);
        ((FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem) eVarC2.f5758f.getValue()).d();
        FlexiBankCashierPaymentMethodBean selectMethod = this.f7614v;
        if (selectMethod != null) {
            M3.e eVarC3 = c();
            eVarC3.getClass();
            Intrinsics.checkNotNullParameter(selectMethod, "selectMethod");
            eVarC3.f5754b = selectMethod;
        }
    }
}
