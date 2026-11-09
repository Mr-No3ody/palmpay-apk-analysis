package we;

import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.MessageTypeActivity;
import com.transsnet.palmpay.core.bean.message.MessageTypeBase;
import com.transsnet.palmpay.core.bean.message.MsgContentBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f43442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(Ac.e.ivHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43442a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Ac.e.tvTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43443b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Ac.e.tvMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43444c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Ac.e.tvDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43445d = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(Ac.e.tvNext);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f43446e = (TextView) viewFindViewById5;
    }

    public final void a(GetMsgRsp.DataBean.ListBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        MsgContentBean content = bean.getContent();
        MessageTypeBase msgObj = content != null ? content.getMsgObj() : null;
        boolean z3 = msgObj instanceof MessageTypeActivity;
        TextView textView = this.f43444c;
        TextView textView2 = this.f43443b;
        TextView textView3 = this.f43446e;
        ImageView imageView = this.f43442a;
        if (z3) {
            MessageTypeActivity messageTypeActivity = (MessageTypeActivity) msgObj;
            textView2.setText(messageTypeActivity.insideTitle);
            textView.setText(messageTypeActivity.insideContent);
            if (TextUtils.isEmpty(messageTypeActivity.insideBigPictureUrl)) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                r0.l1(messageTypeActivity.insideBigPictureUrl, imageView);
            }
            if (TextUtils.isEmpty(messageTypeActivity.insideLowerRightBtnText)) {
                textView3.setText(p025ba.k.core_view);
            } else {
                textView3.setText(messageTypeActivity.insideLowerRightBtnText);
            }
        } else {
            imageView.setVisibility(8);
            textView3.setText(p025ba.k.core_view);
            MsgContentBean content2 = bean.getContent();
            textView2.setText(content2 != null ? content2.title : null);
            MsgContentBean content3 = bean.getContent();
            textView.setText(content3 != null ? content3.noticeMsg : null);
        }
        this.f43445d.setText(r0.R(bean.createtime));
    }
}
