package Od;

import com.alibaba.android.alpha.Task;
import com.transsnet.adsdk.AdManager;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.task.DownloadSplashTask;
import com.transsnet.palmpay.util.MainAdUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DownloadSplashTask f6806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DownloadSplashTask downloadSplashTask, String str) {
        super(str);
        this.f6806a = downloadSplashTask;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        DownloadSplashTask downloadSplashTask = this.f6806a;
        BaseInitTask.beginSection$default(downloadSplashTask, null, 1, null);
        AdManager.downloadSplashImg(MainAdUtils.getAdSlotId(Ac.h.main_ad_splash_slot_id));
        BaseInitTask.endSection$default(downloadSplashTask, null, 1, null);
    }
}
