package Pa;

import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.react.common.JavascriptException;
import com.google.gson.Gson;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.ui.activity.UnsatisfiedLinkErrorActivity;
import com.transsnet.palmpay.util.FileIOUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: Pa.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0518o implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C0518o f7127d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f7128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseApplication f7129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0516m f7130c;

    public final void a(int i7) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ToastUtils.showLong("Your app installation is corrupted. Please reinstall it.");
            return;
        }
        BaseApplication baseApplication = this.f7129b;
        if (baseApplication != null) {
            Intent intent = new Intent(baseApplication, (Class<?>) UnsatisfiedLinkErrorActivity.class);
            intent.putExtra("extra_type", i7);
            intent.addFlags(268435456);
            baseApplication.startActivity(intent);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String message;
        String message2;
        if ((th instanceof UnsatisfiedLinkError) && (message2 = th.getMessage()) != null && message2.contains("libmmkv.so")) {
            a(1);
            return;
        }
        if ((th instanceof JavascriptException) && (message = th.getMessage()) != null && message.contains("Module AppRegistry is not a registered callable module")) {
            File file = new File(this.f7129b.getFilesDir(), "CodePush");
            if (file.exists()) {
                File file2 = new File(file, CodePushConstants.STATUS_FILE);
                if (file2.exists()) {
                    String strJ = C0525w.j(FileIOUtils.readFile2String(file2), CodePushConstants.CURRENT_PACKAGE_KEY);
                    Log.e("MyCrash", "fixCodePushCrash: " + strJ);
                    File file3 = new File(file, strJ);
                    if (file3.exists()) {
                        File file4 = new File(file3, "CodePush");
                        if (file4.exists()) {
                            file4.renameTo(new File(file3, "CodePush.Crash"));
                        }
                    }
                }
            }
        }
        if (this.f7130c != null) {
            String simpleName = th.getClass().getSimpleName();
            th.getMessage();
            C0517n c0517n = new C0517n(simpleName, System.currentTimeMillis());
            C0516m c0516m = this.f7130c;
            ArrayList arrayList = c0516m.f7102a;
            if (arrayList != null && arrayList.size() >= 5 && Build.VERSION.SDK_INT >= 26) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i7 = 0;
                for (C0517n c0517n2 : c0516m.f7102a) {
                    if (c0517n2 != null && jCurrentTimeMillis - c0517n2.f7106b <= 3600000 && c0517n2.f7105a.equals(c0517n.f7105a) && (i7 = i7 + 1) >= 5) {
                        p059e1.a.W("crash_sp_history", "");
                        a(2);
                        SystemClock.sleep(2000L);
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        return;
                    }
                }
            }
            C0516m c0516m2 = this.f7130c;
            if (c0516m2.f7102a == null) {
                c0516m2.f7102a = new ArrayList();
            }
            if (c0516m2.f7102a.size() >= 10) {
                c0516m2.f7102a.remove(0);
            }
            c0516m2.f7102a.add(c0517n);
            p059e1.a.W("crash_sp_history", ((Gson) C0525w.f().f7166b).toJson(c0516m2));
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7128a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        SystemClock.sleep(2000L);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
