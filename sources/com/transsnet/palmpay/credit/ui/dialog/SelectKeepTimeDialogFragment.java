package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/SelectKeepTimeDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SelectKeepTimeDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f30022X = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f30023C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f30024H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f30025L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p355xf.t f30026M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Function1 f30027Q = new com.facebook.react.packagerconnection.a(17);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectKeepTimeDialogFragment newInstance(int i7, int i10, @NotNull List<CLRepaymentPlanData> repaymentPlanDataList) {
            Intrinsics.checkNotNullParameter(repaymentPlanDataList, "repaymentPlanDataList");
            SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = new SelectKeepTimeDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("selected_position", i7);
            bundle.putInt("product_type", i10);
            bundle.putSerializable("repayment_plan_list", new ArrayList(repaymentPlanDataList));
            selectKeepTimeDialogFragment.setArguments(bundle);
            return selectKeepTimeDialogFragment;
        }

        private a() {
        }
    }

    public SelectKeepTimeDialogFragment() {
        final int i7 = 0;
        this.f30023C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.h1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectKeepTimeDialogFragment f30124b;

            {
                this.f30124b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30124b;
                switch (i7) {
                    case 0:
                        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
                        return new p351xb.p((Integer) selectKeepTimeDialogFragment.f30026M.getValue(), selectKeepTimeDialogFragment.k());
                    case 1:
                        SelectKeepTimeDialogFragment.a aVar2 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments = selectKeepTimeDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getParcelableArrayList("repayment_plan_list");
                        }
                        return null;
                    case 2:
                        SelectKeepTimeDialogFragment.a aVar3 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments2 = selectKeepTimeDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return Integer.valueOf(arguments2.getInt("product_type"));
                        }
                        return null;
                    default:
                        SelectKeepTimeDialogFragment.a aVar4 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments3 = selectKeepTimeDialogFragment.getArguments();
                        if (arguments3 != null) {
                            return Integer.valueOf(arguments3.getInt("selected_position"));
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f30024H = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.h1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectKeepTimeDialogFragment f30124b;

            {
                this.f30124b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30124b;
                switch (i10) {
                    case 0:
                        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
                        return new p351xb.p((Integer) selectKeepTimeDialogFragment.f30026M.getValue(), selectKeepTimeDialogFragment.k());
                    case 1:
                        SelectKeepTimeDialogFragment.a aVar2 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments = selectKeepTimeDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getParcelableArrayList("repayment_plan_list");
                        }
                        return null;
                    case 2:
                        SelectKeepTimeDialogFragment.a aVar3 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments2 = selectKeepTimeDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return Integer.valueOf(arguments2.getInt("product_type"));
                        }
                        return null;
                    default:
                        SelectKeepTimeDialogFragment.a aVar4 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments3 = selectKeepTimeDialogFragment.getArguments();
                        if (arguments3 != null) {
                            return Integer.valueOf(arguments3.getInt("selected_position"));
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f30025L = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.h1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectKeepTimeDialogFragment f30124b;

            {
                this.f30124b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30124b;
                switch (i11) {
                    case 0:
                        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
                        return new p351xb.p((Integer) selectKeepTimeDialogFragment.f30026M.getValue(), selectKeepTimeDialogFragment.k());
                    case 1:
                        SelectKeepTimeDialogFragment.a aVar2 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments = selectKeepTimeDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getParcelableArrayList("repayment_plan_list");
                        }
                        return null;
                    case 2:
                        SelectKeepTimeDialogFragment.a aVar3 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments2 = selectKeepTimeDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return Integer.valueOf(arguments2.getInt("product_type"));
                        }
                        return null;
                    default:
                        SelectKeepTimeDialogFragment.a aVar4 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments3 = selectKeepTimeDialogFragment.getArguments();
                        if (arguments3 != null) {
                            return Integer.valueOf(arguments3.getInt("selected_position"));
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f30026M = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.h1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectKeepTimeDialogFragment f30124b;

            {
                this.f30124b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30124b;
                switch (i12) {
                    case 0:
                        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
                        return new p351xb.p((Integer) selectKeepTimeDialogFragment.f30026M.getValue(), selectKeepTimeDialogFragment.k());
                    case 1:
                        SelectKeepTimeDialogFragment.a aVar2 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments = selectKeepTimeDialogFragment.getArguments();
                        if (arguments != null) {
                            return arguments.getParcelableArrayList("repayment_plan_list");
                        }
                        return null;
                    case 2:
                        SelectKeepTimeDialogFragment.a aVar3 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments2 = selectKeepTimeDialogFragment.getArguments();
                        if (arguments2 != null) {
                            return Integer.valueOf(arguments2.getInt("product_type"));
                        }
                        return null;
                    default:
                        SelectKeepTimeDialogFragment.a aVar4 = SelectKeepTimeDialogFragment.f30022X;
                        Bundle arguments3 = selectKeepTimeDialogFragment.getArguments();
                        if (arguments3 != null) {
                            return Integer.valueOf(arguments3.getInt("selected_position"));
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_cl_select_keep_time_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = p025ba.l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(Ya.e.ivClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectKeepTimeDialogFragment f30111b;

            {
                this.f30111b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30111b;
                switch (i7) {
                    case 0:
                        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                    case 1:
                        SelectKeepTimeDialogFragment.a aVar2 = SelectKeepTimeDialogFragment.f30022X;
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                    default:
                        selectKeepTimeDialogFragment.f30027Q.invoke(selectKeepTimeDialogFragment.j().f43803a);
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                }
            }
        }, viewFindViewById);
        View viewFindViewById2 = viewF.findViewById(Ya.e.tvCancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectKeepTimeDialogFragment f30111b;

            {
                this.f30111b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30111b;
                switch (i10) {
                    case 0:
                        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                    case 1:
                        SelectKeepTimeDialogFragment.a aVar2 = SelectKeepTimeDialogFragment.f30022X;
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                    default:
                        selectKeepTimeDialogFragment.f30027Q.invoke(selectKeepTimeDialogFragment.j().f43803a);
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                }
            }
        }, viewFindViewById2);
        View viewFindViewById3 = viewF.findViewById(Ya.e.tvConfirm);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectKeepTimeDialogFragment f30111b;

            {
                this.f30111b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragment = this.f30111b;
                switch (i11) {
                    case 0:
                        SelectKeepTimeDialogFragment.a aVar = SelectKeepTimeDialogFragment.f30022X;
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                    case 1:
                        SelectKeepTimeDialogFragment.a aVar2 = SelectKeepTimeDialogFragment.f30022X;
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                    default:
                        selectKeepTimeDialogFragment.f30027Q.invoke(selectKeepTimeDialogFragment.j().f43803a);
                        selectKeepTimeDialogFragment.dismiss();
                        break;
                }
            }
        }, viewFindViewById3);
        TextView textView = (TextView) viewF.findViewById(Ya.e.tvTitle);
        LinearLayout linearLayout = (LinearLayout) viewF.findViewById(Ya.e.layoutRepayment);
        TextView textView2 = (TextView) viewF.findViewById(Ya.e.tvRepaymentType);
        TextView textView3 = (TextView) viewF.findViewById(Ya.e.tvRepaymentPeriod);
        RecyclerView recyclerView = (RecyclerView) viewF.findViewById(Ya.e.rvPeriods);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(j());
        j().setList((List) this.f30024H.getValue());
        j().addChildClickViewIds(Ya.e.ckKeepTime);
        j().setOnItemChildClickListener(new g1(this, textView3));
        j().setOnItemClickListener(new g1(this, textView3));
        Integer numK = k();
        linearLayout.setVisibility((numK != null && numK.intValue() == 1) ? 8 : 0);
        Integer numK2 = k();
        textView.setText(getString((numK2 != null && numK2.intValue() == 1) ? Ya.g.cs_cl_when_to_repay : Ya.g.cs_cl_how_long_to_keep));
        Integer numK3 = k();
        textView2.setText((numK3 != null && numK3.intValue() == 2) ? getString(Ya.g.cs_oc_spread_repayment) : getString(Ya.g.cs_cl_oneoff_settlement));
        Integer numK4 = k();
        textView3.setVisibility((numK4 == null || numK4.intValue() != 2) ? 8 : 0);
        Integer num = j().f43803a;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer numK5 = k();
        String string = "";
        if (numK5 != null && numK5.intValue() == 2 && iIntValue < j().getItemCount() && iIntValue > -1) {
            string = getString(Ya.g.cs_cl_per_period_with_unit, com.airbnb.lottie.model.layer.d.n(new Object[]{((CLRepaymentPlanData) j().getItem(iIntValue)).getTermSpan(), TextUtils.equals("D", ((CLRepaymentPlanData) j().getItem(iIntValue)).getTermSpanUnit()) ? "days" : "months"}, 2, "%d %s", "format(...)"));
        }
        textView3.setText(string);
        return baseDialog;
    }

    public final p351xb.p j() {
        return (p351xb.p) this.f30023C.getValue();
    }

    public final Integer k() {
        return (Integer) this.f30025L.getValue();
    }
}
