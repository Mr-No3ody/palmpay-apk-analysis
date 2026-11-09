package V9;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.contacts.ui.activity.ContactProfileActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsSearchActivity;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements BaseRecyclerViewAdapter$ItemViewOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PalmPayContactsSearchActivity f10181a;

    public E(PalmPayContactsSearchActivity palmPayContactsSearchActivity) {
        this.f10181a = palmPayContactsSearchActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public final void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        ContactProfileActivity.n(this.f10181a, (PalmPayContact) obj);
    }
}
