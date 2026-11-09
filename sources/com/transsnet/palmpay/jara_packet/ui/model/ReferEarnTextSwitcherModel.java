package com.transsnet.palmpay.jara_packet.ui.model;

import Pa.r0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnOrderLatestResp;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236pc.c;
import p236pc.d;
import p236pc.e;
import p236pc.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/model/ReferEarnTextSwitcherModel;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnOrderLatestResp;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setModel", "(Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnOrderLatestResp;)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnTextSwitcherModel extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f31980d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnTextSwitcherModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = View.inflate(context, e.jp_layout_cs_text_switcher_model, this);
        this.f31979c = (TextView) viewInflate.findViewById(d.jp_tv_switcher);
        this.f31980d = (ImageView) viewInflate.findViewById(d.jp_iv_switcher);
        return viewInflate;
    }

    public final void setModel(@NotNull ReferEarnOrderLatestResp data) {
        Intrinsics.checkNotNullParameter(data, "data");
        r0.u1(this.f31980d, data.headPortrait, c.jp_user_def);
        TextView textView = this.f31979c;
        if (textView != null) {
            textView.setText(getResources().getString(f.jp_sb_got_money, data.memberName, r0.F(data.amount)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnTextSwitcherModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ReferEarnTextSwitcherModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnTextSwitcherModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
