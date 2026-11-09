package p368yb;

import C0.G;
import Kb.h;
import Pa.r0;
import Ya.d;
import Ya.f;
import Ya.g;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.OcAutoRepaymentData;
import kotlin.jvm.internal.Intrinsics;
import p327vd.c;

/* JADX INFO: renamed from: yb.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2140h extends h {
    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_auto_repay_explain_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2139g(viewInflate);
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder b(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f4991a).inflate(f.cs_oc_auto_repay_explain_empty_item, parent, false);
        Intrinsics.e(viewInflate);
        return new C2138f(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        String strY;
        String strSubstring;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C2139g c2139g = (C2139g) holder;
        OcAutoRepaymentData ocAutoRepaymentData = (OcAutoRepaymentData) this.f4992b.get(i7);
        if (!Intrinsics.c(ocAutoRepaymentData.getBankName(), "Palmpay")) {
            c2139g.f44231b.setText(ocAutoRepaymentData.getBankName());
            if (TextUtils.isEmpty(ocAutoRepaymentData.getCardNo())) {
                c2139g.f44232c.setText("****");
            } else {
                c2139g.f44232c.setText(this.f4991a.getString(g.cs_oc_payment_num_syx, r0.I(ocAutoRepaymentData.getCardNo())));
            }
            r0.o1(ocAutoRepaymentData.getIcon(), c2139g.f44230a);
            c2139g.f44233d.setVisibility(8);
            return;
        }
        c2139g.f44230a.setImageResource(d.cs_oc_palmpay_logo);
        c2139g.f44231b.setText(ocAutoRepaymentData.getBankName());
        String cardNo = ocAutoRepaymentData.getCardNo();
        int length = cardNo != null ? cardNo.length() : 0;
        if (length >= 4) {
            String cardNo2 = ocAutoRepaymentData.getCardNo();
            if (cardNo2 != null) {
                strSubstring = cardNo2.substring(length - 4, length);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = null;
            }
            strY = G.o("**** ", strSubstring);
        } else {
            strY = r0.Y(ocAutoRepaymentData.getCardNo());
        }
        c2139g.f44232c.setText(strY);
        c2139g.f44233d.setVisibility(0);
    }

    @Override // Kb.h
    public final void d(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        p220oa.h.l(new c(this, 10), ((C2138f) holder).f44229a);
    }
}
