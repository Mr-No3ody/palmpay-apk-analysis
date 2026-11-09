package com.transsnet.palmpay.core.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.common.export.bean.PickLocationReq;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/MapsActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapsActivity extends BaseActivity implements OnMapReadyCallback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27668e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LatLng f27669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GoogleMap f27670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bc.i f27671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f27672d = C2131j.b(new T(2));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Bc.i iVar = this.f27671c;
        if (iVar != null) {
            ((PpButton) iVar.f726d).setOnClickListener(new Y(this, 1));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(L9.b.cm_activity_maps, (ViewGroup) null, false);
        int i7 = L9.a.btnConfirm;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = L9.a.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i7 = L9.a.msgContainer;
                CardView cardView = (CardView) p059e1.a.m(i7, viewInflate);
                if (cardView != null) {
                    i7 = L9.a.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                    if (ppTitleBar != null) {
                        i7 = L9.a.tvAddress;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = L9.a.tvMsg;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                Bc.i iVar = new Bc.i(constraintLayout, (FrameLayout) ppButton, (View) iconicsImageView, (FrameLayout) cardView, ppTitleBar, textView, textView2, 15);
                                this.f27671c = iVar;
                                return iVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void l() {
        UiSettings uiSettings;
        if (androidx.core.content.d.a(this, com.transsnet.palmpay.core.config.d.j()) == 0 || androidx.core.content.d.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            GoogleMap googleMap = this.f27670b;
            if (googleMap != null) {
                googleMap.setMyLocationEnabled(true);
            }
            GoogleMap googleMap2 = this.f27670b;
            if (googleMap2 == null || (uiSettings = googleMap2.getUiSettings()) == null) {
                return;
            }
            uiSettings.setMyLocationButtonEnabled(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((Handler) this.f27672d.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(GoogleMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f27670b = map;
        l();
        Bc.i iVar = this.f27671c;
        if (iVar != null) {
            ((PpButton) iVar.f726d).setEnabled(this.f27669a != null);
        }
        LatLng latLng = this.f27669a;
        if (latLng != null) {
            GoogleMap googleMap = this.f27670b;
            if (googleMap != null) {
                googleMap.addMarker(new MarkerOptions().position(latLng));
            }
            GoogleMap googleMap2 = this.f27670b;
            if (googleMap2 != null) {
                googleMap2.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15.0f));
            }
        }
        GoogleMap googleMap3 = this.f27670b;
        if (googleMap3 != null) {
            googleMap3.setOnMapClickListener(new Z(this, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", com.transsnet.palmpay.core.config.d.j()};
        if (p377z5.l.o(this, (String[]) Arrays.copyOf(strArr, 2))) {
            return;
        }
        AbstractC1032a.g(this, strArr, 257);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Bc.i iVar;
        String str;
        Bc.i iVar2;
        Intent intent = getIntent();
        if (intent != null) {
            PickLocationReq pickLocationReq = (PickLocationReq) intent.getParcelableExtra("extra_data");
            if (!TextUtils.isEmpty(pickLocationReq != null ? pickLocationReq.address : null)) {
                if (TextUtils.isEmpty(pickLocationReq != null ? pickLocationReq.subTitle : null)) {
                    str = "Tier 3 Address";
                } else {
                    str = pickLocationReq != null ? pickLocationReq.subTitle : null;
                }
                if (str != null && (iVar2 = this.f27671c) != null) {
                    ((TextView) iVar2.f728f).setText(C0.G.i(str).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, this)).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).append(String.valueOf(pickLocationReq != null ? pickLocationReq.address : null)).create());
                }
                Bc.i iVar3 = this.f27671c;
                if (iVar3 != null) {
                    p220oa.h.s((TextView) iVar3.f728f, true);
                }
            }
            if (!TextUtils.isEmpty(pickLocationReq != null ? pickLocationReq.title : null) && (iVar = this.f27671c) != null) {
                ((PpTitleBar) iVar.f725c).setTitle(pickLocationReq != null ? pickLocationReq.title : null);
            }
            if (!TextUtils.isEmpty(pickLocationReq != null ? pickLocationReq.message : null)) {
                Bc.i iVar4 = this.f27671c;
                if (iVar4 != null) {
                    p220oa.h.s((CardView) iVar4.f730i, true);
                }
                Bc.i iVar5 = this.f27671c;
                if (iVar5 != null) {
                    ((TextView) iVar5.f729g).setText(pickLocationReq != null ? pickLocationReq.message : null);
                }
                Bc.i iVar6 = this.f27671c;
                if (iVar6 != null) {
                    ((IconicsImageView) iVar6.f727e).setOnClickListener(new Y(this, 0));
                }
                ((Handler) this.f27672d.getValue()).postDelayed(new com.transsnet.adsdk.widgets.banner.bannerview.b(this, 5), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
            }
            this.f27669a = pickLocationReq != null ? pickLocationReq.getLocation() : null;
        }
        if (this.f27669a == null) {
            this.f27669a = new LatLng(6.524d, 3.379d);
        }
        Fragment fragmentD = getSupportFragmentManager().D(L9.a.map);
        SupportMapFragment supportMapFragment = fragmentD instanceof SupportMapFragment ? (SupportMapFragment) fragmentD : null;
        if (supportMapFragment != null) {
            supportMapFragment.getMapAsync(this);
        }
    }
}
