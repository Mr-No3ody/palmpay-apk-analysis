package com.palmpay.lib.apm.launchcounter.instrumentation;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.palmpay.lib.apm.LibApm;
import com.palmpay.lib.apm.launchcounter.TimeCounterManager;
import com.palmpay.lib.apm.launchcounter.util.Reflector;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyHandlerCallback implements Handler.Callback {
    private static final int EXECUTE_TRANSACTION = 159;
    private static final int LAUNCH_ACTIVITY = 100;
    private static final String LAUNCH_ITEM_CLASS = "android.app.servertransaction.ResumeActivityItem";
    private static final int PAUSE_ACTIVITY = 101;
    private static final int PAUSE_ACTIVITY_FINISHING = 102;
    private static final String PAUSE_ITEM_CLASS = "android.app.servertransaction.PauseActivityItem";
    private static final String TAG = "ProxyHandlerCallback";
    public final Handler mHandler;
    private final Handler.Callback mOldCallback;

    public ProxyHandlerCallback(Handler.Callback callback, Handler handler) {
        this.mOldCallback = callback;
        this.mHandler = handler;
    }

    private int handlerActivity(Message message) {
        String transactionName = parseTransactionName(message);
        if (transactionName != null) {
            if (TextUtils.equals(transactionName, LAUNCH_ITEM_CLASS)) {
                TimeCounterManager.get().onActivityLaunch();
                return 100;
            }
            if (TextUtils.equals(transactionName, PAUSE_ITEM_CLASS)) {
                TimeCounterManager.get().onActivityPause();
                return 101;
            }
        }
        return message.what;
    }

    private String parseMessage(Message message) {
        int i7 = message.what;
        if (i7 == 113) {
            return u.g(i7, ":RECEIVER ");
        }
        if (i7 == 114) {
            return u.g(i7, ":CREATE_SERVICE ");
        }
        if (i7 == 116) {
            return u.g(i7, ":STOP_SERVICE ");
        }
        if (i7 == 149) {
            return u.g(i7, ":ENTER_ANIMATION_COMPLETE ");
        }
        if (i7 == 155) {
            return u.g(i7, ":ATTACH_AGENT");
        }
        if (i7 == EXECUTE_TRANSACTION) {
            return i7 + ":EXECUTE_TRANSACTION:" + parseTransactionName(message);
        }
        switch (i7) {
            case 119:
                return u.g(i7, ":CLEAN_UP_CONTEXT ");
            case KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP /* 120 */:
                return u.g(i7, ":GC_WHEN_IDLE ");
            case 121:
                return u.g(i7, ":BIND_SERVICE ");
            case 122:
                return u.g(i7, ":UNBIND_SERVICE ");
            default:
                return String.valueOf(i7);
        }
    }

    private String parseTransactionName(Message message) {
        Object objCall = Reflector.QuietReflector.with(message.obj).method("getLifecycleStateRequest", new Class[0]).call(new Object[0]);
        if (objCall != null) {
            return objCall.getClass().getCanonicalName();
        }
        return null;
    }

    private void postDispatch(int i7) {
        switch (i7) {
            case 100:
                TimeCounterManager.get().onActivityLaunched();
                break;
            case 101:
            case 102:
                TimeCounterManager.get().onActivityPaused();
                break;
        }
    }

    private int preDispatch(Message message) {
        int i7 = message.what;
        if (i7 == EXECUTE_TRANSACTION) {
            return handlerActivity(message);
        }
        switch (i7) {
            case 100:
                TimeCounterManager.get().onActivityLaunch();
                break;
            case 101:
            case 102:
                TimeCounterManager.get().onActivityPause();
                break;
        }
        return message.what;
    }

    private void printHeavyMessage(Message message, long j6) {
        LibApm libApm = LibApm.INSTANCE;
        if (!libApm.getPrintHeavyMessage() || System.currentTimeMillis() - j6 <= libApm.getHeavyMessageThresholdMs()) {
            return;
        }
        parseMessage(message);
        Objects.toString(message.getTarget());
        Objects.toString(message.obj);
        Objects.toString(message.getCallback());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            long jCurrentTimeMillis = LibApm.INSTANCE.getPrintHeavyMessage() ? System.currentTimeMillis() : 0L;
            int iPreDispatch = preDispatch(message);
            if (message.getCallback() != null) {
                message.getCallback().run();
                postDispatch(iPreDispatch);
            } else {
                Handler.Callback callback = this.mOldCallback;
                if (callback != null && callback.handleMessage(message)) {
                    postDispatch(iPreDispatch);
                    printHeavyMessage(message, jCurrentTimeMillis);
                    return true;
                }
                this.mHandler.handleMessage(message);
                postDispatch(iPreDispatch);
            }
            printHeavyMessage(message, jCurrentTimeMillis);
        } catch (RuntimeException e10) {
            e10.toString();
            throw e10;
        } catch (Exception e11) {
            e11.toString();
        }
        return true;
    }
}
