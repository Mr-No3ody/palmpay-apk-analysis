package O0;

import N8.q0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6530e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f6531f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f6533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f6534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f6535d;

    public b(String name, File file, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6532a = z3;
        this.f6533b = file != null ? new File(file, q0.j(name, ".lck")) : null;
        this.f6534c = f6530e.getThreadLock(name);
    }

    public final void a(boolean z3) {
        this.f6534c.lock();
        if (z3) {
            File file = this.f6533b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f6535d = channel;
            } catch (IOException unused) {
                this.f6535d = null;
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f6535d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f6534c.unlock();
    }
}
