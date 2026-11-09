package N8;

import android.view.View;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3PendingActivity;

/* JADX INFO: renamed from: N8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0480y implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PalmPayLevelV2Activity f6266b;

    public /* synthetic */ ViewOnClickListenerC0480y(PalmPayLevelV2Activity palmPayLevelV2Activity, int i7) {
        this.f6265a = i7;
        this.f6266b = palmPayLevelV2Activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6265a) {
            case 0:
                PalmPayLevelV2Activity.a aVar = PalmPayLevelV2Activity.f25925p;
                this.f6266b.onBackPressed();
                break;
            default:
                PalmPayLevelV2Activity.a aVar2 = PalmPayLevelV2Activity.f25925p;
                PalmPayTier3PendingActivity.a aVar3 = PalmPayTier3PendingActivity.f25938i;
                PalmPayLevelV2Activity palmPayLevelV2Activity = this.f6266b;
                PalmPayTier3PendingActivity.a.launch$default(aVar3, palmPayLevelV2Activity, palmPayLevelV2Activity.f25929f, null, null, 12, null);
                break;
        }
    }
}
