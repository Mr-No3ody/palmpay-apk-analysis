package p284sb;

import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.UnfreezeViewModel;

/* JADX INFO: renamed from: sb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2004b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HowToUnfreezeActivity f42152b;

    public /* synthetic */ ViewOnClickListenerC2004b(HowToUnfreezeActivity howToUnfreezeActivity, int i7) {
        this.f42151a = i7;
        this.f42152b = howToUnfreezeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HowToUnfreezeActivity howToUnfreezeActivity = this.f42152b;
        switch (this.f42151a) {
            case 0:
                int i7 = HowToUnfreezeActivity.f28656H;
                ((UnfreezeViewModel) howToUnfreezeActivity.l()).d();
                break;
            case 1:
                int i10 = HowToUnfreezeActivity.f28656H;
                ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                howToUnfreezeActivity.finish();
                break;
            case 2:
                int i11 = HowToUnfreezeActivity.f28656H;
                ((UnfreezeViewModel) howToUnfreezeActivity.l()).d();
                break;
            case 3:
                int i12 = HowToUnfreezeActivity.f28656H;
                howToUnfreezeActivity.finish();
                break;
            case 4:
                howToUnfreezeActivity.f28659C = null;
                ((UnfreezeViewModel) howToUnfreezeActivity.l()).d();
                break;
            default:
                howToUnfreezeActivity.f28659C = null;
                ((UnfreezeViewModel) howToUnfreezeActivity.l()).d();
                break;
        }
    }
}
