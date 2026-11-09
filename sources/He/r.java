package He;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PremiumBenefitsRewardNoticeItemBean;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumScrollNotice f3909a;

    public r(ModelPremiumScrollNotice modelPremiumScrollNotice) {
        this.f3909a = modelPremiumScrollNotice;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3909a.f35314d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        q holder = (q) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        AppCompatTextView appCompatTextView = holder.f3908a;
        ArrayList arrayList = this.f3909a.f35314d;
        String str = ((PremiumBenefitsRewardNoticeItemBean) arrayList.get(i7)).preClaimContent;
        if (str == null) {
            str = "";
        }
        String str2 = ((PremiumBenefitsRewardNoticeItemBean) arrayList.get(i7)).lastClaimContent;
        appCompatTextView.setText(str + " " + (str2 != null ? str2 : ""));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
        appCompatTextView.setLayoutParams(new RecyclerView.LayoutParams(-1, CommonViewExtKt.getDp(16)));
        appCompatTextView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, appCompatTextView.getContext()));
        appCompatTextView.setGravity(8388613);
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        return new q(appCompatTextView);
    }
}
