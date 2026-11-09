package D9;

import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.cash_in.bean.response.BankCashInInstructionBean;
import com.transsnet.palmpay.cash_in.bean.response.InstructionTextItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Kb.c {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        String str;
        InstructionTextItem instructionTextItem;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof g) {
            g gVar = (g) holder;
            BankCashInInstructionBean bankCashInInstructionBean = (BankCashInInstructionBean) getItem(i7);
            String str2 = null;
            if (bankCashInInstructionBean != null) {
                gVar.getClass();
                str = bankCashInInstructionBean.bankIcon1;
            } else {
                str = null;
            }
            r0.l1(str, gVar.f1724d);
            TextView textView = gVar.f1725e;
            if (textView != null) {
                if (bankCashInInstructionBean != null && (instructionTextItem = bankCashInInstructionBean.bankName) != null) {
                    str2 = instructionTextItem.text;
                }
                textView.setText(str2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4984a).inflate(p366y9.c.ci_layout_inter_bank_cash_in_instruction_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        g gVar = new g(this, itemView);
        gVar.a(itemView);
        gVar.f1724d = (ImageView) itemView.findViewById(p366y9.b.ivIcon);
        gVar.f1725e = (TextView) itemView.findViewById(p366y9.b.tvBankName);
        return gVar;
    }
}
