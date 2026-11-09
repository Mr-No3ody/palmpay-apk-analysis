package com.transsnet.palmpay.credit.rnbridge;

import F6.d;
import Sd.b;
import android.app.Activity;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.bean.FaceRecParam;
import com.transsnet.palmpay.credit.bean.FaceRecResult;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFaceRecFragment;
import com.transsnet.palmpay.util.PermissionUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/credit/faceRec"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/CreditFaceRecBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/bean/FaceRecParam;", "<init>", "()V", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", "onHandle", "(Lcom/transsnet/palmpay/credit/bean/FaceRecParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "onReceiveEventBus", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreditFaceRecBridge extends SyncBridge<FaceRecParam> {

    @NotNull
    public static final String TAG = "CreditFaceRecBridge";

    public CreditFaceRecBridge() {
        d.h(TAG, 3, "init >>> " + this);
        if (c.b().e(this)) {
            return;
        }
        c.b().j(this);
    }

    @Override // com.palmpay.lib.bridge.SyncBridge, com.palmpay.lib.bridge.BaseBridge, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        d.h(TAG, 3, "onDestroy >>>");
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceiveEventBus(@Nullable MessageEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getEventType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 517) {
            d.h(TAG, 3, "onReceiveEventBus >>> faceRec result: " + event.getEventObj() + ", " + event.getEventContent());
            Object eventObj = event.getEventObj();
            String eventContent = event.getEventContent();
            FaceRecResult faceRecResult = new FaceRecResult(null, null, null, 7, null);
            faceRecResult.setResult(eventObj);
            faceRecResult.setParam(Intrinsics.c(eventObj, 1) ? eventContent : null);
            if (Intrinsics.c(eventObj, 1)) {
                eventContent = null;
            }
            faceRecResult.setErrorMessage(eventContent);
            BaseBridge.handleSuccess$default(this, faceRecResult, null, 2, null);
            c.b().l(this);
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable FaceRecParam params, @Nullable IBridgeCallback callback) {
        Integer intOrNull;
        d.h(TAG, 3, ">>> routerParam=" + params + "}");
        if (getActivity() == null) {
            handleFail(new IllegalStateException("current activity is null"));
            return;
        }
        int iIntValue = 0;
        if ((params != null ? params.getScene() : null) != null) {
            Postcard postcardBuild = ARouter.getInstance().build("/main/palm_safe_scan_face");
            String scene = params.getScene();
            if (scene != null && (intOrNull = StringsKt.toIntOrNull(scene)) != null) {
                iIntValue = intOrNull.intValue();
            }
            postcardBuild.withInt("extra_type", iIntValue).withString("extra_flag", "1").withString("business_data", null).navigation();
            return;
        }
        Activity activity = getActivity();
        b bVar = new b(this, 24);
        d.h("LoanCreditFaceRecManager", 3, "startFaceRec >>> " + activity);
        if (!(activity instanceof E)) {
            bVar.onFaceRecFailed(PushMessage.MESSAGE_TYPE_CASH_IN, "activity is illegal");
            return;
        }
        Z supportFragmentManager = ((E) activity).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        d.h("LoanCreditFaceRecManager", 3, "getFaceRecFragment >>>>");
        LoanCreditFaceRecFragment loanCreditFaceRecFragment = (LoanCreditFaceRecFragment) supportFragmentManager.E("LoanCreditFaceRecManager");
        if (loanCreditFaceRecFragment == null) {
            loanCreditFaceRecFragment = new LoanCreditFaceRecFragment();
            C1161a c1161a = new C1161a(supportFragmentManager);
            c1161a.d(0, loanCreditFaceRecFragment, "LoanCreditFaceRecManager", 1);
            c1161a.j();
        }
        d.h(loanCreditFaceRecFragment.f27317a, 3, "startFaceRec >>>");
        try {
            loanCreditFaceRecFragment.f30333j = bVar;
            if (PermissionUtils.isGranted("android.permission.CAMERA")) {
                loanCreditFaceRecFragment.t();
            } else {
                loanCreditFaceRecFragment.f30335p.a(new String[]{"android.permission.CAMERA"});
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
