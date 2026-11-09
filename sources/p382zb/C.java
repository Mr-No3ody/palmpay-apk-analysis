package p382zb;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.credit.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MobileContactsListFragment f44519a;

    public C(MobileContactsListFragment mobileContactsListFragment) {
        this.f44519a = mobileContactsListFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        PalmPayContact palmPayContact = (PalmPayContact) obj;
        if (!TextUtils.isDigitsOnly(palmPayContact.getPhone().trim().replace(" ", ""))) {
            ToastUtils.showLong("Invalid mobile number");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("PHONE_NUMBER", palmPayContact.getPhone());
        intent.putExtra("contact_name", palmPayContact.getFullName());
        MobileContactsListFragment mobileContactsListFragment = this.f44519a;
        mobileContactsListFragment.f27319c.setResult(-1, intent);
        mobileContactsListFragment.f27319c.finish();
    }
}
