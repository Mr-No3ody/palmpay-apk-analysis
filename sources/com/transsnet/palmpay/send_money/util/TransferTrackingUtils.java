package com.transsnet.palmpay.send_money.util;

import C0.G;
import Pa.n0;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.send_money.bean.resp.BannerEntranceBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u001a\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010\u001b\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/send_money/util/TransferTrackingUtils;", "", "<init>", "()V", "PAGE_TYPE_TO_BANK", "", "PAGE_TYPE_TO_PALMPAY", "EVENT_RECENT_INVITE_SHOW", "EVENT_BENEFICIARIES_INVITE_SHOW", "EVENT_SUCCESS_INVITE_SHOW", "EVENT_GRID_SHOW", "EVENT_GRID_CLICK", "logProtectionClick", "", "eventName", FirebaseAnalytics.Param.CONTENT, "logInviteGuideShow", "recipientAccount", "detail", "logGridShow", "pageType", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "Lcom/transsnet/palmpay/send_money/bean/resp/BannerEntranceBean;", "logGridClick", "title", "buildInviteShowDetail", "buildGridDetail", "currentMemberId", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferTrackingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferTrackingUtils.kt\ncom/transsnet/palmpay/send_money/util/TransferTrackingUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1878#2,3:134\n*S KotlinDebug\n*F\n+ 1 TransferTrackingUtils.kt\ncom/transsnet/palmpay/send_money/util/TransferTrackingUtils\n*L\n115#1:134,3\n*E\n"})
public final class TransferTrackingUtils {

    @NotNull
    public static final String EVENT_BENEFICIARIES_INVITE_SHOW = "transfer_beneficiaryies_invite_show";

    @NotNull
    public static final String EVENT_GRID_CLICK = "transfer_grid_click";

    @NotNull
    public static final String EVENT_GRID_SHOW = "transfer_grid_show";

    @NotNull
    public static final String EVENT_RECENT_INVITE_SHOW = "transfer_recent_invite_show";

    @NotNull
    public static final String EVENT_SUCCESS_INVITE_SHOW = "transfer_success_invite_show";

    @NotNull
    public static final TransferTrackingUtils INSTANCE = new TransferTrackingUtils();

    @NotNull
    public static final String PAGE_TYPE_TO_BANK = "To Bank";

    @NotNull
    public static final String PAGE_TYPE_TO_PALMPAY = "To PalmPay";

    private TransferTrackingUtils() {
    }

    private final String buildGridDetail(List<BannerEntranceBean> entries) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int i7 = 0;
        for (Object obj : entries) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            JSONObject jSONObject = new JSONObject();
            String name = ((BannerEntranceBean) obj).getName();
            if (name == null) {
                name = "";
            }
            jSONObject.put("Title", StringsKt.V(y.k(name, "##", " ")).toString());
            jSONObject.put("Display Order", String.valueOf(i10));
            jSONArray.put(jSONObject);
            i7 = i10;
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String buildInviteShowDetail(String recipientAccount, String detail) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (recipientAccount == null) {
            recipientAccount = "";
        }
        jSONObject.put("RecipentAccount", recipientAccount);
        if (detail == null) {
            detail = "";
        }
        jSONObject.put("Detail", detail);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String currentMemberId() {
        User user = BaseApplication.get().getUser();
        String memberId = user != null ? user.getMemberId() : null;
        return memberId == null ? "" : memberId;
    }

    public final void logGridClick(@NotNull String pageType, @Nullable String title) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = (ClickEvent) G.f(EVENT_GRID_CLICK, "page_type", pageType);
        if (title == null) {
            title = "";
        }
        n0VarG.k(clickEvent.add("Title", StringsKt.V(y.k(title, "##", " ")).toString()));
    }

    public final void logGridShow(@NotNull String pageType, @NotNull List<BannerEntranceBean> entries) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (entries.isEmpty()) {
            return;
        }
        n0.g().u(new ViewEvent(EVENT_GRID_SHOW).add("page_type", pageType).add("Detail", buildGridDetail(entries)));
    }

    public final void logInviteGuideShow(@NotNull String eventName, @Nullable String recipientAccount, @Nullable String detail) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (TextUtils.isEmpty(eventName) || TextUtils.isEmpty(detail)) {
            return;
        }
        n0.g().u(new ViewEvent(eventName).add("member_id", currentMemberId()).add("ShowDetail", buildInviteShowDetail(recipientAccount, detail)));
    }

    public final void logProtectionClick(@NotNull String eventName, @Nullable String content) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        n0.g().k((ClickEvent) G.f(eventName, "element_name", content));
    }
}
