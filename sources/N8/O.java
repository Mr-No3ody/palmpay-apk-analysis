package N8;

import android.view.View;
import com.transsnet.palmpay.account.ui.activity.SetNewPswActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetNewPswActivity f6169b;

    public /* synthetic */ O(SetNewPswActivity setNewPswActivity, int i7) {
        this.f6168a = i7;
        this.f6169b = setNewPswActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SetNewPswActivity setNewPswActivity = this.f6169b;
        switch (this.f6168a) {
            case 0:
                int i7 = SetNewPswActivity.f25987e;
                setNewPswActivity.finish();
                break;
            default:
                int i10 = SetNewPswActivity.f25987e;
                setNewPswActivity.finish();
                break;
        }
    }
}
