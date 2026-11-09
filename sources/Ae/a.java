package Ae;

import Pa.F;
import android.view.View;
import com.transsnet.palmpay.ui.dialog.AcceptTurnOnSaveDialog;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AcceptTurnOnSaveDialog f266b;

    public /* synthetic */ a(AcceptTurnOnSaveDialog acceptTurnOnSaveDialog, int i7) {
        this.f265a = i7;
        this.f266b = acceptTurnOnSaveDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f265a) {
            case 0:
                AcceptTurnOnSaveDialog.initViews$lambda$0(this.f266b, view);
                break;
            default:
                AcceptTurnOnSaveDialog acceptTurnOnSaveDialog = this.f266b;
                ActivityUtils.startActivity(F.a(((com.transsnet.palmpay.custom_view.dialog.b) acceptTurnOnSaveDialog).mContext, acceptTurnOnSaveDialog.mJumpParams));
                break;
        }
    }
}
