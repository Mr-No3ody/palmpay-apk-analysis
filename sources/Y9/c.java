package Y9;

import Pa.r0;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.contacts.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MobileContactsListFragment f11319a;

    public c(MobileContactsListFragment mobileContactsListFragment) {
        this.f11319a = mobileContactsListFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        PalmPayContact palmPayContact = (PalmPayContact) obj;
        if (!TextUtils.isDigitsOnly(palmPayContact.getPhone().trim().replace(" ", ""))) {
            ToastUtils.showLong(R9.f.ct_invalid_mobile_number);
            return;
        }
        MobileContactsListFragment mobileContactsListFragment = this.f11319a;
        if (mobileContactsListFragment.f27273A.equals("to_palmpay_contact_information_page_element_click")) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(400, new String[]{"Local Contacts", "选择用户"}));
        }
        if (!mobileContactsListFragment.f27278w) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_GO_TO_PERSON_TRANSFER, r0.v0(palmPayContact.getPhone())));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("PHONE_NUMBER", palmPayContact.getPhone());
        intent.putExtra("contact_name", palmPayContact.getFullName());
        mobileContactsListFragment.f27319c.setResult(-1, intent);
        mobileContactsListFragment.f27319c.finish();
    }
}
