package Ic;

import Fc.c;
import G1.d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.m;
import com.github.chrisbanes.photoview.PhotoView;
import com.transsnet.palmpay.mall.ui.activity.MallPhotoViewActivity;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4303c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4304d;

    public a(MallPhotoViewActivity mallPhotoViewActivity) {
        this.f4304d = mallPhotoViewActivity;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(ViewPager container, int i7, Object obj) {
        switch (this.f4303c) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(obj, "obj");
                container.removeView((View) obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(obj, "object");
                container.removeView((View) obj);
                break;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        switch (this.f4303c) {
            case 0:
                ArrayList arrayList = ((MallPhotoViewActivity) this.f4304d).f32008a;
                if (arrayList != null) {
                    return arrayList.size();
                }
                return 0;
            default:
                return ((ArrayList) this.f4304d).size();
        }
    }

    @Override // androidx.viewpager.widget.a
    public final Object g(ViewPager container, int i7) {
        switch (this.f4303c) {
            case 0:
                MallPhotoViewActivity mallPhotoViewActivity = (MallPhotoViewActivity) this.f4304d;
                Intrinsics.checkNotNullParameter(container, "container");
                View viewInflate = LayoutInflater.from(container.getContext()).inflate(c.ma_photo_view_item_layout, (ViewGroup) null);
                PhotoView photoView = (PhotoView) viewInflate.findViewById(Fc.b.photoView);
                TextView textView = (TextView) viewInflate.findViewById(Fc.b.descTv);
                try {
                    ArrayList arrayList = mallPhotoViewActivity.f32008a;
                    String str = arrayList != null ? (String) arrayList.get(i7) : null;
                    G1.a aVarX = ((d) new d().I(new z(SizeUtils.dp2px(2.0f)), true)).x(Fc.a.ma_goods_placeholder_icon);
                    Intrinsics.checkNotNullExpressionValue(aVarX, "placeholder(...)");
                    m mVarA = com.bumptech.glide.b.c(mallPhotoViewActivity).c(mallPhotoViewActivity).load(str).a((d) aVarX);
                    Intrinsics.e(photoView);
                    mVarA.S(photoView);
                    ArrayList arrayList2 = mallPhotoViewActivity.f32009b;
                    if (TextUtils.isEmpty(arrayList2 != null ? (String) arrayList2.get(i7) : null)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        ArrayList arrayList3 = mallPhotoViewActivity.f32009b;
                        textView.setText(arrayList3 != null ? (String) arrayList3.get(i7) : null);
                    }
                } catch (Exception e10) {
                    F6.d.c(mallPhotoViewActivity.TAG, "instantiateItem ", e10);
                }
                container.addView(viewInflate);
                return viewInflate;
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                View view = (View) ((ArrayList) this.f4304d).get(i7);
                container.addView(view);
                return view;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final boolean h(View view, Object obj) {
        switch (this.f4303c) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(obj, "obj");
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(obj, "object");
                break;
        }
        return Intrinsics.c(view, obj);
    }

    public a(ArrayList viewList) {
        Intrinsics.checkNotNullParameter(viewList, "viewList");
        this.f4304d = viewList;
    }
}
