package we;

import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.MessageTypeAnnouncement;
import com.transsnet.palmpay.core.bean.message.MessageTypeBase;
import com.transsnet.palmpay.core.bean.message.MsgContentBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f43447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(Ac.e.ivHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43447a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Ac.e.tvTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43448b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Ac.e.tvMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43449c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Ac.e.tvDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43450d = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(Ac.e.tvNext);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f43451e = (TextView) viewFindViewById5;
    }

    public final void a(GetMsgRsp.DataBean.ListBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        MsgContentBean content = bean.getContent();
        MessageTypeBase msgObj = content != null ? content.getMsgObj() : null;
        boolean z3 = msgObj instanceof MessageTypeAnnouncement;
        TextView textView = this.f43449c;
        TextView textView2 = this.f43448b;
        TextView textView3 = this.f43451e;
        ImageView imageView = this.f43447a;
        if (z3) {
            MessageTypeAnnouncement messageTypeAnnouncement = (MessageTypeAnnouncement) msgObj;
            textView2.setText(messageTypeAnnouncement.insideTitle);
            textView.setText(messageTypeAnnouncement.insideContent);
            if (TextUtils.isEmpty(messageTypeAnnouncement.insideBigPictureUrl)) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                r0.l1(messageTypeAnnouncement.insideBigPictureUrl, imageView);
            }
            if (TextUtils.isEmpty(messageTypeAnnouncement.insideLowerRightBtnText)) {
                textView3.setText(p025ba.k.core_view);
            } else {
                textView3.setText(messageTypeAnnouncement.insideLowerRightBtnText);
            }
        } else {
            imageView.setVisibility(8);
            textView3.setText(p025ba.k.core_view);
            MsgContentBean content2 = bean.getContent();
            textView2.setText(content2 != null ? content2.title : null);
            MsgContentBean content3 = bean.getContent();
            textView.setText(content3 != null ? content3.noticeMsg : null);
        }
        this.f43450d.setText(r0.R(bean.createtime));
    }
}
