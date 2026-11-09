package p229p2;

import C0.G;
import android.util.Log;
import com.facebook.common.logging.LoggingDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b implements LoggingDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f41181b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41182a;

    static {
        b bVar = new b();
        bVar.f41182a = 5;
        f41181b = bVar;
    }

    public static void a(int i7, String str, String str2) {
        Log.println(i7, "unknown:" + str, str2);
    }

    public static void b(int i7, String str, String str2, Throwable th) {
        String strO = G.o("unknown:", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append('\n');
        sb2.append(th == null ? "" : Log.getStackTraceString(th));
        Log.println(i7, strO, sb2.toString());
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void d(String str, String str2) {
        a(3, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void e(String str, String str2) {
        a(6, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final int getMinimumLoggingLevel() {
        return this.f41182a;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void i(String str, String str2) {
        a(4, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final boolean isLoggable(int i7) {
        return this.f41182a <= i7;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void log(int i7, String str, String str2) {
        a(i7, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void setMinimumLoggingLevel(int i7) {
        this.f41182a = i7;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void v(String str, String str2) {
        a(2, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void w(String str, String str2) {
        a(5, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void wtf(String str, String str2) {
        a(6, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void d(String str, String str2, Throwable th) {
        b(3, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void e(String str, String str2, Throwable th) {
        b(6, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void i(String str, String str2, Throwable th) {
        b(4, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void v(String str, String str2, Throwable th) {
        b(2, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void w(String str, String str2, Throwable th) {
        b(5, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public final void wtf(String str, String str2, Throwable th) {
        b(6, str, str2, th);
    }
}
