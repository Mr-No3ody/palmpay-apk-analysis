package com.transsnet.palmpay.mall.ui.activity;

import Fc.c;
import Ha.d;
import Ic.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.mall.ui.view.ViewPagerFixed;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/mall/grab_photo_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/mall/ui/activity/MallPhotoViewActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "Ic/a", "a", "module_mall_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MallPhotoViewActivity extends BaseActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f32007g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f32008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f32009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPagerFixed f32011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f32012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f32013f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void statAct(@NotNull Context context, int i7, @NotNull ArrayList<String> photoList, @NotNull ArrayList<String> descList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(photoList, "photoList");
            Intrinsics.checkNotNullParameter(descList, "descList");
            if (photoList.isEmpty() || descList.isEmpty() || photoList.size() != descList.size()) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) MallPhotoViewActivity.class);
            intent.putExtra("cur_position", i7);
            intent.putStringArrayListExtra("photo_list", photoList);
            intent.putStringArrayListExtra("desc_list", descList);
            context.startActivity(intent);
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ma_photo_view_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ViewPagerFixed viewPagerFixed = this.f32011d;
        if (viewPagerFixed != null) {
            viewPagerFixed.setAdapter(new Ic.a(this));
        }
        if (this.f32010c < 0) {
            this.f32010c = 0;
        }
        ViewPagerFixed viewPagerFixed2 = this.f32011d;
        if (viewPagerFixed2 != null) {
            viewPagerFixed2.setCurrentItem(this.f32010c);
        }
        l(this.f32010c);
        ViewPagerFixed viewPagerFixed3 = this.f32011d;
        if (viewPagerFixed3 != null) {
            viewPagerFixed3.addOnPageChangeListener(new b(this));
        }
    }

    public final void l(int i7) {
        TextView textView = this.f32013f;
        if (textView != null) {
            int i10 = i7 + 1;
            ArrayList arrayList = this.f32008a;
            textView.setText(i10 + " / " + (arrayList != null ? Integer.valueOf(arrayList.size()) : null));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(-16777216);
        this.f32012e = findViewById(Fc.b.closeBtn);
        this.f32011d = (ViewPagerFixed) findViewById(Fc.b.viewPager);
        this.f32013f = (TextView) findViewById(Fc.b.indexView);
        View view = this.f32012e;
        if (view != null) {
            view.setOnClickListener(new d(this, 4));
        }
    }
}
