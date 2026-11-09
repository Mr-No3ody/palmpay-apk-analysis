package Gd;

import Pa.r0;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.send_money.bean.resp.BannerEntranceBean;
import com.transsnet.palmpay.send_money.ui.view.TransferHomeEntranceView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p368yb.C;
import p368yb.D;
import p382zb.C2158a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3345d;

    public /* synthetic */ e(Object obj, int i7, Object obj2, int i10) {
        this.f3342a = i10;
        this.f3344c = obj;
        this.f3343b = i7;
        this.f3345d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2158a c2158a;
        CheckedTextView checkedTextView;
        Object obj = this.f3345d;
        int i7 = this.f3343b;
        Object obj2 = this.f3344c;
        switch (this.f3342a) {
            case 0:
                Function2 function2 = ((TransferHomeEntranceView) obj2).f33877e;
                if (function2 != null) {
                    function2.invoke((BannerEntranceBean) obj, Integer.valueOf(i7));
                }
                break;
            case 1:
                OnRvItemClickListener onRvItemClickListener = ((Kb.h) obj2).f4993c;
                if (onRvItemClickListener != null) {
                    View itemView = ((RecyclerView.ViewHolder) obj).itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    onRvItemClickListener.onItemClick(itemView, i7);
                }
                break;
            case 2:
                Oe.a aVar = ((Wb.b) obj2).f10666c;
                if (aVar != null) {
                    View itemView2 = ((Wb.a) obj).itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    aVar.onItemClick(itemView2, i7);
                }
                break;
            case 3:
                int i10 = TopupAirtimeActivity.f26495x0;
                ((TopupAirtimeActivity) obj2).H(i7, (String) obj);
                break;
            case 4:
                p339wb.d dVar = (p339wb.d) obj2;
                if (!r0.U0() && (c2158a = dVar.f43366d) != null) {
                    c2158a.OnItemViewOnClick(i7, (RecipientListResp.RecipientBean) dVar.f43364b.get(i7), (p339wb.c) obj);
                }
                break;
            case 5:
                OnRvItemClickListener onRvItemClickListener2 = ((p368yb.B) obj2).f44156c;
                if (onRvItemClickListener2 != null) {
                    View itemView3 = ((RecyclerView.ViewHolder) obj).itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                    onRvItemClickListener2.onItemClick(itemView3, i7);
                }
                break;
            default:
                D d2 = (D) obj2;
                int i11 = d2.f44158d;
                if (i11 != i7) {
                    if (i11 != -1 && (checkedTextView = d2.f44159e) != null) {
                        checkedTextView.setChecked(false);
                    }
                    RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
                    C c6 = (C) viewHolder;
                    c6.f44157a.setChecked(true);
                    d2.f44159e = c6.f44157a;
                    d2.f44158d = i7;
                    OnRvItemClickListener onRvItemClickListener3 = d2.f4993c;
                    if (onRvItemClickListener3 != null) {
                        View itemView4 = viewHolder.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                        onRvItemClickListener3.onItemClick(itemView4, i7);
                    }
                }
                break;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int i7, int i10) {
        this.f3342a = i10;
        this.f3344c = obj;
        this.f3345d = obj2;
        this.f3343b = i7;
    }
}
