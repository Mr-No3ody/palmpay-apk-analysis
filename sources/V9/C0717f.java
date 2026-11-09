package V9;

import com.transsnet.palmpay.contacts.ui.activity.AddNewFaveActivity;
import com.transsnet.palmpay.contacts.ui.dialog.AddLinkFaveNotPPUserDialog;
import com.transsnet.palmpay.core.dialog.ShareDialog;

/* JADX INFO: renamed from: V9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0717f implements AddLinkFaveNotPPUserDialog.ConfirmInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddNewFaveActivity f10198a;

    public C0717f(AddNewFaveActivity addNewFaveActivity) {
        this.f10198a = addNewFaveActivity;
    }

    @Override // com.transsnet.palmpay.contacts.ui.dialog.AddLinkFaveNotPPUserDialog.ConfirmInterface
    public final void confirm() {
        AddNewFaveActivity addNewFaveActivity = this.f10198a;
        ShareDialog shareDialog = new ShareDialog(addNewFaveActivity);
        shareDialog.setShareBusinessType(45);
        shareDialog.show();
        shareDialog.setTitle(addNewFaveActivity.getString(R9.f.ct_loveday_share_title));
    }
}
