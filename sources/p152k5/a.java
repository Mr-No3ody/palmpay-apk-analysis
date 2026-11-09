package p152k5;

import com.didiglobal.booster.instrument.ShadowThread;
import com.luck.picture.lib.config.FileSizeUnit;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f38667a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(ShadowThread.makeThreadName("MultiProcessDataSharer-load", "\u200bcom.growingio.android.sdk.track.ipc.MultiProcessDataSharer$1"));
        this.f38667a = dVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        d dVar = this.f38667a;
        synchronized (dVar) {
            try {
                h.a("MultiProcessDataSharer", "loadFromDisk mLoaded is " + dVar.f38682d, new Object[0]);
                if (dVar.f38682d) {
                    return;
                }
                try {
                    FileChannel channel = new RandomAccessFile(dVar.f38679a.getFileStreamPath(dVar.f38680b), "rw").getChannel();
                    dVar.f38684f = channel;
                    dVar.f38683e = channel.map(FileChannel.MapMode.READ_WRITE, 0L, FileSizeUnit.KB * ((long) dVar.f38681c));
                    dVar.c();
                } catch (Exception e10) {
                    h.b("MultiProcessDataSharer", e10);
                }
                h.a("MultiProcessDataSharer", "loadFromDisk successfully ", new Object[0]);
                dVar.f38682d = true;
                dVar.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
