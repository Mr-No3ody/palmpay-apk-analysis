package p382zb;

import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import com.transsnet.palmpay.credit.ui.adapter.ContactListAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.credit.ui.fragment.BeneficiariesListFragment;
import java.util.ArrayList;
import p235pb.g;

/* JADX INFO: renamed from: zb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2158a implements ContactListAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BeneficiariesListFragment f44563a;

    public C2158a(BeneficiariesListFragment beneficiariesListFragment) {
        this.f44563a = beneficiariesListFragment;
    }

    @Override // com.transsnet.palmpay.credit.ui.adapter.ContactListAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(int i7, RecipientListResp.RecipientBean recipientBean, RecyclerView.ViewHolder viewHolder) {
        Intent intent = new Intent();
        intent.putExtra("PHONE_NUMBER", recipientBean.getRecipientPhone());
        intent.putExtra("contact_name", recipientBean.getRecipientNickname());
        BeneficiariesListFragment beneficiariesListFragment = this.f44563a;
        beneficiariesListFragment.f27319c.setResult(-1, intent);
        beneficiariesListFragment.f27319c.finish();
    }

    @Override // com.transsnet.palmpay.credit.ui.adapter.ContactListAdapter$ItemViewOnClickListener
    public final void onDelete(int i7, RecipientListResp.RecipientBean recipientBean) {
        BeneficiariesListFragment beneficiariesListFragment = this.f44563a;
        ArrayList arrayList = beneficiariesListFragment.f30232v;
        if (arrayList != null) {
            arrayList.remove(recipientBean);
        }
        ((g) beneficiariesListFragment.f27328i).deleteRecipient(recipientBean.getRecipientId());
    }
}
