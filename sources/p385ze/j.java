package p385ze;

import Ac.e;
import Pa.i0;
import Pa.r0;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.model.layer.d;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingsModul;
import com.transsnet.palmpay.ui.view.MultiAvatarLayout;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends M1.j {
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String strValueOf;
        QueryTargetSavingsModul item = (QueryTargetSavingsModul) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.targetName;
        if (str != null) {
            holder.setText(e.tvTitle, str);
        }
        String str2 = item.targetPic;
        if (str2 != null) {
            ((ImageView) holder.getView(e.ivPic)).setVisibility(0);
            r0.p1((ImageView) holder.getView(e.ivPic), str2, i0.T());
        }
        List<String> listSubList = item.iconList;
        if (listSubList != null) {
            MultiAvatarLayout multiAvatarLayout = (MultiAvatarLayout) holder.getView(e.adViewLayout);
            if (listSubList.size() > 1) {
                listSubList = listSubList.subList(0, 2);
            }
            multiAvatarLayout.setAvatars(listSubList);
        }
        Integer num = item.joinCount;
        if (num != null) {
            int iIntValue = num.intValue();
            TextView textView = (TextView) holder.getView(e.tvCountDetail);
            if (textView != null) {
                long j6 = iIntValue;
                if (j6 >= 1000000) {
                    double dFloor = Math.floor((j6 / 1000000.0d) * ((double) 10)) / 10.0d;
                    long j10 = (long) dFloor;
                    if (dFloor == j10) {
                        strValueOf = d.o(new Object[]{Long.valueOf(j10)}, 1, Locale.getDefault(), "%dM", "format(...)");
                    } else {
                        strValueOf = d.o(new Object[]{Double.valueOf(dFloor)}, 1, Locale.getDefault(), "%.1fM", "format(...)");
                    }
                } else if (j6 >= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                    double dFloor2 = Math.floor((j6 / 1000.0d) * ((double) 10)) / 10.0d;
                    long j11 = (long) dFloor2;
                    if (dFloor2 == j11) {
                        strValueOf = d.o(new Object[]{Long.valueOf(j11)}, 1, Locale.getDefault(), "%dK", "format(...)");
                    } else {
                        strValueOf = d.o(new Object[]{Double.valueOf(dFloor2)}, 1, Locale.getDefault(), "%.1fK", "format(...)");
                    }
                } else {
                    strValueOf = String.valueOf(j6);
                }
                textView.setText(strValueOf + " users");
            }
        }
    }
}
