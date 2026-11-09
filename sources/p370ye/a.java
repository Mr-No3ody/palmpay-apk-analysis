package p370ye;

import Bc.z;
import Fe.I;
import Pa.r0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import com.transsnet.palmpay.main.export.bean.req.ClaimRewardReq;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p140j8.f;
import we.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends BaseBannerAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f44313a;

    public a(WeakReference weakReference) {
        HomeFragmentHomeTab homeFragmentHomeTab;
        this.f44313a = weakReference;
        if (weakReference == null || (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference.get()) == null) {
            return;
        }
        homeFragmentHomeTab.m();
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final void bindData(BaseViewHolder baseViewHolder, Object obj, int i7, int i10) {
        String string;
        String string2;
        PalmZoneTaskBean palmZoneTaskBean = (PalmZoneTaskBean) obj;
        if (baseViewHolder instanceof e) {
            e eVar = (e) baseViewHolder;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(this, "claimListener");
            z zVar = eVar.f43459a;
            if (zVar != null) {
                zVar.f888c.b(false);
            }
            if (palmZoneTaskBean != null) {
                String str = palmZoneTaskBean.taskPicture;
                if (str != null) {
                    r0.l1(str, zVar != null ? zVar.f889d : null);
                }
                String str2 = "";
                if (zVar != null) {
                    TextView textView = zVar.f891f;
                    String str3 = palmZoneTaskBean.taskName;
                    if (str3 == null) {
                        str3 = "";
                    }
                    textView.setText(str3);
                }
                if (zVar != null) {
                    TextView textView2 = zVar.f890e;
                    String str4 = palmZoneTaskBean.subtaskName;
                    if (str4 == null) {
                        str4 = "";
                    }
                    textView2.setText(str4);
                }
                if (palmZoneTaskBean.status == 1) {
                    if (zVar != null) {
                        PpButton ppButton = zVar.f888c;
                        Context context = eVar.itemView.getContext();
                        if (context != null && (string2 = context.getString(k.core_claim)) != null) {
                            str2 = string2;
                        }
                        ppButton.setText(str2);
                    }
                    if (zVar != null) {
                        PpButton ppButton2 = zVar.f888c;
                        Context context2 = eVar.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        f.E(ppButton2, false, context2);
                    }
                    if (zVar != null) {
                        zVar.f888c.setTag(palmZoneTaskBean);
                    }
                    if (zVar != null) {
                        zVar.f888c.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                if (zVar != null) {
                    PpButton ppButton3 = zVar.f888c;
                    Context context3 = eVar.itemView.getContext();
                    if (context3 != null && (string = context3.getString(k.core_go)) != null) {
                        str2 = string;
                    }
                    ppButton3.setText(str2);
                }
                if (zVar != null) {
                    PpButton ppButton4 = zVar.f888c;
                    Context context4 = eVar.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    f.E(ppButton4, false, context4);
                }
                if (zVar != null) {
                    zVar.f888c.setTag(palmZoneTaskBean);
                }
                if (zVar != null) {
                    zVar.f888c.setOnClickListener(eVar.f43460b);
                }
            }
        }
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final BaseViewHolder createViewHolder(ViewGroup parent, View itemView, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new e(itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        List<T> list = this.mList;
        return BannerUtils.getRealPosition(i7, list != 0 ? list.size() : 0);
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final int getLayoutId(int i7) {
        return Ac.f.main_home_page_rewards_task_center_item;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HomeFragmentHomeTab homeFragmentHomeTab;
        if (view != null) {
            View view2 = view.getTag() instanceof PalmZoneTaskBean ? view : null;
            if (view2 != null) {
                Object tag = view2.getTag();
                Intrinsics.f(tag, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean");
                PalmZoneTaskBean palmZoneTaskBean = (PalmZoneTaskBean) tag;
                if (view instanceof PpButton) {
                    ((PpButton) view).b(true);
                }
                WeakReference weakReference = this.f44313a;
                if (weakReference == null || (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference.get()) == null) {
                    return;
                }
                ClaimRewardReq claimRewardReq = new ClaimRewardReq();
                claimRewardReq.memberTaskNo = palmZoneTaskBean.memberTaskNo;
                claimRewardReq.multiActivityCode = palmZoneTaskBean.activityCode;
                claimRewardReq.contentType = 6;
                I i7 = (I) homeFragmentHomeTab.f27328i;
                if (i7 != null) {
                    i7.claimRewardsCenterReward(claimRewardReq);
                }
            }
        }
    }
}
