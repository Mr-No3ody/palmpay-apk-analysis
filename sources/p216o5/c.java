package p216o5;

import E2.a;
import G6.b;
import Gb.HandlerC0283f;
import V7.g;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.didiglobal.booster.instrument.ShadowHandlerThread;
import com.didiglobal.booster.instrument.ShadowThread;
import com.growingio.android.sdk.d;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.luck.picture.lib.config.FileSizeUnit;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f40041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f40042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HandlerC0283f f40043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f40044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f40046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f40047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f40048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40049j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f40050k = new ArrayList();

    public c(Context context, b bVar, long j6, long j10, int i7, int i10) {
        this.f40040a = context;
        this.f40046g = j10 * FileSizeUnit.MB;
        this.f40045f = j6 * 1000;
        this.f40047h = Math.max(1, i7);
        this.f40048i = Math.max(1, i10);
        this.f40041b = bVar;
        this.f40044e = new a(context, c.class.getName());
        this.f40042c = context.getSharedPreferences("growing3_sender", 0);
        ShadowHandlerThread shadowHandlerThread = new ShadowHandlerThread(c.class.getName(), "\u200bcom.growingio.android.sdk.track.middleware.EventSender");
        ShadowThread.setThreadName(shadowHandlerThread, "\u200bcom.growingio.android.sdk.track.middleware.EventSender").start();
        this.f40043d = new HandlerC0283f(this, shadowHandlerThread.getLooper());
    }

    public static b a(a aVar) {
        ModelLoader modelLoaderA = d.a().f23197a.a(a.class);
        if (modelLoaderA != null) {
            return (b) modelLoaderA.buildLoadData(aVar).f41455a.executeData();
        }
        h.c("EventSender", "please register database component first", new Object[0]);
        return new b();
    }

    public final void b() {
        synchronized (this.f40050k) {
            c();
        }
    }

    public final void c() {
        ArrayList arrayList = this.f40050k;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        h.a("EventSender", "flushPendingEvents: size=" + arrayList2.size(), new Object[0]);
        a aVar = new a();
        aVar.f40028a = 0;
        ArrayList arrayList3 = new ArrayList();
        aVar.f40029b = arrayList3;
        arrayList3.addAll(arrayList2);
        a(aVar);
    }

    public final void d(boolean z3) {
        FileLock fileLock;
        int[] iArr;
        g gVar;
        b();
        a aVar = this.f40044e;
        int i7 = 0;
        if (((FileLock) aVar.f2187f) == null) {
            fileLock = null;
            try {
                if (((FileOutputStream) aVar.f2185d) == null || ((FileChannel) aVar.f2186e) == null) {
                    FileOutputStream fileOutputStreamOpenFileOutput = ((Context) aVar.f2183b).openFileOutput((String) aVar.f2184c, 0);
                    aVar.f2185d = fileOutputStreamOpenFileOutput;
                    aVar.f2186e = fileOutputStreamOpenFileOutput.getChannel();
                }
                aVar.f2187f = ((FileChannel) aVar.f2186e).tryLock();
                fileLock = (FileLock) aVar.f2187f;
            } catch (IOException | OverlappingFileLockException unused) {
            }
        } else {
            fileLock = (FileLock) aVar.f2187f;
        }
        if (fileLock == null || !fileLock.isValid()) {
            h.c("EventSender", "sendEvents: this process can not get lock", new Object[0]);
            return;
        }
        Context context = this.f40040a;
        g gVarA = p291t5.b.a(context);
        if (gVarA.f10096a) {
            if (z3) {
                iArr = new int[]{1};
            } else {
                iArr = gVarA.f10098c ? new int[]{1, 2, 3} : new int[]{1, 2};
            }
            int length = iArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                while (true) {
                    boolean z8 = gVarA.f10097b;
                    if (i11 == 1 || !z8 || this.f40046g >= e(0L)) {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        activityManager.getMemoryInfo(memoryInfo);
                        int i12 = memoryInfo.lowMemory ? 3 : 50;
                        a aVar2 = new a();
                        aVar2.f40028a = 1;
                        aVar2.f40030c = i11;
                        aVar2.f40031d = i12;
                        b bVarA = a(aVar2);
                        if (bVarA.f40034a && bVarA.f40036c > 0) {
                            e eVarSend = this.f40041b.send(bVarA.f40037d, bVarA.f40039f);
                            boolean z10 = eVarSend.f40051a;
                            if (z10) {
                                String str = bVarA.f40038e;
                                gVar = gVarA;
                                long j6 = bVarA.f40035b;
                                a aVar3 = new a();
                                aVar3.f40028a = 3;
                                aVar3.f40030c = i11;
                                aVar3.f40033f = str;
                                aVar3.f40032e = j6;
                                a(aVar3);
                                if (z8) {
                                    e(eVarSend.f40052b);
                                }
                            } else {
                                gVar = gVarA;
                            }
                            if (!z10) {
                                break;
                            }
                            gVarA = gVar;
                            i7 = 0;
                        }
                    } else {
                        h.c("EventSender", "Today's mobile data is exhausted", new Object[i7]);
                    }
                    gVar = gVarA;
                    break;
                }
                i10++;
                gVarA = gVar;
                i7 = 0;
            }
        }
    }

    public final long e(long j6) {
        long j10;
        SharedPreferences sharedPreferences = this.f40042c;
        String string = sharedPreferences.getString("today", "");
        String str = new SimpleDateFormat("yyyyMMdd").format(new Date());
        if (str.equals(string)) {
            j10 = sharedPreferences.getLong("today_bytes", 0L);
        } else {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("today", str);
            editorEdit.putLong("today_bytes", 0L);
            editorEdit.apply();
            j10 = 0;
        }
        if (j6 <= 0) {
            return j10;
        }
        long j11 = j10 + j6;
        sharedPreferences.edit().putLong("today_bytes", j11).apply();
        return j11;
    }
}
