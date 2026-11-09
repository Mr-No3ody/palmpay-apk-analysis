package p351xb;

import Kb.h;
import Pa.r0;
import Ya.d;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.ui.dialog.CLBorrowDateDisableDialog;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckedTextView f43825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f43826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, ArrayList data, int i7, int i10) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f43823d = i7;
        this.f43824e = i10;
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_cl_repayment_count_item, parent, false);
        Intrinsics.e(viewInflate);
        return new x(viewInflate);
    }

    @Override // Kb.h
    public final void c(final RecyclerView.ViewHolder holder, final int i7) {
        String string;
        Intrinsics.checkNotNullParameter(holder, "holder");
        x xVar = (x) holder;
        final CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) this.f4992b.get(i7);
        CheckedTextView checkedTextView = xVar.f43822b;
        int i10 = this.f43824e;
        if (i10 == 2) {
            String term = cLRepaymentPlanData.getTerm();
            int i11 = term != null ? Integer.parseInt(term) : 0;
            Context context = this.f4991a;
            string = i11 > 1 ? context.getString(g.cs_cl_selected_pay_in_num, cLRepaymentPlanData.getTerm(), "s") : context.getString(g.cs_cl_selected_pay_in_num, cLRepaymentPlanData.getTerm(), "");
        } else if (i10 != 3) {
            string = r0.X1(cLRepaymentPlanData.getRepaymentDate(), "dd MMM, yyyy");
        } else {
            string = cLRepaymentPlanData.getLoanDays() + " Days";
        }
        checkedTextView.setText(string);
        int i12 = this.f43823d;
        View view = xVar.f43821a;
        CheckedTextView checkedTextView2 = xVar.f43822b;
        if (i12 == i7) {
            checkedTextView2.setEnabled(true);
            checkedTextView2.setChecked(true);
            if (view != null) {
                view.setBackgroundResource(d.cs_corner_4_bg_00a49a);
            }
            if (checkedTextView2 != null) {
                checkedTextView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            this.f43825f = checkedTextView2;
            this.f43826g = view;
        } else if (Intrinsics.c(cLRepaymentPlanData.getAvailable(), Boolean.FALSE)) {
            checkedTextView2.setEnabled(false);
            checkedTextView2.setChecked(false);
            if (view != null) {
                view.setBackgroundResource(d.cs_corner_4_bg_e7e7e7_stroke_1_color_ececec);
            }
            if (checkedTextView2 != null) {
                checkedTextView2.setCompoundDrawablesWithIntrinsicBounds(d.cs_cl_repayment_date_locked_icon, 0, 0, 0);
            }
        } else {
            checkedTextView2.setEnabled(true);
            checkedTextView2.setChecked(false);
            if (view != null) {
                view.setBackgroundResource(d.cs_corner_4_bg_ffffff_stroke_1_color_ececec);
            }
            if (checkedTextView2 != null) {
                checkedTextView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        p220oa.h.l(new View.OnClickListener() { // from class: xb.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13;
                int i14;
                CLRepaymentPlanData cLRepaymentPlanData2 = cLRepaymentPlanData;
                boolean zC = Intrinsics.c(cLRepaymentPlanData2.getAvailable(), Boolean.TRUE);
                y yVar = this;
                if (!zC || (i13 = yVar.f43823d) == (i14 = i7)) {
                    if (Intrinsics.c(cLRepaymentPlanData2.getAvailable(), Boolean.FALSE)) {
                        new CLBorrowDateDisableDialog(yVar.f4991a).show();
                        return;
                    }
                    return;
                }
                RecyclerView.ViewHolder viewHolder = holder;
                if (i13 != -1) {
                    CheckedTextView checkedTextView3 = yVar.f43825f;
                    if (checkedTextView3 != null) {
                        checkedTextView3.setChecked(false);
                    }
                    View view3 = yVar.f43826g;
                    CheckedTextView checkedTextView4 = ((x) viewHolder).f43822b;
                    if (view3 != null) {
                        view3.setBackgroundResource(d.cs_corner_4_bg_ffffff_stroke_1_color_ececec);
                    }
                    if (checkedTextView4 != null) {
                        checkedTextView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }
                }
                x xVar2 = (x) viewHolder;
                xVar2.f43822b.setEnabled(true);
                CheckedTextView checkedTextView5 = xVar2.f43822b;
                checkedTextView5.setChecked(true);
                View view4 = xVar2.f43821a;
                if (view4 != null) {
                    view4.setBackgroundResource(d.cs_corner_4_bg_00a49a);
                }
                checkedTextView5.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                yVar.f43825f = checkedTextView5;
                yVar.f43826g = view4;
                yVar.f43823d = i14;
                OnRvItemClickListener onRvItemClickListener = yVar.f4993c;
                if (onRvItemClickListener != null) {
                    View itemView = viewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    onRvItemClickListener.onItemClick(itemView, i14);
                }
            }
        }, view);
    }

    @Override // Kb.h, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4992b.size();
    }
}
