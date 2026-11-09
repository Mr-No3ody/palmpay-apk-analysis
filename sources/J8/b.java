package J8;

import F8.d;
import F8.e;
import F8.h;
import Kb.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        a aVar = (a) holder;
        Object obj = this.f4985b.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        String type = (String) obj;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        int iHashCode = type.hashCode();
        TextView textView = aVar.f4541d;
        switch (iHashCode) {
            case -1794974836:
                if (type.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_BANKCARD)) {
                    textView.setText(k.core_bank_card);
                    break;
                }
                break;
            case 2331:
                if (type.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_ID)) {
                    textView.setText(h.ac_valid_id_card);
                    break;
                }
                break;
            case 66170:
                if (type.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_BVN)) {
                    textView.setText(k.core_bvn);
                    break;
                }
                break;
            case 67066748:
                if (type.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_EMAIL)) {
                    textView.setText(k.core_email);
                    break;
                }
                break;
            case 811305009:
                if (type.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_BANK_ACCOUNT)) {
                    textView.setText(k.core_bank_account);
                    break;
                }
                break;
            case 1395496410:
                if (type.equals(ResetPinVerifyTypeRsp.VERIFY_TYPE_FULL_NAME)) {
                    textView.setText(h.ac_full_name);
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(this.f4984a).inflate(e.ac_layout_reset_pin_verify_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "inflate(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        a aVar = new a(this, itemView);
        View viewFindViewById = itemView.findViewById(d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        aVar.f4541d = (TextView) viewFindViewById;
        aVar.a(itemView);
        return aVar;
    }
}
