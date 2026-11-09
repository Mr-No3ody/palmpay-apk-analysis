package N3;

import Pa.r0;
import Pd.d;
import Pd.f;
import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flexibank.sdk.q;
import com.transsnet.palmpay.airtime.bean.R2CHistoryItemListBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpRecommendBean;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.core.bean.verify.VerifySafetyAssessmentResultGroup;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6075e;

    public /* synthetic */ c(int i7) {
        this.f6075e = i7;
    }

    @Override // T1.b
    public final void b(BaseViewHolder holder, Object item) {
        BaseViewHolder gone;
        switch (this.f6075e) {
            case 0:
                Intrinsics.checkNotNullParameter(holder, "holder");
                break;
            case 1:
                BillerHistoryItemBean item2 = (BillerHistoryItemBean) item;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item2, "item");
                int i7 = Pd.c.tv_month;
                Long createTime = item2.getCreateTime();
                holder.setText(i7, r0.i0(r0.j0(createTime != null ? createTime.longValue() : 0L)));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof VerifySafetyAssessmentResultGroup) {
                    holder.setText(e.tvGroupTitle, ((VerifySafetyAssessmentResultGroup) item).contentTitle);
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof String) {
                    holder.setText(e.tvItemContent, String.valueOf(item));
                }
                ImageView imageView = (ImageView) holder.getViewOrNull(e.ivIcon);
                if (imageView != null) {
                    imageView.setColorFilter(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, c()));
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(holder, "holder");
                break;
            case 5:
                R2CHistoryItemListBean item3 = (R2CHistoryItemListBean) item;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item3, "item");
                holder.setText(Pd.c.tv_month, r0.i0(r0.j0(item3.createTime)));
                break;
            case 6:
                R2CHistoryItemListBean item4 = (R2CHistoryItemListBean) item;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item4, "item");
                BaseViewHolder text = holder.setText(Pd.c.tv_history_pay_amount, r0.B(item4.receivedAmount, false)).setText(Pd.c.tv_history_order_time, r0.R(item4.createTime)).setText(Pd.c.tv_history_content, f.qt_airtime_str_recharge2cash);
                if (text != null && (gone = text.setGone(Pd.c.tv_history_order_status_desc, false)) != null) {
                    gone.setGone(Pd.c.rtv_history_buy_again, true);
                }
                r0.h1((ImageView) holder.getView(Pd.c.iv_history_icon), item4.icon, Pd.b.qt_r2c_item_logo);
                int i10 = item4.orderStatus;
                if (i10 == 1) {
                    BaseViewHolder text2 = holder.setText(Pd.c.tv_history_order_status_desc, k.core_successful);
                    if (text2 != null) {
                        text2.setTextColorRes(Pd.c.tv_history_order_status_desc, L6.b.ppColorSuccess);
                    }
                } else if (i10 == 2) {
                    BaseViewHolder text3 = holder.setText(Pd.c.tv_history_order_status_desc, f.qt_state_fail);
                    if (text3 != null) {
                        text3.setTextColorRes(Pd.c.tv_history_order_status_desc, L6.b.ppColorError);
                    }
                } else {
                    BaseViewHolder text4 = holder.setText(Pd.c.tv_history_order_status_desc, f.qt_state_pending);
                    if (text4 != null) {
                        text4.setTextColorRes(Pd.c.tv_history_order_status_desc, L6.b.ppColorWarning);
                    }
                }
                break;
            case 7:
                ScheduleTopUpRecommendBean item5 = (ScheduleTopUpRecommendBean) item;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item5, "item");
                String strW0 = r0.w0(item5.getPhone());
                Intrinsics.checkNotNullExpressionValue(strW0, "getPhoneNumberWithoutCountryCode(...)");
                holder.setText(Pd.c.tvScheduleRecommendNumber, CommonExtKt.formatWithPhone(strW0));
                if (!TextUtils.isEmpty(item5.getTag())) {
                    holder.setText(Pd.c.tvTagName, item5.getTag());
                    holder.setGone(Pd.c.tvTagName, false);
                } else {
                    holder.setGone(Pd.c.tvTagName, true);
                }
                break;
            case 8:
                ScheduleTopUpRecommendBean item6 = (ScheduleTopUpRecommendBean) item;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item6, "item");
                String strW1 = r0.w0(item6.getPhone());
                Intrinsics.checkNotNullExpressionValue(strW1, "getPhoneNumberWithoutCountryCode(...)");
                holder.setText(Pd.c.tvScheduleRecommendNumber, CommonExtKt.formatWithPhone(strW1));
                if (!TextUtils.isEmpty(item6.getTag())) {
                    holder.setText(Pd.c.tvTagName, item6.getTag());
                    holder.setGone(Pd.c.tvTagName, false);
                } else {
                    holder.setGone(Pd.c.tvTagName, true);
                }
                break;
            default:
                BettingBillerListItemBean item7 = (BettingBillerListItemBean) item;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item7, "item");
                holder.setText(Pd.c.tvSectionTitle, item7.getHeader());
                break;
        }
    }

    @Override // T1.b
    public final int d() {
        switch (this.f6075e) {
            case 0:
                return 17;
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 17;
            case 5:
                return 2;
            case 6:
                return 1;
            case 7:
                return 1;
            case 8:
                return 2;
            default:
                return 2;
        }
    }

    @Override // T1.b
    public final int e() {
        switch (this.f6075e) {
            case 0:
                return q.fb_layout_cashier_payment_method_empty_item;
            case 1:
                return d.qt_layout_new_history_item_header;
            case 2:
                return g.core_item_safety_assessment_result_group;
            case 3:
                return g.core_item_safety_assessment_result_item;
            case 4:
                return g.core_layout_cashier_payment_method_empty_item;
            case 5:
                return d.qt_layout_new_history_item_header;
            case 6:
                return d.qt_layout_new_history_item;
            case 7:
                return d.qt_item_schedule_recommend_match_list;
            case 8:
                return d.qt_item_schedule_recommend_list;
            default:
                return d.qt_layout_betting_section_header;
        }
    }
}
