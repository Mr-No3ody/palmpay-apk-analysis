package Od;

import M.q;
import Pa.C0525w;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.util.FileIOUtils;
import java.io.File;
import kotlin.jvm.internal.AbstractC1859i;
import okhttp3.X;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f6817c = new g(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6819b;

    public static boolean a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            q qVarA = AbstractC1859i.a(list);
            while (qVarA.hasNext()) {
                if (!a(new File(file, (String) qVarA.next()))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static void b(String str) {
        File file = new File(f6817c.getUnZipDir(str), OfflineConstant.CONFIG_FILE_NAME);
        MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_DOWNLOAD_COIN_RAIN_SUCCESS, str);
        messageEvent.setEventObj(FileIOUtils.readFile2String(file));
        org.greenrobot.eventbus.c.b().f(messageEvent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f6819b;
        if (f6817c.isCompleteDownload(str)) {
            b(str);
            return;
        }
        X x3 = new X();
        x3.k(this.f6818a);
        x3.d();
        FirebasePerfOkHttpClient.enqueue(BaseApplication.get().getHttpClient().newCall(x3.b()), new C0525w(str, this));
    }
}
