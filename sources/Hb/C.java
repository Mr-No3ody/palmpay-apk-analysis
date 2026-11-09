package Hb;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class C {
    public /* synthetic */ C(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence getExpireTime(Context context, long j6) {
        String strMillis2String;
        long jCurrentTimeMillis = j6 - System.currentTimeMillis();
        SpanUtils spanUtilsI = C0.G.i("Expires in ");
        if (jCurrentTimeMillis <= 0) {
            strMillis2String = "00:00:00";
        } else if (jCurrentTimeMillis > 86400000) {
            long timeSpanByNow = TimeUtils.getTimeSpanByNow(j6, 86400000);
            if (timeSpanByNow > 1) {
                strMillis2String = timeSpanByNow + " days";
            } else {
                strMillis2String = "1 day";
            }
        } else {
            strMillis2String = TimeUtils.millis2String(jCurrentTimeMillis, getTimeFormatInSecond());
        }
        SpannableStringBuilder spannableStringBuilderCreate = spanUtilsI.append(strMillis2String).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorWarning, context)).create();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
        return spannableStringBuilderCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getRefreshTime(long j6) {
        long jCurrentTimeMillis = j6 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            return 0L;
        }
        if (jCurrentTimeMillis > 86400000) {
            long j10 = jCurrentTimeMillis % ((long) 3600000);
            if (j10 > 1000) {
                return j10 + 500;
            }
        }
        return 1000L;
    }

    private final SimpleDateFormat getTimeFormatInSecond() {
        return (SimpleDateFormat) E.f3796i.getValue();
    }

    private C() {
    }
}
