package N8;

import android.content.DialogInterface;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetTouchIdActivity f6179b;

    public /* synthetic */ U(SetTouchIdActivity setTouchIdActivity, int i7) {
        this.f6178a = i7;
        this.f6179b = setTouchIdActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6178a) {
            case 0:
                SetTouchIdActivity setTouchIdActivity = this.f6179b;
                if (!setTouchIdActivity.f26020i.booleanValue()) {
                    io.fastkv.n.N(true);
                }
                setTouchIdActivity.setResult(-1);
                setTouchIdActivity.finish();
                break;
            default:
                this.f6179b.f26019g = null;
                break;
        }
    }
}
