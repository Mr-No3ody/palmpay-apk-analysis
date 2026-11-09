package p024b9;

import Bc.C0104a;
import android.content.DialogInterface;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepAddressEditFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18801a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UpgradeTier3StepAddressEditFragment f18803c;

    public /* synthetic */ e(UpgradeTier3StepAddressEditFragment upgradeTier3StepAddressEditFragment, ArrayList arrayList) {
        this.f18803c = upgradeTier3StepAddressEditFragment;
        this.f18802b = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C0104a c0104a;
        UpgradeTier3StepAddressEditFragment upgradeTier3StepAddressEditFragment = this.f18803c;
        ArrayList arrayList = this.f18802b;
        switch (this.f18801a) {
            case 0:
                if (dialogInterface != null) {
                    int i10 = UpgradeTier3StepAddressEditFragment.f26283C;
                    dialogInterface.dismiss();
                }
                upgradeTier3StepAddressEditFragment.f26284A = i7;
                C0104a c0104a2 = upgradeTier3StepAddressEditFragment.f26286j;
                if (c0104a2 != null) {
                    ((PpFormVertical) c0104a2.f655g).setEditContent((String) arrayList.get(i7));
                }
                C0104a c0104a3 = upgradeTier3StepAddressEditFragment.f26286j;
                if (c0104a3 != null) {
                    ((PpFormVertical) c0104a3.f656i).setEditContent("");
                }
                break;
            default:
                int i11 = UpgradeTier3StepAddressEditFragment.f26283C;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                if (!arrayList.isEmpty() && (c0104a = upgradeTier3StepAddressEditFragment.f26286j) != null) {
                    ((PpFormVertical) c0104a.f656i).setEditContent((String) arrayList.get(i7));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(ArrayList arrayList, UpgradeTier3StepAddressEditFragment upgradeTier3StepAddressEditFragment) {
        this.f18802b = arrayList;
        this.f18803c = upgradeTier3StepAddressEditFragment;
    }
}
