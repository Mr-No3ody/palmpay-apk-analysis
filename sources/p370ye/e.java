package p370ye;

import Ac.f;
import L6.b;
import Pa.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneTaskRewardsRecord;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;
import p327vd.c;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f44323b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44323b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        d holder = (d) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        PalmZoneTaskRewardsRecord palmZoneTaskRewardsRecord = (PalmZoneTaskRewardsRecord) this.f44323b.get(i7);
        holder.f44319c.setText(palmZoneTaskRewardsRecord.itemName);
        Integer num = palmZoneTaskRewardsRecord.prizeStatus;
        Context context = this.f44322a;
        TextView textView = holder.f44318b;
        if (num != null) {
            h.C(textView);
            Integer num2 = palmZoneTaskRewardsRecord.prizeStatus;
            if (num2 != null && num2.intValue() == 1) {
                textView.setText(context.getString(k.core_received));
                textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorSuccess, context));
            } else if ((num2 != null && num2.intValue() == 4) || (num2 != null && num2.intValue() == 0)) {
                Integer num3 = palmZoneTaskRewardsRecord.itemType;
                if (num3 != null && num3.intValue() == 100) {
                    textView.setText(context.getString(k.core_received));
                    textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorSuccess, context));
                } else {
                    h.c(textView);
                }
            } else if ((num2 != null && num2.intValue() == 2) || (num2 != null && num2.intValue() == 3)) {
                textView.setText(context.getString(k.core_failed));
                textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorError, context));
            } else {
                h.c(textView);
            }
        } else {
            h.c(textView);
        }
        Integer num4 = palmZoneTaskRewardsRecord.itemType;
        TextView textView2 = holder.f44320d;
        if (num4 != null && num4.intValue() == 3) {
            textView2.setText(String.valueOf(palmZoneTaskRewardsRecord.nominalValue));
        } else {
            Long l5 = palmZoneTaskRewardsRecord.nominalValue;
            textView2.setText(r0.B(l5 != null ? l5.longValue() : 0L, false));
        }
        Long l6 = palmZoneTaskRewardsRecord.gmtModified;
        holder.f44317a.setText(r0.R(l6 != null ? l6.longValue() : 0L));
        holder.itemView.setOnClickListener(new c(palmZoneTaskRewardsRecord.itemType, 16));
        holder.f44321e.setBackgroundColor(CommonViewExtKt.colorInt(b.ppColorDividerLine, context));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f44322a).inflate(f.main_layout_palmzone_reward_item_v2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new d(viewInflate);
    }
}
