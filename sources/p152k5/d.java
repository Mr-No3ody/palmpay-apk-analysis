package p152k5;

import Ce.H;
import android.content.Context;
import androidx.core.provider.m;
import com.didiglobal.booster.instrument.ShadowThread;
import com.growingio.android.sdk.track.ipc.IDataSharer;
import com.luck.picture.lib.config.FileSizeUnit;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements IDataSharer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38679a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f38682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MappedByteBuffer f38683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FileChannel f38684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f38685g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38686h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38680b = "PersistentSharerDataProvider.shared";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38681c = 50;

    public d(Context context) {
        this.f38679a = context;
        this.f38682d = false;
        synchronized (this) {
            this.f38682d = false;
        }
        ShadowThread.setThreadName(new a(this), "\u200bcom.growingio.android.sdk.track.ipc.MultiProcessDataSharer").start();
    }

    public final synchronized void a() {
        while (!this.f38682d) {
            try {
                h.a("MultiProcessDataSharer", "awaitLoadedLocked", new Object[0]);
                wait();
                h.a("MultiProcessDataSharer", "awaitLoadedLocked end", new Object[0]);
            } catch (InterruptedException e10) {
                h.d("MultiProcessDataSharer", e10, "awaitLoadedLocked interrupted", new Object[0]);
                Thread.currentThread().interrupt();
            }
        }
    }

    public final Object b(String str) {
        g gVar = (g) this.f38685g.get(str);
        if (gVar != null) {
            Object[] objArr = new Object[1];
            d(new H(21, this, objArr, gVar, false), gVar.f38693a, FileSizeUnit.KB);
            return objArr[0];
        }
        Object[] objArr2 = {null};
        d(new H(20, this, str, objArr2, false), 0L, Long.MAX_VALUE);
        return objArr2[0];
    }

    public final void c() {
        HashMap map = this.f38685g;
        int size = this.f38681c - map.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                g gVar = new g(this.f38683e, this.f38686h);
                map.put(gVar.f38694b, gVar);
                this.f38686h += 1024;
            } catch (Exception unused) {
                return;
            }
        }
    }

    public final void d(Runnable runnable, long j6, long j10) {
        FileLock fileLockLock = null;
        try {
            try {
                try {
                    fileLockLock = this.f38684f.lock(j6, j10, false);
                    runnable.run();
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                } catch (Exception e10) {
                    h.b("MultiProcessDataSharer", e10);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                }
            } catch (Exception e11) {
                h.b("MultiProcessDataSharer", e11);
            }
        } catch (Throwable th) {
            if (fileLockLock == null) {
                throw th;
            }
            try {
                fileLockLock.release();
                throw th;
            } catch (Exception e12) {
                h.b("MultiProcessDataSharer", e12);
                throw th;
            }
        }
    }

    public final void e(int i7, Object obj, String str) {
        g gVar = (g) this.f38685g.get(str);
        if (gVar != null) {
            d(new com.gyf.immersionbar.h(this, gVar, i7, obj, 2), gVar.f38693a, FileSizeUnit.KB);
        } else {
            d(new com.gyf.immersionbar.h(this, str, i7, obj, 1), 0L, Long.MAX_VALUE);
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final int getAndAddInt(String str, int i7, int i10) {
        synchronized (this) {
            try {
                h.a("MultiProcessDataSharer", "getAndAddInt: key = " + str + ", delta = " + i7 + ", startValue = " + i10, new Object[0]);
                a();
                int[] iArr = new int[1];
                g gVar = (g) this.f38685g.get(str);
                if (gVar == null) {
                    e(1, Integer.valueOf(i10), str);
                    h.a("MultiProcessDataSharer", "getAndAddInt: return startValue", new Object[0]);
                    return i10;
                }
                d(new c(this, gVar, iArr, i10, i7, 0), gVar.f38693a, FileSizeUnit.KB);
                h.a("MultiProcessDataSharer", "getAndAddInt: result = " + iArr[0], new Object[0]);
                return iArr[0];
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final long getAndAddLong(String str, long j6, long j10) {
        synchronized (this) {
            try {
                h.a("MultiProcessDataSharer", "getAndAddLong: key = " + str + ", delta = " + j6 + ", startValue = " + j10, new Object[0]);
                a();
                long[] jArr = new long[1];
                g gVar = (g) this.f38685g.get(str);
                if (gVar == null) {
                    e(2, Long.valueOf(j10), str);
                    h.a("MultiProcessDataSharer", "getAndAddLong: return startValue", new Object[0]);
                    return j10;
                }
                d(new b(this, gVar, jArr, j10, j6), gVar.f38693a, FileSizeUnit.KB);
                h.a("MultiProcessDataSharer", "getAndAddLong: result = " + jArr[0], new Object[0]);
                return jArr[0];
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final int getAndDecrementInt(String str, int i7) {
        return getAndDelInt(str, 1, i7);
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final int getAndDelInt(String str, int i7, int i10) {
        synchronized (this) {
            try {
                h.a("MultiProcessDataSharer", "getAndDelInt: key = " + str + ", delta = " + i7 + ", startValue = " + i10, new Object[0]);
                a();
                int[] iArr = new int[1];
                g gVar = (g) this.f38685g.get(str);
                if (gVar == null) {
                    e(1, Integer.valueOf(i10), str);
                    h.a("MultiProcessDataSharer", "getAndDelInt: return startValue", new Object[0]);
                    return i10;
                }
                d(new c(this, gVar, iArr, i10, i7, 1), gVar.f38693a, FileSizeUnit.KB);
                h.a("MultiProcessDataSharer", "getAndDelInt: result = " + iArr[0], new Object[0]);
                return iArr[0];
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final int getAndIncrementInt(String str, int i7) {
        return getAndAddInt(str, 1, i7);
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final long getAndIncrementLong(String str, long j6) {
        return getAndAddLong(str, 1L, j6);
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final boolean getBoolean(String str, boolean z3) {
        synchronized (this) {
            try {
                a();
                Boolean bool = (Boolean) b(str);
                if (bool != null) {
                    z3 = bool.booleanValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final float getFloat(String str, float f10) {
        synchronized (this) {
            try {
                a();
                Float f11 = (Float) b(str);
                if (f11 != null) {
                    f10 = f11.floatValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10;
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final int getInt(String str, int i7) {
        synchronized (this) {
            try {
                a();
                Integer num = (Integer) b(str);
                if (num != null) {
                    i7 = num.intValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final List getIntArray(String str, List list) {
        synchronized (this) {
            a();
            List list2 = (List) b(str);
            if (list2 != null) {
                list = list2;
            }
        }
        return list;
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final long getLong(String str, long j6) {
        synchronized (this) {
            try {
                a();
                Long l5 = (Long) b(str);
                if (l5 != null) {
                    j6 = l5.longValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j6;
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final String getString(String str, String str2) {
        synchronized (this) {
            a();
            String str3 = (String) b(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final void putBoolean(String str, boolean z3) {
        synchronized (this) {
            a();
            e(4, Boolean.valueOf(z3), str);
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final void putFloat(String str, float f10) {
        synchronized (this) {
            a();
            e(3, Float.valueOf(f10), str);
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final void putInt(String str, int i7) {
        synchronized (this) {
            a();
            e(1, Integer.valueOf(i7), str);
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final void putIntArray(String str, List list) {
        synchronized (this) {
            a();
            e(6, list, str);
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final void putLong(String str, long j6) {
        synchronized (this) {
            a();
            e(2, Long.valueOf(j6), str);
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final void putMultiString(Map map) throws Throwable {
        synchronized (this) {
            try {
                try {
                    a();
                    d(new m(this, 24, map, false), 0L, Long.MAX_VALUE);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // com.growingio.android.sdk.track.ipc.IDataSharer
    public final void putString(String str, String str2) {
        synchronized (this) {
            a();
            e(5, str2, str);
        }
    }
}
