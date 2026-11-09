package p385ze;

import Ac.b;
import M1.j;
import N8.q0;
import Pa.r0;
import android.widget.TextView;
import com.airbnb.lottie.model.layer.d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.main.export.bean.rsp.QueryFundModuleResp;
import face.security.device.api.FaceSecCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        int color;
        String str;
        String strK;
        QueryFundModuleResp item = (QueryFundModuleResp) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(Ac.e.tvNum, String.valueOf(holder.getAdapterPosition() + 1));
        TextView textView = (TextView) holder.getView(Ac.e.tvNum);
        int adapterPosition = holder.getAdapterPosition();
        if (adapterPosition == 0) {
            color = getContext().getResources().getColor(b.main_color_fd960c);
        } else if (adapterPosition != 1) {
            color = adapterPosition != 2 ? getContext().getResources().getColor(L6.b.ppColorDisabled) : getContext().getResources().getColor(b.main_color_ca7425);
        } else {
            color = getContext().getResources().getColor(b.main_color_829fba);
        }
        textView.setTextColor(color);
        String str2 = item.fundName;
        if (str2 != null) {
            holder.setText(Ac.e.tvTitle, str2);
        }
        Double d2 = item.returnRate;
        if (d2 != null) {
            double dDoubleValue = d2.doubleValue();
            String strN = d.n(new Object[]{Double.valueOf(((double) Nf.b.a(Math.abs(dDoubleValue) * ((double) FaceSecCode.SC_SUCCESS))) / 100.0d)}, 1, "%.2f", "format(...)");
            if (dDoubleValue < 0.0d) {
                strK = q0.k("-", strN, "%");
            } else {
                strK = dDoubleValue > 0.0d ? q0.k("+", strN, "%") : strN.concat("%");
            }
            holder.setText(Ac.e.tvChangePercent, strK);
            TextView textView2 = (TextView) holder.getView(Ac.e.tvChangePercent);
            if (textView2 != null) {
                textView2.setTextColor(holder.itemView.getContext().getResources().getColor(dDoubleValue < 0.0d ? L6.b.ppColorError : L6.b.ppColorSuccess));
            }
        }
        r0.R1((TextView) holder.getView(Ac.e.tvChangePercent), "fonts/PalmPayNum-Bold.ttf");
        Integer num = item.riskLevel;
        if (num != null) {
            int iIntValue = num.intValue();
            int i7 = Ac.e.tvTag;
            if (iIntValue == 1) {
                str = "Moderate";
            } else if (iIntValue == 2) {
                str = "Moderately Conservative";
            } else if (iIntValue == 3) {
                str = "Moderately Aggressive";
            } else if (iIntValue != 4) {
                str = iIntValue != 5 ? "" : "Conservative";
            } else {
                str = "Aggressive";
            }
            holder.setText(i7, str);
        }
        String str3 = item.returnType;
        if (str3 != null) {
            holder.setText(Ac.e.tvRemark, str3);
        }
    }
}
