package com.transsnet.palmpay.core.rnbridge.bridge;

import Pa.F;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import com.didi.drouter.annotation.Service;
import com.google.firebase.crashlytics.internal.concurrency.b;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import com.transsnet.palmpay.core.bean.BankInfo;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p038ca.e;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/selectBank/select"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/SelectBankBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Ljava/lang/Void;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SelectBankBridge extends SyncBridge<Void> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$1(SelectBankBridge selectBankBridge, int i7, Intent intent) {
        if (i7 != -1) {
            if (i7 != 0) {
                selectBankBridge.handleReject("Something wrong");
                return;
            } else {
                BaseBridge.handleCancel$default(selectBankBridge, null, 1, null);
                return;
            }
        }
        BankInfo bankInfo = intent != null ? (BankInfo) intent.getParcelableExtra("BANK_CARD_INFO") : null;
        Objects.toString(bankInfo);
        if (bankInfo != null) {
            BaseBridge.handleSuccess$default(selectBankBridge, bankInfo, null, 2, null);
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable Void params, @Nullable IBridgeCallback callback) {
        e f28604i;
        Intent intentA = F.a(getActivity(), "/sm/select_bank_activity");
        if (intentA == null) {
            return;
        }
        ComponentCallbacks2 activity = getActivity();
        IActivityResult iActivityResult = activity instanceof IActivityResult ? (IActivityResult) activity : null;
        if (iActivityResult == null || (f28604i = iActivityResult.getF28604i()) == null) {
            return;
        }
        f28604i.f(intentA, new b(this, 27));
    }
}
