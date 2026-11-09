package p198n5;

import C0.G;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.growingio.android.sdk.track.log.ILogger;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements ILogger {
    public final void a(int i7, String str, Throwable th, String str2, Object... objArr) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 != null && str2.length() == 0) {
            str2 = null;
        }
        if (str2 != null) {
            if (objArr != null && objArr.length > 0) {
                try {
                    str2 = String.format(str2, objArr);
                } catch (Exception unused) {
                }
            }
            if (th != null) {
                StringBuilder sbT = G.t(str2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                StringWriter stringWriter = new StringWriter(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                sbT.append(stringWriter.toString());
                str2 = sbT.toString();
            }
        } else {
            if (th == null) {
                return;
            }
            StringWriter stringWriter2 = new StringWriter(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
            th.printStackTrace(printWriter2);
            printWriter2.flush();
            str2 = stringWriter2.toString();
        }
        b(i7, str, str2, th);
    }

    public abstract void b(int i7, String str, String str2, Throwable th);

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void d(String str, String str2, Object... objArr) {
        a(3, str, null, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void e(String str, String str2, Object... objArr) {
        a(6, str, null, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void i(String str, String str2, Object... objArr) {
        a(4, str, null, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void v(String str, String str2, Object... objArr) {
        a(2, str, null, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void w(String str, String str2, Object... objArr) {
        a(5, str, null, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void wtf(String str, String str2, Object... objArr) {
        a(7, str, null, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void d(String str, Throwable th, String str2, Object... objArr) {
        a(3, str, th, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void e(String str, Throwable th, String str2, Object... objArr) {
        a(6, str, th, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void i(String str, Throwable th, String str2, Object... objArr) {
        a(4, str, th, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void v(String str, Throwable th, String str2, Object... objArr) {
        a(2, str, th, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void w(String str, Throwable th, String str2, Object... objArr) {
        a(5, str, th, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void wtf(String str, Throwable th, String str2, Object... objArr) {
        a(7, str, th, str2, objArr);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void d(String str, Throwable th) {
        a(3, str, th, null, new Object[0]);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void e(String str, Throwable th) {
        a(6, str, th, null, new Object[0]);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void i(String str, Throwable th) {
        a(4, str, th, null, new Object[0]);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void v(String str, Throwable th) {
        a(2, str, th, null, new Object[0]);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void w(String str, Throwable th) {
        a(5, str, th, null, new Object[0]);
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final void wtf(String str, Throwable th) {
        a(7, str, th, null, new Object[0]);
    }
}
