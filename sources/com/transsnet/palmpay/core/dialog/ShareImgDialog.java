package com.transsnet.palmpay.core.dialog;

import Pa.i0;
import Pa.r0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.ShareAppInfo;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import p052da.X;
import p141j9.C1794b;
import p173ld.o;

/* JADX INFO: loaded from: classes3.dex */
public class ShareImgDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private RecyclerView mAppsRcv;
    private X mShareAppAdapter;
    private String mShareText;
    private Uri mShareUrl;
    private TextView mTvTitle;

    public ShareImgDialog(Context context) {
        super(context);
        this.mShareText = "";
    }

    private boolean isActivityValid(Context context) {
        if (context instanceof Activity) {
            return i0.W((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            return isActivityValid(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view, ShareAppInfo shareAppInfo, RecyclerView.ViewHolder viewHolder) {
        if (this.mShareUrl == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND", (Uri) null);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setType("*/*");
        ActivityInfo activityInfo = shareAppInfo.resolveInfo.activityInfo;
        intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
        intent.putExtra("android.intent.extra.STREAM", this.mShareUrl);
        intent.putExtra("android.intent.extra.TEXT", this.mShareText);
        ActivityUtils.startActivity(intent);
        dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (isActivityValid(getContext())) {
            super.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_share_2);
        Window window = getWindow();
        showAtBottom(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        this.mTvTitle = (TextView) findViewById(p025ba.e.tvTitle);
        findViewById(p025ba.e.ivClose).setOnClickListener(new o(this, 5));
        RecyclerView recyclerView = (RecyclerView) findViewById(p025ba.e.cds_app_rcv);
        this.mAppsRcv = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 4));
        X x3 = new X(this.mContext);
        this.mShareAppAdapter = x3;
        x3.f4985b = r0.F0(this.mContext);
        this.mAppsRcv.setAdapter(this.mShareAppAdapter);
        this.mShareAppAdapter.f4986c = new C1794b(this, 14);
        this.mTvTitle.setText(this.mShareText);
    }

    public void setShareText(String shareText) {
        if (shareText == null) {
            shareText = "";
        }
        this.mShareText = shareText;
    }

    public void setShareUrl(Uri shareUrl) {
        this.mShareUrl = shareUrl;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        if (isActivityValid(getContext())) {
            super.show();
        }
    }
}
