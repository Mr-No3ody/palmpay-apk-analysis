package com.transsnet.palmpay.core.rnbridge.bridge;

import F6.d;
import Pa.C0506c;
import android.app.Activity;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.bean.CalendarEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/calendar/open"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/CalendarBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/bean/CalendarEvent$CalendarBean;", "<init>", "()V", "TAG", "", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CalendarBridge extends SyncBridge<CalendarEvent.CalendarBean> {

    @NotNull
    private final String TAG = "calendarBridge-tag";

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable CalendarEvent.CalendarBean params, @Nullable IBridgeCallback callback) {
        Activity activity = getActivity();
        if (activity == null) {
            handleReject("Activity context is null");
            return;
        }
        if (params != null) {
            try {
                if (params.flag == 0) {
                    C0506c.a(activity, params);
                } else {
                    d.h(this.TAG, 3, "CalendarBridge----需要业务方自己实现insert插入功能,请参考WebJsCallback");
                }
            } catch (Exception e10) {
                handleReject("Failed to open calendar: " + e10.getMessage());
                return;
            }
        }
        BaseBridge.handleSuccess$default(this, Boolean.TRUE, null, 2, null);
    }
}
