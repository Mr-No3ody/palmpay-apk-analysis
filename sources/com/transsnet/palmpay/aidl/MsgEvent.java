package com.transsnet.palmpay.aidl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/aidl/MsgEvent;", "", "<init>", "()V", "MSG_EVENT_REFRESH_TOKEN", "", "MSG_EVENT_MESSAGE_RECEIVED_NOTIFICATION", "MSG_EVENT_MESSAGE_RECEIVED_DATA", "MSG_EVENT_STOP_FOREGROUND", "MSG_EVENT_CANCEL_ALL_NOTIFICATION", "lib_push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MsgEvent {

    @NotNull
    public static final MsgEvent INSTANCE = new MsgEvent();
    public static final int MSG_EVENT_CANCEL_ALL_NOTIFICATION = 104;
    public static final int MSG_EVENT_MESSAGE_RECEIVED_DATA = 102;
    public static final int MSG_EVENT_MESSAGE_RECEIVED_NOTIFICATION = 101;
    public static final int MSG_EVENT_REFRESH_TOKEN = 100;
    public static final int MSG_EVENT_STOP_FOREGROUND = 103;

    private MsgEvent() {
    }
}
