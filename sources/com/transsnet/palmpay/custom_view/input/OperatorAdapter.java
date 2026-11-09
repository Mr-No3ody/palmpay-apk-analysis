package com.transsnet.palmpay.custom_view.input;

import M1.j;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.m;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.custom_view.input.OperatorSelectImpl;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B'\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/OperatorAdapter;", "Lcom/transsnet/palmpay/custom_view/input/OperatorSelectImpl;", "T", "LM1/j;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isDarkTheme", "canSuspend", "<init>", "(Ljava/util/List;ZZ)V", "holder", "item", "", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsnet/palmpay/custom_view/input/OperatorSelectImpl;)V", "Z", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OperatorAdapter<T extends OperatorSelectImpl> extends j {
    private final boolean canSuspend;
    private final boolean isDarkTheme;

    public /* synthetic */ OperatorAdapter(List list, boolean z3, boolean z8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z3, (i7 & 4) != 0 ? false : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorAdapter(@NotNull List<T> data, boolean z3, boolean z8) {
        super(t.cv_oprtator_item, data);
        Intrinsics.checkNotNullParameter(data, "data");
        this.isDarkTheme = z3;
        this.canSuspend = z8;
    }

    @Override // M1.j
    public void convert(@NotNull BaseViewHolder holder, @NotNull T item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (!TextUtils.isEmpty(item.getLogo())) {
            ImageView imageView = (ImageView) holder.getView(s.iv_operator_icon);
            com.bumptech.glide.b.e(getContext()).load(item.getLogo()).S(imageView);
            if (this.canSuspend && Intrinsics.c(item.isSuspend(), Boolean.TRUE)) {
                imageView.setAlpha(0.5f);
            } else {
                imageView.setAlpha(1.0f);
            }
        }
        String name = item.getName();
        if (name != null) {
            ((TextView) holder.getView(s.tv_operator_name)).setText(name);
        }
        ImageView imageView2 = (ImageView) holder.getViewOrNull(s.iv_extra_info);
        if (imageView2 != null) {
            boolean z3 = this.isDarkTheme;
            String tipUrl = null;
            OperatorItemExtraInfo operatorItemExtraInfoAddExtraInfo = item.addExtraInfo();
            if (z3) {
                if (operatorItemExtraInfoAddExtraInfo != null) {
                    tipUrl = operatorItemExtraInfoAddExtraInfo.getDarkTipUrl();
                }
            } else if (operatorItemExtraInfoAddExtraInfo != null) {
                tipUrl = operatorItemExtraInfoAddExtraInfo.getTipUrl();
            }
            if (TextUtils.isEmpty(tipUrl)) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                ((m) com.bumptech.glide.b.e(getContext()).load(tipUrl).w(Integer.MIN_VALUE, Integer.MIN_VALUE)).S(imageView2);
            }
        }
    }
}
