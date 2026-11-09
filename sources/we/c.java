package we;

import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.MessageTypeBase;
import com.transsnet.palmpay.core.bean.message.MessageTypeCommon;
import com.transsnet.palmpay.core.bean.message.MsgContentBean;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f43452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(Ac.e.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f43452a = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Ac.e.tvTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f43453b = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Ac.e.tvMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f43454c = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(Ac.e.tvDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43455d = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(Ac.e.tvNext);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f43456e = (TextView) viewFindViewById5;
    }

    public final void a(GetMsgRsp.DataBean.ListBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        MsgContentBean content = bean.getContent();
        if (content != null) {
            boolean zIsEmpty = TextUtils.isEmpty(content.outsideInsideNotificationInfo);
            TextView textView = this.f43454c;
            TextView textView2 = this.f43453b;
            if (zIsEmpty) {
                textView2.setText(content.title);
                textView.setText(content.noticeMsg);
            } else {
                MessageTypeBase msgObj = content.getMsgObj();
                if (msgObj instanceof MessageTypeCommon) {
                    MessageTypeCommon messageTypeCommon = (MessageTypeCommon) msgObj;
                    r0.h1(this.f43452a, messageTypeCommon.insideIcon, r.cv_palmpay_logo_5);
                    textView2.setText(messageTypeCommon.insideTitle);
                    textView.setText(messageTypeCommon.insideContent);
                    boolean zIsEmpty2 = TextUtils.isEmpty(messageTypeCommon.insideLowerRightBtnText);
                    TextView textView3 = this.f43456e;
                    if (zIsEmpty2) {
                        textView3.setText(p025ba.k.core_view);
                    } else {
                        textView3.setText(messageTypeCommon.insideLowerRightBtnText);
                    }
                }
            }
            this.f43455d.setText(r0.R(bean.createtime));
        }
    }
}
