package Ad;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ad.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0061h implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddFromContactsDialog f221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f223c;

    public C0061h(AddFromContactsDialog addFromContactsDialog, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f221a = addFromContactsDialog;
        this.f222b = recyclerView;
        this.f223c = recyclerView2;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        if (tab != null) {
            int position = tab.getPosition();
            AddFromContactsDialog addFromContactsDialog = this.f221a;
            addFromContactsDialog.tabCurrentPosition = position;
            int position2 = tab.getPosition();
            RecyclerView recyclerView = this.f222b;
            RecyclerView recyclerView2 = this.f223c;
            if (position2 == 0) {
                Intrinsics.e(recyclerView);
                p220oa.h.C(recyclerView);
                Intrinsics.e(recyclerView2);
                p220oa.h.c(recyclerView2);
                TextView textView = addFromContactsDialog.btnAddNow;
                if (textView != null) {
                    textView.setEnabled(addFromContactsDialog.selectRecent != null);
                    return;
                }
                return;
            }
            Intrinsics.e(recyclerView);
            p220oa.h.c(recyclerView);
            Intrinsics.e(recyclerView2);
            p220oa.h.C(recyclerView2);
            TextView textView2 = addFromContactsDialog.btnAddNow;
            if (textView2 != null) {
                textView2.setEnabled(addFromContactsDialog.selectPhoneContact != null);
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }
}
