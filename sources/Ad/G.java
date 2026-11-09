package Ad;

import com.transsnet.palmpay.util.SPUtils;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class G {
    public /* synthetic */ G(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String todayString() {
        String str = new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final boolean canShowFinanceGuidance() {
        return !Intrinsics.c(SPUtils.get().getString("finance_guidance_last_day", ""), todayString());
    }

    private G() {
    }
}
