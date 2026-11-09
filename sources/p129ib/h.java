package p129ib;

import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements BaseDialogFragment.OnDialogDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f37466a;

    public h(m mVar) {
        this.f37466a = mVar;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment.OnDialogDismissListener
    public final void onDismiss() {
        this.f37466a.f37484c = false;
    }
}
