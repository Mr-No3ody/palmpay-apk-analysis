package we;

import Bc.A;
import Pa.r0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterInfo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCoupon;
import com.transsnet.palmpay.main.export.bean.rsp.RewardsInfo;
import com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p141j9.C1798f;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends BaseViewHolder implements RewardsBannerAdapterHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewBinding f43494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View.OnClickListener f43495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View itemView, C1798f clearRewardResultCache, int i7) {
        super(itemView);
        this.f43493a = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(clearRewardResultCache, "clearRewardResultCache");
                super(itemView);
                this.f43495c = new k(itemView, clearRewardResultCache, 2);
                int i10 = Ac.e.barrierCouponBg;
                if (((Barrier) p059e1.a.m(i10, itemView)) != null) {
                    i10 = Ac.e.btnRight;
                    PpButton ppButton = (PpButton) p059e1.a.m(i10, itemView);
                    if (ppButton != null) {
                        i10 = Ac.e.glCouponSplit;
                        if (((Guideline) p059e1.a.m(i10, itemView)) != null) {
                            i10 = Ac.e.llCouponBg;
                            if (((LinearLayout) p059e1.a.m(i10, itemView)) != null) {
                                i10 = Ac.e.tvCouponAmount;
                                TextView textView = (TextView) p059e1.a.m(i10, itemView);
                                if (textView != null) {
                                    i10 = Ac.e.tvCouponDesc;
                                    TextView textView2 = (TextView) p059e1.a.m(i10, itemView);
                                    if (textView2 != null) {
                                        i10 = Ac.e.tvCouponTitle;
                                        TextView textView3 = (TextView) p059e1.a.m(i10, itemView);
                                        if (textView3 != null) {
                                            i10 = Ac.e.vCouponLeftBg;
                                            if (((AppCompatImageView) p059e1.a.m(i10, itemView)) != null) {
                                                i10 = Ac.e.vCouponRightBg;
                                                if (((AppCompatImageView) p059e1.a.m(i10, itemView)) != null) {
                                                    this.f43494b = new A((ConstraintLayout) itemView, ppButton, textView, textView2, textView3, 1);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i10)));
            default:
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(clearRewardResultCache, "clearRewardResultCache");
                this.f43495c = new k(itemView, clearRewardResultCache, 1);
                int i11 = Ac.e.barrierCouponBg;
                if (((Barrier) p059e1.a.m(i11, itemView)) != null) {
                    i11 = Ac.e.btnRight;
                    PpButton ppButton2 = (PpButton) p059e1.a.m(i11, itemView);
                    if (ppButton2 != null) {
                        i11 = Ac.e.glCouponSplit;
                        if (((Guideline) p059e1.a.m(i11, itemView)) != null) {
                            i11 = Ac.e.llCouponBg;
                            if (((LinearLayout) p059e1.a.m(i11, itemView)) != null) {
                                i11 = Ac.e.tvCouponAmount;
                                TextView textView4 = (TextView) p059e1.a.m(i11, itemView);
                                if (textView4 != null) {
                                    i11 = Ac.e.tvCouponDesc;
                                    TextView textView5 = (TextView) p059e1.a.m(i11, itemView);
                                    if (textView5 != null) {
                                        i11 = Ac.e.tvCouponTitle;
                                        TextView textView6 = (TextView) p059e1.a.m(i11, itemView);
                                        if (textView6 != null) {
                                            i11 = Ac.e.vCouponLeftBg;
                                            if (((ImageView) p059e1.a.m(i11, itemView)) != null) {
                                                i11 = Ac.e.vCouponRightBg;
                                                if (((ImageView) p059e1.a.m(i11, itemView)) != null) {
                                                    this.f43494b = new A((ConstraintLayout) itemView, ppButton2, textView4, textView5, textView6, 0);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i11)));
        }
    }

    @Override // com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder
    public final void bindRewardsCenterData(HomeRewardsCenterInfo data, View.OnClickListener claimListener) {
        String string;
        String string2;
        Long l5;
        String str;
        String str2;
        String string3;
        String string4;
        Long l6;
        String str3;
        String str4;
        switch (this.f43493a) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(claimListener, "claimListener");
                A a3 = (A) this.f43494b;
                String str5 = "";
                if (a3 != null) {
                    TextView textView = a3.f587f;
                    RewardsInfo oldDto = data.getOldDto();
                    if (oldDto == null || (str2 = oldDto.showTitle) == null) {
                        str2 = "";
                    }
                    textView.setText(str2);
                }
                if (a3 != null) {
                    TextView textView2 = a3.f586e;
                    RewardsInfo oldDto2 = data.getOldDto();
                    if (oldDto2 == null || (str = oldDto2.showContent) == null) {
                        str = "";
                    }
                    textView2.setText(str);
                }
                SpanUtils fontSize = new SpanUtils().append(BaseApplication.getCurrencySymbol()).setFontSize(CommonViewExtKt.getDp(16));
                RewardsInfo oldDto3 = data.getOldDto();
                String strA = r0.A((oldDto3 == null || (l5 = oldDto3.couponNominaValue) == null) ? 0L : l5.longValue());
                Intrinsics.checkNotNullExpressionValue(strA, "getAmountString(...)");
                SpannableStringBuilder spannableStringBuilderCreate = fontSize.append(String.valueOf(y.k(strA, ".00", ""))).setFontSize(CommonViewExtKt.getDp(24)).create();
                if (a3 != null) {
                    a3.f585d.setText(spannableStringBuilderCreate);
                }
                if (a3 != null) {
                    a3.f584c.b(false);
                }
                RewardsInfo oldDto4 = data.getOldDto();
                if (!"Unissued".equalsIgnoreCase(oldDto4 != null ? oldDto4.couponStatus : null)) {
                    if (a3 != null) {
                        PpButton ppButton = a3.f584c;
                        Context context = this.itemView.getContext();
                        if (context != null && (string = context.getString(p025ba.k.core_use)) != null) {
                            str5 = string;
                        }
                        ppButton.setText(str5);
                    }
                    if (a3 != null) {
                        a3.f584c.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, this.itemView.getContext()));
                    }
                    if (a3 != null) {
                        a3.f584c.setBackgroundResource(L6.d.lib_ui_button_bg_stroke_corner_3);
                    }
                    if (a3 != null) {
                        a3.f584c.setTag(data.getOldDto());
                    }
                    if (a3 != null) {
                        a3.f584c.setOnClickListener((k) this.f43495c);
                    }
                } else {
                    if (a3 != null) {
                        PpButton ppButton2 = a3.f584c;
                        Context context2 = this.itemView.getContext();
                        if (context2 != null && (string2 = context2.getString(p025ba.k.core_claim)) != null) {
                            str5 = string2;
                        }
                        ppButton2.setText(str5);
                    }
                    if (a3 != null) {
                        a3.f584c.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorButtonTextWhite, this.itemView.getContext()));
                    }
                    if (a3 != null) {
                        a3.f584c.setBackgroundResource(L6.d.lib_ui_button_bg_corner_primary_4);
                    }
                    if (a3 != null) {
                        a3.f584c.setTag(data.getOldDto());
                    }
                    if (a3 != null) {
                        a3.f584c.setOnClickListener(claimListener);
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(claimListener, "claimListener");
                A a10 = (A) this.f43494b;
                String str6 = "";
                if (a10 != null) {
                    TextView textView3 = a10.f587f;
                    HomeRewardsCoupon coupon = data.getCoupon();
                    if (coupon == null || (str4 = coupon.couponTitle) == null) {
                        str4 = "";
                    }
                    textView3.setText(str4);
                }
                if (a10 != null) {
                    TextView textView4 = a10.f586e;
                    HomeRewardsCoupon coupon2 = data.getCoupon();
                    if (coupon2 == null || (str3 = coupon2.couponContent) == null) {
                        str3 = "";
                    }
                    textView4.setText(str3);
                }
                SpanUtils fontSize2 = new SpanUtils().append(BaseApplication.getCurrencySymbol()).setFontSize(CommonViewExtKt.getDp(16));
                HomeRewardsCoupon coupon3 = data.getCoupon();
                String strA2 = r0.A((coupon3 == null || (l6 = coupon3.couponNominaValue) == null) ? 0L : l6.longValue());
                Intrinsics.checkNotNullExpressionValue(strA2, "getAmountString(...)");
                SpannableStringBuilder spannableStringBuilderCreate2 = fontSize2.append(String.valueOf(y.k(strA2, ".00", ""))).setFontSize(CommonViewExtKt.getDp(24)).create();
                if (a10 != null) {
                    a10.f585d.setText(spannableStringBuilderCreate2);
                }
                if (a10 != null) {
                    a10.f584c.b(false);
                }
                HomeRewardsCoupon coupon4 = data.getCoupon();
                if (!"Unissued".equalsIgnoreCase(coupon4 != null ? coupon4.status : null)) {
                    if (a10 != null) {
                        PpButton ppButton3 = a10.f584c;
                        Context context3 = this.itemView.getContext();
                        if (context3 != null && (string3 = context3.getString(p025ba.k.core_use)) != null) {
                            str6 = string3;
                        }
                        ppButton3.setText(str6);
                    }
                    if (a10 != null) {
                        PpButton ppButton4 = a10.f584c;
                        Context context4 = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        p140j8.f.E(ppButton4, true, context4);
                    }
                    if (a10 != null) {
                        a10.f584c.setTag(data.getCoupon());
                    }
                    if (a10 != null) {
                        a10.f584c.setOnClickListener((k) this.f43495c);
                    }
                } else {
                    if (a10 != null) {
                        PpButton ppButton5 = a10.f584c;
                        Context context5 = this.itemView.getContext();
                        if (context5 != null && (string4 = context5.getString(p025ba.k.core_claim)) != null) {
                            str6 = string4;
                        }
                        ppButton5.setText(str6);
                    }
                    if (a10 != null) {
                        PpButton ppButton6 = a10.f584c;
                        Context context6 = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                        p140j8.f.E(ppButton6, false, context6);
                    }
                    if (a10 != null) {
                        a10.f584c.setTag(data.getCoupon());
                    }
                    if (a10 != null) {
                        a10.f584c.setOnClickListener(claimListener);
                    }
                }
                break;
        }
    }
}
