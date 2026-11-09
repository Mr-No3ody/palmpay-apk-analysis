package we;

import Bc.C0105b;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterInfo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCouponCombo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCouponDetailInfo;
import com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p141j9.C1798f;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends BaseViewHolder implements RewardsBannerAdapterHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.k f43491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f43492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View itemView, boolean z3, C1798f clearRewardResultCache) {
        View viewM;
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(clearRewardResultCache, "clearRewardResultCache");
        this.f43490a = z3;
        this.f43492c = new k(itemView, clearRewardResultCache, 0);
        int i7 = Ac.e.ivBg;
        ImageView imageView = (ImageView) p059e1.a.m(i7, itemView);
        if (imageView != null && (viewM = p059e1.a.m((i7 = Ac.e.vCoupon1), itemView)) != null) {
            C0105b c0105bA = C0105b.a(viewM);
            i7 = Ac.e.vCoupon2;
            View viewM2 = p059e1.a.m(i7, itemView);
            if (viewM2 != null) {
                C0105b c0105bA2 = C0105b.a(viewM2);
                i7 = Ac.e.vCoupon3;
                View viewM3 = p059e1.a.m(i7, itemView);
                if (viewM3 != null) {
                    this.f43491b = new Bc.k((ConstraintLayout) itemView, imageView, c0105bA, c0105bA2, C0105b.a(viewM3), 4);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i7)));
    }

    public final void a(C0105b c0105b, HomeRewardsCouponDetailInfo homeRewardsCouponDetailInfo) {
        if (homeRewardsCouponDetailInfo != null) {
            if (c0105b != null) {
                ((TextView) c0105b.f664d).setText(homeRewardsCouponDetailInfo.couponTitle);
            }
            if (c0105b != null) {
                TextView textView = (TextView) c0105b.f663c;
                Long l5 = homeRewardsCouponDetailInfo.couponNominaValue;
                String strF = r0.F(l5 != null ? l5.longValue() : 0L);
                Intrinsics.checkNotNullExpressionValue(strF, "getAmountThousandNoPointWithCurrency(...)");
                textView.setText(y.k(strF, ".00", ""));
            }
            if (c0105b != null) {
                ((ConstraintLayout) c0105b.f667g).setOnClickListener(this.f43492c);
            }
            if (c0105b != null) {
                ((ConstraintLayout) c0105b.f667g).setTag(homeRewardsCouponDetailInfo);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    @Override // com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder
    public final void bindRewardsCenterData(HomeRewardsCenterInfo data, View.OnClickListener claimListener) {
        C0105b c0105b;
        ConstraintLayout constraintLayout;
        C0105b c0105b2;
        ConstraintLayout constraintLayout2;
        C0105b c0105b3;
        ImageView imageView;
        C0105b c0105b4;
        ImageView imageView2;
        C0105b c0105b5;
        ImageView imageView3;
        C0105b c0105b6;
        ImageView imageView4;
        C0105b c0105b7;
        ImageView imageView5;
        C0105b c0105b8;
        ImageView imageView6;
        C0105b c0105b9;
        ConstraintLayout constraintLayout3;
        Unit unit;
        C0105b c0105b10;
        ConstraintLayout constraintLayout4;
        C0105b c0105b11;
        ConstraintLayout constraintLayout5;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(claimListener, "claimListener");
        HomeRewardsCouponCombo couponCombo = data.getCouponCombo();
        if (couponCombo != null) {
            String str = (!this.f43490a || TextUtils.isEmpty(couponCombo.darkBackGroupUrl)) ? couponCombo.backGroupUrl : couponCombo.darkBackGroupUrl;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            Unit unit2 = null;
            Bc.k kVar = this.f43491b;
            if (!zIsEmpty) {
                r0.l1(str, kVar != null ? (ImageView) kVar.f748b : null);
            }
            List<HomeRewardsCouponDetailInfo> list = couponCombo.couponDetailInfoList;
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    a(kVar != null ? (C0105b) kVar.f752f : null, list.get(0));
                    if (kVar != null && (c0105b11 = (C0105b) kVar.f752f) != null && (constraintLayout5 = (ConstraintLayout) c0105b11.f662b) != null) {
                        ViewParent parent = constraintLayout5.getParent();
                        ConstraintLayout constraintLayout6 = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
                        androidx.constraintlayout.widget.m mVar = new androidx.constraintlayout.widget.m();
                        mVar.e(constraintLayout6);
                        mVar.k(constraintLayout5.getId()).f15747e.f15785e0 = list.size() == 1 ? 0.5f : 0.0f;
                        mVar.b(constraintLayout6);
                    }
                    HomeRewardsCouponDetailInfo homeRewardsCouponDetailInfo = (HomeRewardsCouponDetailInfo) CollectionsKt.G(1, list);
                    if (homeRewardsCouponDetailInfo != null) {
                        a(kVar != null ? (C0105b) kVar.f750d : null, homeRewardsCouponDetailInfo);
                        if (kVar == null || (c0105b10 = (C0105b) kVar.f750d) == null || (constraintLayout4 = (ConstraintLayout) c0105b10.f667g) == null) {
                            unit = null;
                        } else {
                            p220oa.h.s(constraintLayout4, true);
                            unit = Unit.f38893a;
                        }
                        if (unit == null) {
                            if (kVar != null) {
                                p220oa.h.s(constraintLayout, false);
                                Unit unit3 = Unit.f38893a;
                            }
                        }
                    } else if (kVar != null && (c0105b = (C0105b) kVar.f750d) != null && (constraintLayout = (ConstraintLayout) c0105b.f667g) != null) {
                        p220oa.h.s(constraintLayout, false);
                        Unit unit4 = Unit.f38893a;
                    }
                    HomeRewardsCouponDetailInfo homeRewardsCouponDetailInfo2 = (HomeRewardsCouponDetailInfo) CollectionsKt.G(2, list);
                    if (homeRewardsCouponDetailInfo2 != null) {
                        a(kVar != null ? (C0105b) kVar.f749c : null, homeRewardsCouponDetailInfo2);
                        if (kVar != null && (c0105b9 = (C0105b) kVar.f749c) != null && (constraintLayout3 = (ConstraintLayout) c0105b9.f667g) != null) {
                            p220oa.h.s(constraintLayout3, true);
                            unit2 = Unit.f38893a;
                        }
                        if (unit2 == null) {
                            if (kVar != null) {
                                p220oa.h.s(constraintLayout2, false);
                                Unit unit5 = Unit.f38893a;
                            }
                        }
                    } else if (kVar != null && (c0105b2 = (C0105b) kVar.f749c) != null && (constraintLayout2 = (ConstraintLayout) c0105b2.f667g) != null) {
                        p220oa.h.s(constraintLayout2, false);
                        Unit unit6 = Unit.f38893a;
                    }
                    int size = list.size();
                    if (size == 1) {
                        if (kVar == null || (c0105b3 = (C0105b) kVar.f752f) == null || (imageView = (ImageView) c0105b3.f666f) == null) {
                            return;
                        }
                        imageView.setImageResource(Ac.d.main_reward_coupon_item_bg_big);
                        return;
                    }
                    if (size == 2) {
                        if (kVar != null && (c0105b5 = (C0105b) kVar.f752f) != null && (imageView3 = (ImageView) c0105b5.f666f) != null) {
                            imageView3.setImageResource(Ac.d.main_reward_coupon_item_bg_big);
                        }
                        if (kVar == null || (c0105b4 = (C0105b) kVar.f750d) == null || (imageView2 = (ImageView) c0105b4.f666f) == null) {
                            return;
                        }
                        imageView2.setImageResource(Ac.d.main_reward_coupon_item_bg_big);
                        return;
                    }
                    if (kVar != null && (c0105b8 = (C0105b) kVar.f752f) != null && (imageView6 = (ImageView) c0105b8.f666f) != null) {
                        imageView6.setImageResource(Ac.d.main_reward_coupon_item_bg);
                    }
                    if (kVar != null && (c0105b7 = (C0105b) kVar.f750d) != null && (imageView5 = (ImageView) c0105b7.f666f) != null) {
                        imageView5.setImageResource(Ac.d.main_reward_coupon_item_bg);
                    }
                    if (kVar == null || (c0105b6 = (C0105b) kVar.f749c) == null || (imageView4 = (ImageView) c0105b6.f666f) == null) {
                        return;
                    }
                    imageView4.setImageResource(Ac.d.main_reward_coupon_item_bg);
                }
            }
        }
    }
}
