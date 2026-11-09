package we;

import Bc.y;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterInfo;
import com.transsnet.palmpay.main.export.bean.rsp.RewardsInfo;
import com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends BaseViewHolder implements RewardsBannerAdapterHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f43482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f43483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f43484d;

    static {
        new h(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View itemView, boolean z3) {
        View viewM;
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f43481a = z3;
        this.f43483c = new d(itemView, 1);
        this.f43484d = new d(itemView, 2);
        int i7 = Ac.e.btnRight;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, itemView);
        if (ppButton != null && (viewM = p059e1.a.m((i7 = Ac.e.btnRightClick), itemView)) != null) {
            i7 = Ac.e.ivIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, itemView);
            if (appCompatImageView != null) {
                i7 = Ac.e.ivItemBg;
                RoundImageView roundImageView = (RoundImageView) p059e1.a.m(i7, itemView);
                if (roundImageView != null) {
                    i7 = Ac.e.tvDesc;
                    TextView textView = (TextView) p059e1.a.m(i7, itemView);
                    if (textView != null) {
                        i7 = Ac.e.tvLabel;
                        RoundedTextView roundedTextView = (RoundedTextView) p059e1.a.m(i7, itemView);
                        if (roundedTextView != null) {
                            i7 = Ac.e.tvTitle;
                            TextView textView2 = (TextView) p059e1.a.m(i7, itemView);
                            if (textView2 != null) {
                                this.f43482b = new y((ConstraintLayout) itemView, ppButton, viewM, appCompatImageView, roundImageView, textView, roundedTextView, textView2);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i7)));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x017c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder
    public final void bindRewardsCenterData(HomeRewardsCenterInfo data, View.OnClickListener claimListener) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(claimListener, "claimListener");
        RewardsInfo oldDto = data.getOldDto();
        if (oldDto != null) {
            y yVar = this.f43482b;
            if (yVar != null) {
                TextView textView = yVar.f885j;
                String str3 = oldDto.showTitle;
                if (str3 == null) {
                    str3 = "";
                }
                textView.setText(str3);
            }
            if (yVar != null) {
                TextView textView2 = yVar.f883g;
                String str4 = oldDto.showContent;
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(str4);
            }
            if (yVar != null) {
                RoundedTextView roundedTextView = yVar.f884i;
                String str5 = oldDto.showLabel;
                if (TextUtils.isEmpty(str5)) {
                    p220oa.h.s(roundedTextView, false);
                    roundedTextView.setCompoundDrawablesRelative(null, null, null, null);
                } else {
                    p220oa.h.s(roundedTextView, true);
                    roundedTextView.setText(str5);
                }
            }
            boolean z3 = this.f43481a;
            if (z3) {
                str = oldDto.darkShowIcon;
                if (str == null) {
                    str = oldDto.showIcon;
                    if (str != null || str.length() <= 0) {
                        str = null;
                    }
                } else {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str == null) {
                        str = oldDto.showIcon;
                        if (str != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                    }
                }
            } else {
                str = oldDto.showIcon;
                if (str == null || str.length() <= 0) {
                    str = null;
                }
            }
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    r0.h1(yVar != null ? yVar.f882f : null, str, r.cv_default_palmpay_icon_gray);
                }
            }
            if (TextUtils.isEmpty(oldDto.contentAndroidUrl)) {
                if (yVar != null) {
                    yVar.f883g.setTag("");
                }
                if (yVar != null) {
                    yVar.f883g.setOnClickListener(null);
                }
                if (yVar != null) {
                    yVar.f883g.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, this.itemView.getContext()));
                }
                if (yVar != null) {
                    p220oa.h.p(yVar.f883g, false);
                }
            } else {
                if (yVar != null) {
                    yVar.f883g.setTag(oldDto);
                }
                if (yVar != null) {
                    yVar.f883g.setOnClickListener(this.f43484d);
                }
                if (yVar != null) {
                    yVar.f883g.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, this.itemView.getContext()));
                }
                if (yVar != null) {
                    p220oa.h.p(yVar.f883g, true);
                }
            }
            if (yVar != null) {
                yVar.f879c.b(false);
            }
            if (yVar != null) {
                PpButton ppButton = yVar.f879c;
                String str6 = oldDto.buttonContent;
                ppButton.setText(str6 != null ? str6 : "");
            }
            if (TextUtils.isEmpty(oldDto.androidUrl)) {
                if (yVar != null) {
                    PpButton ppButton2 = yVar.f879c;
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    p140j8.f.E(ppButton2, false, context);
                }
                if (yVar != null) {
                    yVar.f880d.setOnClickListener(null);
                }
                if (yVar != null) {
                    yVar.f880d.setTag(null);
                }
                if (yVar != null) {
                    p220oa.h.c(yVar.f880d);
                }
                if (yVar != null) {
                    yVar.f879c.setTag(oldDto);
                }
                if (yVar != null) {
                    yVar.f879c.setOnClickListener(claimListener);
                }
            } else {
                if (yVar != null) {
                    PpButton ppButton3 = yVar.f879c;
                    Context context2 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    p140j8.f.E(ppButton3, true, context2);
                }
                if (yVar != null) {
                    yVar.f879c.setOnClickListener(null);
                }
                if (yVar != null) {
                    yVar.f879c.setTag(null);
                }
                if (yVar != null) {
                    p220oa.h.C(yVar.f880d);
                }
                if (yVar != null) {
                    yVar.f880d.setTag(oldDto);
                }
                if (yVar != null) {
                    yVar.f880d.setOnClickListener(this.f43483c);
                }
            }
            if (z3) {
                str2 = oldDto.darkModeModuleBackgroundUrl;
                if (str2 == null) {
                    str2 = oldDto.moduleBackgroundUrl;
                    if (str2 != null || str2.length() <= 0) {
                        str2 = null;
                    }
                } else {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = oldDto.moduleBackgroundUrl;
                        if (str2 != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                    }
                }
            } else {
                str2 = oldDto.moduleBackgroundUrl;
                if (str2 == null || str2.length() <= 0) {
                    str2 = null;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                if (yVar != null) {
                    p220oa.h.C(yVar.f881e);
                }
                r0.l1(str2, yVar != null ? yVar.f881e : null);
            } else {
                if (yVar != null) {
                    p220oa.h.d(yVar.f881e);
                }
                if (yVar != null) {
                    yVar.f881e.setImageDrawable(null);
                }
            }
        }
    }
}
