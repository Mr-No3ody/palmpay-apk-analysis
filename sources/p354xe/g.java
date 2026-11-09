package p354xe;

import Ac.f;
import Kb.c;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.D;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.p;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.r;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43932g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f43933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43934j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f43936p;

    public g(Context context) {
        super(context);
        this.f43931f = false;
        this.f43932g = false;
        this.f43933i = new CopyOnWriteArrayList();
        this.f43934j = false;
        this.f43935o = 0;
        this.f43936p = true;
    }

    @Override // Kb.c, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.f43930e) {
            return super.getItemCount();
        }
        if (this.f4985b.size() < 8) {
            return super.getItemCount();
        }
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f A[Catch: Exception -> 0x0116, TryCatch #1 {Exception -> 0x0116, blocks: (B:40:0x00be, B:44:0x00c7, B:47:0x00cd, B:49:0x00d9, B:51:0x00f8, B:52:0x00fe, B:53:0x0107, B:55:0x010b, B:56:0x010f, B:58:0x0113), top: B:67:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0113 A[Catch: Exception -> 0x0116, TRY_LEAVE, TryCatch #1 {Exception -> 0x0116, blocks: (B:40:0x00be, B:44:0x00c7, B:47:0x00cd, B:49:0x00d9, B:51:0x00f8, B:52:0x00fe, B:53:0x0107, B:55:0x010b, B:56:0x010f, B:58:0x0113), top: B:67:0x00be }] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        boolean z3;
        LottieAnimationView lottieAnimationView;
        if (viewHolder instanceof f) {
            f fVar = (f) viewHolder;
            List list = this.f4985b;
            if (list == null || i7 >= list.size()) {
                return;
            }
            HomePageMenuData homePageMenuData = (HomePageMenuData) this.f4985b.get(i7);
            fVar.f43928f.setText(homePageMenuData.menuName);
            boolean zIsEmpty = TextUtils.isEmpty(homePageMenuData.iconLottieUrl);
            g gVar = fVar.f43929g;
            if (!zIsEmpty && !BaseApplication.get().isOldAndroidDevice() && gVar.f43936p) {
                D dH = p.h(fVar.itemView.getContext(), homePageMenuData.iconLottieUrl);
                int i10 = 0;
                dH.b(new d(fVar, i10));
                dH.a(new e(fVar, homePageMenuData, i10));
            } else if (!TextUtils.isEmpty(homePageMenuData.iconUrlBig)) {
                r0.h1(fVar.d(fVar.itemView.getContext()), homePageMenuData.iconUrlBig, r.cv_palmpay_icon_gray);
            }
            if (this.f43931f) {
                if (TextUtils.isEmpty(homePageMenuData.cornerImgUrl) && TextUtils.isEmpty(homePageMenuData.cornerLottieUrl)) {
                    LottieAnimationView lottieAnimationView2 = fVar.f43926d;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setVisibility(8);
                    }
                } else {
                    if (fVar.f43926d == null) {
                        fVar.f43926d = fVar.e();
                    }
                    fVar.f43926d.setVisibility(0);
                    fVar.f(homePageMenuData);
                }
            } else if (TextUtils.isEmpty(homePageMenuData.cornerImgUrl) && TextUtils.isEmpty(homePageMenuData.cornerLottieUrl)) {
                LottieAnimationView lottieAnimationView3 = fVar.f43926d;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.setVisibility(8);
                }
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList = gVar.f43933i;
                if (copyOnWriteArrayList != null) {
                    try {
                        if (copyOnWriteArrayList.isEmpty()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (gVar.f43934j || !z3) {
                            lottieAnimationView = fVar.f43926d;
                            if (lottieAnimationView != null) {
                                lottieAnimationView.setVisibility(8);
                            }
                        } else if (copyOnWriteArrayList.contains(Integer.valueOf(homePageMenuData.cornerOrder))) {
                            ViewEvent viewEventAfEvt = new ViewEvent("homepage_services_cornermarker_view").afEvt(false);
                            viewEventAfEvt.add("Business Name", homePageMenuData.menuName);
                            n0.g().q(viewEventAfEvt);
                            if (fVar.f43926d == null) {
                                fVar.f43926d = fVar.e();
                            }
                            fVar.f43926d.setVisibility(0);
                            fVar.f(homePageMenuData);
                        } else {
                            LottieAnimationView lottieAnimationView4 = fVar.f43926d;
                            if (lottieAnimationView4 != null) {
                                lottieAnimationView4.setVisibility(8);
                            }
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    z3 = false;
                    if (gVar.f43934j) {
                        lottieAnimationView = fVar.f43926d;
                        if (lottieAnimationView != null) {
                            lottieAnimationView.setVisibility(8);
                        }
                    } else {
                        lottieAnimationView = fVar.f43926d;
                        if (lottieAnimationView != null) {
                            lottieAnimationView.setVisibility(8);
                        }
                    }
                }
            }
            if (this.f43932g) {
                try {
                    ViewGroup.LayoutParams layoutParams = fVar.itemView.getLayoutParams();
                    layoutParams.height = -2;
                    fVar.itemView.setLayoutParams(layoutParams);
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new f(this, LayoutInflater.from(this.f4984a).inflate(this.f43935o == 1 ? f.main_item_home_page_horizontal_menu_v2 : f.main_item_home_page_horizontal_menu, viewGroup, false));
    }
}
