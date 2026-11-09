package p173ld;

import G1.d;
import Kb.c;
import L6.b;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.QueryRecordResp;
import java.util.Calendar;
import p002a.a;
import p159kd.e;
import p159kd.f;
import p159kd.h;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends c implements StickyRecyclerHeadersAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39338e;

    public final void c(t tVar, QueryRecordResp.Record record, int i7) {
        Context context = this.f4984a;
        if (i7 != 1) {
            if (i7 == 2) {
                r0.u1((ImageView) tVar.getView(e.record_photo), record.senderHeadImage, r.cv_avatar_default);
                tVar.setTextColor(e.record_amount, context.getColor(b.ppColorPrimary));
                if (record.getBusinessType() == 7 || record.getBusinessType() == 8) {
                    tVar.b(e.record_info, context.getString(h.sm_bill_detail_refund));
                    int i10 = record.orderStatus;
                    if (i10 == 18) {
                        tVar.c(e.record_status, true);
                        tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                        tVar.b(e.record_status, record.orderStatusDesc);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    } else if (i10 == 16) {
                        tVar.c(e.record_status, false);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    } else {
                        tVar.c(e.record_status, true);
                        tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                        tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                        tVar.b(e.record_status, record.orderStatusDesc);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    }
                } else if (record.getBusinessType() == 5) {
                    tVar.b(e.record_info, context.getString(h.sm_record_list_receive, Jd.c.d(record.senderNickname, record.senderPhone)));
                    int i11 = record.orderStatus;
                    if (i11 == 3) {
                        tVar.c(e.record_status, true);
                        tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                        tVar.b(e.record_status, record.orderStatusDesc);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    } else if (i11 == 5) {
                        tVar.c(e.record_status, false);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    } else {
                        tVar.c(e.record_status, true);
                        tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                        tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                        tVar.b(e.record_status, record.orderStatusDesc);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    }
                } else if (record.getBusinessType() == 4) {
                    tVar.b(e.record_info, context.getString(h.sm_record_list_receive, Jd.c.d(record.senderNickname, record.senderPhone)));
                    int i12 = record.orderStatus;
                    if (i12 == 2) {
                        tVar.c(e.record_status, true);
                        tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                        tVar.b(e.record_status, record.orderStatusDesc);
                        tVar.b(e.record_amount, r0.y(record.amount));
                    } else if (i12 == 5) {
                        tVar.c(e.record_status, false);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    } else {
                        tVar.c(e.record_status, true);
                        tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                        tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                        tVar.b(e.record_status, record.orderStatusDesc);
                        tVar.b(e.record_amount, r0.y(record.amount));
                    }
                } else {
                    tVar.b(e.record_info, context.getString(h.sm_record_list_receive, Jd.c.d(record.senderNickname, record.senderPhone)));
                    if (record.orderStatus == 5) {
                        tVar.b(e.record_status, "");
                        tVar.c(e.record_status, false);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    } else {
                        tVar.c(e.record_status, true);
                        tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                        tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                        tVar.b(e.record_status, record.orderStatusDesc);
                        tVar.b(e.record_amount, r0.y(record.recipientAmount));
                    }
                }
                tVar.b(e.record_time, r0.R(record.getCreateTime().longValue()));
                return;
            }
            return;
        }
        tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextPrimary));
        if (record.getBusinessType() == 7 || record.getBusinessType() == 8) {
            r0.u1((ImageView) tVar.getView(e.record_photo), record.recipientHeadImage, r.cv_avatar_default);
            tVar.b(e.record_info, context.getString(h.sm_bill_detail_revoke));
            int i13 = record.orderStatus;
            if (i13 == 18) {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else if (i13 == 16) {
                tVar.c(e.record_status, false);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            }
        } else if (record.getBusinessType() == 5) {
            r0.u1((ImageView) tVar.getView(e.record_photo), record.recipientHeadImage, r.cv_avatar_default);
            tVar.b(e.record_info, context.getString(h.sm_record_list_send, Jd.c.d(record.recipientFullName, record.recipientPhone)));
            int i14 = record.orderStatus;
            if (i14 == 3) {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else if (i14 == 5) {
                tVar.c(e.record_status, false);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else if (i14 == 15) {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            }
        } else if (record.getBusinessType() == 4) {
            r0.u1((ImageView) tVar.getView(e.record_photo), record.recipientHeadImage, r.cv_avatar_default);
            tVar.b(e.record_info, context.getString(h.sm_record_list_send, Jd.c.d(record.recipientFullName, record.recipientPhone)));
            int i15 = record.orderStatus;
            if (i15 == 2) {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.amount));
            } else if (i15 == 15) {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else if (i15 == 5) {
                tVar.c(e.record_status, false);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.amount));
            }
        } else if (record.getBusinessType() == 3) {
            a.r(record.recipientBankUrl, (ImageView) tVar.getView(e.record_photo));
            String strB0 = r0.b0(record.recipientFirstName, "", record.recipientLastName);
            if (TextUtils.isEmpty(strB0)) {
                tVar.b(e.record_info, context.getString(h.sm_send));
            } else {
                tVar.b(e.record_info, context.getString(h.sm_record_list_send, strB0));
            }
            int i16 = record.orderStatus;
            if (i16 == 3 || i16 == 5) {
                tVar.b(e.record_status, "");
                tVar.c(e.record_status, false);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else if (i16 == 15) {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            }
        } else {
            ImageView imageView = (ImageView) tVar.getView(e.record_photo);
            if (record.getBusinessType() == 6) {
                r0.j1(imageView, record.recipientHeadImage, d.O(r.cv_mobile_wallet_icon));
            } else {
                r0.u1(imageView, record.recipientHeadImage, r.cv_avatar_default);
            }
            tVar.b(e.record_info, context.getString(h.sm_record_list_send, Jd.c.d(record.recipientFullName, record.recipientPhone)));
            int i17 = record.orderStatus;
            if (i17 == 5) {
                tVar.b(e.record_status, "");
                tVar.c(e.record_status, false);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else if (i17 == 15) {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_status, context.getColor(p159kd.b.sm_pending_color));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            } else {
                tVar.c(e.record_status, true);
                tVar.setTextColor(e.record_amount, context.getColor(b.ppColorTextDisable));
                tVar.setTextColor(e.record_status, context.getColor(b.ppColorTextDisable));
                tVar.b(e.record_status, record.orderStatusDesc);
                tVar.b(e.record_amount, r0.I0(record.getPayAmount().longValue()));
            }
        }
        tVar.b(e.record_time, r0.R(record.getCreateTime().longValue()));
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final long getHeaderId(int i7) {
        long jLongValue = ((QueryRecordResp.Record) getItem(i7)).getCreateTime().longValue();
        return r0.h0(jLongValue) + (r0.N0(jLongValue) * 100);
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        String strI0;
        s sVar = (s) viewHolder;
        QueryRecordResp.Record record = (QueryRecordResp.Record) getItem(i7);
        int i10 = e.record_header_month;
        int iH0 = r0.h0(record.getCreateTime().longValue());
        int iN0 = r0.N0(record.getCreateTime().longValue());
        if (Calendar.getInstance().get(1) == iN0) {
            strI0 = r0.i0(iH0 - 1);
        } else {
            strI0 = r0.i0(iH0 - 1) + "," + iN0;
        }
        sVar.b(i10, strI0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        t tVar = (t) viewHolder;
        QueryRecordResp.Record record = (QueryRecordResp.Record) getItem(i7);
        int i10 = this.f39338e;
        if (i10 != 3) {
            c(tVar, record, i10);
        } else if (p367ya.a.d().i().equals(record.sendMemberId)) {
            c(tVar, record, 1);
        } else {
            c(tVar, record, 2);
        }
    }

    @Override // com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        return new s(this, LayoutInflater.from(this.f4984a).inflate(f.sm_record_header_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewInflate = LayoutInflater.from(this.f4984a).inflate(f.sm_record_list_item_layout, viewGroup, false);
        t tVar = new t(this, viewInflate);
        tVar.a(viewInflate);
        return tVar;
    }
}
