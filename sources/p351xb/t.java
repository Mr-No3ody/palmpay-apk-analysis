package p351xb;

import Kb.h;
import Pa.r0;
import Ya.b;
import Ya.d;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.custom_view.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f43811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f43812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43813f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, List data, int i7) {
        super(context, data);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f43811d = context;
        this.f43812e = data;
        this.f43813f = i7;
    }

    @Override // Kb.h
    public final RecyclerView.ViewHolder a(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f43811d).inflate(f.cs_cl_receive_account_item, parent, false);
        Intrinsics.e(viewInflate);
        return new s(viewInflate);
    }

    @Override // Kb.h
    public final void c(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        s sVar = (s) holder;
        int size = this.f43812e.size() - 1;
        Context context = this.f4991a;
        if (i7 == size) {
            sVar.f43808a.setImageResource(d.cs_oc_add_bank_card);
            sVar.f43809b.setTextColor(context.getColor(b.cs_main_color));
            sVar.f43809b.setText(this.f43811d.getString(g.cs_cl_use_new_bank_account));
            sVar.f43810c.setVisibility(8);
        } else {
            sVar.f43809b.setText("mPurposeContentTv");
            sVar.f43809b.setTextColor(context.getColor(L6.b.ppColorTextPrimary));
            sVar.f43810c.setVisibility(0);
        }
        PaymentMethod paymentMethod = (PaymentMethod) this.f4992b.get(i7);
        if (this.f43813f == i7) {
            sVar.f43810c.setImageResource(d.cs_cl_receive_account_selected_icon);
        } else {
            sVar.f43810c.setImageResource(d.cs_cl_receive_account_unselected_icon);
        }
        int i10 = paymentMethod.senderAccountType;
        if (i10 == 1) {
            sVar.f43808a.setImageResource(r.cv_palmpay_icon_circle_purple);
            sVar.f43809b.setText(k.core_palmpay_payment_balance);
            return;
        }
        if (i10 == 5 || i10 == 12) {
            sVar.f43809b.setText(paymentMethod.bankName);
            r0.o1(paymentMethod.bankUrl, sVar.f43808a);
        } else if (i10 == 6) {
            sVar.f43809b.setText(paymentMethod.bankName);
            r0.o1(paymentMethod.bankUrl, sVar.f43808a);
        }
    }
}
