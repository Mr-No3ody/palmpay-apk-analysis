package V9;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.fragment.app.g0;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsActivity;
import com.transsnet.palmpay.contacts.ui.fragment.CloseContactsFragment;
import com.transsnet.palmpay.contacts.ui.fragment.PalmPayContactsListFragment;

/* JADX INFO: renamed from: V9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0719h extends g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AllContactsActivity f10201j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0719h(AllContactsActivity allContactsActivity, Z z3, int i7) {
        super(z3);
        this.f10200i = i7;
        this.f10201j = allContactsActivity;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        switch (this.f10200i) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final CharSequence e(int i7) {
        switch (this.f10200i) {
            case 0:
                AllContactsActivity allContactsActivity = this.f10201j;
                if (i7 == 0) {
                    return allContactsActivity.getString(p025ba.k.core_beneficiaries);
                }
                if (i7 != 1) {
                    return null;
                }
                return allContactsActivity.getString(R9.f.ct_palmpay_contact);
            default:
                if (i7 != 0) {
                    return null;
                }
                return this.f10201j.getString(R9.f.ct_palmpay_contact);
        }
    }

    @Override // androidx.fragment.app.g0
    public final Fragment n(int i7) {
        Fragment closeContactsFragment;
        switch (this.f10200i) {
            case 0:
                AllContactsActivity allContactsActivity = this.f10201j;
                if (allContactsActivity.f27149d.get(i7) != null) {
                    return (Fragment) allContactsActivity.f27149d.get(i7);
                }
                if (i7 == 0) {
                    closeContactsFragment = new CloseContactsFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("transType", allContactsActivity.f27151f);
                    closeContactsFragment.setArguments(bundle);
                    allContactsActivity.f27149d.put(i7, closeContactsFragment);
                } else {
                    if (i7 != 1) {
                        return null;
                    }
                    closeContactsFragment = new PalmPayContactsListFragment();
                    allContactsActivity.f27149d.put(i7, closeContactsFragment);
                }
                return closeContactsFragment;
            default:
                AllContactsActivity allContactsActivity2 = this.f10201j;
                if (allContactsActivity2.f27149d.get(i7) != null) {
                    return (Fragment) allContactsActivity2.f27149d.get(i7);
                }
                if (i7 != 0) {
                    return null;
                }
                boolean z3 = allContactsActivity2.f27152g;
                PalmPayContactsListFragment palmPayContactsListFragment = new PalmPayContactsListFragment();
                palmPayContactsListFragment.f27284w = "";
                palmPayContactsListFragment.f27283v = z3;
                allContactsActivity2.f27149d.put(i7, palmPayContactsListFragment);
                return palmPayContactsListFragment;
        }
    }
}
