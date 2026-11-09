package Od;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.task.LocalNotificationTask;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalNotificationTask f6813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f6814b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LocalNotificationTask localNotificationTask, Application application, String str) {
        super(str);
        this.f6813a = localNotificationTask;
        this.f6814b = application;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        LocalNotificationTask localNotificationTask = this.f6813a;
        BaseInitTask.beginSection$default(localNotificationTask, null, 1, null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_UNLOCKED");
        if (Build.VERSION.SDK_INT < 33) {
            BaseApplication.get().registerReceiver(new p101gd.a(), intentFilter);
        } else {
            BaseApplication.get().registerReceiver(new p101gd.a(), intentFilter, 2);
        }
        localNotificationTask.getLocalNotificationConfig();
        localNotificationTask.registerNetworkChangeEvent(this.f6814b);
        BaseInitTask.endSection$default(localNotificationTask, null, 1, null);
    }
}
