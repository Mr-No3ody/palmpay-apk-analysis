package p295tc;

import N8.q0;
import Pa.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecord;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p236pc.c;
import p236pc.e;
import p270rd.C1976t;
import p294tb.W;
import p355xf.C2131j;
import p355xf.t;
import p382zb.I;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f42561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f42563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42564e;

    public f(Context mContext, I i7) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f42560a = mContext;
        this.f42561b = i7;
        this.f42563d = C2131j.b(new C1976t(16));
        this.f42564e = 3;
    }

    public static String a(long j6) {
        return q0.k("+", BaseApplication.getCurrencySymbol(), r0.n0(j6));
    }

    public final ArrayList b() {
        return (ArrayList) this.f42563d.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.f42562c) {
            return b().size();
        }
        int size = b().size();
        int i7 = this.f42564e;
        return size > i7 ? i7 : b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        long j6;
        e holder = (e) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            Object obj = b().get(i7);
            ReferEarnRecord referEarnRecord = (ReferEarnRecord) obj;
            Object value = holder.f42549b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(r0.E0(referEarnRecord.phone));
            Object value2 = holder.f42550c.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(a(referEarnRecord.regRewardAmt));
            Object value3 = holder.f42551d.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((TextView) value3).setText(a(referEarnRecord.activeRewardAmt));
            int i10 = referEarnRecord.status;
            t tVar = holder.f42556j;
            t tVar2 = holder.f42553f;
            if (i10 == 2 || i10 == 9) {
                Object value4 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((TextView) value4).setText(referEarnRecord.remark);
                Object value5 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                h.C((TextView) value5);
                Object value6 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                h.c((View) value6);
                h.c(holder.c());
            } else {
                Object value7 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                h.c((TextView) value7);
                Object value8 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                h.C((View) value8);
                h.C(holder.c());
            }
            int i11 = referEarnRecord.status;
            t tVar3 = holder.f42554g;
            if (i11 == 1 && referEarnRecord.regStatus == 1) {
                Object value9 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((ImageView) value9).setImageResource(c.jp_invitees_selected);
                j6 = referEarnRecord.regRewardAmt;
            } else {
                Object value10 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                ((ImageView) value10).setImageResource(c.jp_invitees_unselected);
                j6 = 0;
            }
            int i12 = referEarnRecord.status;
            t tVar4 = holder.f42555i;
            if (i12 == 1 && referEarnRecord.activeStatus == 1) {
                Object value11 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                ((ImageView) value11).setImageResource(c.jp_invitees_selected);
                j6 += referEarnRecord.activeRewardAmt;
            } else {
                Object value12 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                ((ImageView) value12).setImageResource(c.jp_invitees_unselected);
            }
            int i13 = referEarnRecord.status;
            if (i13 == 2 || i13 == 9) {
                h.c(holder.b());
            } else {
                h.C(holder.b());
                holder.b().setText(a(j6));
            }
            int i14 = referEarnRecord.status;
            if (i14 == 2 || i14 == 9 || (referEarnRecord.regStatus == 1 && referEarnRecord.activeStatus == 1)) {
                h.c(holder.d());
            } else {
                h.C(holder.d());
                holder.d().setTag(Integer.valueOf(i7));
            }
            Object value13 = holder.f42558p.getValue();
            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
            ((TextView) value13).setText(referEarnRecord.regTaskName);
            Object value14 = holder.t.getValue();
            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
            ((TextView) value14).setText(referEarnRecord.activeTaskName);
            if (referEarnRecord.inviteeType == 0) {
                holder.a(true);
            } else {
                Object value15 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                h.c((View) value15);
                holder.a(false);
            }
            Intrinsics.e(obj);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f42560a).inflate(e.jp_item_cs_invitees, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        e eVar = new e(viewInflate);
        eVar.d().setOnClickListener(new W(1, eVar, this));
        return eVar;
    }
}
