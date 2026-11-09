package V8;

import android.content.DialogInterface;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationUserProfileFragment f10171b;

    public /* synthetic */ y(IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment, int i7) {
        this.f10170a = i7;
        this.f10171b = identityVerificationUserProfileFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        PpFormVertical ppFormVertical;
        PpFormVertical ppFormVertical2;
        PpFormVertical ppFormVertical3;
        PpFormVertical ppFormVertical4;
        PpFormVertical ppFormVertical5;
        IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10171b;
        switch (this.f10170a) {
            case 0:
                int i10 = IdentityVerificationUserProfileFragment.f26181L;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                I8.t tVar = (I8.t) identityVerificationUserProfileFragment.f27335j;
                if (tVar != null && (ppFormVertical = tVar.t) != null) {
                    ppFormVertical.setEditContent((String) identityVerificationUserProfileFragment.z().get(i7));
                    break;
                }
                break;
            case 1:
                int i11 = IdentityVerificationUserProfileFragment.f26181L;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                I8.t tVar2 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                if (tVar2 != null && (ppFormVertical2 = tVar2.f4222p) != null) {
                    ppFormVertical2.setEditContent((String) identityVerificationUserProfileFragment.y().get(i7));
                    break;
                }
                break;
            case 2:
                int i12 = IdentityVerificationUserProfileFragment.f26181L;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                I8.t tVar3 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                if (tVar3 != null && (ppFormVertical3 = tVar3.f4221o) != null) {
                    ppFormVertical3.setEditContent((String) identityVerificationUserProfileFragment.x().get(i7));
                    break;
                }
                break;
            case 3:
                int i13 = IdentityVerificationUserProfileFragment.f26181L;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                I8.t tVar4 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                if (tVar4 != null && (ppFormVertical4 = tVar4.f4220j) != null) {
                    ppFormVertical4.setEditContent((String) identityVerificationUserProfileFragment.w().get(i7));
                    break;
                }
                break;
            default:
                int i14 = IdentityVerificationUserProfileFragment.f26181L;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                I8.t tVar5 = (I8.t) identityVerificationUserProfileFragment.f27335j;
                if (tVar5 != null && (ppFormVertical5 = tVar5.f4219i) != null) {
                    ppFormVertical5.setEditContent((String) identityVerificationUserProfileFragment.v().get(i7));
                    break;
                }
                break;
        }
    }
}
