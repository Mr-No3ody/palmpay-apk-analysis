package com.transsnet.palmpay.core.bean;

import Pa.C0525w;
import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0007J\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/core/bean/TransferByLoanConfirmedPayloadExtras;", "", "<init>", "()V", "EXTRA_JSON", "", "toIntent", "Landroid/content/Intent;", "payload", "", "Lcom/transsnet/palmpay/core/bean/TransferByLoanConfirmedPayload;", "fromPayload", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "fromIntent", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferByLoanConfirmedPayloadExtras {

    @NotNull
    public static final String EXTRA_JSON = "transfer_by_loan_confirmed_payload_json";

    @NotNull
    public static final TransferByLoanConfirmedPayloadExtras INSTANCE = new TransferByLoanConfirmedPayloadExtras();

    private TransferByLoanConfirmedPayloadExtras() {
    }

    @NotNull
    public final Map<String, Object> fromIntent(@NotNull Intent data) {
        Map<String, Object> payloadMap;
        Intrinsics.checkNotNullParameter(data, "data");
        TransferByLoanConfirmedPayload transferByLoanConfirmedPayloadFromPayload = fromPayload(data);
        return (transferByLoanConfirmedPayloadFromPayload == null || (payloadMap = transferByLoanConfirmedPayloadFromPayload.toPayloadMap()) == null) ? G.c() : payloadMap;
    }

    @Nullable
    public final TransferByLoanConfirmedPayload fromPayload(@NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String stringExtra = data.getStringExtra(EXTRA_JSON);
        if (stringExtra == null) {
            return null;
        }
        return (TransferByLoanConfirmedPayload) d0.l(TransferByLoanConfirmedPayload.class, stringExtra);
    }

    @NotNull
    public final Intent toIntent(@NotNull Map<String, ? extends Object> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intent intentPutExtra = new Intent().putExtra(EXTRA_JSON, ((Gson) C0525w.f().f7166b).toJson(payload));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @NotNull
    public final Intent toIntent(@NotNull TransferByLoanConfirmedPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intent intentPutExtra = new Intent().putExtra(EXTRA_JSON, ((Gson) C0525w.f().f7166b).toJson(payload));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }
}
