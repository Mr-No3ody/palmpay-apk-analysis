package com.transsnet.palmpay.send_money.util.kkcar;

import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0007J\u0015\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/send_money/util/kkcar/KkCarPassengerAuthStore;", "", "<init>", "()V", "SP_KEY_PASSENGER_AUTH_STATUS", "", "AUTH_STATUS_UNKNOWN", "", "AUTH_STATUS_UNAUTHORIZED", "AUTH_STATUS_OPEN", "AUTH_STATUS_FROZEN", "readAuthStatus", "saveAuthStatus", "", "status", "(Ljava/lang/Integer;)V", "clearQrSnapshotCache", "resolveStorageKey", "resolveMemberId", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KkCarPassengerAuthStore {
    public static final int AUTH_STATUS_FROZEN = 2;
    public static final int AUTH_STATUS_OPEN = 1;
    public static final int AUTH_STATUS_UNAUTHORIZED = 0;
    public static final int AUTH_STATUS_UNKNOWN = -1;

    @NotNull
    public static final KkCarPassengerAuthStore INSTANCE = new KkCarPassengerAuthStore();

    @NotNull
    public static final String SP_KEY_PASSENGER_AUTH_STATUS = "sm_kk_car_passenger_auth_status";

    private KkCarPassengerAuthStore() {
    }

    private final String resolveMemberId() {
        String memberId;
        User user = BaseApplication.getInstance().getUser();
        String string = (user == null || (memberId = user.getMemberId()) == null) ? null : StringsKt.V(memberId).toString();
        if (string == null) {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    private final String resolveStorageKey() {
        String strResolveMemberId = resolveMemberId();
        if (strResolveMemberId == null) {
            return null;
        }
        return strResolveMemberId.concat("_sm_kk_car_passenger_auth_status");
    }

    public final void clearQrSnapshotCache() {
        SPUtils.get().put("sm_kk_car_passenger_qr_code_json", "");
    }

    public final int readAuthStatus() {
        int i7;
        String strResolveStorageKey = resolveStorageKey();
        if (strResolveStorageKey != null && (i7 = SPUtils.get().getInt(strResolveStorageKey, -1)) >= 0 && i7 < 3) {
            return i7;
        }
        return -1;
    }

    public final void saveAuthStatus(@Nullable Integer status) {
        int iIntValue;
        String strResolveStorageKey;
        int authStatus;
        if (status == null || (iIntValue = status.intValue()) < 0 || iIntValue >= 3 || (strResolveStorageKey = resolveStorageKey()) == null) {
            return;
        }
        if (iIntValue == 0 && ((authStatus = readAuthStatus()) == 1 || authStatus == 2)) {
            return;
        }
        SPUtils.get().put(strResolveStorageKey, iIntValue);
    }
}
