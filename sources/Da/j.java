package Da;

import Pa.n0;
import android.content.DialogInterface;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1759b;

    public /* synthetic */ j(Object obj, int i7) {
        this.f1758a = i7;
        this.f1759b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1758a) {
            case 0:
                ((AtomicBoolean) this.f1759b).set(true);
                break;
            case 1:
                ((SetUserPhotoActivity) this.f1759b).gotoFailCancelled();
                break;
            case 2:
                n0.g().n("PopUp_Close_Click", (HashMap) this.f1759b);
                break;
            default:
                F6.d.h("LocationManager", 3, "GooglePlayServices error could've been resolved, but user canceled it.");
                ((ta.h) this.f1759b).e();
                break;
        }
    }
}
