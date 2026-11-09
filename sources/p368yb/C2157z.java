package p368yb;

import Ya.f;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.m;
import com.bumptech.glide.p;
import com.google.android.material.imageview.ShapeableImageView;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p294tb.W;
import p310ub.O;
import p327vd.c;

/* JADX INFO: renamed from: yb.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2157z extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OcFeedbackActivity f44273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f44275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44278f;

    public C2157z(OcFeedbackActivity mContext, ArrayList mData, O mCallBack) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mData, "mData");
        Intrinsics.checkNotNullParameter(mCallBack, "mCallBack");
        this.f44273a = mContext;
        this.f44274b = mData;
        this.f44275c = mCallBack;
        this.f44276d = 1;
        this.f44277e = 2;
        this.f44278f = 9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Math.min(this.f44274b.size() + 1, this.f44278f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return (i7 != getItemCount() + (-1) || this.f44274b.size() >= 9) ? this.f44276d : this.f44277e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (getItemViewType(i7) == this.f44277e) {
            h.l(new c(this, 11), ((C2155x) viewHolder).f44270a);
            return;
        }
        C2156y c2156y = (C2156y) viewHolder;
        h.l(new W(17, viewHolder, this), c2156y.f44272b);
        Object obj2 = this.f44274b.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        LocalMedia localMedia = (LocalMedia) obj2;
        int chooseModel = localMedia.getChooseModel();
        if (localMedia.isCut() && !localMedia.isCompressed()) {
            String cutPath = localMedia.getCutPath();
            Intrinsics.e(cutPath);
            str = cutPath;
        } else if (localMedia.isCut() || localMedia.isCompressed()) {
            String compressPath = localMedia.getCompressPath();
            Intrinsics.e(compressPath);
            str = compressPath;
        } else {
            String path = localMedia.getPath();
            Intrinsics.e(path);
            str = path;
        }
        int iOfAudio = SelectMimeType.ofAudio();
        ShapeableImageView shapeableImageView = c2156y.f44271a;
        if (chooseModel == iOfAudio) {
            shapeableImageView.setImageResource(R.drawable.ps_audio_placeholder);
            return;
        }
        p pVarE = b.e(this.f44273a);
        if (PictureMimeType.isContent(str) && !localMedia.isCut() && !localMedia.isCompressed()) {
            obj = str;
            obj = str;
            obj = str;
            obj = Uri.parse(str);
        }
        obj = str;
        obj = str;
        obj = str;
        obj = str;
        obj = str;
        obj = str;
        ((m) ((m) ((m) pVarE.load(obj).c()).x(Ya.b.cs_oc_bill_bg_color)).g(k.f20703b)).S(shapeableImageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i10 = this.f44277e;
        OcFeedbackActivity ocFeedbackActivity = this.f44273a;
        if (i7 == i10) {
            View viewInflate = LayoutInflater.from(ocFeedbackActivity).inflate(f.cs_oc_feedback_selected_add_img_item, parent, false);
            Intrinsics.e(viewInflate);
            return new C2155x(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(ocFeedbackActivity).inflate(f.cs_oc_feedback_selected_img_item, parent, false);
        Intrinsics.e(viewInflate2);
        return new C2156y(viewInflate2);
    }
}
