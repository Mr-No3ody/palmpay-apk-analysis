package com.transsnet.palmpay.core.bean.rsp;

import C0.G;
import F6.d;
import androidx.camera.video.u;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/LocalNotificationConfigItem;", "", "isLogin", "", "weekShowList", "", "", "monthShowList", "startDate", "", "endTime", "pushCode", "", "pushMessage", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "<init>", "(ZLjava/util/List;Ljava/util/List;JJLjava/lang/String;Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "checkCanShow", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalNotificationConfigRsp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalNotificationConfigRsp.kt\ncom/transsnet/palmpay/core/bean/rsp/LocalNotificationConfigItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1869#2,2:67\n1869#2,2:69\n*S KotlinDebug\n*F\n+ 1 LocalNotificationConfigRsp.kt\ncom/transsnet/palmpay/core/bean/rsp/LocalNotificationConfigItem\n*L\n50#1:67,2\n55#1:69,2\n*E\n"})
public final class LocalNotificationConfigItem {
    private final long endTime;
    private final boolean isLogin;

    @NotNull
    private final List<Integer> monthShowList;

    @JvmField
    @Nullable
    public final String pushCode;

    @JvmField
    @NotNull
    public final PushMessage pushMessage;
    private final long startDate;

    @NotNull
    private final List<Integer> weekShowList;

    public LocalNotificationConfigItem(boolean z3, @NotNull List<Integer> weekShowList, @NotNull List<Integer> monthShowList, long j6, long j10, @Nullable String str, @NotNull PushMessage pushMessage) {
        Intrinsics.checkNotNullParameter(weekShowList, "weekShowList");
        Intrinsics.checkNotNullParameter(monthShowList, "monthShowList");
        Intrinsics.checkNotNullParameter(pushMessage, "pushMessage");
        this.isLogin = z3;
        this.weekShowList = weekShowList;
        this.monthShowList = monthShowList;
        this.startDate = j6;
        this.endTime = j10;
        this.pushCode = str;
        this.pushMessage = pushMessage;
    }

    public final boolean checkCanShow() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.pushCode;
        boolean z3 = this.isLogin;
        PushMessage pushMessage = this.pushMessage;
        d.h("LocalNotification", 3, "checkCanShow: " + str + " isLogin:" + z3 + " " + (pushMessage != null ? pushMessage.content : null));
        long j6 = this.startDate;
        long j10 = this.endTime;
        if (j6 >= j10 || jCurrentTimeMillis < j6 || jCurrentTimeMillis > j10) {
            String str2 = this.pushCode;
            StringBuilder sb2 = new StringBuilder("checkCanShow: not right time ");
            sb2.append(str2);
            sb2.append(" start:");
            sb2.append(j6);
            u.v(sb2, " now:", jCurrentTimeMillis, " end:");
            sb2.append(j10);
            d.h("LocalNotification", 3, sb2.toString());
            return false;
        }
        if (this.isLogin != BaseApplication.hasLogin()) {
            d.h("LocalNotification", 3, "checkCanShow: not right login state " + this.pushCode + " " + this.isLogin);
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        if (this.weekShowList.isEmpty() && this.monthShowList.isEmpty()) {
            return true;
        }
        int i7 = calendar.get(7);
        int i10 = calendar.get(5);
        List<Integer> list = this.weekShowList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (i7 == ((Number) it.next()).intValue()) {
                    return true;
                }
            }
        }
        Iterator<T> it2 = this.monthShowList.iterator();
        while (it2.hasNext()) {
            if (i10 == ((Number) it2.next()).intValue()) {
                return true;
            }
        }
        d.h("LocalNotification", 3, G.o("checkCanShow: not right week/month ", this.pushCode));
        return false;
    }
}
