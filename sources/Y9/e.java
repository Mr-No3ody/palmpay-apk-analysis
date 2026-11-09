package Y9;

import Pa.r0;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.contacts.ui.fragment.PalmPayContactsListFragment;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmPayContactsListFragment f11321a;

    public e(PalmPayContactsListFragment palmPayContactsListFragment) {
        this.f11321a = palmPayContactsListFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        PalmPayContact palmPayContact = (PalmPayContact) obj;
        if (palmPayContact == null) {
            return;
        }
        if (TextUtils.isEmpty(palmPayContact.getPhone())) {
            ToastUtils.showLong(R9.f.ct_invalid_palmpay_contact);
            return;
        }
        PalmPayContactsListFragment palmPayContactsListFragment = this.f11321a;
        if (palmPayContactsListFragment.f27284w.equals("to_palmpay_contact_information_page_element_click")) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(400, new String[]{"Palmpay Contacts", "选择用户"}));
        }
        if (!palmPayContactsListFragment.f27283v) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_GO_TO_PERSON_TRANSFER, r0.v0(palmPayContact.getPhone())));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("PHONE_NUMBER", palmPayContact.getPhone());
        intent.putExtra("contact_name", palmPayContact.getFullName());
        intent.putExtra("result", palmPayContact.getPhone());
        palmPayContactsListFragment.f27319c.setResult(-1, intent);
        palmPayContactsListFragment.f27319c.finish();
    }
}
