package Me;

import android.text.SpannableStringBuilder;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x {
    public /* synthetic */ x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final String formatCountdown(long j6, boolean z3) {
        long j10 = j6 / ((long) 1000);
        long j11 = 3600;
        long j12 = j10 / j11;
        long j13 = 60;
        long j14 = (j10 % j11) / j13;
        if (z3) {
            return com.airbnb.lottie.model.layer.d.o(new Object[]{Long.valueOf(j12), Long.valueOf(j14), Long.valueOf(j10 % j13)}, 3, Locale.ENGLISH, "%02d : %02d : %02d", "format(...)");
        }
        return com.airbnb.lottie.model.layer.d.o(new Object[]{Long.valueOf(j12), Long.valueOf(j14)}, 2, Locale.ENGLISH, "%02d : %02d", "format(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence getExpireTime(long j6) {
        String countdown;
        long jCurrentTimeMillis = j6 - System.currentTimeMillis();
        SpanUtils spanUtils = new SpanUtils();
        if (jCurrentTimeMillis <= 0) {
            countdown = "";
        } else {
            long j10 = jCurrentTimeMillis / 86400000;
            if (j10 > 0) {
                countdown = j10 + " Days " + formatCountdown(jCurrentTimeMillis % 86400000, false);
            } else {
                countdown = formatCountdown(jCurrentTimeMillis, true);
            }
        }
        SpannableStringBuilder spannableStringBuilderCreate = spanUtils.append(countdown).create();
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
            long j10 = jCurrentTimeMillis % 60000;
            if (j10 > 1000) {
                return j10 + 500;
            }
        }
        return 1000L;
    }

    private x() {
    }
}
