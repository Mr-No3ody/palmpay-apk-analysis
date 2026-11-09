package Kg;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.F;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f5493a = new f();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i7;
        int iMin;
        Intrinsics.checkNotNullParameter(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = e.f5491a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i7 = 5;
        } else {
            i7 = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strZ = (String) e.f5492b.get(loggerName);
        if (strZ == null) {
            strZ = F.z(23, loggerName);
        }
        if (Log.isLoggable(strZ, i7)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int iD = StringsKt.D(message, '\n', i10, 4);
                if (iD == -1) {
                    iD = length;
                }
                while (true) {
                    iMin = Math.min(iD, i10 + 4000);
                    String strSubstring = message.substring(i10, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i7, strZ, strSubstring);
                    if (iMin >= iD) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
