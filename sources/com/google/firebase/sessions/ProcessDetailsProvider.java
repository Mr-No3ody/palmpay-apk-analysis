package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetailsProvider;", "", "<init>", "()V", "getAppProcessDetails", "", "Lcom/google/firebase/sessions/ProcessDetails;", "context", "Landroid/content/Context;", "getMyProcessDetails", "getProcessName", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n774#2:85\n865#2,2:86\n1557#2:88\n1628#2,3:89\n1#3:92\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n*L\n37#1:85\n37#1:86,2\n41#1:88\n41#1:89,3\n*E\n"})
public final class ProcessDetailsProvider {

    @NotNull
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    private final String getProcessName() throws Throwable {
        String processName;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 33) {
            String strMyProcessName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i7 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails(@NotNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Intrinsics.checkNotNullParameter(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = z.f38935a;
        }
        ArrayList arrayListD = CollectionsKt.D(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListD) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i7) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            Intrinsics.checkNotNullExpressionValue(processName, "processName");
            arrayList2.add(new ProcessDetails(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.c(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    @NotNull
    public final ProcessDetails getMyProcessDetails(@NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ProcessDetails) next).getPid() != iMyPid);
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? new ProcessDetails(getProcessName(), iMyPid, 0, false) : processDetails;
    }
}
