package p351xb;

import Kb.h;
import Pa.r0;
import Ya.f;
import Ya.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.InsSingleRepaymentPlanDetail;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CLBorrowResultActivity f43781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f43782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CLBorrowResultActivity context, ArrayList data) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f43781d = context;
        this.f43782e = data;
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f43781d).inflate(f.cs_cl_borrow_result_plan_item, parent, false);
        Intrinsics.e(viewInflate);
        return new i(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        i iVar = (i) holder;
        InsSingleRepaymentPlanDetail insSingleRepaymentPlanDetail = (InsSingleRepaymentPlanDetail) this.f43782e.get(i7);
        int i10 = i7 + 1;
        iVar.f43775a.setText(String.valueOf(i10));
        Long outstandingAmount = insSingleRepaymentPlanDetail.getOutstandingAmount();
        iVar.f43776b.setText(r0.B(outstandingAmount != null ? outstandingAmount.longValue() : 0L, true));
        int i11 = g.cs_cl_installment_due_on;
        Long repaymentDate = insSingleRepaymentPlanDetail.getRepaymentDate();
        iVar.f43777c.setText(this.f4991a.getString(i11, r0.X1(Long.valueOf(repaymentDate != null ? repaymentDate.longValue() : 0L), "dd/MM")));
        List list = this.f4992b;
        int size = list.size();
        ProgressBar progressBar = iVar.f43778d;
        progressBar.setMax(size);
        progressBar.setProgress(i10);
        View view = iVar.f43780f;
        View view2 = iVar.f43779e;
        if (i7 == 0) {
            view2.setVisibility(4);
            view.setVisibility(0);
        } else if (i7 == list.size() - 1) {
            view2.setVisibility(0);
            view.setVisibility(4);
        } else {
            view2.setVisibility(0);
            view.setVisibility(0);
        }
    }
}
