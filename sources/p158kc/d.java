package p158kc;

import A8.g;
import F8.e;
import Kb.c;
import Oe.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.rsp.QueryDeviceRsp;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends c implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f38741i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f38742j = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f38743o = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f38746g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i7) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        c cVar = (c) holder;
        Object obj = this.f4985b.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        QueryDeviceRsp bean = (QueryDeviceRsp) obj;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(bean, "bean");
        int masterFlag = bean.getMasterFlag();
        TextView textView = cVar.f38733d;
        if (masterFlag == 1) {
            if (textView != null) {
                textView.setText(bean.getNickName() + "(Master)");
            }
        } else if (textView != null) {
            textView.setText(bean.getNickName());
        }
        TextView textView2 = cVar.f38734e;
        if (textView2 != null) {
            textView2.setText(TimeUtils.millis2String(bean.getLastLoggedOnTime(), new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")));
        }
        SwitchCompat switchCompat = cVar.f38735f;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(null);
        }
        String imei = bean.getImei();
        PpButton ppButton = cVar.f38736g;
        if (imei != null) {
            if (ppButton != null) {
                ppButton.setVisibility(Intrinsics.c(bean.getImei(), PhoneUtils.getUniqueId()) ? 0 : 8);
            }
        } else if (ppButton != null) {
            ppButton.setVisibility(i7 == 0 ? 0 : 8);
        }
        if (switchCompat != null) {
            switchCompat.setTag(bean);
        }
        d dVar = cVar.t;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(new g(cVar, dVar));
        }
        int i10 = dVar.f38744e;
        a aVar = f38741i;
        int state_normal = aVar.getSTATE_NORMAL();
        View view = cVar.f38739o;
        ImageView imageView = cVar.f38737i;
        if (i10 == state_normal) {
            if (view != null) {
                view.setTranslationX(0.0f);
            }
            cVar.d(view, SizeUtils.dp2px(72.0f), 0.0f);
            if (imageView != null) {
                imageView.setTag(bean);
            }
            if (imageView != null) {
                imageView.setOnClickListener(dVar);
                return;
            }
            return;
        }
        if (dVar.f38744e == aVar.getSTATE_EDIT()) {
            cVar.d(view, 0.0f, SizeUtils.dp2px(72.0f));
            if (imageView != null) {
                imageView.setTag(bean);
            }
            if (imageView != null) {
                imageView.setOnClickListener(dVar);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar = this.f38746g;
        if (aVar != null) {
            aVar.onDelete(view != null ? view.getTag() : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new c(this, LayoutInflater.from(this.f4984a).inflate(e.ac_layout_device_item, parent, false));
    }
}
