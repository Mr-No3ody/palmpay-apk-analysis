package p328ve;

import Ac.e;
import Ac.f;
import L6.b;
import M1.j;
import Pa.r0;
import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.main.export.bean.rsp.MinorAccountBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43200a;

    public q(int i7) {
        super(f.main_item_minor_account, null);
        this.f43200a = i7;
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        int i7;
        String str;
        int i10;
        MinorAccountBean item = (MinorAccountBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(e.tvName, item.teenMemberFullName);
        holder.setText(e.tvAccount, item.teenPhone);
        if (this.f43200a != 2) {
            IconicsTextView iconicsTextView = (IconicsTextView) holder.getView(e.tvOperate);
            if (iconicsTextView != null) {
                iconicsTextView.setVisibility(0);
            }
            IconicsTextView iconicsTextView2 = (IconicsTextView) holder.getView(e.tvOperate);
            if (iconicsTextView2 != null) {
                iconicsTextView2.setText("Detail");
            }
            ImageView imageView = (ImageView) holder.getView(e.iv_avatar);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            r0.m1(item.teenMemberHeadPoint, (ImageView) holder.getView(e.iv_avatar));
            return;
        }
        TextView textView = (TextView) holder.getView(e.tvOperate);
        if (textView != null) {
            Context context = getContext();
            int i11 = item.authStatus;
            if (i11 != 4) {
                i10 = i11 != 6 ? b.ppColorWarning : b.ppColorTextNormal;
            } else {
                i10 = b.ppColorError;
            }
            textView.setTextColor(context.getColor(i10));
        }
        TextView textView2 = (TextView) holder.getView(e.tvStatus);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        Group group = (Group) holder.getView(e.group1);
        if (group != null) {
            group.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) holder.getView(e.iv_avatar);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        holder.setText(e.tvApplicationTime, r0.O(item.applyTime));
        TextView textView3 = (TextView) holder.getView(e.tvStatus);
        if (textView3 != null) {
            switch (item.authStatus) {
                case 1:
                    str = "Appoval";
                    break;
                case 2:
                    str = "Pending";
                    break;
                case 3:
                    str = "Success";
                    break;
                case 4:
                    str = "Declined";
                    break;
                case 5:
                    str = "Time Out";
                    break;
                case 6:
                    str = "Revoked";
                    break;
                case 7:
                    str = "Expired";
                    break;
                case 8:
                    str = "Change Auth";
                    break;
                default:
                    str = "";
                    break;
            }
            textView3.setText(str);
        }
        TextView textView4 = (TextView) holder.getView(e.tvStatus);
        if (textView4 != null) {
            Resources resources = getContext().getResources();
            int i12 = item.authStatus;
            if (i12 != 4) {
                i7 = i12 != 6 ? b.ppColorWarning : b.ppColorTextNormal;
            } else {
                i7 = b.ppColorError;
            }
            textView4.setTextColor(resources.getColor(i7));
        }
        IconicsTextView iconicsTextView3 = (IconicsTextView) holder.getView(e.tvOperate);
        if (iconicsTextView3 != null) {
            iconicsTextView3.setVisibility(8);
        }
    }
}
