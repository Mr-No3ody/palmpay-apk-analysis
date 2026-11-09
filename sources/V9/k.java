package V9;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsSearchActivity;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AllContactsSearchActivity f10204a;

    public k(AllContactsSearchActivity allContactsSearchActivity) {
        this.f10204a = allContactsSearchActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        PalmPayContact palmPayContact = (PalmPayContact) obj;
        if (!TextUtils.isDigitsOnly(palmPayContact.getPhone().trim().replace(" ", ""))) {
            ToastUtils.showLong(R9.f.ct_invalid_mobile_number);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("PHONE_NUMBER", palmPayContact.getPhone());
        intent.putExtra("contact_name", palmPayContact.getFullName());
        AllContactsSearchActivity allContactsSearchActivity = this.f10204a;
        allContactsSearchActivity.setResult(-1, intent);
        allContactsSearchActivity.finish();
    }
}
