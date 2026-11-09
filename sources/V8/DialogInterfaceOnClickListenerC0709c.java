package V8;

import android.content.DialogInterface;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import java.util.ArrayList;

/* JADX INFO: renamed from: V8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0709c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10120a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationAddressFragment f10121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10122c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0709c(IdentityVerificationAddressFragment identityVerificationAddressFragment, ArrayList arrayList) {
        this.f10121b = identityVerificationAddressFragment;
        this.f10122c = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        I8.p pVar;
        ArrayList arrayList = this.f10122c;
        IdentityVerificationAddressFragment identityVerificationAddressFragment = this.f10121b;
        switch (this.f10120a) {
            case 0:
                int i10 = IdentityVerificationAddressFragment.f26156Q;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                if (!arrayList.isEmpty() && (pVar = (I8.p) identityVerificationAddressFragment.f27335j) != null) {
                    pVar.f4179e.setEditContent((String) arrayList.get(i7));
                }
                identityVerificationAddressFragment.t = null;
                break;
            default:
                if (dialogInterface != null) {
                    int i11 = IdentityVerificationAddressFragment.f26156Q;
                    dialogInterface.dismiss();
                }
                identityVerificationAddressFragment.f26160H = i7;
                identityVerificationAddressFragment.f26164p = null;
                identityVerificationAddressFragment.t = null;
                I8.p pVar2 = (I8.p) identityVerificationAddressFragment.f27335j;
                if (pVar2 != null) {
                    pVar2.f4178d.setEditContent((String) arrayList.get(i7));
                }
                I8.p pVar3 = (I8.p) identityVerificationAddressFragment.f27335j;
                if (pVar3 != null) {
                    pVar3.f4179e.setEditContent("");
                }
                break;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0709c(ArrayList arrayList, IdentityVerificationAddressFragment identityVerificationAddressFragment) {
        this.f10122c = arrayList;
        this.f10121b = identityVerificationAddressFragment;
    }
}
